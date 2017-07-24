package com.ajspeller.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore;
    private int teamATeamFouls;
    private int teamATimeouts;
    private int teamBScore;
    private int teamBTeamFouls;
    private int teamBTimeouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsTeamA(View view) {
        teamAScore += 3;
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(teamAScore));
    }

    public void threePointsTeamB(View view) {
        teamBScore += 3;
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(teamBScore));
    }

    public void twoPointsTeamA(View view) {
        teamAScore += 2;
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(teamAScore));
    }

    public void twoPointsTeamB(View view) {
        teamBScore += 2;
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(teamBScore));
    }

    public void freeThrowTeamA(View view) {
        teamAScore += 1;
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(teamAScore));
    }

    public void freeThrowTeamB(View view) {
        teamBScore += 1;
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(teamBScore));
    }

    public void teamFoulTeamA(View view) {
        teamATeamFouls++;
        TextView teamFoulsView = (TextView) findViewById(R.id.teamfouls_team_a);
        teamFoulsView.setText(String.valueOf(teamATeamFouls));
    }

    public void teamFoulTeamB(View view) {
        teamBTeamFouls++;
        TextView teamFoulsView = (TextView) findViewById(R.id.teamfouls_team_b);
        teamFoulsView.setText(String.valueOf(teamBTeamFouls));
    }

    public void timeoutTeamA(View view) {
        teamATimeouts++;
        TextView timeOutView = (TextView) findViewById(R.id.timeouts_team_a);
        timeOutView.setText(String.valueOf(teamATimeouts));
    }

    public void timeoutTeamB(View view) {
        teamBTimeouts++;
        TextView timeOutView = (TextView) findViewById(R.id.timeouts_team_b);
        timeOutView.setText(String.valueOf(teamBTimeouts));
    }

    public void teamAReset(View v) {
        teamAScore = 0;
        teamATeamFouls = 0;
        teamATimeouts = 0;

        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(teamAScore));

        TextView teamFoulsView = (TextView) findViewById(R.id.teamfouls_team_a);
        teamFoulsView.setText(String.valueOf(teamATeamFouls));

        TextView timeOutView = (TextView) findViewById(R.id.timeouts_team_a);
        timeOutView.setText(String.valueOf(teamATimeouts));
    }

    public void teamBReset(View v) {
        teamBScore = 0;
        teamBTeamFouls = 0;
        teamBTimeouts = 0;

        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(teamBScore));

        TextView teamFoulsView = (TextView) findViewById(R.id.teamfouls_team_b);
        teamFoulsView.setText(String.valueOf(teamBTeamFouls));

        TextView timeOutView = (TextView) findViewById(R.id.timeouts_team_b);
        timeOutView.setText(String.valueOf(teamBTimeouts));
    }
}
