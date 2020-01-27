package com.example.a95_processing_implicit_intentions_in_your_app_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final int CODEFORSECONDACTIVITY = 1;
    EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPhone = findViewById(R.id.editPhone);
    }

    public void onActivityInformationAboutAuthor(View view) {
        Intent intentAboutAuthor = new Intent(this,AboutAuthor.class);
        startActivityForResult(intentAboutAuthor,CODEFORSECONDACTIVITY);
    }

    public void onDialNumber(View view) {
        Intent intentDialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + editPhone.getText().toString()));
        startActivity(intentDialNumber);
    }
}
