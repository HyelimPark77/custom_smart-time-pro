package com.jieli.jl_bt_ota.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class JL_Log {
    public static long FILE_SIZE_LIMIT = 314572800;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_WARN = 4;
    public static int SAVE_LOG_LEVEL = 1;
    private static final String a = "ota:";
    private static final String b = "logcat";
    private static boolean c = true;
    private static boolean d = false;
    private static String e = null;

    @SuppressLint({"ConstantLocale"})
    private static final SimpleDateFormat f = null;

    @SuppressLint({"StaticFieldLeak"})
    private static SaveLogFileThread g = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context h = null;
    private static ILogOutput i = null;
    public static boolean isTest = false;

    public interface ILogOutput {
        void output(String r1);
    }

    public static class SaveLogFileThread extends Thread {
        private final LinkedBlockingQueue<byte[]> a;
        private final Context b;
        private volatile boolean c;
        private volatile boolean d;
        private long e;
        private FileOutputStream f;

        public SaveLogFileThread(Context r2) {
            super("SaveLogFileThread");
            this.a = new LinkedBlockingQueue();
            this.b = r2;
        }

        public static /* synthetic */ boolean a(SaveLogFileThread r0) {
            return r0.d;
        }

        public void addLog(byte[] r2) {
            if (r2 == null) goto L11;
            this.a.put(r2);     // Catch: InterruptedException -> L6
            a();
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            return;
        }

        public synchronized void closeSaveFile() {
            monitor-enter(this);
            this.d = false;     // Catch: Throwable -> L7
            a();     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.d = a(this.b);
            LinkedBlockingQueue<byte[]> r0 = this.a;
            monitor-enter(r0);
        L42:
        L11:
            th = move-exception;
            throw th;
        L5:
            if (this.d == false) goto L31;
            if (this.a.isEmpty() == true) goto L8;
            this.c = false;     // Catch: Throwable -> L11
            byte[] r1 = this.a.poll();     // Catch: Throwable -> L11
            if (r1 == null) goto L42;
            FileOutputStream r2 = this.f;     // Catch: Throwable -> L11
            if (r2 == null) goto L42;
            r2.write(r1);     // Catch: Throwable -> L11 IOException -> L21
            this.e += (long) r1.length;     // Catch: Throwable -> L11 IOException -> L21
        L25:
            if (this.e < JL_Log.FILE_SIZE_LIMIT) goto L42;
            this.f.close();     // Catch: Throwable -> L11 IOException -> L28
        L30:
            this.d = a(this.b);     // Catch: Throwable -> L11
            goto L42
        L28:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
        L21:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L25
        L8:
            this.c = true;     // Catch: Throwable -> L11
            this.a.wait();     // Catch: Throwable -> L11 InterruptedException -> L13
        L13:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L42
        L31:
            monitor-exit(r0);     // Catch: Throwable -> L11
            this.d = false;
            this.c = false;
            this.a.clear();
            FileOutputStream r3 = this.f;
            if (r3 != null) goto L50;
        L38:
            JL_Log.a(null);
            return;
        L50:
            r3.close();     // Catch: IOException -> L36
        L36:
            e = move-exception;
            e.printStackTrace();
            goto L38
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.e = 0;     // Catch: Throwable -> L11
            if (this.b == null) goto L7;
            boolean r0 = true;
        L8:
            this.d = r0;     // Catch: Throwable -> L11
            super.start();     // Catch: Throwable -> L11
            monitor-exit(this);
            return;
        L7:
            r0 = false;
        L11:
            th = move-exception;
            throw th;
        }

        private void a() {
            if (this.c == false) goto L12;
            LinkedBlockingQueue<byte[]> r0 = this.a;
            monitor-enter(r0);
            this.a.notify();     // Catch: Throwable -> L9
            monitor-exit(r0);     // Catch: Throwable -> L9
            return;
        L9:
            th = move-exception;
            throw th;
        }

        private boolean a(Context r6) {
            if (r6 != null) goto L6;
            return false;
        L6:
            if (TextUtils.isEmpty(JL_Log.a()) == false) goto L14;
            JL_Log.a(JL_Log.a(r6, new String[]{"logcat"}));
        L14:
            this.f = new FileOutputStream(JL_Log.a() + "/ota_log_app_" + JL_Log.b() + ".txt", true);     // Catch: FileNotFoundException -> L11
            this.e = 0;     // Catch: FileNotFoundException -> L11
            return true;
        L11:
            e = move-exception;
            e.printStackTrace();
            return false;
        }
    }

    static {
        f = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.getDefault());
    }

    public JL_Log() {
    }

    public static /* synthetic */ SaveLogFileThread a(SaveLogFileThread r0) {
        g = r0;
        return r0;
    }

    public static void addLogOutput(String r2) {
        if (d == true) goto L6;
        return;
    L6:
        if (g != null) goto L8;
        a(h);
        SystemClock.sleep(20);
    L8:
        SaveLogFileThread r0 = g;
        if (r0 == null) goto L12;
        r0.addLog(r2.getBytes());
        return;
    }

    public static /* synthetic */ String b() {
        return d();
    }

    private static void c(int r1, String r2, String r3) {
        String r4 = a(a(r1), r2, r3);
        ILogOutput r5 = i;
        if (r5 == null) goto L7;
        r5.output(r4);
        return;
    L7:
        if (r1 >= SAVE_LOG_LEVEL) goto L9;
        return;
    L9:
        addLogOutput(r4);
    }

    public static void d(String r1, String r2) {
        a(2, r1, r2);
    }

    public static void e(String r1, String r2) {
        a(5, r1, r2);
    }

    public static boolean getSaveLogFile() {
        return d;
    }

    public static String getSaveLogPath(Context r1) {
        return b(r1, new String[]{"logcat"});
    }

    public static void i(String r1, String r2) {
        a(3, r1, r2);
    }

    public static boolean isIsLog() {
        return c;
    }

    public static void setIsSaveLogFile(Context r0, boolean r1) {
        d = r1;
        if (r1 == false) goto L6;
        a(r0);
        return;
    L6:
        c();
    }

    public static void setIsTest(boolean r0) {
        isTest = r0;
    }

    public static void setLog(boolean r0) {
        c = r0;
    }

    public static void setLogOutput(ILogOutput r0) {
        i = r0;
    }

    public static void v(String r1, String r2) {
        a(1, r1, r2);
    }

    public static void w(String r1, String r2) {
        a(4, r1, r2);
    }

    public static /* synthetic */ String a() {
        return e;
    }

    private static String b(String r2) {
        return a + r2;
    }

    public static void d(String r0, String r1, String r2) {
        d(r0, a(r1, r2));
    }

    public static void e(String r0, String r1, String r2) {
        e(r0, a(r1, r2));
    }

    public static void i(String r0, String r1, String r2) {
        i(r0, a(r1, r2));
    }

    public static void v(String r0, String r1, String r2) {
        v(r0, a(r1, r2));
    }

    public static void w(String r0, String r1, String r2) {
        w(r0, a(r1, r2));
    }

    public static /* synthetic */ String a(String r0) {
        e = r0;
        return r0;
    }

    private static void b(int r2, String r3, String r4) {
        System.out.printf(Locale.ENGLISH, "%s\t%s\t%s%n", new Object[]{a(r2), r3, r4});
    }

    private static String d() {
        return f.format(Calendar.getInstance().getTime());
    }

    public static /* synthetic */ String a(Context r0, String[] r1) {
        return b(r0, r1);
    }

    private static String a(String r2, String r3, String r4) {
        StringBuilder r0 = new StringBuilder();
        r0.append(d());
        r0.append("   ");
        r0.append(r2);
        r0.append("   ");
        if (r3 != null) goto L5;
        r3 = "null";
    L5:
        r0.append(r3);
        r0.append(" :  ");
        if (r4 != null) goto L8;
        r4 = "null";
    L8:
        r0.append(r4);
        r0.append("\n");
        return r0.toString();
    }

    private static String a(String r1, String r2) {
        return String.format(Locale.ENGLISH, "[%s]\t%s", new Object[]{r1, r2});
    }

    private static String b(Context r5, String... r6) {
        if (r5 == null) goto L28;
        if (r6 == null) goto L28;
        if (r6.length == 0) goto L28;
        File r7 = r5.getExternalFilesDir(null);
        if (r7 == null) goto L28;
        if (r7.exists() == false) goto L28;
        StringBuilder r0 = new StringBuilder(r7.getPath());
        int r2 = 0;
        if (r0.toString().endsWith("/") == false) goto L16;
        r0 = new StringBuilder(r0.substring(0, r0.lastIndexOf("/")));
    L16:
        int r8 = r6.length;
    L17:
        if (r2 >= r8) goto L27;
        String r3 = r6[r2];
        r0.append("/");
        r0.append(r3);
        File r4 = new File(r0.toString());
        if (r4.exists() == false) goto L23;
        if (r4.isFile() == true) goto L23;
    L25:
        r2 = r2 + 1;
    L23:
        if (r4.mkdir() == true) goto L25;
        w("jieli", "createFilePath", "create dir failed. filePath = " + r0);
    L27:
        return r0.toString();
    L28:
        return null;
    }

    private static void c() {
        SaveLogFileThread r0 = g;
        if (r0 == null) goto L5;
        r0.closeSaveFile();
        g = null;
    L5:
        h = null;
    }

    private static String a(int r1) {
        if (r1 != 1) goto L5;
        return "v";
    L5:
        if (r1 != 2) goto L7;
        return "d";
    L7:
        if (r1 != 3) goto L9;
        return CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
    L9:
        if (r1 != 4) goto L11;
        return "w";
    L11:
        if (r1 == 5) goto L14;
        return "";
    L14:
        return "e";
    }

    private static void a(int r1, String r2, String r3) {
        String r4 = b(r2);
        if (c == true) goto L5;
    L23:
        c(r1, r4, r3);
        return;
    L5:
        if (isTest == false) goto L8;
        b(r1, r4, r3);
        goto L23
    L8:
        if (r1 != 1) goto L10;
        Log.v(r4, r3);
        goto L23
    L10:
        if (r1 != 2) goto L12;
        Log.d(r4, r3);
        goto L23
    L12:
        if (r1 != 3) goto L14;
        Log.i(r4, r3);
        goto L23
    L14:
        if (r1 != 4) goto L16;
        Log.w(r4, r3);
        goto L23
    L16:
        if (r1 == 5) goto L18;
        return;
    L18:
        Log.e(r4, r3);
        goto L23
    }

    private static void a(Context r1) {
        SaveLogFileThread r0 = g;
        if (r0 == null) goto L9;
        if (SaveLogFileThread.a(r0) == false) goto L9;
        return;
    L9:
        if (h != null) goto L13;
        if (r1 != null) goto L12;
        r1 = CommonUtil.getMainContext();
    L12:
        h = r1;
    L13:
        SaveLogFileThread r2 = new SaveLogFileThread(h);
        g = r2;
        r2.start();
    }
}
