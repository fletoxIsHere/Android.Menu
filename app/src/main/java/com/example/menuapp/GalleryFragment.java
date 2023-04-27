package com.example.menuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class GalleryFragment extends Fragment {

    private Button btn1;
    private Button btn2;
    private ImageView imgV;


    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    int jumper=1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        Button buttonClick = (Button)rootView.findViewById(R.id.button1);
        Button buttonClick2 = (Button)rootView.findViewById(R.id.button2);
        ImageView imageView1 = (ImageView)rootView.findViewById(R.id.imageView);

        int numbers[]= {1,2,3,4};



        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hofr", String.valueOf(jumper));

                if(1<=jumper && jumper<=3){
                    if(jumper == 1) jumper++;
                    jumper--;
                    String name = "img"+jumper;
                    int resID = getResources().getIdentifier(name , "drawable", getActivity().getPackageName());
                    imageView1.setImageResource(resID);

                }

            }


        });

        buttonClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("hofr", String.valueOf(jumper));

                if(1<=jumper && jumper<=3) {
                    if(jumper==3) jumper--;
                    jumper++;
                    String name = "img" + jumper;
                    int resID = getResources().getIdentifier(name, "drawable", getActivity().getPackageName());
                    imageView1.setImageResource(resID);
                }

            }


        });
        return rootView;
    }
}