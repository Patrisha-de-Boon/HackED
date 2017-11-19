package com.example.me.hacledbeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class d6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d6);

        TextView text = (TextView) findViewById(R.id.d6Text);

        TextView randomNum = (TextView) findViewById(R.id.d6Value);

        randomNum.setText(String.format("%d", (int) (Math.random() * 6) + 1));


        Button ReRoll = (Button) findViewById(R.id.ReRollButton);


        ReRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollAgain();
            }
        });

    }

    public void rollAgain(){
        TextView randomNum = (TextView) findViewById(R.id.d6Value);

        randomNum.setText(String.format("%d", (int) (Math.random() * 6) + 1));
    }
}