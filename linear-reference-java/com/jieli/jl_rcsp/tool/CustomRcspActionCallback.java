package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class CustomRcspActionCallback<T, C extends CommandBase> implements RcspCommandCallback<C> {
    protected final String funcName;
    protected final OnOperationCallback<T> mCallback;
    protected final IHandleResult<T, C> mParser;

    public CustomRcspActionCallback(String r1, OnOperationCallback<T> r2, IHandleResult<T, C> r3) {
        this.funcName = r1;
        this.mCallback = r2;
        this.mParser = r3;
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
    public void onCommandResponse(BluetoothDevice r4, C r5) {
        T r0 = null;
        if (r5 != null) goto L12;
        IHandleResult<T, C> r6 = this.mParser;
        if (r6 == null) goto L8;
        r0 = r6.handleResult(r4, null);
    L8:
        OnOperationCallback<T> r7 = this.mCallback;
        if (r7 == null) goto L38;
        r7.onSuccess(r0);
        return;
    L38:
        return;
    L12:
        IHandleResult<T, C> r1 = this.mParser;
        if (r1 != null) goto L15;
        int r2 = 0;
    L17:
        if (r5.getStatus() != 0) goto L33;
        if (r2 != 0) goto L33;
        IHandleResult<T, C> r3 = this.mParser;
        if (r3 == null) goto L24;
        r0 = r3.handleResult(r4, r5);
    L24:
        if (this.mParser == null) goto L28;
        if (r0 != null) goto L28;
        BaseError r8 = new BaseError(12289, WatchError.getErrorDesc(12289));
        r8.setOpCode(r5.getId());
        onErrCode(r4, r8);
        return;
    L28:
        OnOperationCallback<T> r9 = this.mCallback;
        if (r9 == null) goto L39;
        r9.onSuccess(r0);
        return;
    L39:
        return;
    L33:
        if (r5.getStatus() == 0) goto L36;
        onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12292, r5.getStatus(), null));
        return;
    L36:
        onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12293, r2, null));
        return;
    L15:
        r2 = r1.hasResult(r4, r5);
        goto L17
    }

    @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
    public void onErrCode(BluetoothDevice r3, BaseError r4) {
        JL_Log.e("RcspCommandCallback", this.funcName, RcspUtil.formatString("Device[%s] has an error: %s", new Object[]{r3, r4}));
        OnOperationCallback<T> r5 = this.mCallback;
        if (r5 == null) goto L6;
        r5.onFailed(r4);
        return;
    }
}
