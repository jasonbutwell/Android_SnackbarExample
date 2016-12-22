package com.jasonbutwell.snackbarexample;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // set to show our layout for our custom snackbar

        setContentView(R.layout.activity_snackbar);

        displayBasicSnackBar();
    }

    // Display a simple snackbar

    public void displayBasicSnackBar() {
        Snackbar snackbar = Snackbar.make((CoordinatorLayout)findViewById(R.id.myCoordinatorLayout), "This is a snackbar", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
