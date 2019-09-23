package app.auaf.todolist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import app.auaf.todolist.R;
import app.auaf.todolist.utils.SessionManager;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    SessionManager sessionManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        sessionManager=new SessionManager(SplashScreen.this);

        if (!sessionManager.isFirstTimeLaunch()){

            Intent intent=new Intent(SplashScreen.this, AppIntro.class);
            startActivity(intent);
            finish();
            sessionManager.setFirstTimeLaunch(true);

        }else {
            goToMainScreen();
        }


    }

    private void goToMainScreen() {
        handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }


}
