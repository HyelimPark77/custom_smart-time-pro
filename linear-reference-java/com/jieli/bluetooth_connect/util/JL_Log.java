package com.jieli.bluetooth_connect.util;

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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class JL_Log {
    private static final String DIR_LOGCAT = "logcat";
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_WARN = 4;
    public static int LOG_FILE_SIZE_LIMIT = 62914560;
    public static int SAVE_LOG_LEVEL = 1;
    private static final String TAG_PREFIX = "bt:";
    private static boolean isLog = true;
    private static boolean isSaveLogFile = false;
    private static ILogOutput logOutput;

    @SuppressLint({"StaticFieldLeak"})
    private static Context mContext;

    @SuppressLint({"StaticFieldLeak"})
    private static SaveLogFileThread mSaveLogFileThread;
    private static String saveLogFilePath;

    @SuppressLint({"ConstantLocale"})
    private static final SimpleDateFormat yyyyMMdd_HHmmssSSS = null;

    public interface ILogOutput {
        void output(String logcat);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public static class SaveLogFileThread extends Thread {
        private long fileSize;
        private volatile boolean isSaving;
        private volatile boolean isWaiting;
        private final Context mContext;
        private FileOutputStream mLogFileOutputStream;
        private final LinkedBlockingQueue<byte[]> mQueue;

        public SaveLogFileThread(Context context) {
            super("SaveLogFileThread");
            this.mQueue = new LinkedBlockingQueue();
            this.mContext = context;
        }

        public static /* synthetic */ boolean access$000(SaveLogFileThread r0) {
            return r0.isSaving;
        }

        private boolean createFile(Context context) {
            if (context != null) goto L6;
            return false;
        L6:
            if (TextUtils.isEmpty(JL_Log.access$200()) == false) goto L14;
            JL_Log.access$202(JL_Log.getSaveLogPath(context));
        L14:
            this.mLogFileOutputStream = new FileOutputStream(JL_Log.access$200() + "/bluetooth_log_app_" + JL_Log.access$300() + ".txt", true);     // Catch: FileNotFoundException -> L11
            this.fileSize = 0;     // Catch: FileNotFoundException -> L11
            return true;
        L11:
            e = move-exception;
            e.printStackTrace();
            return false;
        }

        private void wakeupSaveThread() {
            if (this.isWaiting == false) goto L12;
            LinkedBlockingQueue<byte[]> r0 = this.mQueue;
            monitor-enter(r0);
            this.mQueue.notify();     // Catch: Throwable -> L9
            monitor-exit(r0);     // Catch: Throwable -> L9
            return;
        L9:
            th = move-exception;
            throw th;
        }

        public void addLog(byte[] data) {
            if (data == null) goto L11;
            this.mQueue.put(data);     // Catch: InterruptedException -> L6
            wakeupSaveThread();
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            return;
        }

        public synchronized void closeSaveFile() {
            monitor-enter(this);
            this.isSaving = false;     // Catch: Throwable -> L7
            wakeupSaveThread();     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.isSaving = createFile(this.mContext);
            LinkedBlockingQueue<byte[]> r0 = this.mQueue;
            monitor-enter(r0);
        L43:
        L11:
            th = move-exception;
            throw th;
        L5:
            if (this.isSaving == false) goto L31;
            if (this.mQueue.isEmpty() == true) goto L8;
            this.isWaiting = false;     // Catch: Throwable -> L11
            byte[] r1 = this.mQueue.poll();     // Catch: Throwable -> L11
            if (r1 == null) goto L43;
            FileOutputStream r3 = this.mLogFileOutputStream;     // Catch: Throwable -> L11
            if (r3 == null) goto L43;
            r3.write(r1);     // Catch: Throwable -> L11 IOException -> L21
            this.fileSize += (long) r1.length;     // Catch: Throwable -> L11 IOException -> L21
        L25:
            if (this.fileSize < JL_Log.LOG_FILE_SIZE_LIMIT) goto L43;
            this.mLogFileOutputStream.close();     // Catch: Throwable -> L11 IOException -> L28
        L30:
            this.isSaving = createFile(this.mContext);     // Catch: Throwable -> L11
            goto L31
        L28:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
        L21:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L25
        L8:
            this.isWaiting = true;     // Catch: Throwable -> L11
            this.mQueue.wait();     // Catch: Throwable -> L11 InterruptedException -> L13
        L13:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
        L31:
            monitor-exit(r0);     // Catch: Throwable -> L11
            this.isSaving = false;
            this.isWaiting = false;
            this.mQueue.clear();
            FileOutputStream r2 = this.mLogFileOutputStream;
            if (r2 != null) goto L47;
        L39:
            JL_Log.access$102(null);
            return;
        L47:
            r2.close();     // Catch: IOException -> L36
        L38:
            this.mLogFileOutputStream = null;
        L36:
            e = move-exception;
            e.printStackTrace();
            goto L38
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.fileSize = 0;     // Catch: Throwable -> L11
            if (this.mContext == null) goto L7;
            boolean r0 = true;
        L8:
            this.isSaving = r0;     // Catch: Throwable -> L11
            super.start();     // Catch: Throwable -> L11
            monitor-exit(this);
            return;
        L7:
            r0 = false;
        L11:
            th = move-exception;
            throw th;
        }
    }

    static {
        yyyyMMdd_HHmmssSSS = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.ENGLISH);
    }

    public JL_Log() {
    }

    public static /* synthetic */ SaveLogFileThread access$102(SaveLogFileThread r0) {
        mSaveLogFileThread = r0;
        return r0;
    }

    public static /* synthetic */ String access$200() {
        return saveLogFilePath;
    }

    public static /* synthetic */ String access$202(String r0) {
        saveLogFilePath = r0;
        return r0;
    }

    public static /* synthetic */ String access$300() {
        return currentTimeString();
    }

    public static void addLogOutput(String logcat) {
        if (isSaveLogFile == true) goto L6;
        return;
    L6:
        if (mSaveLogFileThread != null) goto L8;
        openLogFileStream(mContext);
        SystemClock.sleep(20);
    L8:
        mSaveLogFileThread.addLog(logcat.getBytes());
    }

    private static void closeLogFile() {
        SaveLogFileThread r0 = mSaveLogFileThread;
        if (r0 == null) goto L6;
        r0.closeSaveFile();
        mSaveLogFileThread = null;
        return;
    }

    public static String createFilePath(Context context, String... dirNames) {
        if (context == null) goto L28;
        if (dirNames == null) goto L28;
        if (dirNames.length == 0) goto L28;
        File r5 = context.getExternalFilesDir(null);
        if (r5 == null) goto L28;
        if (r5.exists() == false) goto L28;
        StringBuilder r0 = new StringBuilder(r5.getPath());
        int r2 = 0;
        if (r0.toString().endsWith("/") == false) goto L16;
        r0 = new StringBuilder(r0.substring(0, r0.lastIndexOf("/")));
    L16:
        int r6 = dirNames.length;
    L17:
        if (r2 >= r6) goto L27;
        String r3 = dirNames[r2];
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

    private static String currentTimeString() {
        return yyyyMMdd_HHmmssSSS.format(Calendar.getInstance().getTime());
    }

    public static void d(String tag, String content) {
        logFormat(2, tag, content);
    }

    public static void e(String tag, String content) {
        logFormat(5, tag, content);
    }

    private static String formatLog(String level, String tag, String message) {
        StringBuilder r0 = new StringBuilder();
        r0.append(currentTimeString());
        r0.append("   ");
        r0.append(level);
        r0.append("   ");
        if (tag != null) goto L5;
        tag = "null";
    L5:
        r0.append(tag);
        r0.append(" :  ");
        if (message != null) goto L8;
        message = "null";
    L8:
        r0.append(message);
        r0.append("\n");
        return r0.toString();
    }

    private static String formatMethod(String method, String content) {
        return String.format(Locale.ENGLISH, "[%s] >>> %s", new Object[]{method, content});
    }

    private static String formatTag(String tag) {
        return TAG_PREFIX + tag;
    }

    private static String getLevelString(int level) {
        if (level != 1) goto L5;
        return "v";
    L5:
        if (level != 2) goto L7;
        return "d";
    L7:
        if (level != 3) goto L9;
        return CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
    L9:
        if (level != 4) goto L11;
        return "w";
    L11:
        if (level == 5) goto L14;
        return "";
    L14:
        return "e";
    }

    public static boolean getSaveLogFile() {
        return isSaveLogFile;
    }

    public static String getSaveLogPath(Context context) {
        return createFilePath(context, new String[]{"logcat"});
    }

    public static void i(String tag, String content) {
        logFormat(3, tag, content);
    }

    public static boolean isLog() {
        return isLog;
    }

    private static void logFormat(int level, String tag, String content) {
        String r2 = formatTag(tag);
        if (isLog == true) goto L5;
    L20:
        saveLogInFile(level, r2, content);
        return;
    L5:
        if (level != 1) goto L7;
        Log.v(r2, content);
        goto L20
    L7:
        if (level != 2) goto L9;
        Log.d(r2, content);
        goto L20
    L9:
        if (level != 3) goto L11;
        Log.i(r2, content);
        goto L20
    L11:
        if (level != 4) goto L13;
        Log.w(r2, content);
        goto L20
    L13:
        if (level == 5) goto L15;
        return;
    L15:
        Log.e(r2, content);
        goto L20
    }

    private static void openLogFileStream(Context context) {
        SaveLogFileThread r0 = mSaveLogFileThread;
        if (r0 != null) goto L5;
    L8:
        SaveLogFileThread r1 = new SaveLogFileThread(context);
        mSaveLogFileThread = r1;
        r1.start();
        return;
    L5:
        if (SaveLogFileThread.access$000(r0) == false) goto L8;
    }

    private static void saveLogInFile(int level, String tag, String content) {
        String r2 = formatLog(getLevelString(level), tag, content);
        ILogOutput r3 = logOutput;
        if (r3 == null) goto L7;
        r3.output(r2);
        return;
    L7:
        if (level >= SAVE_LOG_LEVEL) goto L9;
        return;
    L9:
        addLogOutput(r2);
    }

    public static void setIsSaveLogFile(boolean isSaveFile, Context context) {
        isSaveLogFile = isSaveFile;
        if (isSaveFile == false) goto L6;
        mContext = context;
        openLogFileStream(context);
        return;
    L6:
        mContext = null;
        closeLogFile();
    }

    public static void setLog(boolean log) {
        isLog = log;
    }

    public static void setLogOutput(ILogOutput logOutput2) {
        logOutput = logOutput2;
    }

    public static void v(String tag, String content) {
        logFormat(1, tag, content);
    }

    public static void w(String tag, String content) {
        logFormat(4, tag, content);
    }

    public static void d(String tag, String method, String content) {
        d(tag, formatMethod(method, content));
    }

    public static void e(String tag, String method, String content) {
        e(tag, formatMethod(method, content));
    }

    public static void i(String tag, String method, String content) {
        i(tag, formatMethod(method, content));
    }

    public static void v(String tag, String method, String content) {
        v(tag, formatMethod(method, content));
    }

    public static void w(String tag, String method, String content) {
        w(tag, formatMethod(method, content));
    }
}
