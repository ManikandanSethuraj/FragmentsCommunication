package com.manikandansethuraj.fragmentcomm;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-06-30.
 */
public class FragmentOne extends Fragment {

    Button button;
    EditText editBox;
    onSendData onSendingData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout,container,false);
        button = (Button)view.findViewById(R.id.button_send);
        editBox = (EditText)view.findViewById(R.id.edit_box);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textvalue = editBox.getText().toString();
                onSendingData.sendData(textvalue);

            }
        });

        return view;

        // return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onSendingData = (onSendData)activity;

    }

    public interface onSendData{

       public void sendData(String data);

   }

}
