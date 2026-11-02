package com.jieli.jl_fatfs.tool;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileThread extends Thread {

    /* JADX INFO: renamed from: d */
    public static final String f37782d = "ReadFileThread";

    /* JADX INFO: renamed from: a */
    public final String f37783a;

    /* JADX INFO: renamed from: b */
    public final OnFatFsOpResultListener<byte[]> f37784b;

    /* JADX INFO: renamed from: c */
    public final Handler f37785c = new Handler(Looper.getMainLooper());

    public ReadFileThread(String str, OnFatFsOpResultListener<byte[]> onFatFsOpResultListener) {
        this.f37783a = str;
        this.f37784b = onFatFsOpResultListener;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27279a(byte[] bArr) {
        OnFatFsOpResultListener<byte[]> onFatFsOpResultListener = this.f37784b;
        if (onFatFsOpResultListener != null) {
            onFatFsOpResultListener.onResult(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27280b(final byte[] bArr) {
        this.f37785c.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.of2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10126IO.m27279a(bArr);
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f37785c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.FileInputStream] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        IOException e;
        FileInputStream fileInputStream;
        FileNotFoundException e2;
        Log.d("ReadFileThread", "mUpgradeFilePath : " + this.f37783a);
        File file = new File(this.f37783a);
        FileInputStream fileInputStream2 = null;
        if (file.exists()) {
            ?? IsFile = file.isFile();
            try {
                try {
                    if (IsFile != 0) {
                        try {
                            fileInputStream = new FileInputStream(this.f37783a);
                            try {
                                byte[] bArr = new byte[fileInputStream.available()];
                                int i = fileInputStream.read(bArr);
                                if (i > 0) {
                                    byte[] bArr2 = new byte[i];
                                    System.arraycopy(bArr, 0, bArr2, 0, i);
                                    m27280b(bArr2);
                                }
                                fileInputStream.close();
                                return;
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                try {
                                    e2.printStackTrace();
                                    Log.w(f37782d, "file not found");
                                    m27280b(null);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    fileInputStream2 = fileInputStream;
                                    th = th;
                                    th = th;
                                    IsFile = fileInputStream2;
                                    if (IsFile != 0) {
                                        try {
                                            IsFile.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                e.printStackTrace();
                                Log.w(f37782d, "error : " + e.getMessage());
                                m27280b(null);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return;
                                }
                                return;
                            }
                        } catch (FileNotFoundException e6) {
                            e2 = e6;
                            fileInputStream = null;
                        } catch (IOException e7) {
                            e = e7;
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            IsFile = fileInputStream2;
                            if (IsFile != 0) {
                                IsFile.close();
                            }
                            throw th;
                        }
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Log.w(f37782d, "file path not exist.");
        m27280b(null);
    }
}
