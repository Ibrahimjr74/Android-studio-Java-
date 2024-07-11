package com.example.projectcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Imageswitcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageswitcher);

        final ImageView image = (ImageView) findViewById(R.id.image_toview);
        final ToggleButton changeButton =
                (ToggleButton)findViewById(R.id.change_image);
        changeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (changeButton.isChecked()) {
                    image.setImageResource(R.drawable.);
                }
                else {
                    image.setImageResource(R.drawable.);
                }
            }
        });
    }
}
