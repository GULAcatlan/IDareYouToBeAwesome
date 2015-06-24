package com.sierisimo.idareyoutobeawesome.activities;

import android.app.Activity;
import android.os.Bundle;

import com.sierisimo.idareyoutobeawesome.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        doStuffBeforeStart();
    }

    /**
     * Literally, do every kind of needed stuff like check the sqlite or
     * check the conectivity or something.
     */
    private void doStuffBeforeStart(){
        //TODO: Do stuff, like contacting server for new
    }
}