package com.jieli.jl_rcsp.tool.datahandles;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.O00OI1iX;
import com.android.mltcode.paycertificationapi.i1i00X0;
import com.ironsource.C2985d4;
import com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
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
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class DataHandlerOld implements DataHandler {
    public static final String g = "jl_rcsp";
    public final IBluetoothProxy a;
    public final Handler b;
    public WorkThread c;
    public DataHandlerThread d;
    public volatile byte[] e;
    public volatile int f;

    public class DataHandlerThread extends Thread {
        public volatile boolean a;
        public volatile boolean b;
        public final List<DataInfo> c;
        public final LinkedBlockingQueue<DataInfo> d;
        public final List<DataInfo> e;
        public final List<DataInfo> f;
        public TimerThread g;
        public final /* synthetic */ DataHandlerOld h;

        public DataHandlerThread(DataHandlerOld r1) {
            this.h = r1;
            super("DataHandlerThread");
            this.c = Collections.synchronizedList(new ArrayList());
            this.d = new LinkedBlockingQueue();
            this.e = Collections.synchronizedList(new ArrayList());
            this.f = Collections.synchronizedList(new ArrayList());
        }

        public static /* synthetic */ TimerThread a(DataHandlerThread r0) {
            return r0.g;
        }

        public static /* synthetic */ void b(DataHandlerThread r0) {
            r0.g();
        }

        public final DataInfo c(DataInfo r8) {
            BasePacket r0 = r8.getBasePacket();
            if (r0 != null) goto L5;
            return null;
        L5:
            Iterator r2 = new ArrayList(this.f).iterator();
        L7:
            if (r2.hasNext() == false) goto L18;
            DataInfo r3 = (DataInfo) r2.next();
            BasePacket r4 = r3.getBasePacket();
            if (r4 == null) goto L7;
            if (r0.getOpCode() != r4.getOpCode()) goto L7;
            if (r0.getOpCodeSn() != r4.getOpCodeSn()) goto L7;
            if (RcspUtil.deviceEquals(r8.getDevice(), r3.getDevice()) == false) goto L7;
            return r3;
        L18:
            return null;
        }

        public final void d() {
            b();
            DataInfo r0 = e();
            if (r0 == null) goto L5;
            f(r0);
            return;
        L5:
            if (this.f.isEmpty() == true) goto L7;
        L11:
            a(500);
            return;
        L7:
            if (this.e.isEmpty() == false) goto L11;
            f();
        }

        public final void e(DataInfo r5) {
            BasePacket r0 = r5.getBasePacket();
            if (r0 != null) goto L6;
            return;
        L6:
            if (r0.getHasResponse() != 1) goto L8;
            this.f.remove(r5);
        L9:
            DataHandlerOld.a(this.h, r5, new BaseError(12288).setOpCode(r0.getOpCode()));
            return;
        L8:
            this.e.remove(r5);
            goto L9
        }

        public final void f() {
            TimerThread r0 = this.g;
            if (r0 != null) goto L5;
            return;
        L5:
            if (TimerThread.a(r0) == false) goto L9;
            JL_Log.i("jl_rcsp", "stopTimer", "");
            this.g.a();
            return;
        }

        public final void g() {
            if (this.b == false) goto L12;
            LinkedBlockingQueue<DataInfo> r0 = this.d;
            monitor-enter(r0);
            this.d.notify();     // Catch: Throwable -> L9
            monitor-exit(r0);     // Catch: Throwable -> L9
            return;
        L9:
            th = move-exception;
            throw th;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LinkedBlockingQueue<DataInfo> r0 = this.d;
            monitor-enter(r0);
        L23:
        L11:
            th = move-exception;
            throw th;
        L5:
            if (this.a == false) goto L16;
            if (this.d.isEmpty() == true) goto L8;
            this.b = false;     // Catch: Throwable -> L11
            d(this.d.poll());     // Catch: Throwable -> L11
            d();     // Catch: Throwable -> L11
            goto L23
        L8:
            this.b = true;     // Catch: Throwable -> L11
            d();     // Catch: Throwable -> L11
            this.d.wait();     // Catch: Throwable -> L11 InterruptedException -> L13
        L13:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L23
        L16:
            monitor-exit(r0);     // Catch: Throwable -> L11
            this.e.clear();
            this.f.clear();
            this.d.clear();
            this.a = false;
            f();
            DataHandlerOld.a(this.h, null);
            JL_Log.e("jl_rcsp", "DataHandlerThread", "exit");
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.a = true;     // Catch: Throwable -> L7
            super.start();     // Catch: Throwable -> L7
            JL_Log.i("jl_rcsp", "DataHandlerThread", "start");     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public void stopThread() {
            JL_Log.w("jl_rcsp", "DataHandlerThread", "stopThread");
            this.a = false;
            g();
        }

        public void tryToAddRecvData(DataInfo r3) {
            JL_Log.d("jl_rcsp", "tryToAddRecvData", a(r3) + ", isWaiting : " + this.b);
        }

        public void tryToAddSendData(DataInfo r3) {
            JL_Log.d("jl_rcsp", "tryToAddSendData", a(r3) + ", isWaiting : " + this.b);
        }

        public static /* synthetic */ TimerThread a(DataHandlerThread r0, TimerThread r1) {
            r0.g = r1;
            return r1;
        }

        public final void b() {
            if (this.c.isEmpty() == true) goto L22;
            JL_Log.d("jl_rcsp", "checkResponseListModify", "start --> size = " + this.c.size());
            ArrayList r0 = new ArrayList(this.c);
            this.c.clear();
            Iterator r1 = r0.iterator();
        L6:
            if (r1.hasNext() == false) goto L22;
            DataInfo r4 = (DataInfo) r1.next();
            BasePacket r5 = r4.getBasePacket();
            JL_Log.d("jl_rcsp", "checkResponseListModify", "Receive command --> " + r4);
            if (r5 == null) goto L6;
            if (r5.getType() == 1) goto L12;
            DataInfo r6 = c(r4);
            JL_Log.i("jl_rcsp", "checkResponseListModify", "Cache Command --> size = " + this.f.size() + "\t" + r6);
            if (r6 == null) goto L15;
            this.f.remove(r6);
            CommandBase r7 = ParseHelper.convert2Command(r6.getDevice(), r5);
            if (r7 != null) goto L19;
            BaseError r8 = new BaseError(12289);
            r8.setOpCode(r5.getOpCode());
            DataHandlerOld.a(this.h, r6, r8);
        L20:
            CommandHelper.getInstance().removeCommandBase(r6.getDevice(), r5);
            goto L6
        L19:
            DataHandlerOld.b(this.h).receiveDataFromDevice(r4.getDevice(), r5);
            DataHandlerOld.a(this.h, r6, r7);
            goto L20
        L15:
            JL_Log.w("jl_rcsp", "checkResponseListModify", "No cached command found.");
            goto L6
        L12:
            DataHandlerOld.b(this.h).receiveDataFromDevice(r4.getDevice(), r5);
        L22:
            if (this.f.isEmpty() == true) goto L39;
            Iterator r2 = new ArrayList(this.f).iterator();
        L25:
            if (r2.hasNext() == false) goto L39;
            DataInfo r9 = (DataInfo) r2.next();
            if (r9.isSend() == false) goto L25;
            long r10 = System.currentTimeMillis() - r9.getSendTime();
            if (r9.getTimeoutMs() >= 500) goto L33;
            r9.setTimeoutMs(500);
        L33:
            if (r10 < r9.getTimeoutMs()) goto L25;
            if (r9.getReSendCount() > 3) goto L37;
            r9.setReSendCount(r9.getReSendCount() + 1);
            r9.setSend(false);
            goto L25
        L37:
            JL_Log.e("jl_rcsp", "checkResponseListModify", "Command timeout --> " + r9);
            b(r9);
            this.f.remove(r9);
        L39:
            JL_Log.d("jl_rcsp", "checkResponseListModify", "end --> size = " + this.c.size());
        }

        public final void a(int r5) {
            TimerThread r0 = this.g;
            if (r0 != null) goto L7;
            TimerThread r1 = new TimerThread(this.h, r5, new AnonymousClass1(this));
            this.g = r1;
            r1.start();
            return;
        L7:
            if (TimerThread.a(r0) == true) goto L10;
            TimerThread.a(this.g, true);
            return;
        }

        public final void f(DataInfo r8) {
            if (r8 == null) goto L40;
            byte[] r0 = ParseHelper.packSendBasePacket(r8.getBasePacket());
            if (r0 != null) goto L8;
            JL_Log.i("jl_rcsp", "sendData", "pack data error.");
            e(r8);
            return;
        L8:
            JL_Log.v("jl_rcsp", "sendData", C2985d4.j.d + CHexConver.byte2HexStr(r0) + C2985d4.j.e);
            if (r0.length <= (DataHandlerOld.a(r8.getDevice()) + 8)) goto L12;
            JL_Log.e("jl_rcsp", "sendData", "Data over communication mtu [" + DataHandlerOld.a(r8.getDevice()) + "] limit.");
            e(r8);
            return;
        L12:
            int r3 = 0;
            boolean r4 = false;
        L14:
            if (r3 >= 3) goto L24;
            r4 = DataHandlerOld.b(this.h).sendDataToDevice(r8.getDevice(), r0);
            if (r4 == true) goto L24;
            Thread.sleep(10);     // Catch: InterruptedException -> L21
        L23:
            r3 = r3 + 1;
        L21:
            e = move-exception;
            e.printStackTrace();
        L24:
            JL_Log.i("jl_rcsp", "sendData", "" + r4);
            if (r4 == true) goto L28;
            e(r8);
            return;
        L28:
            if (r8.getBasePacket().getHasResponse() != 1) goto L30;
            r8.setSend(true);
            r8.setSendTime(Calendar.getInstance().getTimeInMillis());
            return;
        L30:
            DataHandlerOld.a(this.h, r8, ParseHelper.convert2Command(r8.getDevice(), r8.getBasePacket()));
            this.e.remove(r8);
            return;
        }

        public final DataInfo e() {
            int r1 = 0;
            if (this.e.isEmpty() == true) goto L11;
        L5:
            if (r1 >= this.e.size()) goto L24;
            DataInfo r0 = this.e.get(r1);
            if (r0.isSend() == false) goto L8;
            r1 = r1 + 1;
            goto L5
        L8:
            return r0;
        L24:
            return null;
        L11:
            if (this.f.isEmpty() == false) goto L13;
            return null;
        L13:
            if (r1 >= this.f.size()) goto L25;
            DataInfo r2 = this.f.get(r1);
            if (r2.isSend() == false) goto L16;
            r1 = r1 + 1;
            goto L13
        L16:
            return r2;
        L25:
            return null;
        }

        public final ArrayList<DataInfo> c() {
            if (this.f.isEmpty() == true) goto L11;
            ArrayList<DataInfo> r0 = new ArrayList();
            Iterator<DataInfo> r1 = this.f.iterator();
        L6:
            if (r1.hasNext() == false) goto L10;
            DataInfo r2 = r1.next();
            if (r2.isSend() == false) goto L6;
            r0.add(r2);
            goto L6
        L10:
            return r0;
        L11:
            return null;
        }

        public final void d(DataInfo r9) {
            if (r9 != null) goto L4;
            return;
        L4:
            if (r9.getType() != 1) goto L18;
            ArrayList<BasePacket> r0 = this.h.findPacketData(r9.getDevice(), r9.getRecvData());
            if (r0 == null) goto L15;
            ArrayList r4 = new ArrayList();
            Iterator<BasePacket> r1 = r0.iterator();
        L9:
            if (r1.hasNext() == false) goto L12;
            BasePacket r5 = r1.next();
            JL_Log.d("jl_rcsp", "handlerQueue", "opCode : " + r5.getOpCode());
            r4.add(new DataInfo().setType(1).setDevice(r9.getDevice()).setBasePacket(r5));
            goto L9
        L12:
            if (r4.isEmpty() == true) goto L35;
            this.c.addAll(r4);
            g();
            return;
        L35:
            return;
        L15:
            JL_Log.e("jl_rcsp", "handlerQueue", "findPacketData not found. ");
            return;
        L18:
            if (r9.getBasePacket() != null) goto L20;
            return;
        L20:
            if (r9.getBasePacket().getHasResponse() != 1) goto L28;
            if (this.f.size() >= 30) goto L25;
            this.f.add(r9);
            return;
        L25:
            JL_Log.i("jl_rcsp", "handlerQueue", "haveResponseDataList is busy. ");
            DataHandlerOld.b(this.h).callbackErrorEvent(new BaseError(12291));
            return;
        L28:
            if (this.e.size() >= 60) goto L31;
            this.e.add(r9);
            return;
        L31:
            JL_Log.i("jl_rcsp", "handlerQueue", "noResponseDataList is busy. ");
            DataHandlerOld.b(this.h).callbackErrorEvent(new BaseError(12291));
        }

        public final boolean a(DataInfo r5) {
            if (r5 != null) goto L11;
        L7:
            boolean r6 = false;
        L8:
            if (r6 == false) goto L10;
            g();
        L10:
            return r6;
        L11:
            r6 = this.d.offer(r5, 3, TimeUnit.SECONDS);     // Catch: InterruptedException -> L5
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L7
        }

        @Deprecated
        public final void a() {
            ArrayList<DataInfo> r0 = new ArrayList();
            if (this.c.isEmpty() == true) goto L22;
            ArrayList r1 = new ArrayList();
            ArrayList r2 = new ArrayList();
            Iterator r3 = new ArrayList(this.c).iterator();
        L6:
            if (r3.hasNext() == false) goto L15;
            DataInfo r4 = (DataInfo) r3.next();
            BasePacket r5 = r4.getBasePacket();
            if (r5 == null) goto L9;
            DataHandlerOld.b(this.h).receiveDataFromDevice(r4.getDevice(), r5);
            if (r5.getType() == 1) goto L12;
            r0.add(r4);
            goto L6
        L12:
            r1.add(r4);
            goto L6
        L9:
            r2.add(r4);
            goto L6
        L15:
            if (r1.isEmpty() == true) goto L18;
            this.c.removeAll(r1);
        L18:
            if (r2.isEmpty() == true) goto L20;
            this.c.removeAll(r2);
        L20:
            a(r0);
            return;
        L22:
            a(null);
        }

        @Deprecated
        public final void a(ArrayList<DataInfo> r23) {
            if (this.f.isEmpty() == true) goto L77;
            ArrayList<DataInfo> r2 = c();
            StringBuilder r5 = new StringBuilder();
            r5.append("waitList size : ");
            if (r2 != null) goto L7;
            int r7 = 0;
        L8:
            r5.append(r7);
            JL_Log.i("jl_rcsp", "checkHaveResponseList", r5.toString());
            if (r2 != null) goto L11;
            return;
        L11:
            if (r2.isEmpty() == true) goto L101;
            ArrayList r6 = new ArrayList();
            ArrayList r8 = new ArrayList();
            long r9 = DataHandlerOld.c(this.h);
            if (r23 != null) goto L15;
        L56:
            ArrayList<DataInfo> r16 = r2;
            long r20 = r9;
        L57:
            ArrayList<DataInfo> r3 = r16;
        L58:
            if (r3 != null) goto L60;
            return;
        L60:
            if (r3.isEmpty() == true) goto L103;
            Iterator<DataInfo> r1 = r3.iterator();
        L63:
            if (r1.hasNext() == false) goto L74;
            DataInfo r4 = r1.next();
            if (r4.getTimeoutMs() >= 500) goto L68;
            r4.setTimeoutMs(500);
        L68:
            if ((r20 - r4.getSendTime()) <= r4.getTimeoutMs()) goto L63;
            int r10 = r4.getReSendCount();
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "wait for response timeout 222222 !!! reSend count : " + r10 + ", data : " + r4);
            if (r10 >= 3) goto L71;
            r4.setReSendCount(r10 + 1);
            r4.setSend(false);
            goto L63
        L71:
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "retry count over time 222222, callbackTimeOutError.");
            b(r4);
            r8.add(r4);
            goto L63
        L74:
            if (r8.isEmpty() == true) goto L104;
            this.f.removeAll(r8);
            return;
        L104:
            return;
        L103:
            return;
        L15:
            if (r23.isEmpty() == true) goto L56;
            Iterator<DataInfo> r13 = r23.iterator();
        L18:
            if (r13.hasNext() == false) goto L47;
            DataInfo r14 = r13.next();
            final BasePacket r15 = r14.getBasePacket();
            if (r15 == null) goto L18;
            JL_Log.d("jl_rcsp", "checkHaveResponseList", "opCode : " + r15.getOpCode() + ", sn : " + r15.getOpCodeSn() + ", device : " + r14.getDevice());
            Iterator<DataInfo> r11 = r2.iterator();
        L24:
            if (r11.hasNext() == false) goto L18;
            final DataInfo r12 = r11.next();
            final BasePacket r17 = r12.getBasePacket();
            ArrayList<DataInfo> r18 = r2;
            if (r17 == null) goto L29;
            JL_Log.i("jl_rcsp", "checkHaveResponseList", "packet opCode : " + r17.getOpCode() + ", packet sn : " + r17.getOpCodeSn());
        L29:
            if (r17 == null) goto L38;
            if (r17.getOpCode() != r15.getOpCode()) goto L38;
            if (r17.getOpCodeSn() != r15.getOpCodeSn()) goto L38;
            if (RcspUtil.deviceEquals(r12.getDevice(), r14.getDevice()) == false) goto L38;
            JL_Log.w("jl_rcsp", "checkHaveResponseList", "callback");
            DataHandlerOld.d(this.h).post(new OXO1(this, r12, r15, r17));
            r6.add(r14);
            r8.add(r12);
            r2 = r18;
        L38:
            if (r12.getTimeoutMs() >= 500) goto L40;
            r12.setTimeoutMs(500);
        L40:
            long r21 = r9;
            if ((r9 - r12.getSendTime()) <= r12.getTimeoutMs()) goto L45;
            int r19 = r12.getReSendCount();
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "wait for response timeout !!! reSend count : " + r19 + ", data : " + r12);
            if (r19 < 3) goto L46;
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "retry count over time, callbackTimeOutError.");
            b(r12);
            r6.add(r14);
            r8.add(r12);
            goto L45
        L46:
            r12.setReSendCount(r19 + 1);
            r12.setSend(false);
        L45:
            r2 = r18;
            r11 = r11;
            r9 = r21;
            goto L24
        L47:
            r16 = r2;
            r20 = r9;
            if (r6.isEmpty() == true) goto L51;
            r23.removeAll(r6);
            this.c.removeAll(r6);
        L51:
            if (r23.isEmpty() == true) goto L54;
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "remove unused response.");
            this.c.removeAll(r23);
        L54:
            if (r8.isEmpty() == true) goto L57;
            this.f.removeAll(r8);
            r8.clear();
            r3 = c();
            goto L58
        L101:
            return;
        L7:
            r7 = r2.size();
            goto L8
        L77:
            if (r23 != null) goto L79;
            return;
        L79:
            if (r23.isEmpty() == true) goto L106;
            JL_Log.e("jl_rcsp", "checkHaveResponseList", "22222 remove unused response.");
            this.c.removeAll(r23);
            return;
        }

        public final void b(DataInfo r4) {
            CommandHelper.getInstance().removeCommandBase(r4.getDevice(), r4.getBasePacket());
            BaseError r0 = new BaseError(12290);
            if (r4.getBasePacket() == null) goto L5;
            r0.setOpCode(r4.getBasePacket().getOpCode());
        L5:
            DataHandlerOld.a(this.h, r4, r0);
        }

        public final /* synthetic */ void a(DataInfo r3, BasePacket r4, BasePacket r5) {
            CommandBase r0 = ParseHelper.convert2Command(r3.getDevice(), r4);
            if (r0 != null) goto L5;
            BaseError r1 = new BaseError(12289);
            r1.setOpCode(r4.getOpCode());
            DataHandlerOld.a(this.h, r3, r1);
        L6:
            CommandHelper.getInstance().removeCommandBase(r3.getDevice(), r5);
            return;
        L5:
            DataHandlerOld.a(this.h, r3, r0);
            goto L6
        }
    }

    public class TimerThread extends Thread {
        public final long a;
        public volatile boolean b;
        public final ThreadStateListener c;
        public final /* synthetic */ DataHandlerOld d;

        public TimerThread(DataHandlerOld r1, long r2, ThreadStateListener r4) {
            this.d = r1;
            super("TimerThread");
            this.a = r2;
            this.c = r4;
        }

        public static /* synthetic */ boolean a(TimerThread r0) {
            return r0.b;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        L14:
        L8:
            e = move-exception;
            e.printStackTrace();
        L10:
            this.b = false;
            JL_Log.w("jl_rcsp", "TimerThread", "end. thread id : " + getId());
            ThreadStateListener r0 = this.c;
            if (r0 == null) goto L19;
            r0.onFinish(getId());
            return;
        L19:
            return;
        L3:
            if (this.b == false) goto L10;
            Thread.sleep(this.a);     // Catch: InterruptedException -> L8
            if (DataHandlerOld.a(this.d) == null) goto L10;
            DataHandlerThread.b(DataHandlerOld.a(this.d));     // Catch: InterruptedException -> L8
            goto L14
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.b = true;     // Catch: Throwable -> L8
            super.start();     // Catch: Throwable -> L8
            JL_Log.w("jl_rcsp", "TimerThread", "start. thread id : " + getId());     // Catch: Throwable -> L8
            ThreadStateListener r0 = this.c;     // Catch: Throwable -> L8
            if (r0 == null) goto L10;
            r0.onStart(getId());     // Catch: Throwable -> L8
        L10:
            monitor-exit(this);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        public static /* synthetic */ boolean a(TimerThread r0, boolean r1) {
            r0.b = r1;
            return r1;
        }

        public synchronized void a() {
            monitor-enter(this);
            this.b = false;     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }
    }

    public class WorkThread extends HandlerThread implements Handler.Callback {
        public static final int c = 1;
        public static final int d = 2;
        public Handler a;
        public final /* synthetic */ DataHandlerOld b;

        public WorkThread(DataHandlerOld r1, String r2) {
            this.b = r1;
            super(r2, 10);
        }

        public Handler getWorkHandler() {
            if (this.a != null) goto L6;
            this.a = new Handler(getLooper(), this);
        L6:
            return this.a;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message r4) {
            if (r4 != null) goto L5;
            return false;
        L5:
            int r1 = r4.what;
            if (r1 != 1) goto L8;
            DataInfo r5 = (DataInfo) r4.obj;
            if (DataHandlerOld.a(this.b) == null) goto L17;
            DataHandlerOld.a(this.b).tryToAddSendData(r5);
        L17:
            return false;
        L8:
            if (r1 != 2) goto L17;
            DataInfo r6 = (DataInfo) r4.obj;
            if (DataHandlerOld.a(this.b) == null) goto L17;
            if (r6 == null) goto L17;
            DataHandlerOld.a(this.b).tryToAddRecvData(r6);
            goto L17
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.a = new Handler(getLooper(), this);
        }

        public void tryToAddRecvData(DataInfo r3) {
            if (this.a != null) goto L5;
            this.a = new Handler(getLooper(), this);
        L5:
            Message r0 = this.a.obtainMessage();
            r0.what = 2;
            r0.obj = r3;
            this.a.sendMessage(r0);
        }

        public void tryToAddSendData(DataInfo r3) {
            if (this.a != null) goto L5;
            this.a = new Handler(getLooper(), this);
        L5:
            Message r0 = this.a.obtainMessage();
            r0.what = 1;
            r0.obj = r3;
            this.a.sendMessage(r0);
        }
    }

    public DataHandlerOld(IBluetoothProxy r2) {
        this.f = 0;
        if (r2 == null) goto L7;
        this.a = r2;
        this.b = new Handler(Looper.getMainLooper());
        b();
        return;
    L7:
        throw new NullPointerException("IBluetoothProxy can not be null.");
    }

    public static /* synthetic */ DataHandlerThread a(DataHandlerOld r0) {
        return r0.d;
    }

    public static /* synthetic */ IBluetoothProxy b(DataHandlerOld r0) {
        return r0.a;
    }

    public static /* synthetic */ long c(DataHandlerOld r2) {
        return r2.a();
    }

    public static /* synthetic */ Handler d(DataHandlerOld r0) {
        return r0.b;
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addRecvData(DataInfo r2) {
        if (this.c != null) goto L5;
        b();
    L5:
        WorkThread r0 = this.c;
        if (r0 == null) goto L9;
        r0.tryToAddRecvData(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addSendData(DataInfo r2) {
        if (this.c != null) goto L5;
        b();
    L5:
        WorkThread r0 = this.c;
        if (r0 == null) goto L9;
        r0.tryToAddSendData(r2);
        return;
    }

    public final void e() {
        WorkThread r0 = this.c;
        if (r0 == null) goto L6;
        r0.quitSafely();
        this.c = null;
        return;
    }

    public ArrayList<BasePacket> findPacketData(BluetoothDevice r14, byte[] r15) {
        if (r15 != null) goto L5;
    L53:
        ArrayList<BasePacket> r16 = null;
    L54:
        if (r16 != null) goto L56;
    L58:
        return null;
    L56:
        if (r16.isEmpty() == true) goto L58;
        return r16;
    L5:
        if (r15.length <= 0) goto L53;
        int r1 = r15.length;
        if (this.f <= 0) goto L9;
        byte[] r2 = new byte[this.f + r1];
        System.arraycopy(this.e, 0, r2, 0, this.f);
        System.arraycopy(r15, 0, r2, this.f, r1);
        r1 = r1 + this.f;
        this.f = 0;
    L10:
        r16 = new ArrayList();
        int r5 = 0;
        int r6 = -1;
    L11:
        if (r5 >= r1) goto L54;
        int r7 = r5;
    L13:
        if (r7 >= r1) goto L32;
        if (r2[r7] != (-2)) goto L30;
        int r8 = r7 + 1;
        if (r8 >= r1) goto L29;
        if (r2[r8] != (-36)) goto L30;
        int r9 = r7 + 2;
        if (r9 >= r1) goto L28;
        if (r2[r9] != (-70)) goto L30;
        int r10 = r7 + 3;
        if (r10 >= r1) goto L27;
        r6 = r10;
        goto L32
    L27:
        a(r2, r7, r1 - r7);
        goto L32
    L28:
        a(r2, r7, r1 - r7);
        goto L32
    L29:
        a(r2, r7, r1 - r7);
    L30:
        r7 = r7 + 1;
    L32:
        if (r6 <= 0) goto L52;
        int r11 = r6 + 4;
        if (r11 > r1) goto L50;
        byte[] r12 = new byte[2];
        System.arraycopy(r2, r6 + 2, r12, 0, 2);
        int r13 = CHexConver.bytesToInt(r12[0], r12[1]);
        if (r13 > c(r14)) goto L37;
        int r17 = r11 + r13;
        int r18 = r17 + 1;
        if (r18 <= r1) goto L41;
        int r19 = r6 - 3;
        a(r2, r19, r1 - r19);
    L51:
        r5 = r1;
        goto L11
    L41:
        if (r2[r17] == (-17)) goto L42;
        r5 = r5 + 1;
        goto L11
    L42:
        int r110 = r13 + 4;
        byte[] r20 = new byte[r110];
        System.arraycopy(r2, r6, r20, 0, r110);
        BasePacket r21 = a(r14, r20);
        if (r21 == null) goto L45;
        r16.add(r21);
    L45:
        if (r18 == r1) goto L54;
        r6 = -1;
        r5 = r18;
        goto L11
    L37:
        JL_Log.e("jl_rcsp", "findPacketData", RcspUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", new Object[]{Integer.valueOf(r13), Integer.valueOf(c(r14))}));
        r5 = r5 + r6;
        goto L11
    L50:
        int r22 = r6 - 3;
        a(r2, r22, r1 - r22);
        goto L51
    L52:
        JL_Log.w("jl_rcsp", "findPacketData", "No header data found.");
        goto L54
    L9:
        r2 = (byte[]) r15.clone();
        goto L10
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void release() {
        JL_Log.i("jl_rcsp", "release", "=====>>>");
        CommandHelper.getInstance().release();
        d();
    }

    public static /* synthetic */ DataHandlerThread a(DataHandlerOld r0, DataHandlerThread r1) {
        r0.d = r1;
        return r1;
    }

    public final void b() {
        if (this.d != null) goto L6;
        DataHandlerThread r0 = new DataHandlerThread(this);
        this.d = r0;
        r0.start();
        c();
        return;
    }

    public final void c() {
        if (this.c != null) goto L5;
        this.c = new WorkThread(this, "Work_Thread");
    L5:
        this.c.start();
    }

    public final void d() {
        DataHandlerThread r0 = this.d;
        if (r0 == null) goto L5;
        r0.stopThread();
    L5:
        e();
    }

    public static /* synthetic */ int a(BluetoothDevice r0) {
        return b(r0);
    }

    public static /* synthetic */ void a(DataHandlerOld r0, DataInfo r1, CommandBase r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(DataHandlerOld r0, DataInfo r1, BaseError r2) {
        r0.a(r1, r2);
    }

    public static int c(BluetoothDevice r1) {
        return DeviceStatusManager.getInstance().getMaxReceiveMtu(r1);
    }

    private static int b(BluetoothDevice r1) {
        return DeviceStatusManager.getInstance().getMaxCommunicationMtu(r1);
    }

    public final void a(byte[] r3, int r4, int r5) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.length <= 0) goto L12;
        if (r4 < 0) goto L13;
        if (r5 > 0) goto L8;
        return;
    L8:
        if ((r4 + r5) > r3.length) goto L15;
        this.e = new byte[r5];
        System.arraycopy(r3, r4, this.e, 0, r5);
        this.f = r5;
        return;
    L15:
        return;
    L13:
        return;
    }

    public final /* synthetic */ void b(DataInfo r2, BaseError r3) {
        if (r2.getRcspCmdCallback() == null) goto L5;
        r2.getRcspCmdCallback().onErrCode(r2.getDevice(), r3);
    L5:
        this.a.callbackErrorEvent(r3);
    }

    public static BasePacket a(BluetoothDevice r10, byte[] r11) {
        if (r11 != null) goto L4;
        return null;
    L4:
        if (r11.length < 4) goto L21;
        byte[] r2 = CHexConver.getBooleanArrayBig(r11[0]);
        int r4 = CHexConver.byteToInt(r11[1]);
        byte[] r6 = new byte[2];
        System.arraycopy(r11, 2, r6, 0, 2);
        int r5 = CHexConver.bytesToInt(r6[0], r6[1]);
        BasePacket r7 = new BasePacket();
        int r8 = 7;
        int r9 = CHexConver.byteToInt(r2[7]);
        int r3 = CHexConver.byteToInt(r2[6]);
        r7.setType(r9);
        r7.setHasResponse(r3);
        r7.setOpCode(r4);
        r7.setParamLen(r5);
        if (r5 > 0) goto L8;
    L18:
        return r7;
    L8:
        if (r9 != 0) goto L13;
        byte[] r12 = new byte[1];
        System.arraycopy(r11, 4, r12, 0, 1);
        r7.setStatus(CHexConver.byteToInt(r12[0]));
        byte[] r1 = new byte[1];
        System.arraycopy(r11, 5, r1, 0, 1);
        r7.setOpCodeSn(CHexConver.byteToInt(r1[0]));
        if (r4 != 1) goto L12;
        byte[] r13 = new byte[1];
        System.arraycopy(r11, 6, r13, 0, 1);
        r7.setXmOpCode(CHexConver.byteToInt(r13[0]));
    L17:
        int r14 = r5 - (r8 - 4);
        byte[] r15 = new byte[r14];
        System.arraycopy(r11, r8, r15, 0, r14);
        r7.setParamData(r15);
        JL_Log.d("jl_rcsp", "parsePacketData", RcspUtil.formatString("packet type : %d, opCode : %d, sn :%d, device : %s", new Object[]{Integer.valueOf(r7.getType()), Integer.valueOf(r7.getOpCode()), Integer.valueOf(r7.getOpCodeSn()), r10}));
    L12:
        r8 = 6;
        goto L17
    L13:
        byte[] r16 = new byte[1];
        System.arraycopy(r11, 4, r16, 0, 1);
        r7.setOpCodeSn(CHexConver.byteToInt(r16[0]));
        if (r4 != 1) goto L16;
        byte[] r17 = new byte[1];
        System.arraycopy(r11, 5, r17, 0, 1);
        r7.setXmOpCode(CHexConver.byteToInt(r17[0]));
        goto L12
    L16:
        r8 = 5;
        goto L17
    L21:
        return null;
    }

    public static /* synthetic */ void b(DataInfo r1, CommandBase r2) {
        if (r1.getRcspCmdCallback() == null) goto L6;
        r1.getRcspCmdCallback().onCommandResponse(r1.getDevice(), r2);
        return;
    }

    public final long a() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public final void a(final DataInfo r3, final BaseError r4) {
        if (r3 == null) goto L7;
        if (r4 == null) goto L8;
        this.b.post(new i1i00X0(this, r3, r4));
        return;
    L8:
        return;
    }

    private void a(final DataInfo r3, final CommandBase r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        this.b.post(new O00OI1iX(r3, r4));
    }
}
