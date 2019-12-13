package com.example.hallymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.HashMap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class AdminInfo extends AppCompatActivity {

    private final String dbName = "webnautes";
    private final String tableName = "person";

    private String names[];
    {
        names = new String[]{"소프트웨어융합대학", "인문대학", "사회과학대", "경영대학",
                "경영학과", "금융재무학과", "자연과학대학", "의과대학",
                "간호대학", "글로벌융합대학", "미디어스쿨", "데이터과학융합스쿨",
                "나노융합스쿨", "미래융합스쿨",
                "통학버스사무실", "학생지원팀", "SW중심대학사업단", "창업보육센터",
                "현장실습지원센터", "대표번호" , "박물관 사무실", "일송자유교양대학 교학팀",
        "행정서비스팀", "일송자유교양대학", "한림봉사센터", "국제팀","학생생활상담센터",
        "통합스쿨 교학팀","LINC+ 사업단", "대학일자리센터","역량교육혁신원","일본학연구소",
        "국제교육부" };
    }

    private final String phones[];
    {
        phones = new String[]{"033-248-2304~4", "033-248-1500", "033-248-1700", "033-248-1800",
                "033-248-1830", "033-248-1850", "033-248-2000~1", "033-248-2501",
                "033-248-2701~1", "033-248-2482", "033-248-3556~8", "033-248-1000",
                "033-248-3553", "033-248-1000",
                "033 248 3963", "033 248 1064", "033 248 3342", "033 248 3055",
                "033 248 1084~1087", "033-248-1000", "033-248-2851,2850", "033-248-2759",
        "033-248-1106", "033-248-2752", "033-248-1090", "033-248-1342~3", "033-248-3030",
        "033-248-3551~2", "033-248-3299", "033-248-1085", "033-248-3041","033-3215~7",
        "033-248-2972"};
    }


    ArrayList<HashMap<String, String>> personList;
    ListView list;
    private static final String TAG_NAME = "name";
    private static final String TAG_PHONE ="phone";

    SQLiteDatabase sampleDB = null;
    ListAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_info);

        list = (ListView) findViewById(R.id.listView);
        personList = new ArrayList<HashMap<String,String>>();


        try {

            sampleDB = this.openOrCreateDatabase(dbName, MODE_PRIVATE, null);

            //테이블이 존재하지 않으면 새로 생성합니다.
            sampleDB.execSQL("CREATE TABLE IF NOT EXISTS " + tableName
                    + " (name VARCHAR(100), phone VARCHAR(100) );");

            //테이블이 존재하는 경우 기존 데이터를 지우기 위해서 사용합니다.
            sampleDB.execSQL("DELETE FROM " + tableName  );

            //새로운 데이터를 테이블에 집어넣습니다..
            for (int i=0; i<names.length; i++ ) {
                sampleDB.execSQL("INSERT INTO " + tableName
                        + " (name, phone)  Values ('" + names[i] + "', '" + phones[i]+"');");
            }

            sampleDB.close();

        } catch (SQLiteException se) {
            Toast.makeText(getApplicationContext(),  se.getMessage(), Toast.LENGTH_LONG).show();
            Log.e("", se.getMessage());
        }
        showList();
    }


    protected void showList(){

        try {
            SQLiteDatabase ReadDB = this.openOrCreateDatabase(dbName, MODE_PRIVATE, null);

            //SELECT문을 사용하여 테이블에 있는 데이터를 가져옵니다..
            Cursor c = ReadDB.rawQuery("SELECT * FROM " + tableName, null);

            if (c != null) {

                if (c.moveToFirst()) {
                    do {

                        //테이블에서 두개의 컬럼값을 가져와서
                        String Name = c.getString(c.getColumnIndex("name"));
                        String Phone = c.getString(c.getColumnIndex("phone"));

                        //HashMap에 넣습니다.
                        HashMap<String,String> persons = new HashMap<String,String>();

                        persons.put(TAG_NAME,Name);
                        persons.put(TAG_PHONE,Phone);

                        //ArrayList에 추가합니다..
                        personList.add(persons);

                    } while (c.moveToNext());
                }
            }

            ReadDB.close();


            //새로운 apapter를 생성하여 데이터를 넣은 후..
            adapter = new SimpleAdapter(
                    this, personList, R.layout.list_item,
                    new String[]{TAG_NAME,TAG_PHONE},
                    new int[]{ R.id.name, R.id.phone}
            );


            //화면에 보여주기 위해 Listview에 연결합니다.
            list.setAdapter(adapter);


        } catch (SQLiteException se) {
            Toast.makeText(getApplicationContext(),  se.getMessage(), Toast.LENGTH_LONG).show();
            Log.e("",  se.getMessage());
        }

    }


}
