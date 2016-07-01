package com.example.android.reportcard;

/**
 * Created by fernando on 6/30/16.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link GradeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Grade} objects.
 */
public class GradeAdapter extends ArrayAdapter<Grade>  {

    /**
     * Create a new {@linkGradeAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Grade}s to be displayed.
     */
    public GradeAdapter(Context context, ArrayList<Grade> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Grade currentGrade = getItem(position);


        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.task_text_view);

        gradeTextView.setText(currentGrade.getTask());


        TextView taskTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);

        taskTextView.setText(currentGrade.toString());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}