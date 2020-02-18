package com.example.test20;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.sohum);

        final MediaPlayer goodSound = MediaPlayer.create(this, R.raw.good);
        final MediaPlayer betSound = MediaPlayer.create(this, R.raw.bet);
        final MediaPlayer yessirSound = MediaPlayer.create(this, R.raw.yessir);


        Button btn = findViewById(R.id.goodButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodSound.start();
            }
        });
        Button btn2 = findViewById(R.id.betButton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                betSound.start();
            }
        });
        Button btn3 = findViewById(R.id.yessirButton);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yessirSound.start();
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        }

        public void openActivity2(){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
