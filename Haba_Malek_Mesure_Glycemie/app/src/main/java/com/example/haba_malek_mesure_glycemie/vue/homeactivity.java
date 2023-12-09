package com.example.haba_malek_mesure_glycemie.vue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.haba_malek_mesure_glycemie.MainActivity;
import com.example.haba_malek_mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {

    private Button btnConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnConsultation = (Button) findViewById(R.id.btnConsultation);
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}