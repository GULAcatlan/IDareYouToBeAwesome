package com.sierisimo.idareyoutobeawesome.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.sierisimo.idareyoutobeawesome.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        doStuffBeforeStart(getSharedPreferences(getString(R.string.gralPreferences), MODE_PRIVATE));
    }

    /**
     * Literally, do every kind of needed stuff like check the sqlite or
     * check the conectivity or something.
     */
    private void doStuffBeforeStart(final SharedPreferences gralPreferences) {
        //TODO: Do stuff, like contacting server for new set of

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (gralPreferences != null && gralPreferences.getBoolean("hasSeenTutorial", false)) {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, TutorialActivity.class));
                }
            }
        }, 2000);
    }
}