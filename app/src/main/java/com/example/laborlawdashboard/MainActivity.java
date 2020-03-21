package com.example.laborlawdashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView mrCardView,tmCardView,snCardView,allCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrCardView = findViewById(R.id.member_request_id);
        tmCardView = findViewById(R.id.totla_member_id);
        snCardView = findViewById(R.id.send_notification_id);
        allCardView = findViewById(R.id.about_labour_low);

        mrCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Member_Request.class);
                startActivity(intent);
            }
        });
        tmCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Total_Member.class);
                startActivity(intent);
            }
        });

        snCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming Soon...", Toast.LENGTH_SHORT).show();
            }
        });

        allCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "About Labour Law...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
