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

    /* JADX INFO: renamed from: a */
    public static String f38356a = "JL";

    /* JADX INFO: renamed from: b */
    public static final String f38357b = "logcat";

    /* JADX INFO: renamed from: c */
    public static boolean f38358c = true;

    /* JADX INFO: renamed from: d */
    public static boolean f38359d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f38360e = false;

    /* JADX INFO: renamed from: f */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f38361f = null;

    /* JADX INFO: renamed from: g */
    public static String f38362g = null;

    /* JADX INFO: renamed from: h */
    @SuppressLint({"ConstantLocale"})
    public static final SimpleDateFormat f38363h = new SimpleDateFormat("yyyyMMddHHmmss.SSS", Locale.ENGLISH);

    /* JADX INFO: renamed from: i */
    @SuppressLint({"StaticFieldLeak"})
    public static SaveLogFileThread f38364i = null;
    public static boolean isLogCrash = true;

    /* JADX INFO: renamed from: j */
    public static ILogOutput f38365j;

    public interface ILogOutput {
        void output(String str);
    }

    public static class SaveLogFileThread extends Thread {

        /* JADX INFO: renamed from: a */
        public final LinkedBlockingQueue<byte[]> f38366a;

        /* JADX INFO: renamed from: b */
        public final Context f38367b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f38368c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f38369d;

        /* JADX INFO: renamed from: e */
        public long f38370e;

        /* JADX INFO: renamed from: f */
        public FileOutputStream f38371f;

        public SaveLogFileThread(Context context) {
            super("SaveLogFileThread");
            this.f38366a = new LinkedBlockingQueue<>();
            this.f38367b = context;
        }

        public void addLog(byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f38366a.put(bArr);
                    m27889a();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void closeSaveFile() {
            this.f38369d = false;
            m27889a();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            this.f38369d = m27890a(this.f38367b);
            synchronized (this.f38366a) {
                while (this.f38369d) {
                    if (this.f38366a.isEmpty()) {
                        this.f38368c = true;
                        try {
                            this.f38366a.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f38368c = false;
                        byte[] bArrPoll = this.f38366a.poll();
                        if (bArrPoll != null && (fileOutputStream = this.f38371f) != null) {
                            try {
                                fileOutputStream.write(bArrPoll);
                                this.f38370e += (long) bArrPoll.length;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            if (this.f38370e >= JL_Log.FILE_SIZE_LIMIT) {
                                try {
                                    this.f38371f.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                                this.f38369d = m27890a(this.f38367b);
                            }
                        }
                    }
                }
            }
            this.f38369d = false;
            this.f38368c = false;
            this.f38366a.clear();
            FileOutputStream fileOutputStream2 = this.f38371f;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            SaveLogFileThread unused = JL_Log.f38364i = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f38370e = 0L;
            this.f38369d = this.f38367b != null;
            super.start();
        }

        /* JADX INFO: renamed from: a */
        public final void m27889a() {
            if (this.f38368c) {
                synchronized (this.f38366a) {
                    this.f38366a.notify();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m27890a(Context context) {
            if (context == null) {
                return false;
            }
            if (TextUtils.isEmpty(JL_Log.f38362g)) {
                String unused = JL_Log.f38362g = JL_Log.getSaveLogPath(context);
            }
            try {
                this.f38371f = new FileOutputStream(JL_Log.f38362g + "/" + JL_Log.m27881f() + JL_Log.m27878e() + ".txt", true);
                this.f38370e = 0L;
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static void addLogOutput(String str) {
        if (!f38360e || str == null) {
            return;
        }
        if (f38364i == null) {
            m27870a(f38361f);
            SystemClock.sleep(20L);
        }
        f38364i.addLog(str.getBytes());
    }

    public static void configureLog(Context context, boolean z, boolean z2) {
        f38358c = z;
        f38360e = z2;
        if (!z2) {
            f38361f = null;
            m27875d();
            return;
        }
        f38361f = context;
        if (isLogCrash && context != null) {
            try {
                CrashHandler.getInstance().init(f38361f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m27870a(context);
    }

    /* JADX INFO: renamed from: d */
    public static void m27876d(String str, String str2) {
        m27869a(2, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m27879e(String str, String str2) {
        m27869a(5, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static String m27881f() {
        if (TextUtils.isEmpty(f38356a)) {
            return "app_log_";
        }
        return f38356a + "_log_";
    }

    public static boolean getSaveLogFile() {
        return f38360e;
    }

    public static String getSaveLogPath(Context context) {
        return m27865a(context, "logcat");
    }

    /* JADX INFO: renamed from: i */
    public static void m27882i(String str, String str2) {
        m27869a(3, str, str2);
    }

    public static boolean isLog() {
        return f38358c;
    }

    public static void setLogOutput(ILogOutput iLogOutput) {
        f38365j = iLogOutput;
    }

    public static void setTagPrefix(String str) {
        f38356a = str;
    }

    public static void setUseTest(boolean z) {
        f38359d = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m27884v(String str, String str2) {
        m27869a(1, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m27886w(String str, String str2) {
        m27869a(4, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static String m27872b(String str) {
        return f38356a + CertificateUtil.DELIMITER + str;
    }

    /* JADX INFO: renamed from: d */
    public static void m27877d(String str, String str2, String str3) {
        m27876d(str, m27867a(str2, str3));
    }

    /* JADX INFO: renamed from: e */
    public static void m27880e(String str, String str2, String str3) {
        m27879e(str, m27867a(str2, str3));
    }

    /* JADX INFO: renamed from: i */
    public static void m27883i(String str, String str2, String str3) {
        m27882i(str, m27867a(str2, str3));
    }

    /* JADX INFO: renamed from: v */
    public static void m27885v(String str, String str2, String str3) {
        m27884v(str, m27867a(str2, str3));
    }

    /* JADX INFO: renamed from: w */
    public static void m27887w(String str, String str2, String str3) {
        m27886w(str, m27867a(str2, str3));
    }

    /* JADX INFO: renamed from: b */
    public static void m27873b(int i, String str, String str2) {
        String strM27868a = m27868a(m27864a(i), str, str2);
        ILogOutput iLogOutput = f38365j;
        if (iLogOutput != null) {
            iLogOutput.output(strM27868a);
        } else {
            if (i < SAVE_LOG_LEVEL) {
                return;
            }
            addLogOutput(strM27868a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m27875d() {
        SaveLogFileThread saveLogFileThread = f38364i;
        if (saveLogFileThread != null) {
            saveLogFileThread.closeSaveFile();
            f38364i = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m27878e() {
        return f38363h.format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: renamed from: a */
    public static void m27870a(Context context) {
        SaveLogFileThread saveLogFileThread = f38364i;
        if (saveLogFileThread == null || !saveLogFileThread.f38369d) {
            SaveLogFileThread saveLogFileThread2 = new SaveLogFileThread(context);
            f38364i = saveLogFileThread2;
            saveLogFileThread2.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m27868a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(m27878e());
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
    public static String m27867a(String str, String str2) {
        return String.format(Locale.ENGLISH, "[%s] >>> %s", str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m27864a(int i) {
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
    public static void m27869a(int i, String str, String str2) {
        String strM27872b = m27872b(str);
        if (f38358c) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return;
                            }
                            if (f38359d) {
                                TestLog.m27893e(strM27872b, str2);
                            } else {
                                Log.e(strM27872b, str2);
                            }
                        } else if (f38359d) {
                            TestLog.m27896w(strM27872b, str2);
                        } else {
                            Log.w(strM27872b, str2);
                        }
                    } else if (f38359d) {
                        TestLog.m27894i(strM27872b, str2);
                    } else {
                        Log.i(strM27872b, str2);
                    }
                } else if (f38359d) {
                    TestLog.m27892d(strM27872b, str2);
                } else {
                    Log.d(strM27872b, str2);
                }
            } else if (f38359d) {
                TestLog.m27895v(strM27872b, str2);
            } else {
                Log.v(strM27872b, str2);
            }
        }
        m27873b(i, strM27872b, str2);
    }

    /* JADX INFO: renamed from: a */
    public static String m27865a(Context context, String... strArr) {
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
                m27887w("jieli", "createFilePath", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
        }
        return sb.toString();
    }
}
