package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public abstract class TaskBase implements ITask {
    public static final int ERR_BUSY = 4352;
    public static final int ERR_COMMAND_RESPONSE = 12292;
    public static final int ERR_CRC_CHECK = 12544;
    public static final int ERR_DEVICE_IN_CALL = 12545;
    public static final int ERR_DEVICE_NOT_CONNECT = 8192;
    public static final int ERR_FUNC_NOT_SUPPORT = 4353;
    public static final int ERR_IO_EXCEPTION = 16389;
    public static final int ERR_MISSING_DATA = 16387;
    public static final int ERR_NO_TARGET_STORAGE = 16384;
    public static final int ERR_PARAM = 4097;
    public static final int ERR_RENAME = 16898;
    public static final int ERR_WAIT_DATA_TIMEOUT = 12290;
    protected static final int MSG_WAITING_FOR_DATA_TIMEOUT = 4386;
    protected static int TIMEOUT = 20000;
    public volatile boolean a;
    protected TaskListener listener;
    protected final DeviceStatusManager mDeviceStatusManager;
    protected final RcspOpImpl mRcspOp;
    protected final String tag;

    static {
    }

    public TaskBase(RcspOpImpl r2) throws RuntimeException {
        this.tag = getClass().getSimpleName();
        if (r2 == null) goto L7;
        this.mRcspOp = r2;
        this.mDeviceStatusManager = DeviceStatusManager.getInstance();
        return;
    L7:
        throw new RuntimeException("RcspOpImpl can not be null.");
    }

    public BaseError buildResponseBadResult(int r3, int r4) {
        return RcspErrorCode.buildJsonError(r3, 12293, r4, null);
    }

    public BaseError buildResponseBadState(int r3, int r4) {
        return RcspErrorCode.buildJsonError(r3, 12292, r4, null);
    }

    public void callbackBegin() {
        this.a = true;
        TaskListener r0 = this.listener;
        if (r0 == null) goto L6;
        r0.onBegin();
        return;
    }

    public void callbackCancel(int r4) {
        if (this.a == false) goto L10;
        this.a = false;
        JL_Log.w(this.tag, "callbackCancel", "reason : " + r4);
        TaskListener r0 = this.listener;
        if (r0 == null) goto L9;
        r0.onCancel(r4);
        return;
    L9:
        return;
    }

    public void callbackError(int r2) {
        callbackError(r2, WatchError.getErrorDesc(r2));
    }

    public void callbackFinish() {
        if (this.a == false) goto L10;
        this.a = false;
        JL_Log.d(this.tag, "callbackFinish", "Success");
        TaskListener r0 = this.listener;
        if (r0 == null) goto L9;
        r0.onFinish();
        return;
    L9:
        return;
    }

    public void callbackProgress(int r2) {
        if (this.a == false) goto L10;
        TaskListener r0 = this.listener;
        if (r0 == null) goto L9;
        r0.onProgress(r2);
        return;
    L9:
        return;
    }

    public BluetoothDevice getConnectedDevice() {
        return this.mRcspOp.getConnectedDevice();
    }

    public boolean isDeviceInCalling() {
        DeviceInfo r0 = this.mRcspOp.getDeviceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.getPhoneStatus() != 1) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean isFileTransfer() {
        return this.mDeviceStatusManager.isFileTransfer(getConnectedDevice());
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public boolean isRun() {
        return this.a;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void setListener(TaskListener r1) {
        this.listener = r1;
    }

    public void callbackError(int r4, String r5) {
        this.a = false;
        JL_Log.e(this.tag, "callbackError", RcspUtil.formatString("code : %d(0x%X), %s", new Object[]{Integer.valueOf(r4), Integer.valueOf(r4), r5}));
        TaskListener r0 = this.listener;
        if (r0 == null) goto L6;
        r0.onError(r4, r5);
        return;
    }
}
