package com.example.android.lesson13task;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by kmurali on 20-03-2018.
 */

public class Main2 extends MainActivity {

    RecyclerView recyclerView;
    ArrayList<questions> questionsArrayList;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        questionsArrayList = new ArrayList<>();

        questionsArrayList.add(new questions("1.Who is the founder of android?", "Andy Rubins", "Alex Thomas", "Stuart Thaine"));
        questionsArrayList.add(new questions("2.On which OS is android based on?", "Linux", "Mac", "Windows"));
        questionsArrayList.add(new questions("3.Which is not a version of android?", "Dessert", "Oreo", "Jelly Bean"));
        questionsArrayList.add(new questions("4.What is the full form of AAPT?", "Android Asset Packaging Tool", "Android Application Processing Tool", "Android Asset Processing Tool"));


        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvlayoutmanager = layoutmanager;
        recyclerView.setLayoutManager(rvlayoutmanager);

        QuestionAdapter adapter = new QuestionAdapter(this, questionsArrayList);
        recyclerView.setAdapter(adapter);
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb1:
                if (checked)
                    count = count + 1;
                Toast.makeText(this, "Your score is:" + count + "/4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb2:
                if (checked)
                    Toast.makeText(this, "wrong!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rb3:
                if (checked)
                    Toast.makeText(this, "wrong!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
