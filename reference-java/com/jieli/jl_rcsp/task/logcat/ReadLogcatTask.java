package com.jieli.jl_rcsp.task.logcat;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.ReadErrorMsgCmd;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadLogcatTask extends TaskBase {
    public static int WAIT_CMD_TIMEOUT = 12000;

    /* JADX INFO: renamed from: g */
    public static final int f38130g = 4118;

    /* JADX INFO: renamed from: b */
    public BluetoothDevice f38131b;

    /* JADX INFO: renamed from: c */
    public final ByteArrayOutputStream f38132c;

    /* JADX INFO: renamed from: d */
    public ReadErrorMsgCmd.ReadErrorMsgResponse f38133d;

    /* JADX INFO: renamed from: e */
    public final Handler f38134e;

    /* JADX INFO: renamed from: f */
    public final OnRcspCallback f38135f;

    public ReadLogcatTask(RcspOpImpl rcspOpImpl) throws RuntimeException {
        super(rcspOpImpl);
        this.f38132c = new ByteArrayOutputStream();
        this.f38134e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.sf2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f11016IO.m27555a(message);
            }
        });
        this.f38135f = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.task.logcat.ReadLogcatTask.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                super.onRcspCommand(bluetoothDevice, commandBase);
                if (commandBase != null && commandBase.getId() == 41 && ReadLogcatTask.this.m27566a(bluetoothDevice)) {
                    ReadErrorMsgCmd readErrorMsgCmd = (ReadErrorMsgCmd) commandBase;
                    if (((ReadErrorMsgCmd.ReadErrorMsgParam) readErrorMsgCmd.getParam()).getOp() == 1) {
                        ReadLogcatTask.this.m27564a(readErrorMsgCmd);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspDataCmd(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                DataParam dataParam;
                super.onRcspDataCmd(bluetoothDevice, commandBase);
                if (ReadLogcatTask.this.m27566a(bluetoothDevice) && (dataParam = (DataParam) ((DataCmd) commandBase).getParam()) != null && dataParam.getXmOpCode() == 41) {
                    ReadLogcatTask.this.m27565a(dataParam.getData());
                }
            }
        };
    }

    private void release() {
        this.f38131b = null;
        this.mRcspOp.unregisterOnRcspCallback(this.f38135f);
        this.f38134e.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
    }

    public byte[] getResult() {
        return this.f38132c.toByteArray();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
            return;
        }
        if (!this.mRcspOp.isRcspInit()) {
            m27561a(8192);
        } else if (!this.mRcspOp.getDeviceInfo().isSupportReadErrorMSg()) {
            m27561a(4353);
        } else {
            JL_Log.m27877d(this.tag, "start", "device support reading error message.");
            m27568c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27567b() {
        this.f38131b = getConnectedDevice();
        this.f38132c.reset();
        this.mRcspOp.registerOnRcspCallback(this.f38135f);
        callbackBegin();
    }

    /* JADX INFO: renamed from: c */
    public final void m27568c() {
        m27567b();
        this.mRcspOp.sendRcspCommand(this.f38131b, CommandBuilder.buildStartReadErrorMsgCmd(), new CustomRcspActionCallback("startReadLogcat", new OnOperationCallback<ReadErrorMsgCmd.ReadErrorMsgResponse>() { // from class: com.jieli.jl_rcsp.task.logcat.ReadLogcatTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                ReadLogcatTask.this.m27562a(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(ReadErrorMsgCmd.ReadErrorMsgResponse readErrorMsgResponse) {
                if (readErrorMsgResponse == null) {
                    onFailed(new BaseError(12289, WatchError.getErrorDesc(12289)));
                    return;
                }
                ReadLogcatTask.this.m27563a(readErrorMsgResponse);
                if (ReadLogcatTask.this.f38133d.getSize() > 0) {
                    ReadLogcatTask.this.f38134e.removeMessages(4118);
                    ReadLogcatTask.this.f38134e.sendEmptyMessageDelayed(4118, ReadLogcatTask.WAIT_CMD_TIMEOUT);
                    return;
                }
                JL_Log.m27887w(((TaskBase) ReadLogcatTask.this).tag, "startReadLogcat", "Device has no abnormal information. file size = " + ReadLogcatTask.this.f38133d.getSize());
                ReadLogcatTask.this.m27560a();
            }
        }, new IHandleResult<ReadErrorMsgCmd.ReadErrorMsgResponse, ReadErrorMsgCmd>() { // from class: com.jieli.jl_rcsp.task.logcat.ReadLogcatTask.2
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, ReadErrorMsgCmd readErrorMsgCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public ReadErrorMsgCmd.ReadErrorMsgResponse handleResult(BluetoothDevice bluetoothDevice, ReadErrorMsgCmd readErrorMsgCmd) {
                if (readErrorMsgCmd == null || readErrorMsgCmd.getStatus() != 0) {
                    return null;
                }
                return (ReadErrorMsgCmd.ReadErrorMsgResponse) readErrorMsgCmd.getResponse();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m27555a(Message message) {
        if (message.what != 4118) {
            return true;
        }
        JL_Log.m27887w(this.tag, "MSG_WAIT_COMMAND_TIMEOUT", "");
        if (!isRun()) {
            return true;
        }
        m27562a(12290, "Waiting for data timeout.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m27563a(ReadErrorMsgCmd.ReadErrorMsgResponse readErrorMsgResponse) {
        this.f38133d = readErrorMsgResponse;
    }

    /* JADX INFO: renamed from: a */
    public final void m27565a(byte[] bArr) {
        if (bArr != null && bArr.length != 0 && isRun()) {
            try {
                if (this.f38134e.hasMessages(4118)) {
                    this.f38134e.removeMessages(4118);
                }
                this.f38132c.write(bArr);
                int size = this.f38132c.size();
                if (this.f38133d.getSize() > 0) {
                    int size2 = (size * 100) / this.f38133d.getSize();
                    if (size2 >= 100) {
                        size2 = 99;
                    }
                    callbackProgress(size2);
                }
                try {
                    return;
                } catch (IOException e) {
                    return;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                callbackError(16389, "IO Exception = " + e2.getMessage());
                try {
                    return;
                } catch (IOException e3) {
                    return;
                }
            } finally {
                try {
                    this.f38132c.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        JL_Log.m27887w(this.tag, "handleLogcat", "invalid param.");
    }

    /* JADX INFO: renamed from: a */
    public final void m27564a(ReadErrorMsgCmd readErrorMsgCmd) {
        if (readErrorMsgCmd != null && isRun()) {
            byte[] byteArray = this.f38132c.toByteArray();
            final short sCRC16 = CryptoUtil.CRC16(byteArray, (short) 0);
            final short crc = this.f38133d.getCrc();
            final int i = crc != sCRC16 ? 6 : 0;
            JL_Log.m27877d(this.tag, "handleStopRead", RcspUtil.formatString("sdk read logcat crc = %d(0x%X), firmware crc = %d(0x%X), status = %d", Short.valueOf(sCRC16), Short.valueOf(sCRC16), Short.valueOf(crc), Short.valueOf(crc), Integer.valueOf(i)));
            readErrorMsgCmd.setStatus(i);
            ReadErrorMsgCmd.ResponseReadResult responseReadResult = new ReadErrorMsgCmd.ResponseReadResult();
            responseReadResult.setSize(byteArray.length);
            responseReadResult.setCrc(sCRC16);
            readErrorMsgCmd.setParam(responseReadResult);
            this.mRcspOp.sendCommandResponse(this.f38131b, readErrorMsgCmd, new RcspCommandCallback<ReadErrorMsgCmd>() { // from class: com.jieli.jl_rcsp.task.logcat.ReadLogcatTask.3
                @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
                    ReadLogcatTask.this.m27562a(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
                public void onCommandResponse(BluetoothDevice bluetoothDevice, ReadErrorMsgCmd readErrorMsgCmd2) {
                    if (i == 0) {
                        ReadLogcatTask.this.m27560a();
                        return;
                    }
                    ReadLogcatTask.this.m27562a(12544, "Check data crc error. firmware crc = " + ((int) crc) + ", data crc = " + ((int) sCRC16));
                }
            });
            return;
        }
        JL_Log.m27887w(this.tag, "handleStopRead", "Reading logcat did not start.");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27566a(BluetoothDevice bluetoothDevice) {
        return (bluetoothDevice == null || this.f38131b == null || !bluetoothDevice.getAddress().equals(this.f38131b.getAddress())) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m27561a(int i) {
        m27562a(i, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m27562a(int i, String str) {
        JL_Log.m27887w(this.tag, "postError", "code : " + i + ", " + str);
        if (str == null) {
            callbackError(i);
        } else {
            callbackError(i, str);
        }
        release();
    }

    /* JADX INFO: renamed from: a */
    public final void m27560a() {
        callbackProgress(100);
        callbackFinish();
        release();
    }
}
