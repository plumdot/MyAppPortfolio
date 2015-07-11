package com.plumley.android.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches a button */
    public void launchToast(View v) {

        // set up the toast parameters
        Context context = getApplicationContext();
        CharSequence text = "button pushed " ;
        int duration = Toast.LENGTH_SHORT;

        // get appropriate text
        switch (v.getId()){
            case R.id.btn_popularMovies:
                text = "This button will launch my Movies App!";
                break;
            case R.id.btn_footballScores:
                text = "This button will launch my Football Scores App!";
                break;
            case R.id.btn_library:
                text = "This button will launch my Library App!";
                break;
            case R.id.btn_buildItBigger:
                text = "This button will launch my Build It Bigger App!";
                break;
            case R.id.btn_xyzReader:
                text = "This button will launch my XYZ Reader App!";
                break;
            case R.id.btn_capstone:
                text = "This button will launch my Capstone App!";
                break;
        }

        // create and show the toast
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }



}
