package com.example.jnubus_19_06_02;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class TimeTableActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.time_table, container, false);

        final TextView text1 = (TextView)view.findViewById(R.id.textView1);
        final TextView text2 = (TextView)view.findViewById(R.id.textView2);
        final TextView text3 = (TextView)view.findViewById(R.id.textView3);
        final TextView text4 = (TextView)view.findViewById(R.id.textView4);
        final TextView text5 = (TextView)view.findViewById(R.id.textView5);
        final TextView text6 = (TextView)view.findViewById(R.id.textView6);
        final TextView text7 = (TextView)view.findViewById(R.id.textView7);
        final TextView text8 = (TextView)view.findViewById(R.id.textView8);
        final TextView text9 = (TextView)view.findViewById(R.id.textView9);
        final TextView text10 = (TextView)view.findViewById(R.id.textView10);
        final TextView text11 = (TextView)view.findViewById(R.id.textView11);
        final TextView text12 = (TextView)view.findViewById(R.id.textView12);

        final Button button1 = (Button)view.findViewById(R.id.button1);
        final Button button2 = (Button)view.findViewById(R.id.button2);
        final Button button3 = (Button)view.findViewById(R.id.button3);
        final Button button4 = (Button)view.findViewById(R.id.button4);
        final Button button5 = (Button)view.findViewById(R.id.button5);
        final Button button6 = (Button)view.findViewById(R.id.button6);
        final Button button7 = (Button)view.findViewById(R.id.button7);
        final Button button8 = (Button)view.findViewById(R.id.button8);
        final Button button9 = (Button)view.findViewById(R.id.button9);
        final Button button10 = (Button)view.findViewById(R.id.button10);
        final Button button11 = (Button)view.findViewById(R.id.button11);
        final Button button12 = (Button)view.findViewById(R.id.button12);
        final Button button13 = (Button)view.findViewById(R.id.button13);
        final Button button14 = (Button)view.findViewById(R.id.button14);


        button13.setOnClickListener(new Button.OnClickListener() {
                                        public void onClick(View v) {
                                            if (v.getId() == R.id.button13) {
                                                button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                                button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                                button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                                button14.setTextColor(getResources().getColor(R.color.colorText));
                                            }
                                        }
                                    });

        button14.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(v.getId()==R.id.button14){
                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    button13.setTextColor(getResources().getColor(R.color.colorText));
                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                }}
        });

                button1.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:05         14:30");
                                    text2.setText("08:25         15:05");
                                    text3.setText("08:45         15:25");
                                    text4.setText("09:30         15:45");
                                    text5.setText("10:05         16:30");
                                    text6.setText("10:25         17:00");
                                    text7.setText("10:45         17:20");
                                    text8.setText("11:20         17:40");
                                    text9.setText("12:40         18:00");
                                    text10.setText("13:05         18:20");
                                    text11.setText("13:25         18:40");
                                    text12.setText("13:45");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:10         14:40");
                                    text2.setText("08:30         15:10");
                                    text3.setText("08:50         15:30");
                                    text4.setText("09:40         15:50");
                                    text5.setText("10:10         16:40");
                                    text6.setText("10:30         17:10");
                                    text7.setText("10:50         17:30");
                                    text8.setText("11:30         17:50");
                                    text9.setText("12:50         18:10");
                                    text10.setText("13:10         18:30");
                                    text11.setText("13:30         18:50");
                                    text12.setText("13:50");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }
                });

                button2.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            if (v.getId() == R.id.button13) {
                                button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                button14.setTextColor(getResources().getColor(R.color.colorText));
                                text1.setText("08:06         14:31");
                                text2.setText("08:26         15:06");
                                text3.setText("08:46         15:26");
                                text4.setText("09:31         15:46");
                                text5.setText("10:06         16:31");
                                text6.setText("10:26         17:01");
                                text7.setText("10:46         17:21");
                                text8.setText("11:21         17:41");
                                text9.setText("12:41         18:01");
                                text10.setText("13:06         18:21");
                                text11.setText("13:26         18:41");
                                text12.setText("13:46");
                            }
                        }
                    });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:11         14:41");
                                    text2.setText("08:31         15:11");
                                    text3.setText("08:51         15:31");
                                    text4.setText("09:41         15:51");
                                    text5.setText("10:11         16:41");
                                    text6.setText("10:31         17:11");
                                    text7.setText("10:51         17:31");
                                    text8.setText("11:31         17:51");
                                    text9.setText("12:51         18:11");
                                    text10.setText("13:11         18:31");
                                    text11.setText("13:31         18:51");
                                    text12.setText("13:51");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        }
                });

                button3.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:07         14:32");
                                    text2.setText("08:27         15:07");
                                    text3.setText("08:47         15:27");
                                    text4.setText("09:32         15:47");
                                    text5.setText("10:07         16:32");
                                    text6.setText("10:27         17:02");
                                    text7.setText("10:47         17:22");
                                    text8.setText("11:22         17:42");
                                    text9.setText("12:42         18:02");
                                    text10.setText("13:07         18:22");
                                    text11.setText("13:27         18:42");
                                    text12.setText("13:47");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:12         14:42");
                                    text2.setText("08:32         15:12");
                                    text3.setText("08:52         15:32");
                                    text4.setText("09:42         15:52");
                                    text5.setText("10:12         16:42");
                                    text6.setText("10:32         17:12");
                                    text7.setText("10:52         17:32");
                                    text8.setText("11:32         17:52");
                                    text9.setText("12:52         18:12");
                                    text10.setText("13:12         18:32");
                                    text11.setText("13:32         18:52");
                                    text12.setText("13:52");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));

                        }
                });

                button4.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                    button13.setOnClickListener(new Button.OnClickListener() {
                        public void onClick(View v) {
                            if (v.getId() == R.id.button13) {
                                button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                button14.setTextColor(getResources().getColor(R.color.colorText));
                                text1.setText("08:08         14:32");
                                text2.setText("08:28         15:08");
                                text3.setText("08:48         15:28");
                                text4.setText("09:33         15:48");
                                text5.setText("10:08         16:33");
                                text6.setText("10:28         17:03");
                                text7.setText("10:48         17:23");
                                text8.setText("11:22         17:43");
                                text9.setText("12:42         18:03");
                                text10.setText("13:08         18:23");
                                text11.setText("13:28         18:43");
                                text12.setText("13:48");
                            }
                        }
                    });

                    button14.setOnClickListener(new Button.OnClickListener(){
                        public void onClick(View v){
                            if(v.getId()==R.id.button14){
                                button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                button13.setTextColor(getResources().getColor(R.color.colorText));
                                button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                text1.setText("08:21         14:51");
                                text2.setText("08:41         15:21");
                                text3.setText("09:01         15:41");
                                text4.setText("09:51         16:01");
                                text5.setText("10:21         16:51");
                                text6.setText("10:41         17:21");
                                text7.setText("11:01         17:41");
                                text8.setText("11:41         18:01");
                                text9.setText("13:01         18:21");
                                text10.setText("13:21         18:41");
                                text11.setText("13:41         19:01");
                                text12.setText("14:01");
                            }}
                    });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }
                });

                button5.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:09         14:34");
                                    text2.setText("08:29         15:09");
                                    text3.setText("08:49         15:29");
                                    text4.setText("09:34         15:49");
                                    text5.setText("10:09         16:34");
                                    text6.setText("10:29         17:04");
                                    text7.setText("10:49         17:24");
                                    text8.setText("11:24         17:44");
                                    text9.setText("12:44         18:04");
                                    text10.setText("13:09         18:24");
                                    text11.setText("13:29         18:44");
                                    text12.setText("13:49");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:20         14:50");
                                    text2.setText("08:40         15:20");
                                    text3.setText("09:00         15:40");
                                    text4.setText("09:50         16:00");
                                    text5.setText("10:20         16:50");
                                    text6.setText("10:40         17:20");
                                    text7.setText("11:00         17:40");
                                    text8.setText("11:40         18:00");
                                    text9.setText("13:00         18:20");
                                    text10.setText("13:20         18:40");
                                    text11.setText("13:40         19:00");
                                    text12.setText("14:00");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }
                });
                button6.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:10         14:35");
                                    text2.setText("08:30         15:10");
                                    text3.setText("08:50         15:30");
                                    text4.setText("09:35         15:50");
                                    text5.setText("10:10         16:35");
                                    text6.setText("10:30         17:05");
                                    text7.setText("10:50         17:25");
                                    text8.setText("11:25         17:45");
                                    text9.setText("12:45         18:05");
                                    text10.setText("13:10         18:25");
                                    text11.setText("13:30         18:45");
                                    text12.setText("13:50");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:19         14:49");
                                    text2.setText("08:39         15:19");
                                    text3.setText("08:59         15:39");
                                    text4.setText("09:49         15:59");
                                    text5.setText("10:19         16:49");
                                    text6.setText("10:39         17:19");
                                    text7.setText("10:59         17:39");
                                    text8.setText("11:29         17:59");
                                    text9.setText("12:49         18:19");
                                    text10.setText("13:19         18:49");
                                    text11.setText("13:39         18:49");
                                    text12.setText("13:59");
                                }}
                        });
                            button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button6.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                            button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                            button12.setBackgroundColor(getResources().getColor(R.color.colorLine));

                        }
                });
                button7.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:11         14:36");
                                    text2.setText("08:31         15:11");
                                    text3.setText("08:51         15:31");
                                    text4.setText("09:36         15:51");
                                    text5.setText("10:11         16:36");
                                    text6.setText("10:31         17:06");
                                    text7.setText("10:51         17:26");
                                    text8.setText("11:26         17:46");
                                    text9.setText("12:46         18:06");
                                    text10.setText("13:11         18:26");
                                    text11.setText("13:31         18:46");
                                    text12.setText("13:51");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:18         14:48");
                                    text2.setText("08:38         15:18");
                                    text3.setText("08:58         15:38");
                                    text4.setText("09:48         15:58");
                                    text5.setText("10:18         16:48");
                                    text6.setText("10:38         17:18");
                                    text7.setText("10:58         17:38");
                                    text8.setText("11:38         17:58");
                                    text9.setText("12:58         18:18");
                                    text10.setText("13:18         18:38");
                                    text11.setText("13:38         18:58");
                                    text12.setText("13:58");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));

                    }
                });
                button8.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:12         14:37");
                                    text2.setText("08:32         15:12");
                                    text3.setText("08:52         15:32");
                                    text4.setText("09:37         15:52");
                                    text5.setText("10:12         16:37");
                                    text6.setText("10:32         17:07");
                                    text7.setText("10:52         17:27");
                                    text8.setText("11:27         17:47");
                                    text9.setText("12:47         18:07");
                                    text10.setText("13:12         18:27");
                                    text11.setText("13:32         18:47");
                                    text12.setText("13:52");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:17         14:47");
                                    text2.setText("08:37         15:17");
                                    text3.setText("08:57         15:37");
                                    text4.setText("09:47         15:57");
                                    text5.setText("10:17         16:47");
                                    text6.setText("10:37         17:17");
                                    text7.setText("10:57         17:37");
                                    text8.setText("11:37         17:5");
                                    text9.setText("12:57         18:17");
                                    text10.setText("13:17         18:37");
                                    text11.setText("13:37         18:57");
                                    text12.setText("13:57");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }
                });
                button9.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:13         14:38");
                                    text2.setText("08:33         15:13");
                                    text3.setText("08:53         15:33");
                                    text4.setText("09:38         15:53");
                                    text5.setText("10:13         16:38");
                                    text6.setText("10:33         17:08");
                                    text7.setText("10:53         17:28");
                                    text8.setText("11:28         17:48");
                                    text9.setText("12:48         18:08");
                                    text10.setText("13:13         18:28");
                                    text11.setText("13:33         18:48");
                                    text12.setText("13:53");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:16         14:41");
                                    text2.setText("08:36         15:16");
                                    text3.setText("08:56         15:36");
                                    text4.setText("09:41         15:56");
                                    text5.setText("10:16         16:41");
                                    text6.setText("10:36         17:11");
                                    text7.setText("10:56         17:31");
                                    text8.setText("11:31         17:51");
                                    text9.setText("12:51         18:11");
                                    text10.setText("13:16         18:31");
                                    text11.setText("13:36         18:51");
                                    text12.setText("13:56");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }

                });
                button10.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:14         14:39");
                                    text2.setText("08:34         15:14");
                                    text3.setText("08:54         15:34");
                                    text4.setText("09:39         15:54");
                                    text5.setText("10:14         16:39");
                                    text6.setText("10:34         17:09");
                                    text7.setText("10:54         17:29");
                                    text8.setText("11:29         17:49");
                                    text9.setText("12:49         18:09");
                                    text10.setText("13:14         18:29");
                                    text11.setText("13:34         18:49");
                                    text12.setText("13:54");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));

                                    text1.setText("08:15         14:40");
                                    text2.setText("08:35         15:15");
                                    text3.setText("08:55         15:35");
                                    text4.setText("09:40         15:55");
                                    text5.setText("10:15         16:40");
                                    text6.setText("10:35         17:10");
                                    text7.setText("10:55         17:30");
                                    text8.setText("11:30         17:50");
                                    text9.setText("12:50         18:10");
                                    text10.setText("13:15         18:30");
                                    text11.setText("13:35         18:50");
                                    text12.setText("13:55");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }

                });
                button11.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));
                                    text1.setText("08:15         14:40");
                                    text2.setText("08:35         15:15");
                                    text3.setText("08:55         15:35");
                                    text4.setText("09:40         15:55");
                                    text5.setText("10:15         16:40");
                                    text6.setText("10:35         17:10");
                                    text7.setText("10:55         17:30");
                                    text8.setText("11:30         17:50");
                                    text9.setText("12:50         18:10");
                                    text10.setText("13:15         18:30");
                                    text11.setText("13:35         18:50");
                                    text12.setText("13:55");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));

                                    text1.setText("08:14         14:44");
                                    text2.setText("08:34         15:14");
                                    text3.setText("08:54         15:34");
                                    text4.setText("09:44         15:54");
                                    text5.setText("10:14         16:44");
                                    text6.setText("10:34         17:14");
                                    text7.setText("10:54         17:34");
                                    text8.setText("11:24         17:54");
                                    text9.setText("12:44         18:14");
                                    text10.setText("13:14         18:34");
                                    text11.setText("13:34         18:54");
                                    text12.setText("13:54");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorLine));
                    }
                });
                button12.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        button13.setOnClickListener(new Button.OnClickListener() {
                            public void onClick(View v) {
                                if (v.getId() == R.id.button13) {
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button13.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button14.setTextColor(getResources().getColor(R.color.colorText));

                                    text1.setText("08:16         14:41");
                                    text2.setText("08:36         15:16");
                                    text3.setText("08:56         15:36");
                                    text4.setText("09:41         15:56");
                                    text5.setText("10:16         16:41");
                                    text6.setText("10:36         17:11");
                                    text7.setText("10:56         17:31");
                                    text8.setText("11:31         17:51");
                                    text9.setText("12:51         18:11");
                                    text10.setText("13:16         18:31");
                                    text11.setText("13:36         18:51");
                                    text12.setText("13:56");
                                }
                            }
                        });

                        button14.setOnClickListener(new Button.OnClickListener(){
                            public void onClick(View v){
                                if(v.getId()==R.id.button14){
                                    button13.setBackgroundColor(getResources().getColor(R.color.colorLine));
                                    button13.setTextColor(getResources().getColor(R.color.colorText));
                                    button14.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                                    button14.setTextColor(getResources().getColor(R.color.colorPrimary));
                                    text1.setText("08:13         14:43");
                                    text2.setText("08:33         15:13");
                                    text3.setText("08:53         15:33");
                                    text4.setText("09:43         15:53");
                                    text5.setText("10:13         16:43");
                                    text6.setText("10:33         17:13");
                                    text7.setText("10:53         17:33");
                                    text8.setText("11:33         17:53");
                                    text9.setText("12:53         18:13");
                                    text10.setText("13:13         18:33");
                                    text11.setText("13:33         18:53");
                                    text12.setText("13:53");
                                }}
                        });
                        button1.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button2.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button3.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button4.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button5.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button6.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button7.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button8.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button9.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button10.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button11.setBackgroundColor(getResources().getColor(R.color.colorLine));
                        button12.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                    }
                });
        return view;
    }
}