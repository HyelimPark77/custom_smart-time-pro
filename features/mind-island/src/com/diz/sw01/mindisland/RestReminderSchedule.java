package com.diz.sw01.mindisland;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Calendar;
import org.json.JSONObject;

final class RestReminderSchedule {
    static final String ACTION="com.diz.sw01.mindisland.REST_REMINDER";
    static SharedPreferences prefs(Context c){return c.getSharedPreferences("mind-island-reminder",Context.MODE_PRIVATE);}
    static boolean permitted(Context c){return Build.VERSION.SDK_INT<31||c.getSystemService(AlarmManager.class).canScheduleExactAlarms();}
    private static PendingIntent intent(Context c){return PendingIntent.getBroadcast(c,731,new Intent(c,RestReminderReceiver.class).setAction(ACTION),PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);}
    static long next(int hour,int minute,long now){
        Calendar day=Calendar.getInstance();day.setTimeInMillis(now);day.set(Calendar.HOUR_OF_DAY,hour);day.set(Calendar.MINUTE,minute);day.set(Calendar.SECOND,0);day.set(Calendar.MILLISECOND,0);
        if(day.getTimeInMillis()<=now)day.add(Calendar.DAY_OF_YEAR,1);
        return day.getTimeInMillis();
    }
    static void arm(Context c){
        SharedPreferences p=prefs(c);if(!p.getBoolean("enabled",false))return;
        if(!permitted(c)){p.edit().putBoolean("enabled",false).putString("last","예약 권한이 꺼져 있어 알림을 중지했어요.").apply();return;}
        long now=System.currentTimeMillis();
        long saved=p.getLong("next",0);
        long at="interval".equals(p.getString("mode","daily"))?(saved>now?saved:now+p.getInt("interval",30)*60000L):next(p.getInt("hour",15),p.getInt("minute",0),now);
        try{c.getSystemService(AlarmManager.class).setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP,at,intent(c));p.edit().putLong("next",at).apply();}
        catch(SecurityException e){p.edit().putBoolean("enabled",false).putString("last","예약 권한을 확인한 뒤 다시 저장해 주세요.").apply();}
    }
    static JSONObject configure(Context c,String time,boolean enabled,String mode,int interval){
        if(!enabled){c.getSystemService(AlarmManager.class).cancel(intent(c));prefs(c).edit().putBoolean("enabled",false).remove("next").apply();return status(c);}
        if(!"daily".equals(mode)&&!"interval".equals(mode))return message("예약 방식을 선택해 주세요.");
        if("interval".equals(mode)&&!java.util.Arrays.asList(10,15,20,30,60,120).contains(interval))return message("반복 간격을 선택해 주세요.");
        if(time==null||!time.matches("(?:[01][0-9]|2[0-3]):[0-5][0-9]"))return message("알림 시각을 선택해 주세요.");
        if(!permitted(c))return message("먼저 ‘예약 알림 권한 설정’에서 허용한 뒤 다시 저장해 주세요.");
        prefs(c).edit().putInt("hour",Integer.parseInt(time.substring(0,2))).putInt("minute",Integer.parseInt(time.substring(3))).putString("mode",mode).putInt("interval",interval).remove("next").putBoolean("enabled",true).apply();arm(c);return status(c);
    }
    static JSONObject status(Context c){
        SharedPreferences p=prefs(c);JSONObject out=message(p.getBoolean("enabled",false)?("interval".equals(p.getString("mode","daily"))?p.getInt("interval",30)+"분마다 쉼 알림을 요청해요.":"매일 선택한 시각에 쉼 알림을 요청해요."):"예약 알림이 꺼져 있어요.");
        try{out.put("mode",p.getString("mode","daily")).put("interval",p.getInt("interval",30));}catch(Exception ignored){}
        try{out.put("enabled",p.getBoolean("enabled",false)).put("time",String.format(java.util.Locale.US,"%02d:%02d",p.getInt("hour",15),p.getInt("minute",0))).put("permitted",permitted(c)).put("next",p.getLong("next",0)).put("last",p.getString("last",""));}catch(Exception ignored){}return out;
    }
    private static JSONObject message(String text){JSONObject out=new JSONObject();try{out.put("message",text);}catch(Exception ignored){}return out;}
}
