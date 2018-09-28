package com.example.soleszczuk.mapp.gui;


import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.example.soleszczuk.mapp.conteiners.tereminalFragment;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.soleszczuk.mapp.R;

public class fragmentHolder extends AppCompatActivity
        implements tereminalFragment.OnFragmentInteractionListener{

    FrameLayout frame;
    Button terminalBTN;
    tereminalFragment fragmentTerminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_holder);

        frame = (FrameLayout)findViewById(R.id.frame) ;
        terminalBTN = (Button)findViewById(R.id.terminalBTN);

        fragmentTerminal = new tereminalFragment();

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTerminal.buttonPresed();
            }
        };

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,fragmentTerminal);
        ft.commit();




            }

    @Override
    public void onFragmentInteraction(Uri uri){

    };
}
