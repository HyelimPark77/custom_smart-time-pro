package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.data.IDataTransferOp;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.data.DataTransferCmd;
import com.jieli.jl_rcsp.model.data.DataParams;
import com.jieli.jl_rcsp.model.data.ReadDataCache;
import com.jieli.jl_rcsp.model.data.ReadParams;
import com.jieli.jl_rcsp.model.data.SendDataCache;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
class DataTransferOpImpl implements IDataTransferOp {
    public static int WAITING_FOR_DATA_TIMEOUT = 20000;
    public static final String h = "DataTransferOpImpl";
    public static volatile DataTransferOpImpl i = null;
    public static final int j = 5237;
    public final RcspOpImpl a;
    public final DeviceStatusManager b;
    public final CallbackManager c;
    public volatile SendDataCache d;
    public volatile ReadDataCache e;
    public final Handler f;
    public final OnRcspCallback g;

    public static class CallbackManager extends BaseCallbackManager<OnDataTransferListener> implements OnDataTransferListener {
        public CallbackManager(Handler r1) {
            super(r1);
        }

        public static /* synthetic */ void a(BluetoothDevice r0, int r1, byte[] r2, OnDataTransferListener r3) {
            r3.onReceiveData(r0, r1, r2);
        }

        @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
        public void onError(final BluetoothDevice r2, final BaseError r3) {
            callbackEvent(new XIi00iiXO(r2, r3));
        }

        @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
        public void onReceiveData(final BluetoothDevice r2, final int r3, final byte[] r4) {
            callbackEvent(new iO(r2, r3, r4));
        }

        public static /* synthetic */ void a(BluetoothDevice r0, BaseError r1, OnDataTransferListener r2) {
            r2.onError(r0, r1);
        }
    }

    static {
    }

