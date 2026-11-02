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

    /* JADX INFO: renamed from: a */
    private static final String f37738a = "ota:";

    /* JADX INFO: renamed from: b */
    private static final String f37739b = "logcat";

    /* JADX INFO: renamed from: c */
    private static boolean f37740c = true;

    /* JADX INFO: renamed from: d */
    private static boolean f37741d = false;

    /* JADX INFO: renamed from: e */
    private static String f37742e = null;

    /* JADX INFO: renamed from: f */
    @SuppressLint({"ConstantLocale"})
    private static final SimpleDateFormat f37743f = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.getDefault());

    /* JADX INFO: renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private static SaveLogFileThread f37744g = null;

    /* JADX INFO: renamed from: h */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f37745h = null;

    /* JADX INFO: renamed from: i */
    private static ILogOutput f37746i = null;
    public static boolean isTest = false;

    public interface ILogOutput {
        void output(String str);
    }

    public static class SaveLogFileThread extends Thread {

        /* JADX INFO: renamed from: a */
        private final LinkedBlockingQueue<byte[]> f37747a;

        /* JADX INFO: renamed from: b */
        private final Context f37748b;

        /* JADX INFO: renamed from: c */
        private volatile boolean f37749c;

        /* JADX INFO: renamed from: d */
        private volatile boolean f37750d;

        /* JADX INFO: renamed from: e */
        private long f37751e;

        /* JADX INFO: renamed from: f */
        private FileOutputStream f37752f;

        public SaveLogFileThread(Context context) {
            super("SaveLogFileThread");
            this.f37747a = new LinkedBlockingQueue<>();
            this.f37748b = context;
        }

        public void addLog(byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f37747a.put(bArr);
                    m27241a();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void closeSaveFile() {
            this.f37750d = false;
            m27241a();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            this.f37750d = m27242a(this.f37748b);
            synchronized (this.f37747a) {
                while (this.f37750d) {
                    if (this.f37747a.isEmpty()) {
                        this.f37749c = true;
                        try {
                            this.f37747a.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f37749c = false;
                        byte[] bArrPoll = this.f37747a.poll();
                        if (bArrPoll != null && (fileOutputStream = this.f37752f) != null) {
                            try {
                                fileOutputStream.write(bArrPoll);
                                this.f37751e += (long) bArrPoll.length;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            if (this.f37751e >= JL_Log.FILE_SIZE_LIMIT) {
                                try {
                                    this.f37752f.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                                this.f37750d = m27242a(this.f37748b);
                            }
                        }
                    }
                }
            }
            this.f37750d = false;
            this.f37749c = false;
            this.f37747a.clear();
            FileOutputStream fileOutputStream2 = this.f37752f;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            SaveLogFileThread unused = JL_Log.f37744g = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f37751e = 0L;
            this.f37750d = this.f37748b != null;
            super.start();
        }

        /* JADX INFO: renamed from: a */
        private void m27241a() {
            if (this.f37749c) {
                synchronized (this.f37747a) {
                    this.f37747a.notify();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private boolean m27242a(Context context) {
            if (context == null) {
                return false;
            }
            if (TextUtils.isEmpty(JL_Log.f37742e)) {
                String unused = JL_Log.f37742e = JL_Log.m27225b(context, "logcat");
            }
            try {
                this.f37752f = new FileOutputStream(JL_Log.f37742e + "/ota_log_app_" + JL_Log.m27230d() + ".txt", true);
                this.f37751e = 0L;
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static void addLogOutput(String str) {
        if (f37741d) {
            if (f37744g == null) {
                m27223a(f37745h);
                SystemClock.sleep(20L);
            }
            SaveLogFileThread saveLogFileThread = f37744g;
            if (saveLogFileThread != null) {
                saveLogFileThread.addLog(str.getBytes());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m27229c(int i, String str, String str2) {
        String strM27221a = m27221a(m27217a(i), str, str2);
        ILogOutput iLogOutput = f37746i;
        if (iLogOutput != null) {
            iLogOutput.output(strM27221a);
        } else {
            if (i < SAVE_LOG_LEVEL) {
                return;
            }
            addLogOutput(strM27221a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m27231d(String str, String str2) {
        m27222a(2, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m27233e(String str, String str2) {
        m27222a(5, str, str2);
    }

    public static boolean getSaveLogFile() {
        return f37741d;
    }

    public static String getSaveLogPath(Context context) {
        return m27225b(context, "logcat");
    }

    /* JADX INFO: renamed from: i */
    public static void m27235i(String str, String str2) {
        m27222a(3, str, str2);
    }

    public static boolean isIsLog() {
        return f37740c;
    }

    public static void setIsSaveLogFile(Context context, boolean z) {
        f37741d = z;
        if (z) {
            m27223a(context);
        } else {
            m27228c();
        }
    }

    public static void setIsTest(boolean z) {
        isTest = z;
    }

    public static void setLog(boolean z) {
        f37740c = z;
    }

    public static void setLogOutput(ILogOutput iLogOutput) {
        f37746i = iLogOutput;
    }

    /* JADX INFO: renamed from: v */
    public static void m27237v(String str, String str2) {
        m27222a(1, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m27239w(String str, String str2) {
        m27222a(4, str, str2);
    }

    /* JADX INFO: renamed from: b */
    private static String m27226b(String str) {
        return f37738a + str;
    }

    /* JADX INFO: renamed from: d */
    public static void m27232d(String str, String str2, String str3) {
        m27231d(str, m27220a(str2, str3));
    }

    /* JADX INFO: renamed from: e */
    public static void m27234e(String str, String str2, String str3) {
        m27233e(str, m27220a(str2, str3));
    }

    /* JADX INFO: renamed from: i */
    public static void m27236i(String str, String str2, String str3) {
        m27235i(str, m27220a(str2, str3));
    }

    /* JADX INFO: renamed from: v */
    public static void m27238v(String str, String str2, String str3) {
        m27237v(str, m27220a(str2, str3));
    }

    /* JADX INFO: renamed from: w */
    public static void m27240w(String str, String str2, String str3) {
        m27239w(str, m27220a(str2, str3));
    }

    /* JADX INFO: renamed from: b */
    private static void m27227b(int i, String str, String str2) {
        System.out.printf(Locale.ENGLISH, "%s\t%s\t%s%n", m27217a(i), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static String m27230d() {
        return f37743f.format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: renamed from: a */
    private static String m27221a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(m27230d());
        sb.append("   ");
        sb.append(str);
        sb.append("   ");
        if (str2 == null) {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(" :  ");
        if (str3 == null) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m27220a(String str, String str2) {
        return String.format(Locale.ENGLISH, "[%s]\t%s", str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m27225b(Context context, String... strArr) {
        File externalFilesDir;
        if (context == null || strArr == null || strArr.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        if (sb.toString().endsWith("/")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf("/")));
        }
        for (String str : strArr) {
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                m27240w("jieli", "createFilePath", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static void m27228c() {
        SaveLogFileThread saveLogFileThread = f37744g;
        if (saveLogFileThread != null) {
            saveLogFileThread.closeSaveFile();
            f37744g = null;
        }
        f37745h = null;
    }

    /* JADX INFO: renamed from: a */
    private static String m27217a(int i) {
        if (i == 1) {
            return "v";
        }
        if (i == 2) {
            return "d";
        }
        if (i == 3) {
            return CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
        }
        if (i == 4) {
            return "w";
        }
        if (i != 5) {
            return "";
        }
        return "e";
    }

    /* JADX INFO: renamed from: a */
    private static void m27222a(int i, String str, String str2) {
        String strM27226b = m27226b(str);
        if (f37740c) {
            if (isTest) {
                m27227b(i, strM27226b, str2);
            } else if (i == 1) {
                Log.v(strM27226b, str2);
            } else if (i == 2) {
                Log.d(strM27226b, str2);
            } else if (i == 3) {
                Log.i(strM27226b, str2);
            } else if (i == 4) {
                Log.w(strM27226b, str2);
            } else if (i != 5) {
                return;
            } else {
                Log.e(strM27226b, str2);
            }
        }
        m27229c(i, strM27226b, str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m27223a(Context context) {
        SaveLogFileThread saveLogFileThread = f37744g;
        if (saveLogFileThread == null || !saveLogFileThread.f37750d) {
            if (f37745h == null) {
                if (context == null) {
                    context = CommonUtil.getMainContext();
                }
                f37745h = context;
            }
            SaveLogFileThread saveLogFileThread2 = new SaveLogFileThread(f37745h);
            f37744g = saveLogFileThread2;
            saveLogFileThread2.start();
        }
    }
}
