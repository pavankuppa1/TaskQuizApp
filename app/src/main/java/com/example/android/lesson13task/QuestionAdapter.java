package com.example.android.lesson13task;


import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kmurali on 17-03-2018.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private Context mcontext;
    private ArrayList<questions> questionsArrayList;
    int count = 0;

    QuestionAdapter(Context context, ArrayList<questions> list) {
        mcontext = context;
        questionsArrayList = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.questions, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        questions questions = questionsArrayList.get(position);


        TextView question;
        RadioButton rb1, rb2, rb3;
        question = holder.question;
        rb1 = holder.rb1;
        rb2 = holder.rb2;
        rb3 = holder.rb3;
        question.setText(questions.getQuestion());
        rb1.setText(questions.getRb1());
        rb2.setText(questions.getRb2());
        rb3.setText(questions.getRb3());
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    @Override
    public int getItemCount() {
        return questionsArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView question;
        public RadioButton rb1, rb2, rb3;


        public ViewHolder(View itemView) {
            super(itemView);
            question = (TextView) itemView.findViewById(R.id.vid_text1);
            rb1 = (RadioButton) itemView.findViewById(R.id.rb1);
            rb2 = (RadioButton) itemView.findViewById(R.id.rb2);
            rb3 = (RadioButton) itemView.findViewById(R.id.rb3);


        }
    }

}
