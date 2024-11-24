package com.org.to_do;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.org.to_do.databinding.ActivitySignUpBinding;

import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity {

    private TextView hyperlinkTextView;
    private EditText dobEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        hyperlinkTextView=findViewById(R.id.hyperlinkLogin);

        EditText dobEditText = findViewById(R.id.dob);

        dobEditText.setOnClickListener(v -> {
            // Get the current date
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            // Show the DatePickerDialog
            DatePickerDialog datePickerDialog = new DatePickerDialog(SignUpActivity.this,
                    (view, selectedYear, selectedMonth, selectedDay) -> {
                        // Set the selected date to EditText
                        String dob = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                        dobEditText.setText(dob);
                    }, year, month, day);
            datePickerDialog.show();
        });

        hyperlinkTextView.setOnClickListener(view -> {
            Intent intent=new Intent(SignUpActivity.this,MainActivity.class);
            startActivity(intent);
        });


    }


}