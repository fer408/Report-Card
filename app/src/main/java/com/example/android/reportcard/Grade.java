package com.example.android.reportcard;

/**
 * Created by fernando on 6/30/16.
 */

public class Grade {


    private String mTask;


    private String mGrade;

    /**
     * Create a new com.example.android.reportcard.Grade object.
     *
     * @param task
     *
     * @param grade is the grade given.
     */
    public Grade(String task, String grade) {
        mTask = task;
        mGrade = grade;
    }

    /**
     * Get the default translation of the word.
     */
    public String getTask() {
        return mTask;
    }


    public String toString() {
        return mGrade;

}
}
