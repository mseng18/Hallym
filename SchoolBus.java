package com.example.hallymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SchoolBus extends AppCompatActivity {

    Button tonghak_btn;
    Button suttle_btn;
    Button bus02_btn;
    Button bus02s_btn;
    Button bus07s_btn;
    Button bus10_btn;
    Button bus12_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_bus);


        this.InitializeView();
        this.SetListener();

    }

    //(스쿨버스) 뒤로 가기 버튼
    public void onClick(View v){
        Intent intent_back = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent_back);
    }

    public void InitializeView(){

        tonghak_btn = (Button)findViewById(R.id.tonghak);
        suttle_btn = (Button)findViewById(R.id.suttle);
        bus02_btn = (Button)findViewById(R.id.bus02);
        bus02s_btn = (Button)findViewById(R.id.bus02s);
        bus07s_btn = (Button)findViewById(R.id.bus07s);
        bus10_btn = (Button)findViewById(R.id.bus10);
        bus12_btn = (Button)findViewById(R.id.bus12);

    }

    public void SetListener() {

        tonghak_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent_tonghak = new Intent(Intent.ACTION_VIEW , Uri.parse("http://www.hallym.ac.kr/hallym_univ/sub04/cP6/sCP3"));
                startActivity(intent_tonghak);

                finish();
            }

        });

        suttle_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view2) {
                Intent intent_suttle = new Intent(Intent.ACTION_VIEW , Uri.parse("http://www.hallym.ac.kr/hallym_univ/sub04/cP6/sCP4"));
                startActivity(intent_suttle);

                finish();
            }

        });

        bus02_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view3) {
                Intent intent02 = new Intent(Intent.ACTION_VIEW , Uri.parse("http://v4.map.naver.com/?busId=2800882"));
                startActivity(intent02);

                finish();
            }

        });
        bus02s_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view4) {
                Intent intent02s = new Intent(Intent.ACTION_VIEW , Uri.parse("http://v4.map.naver.com/?busId=2800883"));
                startActivity(intent02s);

                finish();
            }

        });

        bus07s_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view5) {
                Intent intent07s = new Intent(Intent.ACTION_VIEW , Uri.parse("http://v4.map.naver.com/?busId=2800892"));
                startActivity(intent07s);

                finish();
            }

        });

        bus10_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view6) {
                Intent intent10 = new Intent(Intent.ACTION_VIEW , Uri.parse("http://v4.map.naver.com/?busId=2800897"));
                startActivity(intent10);

                finish();
            }

        });

        bus12_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view7) {
                Intent intent12 = new Intent(Intent.ACTION_VIEW , Uri.parse("http://v4.map.naver.com/?busId=2800905"));
                startActivity(intent12);

                finish();
            }

        });

    }



}
