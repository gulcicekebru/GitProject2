package com.example.gitproject2;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home_pagee#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home_pagee extends Fragment {
    public Button btn_all_meditation;
    public Button btn_all_focus;
    public Button btn_all_sleep;
    public Button btn_back;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home_pagee() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home_pagee.
     */
    // TODO: Rename and change types and number of parameters
    public static home_pagee newInstance(String param1, String param2) {
        home_pagee fragment = new home_pagee();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_pagee, container, false);
       //BUTONA TIKLANILINCA YENİ AKTİVİYE YONLENDİRME
         btn_all_meditation=view.findViewById(R.id.btn_exp_m);
         btn_all_meditation.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(home_pagee.this.getActivity(),Meditation.class);
                 startActivity(intent);
             }
         });
        btn_all_focus=view.findViewById(R.id.btn_exp_f);
        btn_all_focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_pagee.this.getActivity(),Focus.class);
                startActivity(intent);
            }
        });
        btn_all_sleep=view.findViewById(R.id.btn_exp_s);
        btn_all_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_pagee.this.getActivity(),Sleep.class);
                startActivity(intent);
            }
        });
        //GİRİS EKRANINA GERI DONMEK ICIN BACK BUTONU ILE YONLENDIRME
        btn_back=view.findViewById(R.id. btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home_pagee.this.getActivity(),Login_Focus.class);
                startActivity(intent);
            }
        });


        return view;
    }


}



