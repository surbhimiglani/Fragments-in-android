package com.example.surbhimiglani.myapplicationhh;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;


public class picture1 extends Fragment{

    private static TextView topTextInput2;
    private static TextView bottomTextInput2;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.picture,container,false);
         topTextInput2=(TextView) view.findViewById(R.id.topTextInput2);
        bottomTextInput2=(TextView) view.findViewById(R.id.bottomTextInput2);

        return view;
    }
    public void setMemeText(String top,String bottom){
        topTextInput2.setText(top);
        bottomTextInput2.setText(bottom);
    }
}
