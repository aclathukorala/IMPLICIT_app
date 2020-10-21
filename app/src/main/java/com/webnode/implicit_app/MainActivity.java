package com.webnode.implicit_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnOne);

        Intent intent = new Intent(Intent.ACTION_SEND);
        final Intent chooser;
        intent.setData(Uri.parse("mailto"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"a.k.chamantha@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "This is our test subject");
        intent.putExtra(Intent.EXTRA_TEXT, "This is our test email body");
        intent.setType("message/rfc822");
        chooser = intent.createChooser(intent, "send email test app");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(chooser);
            }
        });
    }}




