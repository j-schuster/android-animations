package com.johannschuster.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        //ImageView car2 = (ImageView) findViewById(R.id.cart2);
        ImageView car1 = (ImageView) findViewById(R.id.cart1);

        //car2.animate().alpha(0f).setDuration(2000);
        //car1.animate().alpha(1f).setDuration(2000);

        car1.animate().translationXBy(500f).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
