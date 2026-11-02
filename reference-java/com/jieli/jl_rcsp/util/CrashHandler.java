package com.jieli.jl_rcsp.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.ironsource.C12616d4;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final String TAG = "CrashHandler";

    /* JADX INFO: renamed from: e */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile CrashHandler f38351e;

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f38352a;

    /* JADX INFO: renamed from: b */
    public Context f38353b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f38354c = new HashMap();

    /* JADX INFO: renamed from: d */
    public OnExceptionListener f38355d;

    public interface OnExceptionListener {
        void onException(Throwable th);
    }

    public static CrashHandler getInstance() {
        if (f38351e == null) {
            synchronized (CrashHandler.class) {
                try {
                    if (f38351e == null) {
                        f38351e = new CrashHandler();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38351e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27860a(Throwable th) {
        if (th == null) {
            return false;
        }
        OnExceptionListener onExceptionListener = this.f38355d;
        if (onExceptionListener != null) {
            onExceptionListener.onException(th);
        }
        m27859a(this.f38353b);
        m27861b(th);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final String m27861b(Throwable th) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f38354c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append(C12616d4.j.f34436b);
            sb.append(value);
            sb.append("\n");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        sb.append(stringWriter.toString());
        JL_Log.m27880e(TAG, "saveCrashInfo2File", sb.toString());
        return null;
    }

    public void init(Context context) {
        this.f38353b = context;
        if (this.f38352a == null) {
            this.f38352a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void setOnExceptionListener(OnExceptionListener onExceptionListener) {
        this.f38355d = onExceptionListener;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (thread == null || th == null) {
            return;
        }
        if (!m27860a(th) && (uncaughtExceptionHandler = this.f38352a) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            JL_Log.m27880e(TAG, "uncaughtException", "InterruptedException error : " + m27858a((Exception) e));
        }
        this.f38352a = null;
        this.f38353b = null;
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m27859a(Context context) {
        if (context == null) {
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                String str = packageInfo.versionName;
                if (str == null) {
                    str = "null";
                }
                String str2 = packageInfo.versionCode + "";
                this.f38354c.put("versionName", str);
                this.f38354c.put("versionCode", str2);
            }
        } catch (PackageManager.NameNotFoundException e) {
            JL_Log.m27880e(TAG, "collectDeviceInfo", "an error occured when collect package info : " + m27858a((Exception) e));
        }
        for (Field field : Build.class.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                if (field.get(null) != null) {
                    this.f38354c.put(field.getName(), field.get(null).toString());
                    JL_Log.m27877d(TAG, field.getName(), "" + field.get(null));
                }
            } catch (Exception e2) {
                JL_Log.m27880e(TAG, "collectDeviceInfo", "an error occured when collect crash info : " + m27858a(e2));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m27858a(Exception exc) {
        if (exc == null) {
            return null;
        }
        return exc.toString();
    }
}
