package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhilosophyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);

        ArrayList<Grade> words = new ArrayList<Grade>();
        words.add(new Grade("Attendace", "5 out of 5"));
        words.add(new Grade("Homework", "8 out of 10"));
        words.add(new Grade("Quizze's", "15 out of 15"));
        words.add(new Grade("Participation", "4 out of 5"));
        words.add(new Grade("Midterm", "27 out of 30"));
        words.add(new Grade("Final", "31 out of 30"));
        words.add(new Grade("Total", "90 out of 100"));
        words.add(new Grade("Congrats", "You got a A minus"));

        GradeAdapter adapter = new GradeAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
