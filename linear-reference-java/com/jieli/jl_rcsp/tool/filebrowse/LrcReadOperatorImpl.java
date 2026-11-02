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
    public static final String b = "LrcReadOperatorImpl";
    public final RcspOpImpl a;

    public static class CustomRcspCallback<C extends CommandBase> implements RcspCommandCallback<C> {
        public final String a;
        public final OperatCallback b;

        public CustomRcspCallback(String r1, OperatCallback r2) {
            this.a = r1;
            this.b = r2;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice r4, C r5) {
            if (r5.getStatus() != 0) goto L8;
            OperatCallback r6 = this.b;
            if (r6 == null) goto L10;
            r6.onSuccess();
            return;
        L10:
            return;
        L8:
            onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12292, r5.getStatus(), null));
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice r4, BaseError r5) {
            JL_Log.e(LrcReadOperatorImpl.a(), this.a, RcspUtil.formatString("device: %s, %s", new Object[]{r4, r5}));
            OperatCallback r6 = this.b;
            if (r6 == null) goto L6;
            r6.onError(r5.getSubCode());
            return;
        }
    }

    static {
    }

    public LrcReadOperatorImpl(RcspOpImpl r1) {
        this.a = r1;
    }

    public static /* synthetic */ String a() {
        return b;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.LrcReadOperator
    public void startLrcRead(OperatCallback r6) {
        RcspOpImpl r0 = this.a;
        r0.sendRcspCommand(r0.getTargetDevice(), new StartLrcGetCmd(), new CustomRcspCallback("startLrcRead", r6));
    }
}
