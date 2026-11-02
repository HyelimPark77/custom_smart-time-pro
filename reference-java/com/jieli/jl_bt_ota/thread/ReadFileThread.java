package com.jieli.jl_bt_ota.thread;

import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.util.FileUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileThread extends Thread {

    /* JADX INFO: renamed from: d */
    private static final String f37621d = "ReadFileThread";

    /* JADX INFO: renamed from: a */
    private final String f37622a;

    /* JADX INFO: renamed from: b */
    private final IActionCallback<byte[]> f37623b;

    /* JADX INFO: renamed from: c */
    private final Handler f37624c;

    public ReadFileThread(String str, IActionCallback<byte[]> iActionCallback) {
        super(f37621d);
        this.f37624c = new Handler(Looper.getMainLooper());
        this.f37622a = str;
        this.f37623b = iActionCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27060a(byte[] bArr) {
        IActionCallback<byte[]> iActionCallback = this.f37623b;
        if (iActionCallback != null) {
            iActionCallback.onSuccess(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m27062b(final byte[] bArr) {
        this.f37624c.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qf2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10591IO.m27060a(bArr);
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f37624c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        ?? r1;
        Throwable th;
        FileInputStream fileInputStream;
        FileNotFoundException e;
        String str = f37621d;
        JL_Log.m27232d(str, str, "file path : " + this.f37622a);
        if (!FileUtil.checkFileExist(this.f37622a)) {
            m27061b(OTAError.buildError(4097, "File path does not exist."));
            return;
        }
        Object obj = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream3 = new FileInputStream(this.f37622a);
                    try {
                        byte[] bArr = new byte[fileInputStream3.available()];
                        int i = fileInputStream3.read(bArr);
                        if (i >= 0) {
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(bArr, 0, bArr2, 0, i);
                            m27062b(bArr2);
                        } else {
                            m27061b(OTAError.buildError(ErrorCode.SUB_ERR_DATA_NOT_FOUND));
                        }
                        fileInputStream3.close();
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream = fileInputStream3;
                        try {
                            e.printStackTrace();
                            m27061b(OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } catch (Throwable th2) {
                            FileInputStream fileInputStream4 = fileInputStream;
                            th = th2;
                            obj = fileInputStream4;
                            Throwable th3 = th;
                            r1 = obj;
                            th = th3;
                            if (r1 == 0) {
                                throw th;
                            }
                            try {
                                r1.close();
                                throw th;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileInputStream2 = fileInputStream3;
                        e.printStackTrace();
                        m27061b(OTAError.buildError(ErrorCode.SUB_ERR_IO_EXCEPTION, e.getMessage()));
                        obj = fileInputStream2;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                            obj = fileInputStream2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r1 = fileInputStream3;
                        if (r1 == 0) {
                            throw th;
                        }
                        r1.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    r1 = obj;
                    th = th6;
                    if (r1 == 0) {
                        throw th;
                    }
                    r1.close();
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                fileInputStream = null;
                e = e5;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            obj = e7;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m27061b(final BaseError baseError) {
        if (baseError == null) {
            return;
        }
        this.f37624c.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.pf2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10353IO.m27059a(baseError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27059a(BaseError baseError) {
        IActionCallback<byte[]> iActionCallback = this.f37623b;
        if (iActionCallback != null) {
            iActionCallback.onError(baseError);
        }
    }
}
