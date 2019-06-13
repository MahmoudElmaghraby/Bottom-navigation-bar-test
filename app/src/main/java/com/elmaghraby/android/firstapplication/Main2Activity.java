package com.elmaghraby.android.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button   signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    email=findViewById(R.id.usernameet2);
    password=findViewById(R.id.passwordet2);
    signin=findViewById(R.id.button2);

    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent newintent = getIntent();
            String s1 = newintent.getStringExtra("emailkey");
            String s2 = newintent.getStringExtra("passkey");
            String login = email.getText().toString();
            String password2 = password.getText().toString();

            if(s1.equals(login)&&s2.equals(password2))
            {

                Toast.makeText(Main2Activity.this, "Succseful", Toast.LENGTH_SHORT).show();

            }
            else {

                Toast.makeText(Main2Activity.this, "something wrong", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
}
