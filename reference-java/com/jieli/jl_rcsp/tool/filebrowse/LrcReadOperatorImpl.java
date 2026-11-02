package com.jieli.jl_rcsp.tool.filebrowse;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_filebrowse.interfaces.OperatCallback;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadOperator;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.file_op.StartLrcGetCmd;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class LrcReadOperatorImpl implements LrcReadOperator {

    /* JADX INFO: renamed from: b */
    public static final String f38345b = "LrcReadOperatorImpl";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38346a;

    public static class CustomRcspCallback<C extends CommandBase> implements RcspCommandCallback<C> {

        /* JADX INFO: renamed from: a */
        public final String f38347a;

        /* JADX INFO: renamed from: b */
        public final OperatCallback f38348b;

        public CustomRcspCallback(String str, OperatCallback operatCallback) {
            this.f38347a = str;
            this.f38348b = operatCallback;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice bluetoothDevice, C c) {
            if (c.getStatus() != 0) {
                onErrCode(bluetoothDevice, RcspErrorCode.buildJsonError(c.getId(), 12292, c.getStatus(), null));
                return;
            }
            OperatCallback operatCallback = this.f38348b;
            if (operatCallback != null) {
                operatCallback.onSuccess();
            }
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
            JL_Log.m27880e(LrcReadOperatorImpl.f38345b, this.f38347a, RcspUtil.formatString("device: %s, %s", bluetoothDevice, baseError));
            OperatCallback operatCallback = this.f38348b;
            if (operatCallback != null) {
                operatCallback.onError(baseError.getSubCode());
            }
        }
    }

    public LrcReadOperatorImpl(RcspOpImpl rcspOpImpl) {
        this.f38346a = rcspOpImpl;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.LrcReadOperator
    public void startLrcRead(OperatCallback operatCallback) {
        RcspOpImpl rcspOpImpl = this.f38346a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), new StartLrcGetCmd(), new CustomRcspCallback("startLrcRead", operatCallback));
    }
}
