package com.example.projectcalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double number1, number2;
    double result;
    String temp = "";

    Button operatorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneButton = findViewById(R.id.b1);
        Button twoButton = findViewById(R.id.b2);
        Button threeButton = findViewById(R.id.b3);
        Button addButton = findViewById(R.id.buttonplus);
        Button fiveButton = findViewById(R.id.b5);
        Button sixButton = findViewById(R.id.b6);
        Button sevenButton = findViewById(R.id.b7);
        Button minusButton = findViewById(R.id.buttonminus);
        Button nineButton = findViewById(R.id.b9);
        Button tenButton = findViewById(R.id.b10);
        Button elevenButton = findViewById(R.id.b11);
        Button multButton = findViewById(R.id.buttontimes);
        Button equalButton = findViewById(R.id.buttonequal);
        Button zeroButton = findViewById(R.id.b14);
        Button divButton = findViewById(R.id.buttonDiv);
        TextView resultTextView = findViewById(R.id.resul);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "1");
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "3");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                number1 = Double.parseDouble(temp);
                txtView.setText(temp + "+");
                operatorButton = addButton;
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "4");
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "5");
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "6");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                number1 = Double.parseDouble(temp);
                operatorButton = minusButton;
                txtView.setText(temp + "-");
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "7");
            }
        });
        tenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "8");
            }
        });
        elevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "9");
            }
        });

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                number1 = Double.parseDouble(temp);
                operatorButton = multButton;
                txtView.setText(temp + "*");
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                String[] parts = temp.split("\\+|-|\\*|/");
                number2 = Double.parseDouble(parts[1]);

                if (operatorButton == addButton) {
                    result = number1 + number2;
                    resultTextView.setText(Double.toString((double) result));
                } else if (operatorButton == multButton) {
                    result = number1 * number2;
                    resultTextView.setText(Double.toString((double) result));
                } else if (operatorButton == divButton) {
                    result = number1 / number2;
                    resultTextView.setText(Double.toString((double) result));
                } else if (operatorButton == minusButton) {
                    result = number1 - number2;
                    resultTextView.setText(Double.toString((double) result));

                }
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                txtView.setText(temp + "0");
            }
        });


        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtView = findViewById(R.id.text_id);
                temp = txtView.getText().toString();
                number1 = Double.parseDouble(temp);
                operatorButton = divButton;
                txtView.setText(temp + "/");
            }
        });


        class ScreenOrientationAppActivity extends AppCompatActivity {
            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                if (getResources().getDisplayMetrics().widthPixels > getResources().getDisplayMetrics().
                        heightPixels) {
                    Toast.makeText(this, "Screen switched to Landscape mode", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Screen switched to Portrait mode", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
