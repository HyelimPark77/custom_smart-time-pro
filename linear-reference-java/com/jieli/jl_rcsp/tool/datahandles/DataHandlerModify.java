package com.jieli.jl_rcsp.tool.datahandles;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.I1XIO0i;
import com.android.mltcode.paycertificationapi.O0O0iI;
import com.android.mltcode.paycertificationapi.X00IX1X1i;
import com.android.mltcode.paycertificationapi.XXXIOiI;
import com.android.mltcode.paycertificationapi.iO0XO1X1;
import com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.DataInfo;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class DataHandlerModify implements DataHandler {
    public final String a;
    public final DeviceStatusManager b;
    public final IBluetoothProxy c;
    public final BasePacketParse d;
    public final DataInfoCache e;
    public final HandlerThread f;
    public final Handler g;
    public final Handler h;

    public class TimeOutCheck implements Runnable {
        public final DataInfo a;
        public final /* synthetic */ DataHandlerModify b;

        public TimeOutCheck(DataHandlerModify r3, DataInfo r4) {
            this.b = r3;
            this.a = r4;
            r4.setSendTime(System.currentTimeMillis());
        }

        @Override // java.lang.Runnable
        public void run() {
            DataInfo r0 = this.a;
            if (r0 == null) goto L14;
            BasePacket r1 = r0.getBasePacket();
            if (r1 != null) goto L8;
            return;
        L8:
            BluetoothDevice r2 = this.a.getDevice();
            int r3 = r1.getOpCode();
            int r4 = r1.getOpCodeSn();
            int r5 = this.a.getReSendCount();
            JL_Log.w(DataHandlerModify.a(this.b), "TimeOutCheck", RcspUtil.formatString("Waiting for reply command timeout.\ndevice : %s, op : %d(0x%X), sn : %d, reSendCount : %d.", new Object[]{r2, Integer.valueOf(r3), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)}));
            if (r5 >= 3) goto L12;
            this.a.setReSendCount(r5 + 1);
            DataHandlerModify.b(this.b).remove(this.a);
            this.b.addSendData(this.a);
            return;
        L12:
            DataHandlerModify.b(this.b).remove(this.a);
            CommandHelper.getInstance().removeCommandBase(r2, r1);
            BaseError r6 = new BaseError(12290);
            DataHandlerModify.a(this.b, this.a, r6);
            return;
        }
    }

    public DataHandlerModify(IBluetoothProxy r4) {
        this.a = DataHandlerModify.class.getSimpleName();
        this.b = DeviceStatusManager.getInstance();
        this.e = new DataInfoCache();
        HandlerThread r0 = new HandlerThread("DataHandlerModify");
        this.f = r0;
        this.h = new Handler(Looper.getMainLooper());
        if (r4 == null) goto L7;
        this.c = r4;
        this.d = new BasePacketParse();
        r0.start();
        this.g = new Handler(r0.getLooper(), new XXXIOiI());
        return;
    L7:
        throw new NullPointerException("IBluetoothProxy can not be null.");
    }

    public static /* synthetic */ String a(DataHandlerModify r0) {
        return r0.a;
    }

    public static /* synthetic */ DataInfoCache b(DataHandlerModify r0) {
        return r0.e;
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addRecvData(final DataInfo r3) {
        this.g.post(new X00IX1X1i(this, r3));
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addSendData(final DataInfo r3) {
        r3.setSendTime(a());
        this.g.post(new O0O0iI(this, r3));
    }

    public final boolean c(DataInfo r7) {
        byte[] r0 = ParseHelper.packSendBasePacket(r7.getBasePacket());
        int r2 = 0;
        if (r0 != null) goto L6;
        JL_Log.i(this.a, "sendData", "Packing data failed.");
        return false;
    L6:
        int r3 = a(r7.getDevice());
        if (r0.length <= r3) goto L10;
        JL_Log.e(this.a, "sendData", "The length of the sent data exceeds the limit[" + r3 + "].");
        return false;
    L10:
        boolean r4 = false;
    L12:
        if (r2 >= 3) goto L22;
        r4 = this.c.sendDataToDevice(r7.getDevice(), r0);
        if (r4 == true) goto L22;
        Thread.sleep(10);     // Catch: InterruptedException -> L19
    L21:
        r2 = r2 + 1;
    L19:
        e = move-exception;
        e.printStackTrace();
    L22:
        JL_Log.d(this.a, "sendData", RcspUtil.formatString("result : %s, data : [%s]", new Object[]{Boolean.valueOf(r4), CHexConver.byte2HexStr(r0)}));
        return r4;
    }

    public final int d(DataInfo r2) {
        if (r2 != null) goto L5;
        return Integer.MAX_VALUE;
    L5:
        int r0 = r2.getBasePacket().getOpCodeSn() << 16;
        return r2.getBasePacket().getOpCode() | r0;
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void release() {
        JL_Log.i(this.a, "release", "=====>>>");
        this.g.removeCallbacksAndMessages(null);
        this.d.release();
        CommandHelper.getInstance().release();
        if (this.e.isEmpty() == true) goto L10;
        ArrayList r0 = new ArrayList(this.e);
        this.e.clear();
        Iterator r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        DataInfo r2 = (DataInfo) r1.next();
        RcspCommandCallback r3 = r2.getRcspCmdCallback();
        if (r3 == null) goto L6;
        r3.onErrCode(r2.getDevice(), new BaseError(8192));
    L10:
        this.f.quitSafely();
    }

    public static /* synthetic */ void a(DataHandlerModify r0, DataInfo r1, BaseError r2) {
        r0.a(r1, r2);
    }

    public final /* synthetic */ void b(DataInfo r5) {
        if (c(r5) == true) goto L7;
        a(r5, new BaseError(12288));
        return;
    L7:
        if (r5.getBasePacket().getHasResponse() != 1) goto L10;
        this.e.add(r5);
        Handler r0 = this.g;
        r0.sendMessageDelayed(r0.obtainMessage(d(r5), new TimeOutCheck(this, r5)), r5.getTimeoutMs());
        return;
    L10:
        BasePacket r1 = r5.getBasePacket();
        int r2 = r1.getOpCodeSn();
        r1.setOpCodeSn(256);
        CommandBase r3 = ParseHelper.convert2Command(r5.getDevice(), r1);
        if (r3 == null) goto L13;
        r3.setOpCodeSn(r2);
    L13:
        a(r5, r3);
    }

    public static /* synthetic */ boolean a(Message r1) {
        Object r2 = r1.obj;
        if ((r2 instanceof Runnable) == false) goto L7;
        ((Runnable) r2).run();
        return true;
    L7:
        return true;
    }

    public final /* synthetic */ void a(DataInfo r8) {
        ArrayList<BasePacket> r0 = this.d.findPacketData(b(r8.getDevice()), r8.getRecvData());
        if (r0 != null) goto L5;
    L22:
        JL_Log.w(this.a, "addRecvData", "Not found command.");
        return;
    L5:
        if (r0.isEmpty() == true) goto L22;
        Iterator<BasePacket> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L21;
        BasePacket r2 = r1.next();
        if (r2.getType() == 1) goto L12;
        DataInfo r3 = this.e.getDataInfo(r2);
        if (r3 == null) goto L15;
        CommandBase r4 = ParseHelper.convert2Command(r3.getDevice(), r2);
        if (r4 != null) goto L19;
        a(r3, new BaseError(12289));
    L20:
        this.e.remove(r3);
        this.g.removeMessages(d(r3));
        a(r3, r4);
        CommandHelper.getInstance().removeCommandBase(r3.getDevice(), r2);
        goto L9
    L19:
        this.c.receiveDataFromDevice(r8.getDevice(), r2);
        goto L20
    L15:
        JL_Log.w(this.a, "addRecvData", "No cached command found. " + r2);
        goto L9
    L12:
        this.c.receiveDataFromDevice(r8.getDevice(), r2);
        goto L9
    }

    public final int b(BluetoothDevice r2) {
        return this.b.getMaxReceiveMtu(r2);
    }

    public final /* synthetic */ void b(DataInfo r4, BaseError r5) {
        JL_Log.w(this.a, "callError", "device : " + r4.getDevice() + ", " + r5);
        r4.getRcspCmdCallback().onErrCode(r4.getDevice(), r5);
        this.c.callbackErrorEvent(r5);
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final int a(BluetoothDevice r2) {
        return this.b.getMaxCommunicationMtu(r2);
    }

    public final void a(final DataInfo r3, final BaseError r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.getRcspCmdCallback() == null) goto L13;
        if (r4 != null) goto L8;
        return;
    L8:
        if (r3.getBasePacket() == null) goto L10;
        r4.setOpCode(r3.getBasePacket().getOpCode());
    L10:
        this.h.post(new I1XIO0i(this, r3, r4));
        return;
    }

    public final void a(final DataInfo r4, final CommandBase r5) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.getRcspCmdCallback() == null) goto L10;
        if (r5 == null) goto L11;
        final RcspCommandCallback r0 = r4.getRcspCmdCallback();
        this.h.post(new iO0XO1X1(r0, r4, r5));
        return;
    L11:
        return;
    }

    public static /* synthetic */ void a(RcspCommandCallback r0, DataInfo r1, CommandBase r2) {
        if (r0 == null) goto L5;
        r0.onCommandResponse(r1.getDevice(), r2);
        return;
    }
}
