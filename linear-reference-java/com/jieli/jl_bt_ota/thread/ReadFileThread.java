package com.jieli.jl_bt_ota.thread;

import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.pf2;
import com.android.mltcode.paycertificationapi.qf2;
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
    private static final String d = "ReadFileThread";
    private final String a;
    private final IActionCallback<byte[]> b;
    private final Handler c;

    static {
    }

    public ReadFileThread(String r3, IActionCallback<byte[]> r4) {
        super(d);
        this.c = new Handler(Looper.getMainLooper());
        this.a = r3;
        this.b = r4;
    }

    public static /* synthetic */ void OXO1(ReadFileThread r0, BaseError r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void XIi00iiXO(ReadFileThread r0, byte[] r1) {
        r0.a(r1);
    }

    private /* synthetic */ void a(byte[] r2) {
        IActionCallback<byte[]> r0 = this.b;
        if (r0 == null) goto L6;
        r0.onSuccess(r2);
        return;
    }

    private void b(final byte[] r3) {
        this.c.post(new qf2(this, r3));
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.c.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String r0 = d;
        JL_Log.d(r0, r0, "file path : " + this.a);
        if (FileUtil.checkFileExist(this.a) == false) goto L47;
        Object r1 = null;
        FileInputStream r2 = null;
        FileInputStream r3 = new FileInputStream(this.a);     // Catch: IOException -> L21 FileNotFoundException -> L23 Throwable -> L29
    L60:
        byte[] r4 = new byte[r3.available()];     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
        int r5 = r3.read(r4);     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
        if (r5 < 0) goto L15;
        byte[] r6 = new byte[r5];     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
        System.arraycopy(r4, 0, r6, 0, r5);     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
        b(r6);     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
    L16:
        r3.close();     // Catch: IOException -> L18
        return;
    L15:
        b(OTAError.buildError(ErrorCode.SUB_ERR_DATA_NOT_FOUND));     // Catch: Throwable -> L9 IOException -> L11 FileNotFoundException -> L13
    L13:
        FileNotFoundException e = e;
        FileInputStream r7 = r3;
    L57:
        e.printStackTrace();     // Catch: Throwable -> L38
        b(OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));     // Catch: Throwable -> L38
        if (r7 == null) goto L61;
        r7.close();     // Catch: IOException -> L18
        return;
    L61:
        return;
    L38:
        th = move-exception;
        FileInputStream r8 = r7;
        th = th;
        r1 = r8;
    L40:
        Throwable r9 = th;
        ?? r10 = r1;
        Throwable th = r9;
    L41:
        if (r10 == 0) goto L63;
        r10.close();     // Catch: IOException -> L44
        throw th;
    L44:
        e = move-exception;
        e.printStackTrace();
        throw th;
    L63:
        throw th;
    L11:
        e = move-exception;
        e = e;
        r2 = r3;
    L25:
        e.printStackTrace();     // Catch: Throwable -> L29
        b(OTAError.buildError(ErrorCode.SUB_ERR_IO_EXCEPTION, e.getMessage()));     // Catch: Throwable -> L29
        r1 = r2;
        if (r2 == null) goto L51;
        r2.close();     // Catch: IOException -> L18
        r1 = r2;
    L51:
        return;
    L9:
        th = th;
        r10 = r3;
    L29:
        th = th;
    L23:
        e = move-exception;
        r7 = null;
        e = e;
    L21:
        e = e;
    L18:
        e = move-exception;
        e.printStackTrace();
        r1 = e;
        goto L51
    L47:
        b(OTAError.buildError(4097, "File path does not exist."));
    }

    private void b(final BaseError r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        this.c.post(new pf2(this, r3));
    }

    private /* synthetic */ void a(BaseError r2) {
        IActionCallback<byte[]> r0 = this.b;
        if (r0 == null) goto L6;
        r0.onError(r2);
        return;
    }
}
