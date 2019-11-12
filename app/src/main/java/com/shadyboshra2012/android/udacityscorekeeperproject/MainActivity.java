package com.shadyboshra2012.android.udacityscorekeeperproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Scores int variables
    private int team1Score = 0;
    private int team2Score = 0;
    private int team1Kicks = 0;
    private int team2Kicks = 0;
    // Scores' TextViews
    private TextView team1ScoreTextView;
    private TextView team2ScoreTextView;
    // Kicks' TextViews
    private TextView team1KicksNumberTextView;
    private TextView team2KicksNumberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Define variables
        team1ScoreTextView = findViewById(R.id.team1_score_text_view);
        team2ScoreTextView = findViewById(R.id.team2_score_text_view);
        team1KicksNumberTextView = findViewById(R.id.team1_kicks_number_text_view);
        team2KicksNumberTextView = findViewById(R.id.team2_kicks_number_text_view);
        // Team 1 Buttons
        Button team1TouchdownBtn = findViewById(R.id.team1_touchdown_btn);
        Button team1FieldGoalBtn = findViewById(R.id.team1_field_goal_btn);
        Button team1SafetyBtn = findViewById(R.id.team1_safety_btn);
        Button team1PassBtn = findViewById(R.id.team1_pass_btn);
        Button team1KickBtn = findViewById(R.id.team1_kick_btn);
        // Team 2 Buttons
        Button team2TouchdownBtn = findViewById(R.id.team2_touchdown_btn);
        Button team2FieldGoalBtn = findViewById(R.id.team2_field_goal_btn);
        Button team2SafetyBtn = findViewById(R.id.team2_safety_btn);
        Button team2PassBtn = findViewById(R.id.team2_pass_btn);
        Button team2KickBtn = findViewById(R.id.team2_kick_btn);
        // Reset Button
        Button resetBtn = findViewById(R.id.reset_btn);
        // Set click events to buttons for team 1
        team1TouchdownBtn.setOnClickListener(v -> {
            // Increase with 6
            increaseTeam1Points(6);
        });
        team1FieldGoalBtn.setOnClickListener(v -> {
            // Increase with 3
            increaseTeam1Points(3);
        });
        team1SafetyBtn.setOnClickListener(v -> {
            // Increase with 2
            increaseTeam1Points(2);
        });
        team1PassBtn.setOnClickListener(v -> {
            // Increase with 2
            increaseTeam1Points(2);
        });
        team1KickBtn.setOnClickListener(v -> {
            // Increase with 1
            increaseTeam1Points(1);
            incrementTeam1Kicks();
        });
        // Set click events to buttons for team 2
        team2TouchdownBtn.setOnClickListener(v -> {
            // Increase with 6
            increaseTeam2Points(6);
        });
        team2FieldGoalBtn.setOnClickListener(v -> {
            // Increase with 3
            increaseTeam2Points(3);
        });
        team2SafetyBtn.setOnClickListener(v -> {
            // Increase with 2
            increaseTeam2Points(2);
        });
        team2PassBtn.setOnClickListener(v -> {
            // Increase with 2
            increaseTeam2Points(2);
        });
        team2KickBtn.setOnClickListener(v -> {
            // Increase with 1
            increaseTeam2Points(1);
            incrementTeam2Kicks();
        });
        // Set on click to reset scores
        resetBtn.setOnClickListener(v -> {
            team1Score = 0;
            team2Score = 0;
            team1Kicks = 0;
            team2Kicks = 0;
            team1ScoreTextView.setText(R.string.team_init_value);
            team2ScoreTextView.setText(R.string.team_init_value);
            team1KicksNumberTextView.setText(R.string.team_init_value);
            team2KicksNumberTextView.setText(R.string.team_init_value);
        });
    }

    private void increaseTeam1Points(int points) {
        team1Score += points;
        String score = team1Score + "";
        team1ScoreTextView.setText(score);
    }

    private void increaseTeam2Points(int points) {
        team2Score += points;
        String score = team2Score + "";
        team2ScoreTextView.setText(score);
    }

    private void incrementTeam1Kicks() {
        team1Kicks++;
        String kicks = team1Kicks + "";
        team1KicksNumberTextView.setText(kicks);
    }

    private void incrementTeam2Kicks() {
        team2Kicks++;
        String kicks = team2Kicks + "";
        team2KicksNumberTextView.setText(kicks);
    }
}
