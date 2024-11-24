package com.org.to_do;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String baseUrl = "http://localhost:8080/api/v1";




        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        textView=findViewById(R.id.hyperlinkRegister);

        textView.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,SignUpActivity.class);
            startActivity(intent);
        });

        login.setOnClickListener(view -> {
            // Get the entered values
            String emailValue = email.getText().toString().trim();
            String passwordValue = password.getText().toString().trim();

//            // For demonstration, display a Toast message
            if (!emailValue.isEmpty() && !passwordValue.isEmpty()) {
                Toast.makeText(MainActivity.this,
                        "Email: " + emailValue + "\nPassword: " + passwordValue,
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            }




        });

    }
}