package com.example.toofan.syllabus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class newsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsactivity);
        WebView webview = new WebView(this);
        setContentView(webview);
        Uri uri = Uri.parse("http://timesofindia.indiatimes.com/tech/tech-news");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);



    }

    @Override
    public void onBackPressed() {

        Intent i=new Intent(this,MainActivity.class);
        super.onBackPressed();
    }
}
