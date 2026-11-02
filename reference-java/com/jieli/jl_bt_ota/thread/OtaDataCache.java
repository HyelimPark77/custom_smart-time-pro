package com.jieli.jl_bt_ota.thread;

import com.ironsource.C12616d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.impl.BluetoothOTAManager;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
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

    /* JADX INFO: renamed from: a */
    private final String f37615a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    private ExecutorService f37616b;

    /* JADX INFO: renamed from: c */
    private byte[] f37617c;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f37618d;

    public void init(BluetoothOTAConfigure bluetoothOTAConfigure, IActionCallback<Boolean> iActionCallback) {
        if (bluetoothOTAConfigure == null) {
            CommonUtil.callbackError(this.f37615a, C12616d4.a.f34169f, iActionCallback, OTAError.buildError(4097, "BluetoothOTAConfigure is null."));
            return;
        }
        String firmwareFilePath = bluetoothOTAConfigure.getFirmwareFilePath();
        JL_Log.m27232d(this.f37615a, C12616d4.a.f34169f, "ota file path : " + firmwareFilePath);
        if (FileUtil.checkFileExist(firmwareFilePath)) {
            m27057a(firmwareFilePath, iActionCallback);
            return;
        }
        byte[] firmwareFileData = bluetoothOTAConfigure.getFirmwareFileData();
        if (firmwareFileData == null || firmwareFileData.length <= 0) {
            CommonUtil.callbackError(this.f37615a, C12616d4.a.f34169f, iActionCallback, OTAError.buildError(ErrorCode.SUB_ERR_DATA_NOT_FOUND));
            return;
        }
        this.f37617c = firmwareFileData;
        JL_Log.m27232d(this.f37615a, C12616d4.a.f34169f, "ota data size : " + firmwareFileData.length);
        if (iActionCallback != null) {
            iActionCallback.onSuccess(Boolean.TRUE);
        }
    }

    public void readOtaData(final int i, final int i2, final IActionCallback<byte[]> iActionCallback) {
        ExecutorService executorService;
        if (i >= 0 && i2 >= 0) {
            byte[] bArr = this.f37617c;
            if (bArr != null && bArr.length > 0) {
                byte[] bArr2 = new byte[i2];
                if (i + i2 > bArr.length) {
                    CommonUtil.callbackError(this.f37615a, "readOtaData", iActionCallback, OTAError.buildError(16388, CommonUtil.formatString("Can not read file data by Buffer. offset = %d, len = %d, file data length = %d.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f37617c.length))));
                    return;
                }
                System.arraycopy(bArr, i, bArr2, 0, i2);
                if (iActionCallback != null) {
                    iActionCallback.onSuccess(bArr2);
                    return;
                }
                return;
            }
            if (this.f37618d != null && (executorService = this.f37616b) != null && !executorService.isShutdown()) {
                this.f37616b.execute(new Runnable() { // from class: com.android.mltcode.paycertificationapi.cj1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5988IO.m27055a(i2, i, iActionCallback);
                    }
                });
                return;
            }
        }
        CommonUtil.callbackError(this.f37615a, "readOtaData", iActionCallback, OTAError.buildError(4097, CommonUtil.formatString("Can not read file data. offset = %d, len = %d.", Integer.valueOf(i), Integer.valueOf(i2))));
    }

    public void release() {
        ExecutorService executorService = this.f37616b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f37616b.shutdownNow();
            this.f37616b = null;
        }
        if (this.f37617c != null) {
            this.f37617c = null;
            System.gc();
        }
        RandomAccessFile randomAccessFile = this.f37618d;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.f37618d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27055a(int i, int i2, IActionCallback iActionCallback) {
        try {
            byte[] bArr = new byte[i];
            this.f37618d.seek(i2);
            int i3 = this.f37618d.read(bArr);
            if (i3 != i) {
                CommonUtil.callbackError(this.f37615a, "readOtaData", iActionCallback, OTAError.buildError(16388, CommonUtil.formatString("Can not read file data by RandomAccessFile. offset = %d, len = %d, read data size = %d, file data length = %d.", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Long.valueOf(this.f37618d.length()))));
            } else if (iActionCallback != null) {
                iActionCallback.onSuccess(Arrays.copyOfRange(bArr, 0, i3));
            }
        } catch (IOException e) {
            CommonUtil.callbackError(this.f37615a, "readOtaData", iActionCallback, OTAError.buildError(ErrorCode.SUB_ERR_IO_EXCEPTION, "Failed to read data. " + e.getMessage()));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27057a(String str, final IActionCallback<Boolean> iActionCallback) {
        final File file = new File(str);
        if (file.exists() && file.isFile()) {
            ExecutorService executorService = this.f37616b;
            if (executorService == null || executorService.isShutdown()) {
                this.f37616b = Executors.newSingleThreadExecutor();
            }
            if (file.length() <= BluetoothOTAManager.FILE_CACHE_DATA_LIMIT) {
                this.f37616b.execute(new ReadFileThread(str, new IActionCallback<byte[]>() { // from class: com.jieli.jl_bt_ota.thread.OtaDataCache.1
                    @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                    public void onError(BaseError baseError) {
                        CommonUtil.callbackError(OtaDataCache.this.f37615a, "readFile", iActionCallback, baseError);
                    }

                    @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                    public void onSuccess(byte[] bArr) {
                        OtaDataCache.this.f37617c = bArr;
                        String str2 = OtaDataCache.this.f37615a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onSuccess, length = ");
                        sb.append(bArr == null ? 0 : bArr.length);
                        JL_Log.m27236i(str2, "readFile", sb.toString());
                        IActionCallback iActionCallback2 = iActionCallback;
                        if (iActionCallback2 != null) {
                            iActionCallback2.onSuccess(Boolean.TRUE);
                        }
                    }
                }));
                return;
            } else {
                this.f37616b.execute(new Runnable() { // from class: com.android.mltcode.paycertificationapi.dj1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6200IO.m27056a(file, iActionCallback);
                    }
                });
                return;
            }
        }
        CommonUtil.callbackError(this.f37615a, "readFile", iActionCallback, OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27056a(File file, IActionCallback iActionCallback) {
        try {
            this.f37618d = new RandomAccessFile(file, "r");
            if (iActionCallback != null) {
                iActionCallback.onSuccess(Boolean.TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            CommonUtil.callbackError(this.f37615a, "readFile", iActionCallback, OTAError.buildError(ErrorCode.SUB_ERR_FILE_NOT_FOUND));
        }
    }
}
