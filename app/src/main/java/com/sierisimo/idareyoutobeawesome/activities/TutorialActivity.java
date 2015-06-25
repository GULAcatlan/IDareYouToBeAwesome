package com.sierisimo.idareyoutobeawesome.activities;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;

import com.sierisimo.idareyoutobeawesome.R;
import com.sierisimo.idareyoutobeawesome.fragments.tutorial.WelcomeFragment;

/**
 * Created by Sier <sier@tr3sco.com> on 6/24/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class TutorialActivity extends Activity {
    //FIXME: If you add new Fragments to package com.sierisimo.idareyoutobeawesome.fragments.tutorial change this number
    static final int tutorialPages = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tutorial);

        initViews();
    }

    private void initViews() {
        SparseArray<Fragment> fragmentPages = new SparseArray<>(tutorialPages);
        fragmentPages.append(WelcomeFragment.PAGE, WelcomeFragment.newInstance());
    }
}