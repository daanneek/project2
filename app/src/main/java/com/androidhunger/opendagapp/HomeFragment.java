package com.androidhunger.opendagapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //sets current fragment as fragment_home, title as "Home"and shows xml with upcoming open days and a support button
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Home");

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }


}
