package com.example.mauro.bottomnavigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tab1Fragment extends Fragment {

    TextView mtextview;
    EditText meditText;
    Button mbutton;

    public Tab1Fragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
        mtextview = (TextView) view.findViewById(R.id.textView2);
        meditText = (EditText) view.findViewById(R.id.editText);
        mbutton = (Button) view.findViewById(R.id.button2);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = meditText.getText().toString();
                mtextview.setText(text);
            }
        });


        return view;
    }
}
