package com.example.shixun2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.shixun2.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by wapchief on 2017/7/18.
 */

public class QZoneFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_qzone, null);
        return view;

    }
}
