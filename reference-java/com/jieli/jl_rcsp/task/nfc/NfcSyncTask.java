package com.jieli.jl_rcsp.task.nfc;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationNoResponseCmd;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.BooleanNfcActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class NfcSyncTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final BluetoothDevice f38143b;

    /* JADX INFO: renamed from: c */
    public final int f38144c;

    /* JADX INFO: renamed from: d */
    public final ByteArrayOutputStream f38145d;

    /* JADX INFO: renamed from: e */
    public List<NfcMsg> f38146e;

    /* JADX INFO: renamed from: f */
    public final Handler f38147f;

    /* JADX INFO: renamed from: g */
    public final OnRcspCallback f38148g;

    public NfcSyncTask(RcspOpImpl rcspOpImpl, BluetoothDevice bluetoothDevice, int i) throws RuntimeException {
        super(rcspOpImpl);
        this.f38145d = new ByteArrayOutputStream();
        this.f38146e = new ArrayList();
        this.f38147f = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.b81
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f5684IO.m27574a(message);
            }
        });
        this.f38148g = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.task.nfc.NfcSyncTask.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice2, CommandBase commandBase) {
                if (NfcSyncTask.this.isRun() && commandBase.getId() == 164 && (commandBase instanceof NFCOperationNoResponseCmd) && ((NFCOperationNoResponseCmd.Param) ((NFCOperationNoResponseCmd) commandBase).getParam()).getOp() == 1) {
                    NfcSyncTask.this.m27575b();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspDataCmd(BluetoothDevice bluetoothDevice2, CommandBase commandBase) {
                if (NfcSyncTask.this.isRun() && commandBase.getId() == 1) {
                    DataCmd dataCmd = (DataCmd) commandBase;
                    if (((DataParam) dataCmd.getParam()).getXmOpCode() != 164) {
                        return;
                    }
                    NfcSyncTask.this.m27573a(((DataParam) dataCmd.getParam()).getData());
                }
            }
        };
        this.f38143b = bluetoothDevice;
        this.f38144c = i;
    }

    /* JADX INFO: renamed from: c */
    private void m27577c() {
        this.mRcspOp.registerOnRcspCallback(this.f38148g);
        this.f38145d.reset();
        callbackBegin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i, String str) {
        JL_Log.m27880e(this.tag, "onError", "code : " + i + ", " + str);
        release();
        if (str == null) {
            callbackError(i);
        } else {
            callbackError(i, str);
        }
    }

    private void release() {
        this.f38145d.reset();
        this.mRcspOp.unregisterOnRcspCallback(this.f38148g);
        this.f38147f.removeCallbacksAndMessages(null);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        isRun();
    }

    public List<NfcMsg> getNfcMsgs() {
        return this.f38146e;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (!isRun()) {
            JL_Log.m27880e(this.tag, "start", "Task is in progress.");
            return;
        }
        JL_Log.m27877d(this.tag, "start", "");
        m27577c();
        this.mRcspOp.sendRcspCommand(this.f38143b, CommandBuilder.buildStartNFCInfoSyncCmd(this.f38144c), new BooleanNfcActionCallback("StartNFCInfoSync", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.nfc.NfcSyncTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                NfcSyncTask.this.onError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                NfcSyncTask.this.f38147f.removeMessages(4386);
                NfcSyncTask.this.f38147f.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m27575b() {
        byte[] byteArray = this.f38145d.toByteArray();
        this.f38146e = m27578b(byteArray);
        JL_Log.m27880e(this.tag, "onFinish", "data len : " + byteArray.length);
        release();
        callbackFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m27574a(Message message) {
        if (message.what != 4386) {
            return true;
        }
        JL_Log.m27880e(this.tag, "MSG_WAITING_FOR_DATA_TIMEOUT", "");
        callbackError(12290);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final List<NfcMsg> m27578b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        JL_Log.m27877d(this.tag, "parseNfcMsgList", "data = " + CHexConver.byte2HexStr(bArr));
        if (bArr.length > 44) {
            int i = 0;
            while (i < bArr.length) {
                int i2 = i + 42;
                int i3 = i + 44;
                if (bArr.length <= i3) {
                    break;
                }
                int iBytesToInt = CHexConver.bytesToInt(bArr, i2, 2);
                JL_Log.m27877d(this.tag, "parseNfcMsgList", "nfcHeadLen = " + iBytesToInt + ", start = " + i2);
                if (bArr.length < i3 + iBytesToInt) {
                    break;
                }
                int i4 = iBytesToInt + 44;
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i, bArr2, 0, i4);
                i += i4;
                NfcMsg nfcMsg = NfcMsg.parseNfcMsg(bArr2);
                JL_Log.m27877d(this.tag, "parseNfcMsgList", "nfcMsg = " + nfcMsg);
                if (nfcMsg != null) {
                    arrayList.add(nfcMsg);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27573a(byte[] bArr) {
        if (!isRun() || bArr == null || bArr.length == 0) {
            return;
        }
        this.f38147f.removeMessages(4386);
        try {
            JL_Log.m27877d(this.tag, "onData", "outputStream size =  " + this.f38145d.size() + ", data = " + CHexConver.byte2HexStr(bArr));
            this.f38145d.write(bArr);
            this.f38147f.sendEmptyMessageDelayed(4386, (long) TaskBase.TIMEOUT);
        } catch (IOException e) {
            e.printStackTrace();
            callbackError(16389, "IO Exception = " + e.getMessage());
        }
    }
}
