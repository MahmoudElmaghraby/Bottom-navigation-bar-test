package com.elmaghraby.android.firstapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class contactFragment extends Fragment {


    Button ntl;
    Button ch;
    EditText studyET;
    ImageView mapImage;
    Button submitbtn;
    TextView newText ;
    RadioGroup radioGroup ;
    public contactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View myView = inflater.inflate(R.layout.fragment_contact, container, false) ;
        submitbtn=myView.findViewById(R.id.submitbtn);
        ntl=myView.findViewById(R.id.NTLbtn);
        ch=myView.findViewById(R.id.CHbtn);
        studyET = myView.findViewById(R.id.learnET);
        mapImage = myView.findViewById(R.id.map);
        newText = myView.findViewById(R.id.new_text);
        radioGroup = myView.findViewById(R.id.radio_group);


        ntl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studyET.setVisibility(View.VISIBLE);
                mapImage.setVisibility(View.GONE);
                submitbtn.setVisibility(View.VISIBLE);
                newText.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.VISIBLE);
            }
        });

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapImage.setVisibility(View.VISIBLE);
                studyET.setVisibility(View.GONE);
                submitbtn.setVisibility(View.GONE);
                newText.setVisibility(View.GONE);
                radioGroup.setVisibility(View.GONE);
            }
        });

        return myView;
    }


}
