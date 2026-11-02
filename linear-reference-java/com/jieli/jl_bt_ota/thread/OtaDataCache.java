package com.jieli.jl_bt_ota.thread;

import com.android.mltcode.paycertificationapi.cj1;
import com.android.mltcode.paycertificationapi.dj1;
import com.ironsource.C2985d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.impl.BluetoothOTAManager;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.FileUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class OtaDataCache {
    private final String a;
    private ExecutorService b;
    private byte[] c;
    private RandomAccessFile d;

    public OtaDataCache() {
        this.a = getClass().getSimpleName();
    }

    public static /* synthetic */ void OXO1(OtaDataCache r0, int r1, int r2, IActionCallback r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void XIi00iiXO(OtaDataCache r0, File r1, IActionCallback r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ byte[] a(OtaDataCache r0, byte[] r1) {
        r0.c = r1;
        return r1;
    }

    public void init(BluetoothOTAConfigure r6, IActionCallback<Boolean> r7) {
        if (r6 != null) goto L6;
        CommonUtil.callbackError(this.a, C2985d4.a.f, r7, OTAError.buildError(4097, "BluetoothOTAConfigure is null."));
        return;
    L6:
        String r1 = r6.getFirmwareFilePath();
        JL_Log.d(this.a, C2985d4.a.f, "ota file path : " + r1);
        if (FileUtil.checkFileExist(r1) == false) goto L10;
        a(r1, r7);
        return;
    L10:
        byte[] r8 = r6.getFirmwareFileData();
        if (r8 != null) goto L13;
    L18:
        CommonUtil.callbackError(this.a, C2985d4.a.f, r7, OTAError.buildError(ErrorCode.SUB_ERR_DATA_NOT_FOUND));
        return;
    L13:
        if (r8.length <= 0) goto L18;
        this.c = r8;
        JL_Log.d(this.a, C2985d4.a.f, "ota data size : " + r8.length);
        if (r7 == null) goto L20;
        r7.onSuccess(Boolean.TRUE);
        return;
    }

    public void readOtaData(final int r6, final int r7, final IActionCallback<byte[]> r8) {
        if (r6 < 0) goto L25;
        if (r7 < 0) goto L25;
        byte[] r1 = this.c;
        if (r1 == null) goto L18;
        if (r1.length <= 0) goto L18;
        byte[] r2 = new byte[r7];
        if ((r6 + r7) > r1.length) goto L15;
        System.arraycopy(r1, r6, r2, 0, r7);
        if (r8 == null) goto L27;
        r8.onSuccess(r2);
        return;
    L27:
        return;
    L15:
        CommonUtil.callbackError(this.a, "readOtaData", r8, OTAError.buildError(16388, CommonUtil.formatString("Can not read file data by Buffer. offset = %d, len = %d, file data length = %d.", new Object[]{Integer.valueOf(r6), Integer.valueOf(r7), Integer.valueOf(this.c.length)})));
        return;
    L18:
        if (this.d == null) goto L25;
        ExecutorService r3 = this.b;
        if (r3 == null) goto L25;
        if (r3.isShutdown() == true) goto L25;
        this.b.execute(new cj1(this, r7, r6, r8));
        return;
    L25:
        CommonUtil.callbackError(this.a, "readOtaData", r8, OTAError.buildError(4097, CommonUtil.formatString("Can not read file data. offset = %d, len = %d.", new Object[]{Integer.valueOf(r6), Integer.valueOf(r7)})));
    }

    public void release() {
        ExecutorService r0 = this.b;
        if (r0 == null) goto L8;
        if (r0.isShutdown() == true) goto L8;
        this.b.shutdownNow();
        this.b = null;
    L8:
        if (this.c == null) goto L10;
        this.c = null;
        System.gc();
    L10:
        RandomAccessFile r1 = this.d;
        if (r1 != null) goto L23;
        return;
    L23:
        r1.close();     // Catch: Throwable -> L15 IOException -> L17
        this.d = null;
        return;
    L17:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L15
        this.d = null;
        return;
    L15:
        th = move-exception;
        this.d = null;
        throw th;
    }

    public static /* synthetic */ String a(OtaDataCache r0) {
        return r0.a;
    }

    private /* synthetic */ void a(int r7, int r8, IActionCallback r9) {
        byte[] r1 = new byte[r7];     // Catch: IOException -> L7
        this.d.seek(r8);     // Catch: IOException -> L7
        int r2 = this.d.read(r1);     // Catch: IOException -> L7
        if (r2 == r7) goto L9;
        CommonUtil.callbackError(this.a, "readOtaData", r9, OTAError.buildError(16388, CommonUtil.formatString("Can not read file data by RandomAccessFile. offset = %d, len = %d, read data size = %d, file data length = %d.", new Object[]{Integer.valueOf(r8), Integer.valueOf(r7), Integer.valueOf(r2), Long.valueOf(this.d.length())})));     // Catch: IOException -> L7
        return;
    L9:
        if (r9 == null) goto L15;
        r9.onSuccess(Arrays.copyOfRange(r1, 0, r2));     // Catch: IOException -> L7
        return;
    L15:
        return;
    L7:
        e = move-exception;
        CommonUtil.callbackError(this.a, "readOtaData", r9, OTAError.buildError(ErrorCode.SUB_ERR_IO_EXCEPTION, "Failed to read data. " + e.getMessage()));
    }

    private void a(String r6, final IActionCallback<Boolean> r7) {
        final File r0 = new File(r6);
        if (r0.exists() == true) goto L5;
    L18:
        CommonUtil.callbackError(this.a, "readFile", r7, OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));
        return;
    L5:
        if (r0.isFile() == false) goto L18;
        ExecutorService r1 = this.b;
        if (r1 != null) goto L10;
    L11:
        this.b = Executors.newSingleThreadExecutor();
    L13:
        if (r0.length() > BluetoothOTAManager.FILE_CACHE_DATA_LIMIT) goto L16;
        this.b.execute(new ReadFileThread(r6, new AnonymousClass1(this, r7)));
        return;
    L16:
        this.b.execute(new dj1(this, r0, r7));
        return;
    L10:
        if (r1.isShutdown() == false) goto L13;
        goto L11
    }

    private /* synthetic */ void a(File r3, IActionCallback r4) {
        this.d = new RandomAccessFile(r3, "r");     // Catch: Exception -> L6
        if (r4 == null) goto L11;
        r4.onSuccess(Boolean.TRUE);     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        CommonUtil.callbackError(this.a, "readFile", r4, OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));
    }
}
