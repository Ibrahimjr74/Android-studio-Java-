package p;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.projectcalculator.R;

public class Wifi_Toogle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_toogle);

        final TextView Response = (TextView) this.findViewById(R.id.message);

        final ToggleButton ONOFF = (ToggleButton) findViewById(R.id.playstop_btn);
        ONOFF.setChecked(true);


        ONOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ONOFF.isChecked()) {
                    ONOFF.setBackgroundDrawable(getResources().getDrawable(R.
                            drawable.));
                    Response.setText("Stop button is toggled to Play button");
                } else {
                    ONOFF.setBackgroundDrawable(getResources().getDrawable(R.
                            drawable.stop));
                    Response.setText("Play button is toggled to Stop button");
                }
            }
        });
    }
}