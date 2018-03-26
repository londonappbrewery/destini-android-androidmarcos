package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex=1;

    /*String[] mStringStoryTextView = new String[] {
            getString(R.string.T1_Story),
            getString(R.string.T2_Story),
            getString(R.string.T3_Story)
    };*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(true);

            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(false);

            }
        });





    }

    private void updateQuestion(boolean userSelection) {
      int updateIndex = mStoryIndex;


        if((updateIndex==1)&&userSelection) {
            mStoryIndex=3;
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if((updateIndex==1)&& !userSelection) {
            mStoryIndex=2;
            mStoryTextView.setText(getString(R.string.T2_Story));
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        }
        //mStoryIndex==2"
        if((updateIndex==2)&&userSelection) {
            mStoryIndex=3;
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if((updateIndex==2)&& !userSelection) {
            mStoryIndex=4;
            mStoryTextView.setText(getString(R.string.T4_End));
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
        //mStoryIndex==3"
        if((updateIndex==3)&&userSelection) {
            mStoryIndex=6;
            mStoryTextView.setText(getString(R.string.T6_End));
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else if((updateIndex==3)&& !userSelection) {
            mStoryIndex=5;
            mStoryTextView.setText(getString(R.string.T5_End));
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }




//        //TODO
//        When the user gets to the end of the story,
//        hide the buttons with [YourButtonName].setVisibility(View.GONE);
    }

}
