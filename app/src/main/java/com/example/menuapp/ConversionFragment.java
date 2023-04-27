package com.example.menuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConversionFragment extends Fragment {

    public ConversionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_conversion, container, false);
        Button btn = (Button)rootView.findViewById(R.id.button1);
        EditText input = (EditText)rootView.findViewById(R.id.input);
        TextView res = (TextView)rootView.findViewById(R.id.res);
        Log.d("hofr", "oncreate");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hofr", "button clicked");
                input.setText("0");
                float inputValue = Float.parseFloat(input.getText().toString());
                float result = inputValue *10.5F;
                res.setText(String.valueOf(result)+ "DH");
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
}