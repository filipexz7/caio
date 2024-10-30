package com.example.telalogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public class LoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

                Button btnLogin = findViewById(R.id.btnLogin);
                Button btnRegister = findViewById(R.id.btnRegister);

                btnLogin.setOnClickListener(v ->{


            });

btnRegister.setOnClickListener( view ->

        startActivities(new Intent(this,RegisterActivity.class));

        });
    }
}

