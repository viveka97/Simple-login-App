package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private String userName= "user123";
    private String password = "pass123";
    private int attemptsLeft=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btn_login);
        Button btnCancel = findViewById(R.id.btn_cancel);
        final EditText edtUsername= findViewById(R.id.edt_user_name);
        final EditText edtPassword= findViewById(R.id.edt_password);
        final TextView txtResult = findViewById(R.id.txt_result);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enterUsername = edtUsername.getText().toString();
                String enterPassword = edtPassword.getText().toString();

                if (attemptsLeft>0) {
                    if (enterUsername.equals(userName) && enterPassword.equals(password)) {
                        txtResult.setText("Login Successful");
                    } else {
                        txtResult.setText("Login Error  Attempts Left : " + attemptsLeft);
                        attemptsLeft = attemptsLeft - 1;

                    }
                }
                else
                {
                    txtResult.setText("Please Try again Later");
                }
            }
        });

    }
}