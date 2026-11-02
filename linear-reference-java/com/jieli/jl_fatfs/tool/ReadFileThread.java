package com.jieli.jl_fatfs.tool;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.mltcode.paycertificationapi.of2;
import com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileThread extends Thread {
    public static final String d = "ReadFileThread";
    public final String a;
    public final OnFatFsOpResultListener<byte[]> b;
    public final Handler c;

    static {
    }

    public ReadFileThread(String r3, OnFatFsOpResultListener<byte[]> r4) {
        this.c = new Handler(Looper.getMainLooper());
        this.a = r3;
        this.b = r4;
    }

    public final /* synthetic */ void a(byte[] r2) {
        OnFatFsOpResultListener<byte[]> r0 = this.b;
        if (r0 == null) goto L6;
        r0.onResult(r2);
        return;
    }

    public final void b(final byte[] r3) {
        this.c.post(new of2(this, r3));
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.FileInputStream] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Log.d("ReadFileThread", "mUpgradeFilePath : " + this.a);
        File r0 = new File(this.a);
        FileInputStream r2 = null;
        if (r0.exists() == false) goto L48;
        ?? r1 = r0.isFile();
        if (r1 == 0) goto L48;
        FileInputStream r3 = new FileInputStream(this.a);     // Catch: Throwable -> L21 IOException -> L23 FileNotFoundException -> L25
        byte[] r4 = new byte[r3.available()];     // Catch: Throwable -> L11 IOException -> L13 FileNotFoundException -> L15
        int r5 = r3.read(r4);     // Catch: Throwable -> L11 IOException -> L13 FileNotFoundException -> L15
        if (r5 <= 0) goto L17;
        byte[] r6 = new byte[r5];     // Catch: Throwable -> L11 IOException -> L13 FileNotFoundException -> L15
        System.arraycopy(r4, 0, r6, 0, r5);     // Catch: Throwable -> L11 IOException -> L13 FileNotFoundException -> L15
        b(r6);     // Catch: Throwable -> L11 IOException -> L13 FileNotFoundException -> L15
    L17:
        r3.close();     // Catch: IOException -> L19
        return;
    L15:
        FileNotFoundException e = e;
    L55:
        e.printStackTrace();     // Catch: Throwable -> L39
        Log.w(d, "file not found");     // Catch: Throwable -> L39
        b(null);     // Catch: Throwable -> L39
        if (r3 == null) goto L63;
        r3.close();     // Catch: IOException -> L19
    L52:
        return;
    L63:
        return;
    L39:
        th = move-exception;
        r2 = r3;
        th = th;
    L41:
        th = th;
        r1 = r2;
    L42:
        if (r1 != 0) goto L50;
    L47:
        throw th;
    L50:
        r1.close();     // Catch: IOException -> L45
    L45:
        e = move-exception;
        e.printStackTrace();
    L13:
        IOException e2 = e;
    L28:
        e2.printStackTrace();     // Catch: Throwable -> L11
        Log.w(d, "error : " + e2.getMessage());     // Catch: Throwable -> L11
        b(null);     // Catch: Throwable -> L11
        if (r3 == null) goto L62;
        r3.close();     // Catch: IOException -> L19
        goto L52
    L62:
        return;
    L25:
        e = move-exception;
        e = e;
        r3 = null;
    L23:
        e = move-exception;
        e2 = e;
        r3 = null;
    L21:
        th = th;
    L19:
        e = move-exception;
        e.printStackTrace();
        return;
    L11:
        th = th;
    L48:
        Log.w(d, "file path not exist.");
        b(null);
    }
}
