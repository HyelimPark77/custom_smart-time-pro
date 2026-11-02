package com.jieli.jl_rcsp.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.security.CertificateUtil;
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
    public static String a = "JL";
    public static final String b = "logcat";
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = false;

    @SuppressLint({"StaticFieldLeak"})
    public static Context f = null;
    public static String g = null;

    @SuppressLint({"ConstantLocale"})
    public static final SimpleDateFormat h = null;

    @SuppressLint({"StaticFieldLeak"})
    public static SaveLogFileThread i = null;
    public static boolean isLogCrash = true;
    public static ILogOutput j;

    public interface ILogOutput {
        void output(String r1);
    }

    public static class SaveLogFileThread extends Thread {
        public final LinkedBlockingQueue<byte[]> a;
        public final Context b;
        public volatile boolean c;
        public volatile boolean d;
        public long e;
        public FileOutputStream f;

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

        public final void a() {
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

        public final boolean a(Context r6) {
            if (r6 != null) goto L6;
            return false;
        L6:
            if (TextUtils.isEmpty(JL_Log.a()) == false) goto L14;
            JL_Log.a(JL_Log.getSaveLogPath(r6));
        L14:
            this.f = new FileOutputStream(JL_Log.a() + "/" + JL_Log.b() + JL_Log.c() + ".txt", true);     // Catch: FileNotFoundException -> L11
            this.e = 0;     // Catch: FileNotFoundException -> L11
            return true;
        L11:
            e = move-exception;
            e.printStackTrace();
            return false;
        }
    }

    static {
        h = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.ENGLISH);
    }

    public JL_Log() {
    }

    public static /* synthetic */ SaveLogFileThread a(SaveLogFileThread r0) {
        i = r0;
        return r0;
    }

    public static void addLogOutput(String r2) {
        if (e == false) goto L11;
        if (r2 != null) goto L7;
        return;
    L7:
        if (i != null) goto L9;
        a(f);
        SystemClock.sleep(20);
    L9:
        i.addLog(r2.getBytes());
        return;
    }

    public static /* synthetic */ String b() {
        return f();
    }

    public static /* synthetic */ String c() {
        return e();
    }

    public static void configureLog(Context r0, boolean r1, boolean r2) {
        c = r1;
        e = r2;
        if (r2 == false) goto L13;
        f = r0;
        if (isLogCrash == false) goto L11;
        if (r0 == null) goto L11;
        CrashHandler.getInstance().init(f);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        e.printStackTrace();
    L11:
        a(r0);
        return;
    L13:
        f = null;
        d();
    }

    public static void d(String r1, String r2) {
        a(2, r1, r2);
    }

    public static void e(String r1, String r2) {
        a(5, r1, r2);
    }

    public static String f() {
        if (TextUtils.isEmpty(a) == false) goto L7;
        return "app_log_";
    L7:
        return a + "_log_";
    }

    public static boolean getSaveLogFile() {
        return e;
    }

    public static String getSaveLogPath(Context r1) {
        return a(r1, new String[]{"logcat"});
    }

    public static void i(String r1, String r2) {
        a(3, r1, r2);
    }

    public static boolean isLog() {
        return c;
    }

    public static void setLogOutput(ILogOutput r0) {
        j = r0;
    }

    public static void setTagPrefix(String r0) {
        a = r0;
    }

    public static void setUseTest(boolean r0) {
        d = r0;
    }

    public static void v(String r1, String r2) {
        a(1, r1, r2);
    }

    public static void w(String r1, String r2) {
        a(4, r1, r2);
    }

    public static /* synthetic */ String a() {
        return g;
    }

    public static String b(String r2) {
        return a + CertificateUtil.DELIMITER + r2;
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
        g = r0;
        return r0;
    }

    public static void b(int r1, String r2, String r3) {
        String r4 = a(a(r1), r2, r3);
        ILogOutput r5 = j;
        if (r5 == null) goto L7;
        r5.output(r4);
        return;
    L7:
        if (r1 >= SAVE_LOG_LEVEL) goto L9;
        return;
    L9:
        addLogOutput(r4);
    }

    public static void d() {
        SaveLogFileThread r0 = i;
        if (r0 == null) goto L6;
        r0.closeSaveFile();
        i = null;
        return;
    }

    public static String e() {
        return h.format(Calendar.getInstance().getTime());
    }

    public static void a(Context r1) {
        SaveLogFileThread r0 = i;
        if (r0 != null) goto L5;
    L8:
        SaveLogFileThread r2 = new SaveLogFileThread(r1);
        i = r2;
        r2.start();
        return;
    L5:
        if (SaveLogFileThread.a(r0) == false) goto L8;
    }

    public static String a(String r2, String r3, String r4) {
        StringBuilder r0 = new StringBuilder();
        r0.append(e());
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

    public static String a(String r1, String r2) {
        return String.format(Locale.ENGLISH, "[%s] >>> %s", new Object[]{r1, r2});
    }

    public static String a(int r1) {
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

    public static void a(int r1, String r2, String r3) {
        String r4 = b(r2);
        if (c == true) goto L5;
    L35:
        b(r1, r4, r3);
        return;
    L5:
        if (r1 == 1) goto L32;
        if (r1 == 2) goto L28;
        if (r1 == 3) goto L24;
        if (r1 == 4) goto L20;
        if (r1 == 5) goto L16;
        return;
    L16:
        if (d == false) goto L18;
        TestLog.e(r4, r3);
        goto L35
    L18:
        Log.e(r4, r3);
        goto L35
    L20:
        if (d == false) goto L22;
        TestLog.w(r4, r3);
        goto L35
    L22:
        Log.w(r4, r3);
        goto L35
    L24:
        if (d == false) goto L26;
        TestLog.i(r4, r3);
        goto L35
    L26:
        Log.i(r4, r3);
        goto L35
    L28:
        if (d == false) goto L30;
        TestLog.d(r4, r3);
        goto L35
    L30:
        Log.d(r4, r3);
        goto L35
    L32:
        if (d == false) goto L34;
        TestLog.v(r4, r3);
        goto L35
    L34:
        Log.v(r4, r3);
        goto L35
    }

    public static String a(Context r5, String... r6) {
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
}
