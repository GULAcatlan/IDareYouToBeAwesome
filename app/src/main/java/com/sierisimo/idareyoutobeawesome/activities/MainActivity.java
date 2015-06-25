package com.sierisimo.idareyoutobeawesome.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.sierisimo.idareyoutobeawesome.R;
import com.sierisimo.idareyoutobeawesome.fragments.settings.SettingsFragment;

/**
 * Created by Sier <sier@tr3sco.com> on 6/24/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class MainActivity extends Activity implements
        View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        findViewById(R.id.btnMainSettings).setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMainSettings:
                if (getFragmentManager().findFragmentByTag("setting") == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.frameMainSettings, new SettingsFragment(), "setting")
                            .commit();
                } else {
                    getFragmentManager().beginTransaction()
                            .replace(R.id.frameMainSettings, getFragmentManager().findFragmentByTag("setting"), "setting")
                            .commit();
                }
                findViewById(R.id.frameMainSettings).setVisibility(View.VISIBLE);
        }
    }

    public interface OnMainBackPressed {
        void onBackPressed();
    }
}