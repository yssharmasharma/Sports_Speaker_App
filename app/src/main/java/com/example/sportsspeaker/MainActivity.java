package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgBoxing,imgTaekwondo,imgKarate,imgJudo,imgKickboxing,imgAikido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAikido=(ImageView)findViewById(R.id.imgAikido);
        imgBoxing=(ImageView)findViewById(R.id.imgBoxing);
        imgJudo=(ImageView)findViewById(R.id.imgJudo);
        imgKarate=(ImageView)findViewById(R.id.imgKarate);
        imgKickboxing=(ImageView)findViewById(R.id.imgKickboxing);
        imgTaekwondo=(ImageView)findViewById(R.id.imgTaekwondo);

        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgBoxing.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgKickboxing.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View ButtonView) {
        switch (ButtonView.getId()){

            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgAikido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgKickboxing:
                playSportName(imgKickboxing.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
        }

    }

    private void playSportName(String sportname){
        MediaPlayer sportPlayer=MediaPlayer.create(this,getResources().getIdentifier(sportname,"raw",getPackageName()));
        sportPlayer.start();


    }
}
