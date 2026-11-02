package com.jieli.jl_bt_ota.tool.data_handler;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.kd2;
import com.android.mltcode.paycertificationapi.ld2;
import com.android.mltcode.paycertificationapi.md2;
import com.android.mltcode.paycertificationapi.nd2;
import com.android.mltcode.paycertificationapi.od2;
import com.ironsource.C2985d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.bt.IBtProxy;
import com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class RcspDataHandler implements IDataHandler {
    private final String a;
    private final IBtProxy b;
    private final OnDataHandlerListener c;
    private final CommandCache d;
    private final RcspParser e;
    private final CopyOnWriteArrayList<SendDataInfo<?>> f;
    private final HandlerThread g;
    private final Handler h;
    private final Handler i;
    private CommandBase j;

    public class TimeOutCheck implements Runnable {
        private final SendDataInfo<?> a;
        final /* synthetic */ RcspDataHandler b;

        public TimeOutCheck(RcspDataHandler r3, SendDataInfo<?> r4) {
            this.b = r3;
            this.a = r4;
            r4.setSendTime(System.currentTimeMillis());
        }

        @Override // java.lang.Runnable
        public void run() {
            int r0 = this.a.getOpCode();
            int r1 = this.a.getSn();
            int r2 = this.a.getReSendMax();
            int r3 = this.a.getReSendCount();
            JL_Log.w(RcspDataHandler.a(this.b), "COMMAND TIMEOUT", CommonUtil.formatString("Waiting for reply command timeout. opCode : %s, sn : %s, reSendMax : %d,  reSendCount : %d.", new Object[]{CommonUtil.formatInt(r0), CommonUtil.formatInt(r1), Integer.valueOf(r2), Integer.valueOf(r3)}));
            if (r3 >= r2) goto L6;
            this.a.setReSendCount(r3 + 1);
            this.b.addSendData(this.a);
            return;
        L6:
            RcspDataHandler.b(this.b).remove(this.a);
            RcspDataHandler.a(this.b, this.a.getDevice(), r0, r1);
            RcspDataHandler.a(this.b, this.a, OTAError.buildError(ErrorCode.SUB_ERR_SEND_TIMEOUT).setOpCode(r0));
        }
    }

    public RcspDataHandler(IBtProxy r5, OnDataHandlerListener r6) {
        String r0 = RcspDataHandler.class.getSimpleName();
        this.a = r0;
        this.f = new CopyOnWriteArrayList();
        HandlerThread r1 = new HandlerThread("RcspDataHandler");
        this.g = r1;
        this.i = new Handler(Looper.getMainLooper());
        this.b = (IBtProxy) CommonUtil.checkNotNull(r5, "IBtProxy can not be null.");
        this.c = r6;
        this.d = new CommandCache();
        this.e = new RcspParser();
        r1.start();
        this.h = new Handler(r1.getLooper(), new kd2());
        JL_Log.i(r0, C2985d4.a.f, "" + this);
    }

    public static /* synthetic */ void O00(RcspDataHandler r0, ReceivedDataInfo r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void OXO1(CommandCallback r0, SendDataInfo r1) {
        a(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(RcspDataHandler r0, SendDataInfo r1) {
        r0.b(r1);
    }

    public static /* synthetic */ void XO0O10(RcspDataHandler r0, CommandCallback r1, BaseError r2, SendDataInfo r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ String a(RcspDataHandler r0) {
        return r0.a;
    }

    public static /* synthetic */ CopyOnWriteArrayList b(RcspDataHandler r0) {
        return r0.f;
    }

    private boolean c(SendDataInfo<?> r7) {
        byte[] r0 = r7.getSendData();
        int r2 = 0;
        if (r0 != null) goto L5;
    L25:
        JL_Log.i(this.a, "sendData", "Failed to pack data.");
        return false;
    L5:
        if (r0.length == 0) goto L25;
        int r3 = r7.getDeviceReceiveMtu();
        if (r0.length <= r3) goto L11;
        JL_Log.e(this.a, "sendData", CommonUtil.formatString("Data size(%d) exceeds communication mtu(%d).", new Object[]{Integer.valueOf(r0.length), Integer.valueOf(r3)}));
        return false;
    L11:
        boolean r4 = false;
    L13:
        if (r2 >= 3) goto L23;
        r4 = this.b.writeData(r7.getDevice(), r0);
        if (r4 == true) goto L23;
        Thread.sleep(10);     // Catch: InterruptedException -> L20
    L22:
        r2 = r2 + 1;
    L20:
        e = move-exception;
        e.printStackTrace();
    L23:
        JL_Log.i(this.a, "sendData", "" + r4);
        return r4;
    }

    private int d(SendDataInfo<?> r2) {
        if (r2 != null) goto L5;
        return Integer.MAX_VALUE;
    L5:
        int r0 = r2.getSn() << 16;
        return r2.getOpCode() | r0;
    }

    public static /* synthetic */ boolean iO(Message r0) {
        return a(r0);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addRecvData(final ReceivedDataInfo r3) {
        this.h.post(new md2(this, r3));
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addSendData(final SendDataInfo<?> r3) {
        this.h.post(new od2(this, r3));
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void release() {
        this.j = null;
        this.h.removeCallbacksAndMessages(null);
        this.i.removeCallbacksAndMessages(null);
        this.d.release();
        this.e.release();
        this.f.clear();
        if (this.g.isInterrupted() == true) goto L5;
        this.g.quitSafely();
    L5:
        JL_Log.i(this.a, "release", "" + this);
    }

    public static /* synthetic */ void a(RcspDataHandler r0, BluetoothDevice r1, int r2, int r3) {
        r0.a(r1, r2, r3);
    }

    private /* synthetic */ void b(SendDataInfo r5) {
        if (c(r5) == true) goto L6;
        a(r5, OTAError.buildError(12290));
        return;
    L6:
        BluetoothDevice r0 = r5.getDevice();
        JL_Log.d(this.a, "TX", "device : " + r0 + ", " + r5.getCommand());
        r5.setSendTime(a());
        if (r5.getBasePacket().getHasResponse() != 1) goto L13;
        this.d.putCommandBase(r0, r5.getCommand());
        if (this.f.contains(r5) == true) goto L11;
        this.f.add(r5);
    L11:
        int r1 = d(r5);
        this.h.removeMessages(r1);
        Handler r2 = this.h;
        r2.sendMessageDelayed(r2.obtainMessage(r1, new TimeOutCheck(this, r5)), r5.getTimeoutMs());
        return;
    L13:
        r5.getCommand().setStatus(0);
        a(r5);
    }

    public static /* synthetic */ void a(RcspDataHandler r0, SendDataInfo r1, BaseError r2) {
        r0.a(r1, r2);
    }

    private static /* synthetic */ boolean a(Message r1) {
        Object r2 = r1.obj;
        if ((r2 instanceof Runnable) == false) goto L7;
        ((Runnable) r2).run();
        return true;
    L7:
        return true;
    }

    private /* synthetic */ void a(ReceivedDataInfo r9) {
        BluetoothDevice r0 = r9.getDevice();
        byte[] r1 = r9.getData();
        ArrayList<BasePacket> r10 = this.e.findPacketData(r9.getDeviceSendMtu(), r1);
        if (r10 != null) goto L5;
    L21:
        JL_Log.w(this.a, "addRecvData", "Not found Command. data : " + CHexConver.byte2HexStr(r1));
        return;
    L5:
        if (r10.isEmpty() == true) goto L21;
        int r2 = r10.size();
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L20;
        BasePacket r4 = r10.get(r3);
        r3 = r3 + 1;
        BasePacket r5 = r4;
        if (r5.getType() == 1) goto L11;
        SendDataInfo<?> r6 = a(r0, r5);
        if (r6 == null) goto L14;
        CommandBase<?, ?> r7 = ParseHelper.convert2Command(r5, b(r0, r5));
        if (r7 != null) goto L18;
        a(r6, OTAError.buildError(12293).setOpCode(r5.getOpCode()));
    L19:
        this.f.remove(r6);
        this.h.removeMessages(d(r6));
        a(r0, r5.getOpCode(), r5.getOpCodeSn());
        goto L8
    L18:
        a(r0, r7);
        r6.setCommand(r7);
        a(r6);
        goto L19
    L14:
        JL_Log.w(this.a, "addRecvData", "Not found cache send data. " + r5);
        goto L8
    L11:
        a(r0, ParseHelper.convert2Command(r5, null));
        goto L8
    }

    private CommandBase<?, ?> b(BluetoothDevice r3, BasePacket r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        return this.d.getCommand(r3, r4.getOpCode(), r4.getOpCodeSn());
    }

    private long a() {
        return System.currentTimeMillis();
    }

    private void a(BluetoothDevice r2, int r3, int r4) {
        this.d.removeCommandBase(r2, r3, r4);
    }

    private SendDataInfo<?> a(BluetoothDevice r7, BasePacket r8) {
        if (this.f.isEmpty() == true) goto L19;
        if (r8 == null) goto L19;
        Iterator<SendDataInfo<?>> r0 = this.f.iterator();
    L8:
        if (r0.hasNext() == false) goto L19;
        SendDataInfo<?> r2 = r0.next();
        CommandBase r3 = r2.getCommand();
        if (r3 == null) goto L8;
        if (r3.getId() != r8.getOpCode()) goto L8;
        if (r3.getOpCodeSn() != r8.getOpCodeSn()) goto L8;
        if (BluetoothUtil.deviceEquals(r7, r2.getDevice()) == false) goto L8;
        return r2;
    L19:
        return null;
    }

    private void a(Runnable r3) {
        if (r3 != null) goto L5;
        return;
    L5:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L8;
        r3.run();
        return;
    L8:
        this.i.post(r3);
    }

    private void a(final SendDataInfo<?> r6, final BaseError r7) {
        if (r6 != null) goto L5;
        return;
    L5:
        if (r7 != null) goto L8;
        JL_Log.d(this.a, "callError", "error is null");
        return;
    L8:
        r7.setOpCode(r6.getOpCode()).setCmdSn(r6.getSn());
        final CommandCallback<C> r1 = r6.getCallback();
        JL_Log.w(this.a, "callError", "device : " + r6.getDevice() + ", " + r7);
        a(new nd2(this, r1, r7, r6));
    }

    private /* synthetic */ void a(CommandCallback r1, BaseError r2, SendDataInfo r3) {
        if (r1 == null) goto L4;
        r1.onErrCode(r2);
    L4:
        OnDataHandlerListener r4 = this.c;
        if (r4 == null) goto L8;
        r4.onRCSPError(r3.getDevice(), r2);
        return;
    }

    private <C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void a(final SendDataInfo<C> r3) {
        if (r3 == null) goto L9;
        final CommandCallback<C> r0 = r3.getCallback();
        if (r0 != null) goto L7;
        return;
    L7:
        a(new ld2(r0, r3));
        return;
    }

    private static /* synthetic */ void a(CommandCallback r0, SendDataInfo r1) {
        r0.onCommandResponse(r1.getCommand());
    }

    private void a(BluetoothDevice r4, CommandBase<?, ?> r5) {
        if (r5 == null) goto L16;
        JL_Log.d(this.a, "RX", "device : " + r4 + ", " + r5);
        if (r5.isResponseCmd() == false) goto L7;
    L11:
        OnDataHandlerListener r0 = this.c;
        if (r0 == null) goto L15;
        r0.onReceivedCmd(r4, r5);
        return;
    L15:
        return;
    L7:
        if (r5.equals(this.j) == false) goto L10;
        JL_Log.w(this.a, "RX", "Same as the previous command, skip this commands. opCode : " + CommonUtil.formatInt(r5.getId()) + ", sn : " + CommonUtil.formatInt(r5.getOpCodeSn()));
        return;
    L10:
        this.j = r5;
        goto L11
    }
}
