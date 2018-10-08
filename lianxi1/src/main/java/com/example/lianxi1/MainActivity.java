package com.example.lianxi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView logo;
    private Myview wave_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        wave_view = findViewById(R.id.wave_view);

        final RelativeLayout.LayoutParams params= (RelativeLayout.LayoutParams) logo.getLayoutParams();
        wave_view.animation(new Myview.AnimationListener() {
            @Override
            public void animation(float y) {
                params.setMargins(0,0,0,(int)y);
                logo.setLayoutParams(params);
            }
        });
    }
}
