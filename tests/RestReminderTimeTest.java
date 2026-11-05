package com.diz.sw01.mindisland;
import java.util.Calendar;
import java.util.TimeZone;
public final class RestReminderTimeTest {
    private static long at(int year,int month,int day,int hour,int minute){Calendar c=Calendar.getInstance();c.clear();c.set(year,month-1,day,hour,minute,0);return c.getTimeInMillis();}
    private static void same(long actual,long expected){if(actual!=expected)throw new AssertionError(actual+" != "+expected);}
    public static void main(String[] args){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        same(RestReminderSchedule.next(15,0,at(2026,11,5,14,59)),at(2026,11,5,15,0));
        same(RestReminderSchedule.next(15,0,at(2026,11,5,15,0)),at(2026,11,6,15,0));
        same(RestReminderSchedule.next(0,1,at(2026,12,31,23,59)),at(2027,1,1,0,1));
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        same(RestReminderSchedule.next(15,0,at(2026,10,31,16,0)),at(2026,11,1,15,0));
        System.out.println("Daily reminder time: same day, next day, year boundary and DST wall-clock passed.");
    }
}
