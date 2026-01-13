package lk.codehive.ravishka.activity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.codehive.ravishka.activity.R;
import lk.codehive.ravishka.activity.log.LogWriter;

public class HomeActivity extends AppCompatActivity {

    private Button homeBtn;
    public HomeActivity(){
        super(R.layout.activity_home);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeBtn = findViewById(R.id.homeBtn);
        LogWriter.writeInfoLog(this,"onCreate() - 01");

    }

    private void printLogStatement(){
//        System.out.println("INFO: My name is Ravishka");
        LogWriter.writeInfoLog(this,"My name is Ravishka");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogWriter.writeInfoLog(this,"onStart() - 02");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogWriter.writeInfoLog(this,"onResume() - 03");
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printLogStatement();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogWriter.writeInfoLog(this,"onPause() - 04");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogWriter.writeInfoLog(this,"onStop() - 05");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogWriter.writeInfoLog(this,"onDestroy() - 06");
    }
}