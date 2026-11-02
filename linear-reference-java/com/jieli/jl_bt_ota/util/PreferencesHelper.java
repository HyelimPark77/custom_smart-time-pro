package com.jieli.jl_bt_ota.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public class PreferencesHelper {
    private static String a = "ji_bluetooth_ota_preferences";

    static {
    }

    public PreferencesHelper() {
    }

    public static String getPreferencesName() {
        return a;
    }

    public static SharedPreferences getSharedPreferences(Context r2) {
        return r2.getSharedPreferences(a, 0);
    }

    public static void putBooleanValue(Context r2, String r3, boolean r4) {
        SharedPreferences.Editor r5 = r2.getSharedPreferences(a, 0).edit();
        r5.putBoolean(r3, r4);
        r5.apply();
    }

    public static void putIntValue(Context r2, String r3, int r4) {
        SharedPreferences.Editor r5 = r2.getSharedPreferences(a, 0).edit();
        r5.putInt(r3, r4);
        r5.apply();
    }

    public static void putLongValue(Context r2, String r3, long r4) {
        SharedPreferences.Editor r5 = r2.getSharedPreferences(a, 0).edit();
        r5.putLong(r3, r4);
        r5.apply();
    }

    public static void putStringSetValue(Context r2, String r3, Set<String> r4) {
        SharedPreferences.Editor r5 = r2.getSharedPreferences(a, 0).edit();
        r5.putStringSet(r3, r4);
        r5.apply();
    }

    public static void putStringValue(Context r2, String r3, String r4) {
        SharedPreferences.Editor r5 = r2.getSharedPreferences(a, 0).edit();
        r5.putString(r3, r4);
        r5.apply();
    }

    public static void remove(Context r2, String r3) {
        SharedPreferences.Editor r4 = r2.getSharedPreferences(a, 0).edit();
        r4.remove(r3);
        r4.apply();
    }

    public void setPreferencesName(String r1) {
        a = r1;
    }
}
