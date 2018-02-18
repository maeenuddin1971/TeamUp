package com.youtube.com.team_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
   Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,MainActivity.class);
                startActivity(i);
            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(Main3Activity.this,Toss.class);
                startActivity(i);
            }


        });


    }
}
