package com.example.jsbridge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private Button refreshBtn;

    Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        refreshBtn = findViewById(R.id.refreshBtn);

        webView.loadUrl("http://192.168.3.36:8080/?timeStamp=" + date.getTime());

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("http://192.168.3.36:8080/?timeStamp=" + date.getTime());
            }
        });
    }
}
