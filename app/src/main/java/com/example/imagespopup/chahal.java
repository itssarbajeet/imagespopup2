package com.example.imagespopup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class chahal extends AppCompatActivity {
    ImageView cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chachal);
        cross=findViewById(R.id.cross);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cross();
            }

            private void cross() {
                Intent intent=new Intent(chahal.this ,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}