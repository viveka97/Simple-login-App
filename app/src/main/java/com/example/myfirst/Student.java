package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Student extends AppCompatActivity {

    private EditText edtName,edtAge,edtSal,edtAdd,edtDis;
    private TextView txtName,txtAge,txtSal,txtAdd,txtDis,view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentdata);

        edtName= findViewById(R.id.edt_name);
        edtAge= findViewById(R.id.edt_age);
        edtSal= findViewById(R.id.edt_sal);
        edtAdd= findViewById(R.id.edt_address);
        edtDis= findViewById(R.id.edt_distance);
        txtName= findViewById(R.id.txt_name);
        txtAge= findViewById(R.id.txt_age);
        txtSal= findViewById(R.id.txt_sal);
        txtAdd= findViewById(R.id.txt_address);
        txtDis= findViewById(R.id.txt_distance);
        view = findViewById(R.id.view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student stu1 = new Student();
            }
        });

    }

}
