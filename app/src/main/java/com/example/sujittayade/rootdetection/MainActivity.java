package com.example.sujittayade.rootdetection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean isRoot=false;
        isRoot=RootUtil.isDeviceRooted();
        Toast.makeText(this, ""+isRoot, Toast.LENGTH_SHORT).show();
    }
}
