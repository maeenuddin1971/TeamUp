package com.youtube.com.team_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    public String bn,hj,gh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);


        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                bn=e1.getText().toString();
                hj=e2.getText().toString();
                gh=e3.getText().toString();

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("first", bn);
                i.putExtra("scnd", hj);
                i.putExtra("third", gh);
                startActivity(i);
            }


        });



    }
}
