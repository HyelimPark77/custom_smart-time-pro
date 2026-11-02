package com.jieli.bluetooth_connect.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class ConnectUtil {
    public static final boolean isSupportAndroid12 = true;

    @SuppressLint({"StaticFieldLeak"})
    private static WeakReference<Context> sContextWeak;

    public ConnectUtil() {
    }

    public static void checkAllNotNull(Object... references) {
        int r0 = references.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        references[r1].getClass();
        r1 = r1 + 1;
        goto L3
    }

    public static <T> T checkNotNull(T obj) {
        obj.getClass();
        return obj;
    }

    public static String formatString(String format, Object... args) {
        return String.format(Locale.ENGLISH, format, args);
    }

    public static Context getContext() {
        WeakReference<Context> r0 = sContextWeak;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.get();
    }

    public static long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static boolean isHasConnectPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return true;
    L5:
        return isHasPermission(context, "android.permission.BLUETOOTH_CONNECT");
    }

    public static boolean isHasLocationPermission(Context context) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return true;
    L7:
        return isHasPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public static boolean isHasPermission(Context context, String permission) {
        if (context != null) goto L4;
        return false;
    L4:
        if (ContextCompat.checkSelfPermission(context, permission) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean isHasScanPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return true;
    L5:
        return isHasPermission(context, "android.permission.BLUETOOTH_SCAN");
    }

    public static boolean isHasStoragePermission(Context context) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 28) goto L20;
        if (r0 < 33) goto L18;
        if (isHasPermission(context, "android.permission.READ_MEDIA_IMAGES") == false) goto L9;
    L16:
        return true;
    L9:
        if (isHasPermission(context, "android.permission.READ_MEDIA_AUDIO") == true) goto L16;
        if (isHasPermission(context, "android.permission.READ_MEDIA_VIDEO") == true) goto L16;
        if (isHasPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == true) goto L16;
        return false;
    L18:
        return isHasPermission(context, "android.permission.READ_EXTERNAL_STORAGE");
    L20:
        if (isHasPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == true) goto L22;
    L24:
        return false;
    L22:
        if (isHasPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L24;
        return true;
    }

    public static void setContext(Context context) {
        sContextWeak = new WeakReference(context);
    }

    public static <T> T checkNotNull(T obj, String errMsg) {
        if (obj == null) goto L5;
        return obj;
    L5:
        throw new NullPointerException(errMsg);
    }
}
