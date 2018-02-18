package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int foulTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;
    int goalTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays goals scored for Team A.
     */
    public void displayScoreTeamA(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_a_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays number of fouls for Team A.
     */
    public void displayFoulTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foulCounter);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays number of yellow card for Team A.
     */
    public void displayYellowCardTeamA(int card) {
        TextView cardView = (TextView) findViewById(R.id.yellow_card_counter_team_a);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Displays number of red card for Team A.
     */
    public void displayRedCardTeamA(int card) {
        TextView cardView = (TextView) findViewById(R.id.red_card_counter_team_a);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Adds a goal for Team A.
     */
    public void addGoalTeamA(View view) {
        goalTeamA += 1;
        displayScoreTeamA(goalTeamA);
    }

    /**
     * Adds a foul for Team A.
     */
    public void addFoul(View view) {
        foulTeamA += 1;
        displayFoulTeamA(foulTeamA);
    }

    /**
     * Adds yellow/red card for Team A.
     */
    public void addCardForTeamA(View view) {
        if (view == findViewById(R.id.yellow_card_button_team_a)) {
            yellowCardTeamA += 1;
            displayYellowCardTeamA(yellowCardTeamA);
        } else {
            redCardTeamA += 1;
            displayRedCardTeamA(redCardTeamA);
        }
    }

    /**
     * Displays goals scored for Team B.
     */
    public void displayScoreTeamB(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_b_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays number of games played for Team B.
     */
    public void displayFoulTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foulCounter);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays number of yellow card for Team B.
     */
    public void displayYellowCardTeamB(int card) {
        TextView cardView = (TextView) findViewById(R.id.yellow_card_counter_team_b);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Displays number of red card for Team B.
     */
    public void displayRedCardTeamB(int card) {
        TextView cardView = (TextView) findViewById(R.id.red_card_counter_team_b);
        cardView.setText(String.valueOf(card));
    }

    /**
     * Adds a goal for Team B.
     */
    public void addGoalTeamB(View view) {
        goalTeamB += 1;
        displayScoreTeamB(goalTeamB);
    }

    /**
     * Adds a foul for Team B.
     */
    public void addFoulTeamB(View view) {
        foulTeamB += 1;
        displayFoulTeamB(foulTeamB);
    }

    /**
     * Adds yellow/red card for Team B.
     */
    public void addCardForTeamB(View view) {
        if (view == findViewById(R.id.yellow_card_button_team_b)) {
            yellowCardTeamB += 1;
            displayYellowCardTeamB(yellowCardTeamB);
        } else {
            redCardTeamB += 1;
            displayRedCardTeamB(redCardTeamB);
        }
    }

    /**
     * Sets score and number of games to 0 for both teams.
     */
    public void resetGame(View view) {
        goalTeamA = 0;
        foulTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        displayScoreTeamA(goalTeamA);
        displayFoulTeamA(foulTeamA);
        displayYellowCardTeamA(yellowCardTeamA);
        displayRedCardTeamA(redCardTeamA);
        goalTeamB = 0;
        foulTeamB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;
        displayScoreTeamB(goalTeamB);
        displayFoulTeamB(foulTeamB);
        displayYellowCardTeamB(yellowCardTeamB);
        displayRedCardTeamB(redCardTeamB);
    }
}