    public DataTransferOpImpl(RcspOpImpl r4) {
        Handler r0 = new Handler(Looper.getMainLooper(), new OXO1(this));
        this.f = r0;
        OnRcspCallback r1 = new AnonymousClass7(this);
        this.g = r1;
        if (r4 == null) goto L7;
        this.a = r4;
        this.b = DeviceStatusManager.getInstance();
        this.c = new CallbackManager(r0);
        r4.registerOnRcspCallback(r1);
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    public static /* synthetic */ boolean a(DataTransferOpImpl r0) {
        return r0.d();
    }

    public static /* synthetic */ RcspOpImpl b(DataTransferOpImpl r0) {
        return r0.a;
    }

    public static /* synthetic */ SendDataCache c(DataTransferOpImpl r0) {
        return r0.d;
    }

    public static /* synthetic */ ReadDataCache d(DataTransferOpImpl r0) {
        return r0.e;
    }

    public static /* synthetic */ BluetoothDevice e(DataTransferOpImpl r0) {
        return r0.b();
    }

    public static /* synthetic */ DeviceStatusManager f(DataTransferOpImpl r0) {
        return r0.b;
    }

    public static /* synthetic */ Handler g(DataTransferOpImpl r0) {
        return r0.f;
    }

    public static DataTransferOpImpl instance(RcspOpImpl r2) {
        if (i != null) goto L16;
        monitor-enter(DataTransferOpImpl.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (i != null) goto L11;
        i = new DataTransferOpImpl(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(DataTransferOpImpl.class);     // Catch: Throwable -> L9
    L16:
        return i;
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void addListener(OnDataTransferListener r2) {
        this.c.registerCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void cancelDataTransfer(OnOperationCallback<Boolean> r2) {
        if (r2 == null) goto L5;
        r2.onSuccess(Boolean.FALSE);
        return;
    }

    public void destroy() {
        this.f.removeMessages(j);
        this.f.removeCallbacksAndMessages(null);
        this.a.unregisterOnRcspCallback(this.g);
        a(new BaseError(4098, "Cancel send data task."));
        this.c.release();
        i = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public boolean isDataTransfer() {
        return this.b.isDataTransfer(b());
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void readLargeData(DataParams r5, final OnDataEventCallback r6) {
        if (r5 != null) goto L7;
        if (r6 == null) goto L18;
        r6.onError(new BaseError(4097, "ReadParams can not be null."));
        return;
    L18:
        return;
    L7:
        if (isDataTransfer() == false) goto L9;
    L15:
        if (r6 == null) goto L19;
        r6.onError(new BaseError(4352, "Data task is in progress."));
        return;
    L19:
        return;
    L9:
        if (d() == true) goto L15;
        if (c() == true) goto L15;
        DataTransferCmd.ReadDataParam r0 = new DataTransferCmd.ReadDataParam(r5.getDataType(), r5.getVersion(), r5.getSendLimit(), r5.getReceiveLimit());
        final BluetoothDevice r7 = this.a.getConnectedDevice();
        a(r0, new AnonymousClass2(this, r6, r7));
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void removeListener(OnDataTransferListener r2) {
        this.c.unregisterCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.data.IDataTransferOp
    public void sendLargeData(SendParams r10, OnDataEventCallback r11) {
        if (r10 != null) goto L7;
        if (r11 == null) goto L16;
        r11.onError(new BaseError(4097, "SendDataParam can not be null."));
        return;
    L16:
        return;
    L7:
        if (isDataTransfer() == false) goto L9;
    L13:
        if (r11 == null) goto L17;
        r11.onError(new BaseError(4352, WatchError.getErrorDesc(4352)));
        return;
    L17:
        return;
    L9:
        if (d() == true) goto L13;
        this.d = new SendDataCache(r10, r11);
        this.b.updateDataTransfer(b(), true);
        a(new DataTransferCmd.SendDataParam(r10.getDataType(), r10.getVersion(), r10.getDataLen(), r10.getDataCrc(), r10.getSendLimit(), r10.getReceiveLimit()), new AnonymousClass1(this));
    }

    public static /* synthetic */ void a(DataTransferOpImpl r0, BluetoothDevice r1, DataTransferCmd r2, DataTransferCmd.SendDataParam r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void b(DataTransferOpImpl r0, SendDataCache r1) {
        r0.a(r1);
    }

    public final boolean c() {
        if (this.e == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean d() {
        if (this.d == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ void a(DataTransferOpImpl r0, BluetoothDevice r1, DataTransferCmd r2, DataTransferCmd.DataTransferParam r3) {
        r0.a(r1, r2, r3);
    }

    public final BluetoothDevice b() {
        return this.a.getConnectedDevice();
    }

    public static /* synthetic */ void a(DataTransferOpImpl r0, BluetoothDevice r1, BaseError r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ SendDataCache a(DataTransferOpImpl r0, SendDataCache r1) {
        r0.d = r1;
        return r1;
    }

    public static /* synthetic */ void a(DataTransferOpImpl r0, BaseError r1) {
        r0.a(r1);
    }

    public static /* synthetic */ ReadDataCache a(DataTransferOpImpl r0, ReadDataCache r1) {
        r0.e = r1;
        return r1;
    }

    public static /* synthetic */ String a() {
        return h;
    }

    public final /* synthetic */ boolean a(Message r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if (5237 != r4.what) goto L12;
        Object r5 = r4.obj;
        if ((r5 instanceof BluetoothDevice) == false) goto L13;
        a((BluetoothDevice) r5, new BaseError(12290, "Waiting for data timeout."));
        return true;
    L13:
        return true;
    L12:
        return true;
    }

    public final void a(BaseError r5) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (d() == false) goto L10;
        OnDataEventCallback r0 = this.d.getCallback();
        this.d.release();
        this.d = null;
        this.b.updateDataTransfer(b(), false);
        JL_Log.w(h, "onSendError", "device : " + b() + ", " + r5);
        if (r0 == null) goto L11;
        r0.onError(r5);
        return;
    L11:
        return;
    }

    public final void a(BluetoothDevice r5, BaseError r6) {
        if (r6 != null) goto L5;
        return;
    L5:
        if (c() == false) goto L11;
        OnDataEventCallback r0 = this.e.getCallback();
        this.f.removeMessages(j);
        this.e.release();
        this.e = null;
        this.b.updateDataTransfer(b(), false);
        JL_Log.w(h, "onReadError", "device : " + r5 + ", " + r6);
        if (r0 == null) goto L9;
        r0.onError(r6);
    L9:
        this.c.onError(r5, r6);
        return;
    }

    public final void a(SendDataCache r13) {
        if (r13 != null) goto L4;
        return;
    L4:
        if (isDataTransfer() == false) goto L13;
        int r0 = r13.getReceiveLimit();
        if ((r13.getOffset() + r0) < r13.getDataLen()) goto L9;
        boolean r7 = true;
    L10:
        int r1 = Math.min(r13.getDataLen() - r13.getOffset(), r0);
        byte[] r11 = new byte[r1];
        System.arraycopy(r13.getData(), r13.getOffset(), r11, 0, r1);
        short r9 = CryptoUtil.CRC16(r11, 0);
        r13.setSeq(r13.getSeq() + 1);
        DataTransferCmd.DataTransferParam r5 = new DataTransferCmd.DataTransferParam(r13.getDataType(), r7, r13.getSeq(), r9, r13.getOffset(), r11);
        r13.setOffset(r13.getOffset() + r1);
        a(r5, new AnonymousClass3(this));
        return;
    L9:
        r7 = false;
        goto L10
    }

    public final void a(BluetoothDevice r12, DataTransferCmd r13, DataTransferCmd.SendDataParam r14) {
        if (r13 == null) goto L11;
        if (r14 != null) goto L6;
        return;
    L6:
        if (c() == false) goto L9;
        r13.setParam(null);
        r13.setStatus(3);
        this.a.sendCommandResponse(r12, r13, null);
        return;
    L9:
        String r0 = h;
        JL_Log.d(r0, "handleDataParam", "" + r14);
        DataTransferCmd.SendDataResponse r4 = new DataTransferCmd.SendDataResponse(r14.getWay(), r14.getType(), r14.getVersion(), 0, r14.getSendDataLimit(), r14.getReceiveDataLimit());
        JL_Log.d(r0, "handleDataParam", r4 + "\n data = " + CHexConver.byte2HexStr(r4.getParamData()));
        r13.setParam(new DataTransferCmd.CustomReplyParam(r4.getParamData()));
        r13.setStatus(0);
        this.a.sendCommandResponse(r12, r13, null);
        this.e = new ReadDataCache(new ReadParams(r14.getType(), r14.getVersion(), r14.getSendDataLimit(), r14.getReceiveDataLimit(), r14.getDataLen(), r14.getCrc()));
        this.b.updateDataTransfer(b(), true);
        Handler r15 = this.f;
        r15.sendMessageDelayed(r15.obtainMessage(j, r12), WAITING_FOR_DATA_TIMEOUT);
        return;
    }

    public final void a(BluetoothDevice r19, DataTransferCmd r20, DataTransferCmd.DataTransferParam r21) {
        if (r20 == null) goto L43;
        if (r21 != null) goto L7;
        return;
    L7:
        if (c() == true) goto L10;
        r20.setParam(new DataTransferCmd.CustomReplyParam(new DataTransferCmd.DataTransferResponse(r21.getType(), true, r21.getSeq(), 7, a(7).getBytes()).getParamData()));
        r20.setStatus(0);
        this.a.sendCommandResponse(r19, r20, null);
        return;
    L10:
        this.f.removeMessages(j);
        byte[] r3 = r21.getData();
        short r7 = CryptoUtil.CRC16(r3, 0);
        String r8 = h;
        JL_Log.d(r8, "handleDataEvent", RcspUtil.formatString("device give crc = %d, hex --> %s, app count crc = %d, hex --> %s", new Object[]{Short.valueOf(r21.getCrc()), Integer.toHexString(r21.getCrc()), Short.valueOf(r7), Integer.toHexString(r7)}));
        int r11 = 1;
        if (r7 != r21.getCrc()) goto L23;
        JL_Log.d(r8, "handleDataEvent", RcspUtil.formatString("device give seq = %d, app count seq = %d", new Object[]{Integer.valueOf(r21.getSeq()), Integer.valueOf(this.e.getSeq() + 1)}));
        if ((this.e.getSeq() + 1) != r21.getSeq()) goto L24;
        boolean r9 = this.e.putData(r3);
        JL_Log.d(r8, "handleDataEvent", "write data result : " + r9 + ", data size = " + r3.length);
        if (r9 == false) goto L22;
        this.e.setOffset(r21.getOffset());
        this.e.setSeq(r21.getSeq());
        if (r21.isEnd() == false) goto L21;
        short r10 = CryptoUtil.CRC16(this.e.getOutputData(), 0);
        JL_Log.i(r8, "handleDataEvent", RcspUtil.formatString("Checking Data Integrity. totalCrc : %d, hex --> %s, device give data crc = %d, hex --> %s.", new Object[]{Short.valueOf(r10), Integer.toHexString(r10), Short.valueOf(this.e.getCrc()), Integer.toHexString(this.e.getCrc())}));
        if (r10 != this.e.getCrc()) goto L23;
    L21:
        int r16 = 0;
    L25:
        DataTransferCmd.DataTransferResponse r12 = new DataTransferCmd.DataTransferResponse(r21.getType(), r21.isEnd(), r21.getSeq(), r16, a(r16).getBytes());
        int r13 = r16;
        JL_Log.d(r8, "handleDataEvent", "result = " + r13);
        r20.setParam(new DataTransferCmd.CustomReplyParam(r12.getParamData()));
        r20.setStatus(0);
        this.a.sendCommandResponse(r19, r20, null);
        if (r13 != 0) goto L41;
        OnDataEventCallback r2 = this.e.getCallback();
        if (r21.isEnd() == false) goto L35;
        byte[] r4 = (byte[]) this.e.getOutputData().clone();
        this.e.release();
        this.e = null;
        this.b.updateDataTransfer(b(), false);
        if (r2 == null) goto L32;
        r2.onProgress(100.0f);
        r2.onStop(r21.getType(), r4);
    L32:
        this.c.onReceiveData(r19, r21.getType(), r4);
        return;
    L35:
        if (this.e.getDataLen() <= 0) goto L39;
        float r5 = ((this.e.getOffset() + r3.length) * 100.0f) / this.e.getDataLen();
        if (r2 == null) goto L39;
        r2.onProgress(r5);
    L39:
        Handler r6 = this.f;
        r6.sendMessageDelayed(r6.obtainMessage(j, r19), WAITING_FOR_DATA_TIMEOUT);
        return;
    L41:
        a(r19, RcspErrorCode.buildJsonError(48, 12293, r13, null));
        return;
    L22:
        r11 = 6;
        goto L23
    L24:
        r11 = 2;
    L23:
        r16 = r11;
        goto L25
    }

    public final void a(DataTransferCmd.SendDataParam r6, OnOperationCallback<DataTransferCmd.SendDataResponse> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "SendDataParam can not be null."));
        return;
    L8:
        return;
    L6:
        this.a.sendRcspCommand(b(), new DataTransferCmd(r6), new CustomRcspActionCallback("sendDataParam", r7, new AnonymousClass4(this)));
    }

    public final void a(DataTransferCmd.ReadDataParam r6, OnOperationCallback<DataTransferCmd.ReadDataResponse> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "ReadDataParam can not be null."));
        return;
    L8:
        return;
    L6:
        this.a.sendRcspCommand(b(), new DataTransferCmd(r6), new CustomRcspActionCallback("readDataParam", r7, new AnonymousClass5(this)));
    }

    public final void a(DataTransferCmd.DataTransferParam r6, OnOperationCallback<DataTransferCmd.DataTransferResponse> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "DataTransferParam can not be null."));
        return;
    L8:
        return;
    L6:
        this.a.sendRcspCommand(b(), new DataTransferCmd(r6), new CustomRcspActionCallback("sendDataBlock", r7, new AnonymousClass6(this)));
    }

    public final void a(int r5, OnOperationCallback<Boolean> r6) {
        this.a.sendRcspCommand(b(), new DataTransferCmd(new DataTransferCmd.CancelTransferParam(r5)), new BooleanRcspActionCallback("cancelTransfer", r6));
    }

    public static String a(int r0) {
        switch(r0) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L3;
        };
    L3:
        return "";
    L5:
        return "Missing parameter configuration.";
    L7:
        return "Read/write Data Exception.";
    L9:
        return "Data length is out of bounds.";
    L11:
        return "Transfer way is not supported.";
    L13:
        return "Data type is not supported.";
    L15:
        return "Sequence error.";
    L17:
        return "CRC error.";
    L19:
        return "Successful.";
    }
}
