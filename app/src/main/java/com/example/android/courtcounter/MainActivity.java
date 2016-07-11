package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTwentyToTeamA(View v) {
        scoreTeamA = scoreTeamA+20;
        displayForTeamA(scoreTeamA);
    }

    public void addTenToTeamA(View v) {
        scoreTeamA = scoreTeamA+10;
        displayForTeamA(scoreTeamA);
    }

    public void addFiftyToTeamA(View v) {
        scoreTeamA = scoreTeamA+50;
        displayForTeamA(scoreTeamA);
    }

    public void addFowlToTeamA(View v) {
        if (scoreTeamA >= 10) {
            scoreTeamA = scoreTeamA-10;
            displayForTeamA(scoreTeamA);
        } else {
            displayForTeamA(0);
        }
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addTwentyToTeamB(View v){
        scoreTeamB = scoreTeamB+20;
        displayForTeamB(scoreTeamB);
    }
    public void addTenToTeamB(View v){
        scoreTeamB = scoreTeamB+10;
        displayForTeamB(scoreTeamB);
    }
    public void addFiftyToTeamB(View v){
        scoreTeamB = scoreTeamB+50;
        displayForTeamB(scoreTeamB);
    }
    public void addFowlToTeamB(View v){
        if(scoreTeamB >= 10) {
            scoreTeamB = scoreTeamB-10;
            displayForTeamB(scoreTeamB);
        }
        else {
        displayForTeamB(0);
        }
    }
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        }
    }

