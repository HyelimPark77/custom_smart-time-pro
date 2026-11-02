package com.jieli.jl_bt_ota.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.base.BaseError;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class CommonUtil {

    @SuppressLint({"StaticFieldLeak"})
    private static WeakReference<Context> a = null;
    public static final boolean isSupportAndroid12 = true;

    public CommonUtil() {
    }

    private static void a() {
        WeakReference<Context> r0 = a;
        if (r0 == null) goto L6;
        r0.clear();
        System.gc();
        return;
    }

    public static <T> void callbackError(String r1, String r2, IActionCallback<T> r3, BaseError r4) {
        if (r4 == null) goto L9;
        JL_Log.w(r1, r2, r4.toString());
        if (r3 == null) goto L8;
        r3.onError(r4);
        return;
    L8:
        return;
    }

    public static void checkAllNotNull(Object... r3) {
        int r0 = r3.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r3[r1].getClass();
        r1 = r1 + 1;
        goto L3
    }

    public static boolean checkHasConnectPermission(Context r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return true;
    L5:
        return checkHasPermission(r2, "android.permission.BLUETOOTH_CONNECT");
    }

    public static boolean checkHasLocationPermission(Context r3) {
        if (Build.VERSION.SDK_INT < 31) goto L6;
        return true;
    L6:
        if (checkHasPermission(r3, "android.permission.ACCESS_FINE_LOCATION") == false) goto L8;
    L12:
        return true;
    L8:
        if (checkHasPermission(r3, "android.permission.ACCESS_COARSE_LOCATION") == true) goto L12;
        return false;
    }

    public static boolean checkHasPermission(Context r1, String r2) {
        if (r1 != null) goto L6;
        return false;
    L6:
        if (ContextCompat.checkSelfPermission(r1, r2) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean checkHasScanPermission(Context r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return true;
    L5:
        return checkHasPermission(r2, "android.permission.BLUETOOTH_SCAN");
    }

    public static <T> T checkNotNull(T r0) {
        r0.getClass();
        return r0;
    }

    public static String formatInt(int r1) {
        return formatString("%d(0x%X)", new Object[]{Integer.valueOf(r1), Integer.valueOf(r1)});
    }

    public static String formatString(String r1, Object... r2) {
        return String.format(Locale.ENGLISH, r1, r2);
    }

    public static long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static Context getMainContext() {
        WeakReference<Context> r0 = a;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.get();
    }

    public static void setMainContext(Context r1) {
        a = new WeakReference((Context) checkNotNull(r1));
    }

    public static <T> T checkNotNull(T r0, String r1) {
        if (r0 == null) goto L5;
        return r0;
    L5:
        throw new NullPointerException(r1);
    }
}
