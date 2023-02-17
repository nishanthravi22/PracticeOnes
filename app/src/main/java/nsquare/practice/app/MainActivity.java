package nsquare.practice.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import nsquare.practice.app.constants.Constants;

public class MainActivity extends AppCompatActivity {

    Button homeButton=findViewById(R.id.home_click_button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constants.APP_NAME="PracticeOnes";

    }

    @Override
    protected void onStart() {
        super.onStart();
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeButton.setText("Welcome to "+ Constants.APP_NAME);
            }
        });
    }
}