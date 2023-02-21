package nsquare.practice.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import nsquare.practice.app.constants.Constants;

public class MainActivity extends AppCompatActivity {



    Button homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        Constants.APP_NAME="PracticeOnes";
        homeButton= findViewById(R.id.home_click_button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Welcome to "+Constants.APP_NAME,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,LoginPage.class);
                startActivity(i);
            }
        });
    }
}