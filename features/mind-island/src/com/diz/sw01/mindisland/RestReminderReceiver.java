package com.diz.sw01.mindisland;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

public final class RestReminderReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context,Intent intent){
        if(intent==null)return;
        if(!RestReminderSchedule.ACTION.equals(intent.getAction())){RestReminderSchedule.arm(context);return;}
        if(!RestReminderSchedule.prefs(context).getBoolean("enabled",false))return;
        RestReminderSchedule.prefs(context).edit().remove("next").apply();
        RestReminderSchedule.arm(context);
        JSONObject outcome=WatchReminder.send(context.getPackageName(),true);
        String at=new java.text.SimpleDateFormat("MM/dd HH:mm",java.util.Locale.KOREA).format(new java.util.Date());
        RestReminderSchedule.prefs(context).edit().putString("last",at+" · "+outcome.optString("message")).apply();
    }
}
