package com.example.gurnoor.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    /*
Now that the buttons have resource IDs, you can access them in MainActivity . The first step is to add
two member variables.
 */
    private Button mTrueButton;
    private Button mFalseButton;
/*
The onCreate(Bundle) method is called when an instance of the activity subclass is created. When an
activity is created, it needs a user interface to manage.
Now you can wire up your button widgets. This is a two-step process:
• get references to the inflated View objects
• set listeners on those objects to respond to user actions
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*To get the activity its user interface, you call the
        following Activity method.
        This method inflates a layout and puts it on screen. When a layout is inflated, each widget in the layout
file is instantiated as defined by its attributes. You specify which layout to inflate by passing in the
layout’s resource ID.
        To access a resource(layout is a RESOURCE)in code, you use its resource ID
        */
       setContentView(R.layout.activity_main);
        /*
        In an activity, you can get a reference to an inflated widget by calling the following Activity method:
public View findViewById(int id)
This method accepts a resource ID of a widget and returns a View object.
In QuizActivity.java , use the resource IDs of your buttons to retrieve the inflated objects and assign
them to your member variables. Note that you must cast the returned View to Button before assigning
it.
         */
        mTrueButton = (Button) findViewById(R.id.true_button);
        /*
        you set a listener to inform you when the Button known as mTrueButton has been
pressed. The setOnClickListener(OnClickListener) method takes a listener as its argument. In
particular, it takes an object that implements OnClickListener .
         */
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// action
                /*
                The Context parameter is typically an instance of Activity ( Activity is a subclass of Context ). The
second parameter is the resource ID of the string that the toast should display. The Context is needed
by the Toast class to be able to find and use the string’s resource ID. The third parameter is one of two
Toast constants that specify how long the toast should be visible.
After you have created a toast, you call Toast.show() on it to get it on screen.
                 */
                Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
