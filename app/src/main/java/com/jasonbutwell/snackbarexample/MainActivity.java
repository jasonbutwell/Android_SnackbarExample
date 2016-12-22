package com.jasonbutwell.snackbarexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // set to show our layout for our custom snackbar

        setContentView(R.layout.activity_snackbar);

//        displayBasicSnackBar();
        displayActionSnackbar();
    }

    // Display a snackbar that supports an action

    public void displayActionSnackbar() {

        // Build a new snackbar

        Snackbar snackbar = Snackbar.make((CoordinatorLayout)findViewById(R.id.myCoordinatorLayout), "This is a snackbar", Snackbar.LENGTH_LONG);
        snackbar.setAction("My action", new View.OnClickListener() {

            // We override the default onclick behaviour with our own action

            @Override
            public void onClick(View v) {
                // Shows a simple Toast message when the snackbar is tapped
                Toast.makeText(getApplicationContext(),"Snackbar has been tapped", Toast.LENGTH_SHORT).show();
            }
        });

        // Change the text colour to RED

        snackbar.setActionTextColor(Color.RED);

        // Show the snackbar

        snackbar.show();
    }

    // Display a simple snackbar

    public void displayBasicSnackBar() {
        Snackbar snackbar = Snackbar.make((CoordinatorLayout)findViewById(R.id.myCoordinatorLayout), "This is a snackbar", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
