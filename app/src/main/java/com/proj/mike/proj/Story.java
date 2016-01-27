package com.proj.mike.proj;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

public class Story extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

    }

    public void next(View view){
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.layout);

        switch (count){
            case 1: ll.setBackgroundResource(R.drawable.frame2);
                break;
            case 2: ll.setBackgroundResource(R.drawable.frame3);
                break;
            case 3: ll.setBackgroundResource(R.drawable.d1f4);
                break;
            case 4: ll.setBackgroundResource(R.drawable.d1f5);
                break;
            case 5: ll.setBackgroundResource(R.drawable.d1f6);
                break;
            case 6: ll.setBackgroundResource(R.drawable.d1f7);
                break;
            case 7: ll.setBackgroundResource(R.drawable.d1f7_5);
                break;
            case 8: ll.setBackgroundResource(R.drawable.d1f8);
                break;
            case 9: ll.setBackgroundResource(R.drawable.d1f9);
                break;
            case 10: ll.setBackgroundResource(R.drawable.d1f10);
                break;
            case 11: ll.setBackgroundResource(R.drawable.d1f11);
                break;
            case 12: ll.setBackgroundResource(R.drawable.d1f12);
                break;
            case 13: ll.setBackgroundResource(R.drawable.d1f13);
                break;
            case 14: ll.setBackgroundResource(R.drawable.d1f14);
                break;
            case 15: ll.setBackgroundResource(R.drawable.d1f15);
                break;
            case 16: ll.setBackgroundResource(R.drawable.d1f16);
                break;
            case 17: ll.setBackgroundResource(R.drawable.d1f17);
                break;
            case 18: ll.setBackgroundResource(R.drawable.d1f18);
                break;
            case 19: ll.setBackgroundResource(R.drawable.d1f19);
                break;
            case 20: ll.setBackgroundResource(R.drawable.d1f20);
                break;
            case 21: ll.setBackgroundResource(R.drawable.d1f21);
                break;
            case 22: ll.setBackgroundResource(R.drawable.d1f22);
                break;
            case 23: ll.setBackgroundResource(R.drawable.d1f23);
                break;
            case 24: ll.setBackgroundResource(R.drawable.d1f24);
                break;
            case 25: ll.setBackgroundResource(R.drawable.d1f25);
                count = 24;
                break;
        }
        count +=1;
    }

    public void prev(View view){
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.layout);

        switch (count){
            case 1: ll.setBackgroundResource(R.drawable.frame2);
                count =2;
                break;
            case 2: ll.setBackgroundResource(R.drawable.frame2);
                break;
            case 3: ll.setBackgroundResource(R.drawable.frame3);
                break;
            case 4: ll.setBackgroundResource(R.drawable.d1f4);
                break;
            case 5: ll.setBackgroundResource(R.drawable.d1f5);
                break;
            case 6: ll.setBackgroundResource(R.drawable.d1f6);
                break;
            case 7: ll.setBackgroundResource(R.drawable.d1f7);
                break;
            case 8: ll.setBackgroundResource(R.drawable.d1f7_5);
                break;
            case 9: ll.setBackgroundResource(R.drawable.d1f8);
                break;
            case 10: ll.setBackgroundResource(R.drawable.d1f9);
                break;
            case 11: ll.setBackgroundResource(R.drawable.d1f10);
                break;
            case 12: ll.setBackgroundResource(R.drawable.d1f11);
                break;
            case 13: ll.setBackgroundResource(R.drawable.d1f12);
                break;
            case 14: ll.setBackgroundResource(R.drawable.d1f13);
                break;
            case 15: ll.setBackgroundResource(R.drawable.d1f14);
                break;
            case 16: ll.setBackgroundResource(R.drawable.d1f15);
                break;
            case 17: ll.setBackgroundResource(R.drawable.d1f16);
                break;
            case 18: ll.setBackgroundResource(R.drawable.d1f17);
                break;
            case 19: ll.setBackgroundResource(R.drawable.d1f18);
                break;
            case 20: ll.setBackgroundResource(R.drawable.d1f19);
                break;
            case 21: ll.setBackgroundResource(R.drawable.d1f20);
                break;
            case 22: ll.setBackgroundResource(R.drawable.d1f21);
                break;
            case 23: ll.setBackgroundResource(R.drawable.d1f22);
                break;
            case 24: ll.setBackgroundResource(R.drawable.d1f23);
                break;
            case 25: ll.setBackgroundResource(R.drawable.d1f24);
                break;
        }
        count -=1;
    }

}