package com.sierisimo.idareyoutobeawesome.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.sierisimo.idareyoutobeawesome.R;
import com.sierisimo.idareyoutobeawesome.fragments.tutorial.ExplanationFragment;
import com.sierisimo.idareyoutobeawesome.fragments.tutorial.WelcomeFragment;

/**
 * Created by Sier <sier@tr3sco.com> on 6/24/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class TutorialActivity extends FragmentActivity implements
        ViewPager.OnPageChangeListener,
        View.OnClickListener {
    //FIXME: If you add new Fragments to package com.sierisimo.idareyoutobeawesome.fragments.tutorial change this number
    static final int tutorialPages = 2;

    private TutorialAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tutorial);

        initViews();
    }

    private void initViews() {
        pagerAdapter = new TutorialAdapter(getSupportFragmentManager(), new Fragment[]{
                WelcomeFragment.newInstance(),
                ExplanationFragment.newInstance()
        }, getResources().getStringArray(R.array.tutorialTitles));

        ((ViewPager) findViewById(R.id.pagerTutorial)).setAdapter(pagerAdapter);
        ((ViewPager) findViewById(R.id.pagerTutorial)).addOnPageChangeListener(this);

        findViewById(R.id.btnTutorialSkip).setOnClickListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (pagerAdapter != null) {
            Drawable background = pagerAdapter.fragmentPages[position].getView().getBackground();
            if (background instanceof ColorDrawable) {
                findViewById(R.id.pagerTitles).setBackgroundColor(((ColorDrawable) background).getColor());
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTutorialSkip:
                startActivity(new Intent(this, MainActivity.class));

                finish();
        }
    }

    private class TutorialAdapter extends FragmentPagerAdapter {
        public Fragment[] fragmentPages;

        public String[] pageTitles;

        public TutorialAdapter(FragmentManager fm) {
            super(fm);
        }

        public TutorialAdapter(FragmentManager fm, Fragment[] pages, String[] titles) {
            this(fm);
            this.fragmentPages = pages;
            this.pageTitles = titles;
        }

        @Override
        public Fragment getItem(int position) {
            getPageTitle(position);
            return fragmentPages[position];
        }

        @Override
        public int getCount() {
            return fragmentPages.length;
        }


    }
}