package com.example.projectcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Signin extends AppCompatActivity implements View.OnClickListener {

    private EditText Email;
    private EditText Password;
    private TextView Response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Email = findViewById(R.id.User_Email);
        Password = findViewById(R.id.User_pass);
        Response = findViewById(R.id.User_response);

        // Set click listener for the button
        Button b = findViewById(R.id.LoginBtn);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String usr = Email.getText().toString().trim();  // Use trim() to remove leading/trailing spaces
        String pass = Password.getText().toString().trim();

        if (usr.isEmpty() || pass.isEmpty()) {
            String str = "The Email and password are empty. Please try again!";
            Response.setText(str);
        } else {
            if (usr.equals("guest") && pass.equals("guest")) {
                Response.setText("Welcome " + usr + "!"); // Use lowercase "response" here (consistency)
            } else {
                Response.setText("The Email and password entered are incorrect."); // Use lowercase "response" here (consistency)
            }
        }
    }
}


