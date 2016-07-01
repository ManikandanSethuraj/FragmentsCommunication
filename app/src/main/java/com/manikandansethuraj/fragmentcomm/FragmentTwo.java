package com.manikandansethuraj.fragmentcomm;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-06-30.
 */
public class FragmentTwo extends Fragment {


    getData gettingData;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two_layout,container,false);
        textView = (TextView)view.findViewById(R.id.addValue);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        gettingData = (getData)activity;

    }

    public interface getData{
        public void getTheData(String dataString);


    }
}
