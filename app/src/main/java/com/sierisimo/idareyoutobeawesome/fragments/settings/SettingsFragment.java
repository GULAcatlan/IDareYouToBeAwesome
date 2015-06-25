package com.sierisimo.idareyoutobeawesome.fragments.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.sierisimo.idareyoutobeawesome.R;
import com.sierisimo.idareyoutobeawesome.activities.MainActivity;

/**
 * Created by Sier <sier@tr3sco.com> on 6/24/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class SettingsFragment extends PreferenceFragment implements MainActivity.OnMainBackPressed {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }

    @Override
    public void onBackPressed() {
        if(isAdded()){
            //DO stuff...
        }
    }
}