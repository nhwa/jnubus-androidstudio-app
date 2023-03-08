package com.example.jnubus_19_06_02;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.content.Context.ALARM_SERVICE;

public class RoutemapActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//       setActivityChange();
        View view = inflater.inflate(R.layout.route_map,container,false);
        final ImageView bus =(ImageView)view.findViewById(R.id.bus);
        final ImageButton aline =(ImageButton)view.findViewById(R.id.aline);
        final ImageButton bline =(ImageButton)view.findViewById(R.id.bline);

        final Animation anima = AnimationUtils.loadAnimation(getContext(),R.anim.seta_anim);
        final Animation animb = AnimationUtils.loadAnimation(getContext(),R.anim.setb_anim);
        bus.startAnimation(anima);
        // a노선/b노선 버튼
        aline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                aline.setImageResource(R.drawable.aline);
                bline.setImageResource(R.drawable.bline_not);
                bus.startAnimation(anima);
            }
        });
        bline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                aline.setImageResource(R.drawable.aline_not);
                bline.setImageResource(R.drawable.bline);
                bus.startAnimation(animb);
            }
        });

        return view;
    }


}