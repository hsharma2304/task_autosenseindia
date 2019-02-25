package com.example.autosenseindia;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText urName, password;
    Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        urName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        clk = findViewById(R.id.singingIn);
    }

    public void loginToMainActivity(View view)
    {
        String stName = urName.getText().toString();
        String stpasword = password.getText().toString();

        if (stName.equals("username")&& stpasword.equals("password")){
            Intent in = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(in);
        }
        else if (stName.equals(" ")|| stpasword.equals(" "))
        {
            Toast.makeText(getBaseContext(), "Enter User name and Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getBaseContext(), "Wrong user name and Password entered", Toast.LENGTH_SHORT).show();
        }
    }
}