package lk.codehive.ravishka.activity.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.codehive.ravishka.activity.R;
import lk.codehive.ravishka.activity.log.LogWriter;

public class HomeActivity extends AppCompatActivity {

    public HomeActivity(){
        super(R.layout.activity_home);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printLogStatement();
            }
        });
    }

    private void printLogStatement(){
//        System.out.println("INFO: My name is Ravishka");
        LogWriter.writeInfoLog(this,"My name is Ravishka");
    }
}