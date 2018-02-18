package com.youtube.com.team_up;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

public class Toss extends AppCompatActivity {
 TextView t1;
    GifImageView g1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.select, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ImageButton be=(ImageButton)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.textView10);
       final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.me);
        g1=(GifImageView)findViewById(R.id.gif);
        be.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                g1.setVisibility(View.VISIBLE);

                new CountDownTimer(3000, 1000) {

                    @Override
                    public void onTick(long l) {
                        mediaPlayer.start();
                        t1.setText("");
                    }

                    @Override
                    public void onFinish() {
                        g1.setVisibility(View.GONE);
                        String hj = spinner.getSelectedItem().toString();
                        List<String> g = new ArrayList<String>();
                        g.add(0, "Shapla");
                        g.add(1, "Man");
                        Random r = new Random();
                        int x = r.nextInt(2);
                        if (hj.equals(g.get(x)))
                            t1.setText(hj+" have woooooooooon");
                        else
                            t1.setText(hj+" loooooooooossssssseeeed");



                    }
                }.start();

            }



        });

    }
}
