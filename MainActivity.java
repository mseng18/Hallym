package com.example.hallymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //버스 시간표 띄우는 함수
    public void schoolBus(View v){
        Intent intent3 = new Intent(getApplicationContext(), SchoolBus.class);
        //intent 객체 선언
        startActivity(intent3);
        //새 창 띄우도록
    }

    //행정실 화면 띄우는 함수
    public void admininfo(View v){
        Intent intent4 = new Intent(getApplicationContext(), AdminInfo.class);
        //intent 객체 선언
        startActivity(intent4);
        //새 창 띄우도록
    }

    public void buildinginfo(View v){
        Intent intent_build = new Intent(getApplicationContext(), Building.class);
        startActivity(intent_build);
    }


    public void mylocation(View v){
        Intent intent_loc = new Intent(getApplicationContext(), MyAPI.class);
        startActivity(intent_loc);
    }



}



