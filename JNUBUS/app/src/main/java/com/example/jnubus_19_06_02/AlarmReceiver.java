package com.example.jnubus_19_06_02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.Calendar;

public class AlarmReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle extra = intent.getExtras();
        if (extra != null)
        {
            boolean isOneTime = extra.getBoolean("one_time");
            if (isOneTime)
            {
//                AlarmDataManager.getInstance().setAlarmEnable(context, false);
                // 알람 울리기.
            }
            else
            {
                boolean[] week = extra.getBooleanArray("day_of_week");

                Calendar cal = Calendar.getInstance();

                if (!week[cal.get(Calendar.DAY_OF_WEEK)])
                    return;

                // 알람 울리기.
            }
        }
    }
}