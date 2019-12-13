package com.example.hallymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Building extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b5;
    Button b7;
    Button b8;
    Button b9;
    Button b13;
    Button b18;
    Button b24;
    Button b31;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);

    }

    public void button1(View view){

        Button b1 = (Button) findViewById(R.id.num7);

        CharSequence info1[] = new CharSequence[]{"박물관"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("1 공학관");
        builder.setItems(info1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button2(View view){

        Button b2 = (Button) findViewById(R.id.num2);

        CharSequence info2[] = new CharSequence[]{"TIAMO 커피", "국민은행 atm", "우리은행 atm"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("2 대학본부-인문1관");
        builder.setItems(info2, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button5(View view){

        Button b5 = (Button) findViewById(R.id.num5);

        CharSequence info5[] = new CharSequence[]{"교직원식당"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("5 대학본부별관");
        builder.setItems(info5, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }



    public void button7(View view){

        Button b7 = (Button) findViewById(R.id.num7);

        CharSequence info7[] = new CharSequence[]{"GS편의점"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("7 자연과학관");
        builder.setItems(info7, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button8(View view){

        Button b8 = (Button) findViewById(R.id.num7);

        CharSequence info8[] = new CharSequence[]{"텀브커피"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("8 생명과학관");
        builder.setItems(info8, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button9(View view){

        Button b9 = (Button) findViewById(R.id.num9);

        CharSequence info9[] = new CharSequence[]{"Bread & co", "GS 편의점", "보건실", "문구점/서점",
                "우리은행 atm" };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("9  CAMPUS LIFE CENTER");
        builder.setItems(info9, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button18(View view){

        Button b18 = (Button) findViewById(R.id.num9);

        CharSequence info18[] = new CharSequence[]{"텀브커피", "헬스장" ,"수영장"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("18  한림레크레이션센터");
        builder.setItems(info18, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }


    public void button31(View view){

        Button b31 = (Button) findViewById(R.id.num31);

        CharSequence info31[] = new CharSequence[]{"GS 편의점"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("31  학생생활관 8관");
        builder.setItems(info31, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button24(View view){

        Button b24 = (Button) findViewById(R.id.num24);

        CharSequence info24[] = new CharSequence[]{"우리은행 ATM"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("24  학생생활관 1관");
        builder.setItems(info24, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }

    public void button13(View view){

        Button b13 = (Button) findViewById(R.id.num24);

        CharSequence info13[] = new CharSequence[]{"TIAMO 커피"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("13  사회.경영2관");
        builder.setItems(info13, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
            //dialog.dismiss();
        });
        builder.show();
    }
}
