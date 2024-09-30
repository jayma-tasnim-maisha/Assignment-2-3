package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etRegisterName = findViewById(R.id.et_register_name);
        EditText etRegisterEmail = findViewById(R.id.et_register_email);
        EditText etRegisterPassword = findViewById(R.id.et_register_password);
        EditText etConfirmPassword = findViewById(R.id.et_confirm_password);
        EditText etRegisterPhone = findViewById(R.id.et_register_phone);

        Button btnSignupLogin = findViewById(R.id.btn_sign_up_login);
        Button btnSignupRegister = findViewById(R.id.btn_sign_up_register);




    }
}