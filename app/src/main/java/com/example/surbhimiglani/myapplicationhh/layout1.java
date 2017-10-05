package com.example.surbhimiglani.myapplicationhh;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;

public class layout1 extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Context context) {

        try{
            activityCommander=(TopSectionListener)context;
        }catch(ClassCastException e){
            throw new ClassCastException(activityCommander.toString());
        }
        super.onAttach(context);}


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout1,container,false);

        topTextInput=(EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput=(EditText) view.findViewById(R.id.bottomTextInput);
        final Button button=(Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {

                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }
public void buttonClicked(View view){
      activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
      }
}