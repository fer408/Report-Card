package com.example.android.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView cs = (TextView) findViewById(R.id.cs_text);

        // Set a click listener on that View
        cs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent csIntent = new Intent(MainActivity.this, CSActivity.class);

                // Start the new activity
                startActivity(csIntent);
            }
        });

        // Find the View that shows the family category
        TextView history = (TextView) findViewById(R.id.history_text);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView literature = (TextView) findViewById(R.id.literature_text);

        // Set a click listener on that View
        literature.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent LiteratureIntent = new Intent(MainActivity.this, LiteratureActivity.class);

                // Start the new activity
                startActivity(LiteratureIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView math = (TextView) findViewById(R.id.math_text);

        // Set a click listener on that View
        math.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent mathIntent = new Intent(MainActivity.this, MathActivity.class);

                // Start the new activity
                startActivity(mathIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView philosophy = (TextView) findViewById(R.id.philosophy_text);

        // Set a click listener on that View
        philosophy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent philosophyIntent = new Intent(MainActivity.this, PhilosophyActivity.class);

                // Start the new activity
                startActivity(philosophyIntent);
            }
        });
    }
}
