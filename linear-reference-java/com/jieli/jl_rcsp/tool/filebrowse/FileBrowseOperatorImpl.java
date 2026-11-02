package com.jieli.jl_rcsp.tool.filebrowse;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_filebrowse.interfaces.FileBrowseOperator;
import com.jieli.jl_filebrowse.interfaces.OperatCallback;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.file_op.DelDevFileCmd;
import com.jieli.jl_rcsp.model.parameter.DelDevFileParam;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseOperatorImpl implements FileBrowseOperator {
    public static final String b = "FileBrowseOperatorImpl";
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
            JL_Log.e(FileBrowseOperatorImpl.a(), this.a, RcspUtil.formatString("device: %s, %s", new Object[]{r4, r5}));
            OperatCallback r6 = this.b;
            if (r6 == null) goto L6;
            r6.onError(r5.getSubCode());
            return;
        }
    }

    static {
    }

    public FileBrowseOperatorImpl(RcspOpImpl r1) {
        this.a = r1;
    }

    public static /* synthetic */ void a(FileBrowseOperatorImpl r0, int r1, byte r2, int r3, boolean r4, OperatCallback r5) {
        r0.a(r1, r2, r3, r4, r5);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public boolean dataHasPacket() {
        return false;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void deleteFile(final int r8, final byte r9, final int r10, final boolean r11, boolean r12, final OperatCallback r13) {
        if (r12 == false) goto L5;
        a((byte) 1, new AnonymousClass1(this, r8, r9, r10, r11, r13));
        return;
    L5:
        a(r8, r9, r10, r11, r13);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void formatDevice(final int r2, final OperatCallback r3) {
        a((byte) 2, new AnonymousClass2(this, r2, r3));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void sendPathDataCmd(PathData r4, byte[] r5, OperatCallback r6) {
        RcspOpImpl r7 = this.a;
        r7.sendRcspCommand(r7.getTargetDevice(), CommandBuilder.buildSendPathDataCmd(r4), new CustomRcspCallback("sendPathDataCmd", r6));
    }

    public static /* synthetic */ String a() {
        return b;
    }

    public static /* synthetic */ RcspOpImpl a(FileBrowseOperatorImpl r0) {
        return r0.a;
    }

    public final void a(byte r5, OperatCallback r6) {
        RcspOpImpl r0 = this.a;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildNotifyPrepareEnvCmd(r5), new CustomRcspCallback("prepareDelEnv", r6));
    }

    public final void a(int r2, byte r3, int r4, boolean r5, OperatCallback r6) {
        DelDevFileCmd r7 = new DelDevFileCmd(new DelDevFileParam(r2, r3, r4, r5));
        RcspOpImpl r8 = this.a;
        r8.sendRcspCommand(r8.getTargetDevice(), r7, 6000, new CustomRcspCallback("deleteFileActual", r6));
    }
}
