package com.example.lenovo.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays a point counter for a basketball game.
 */
public class MainActivity extends AppCompatActivity {
    int pointsA = 0;
    int pointsB = 0;
    int bigScore = 3;
    int mediumScore = 2;
    int lowScore = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Resets the score for both teams.
     */
    public void reset(View view) {
        pointsA = 0;
        displaypointCounterA(pointsA);
        pointsB = 0;
        displaypointCounterB(pointsB);
    }

    /**
     * This method is called when the +3 points button is clicked.
     */
    public void threePointsA(View view) {
        pointsA = pointsA + bigScore;
        displaypointCounterA(pointsA);
    }

    /**
     * This method is called when the +2 point button is clicked.
     */
    public void twoPointsA(View view) {
        pointsA = pointsA + mediumScore;
        displaypointCounterA(pointsA);
    }

    /**
     * This method is called when the free throw button is clicked.
     */

    public void freeThrowA(View view) {
        pointsA = pointsA + lowScore;
        displaypointCounterA(pointsA);
    }

    /**
     * This method is called when the +3 points button is clicked.
     */
    public void threePointsB(View view) {
        pointsB = pointsB + bigScore;
        displaypointCounterB(pointsB);
    }

    /**
     * This method is called when the +2 point button is clicked.
     */
    public void twoPointsB(View view) {
        pointsB = pointsB + mediumScore;
        displaypointCounterB(pointsB);
    }

    /**
     * This method is called when the free throw button is clicked.
     */

    public void freeThrowB(View view) {
        pointsB = pointsB + lowScore;
        displaypointCounterB(pointsB);
    }

    /**
     * This method displays the point counter for team A on the screen.
     */
    private void displaypointCounterA(int number) {
        TextView textViewPointCounterA = (TextView) findViewById(R.id.textView_pointCounterA);
        textViewPointCounterA.setText("" + number);
    }

    /**
     * This method displays the point counter for team B on the screen.
     */
    private void displaypointCounterB(int number) {
        TextView textViewPointCounterB = (TextView) findViewById(R.id.textView_pointCounterB);
        textViewPointCounterB.setText("" + number);
    }

}
