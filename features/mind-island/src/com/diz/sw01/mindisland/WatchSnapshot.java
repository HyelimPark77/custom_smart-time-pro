package com.diz.sw01.mindisland;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Calendar;
import java.util.List;

/** Read-only adapter to the same Room DAOs used by the native health cards.
 * No BLE commands, database mutations, test-data methods, or network requests. */
final class WatchSnapshot {
    private static Object call(Object object, String method) throws Exception {
        return object.getClass().getMethod(method).invoke(object);
    }
    private static long number(Object object, String method) throws Exception {
        return ((Number) call(object, method)).longValue();
    }
    private static Object range(Object dao, String method, long start, long end) throws Exception {
        return dao.getClass().getMethod(method, long.class, long.class).invoke(dao, start, end);
    }
    private static long boundary(int offset) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0); c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0); c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, offset); return c.getTimeInMillis();
    }
    static JSONObject read() {
        JSONObject out = new JSONObject();
        long now = System.currentTimeMillis();
        try {
            out.put("readAt", now).put("day", new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).format(new java.util.Date(now)));
            Class<?> myDb = Class.forName("com.sma.smartv3.db.MyDb");
            Object db = call(myDb.getField("INSTANCE").get(null), "getMDatabase");
            Object activity = call(db, "activityDao");
            try {
                Object row = range(activity, "getActivity", boundary(0), boundary(1));
                if (row != null) out.put("steps", number(row, "getMStep")).put("stepsAt", number(row, "getMTime"));
                JSONArray history = new JSONArray();
                for (int i = -7; i < 0; i++) {
                    Object past = range(activity, "getActivity", boundary(i), boundary(i + 1));
                    if (past != null) history.put(number(past, "getMStep"));
                }
                out.put("previousSteps", history);
            } catch (Exception ignored) { out.put("stepsError", true); }
            try {
                Object hr = call(call(db, "heartRateDao"), "getLastHeartRate");
                if (hr != null) out.put("heartRate", number(hr, "getMBpm")).put("heartRateAt", number(hr, "getMTime"));
            } catch (Exception ignored) { out.put("heartRateError", true); }
            try {
                // Use the existing sleep parser and native card's overnight window.
                Class<?> time = Class.forName("com.android.mltcode.paycertificationapi.O0X11OiO");
                long shift = ((Number) time.getField("iXiX011").get(null)).longValue();
                boolean allDay = false;
                try {
                    Class<?> flags = Class.forName("com.android.mltcode.paycertificationapi.q62");
                    allDay = (Boolean) call(flags.getField("OXO1").get(null), "IiXIIX1O1");
                } catch (Exception ignored) { }
                long start = boundary(0) - (allDay ? 0 : shift), end = boundary(1) - (allDay ? 0 : shift);
                List<?> rows = (List<?>) range(call(db, "sleepDao"), "getSleeps", start, end);
                if (!rows.isEmpty()) {
                    Class<?> parser = Class.forName("com.sma.smartv3.model." + (allDay ? "SleepAllDayDataParse" : "SleepDataParse"));
                    Object instance = parser.getField("INSTANCE").get(null);
                    Object parsed;
                    if (allDay) parsed = parser.getMethod("filterData", List.class, float.class, List.class, long.class).invoke(instance, rows, 100f, null, start);
                    else parsed = parser.getMethod("filterData", List.class, float.class, List.class).invoke(instance, rows, 100f, null);
                    long minutes = number(parsed, "getTotal");
                    if (minutes >= 60 && minutes <= 1440) out.put("sleepMinutes", minutes);
                }
            } catch (Exception ignored) { out.put("sleepError", true); }
            out.put("ok", true);
        } catch (Exception ignored) {
            try { out.put("ok", false).put("readError", ignored.getClass().getSimpleName()); } catch (Exception impossible) { }
        }
        return out;
    }
}
