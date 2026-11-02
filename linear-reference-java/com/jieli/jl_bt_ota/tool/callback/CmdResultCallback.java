package com.jieli.jl_bt_ota.tool.callback;

import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.constant.StateCode;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.rcsp.IHandleResult;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class CmdResultCallback<T, C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> implements CommandCallback<C> {
    protected final IActionCallback<T> callback;
    protected final String funcName;
    protected final IHandleResult<T, C> handle;

    public CmdResultCallback(String r1, IActionCallback<T> r2, IHandleResult<T, C> r3) {
        if (r3 == null) goto L7;
        this.funcName = r1;
        this.callback = r2;
        this.handle = r3;
        return;
    L7:
        throw new NullPointerException("IHandleResult is null.");
    }

    @Override // com.jieli.jl_bt_ota.interfaces.CommandCallback
    public void onCommandResponse(C r4) {
        if (r4 != null) goto L5;
        return;
    L5:
        if (r4.getStatus() != 0) goto L14;
        int r0 = this.handle.hasResult(r4);
        if (r0 != 0) goto L12;
        T r5 = this.handle.handleResult(r4);
        IActionCallback<T> r1 = this.callback;
        if (r1 == null) goto L16;
        r1.onSuccess(r5);
        return;
    L16:
        return;
    L12:
        onErrCode(OTAError.buildError(ErrorCode.SUB_ERR_RESPONSE_BAD_RESULT, r0, "result = " + r0).setOpCode(r4.getId()).setCmdSn(r4.getOpCodeSn()));
        return;
    L14:
        onErrCode(OTAError.buildError(ErrorCode.SUB_ERR_RESPONSE_BAD_STATUS, r4.getStatus(), "status = " + StateCode.printStatusCode(r4.getStatus())).setOpCode(r4.getId()).setCmdSn(r4.getOpCodeSn()));
    }

    @Override // com.jieli.jl_bt_ota.interfaces.CommandCallback
    public void onErrCode(BaseError r4) {
        CommonUtil.callbackError(getClass().getSimpleName(), this.funcName, this.callback, r4);
    }
}
