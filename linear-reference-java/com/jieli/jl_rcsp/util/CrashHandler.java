package com.jieli.jl_rcsp.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.ironsource.C2985d4;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final String TAG = "CrashHandler";

    @SuppressLint({"StaticFieldLeak"})
    public static volatile CrashHandler e;
    public Thread.UncaughtExceptionHandler a;
    public Context b;
    public final Map<String, String> c;
    public OnExceptionListener d;

    public interface OnExceptionListener {
        void onException(Throwable r1);
    }

    static {
    }

    public CrashHandler() {
        this.c = new HashMap();
    }

    public static CrashHandler getInstance() {
        if (e != null) goto L16;
        monitor-enter(CrashHandler.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (e != null) goto L11;
        e = new CrashHandler();     // Catch: Throwable -> L9
    L11:
        monitor-exit(CrashHandler.class);     // Catch: Throwable -> L9
    L16:
        return e;
    }

    public final boolean a(Throwable r2) {
        if (r2 != null) goto L5;
        return false;
    L5:
        OnExceptionListener r0 = this.d;
        if (r0 == null) goto L8;
        r0.onException(r2);
    L8:
        a(this.b);
        b(r2);
        return true;
    }

    public final String b(Throwable r5) {
        StringBuilder r0 = new StringBuilder();
        Iterator<Map.Entry<String, String>> r1 = this.c.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        Map.Entry<String, String> r2 = r1.next();
        String r3 = r2.getKey();
        String r4 = r2.getValue();
        r0.append(r3);
        r0.append(C2985d4.j.b);
        r0.append(r4);
        r0.append("\n");
        goto L4
    L6:
        StringWriter r6 = new StringWriter();
        PrintWriter r7 = new PrintWriter(r6);
        r5.printStackTrace(r7);
        Throwable r8 = r5.getCause();
    L7:
        if (r8 == null) goto L9;
        r8.printStackTrace(r7);
        r8 = r8.getCause();
        goto L7
    L9:
        r7.close();
        r0.append(r6.toString());
        JL_Log.e(TAG, "saveCrashInfo2File", r0.toString());
        return null;
    }

    public void init(Context r1) {
        this.b = r1;
        if (this.a != null) goto L6;
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        return;
    }

    public void setOnExceptionListener(OnExceptionListener r1) {
        this.d = r1;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread r3, Throwable r4) {
        if (r3 == null) goto L20;
        if (r4 != null) goto L6;
        return;
    L6:
        if (a(r4) == true) goto L18;
        Thread.UncaughtExceptionHandler r0 = this.a;
        if (r0 == null) goto L18;
        r0.uncaughtException(r3, r4);
        return;
    L18:
        Thread.sleep(3000);     // Catch: InterruptedException -> L14
    L16:
        this.a = null;
        this.b = null;
        Process.killProcess(Process.myPid());
        System.exit(0);
        return;
    L14:
        e = move-exception;
        JL_Log.e(TAG, "uncaughtException", "InterruptedException error : " + a(e));
        goto L16
    }

    public final void a(Context r11) {
        if (r11 != null) goto L30;
        return;
    L30:
        PackageManager r3 = r11.getPackageManager();     // Catch: PackageManager.NameNotFoundException -> L14
        if (r3 == null) goto L29;
        PackageInfo r12 = r3.getPackageInfo(r11.getPackageName(), 1);     // Catch: PackageManager.NameNotFoundException -> L14
        if (r12 == null) goto L19;
        String r4 = r12.versionName;     // Catch: PackageManager.NameNotFoundException -> L14
        if (r4 != null) goto L16;
        r4 = "null";
    L16:
        String r13 = r12.versionCode + "";     // Catch: PackageManager.NameNotFoundException -> L14
        this.c.put("versionName", r4);     // Catch: PackageManager.NameNotFoundException -> L14
        this.c.put("versionCode", r13);     // Catch: PackageManager.NameNotFoundException -> L14
    L19:
        Field[] r14 = Build.class.getDeclaredFields();
        int r5 = r14.length;
        int r6 = 0;
    L20:
        if (r6 >= r5) goto L39;
        Field r7 = r14[r6];
        r7.setAccessible(true);     // Catch: Exception -> L26
        if (r7.get(null) == null) goto L28;
        this.c.put(r7.getName(), r7.get(null).toString());     // Catch: Exception -> L26
        JL_Log.d(TAG, r7.getName(), "" + r7.get(null));     // Catch: Exception -> L26
    L28:
        r6 = r6 + 1;
    L26:
        e = move-exception;
        JL_Log.e(TAG, "collectDeviceInfo", "an error occured when collect crash info : " + a(e));
        goto L28
    L39:
        return;
    L29:
        return;
    L14:
        e = move-exception;
        JL_Log.e(TAG, "collectDeviceInfo", "an error occured when collect package info : " + a(e));
        goto L19
    }

    public final String a(Exception r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return r1.toString();
    }
}
