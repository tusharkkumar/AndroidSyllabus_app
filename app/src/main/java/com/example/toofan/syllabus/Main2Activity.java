package com.example.toofan.syllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.widget.ImageView;

import static android.view.animation.AnimationUtils.loadAnimation;

public class Main2Activity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView image=(ImageView)findViewById(R.id.imagedown);
        Animation animation = loadAnimation(getApplicationContext(), R.anim.translatedown);
        image.startAnimation(animation);





    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(this,MainActivity.class);
        super.onBackPressed();
    }
}
