package com.example.jnubus_19_06_02;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

public class SplashActivity extends Activity {
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

            try{
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity( new Intent(this,MainActivity.class));

        finish();


    }
}
