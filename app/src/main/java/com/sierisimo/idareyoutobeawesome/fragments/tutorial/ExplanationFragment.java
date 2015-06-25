package com.sierisimo.idareyoutobeawesome.fragments.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sierisimo.idareyoutobeawesome.R;

/**
 * Created by Sier <sier@tr3sco.com> on 6/25/15.
 * <p/>
 * Developed originally for: IDareYouToBeAwesome
 */
public class ExplanationFragment extends Fragment {
    public static final int PAGE = 1;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment WelcomeFragment.
     */
    public static ExplanationFragment newInstance() {
        ExplanationFragment fragment = new ExplanationFragment();

        Bundle args = new Bundle();

        fragment.setArguments(args);

        return fragment;
    }

    public ExplanationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initViews(inflater.inflate(R.layout.fragment_tutorial_explanation, container, false));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    private View initViews(View view) {

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
