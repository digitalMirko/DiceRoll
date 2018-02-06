package com.digitalmirko.dicerolldemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clearBtn, rollBtn;
        clearBtn = (Button)findViewById(R.id.clearBtn);
        rollBtn = (Button)findViewById(R.id.rollBtn);

        final ImageView iv_leftDice = (ImageView)findViewById(R.id.iv_leftDice);
        final ImageView iv_rightDice = (ImageView)findViewById(R.id.iv_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_leftDice.setImageResource(R.drawable.dice7);
                iv_rightDice.setImageResource(R.drawable.dice7);
            }
        });

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(6);
                iv_leftDice.setImageResource(diceArray[number]);

                number = random.nextInt(6);
                iv_rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}
