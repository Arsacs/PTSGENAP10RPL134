package com.example.ptsgenap10rpl134;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailtext;
    EditText passwordtext;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailtext = (EditText)findViewById(R.id.emailtext);
        passwordtext = (EditText)findViewById(R.id.passwordtext);
        loginbtn = (Button)findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailtext.getText().toString();
                String password = passwordtext.getText().toString();

                if (email.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("admin")){
                    Intent intent = new Intent(MainActivity.this, Dasboardmenu.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Gagal", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}