package com.example.a95_processing_implicit_intentions_in_your_app_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutAuthor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_author);
    }

    public void onWebSiteAuthor(View view) {
        Intent intentToWebSearch = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.vk.com/nikitaluga"));
        startActivity(intentToWebSearch);
    }
}
