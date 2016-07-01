package com.manikandansethuraj.fragmentcomm;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements FragmentOne.onSendData,FragmentTwo.getData {

    LinearLayout linearLayout;
    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.linear_layout);
        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_one,fragmentOne);
        fragmentTransaction.add(R.id.fragment_two,fragmentTwo);
        fragmentTransaction.commit();
    }

    @Override
    public void sendData(String data) {

        String datareturn = data;
        fragmentTwo.gettingData.getTheData(datareturn);

    }

    @Override
    public void getTheData(String dataString) {

         fragmentTwo.textView.setText(dataString);

    }
}
