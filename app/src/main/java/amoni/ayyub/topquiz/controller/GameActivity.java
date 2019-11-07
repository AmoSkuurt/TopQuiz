package amoni.ayyub.topquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import amoni.ayyub.topquiz.R;

public class GameActivity extends AppCompatActivity {

    //Déclaration des champs (attributs) requis
    private TextView mQuestionTxt;
    private Button mAnswer1;
    private Button mAnswer2;
    private Button mAnswer3;
    private Button mAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Branchement des variables
        mQuestionTxt = findViewById(R.id.activity_game_question_txt);
        mAnswer1 = findViewById(R.id.activity_game_answer1_btn);
        mAnswer2 = findViewById(R.id.activity_game_answer2_btn);
        mAnswer3 = findViewById(R.id.activity_game_answer3_btn);
        mAnswer4 = findViewById(R.id.activity_game_answer4_btn);
    }
}
