package com.e.sharepreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUname;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etUname = findViewById(R.id.etUname);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                SignUp();

            }

        });
    }

            private void SignUp() {

                SharedPreferences sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();


                editor.putString("username",etUname.getText().toString());
                editor.putString("password",etPassword.getText().toString());
                editor.commit();


                Toast.makeText(this,"successfully registered", Toast.LENGTH_SHORT).show();
            }
        }

