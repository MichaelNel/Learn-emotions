package com.proj.mike.proj;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Story extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        FrameLayout ll = (FrameLayout) findViewById(R.id.layout);
        ll.setBackgroundResource(R.drawable.d1f1);

    }

    public void next(View view){
        FrameLayout ll = (FrameLayout) findViewById(R.id.layout);
        Button b = (Button) findViewById(R.id.n_button);
        RelativeLayout r = (RelativeLayout) findViewById(R.id.yn_layout);
        RelativeLayout ny = (RelativeLayout) findViewById(R.id.ny_layout);
        RelativeLayout h_s_a = (RelativeLayout) findViewById(R.id.h_s_a);
        RelativeLayout why_happy = (RelativeLayout) findViewById(R.id.why_happy);
        RelativeLayout how_sam = (RelativeLayout) findViewById(R.id.how_sam_feeling);
        RelativeLayout why_worried = (RelativeLayout) findViewById(R.id.why_worried);
        EditText usr_1 = (EditText) findViewById(R.id.usr_in_1);

        count++;

        switch (count){
            case 1: ll.setBackgroundResource(R.drawable.d1f1);
                break;
            case 2: ll.setBackgroundResource(R.drawable.d1f2);
                break;
            case 3: ll.setBackgroundResource(R.drawable.d1f3);
                r.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 4: ll.setBackgroundResource(R.drawable.d1f3_5);
                r.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;

            case 5: ll.setBackgroundResource(R.drawable.d1f4);
                break;
            case 6: ll.setBackgroundResource(R.drawable.d1f4_5);
                break;
            case 7: ll.setBackgroundResource(R.drawable.d1f5);
                break;
            case 8: ll.setBackgroundResource(R.drawable.d1f5_5);
                break;
            case 9: ll.setBackgroundResource(R.drawable.d1f6);
                break;
            case 10: ll.setBackgroundResource(R.drawable.d1f7);
                break;
            case 11: ll.setBackgroundResource(R.drawable.d1f7_3);
                break;
            case 12: ll.setBackgroundResource(R.drawable.d1f7_5);
                break;
            case 13: ll.setBackgroundResource(R.drawable.d1f8);
                break;
            case 14: ll.setBackgroundResource(R.drawable.d1f8_5);
                break;
            case 15: ll.setBackgroundResource(R.drawable.d1f9);
                break;
            case 16: ll.setBackgroundResource(R.drawable.d1f10);
                break;
            case 17: ll.setBackgroundResource(R.drawable.d1f11);
                break;

            case 18: ll.setBackgroundResource(R.drawable.d1f12);
                h_s_a.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;
            case 19: ll.setBackgroundResource(R.drawable.d1f13);
                h_s_a.setVisibility(View.GONE);
                why_happy.setVisibility(View.VISIBLE);

                break;
            case 20: ll.setBackgroundResource(R.drawable.d1f14);
                why_happy.setVisibility(View.GONE);
                r.setVisibility(View.VISIBLE);
                break;
            case 21: ll.setBackgroundResource(R.drawable.d1f15);
                r.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;
            case 22: ll.setBackgroundResource(R.drawable.d1f15_5);
                break;
            case 23: ll.setBackgroundResource(R.drawable.d1f16);
                break;
            case 24: ll.setBackgroundResource(R.drawable.d1f16_3);
                break;
            case 25: ll.setBackgroundResource(R.drawable.d1f16_6);
                break;
            case 26: ll.setBackgroundResource(R.drawable.d1f17);
                break;
            case 27: ll.setBackgroundResource(R.drawable.d1f18);
                how_sam.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 28: ll.setBackgroundResource(R.drawable.d1f19);
                how_sam.setVisibility(View.GONE);
                ny.setVisibility(View.VISIBLE);
                break;

            case 29: ll.setBackgroundResource(R.drawable.d1f20);
                ny.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;
            case 30: ll.setBackgroundResource(R.drawable.d1f21);
                break;
            case 31: ll.setBackgroundResource(R.drawable.d1f22);
                b.setVisibility(View.INVISIBLE);
                why_worried.setVisibility(View.VISIBLE);
                break;

            case 32: ll.setBackgroundResource(R.drawable.d1f23);
                why_worried.setVisibility(View.GONE);
                usr_1.setVisibility(View.VISIBLE);
                b.setVisibility(View.VISIBLE);
                break;

            case 33: ll.setBackgroundResource(R.drawable.d1f24);
                usr_1.setVisibility(View.GONE);
                break;
            case 34: ll.setBackgroundResource(R.drawable.d1f25);
                break;
            case 35: ll.setBackgroundResource(R.drawable.d1f26);
                break;
            case 36: finish();
                break;
        }
    }

    public void prev(View view){
        FrameLayout ll = (FrameLayout) findViewById(R.id.layout);
        Button b = (Button) findViewById(R.id.n_button);
        RelativeLayout r = (RelativeLayout) findViewById(R.id.yn_layout);
        RelativeLayout ny = (RelativeLayout) findViewById(R.id.ny_layout);
        RelativeLayout h_s_a = (RelativeLayout) findViewById(R.id.h_s_a);
        RelativeLayout why_happy = (RelativeLayout) findViewById(R.id.why_happy);
        RelativeLayout how_sam = (RelativeLayout) findViewById(R.id.how_sam_feeling);
        RelativeLayout why_worried = (RelativeLayout) findViewById(R.id.why_worried);
        EditText usr_1 = (EditText) findViewById(R.id.usr_in_1);

        count--;

        switch (count){
            case 1: ll.setBackgroundResource(R.drawable.d1f1);
                count = 2;
                break;
            case 2: ll.setBackgroundResource(R.drawable.d1f2);
                r.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;
            case 3: ll.setBackgroundResource(R.drawable.d1f3);
                r.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 4: ll.setBackgroundResource(R.drawable.d1f3_5);
                break;
            case 5: ll.setBackgroundResource(R.drawable.d1f4);
                break;
            case 6: ll.setBackgroundResource(R.drawable.d1f4_5);
                break;
            case 7: ll.setBackgroundResource(R.drawable.d1f5);
                break;
            case 8: ll.setBackgroundResource(R.drawable.d1f5_5);
                break;
            case 9: ll.setBackgroundResource(R.drawable.d1f6);
                break;
            case 10: ll.setBackgroundResource(R.drawable.d1f7);
                break;
            case 11: ll.setBackgroundResource(R.drawable.d1f7_3);
                break;
            case 12: ll.setBackgroundResource(R.drawable.d1f7_5);
                break;
            case 13: ll.setBackgroundResource(R.drawable.d1f8);
                break;
            case 14: ll.setBackgroundResource(R.drawable.d1f8_5);
                break;
            case 15: ll.setBackgroundResource(R.drawable.d1f9);
                break;
            case 16: ll.setBackgroundResource(R.drawable.d1f10);
                break;
            case 17: ll.setBackgroundResource(R.drawable.d1f11);
                h_s_a.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;

            case 18: ll.setBackgroundResource(R.drawable.d1f12);
                h_s_a.setVisibility(View.VISIBLE);
                why_happy.setVisibility(View.GONE);
                break;

            case 19: ll.setBackgroundResource(R.drawable.d1f13);
                r.setVisibility(View.GONE);
                why_happy.setVisibility(View.VISIBLE);
                break;

            case 20: ll.setBackgroundResource(R.drawable.d1f14);
                r.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 21: ll.setBackgroundResource(R.drawable.d1f15);
                break;
            case 22: ll.setBackgroundResource(R.drawable.d1f15_5);
                break;
            case 23: ll.setBackgroundResource(R.drawable.d1f16);
                break;
            case 24: ll.setBackgroundResource(R.drawable.d1f16_3);
                break;
            case 25: ll.setBackgroundResource(R.drawable.d1f16_6);
                break;
            case 26: ll.setBackgroundResource(R.drawable.d1f17);
                how_sam.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;

            case 27: ll.setBackgroundResource(R.drawable.d1f18);
                how_sam.setVisibility(View.VISIBLE);
                ny.setVisibility(View.GONE);
                break;

            case 28: ll.setBackgroundResource(R.drawable.d1f19);
                ny.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 29: ll.setBackgroundResource(R.drawable.d1f20);
                break;
            case 30: ll.setBackgroundResource(R.drawable.d1f21);
                b.setVisibility(View.VISIBLE);
                why_worried.setVisibility(View.GONE);
                break;

            case 31: ll.setBackgroundResource(R.drawable.d1f22);
                why_worried.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                usr_1.setVisibility(View.GONE);
                break;

            case 32: ll.setBackgroundResource(R.drawable.d1f23);
                usr_1.setVisibility(View.VISIBLE);
                break;

            case 33: ll.setBackgroundResource(R.drawable.d1f24);
                break;
            case 34: ll.setBackgroundResource(R.drawable.d1f25);
                break;
            case 35: ll.setBackgroundResource(R.drawable.d1f26);
                break;
        }
    }

}