package com.youtube.com.team_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
   TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent i=getIntent();
        String b=i.getStringExtra("first");
        String b2=i.getStringExtra("scnd");
        String b3=i.getStringExtra("third");
        t1=(TextView)findViewById(R.id.textView6);
        t2=(TextView)findViewById(R.id.textView8);

        List<String> elephantList = Arrays.asList(b.split(","));
        List<String> elephantList2 = Arrays.asList(b2.split(","));
        List<String> elephantList3 = Arrays.asList(b3.split(","));

        Collections.shuffle(elephantList);
        Collections.shuffle(elephantList2);
        Collections.shuffle(elephantList3);


        List<String>m=new ArrayList<String>();
        List<String>m2=new ArrayList<String>();
        for(int e=0;e<elephantList.size();e++)
        {
            if(e%2==0)
            {
                m.add(elephantList.get(e));
            }
            else
                m2.add(elephantList.get(e));
        }

        for(int y=0;y<elephantList2.size();y++)
        {
            if(y%2==0)
                m.add(elephantList2.get(y));
            else
                m2.add(elephantList2.get(y));
        }
        for(int y=0;y<elephantList3.size();y++)
        {
            if(y%2==0)
                m.add(elephantList3.get(y));
            else
                m2.add(elephantList3.get(y));
        }
        t1.setText(m.toString());
        t2.setText(m2.toString());
    }
}
