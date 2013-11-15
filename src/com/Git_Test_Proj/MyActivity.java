package com.Git_Test_Proj;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast.makeText(this, "Fuck off", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        Random random = new Random();
        int color1 = Color.argb(255, random.nextInt(255), random.nextInt(255), random.nextInt(255));
        this.getWindow().setTitleColor(color1);
        int color2 = Color.argb(255, random.nextInt(255), random.nextInt(255), random.nextInt(255));
        this.getWindow().getDecorView().setBackgroundColor(color2);
        super.onResume();
    }
}
