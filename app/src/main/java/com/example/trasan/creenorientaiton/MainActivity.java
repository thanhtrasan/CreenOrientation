package com.example.trasan.creenorientaiton;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override//bat su kien xoay man hinh
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Log.d("Orientation","Portrait");
        }
        else{
            if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            {
                Log.d("Orientation","Landscape");
            }
        }
    }
}
