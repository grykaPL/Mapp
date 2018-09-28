package com.example.soleszczuk.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.soleszczuk.mapp.gui.fragmentHolder;
import com.example.soleszczuk.mapp.gui.testActivity;

public class MainActivity extends AppCompatActivity {

    Intent fragmentHolderIntent,tesstActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentHolderIntent = new Intent(this, fragmentHolder.class);
        tesstActivityIntent = new Intent(this,testActivity.class);


        Button terminalBTN = (Button) findViewById(R.id.terminal);
        terminalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fragmentHolderIntent);
            }
        });



    }
}
