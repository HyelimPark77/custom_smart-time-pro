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
    private static final SimpleDateFormat yyyyMMdd_HHmmssSSS = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.ENGLISH);

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
            this.mQueue = new LinkedBlockingQueue<>();
            this.mContext = context;
        }

        private boolean createFile(Context context) {
            if (context == null) {
                return false;
            }
            if (TextUtils.isEmpty(JL_Log.saveLogFilePath)) {
                String unused = JL_Log.saveLogFilePath = JL_Log.getSaveLogPath(context);
            }
            try {
                this.mLogFileOutputStream = new FileOutputStream(JL_Log.saveLogFilePath + "/bluetooth_log_app_" + JL_Log.currentTimeString() + ".txt", true);
                this.fileSize = 0L;
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }

        private void wakeupSaveThread() {
            if (this.isWaiting) {
                synchronized (this.mQueue) {
                    this.mQueue.notify();
                }
            }
        }

        public void addLog(byte[] data) {
            if (data != null) {
                try {
                    this.mQueue.put(data);
                    wakeupSaveThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void closeSaveFile() {
            this.isSaving = false;
            wakeupSaveThread();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            this.isSaving = createFile(this.mContext);
            synchronized (this.mQueue) {
                while (this.isSaving) {
                    if (this.mQueue.isEmpty()) {
                        this.isWaiting = true;
                        try {
                            this.mQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.isWaiting = false;
                        byte[] bArrPoll = this.mQueue.poll();
                        if (bArrPoll != null && (fileOutputStream = this.mLogFileOutputStream) != null) {
                            try {
                                fileOutputStream.write(bArrPoll);
                                this.fileSize += (long) bArrPoll.length;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            if (this.fileSize >= JL_Log.LOG_FILE_SIZE_LIMIT) {
                                try {
                                    this.mLogFileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                                this.isSaving = createFile(this.mContext);
                                break;
                            }
                        }
                    }
                }
            }
            this.isSaving = false;
            this.isWaiting = false;
            this.mQueue.clear();
            FileOutputStream fileOutputStream2 = this.mLogFileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                this.mLogFileOutputStream = null;
            }
            SaveLogFileThread unused = JL_Log.mSaveLogFileThread = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.fileSize = 0L;
            this.isSaving = this.mContext != null;
            super.start();
        }
    }

    public static void addLogOutput(String logcat) {
        if (isSaveLogFile) {
            if (mSaveLogFileThread == null) {
                openLogFileStream(mContext);
                SystemClock.sleep(20L);
            }
            mSaveLogFileThread.addLog(logcat.getBytes());
        }
    }

    private static void closeLogFile() {
        SaveLogFileThread saveLogFileThread = mSaveLogFileThread;
        if (saveLogFileThread != null) {
            saveLogFileThread.closeSaveFile();
            mSaveLogFileThread = null;
        }
    }

    public static String createFilePath(Context context, String... dirNames) {
        File externalFilesDir;
        if (context == null || dirNames == null || dirNames.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        if (sb.toString().endsWith("/")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf("/")));
        }
        for (String str : dirNames) {
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                m26855w("jieli", "createFilePath", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String currentTimeString() {
        return yyyyMMdd_HHmmssSSS.format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: renamed from: d */
    public static void m26846d(String tag, String content) {
        logFormat(2, tag, content);
    }

    /* JADX INFO: renamed from: e */
    public static void m26848e(String tag, String content) {
        logFormat(5, tag, content);
    }

    private static String formatLog(String level, String tag, String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeString());
        sb.append("   ");
        sb.append(level);
        sb.append("   ");
        if (tag == null) {
            tag = "null";
        }
        sb.append(tag);
        sb.append(" :  ");
        if (message == null) {
            message = "null";
        }
        sb.append(message);
        sb.append("\n");
        return sb.toString();
    }

    private static String formatMethod(String method, String content) {
        return String.format(Locale.ENGLISH, "[%s] >>> %s", method, content);
    }

    private static String formatTag(String tag) {
        return TAG_PREFIX + tag;
    }

    private static String getLevelString(int level) {
        if (level == 1) {
            return "v";
        }
        if (level == 2) {
            return "d";
        }
        if (level == 3) {
            return CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
        }
        if (level != 4) {
            return level != 5 ? "" : "e";
        }
        return "w";
    }

    public static boolean getSaveLogFile() {
        return isSaveLogFile;
    }

    public static String getSaveLogPath(Context context) {
        return createFilePath(context, "logcat");
    }

    /* JADX INFO: renamed from: i */
    public static void m26850i(String tag, String content) {
        logFormat(3, tag, content);
    }

    public static boolean isLog() {
        return isLog;
    }

    private static void logFormat(int level, String tag, String content) {
        String tag2 = formatTag(tag);
        if (isLog) {
            if (level == 1) {
                Log.v(tag2, content);
            } else if (level == 2) {
                Log.d(tag2, content);
            } else if (level == 3) {
                Log.i(tag2, content);
            } else if (level == 4) {
                Log.w(tag2, content);
            } else if (level != 5) {
                return;
            } else {
                Log.e(tag2, content);
            }
        }
        saveLogInFile(level, tag2, content);
    }

    private static void openLogFileStream(Context context) {
        SaveLogFileThread saveLogFileThread = mSaveLogFileThread;
        if (saveLogFileThread == null || !saveLogFileThread.isSaving) {
            SaveLogFileThread saveLogFileThread2 = new SaveLogFileThread(context);
            mSaveLogFileThread = saveLogFileThread2;
            saveLogFileThread2.start();
        }
    }

    private static void saveLogInFile(int level, String tag, String content) {
        String log = formatLog(getLevelString(level), tag, content);
        ILogOutput iLogOutput = logOutput;
        if (iLogOutput != null) {
            iLogOutput.output(log);
        } else {
            if (level < SAVE_LOG_LEVEL) {
                return;
            }
            addLogOutput(log);
        }
    }

    public static void setIsSaveLogFile(boolean isSaveFile, Context context) {
        isSaveLogFile = isSaveFile;
        if (isSaveFile) {
            mContext = context;
            openLogFileStream(context);
        } else {
            mContext = null;
            closeLogFile();
        }
    }

    public static void setLog(boolean log) {
        isLog = log;
    }

    public static void setLogOutput(ILogOutput logOutput2) {
        logOutput = logOutput2;
    }

    /* JADX INFO: renamed from: v */
    public static void m26852v(String tag, String content) {
        logFormat(1, tag, content);
    }

    /* JADX INFO: renamed from: w */
    public static void m26854w(String tag, String content) {
        logFormat(4, tag, content);
    }

    /* JADX INFO: renamed from: d */
    public static void m26847d(String tag, String method, String content) {
        m26846d(tag, formatMethod(method, content));
    }

    /* JADX INFO: renamed from: e */
    public static void m26849e(String tag, String method, String content) {
        m26848e(tag, formatMethod(method, content));
    }

    /* JADX INFO: renamed from: i */
    public static void m26851i(String tag, String method, String content) {
        m26850i(tag, formatMethod(method, content));
    }

    /* JADX INFO: renamed from: v */
    public static void m26853v(String tag, String method, String content) {
        m26852v(tag, formatMethod(method, content));
    }

    /* JADX INFO: renamed from: w */
    public static void m26855w(String tag, String method, String content) {
        m26854w(tag, formatMethod(method, content));
    }
}
