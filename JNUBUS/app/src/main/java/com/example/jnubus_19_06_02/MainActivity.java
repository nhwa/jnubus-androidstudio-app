package com.example.jnubus_19_06_02;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // FrameLayout에 각 메뉴의 Fragment를 바꿔 줌
    final FragmentManager FM = getSupportFragmentManager();
    // 4개의 메뉴에 들어갈 Fragment들

    final RoutemapActivity Routemap = new RoutemapActivity();
    final TimeTableActivity Timetable = new TimeTableActivity();
    final NearBusstopActivity NearBusstop = new NearBusstopActivity();
    final NavigationSettingActivity NavigationSetting = new NavigationSettingActivity();
    Fragment active = Routemap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        // 첫 화면 지정
        final FragmentTransaction transaction = FM.beginTransaction();
        FM.beginTransaction().add(R.id.frame_layout, NavigationSetting).hide(NavigationSetting).commit();
        FM.beginTransaction().add(R.id.frame_layout, NearBusstop).hide(NearBusstop).commit();
        FM.beginTransaction().add(R.id.frame_layout, Timetable).hide(Timetable).commit();
        FM.beginTransaction().add(R.id.frame_layout, Routemap).commit();

        // bottomNavigationView의 아이템이 선택될 때 호출될 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_routemap: {
                        FM.beginTransaction().hide(active).show(Routemap).commit();
                        active = Routemap;
                        return true;
                    }
                    case R.id.navigation_timetable: {
                        FM.beginTransaction().hide(active).show(Timetable).commit();
                        active = Timetable;
                        return true;
                    }
                    case R.id.navigation_nearbusstop: {
                        FM.beginTransaction().hide(active).show(NearBusstop).commit();
                        active = NearBusstop;
                        return true;
                    }
                    case R.id.navigation_setting: {
                        transaction.detach(NavigationSetting).attach(NavigationSetting);
                        // GPS허용안될시 스위치 X이게 하기위한
                        FM.beginTransaction().hide(active).show(NavigationSetting).commit();
                        active = NavigationSetting;
                        return true;
                    }
                }


                return true;
            }
        });
    }

}