package com.example.me.hacledbeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        Button d_20 = (Button) findViewById(R.id.d20);
        d_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD20();
            }
        });

        Button d_12 = (Button) findViewById(R.id.d12);
        d_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD12();
            }
        });

        Button d_10 = (Button) findViewById(R.id.d10);
        d_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD10();
            }
        });

        Button d_8 = (Button) findViewById(R.id.d8);
        d_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD8();
            }
        });

        Button d_6 = (Button) findViewById(R.id.d6);
        d_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD6();
            }
        });

        Button d_4 = (Button) findViewById(R.id.d4);
        d_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchD4();
            }
        });
    }

    private void launchD20() {
        startActivity(new Intent(this, d20Activity.class));
    }

    private void launchD12() {
        startActivity(new Intent(this, d12Activity.class));
    }

    private void launchD10() {
        startActivity(new Intent(this, d10Activity.class));
    }

    private void launchD8() {
        startActivity(new Intent(this, d8Activity.class));
    }

    private void launchD6() {
        startActivity(new Intent(this, d6Activity.class));
    }

    private void launchD4() {
        startActivity(new Intent(this, d4RollActivity.class));
    }
}
