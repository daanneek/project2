package com.androidhunger.opendagapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.androidhunger.opendagapp.R;

public class HomeFragment extends Fragment {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //sets title as "Home"and binds xml button id's to respective buttons, and sets their click.
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Home");

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hometest, container, false);

    }


}
