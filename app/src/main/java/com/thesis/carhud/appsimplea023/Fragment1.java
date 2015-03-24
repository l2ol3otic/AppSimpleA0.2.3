package com.thesis.carhud.appsimplea023;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by l2ol3otic2 on 3/25/2015.
 */
public class Fragment1 extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater ,ViewGroup Container ,Bundle saveIntanceState){
        rootview = inflater inflate();
        return super.onCreateView(inflater, Container, saveIntanceState);
    }
}
