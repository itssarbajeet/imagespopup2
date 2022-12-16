package com.example.imagespopup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kumar extends AppCompatActivity {
    ImageView cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumar);
        cross=findViewById(R.id.cross);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cross();
            }

            private void cross() {
                Intent intent=new Intent(kumar.this ,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}