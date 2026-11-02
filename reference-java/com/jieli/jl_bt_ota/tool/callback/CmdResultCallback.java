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

    public CmdResultCallback(String str, IActionCallback<T> iActionCallback, IHandleResult<T, C> iHandleResult) {
        if (iHandleResult == null) {
            throw new NullPointerException("IHandleResult is null.");
        }
        this.funcName = str;
        this.callback = iActionCallback;
        this.handle = iHandleResult;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.CommandCallback
    public void onCommandResponse(C c) {
        if (c == null) {
            return;
        }
        if (c.getStatus() != 0) {
            onErrCode(OTAError.buildError(ErrorCode.SUB_ERR_RESPONSE_BAD_STATUS, c.getStatus(), "status = " + StateCode.printStatusCode(c.getStatus())).setOpCode(c.getId()).setCmdSn(c.getOpCodeSn()));
            return;
        }
        int iHasResult = this.handle.hasResult(c);
        if (iHasResult != 0) {
            onErrCode(OTAError.buildError(ErrorCode.SUB_ERR_RESPONSE_BAD_RESULT, iHasResult, "result = " + iHasResult).setOpCode(c.getId()).setCmdSn(c.getOpCodeSn()));
            return;
        }
        T tHandleResult = this.handle.handleResult(c);
        IActionCallback<T> iActionCallback = this.callback;
        if (iActionCallback != null) {
            iActionCallback.onSuccess(tHandleResult);
        }
    }

    @Override // com.jieli.jl_bt_ota.interfaces.CommandCallback
    public void onErrCode(BaseError baseError) {
        CommonUtil.callbackError(getClass().getSimpleName(), this.funcName, this.callback, baseError);
    }
}
