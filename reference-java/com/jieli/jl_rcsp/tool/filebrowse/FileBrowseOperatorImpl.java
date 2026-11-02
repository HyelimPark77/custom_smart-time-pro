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
import com.jieli.jl_rcsp.model.command.file_op.DeviceFormatCmd;
import com.jieli.jl_rcsp.model.parameter.DelDevFileParam;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseOperatorImpl implements FileBrowseOperator {

    /* JADX INFO: renamed from: b */
    public static final String f38332b = "FileBrowseOperatorImpl";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38333a;

    public static class CustomRcspCallback<C extends CommandBase> implements RcspCommandCallback<C> {

        /* JADX INFO: renamed from: a */
        public final String f38343a;

        /* JADX INFO: renamed from: b */
        public final OperatCallback f38344b;

        public CustomRcspCallback(String str, OperatCallback operatCallback) {
            this.f38343a = str;
            this.f38344b = operatCallback;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice bluetoothDevice, C c) {
            if (c.getStatus() != 0) {
                onErrCode(bluetoothDevice, RcspErrorCode.buildJsonError(c.getId(), 12292, c.getStatus(), null));
                return;
            }
            OperatCallback operatCallback = this.f38344b;
            if (operatCallback != null) {
                operatCallback.onSuccess();
            }
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
            JL_Log.m27880e(FileBrowseOperatorImpl.f38332b, this.f38343a, RcspUtil.formatString("device: %s, %s", bluetoothDevice, baseError));
            OperatCallback operatCallback = this.f38344b;
            if (operatCallback != null) {
                operatCallback.onError(baseError.getSubCode());
            }
        }
    }

    public FileBrowseOperatorImpl(RcspOpImpl rcspOpImpl) {
        this.f38333a = rcspOpImpl;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public boolean dataHasPacket() {
        return false;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void deleteFile(final int i, final byte b, final int i2, final boolean z, boolean z2, final OperatCallback operatCallback) {
        if (z2) {
            m27854a((byte) 1, new OperatCallback() { // from class: com.jieli.jl_rcsp.tool.filebrowse.FileBrowseOperatorImpl.1
                @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
                public void onError(int i3) {
                    operatCallback.onError(i3);
                }

                @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
                public void onSuccess() {
                    FileBrowseOperatorImpl.this.m27855a(i, b, i2, z, operatCallback);
                }
            });
        } else {
            m27855a(i, b, i2, z, operatCallback);
        }
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void formatDevice(final int i, final OperatCallback operatCallback) {
        m27854a((byte) 2, new OperatCallback() { // from class: com.jieli.jl_rcsp.tool.filebrowse.FileBrowseOperatorImpl.2
            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onError(int i2) {
                OperatCallback operatCallback2 = operatCallback;
                if (operatCallback2 != null) {
                    operatCallback2.onError(i2);
                }
            }

            @Override // com.jieli.jl_filebrowse.interfaces.OperatCallback
            public void onSuccess() {
                JL_Log.m27883i(FileBrowseOperatorImpl.f38332b, "formatDevice", "Start formatting");
                FileBrowseOperatorImpl.this.f38333a.sendRcspCommand(FileBrowseOperatorImpl.this.f38333a.getTargetDevice(), new DeviceFormatCmd(new DeviceFormatCmd.Param(i)), 30000, new CustomRcspCallback("formatDevice", operatCallback));
            }
        });
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileBrowseOperator
    public void sendPathDataCmd(PathData pathData, byte[] bArr, OperatCallback operatCallback) {
        RcspOpImpl rcspOpImpl = this.f38333a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildSendPathDataCmd(pathData), new CustomRcspCallback("sendPathDataCmd", operatCallback));
    }

    /* JADX INFO: renamed from: a */
    public final void m27854a(byte b, OperatCallback operatCallback) {
        RcspOpImpl rcspOpImpl = this.f38333a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildNotifyPrepareEnvCmd(b), new CustomRcspCallback("prepareDelEnv", operatCallback));
    }

    /* JADX INFO: renamed from: a */
    public final void m27855a(int i, byte b, int i2, boolean z, OperatCallback operatCallback) {
        DelDevFileCmd delDevFileCmd = new DelDevFileCmd(new DelDevFileParam(i, b, i2, z));
        RcspOpImpl rcspOpImpl = this.f38333a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), delDevFileCmd, 6000, new CustomRcspCallback("deleteFileActual", operatCallback));
    }
}
