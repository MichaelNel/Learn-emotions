package com.proj.mike.proj;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Story extends AppCompatActivity {

    private long mLastClickTime = 0;

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        FrameLayout ll = (FrameLayout) findViewById(R.id.layout);
        ll.setBackgroundResource(R.drawable.d1f1);
    }

    public void next(View view){
        final FrameLayout ll = (FrameLayout) findViewById(R.id.layout);
        RelativeLayout r = (RelativeLayout) findViewById(R.id.yn_layout);
        RelativeLayout ny = (RelativeLayout) findViewById(R.id.ny_layout);
        RelativeLayout h_s_a = (RelativeLayout) findViewById(R.id.h_s_a);
        RelativeLayout why_happy = (RelativeLayout) findViewById(R.id.why_happy);
        RelativeLayout how_sam = (RelativeLayout) findViewById(R.id.how_sam_feeling);
        RelativeLayout why_worried = (RelativeLayout) findViewById(R.id.why_worried);
        EditText usr_1 = (EditText) findViewById(R.id.usr_in_1);

        // Buttons
        Button b = (Button) findViewById(R.id.n_button);
        Button b_2 = (Button) findViewById(R.id.n_2);


        // Sounds
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.star_sm);
        final MediaPlayer mp_bg = MediaPlayer.create(this, R.raw.star_bg);


        // Images
        ImageView star_sm_1 = (ImageView) findViewById(R.id.star_sm_1);
        ImageView star_sm_2 = (ImageView) findViewById(R.id.star_sm_2);
        ImageView star_sm_3 = (ImageView) findViewById(R.id.star_sm_3);
        ImageView star_sm_4 = (ImageView) findViewById(R.id.star_sm_4);
        ImageView star_sm_5 = (ImageView) findViewById(R.id.star_sm_5);
        ImageView star_sm_6 = (ImageView) findViewById(R.id.star_sm_6);

        final ImageView star_big_1 = (ImageView) findViewById(R.id.star_bg_1);
        final ImageView star_big_2 = (ImageView) findViewById(R.id.star_bg_2);


        final Animation scale_down = AnimationUtils.loadAnimation(this, R.anim.scale_down);
        final Animation scale_up = AnimationUtils.loadAnimation(this, R.anim.scale_up);

        final ImageView thumb = (ImageView) findViewById(R.id.d1f11_big);

        scale_up.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart(Animation animation){}

            @Override
            public void onAnimationRepeat(Animation animation){}

            @Override
            public void onAnimationEnd(Animation animation){
                thumb.setVisibility(View.GONE);
                thumb.clearAnimation();
                if(count < 25) {
                    ll.setBackgroundResource(R.drawable.d1f15);
                }else if ( count > 25 && count < 30){
                    ll.setBackgroundResource(R.drawable.d1f20);
                }else if ( count > 30){
                    ll.setBackgroundResource(R.drawable.d1f24);
                }
            }
        });


        if (SystemClock.elapsedRealtime() - mLastClickTime < 500){
            return;
        }

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
                spin_and_move(star_sm_1, 500.0f);
                mp.start();
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
                thumb.setVisibility(View.VISIBLE);

                thumb.startAnimation(scale_down);

                h_s_a.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 19: ll.setBackgroundResource(R.drawable.d1f13);
                spin_and_move(star_sm_2, 600.0f);
                mp.start();
                h_s_a.setVisibility(View.GONE);
                why_happy.setVisibility(View.VISIBLE);

                break;
            case 20: ll.setBackgroundResource(R.drawable.d1f14);
                star_sm_1.clearAnimation();
                star_sm_2.clearAnimation();
                enlarge_move_shrink(star_big_1, -120.0f);
                mp_bg.start();


                why_happy.setVisibility(View.GONE);
                r.setVisibility(View.VISIBLE);

                break;
            case 21: thumb.setImageResource(R.drawable.d1f15);
                spin_and_move(star_sm_3, 620.0f);
                mp.start();
                thumb.startAnimation(scale_up);
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
                thumb.setImageResource(R.drawable.d1f17);
                thumb.setVisibility(View.VISIBLE);
                thumb.startAnimation(scale_down);

                how_sam.setVisibility(View.VISIBLE);
                b.setVisibility(View.INVISIBLE);
                break;

            case 28: ll.setBackgroundResource(R.drawable.d1f19);
                spin_and_move(star_sm_4, 670.0f);
                mp.start();
                how_sam.setVisibility(View.GONE);
                ny.setVisibility(View.VISIBLE);
                break;

            case 29: thumb.setImageResource(R.drawable.d1f20);
                thumb.startAnimation(scale_up);
                star_sm_3.clearAnimation();
                star_sm_4.clearAnimation();
                enlarge_move_shrink(star_big_2, 0.0f);
                mp_bg.start();


                ny.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;
            case 30: ll.setBackgroundResource(R.drawable.d1f21);
                break;
            case 31: ll.setBackgroundResource(R.drawable.d1f22);
                thumb.setImageResource(R.drawable.d1f21);
                thumb.setVisibility(View.VISIBLE);
                thumb.startAnimation(scale_down);

                b.setVisibility(View.INVISIBLE);
                why_worried.setVisibility(View.VISIBLE);

                break;

            case 32: ll.setBackgroundResource(R.drawable.d1f23);
                usr_1.setVisibility(View.VISIBLE);
                b_2.setVisibility(View.VISIBLE);
                spin_and_move(star_sm_5, 720.0f);
                mp.start();
                why_worried.setVisibility(View.GONE);
                b.setVisibility(View.VISIBLE);
                break;

            case 33:
                // Save editText contents to file

                // Get editText contents
                String what_to_do = "What can I do to try make Sam feel better? : " + usr_1.getText().toString();

                String extPath = Environment.getExternalStorageDirectory().getAbsolutePath();

                //Set up file
                File file = new File(getExternalFilesDir(extPath).getAbsolutePath(), "out.txt");

                /*if (!dir.exists()){
                    dir.mkdir();
                    System.out.println("Directory created");
                }*/
                //File file = new File(dir, pathPrefix + "out.txt");
                try {

                    if(!file.exists()){
                        file.createNewFile();
                    }
                    BufferedOutputStream f_out = new BufferedOutputStream(new FileOutputStream(file));
                    f_out.write(what_to_do.getBytes());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                thumb.setImageResource(R.drawable.d1f24);
                b_2.setVisibility(View.GONE);
                spin_and_move(star_sm_6, 770.0f);
                mp.start();
                thumb.startAnimation(scale_up);
                usr_1.setVisibility(View.GONE);
                break;
            case 34: ll.setBackgroundResource(R.drawable.d1f25);
                break;
            case 35: ll.setBackgroundResource(R.drawable.d1f26);
                break;
            case 36: finish();
                break;
        }
        mLastClickTime = SystemClock.elapsedRealtime();
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

        // Prevent button spamming
        if (SystemClock.elapsedRealtime() - mLastClickTime < 500){
            return;
        }

        count--;

        switch (count){
            case 1: ll.setBackgroundResource(R.drawable.d1f1);
                count = 1;
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
        mLastClickTime = SystemClock.elapsedRealtime();
    }

    public void spin_and_move(ImageView i, float dist){
        AnimationSet move_and_spin = new AnimationSet(true);

        TranslateAnimation move = new TranslateAnimation(0.0f, dist,
                0.0f, 0.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        move.setDuration(1500);  // animation duration
        move.setInterpolator(new LinearInterpolator());

        RotateAnimation spin = new RotateAnimation(0, 720);
        spin.setInterpolator(new LinearInterpolator());
        spin.setDuration(1500);

        move_and_spin.addAnimation(spin);
        move_and_spin.addAnimation(move);

        move_and_spin.setFillAfter(true);

        i.startAnimation(move_and_spin);

    }

    public void enlarge_move_shrink(final ImageView i, final float x){
        AnimationSet enlarge_move = new AnimationSet(true);

        TranslateAnimation move = new TranslateAnimation(0.0f, 0.0f,
                0.0f, -500.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        move.setDuration(1500);  // animation duration
        move.setInterpolator(new LinearInterpolator());

        ScaleAnimation enlarge = new ScaleAnimation(1.0f, 2.5f, 1.0f, 2.5f,Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        enlarge.setDuration(1500);
        enlarge.setInterpolator(new LinearInterpolator());

        enlarge_move.addAnimation(enlarge);
        enlarge_move.addAnimation(move);

        enlarge_move.setFillAfter(true);

        enlarge_move.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart(Animation animation){}

            @Override
            public void onAnimationRepeat(Animation animation){}

            @Override
            public void onAnimationEnd(Animation animation){

                i.clearAnimation();

                AnimationSet shrink_move = new AnimationSet(true);

                TranslateAnimation move_d = new TranslateAnimation(0.0f, x,
                        -500.0f, -150.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
                move_d.setDuration(1500);  // animation duration
                move_d.setInterpolator(new LinearInterpolator());

                ScaleAnimation shrink = new ScaleAnimation(2.5f, 1.0f, 2.5f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                shrink.setDuration(1500);
                shrink.setInterpolator(new LinearInterpolator());

                RotateAnimation spin = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                spin.setDuration(1500);
                spin.setInterpolator(new LinearInterpolator());

                shrink_move.addAnimation(spin);
                shrink_move.addAnimation(shrink);
                shrink_move.addAnimation(move_d);

                shrink_move.setFillAfter(true);

                i.startAnimation(shrink_move);

            }
        });

        i.startAnimation(enlarge_move);

    }

}