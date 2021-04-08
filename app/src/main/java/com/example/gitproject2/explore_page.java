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
 * Use the {@link explore_page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class explore_page extends Fragment {
    Button btn_exp_m;
    Button btn_exp_f;
    Button btn_exp_s;
    Button btn_back;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public explore_page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment explore_page.
     */
    // TODO: Rename and change types and number of parameters
    public static explore_page newInstance(String param1, String param2) {
        explore_page fragment = new explore_page();
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
        View view=inflater.inflate(R.layout.fragment_explore_page, container, false);
        //BUTONA TIKLANILINCA YENİ AKTİVİYE YONLENDİRME
        btn_exp_m=view.findViewById(R.id.btn_exp_m);
        btn_exp_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore_page.this.getActivity(),Explore_M.class);
                startActivity(intent);
            }
        });
        btn_exp_f=view.findViewById(R.id.btn_exp_f);
        btn_exp_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore_page.this.getActivity(),Explore_F.class);
                startActivity(intent);
            }
        });
        btn_exp_s=view.findViewById(R.id.btn_exp_s);
        btn_exp_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore_page.this.getActivity(),Explore_S.class);
                startActivity(intent);
            }
        });
        //GİRİS EKRANINA GERI DONMEK ICIN BACK BUTONU ILE YONLENDIRME
        btn_back=view.findViewById(R.id. btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(explore_page.this.getActivity(),Login_Focus.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
