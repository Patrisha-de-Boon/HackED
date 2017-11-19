package com.example.me.hacledbeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class d4RollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4_roll);
        TextView text = (TextView) findViewById(R.id.d4Text);

        TextView randomNum = (TextView) findViewById(R.id.d4Value);

        randomNum.setText(String.format("%d", (int) (Math.random() * 4) + 1));


        Button ReRoll = (Button) findViewById(R.id.ReRollButton);


        ReRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollAgain();
            }
        });

    }

    public void rollAgain(){
        TextView randomNum = (TextView) findViewById(R.id.d4Value);

        randomNum.setText(String.format("%d", (int) (Math.random() * 4) + 1));
    }
}
