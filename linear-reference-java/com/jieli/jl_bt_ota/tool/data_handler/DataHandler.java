package com.jieli.jl_bt_ota.tool.data_handler;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
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
import com.jieli.jl_bt_ota.model.data.DataInfo;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class DataHandler implements IDataHandler {
    private static final String g = "DataHandler";
    private final IBtProxy a;
    private final OnDataHandlerListener b;
    private final CommandCache c;
    private final Handler d;
    private WorkThread e;
    private DataHandlerThread f;

    public class DataHandlerThread extends Thread {
        private final String a;
        private volatile boolean b;
        private volatile boolean c;
        private final LinkedBlockingQueue<DataInfo> d;
        private final CopyOnWriteArrayList<ReceivedDataInfo> e;
        private final CopyOnWriteArrayList<SendDataInfo<?>> f;
        private TimerThread g;
        final /* synthetic */ DataHandler h;

        public DataHandlerThread(DataHandler r1) {
            this.h = r1;
            super("DataHandlerThread");
            this.a = DataHandlerThread.class.getSimpleName();
            this.d = new LinkedBlockingQueue();
            this.e = new CopyOnWriteArrayList();
            this.f = new CopyOnWriteArrayList();
        }

        public static /* synthetic */ void O00(DataHandlerThread r0, SendDataInfo r1, CommandCallback r2) {
            r0.a(r1, r2);
        }

        public static /* synthetic */ void OXO1(DataHandlerThread r0, SendDataInfo r1, CommandCallback r2) {
            r0.b(r1, r2);
        }

        public static /* synthetic */ void XIi00iiXO(CommandCallback r0) {
            a(r0);
        }

        public static /* synthetic */ void XO0O10(CommandCallback r0, SendDataInfo r1) {
            a(r0, r1);
        }

        public static /* synthetic */ TimerThread a(DataHandlerThread r0) {
            return r0.g;
        }

        public static /* synthetic */ void b(DataHandlerThread r0) {
            r0.f();
        }

        private void c() {
            a();
            SendDataInfo<?> r0 = d();
            if (r0 == null) goto L5;
            d(r0);
            return;
        L5:
            if (b().isEmpty() == true) goto L8;
            a(500);
            return;
        L8:
            e();
        }

        private void d(SendDataInfo<?> r8) {
            byte[] r0 = r8.getSendData();
            if (r0 != null) goto L5;
        L34:
            JL_Log.i(DataHandler.g, "sendData", "pack data error.");
            c(r8);
            return;
        L5:
            if (r0.length == 0) goto L34;
            int r3 = r8.getDeviceReceiveMtu();
            JL_Log.i(DataHandler.g, "sendData", "data : [" + CHexConver.byte2HexStr(r0) + "], sendMtu = " + r3);
            if (r0.length <= (r3 + 8)) goto L11;
            JL_Log.e(DataHandler.g, "sendData", "data over communication mtu [" + r3 + "] limit.");
            c(r8);
            return;
        L11:
            int r4 = 0;
            boolean r5 = false;
        L13:
            if (r4 >= 3) goto L23;
            r5 = DataHandler.c(this.h).writeData(r8.getDevice(), r0);
            if (r5 == true) goto L23;
            Thread.sleep(10);     // Catch: InterruptedException -> L20
        L22:
            r4 = r4 + 1;
        L20:
            e = move-exception;
            e.printStackTrace();
        L23:
            JL_Log.i(DataHandler.g, "sendData", "" + r5);
            if (r5 == true) goto L27;
            c(r8);
            return;
        L27:
            if (r8.getBasePacket().getHasResponse() != 1) goto L29;
            r8.setSend(true);
            r8.setSendTime(Calendar.getInstance().getTimeInMillis());
            return;
        L29:
            final CommandCallback<C> r1 = r8.getCallback();
            if (r1 == 0) goto L32;
            DataHandler.d(this.h).post(new XO0O10(r1));
        L32:
            this.f.remove(r8);
        }

        private void e() {
            TimerThread r0 = this.g;
            if (r0 != null) goto L5;
            return;
        L5:
            if (TimerThread.a(r0) == false) goto L9;
            JL_Log.i(DataHandler.g, "stopTimer", "");
            r0.a();
            return;
        }

        private void f() {
            if (this.c == false) goto L15;
            LinkedBlockingQueue<DataInfo> r0 = this.d;
            monitor-enter(r0);
        L9:
            th = move-exception;
            throw th;
        L7:
            if (this.c == false) goto L11;
            JL_Log.i(DataHandler.g, "wakeUpThread", "notifyAll");     // Catch: Throwable -> L9
            this.d.notifyAll();     // Catch: Throwable -> L9
        L11:
            monitor-exit(r0);     // Catch: Throwable -> L9
            return;
        }

        public static /* synthetic */ void iO(CommandCallback r0, SendDataInfo r1) {
            b(r0, r1);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LinkedBlockingQueue<DataInfo> r0 = this.d;
            monitor-enter(r0);
        L21:
        L11:
            th = move-exception;
            throw th;
        L5:
            if (this.b == false) goto L16;
            if (this.d.isEmpty() == true) goto L8;
            this.c = false;     // Catch: Throwable -> L11
            b(this.d.poll());     // Catch: Throwable -> L11
            c();     // Catch: Throwable -> L11
            goto L21
        L8:
            this.c = true;     // Catch: Throwable -> L11
            c();     // Catch: Throwable -> L11
            JL_Log.d(DataHandler.g, this.a, "Thread is waiting...");     // Catch: Throwable -> L11
            this.d.wait();     // Catch: Throwable -> L11 InterruptedException -> L13
        L13:
            e = move-exception;
            e.printStackTrace();     // Catch: Throwable -> L11
            goto L21
        L16:
            monitor-exit(r0);     // Catch: Throwable -> L11
            JL_Log.e(DataHandler.g, this.a, "exit...");
            this.e.clear();
            this.f.clear();
            this.d.clear();
            this.b = false;
            e();
            DataHandler.a(this.h, null);
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.b = true;     // Catch: Throwable -> L7
            super.start();     // Catch: Throwable -> L7
            JL_Log.i(DataHandler.g, this.a, "start....");     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public void stopThread() {
            JL_Log.w(DataHandler.g, this.a, "stopThread");
            this.b = false;
            f();
        }

        public void tryToAddRecvData(DataInfo r3) {
            JL_Log.d(DataHandler.g, "tryToAddRecvData", a(r3) + ",isWaiting = " + this.c);
        }

        public void tryToAddSendData(DataInfo r3) {
            JL_Log.d(DataHandler.g, "tryToAddSendData", a(r3) + ",isWaiting = " + this.c);
        }

        public static /* synthetic */ TimerThread a(DataHandlerThread r0, TimerThread r1) {
            r0.g = r1;
            return r1;
        }

        private /* synthetic */ void b(SendDataInfo r3, CommandCallback r4) {
            BaseError r0 = OTAError.buildError(12290).setOpCode(r3.getOpCode()).setCmdSn(r3.getSn());
            if (r4 == null) goto L6;
            r4.onErrCode(r0);
        L6:
            if (DataHandler.e(this.h) == null) goto L9;
            DataHandler.e(this.h).onRCSPError(r3.getDevice(), r0);
            return;
        }

        private void a(int r5) {
            TimerThread r0 = this.g;
            if (r0 != null) goto L7;
            TimerThread r1 = new TimerThread(this.h, r5, new AnonymousClass1(this));
            this.g = r1;
            r1.start();
            return;
        L7:
            if (TimerThread.a(r0) == true) goto L10;
            TimerThread.a(r0, true);
            return;
        }

        private void b(DataInfo r3) {
            if (r3 != null) goto L5;
            return;
        L5:
            if (r3.getType() != 1) goto L8;
            this.e.add((ReceivedDataInfo) r3);
            f();
            return;
        L8:
            this.f.add((SendDataInfo) r3);
        }

        private CommandBase<?, ?> a(BluetoothDevice r3, BasePacket r4) {
            if (r4 != null) goto L6;
            return null;
        L6:
            return DataHandler.b(this.h).getCommand(r3, r4.getOpCode(), r4.getOpCodeSn());
        }

        private void c(final SendDataInfo<?> r4) {
            if (r4 != null) goto L4;
            return;
        L4:
            this.f.remove(r4);
            final CommandCallback<C> r0 = r4.getCallback();
            DataHandler.d(this.h).post(new iO(this, r4, r0));
        }

        private void a(BluetoothDevice r2, int r3, int r4) {
            DataHandler.b(this.h).removeCommandBase(r2, r3, r4);
        }

        private static /* synthetic */ void a(CommandCallback r1) {
            r1.onCommandResponse(null);
        }

        private boolean a(DataInfo r5) {
            if (r5 != null) goto L11;
        L7:
            boolean r6 = false;
        L8:
            if (r6 == false) goto L10;
            f();
        L10:
            return r6;
        L11:
            r6 = this.d.offer(r5, 3, TimeUnit.SECONDS);     // Catch: InterruptedException -> L5
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L7
        }

        private static /* synthetic */ void b(CommandCallback r2, SendDataInfo r3) {
            if (r2 == null) goto L5;
            r2.onErrCode(OTAError.buildError(12293).setOpCode(r3.getOpCode()).setCmdSn(r3.getSn()));
            return;
        }

        private void a() {
            ArrayList<BasePacket> r0 = new ArrayList();
            if (this.e.isEmpty() == true) goto L28;
            ArrayList r1 = new ArrayList();
            Iterator<ReceivedDataInfo> r2 = this.e.iterator();
        L6:
            if (r2.hasNext() == false) goto L24;
            ReceivedDataInfo r3 = r2.next();
            BluetoothDevice r4 = r3.getDevice();
            ArrayList<BasePacket> r5 = ParseHelper.findPacketData(r4, r3.getDeviceSendMtu(), r3.getData());
            if (r5 == null) goto L6;
            if (r5.isEmpty() == true) goto L6;
            r1.add(r3);
            int r6 = r5.size();
            int r7 = 0;
        L13:
            if (r7 >= r6) goto L6;
            BasePacket r8 = r5.get(r7);
            r7 = r7 + 1;
            BasePacket r9 = r8;
            if (r9.getType() == 1) goto L16;
            r0.add(r9);
            goto L13
        L16:
            CommandBase r10 = ParseHelper.convert2Command(r9, a(r4, r9));
            if (r10 == null) goto L13;
            if (DataHandler.e(this.h) == null) goto L13;
            DataHandler.e(this.h).onReceivedCmd(r4, r10);
            goto L13
        L24:
            if (r1.isEmpty() == true) goto L26;
            this.e.removeAll(r1);
        L26:
            a(r0);
            return;
        L28:
            a(null);
        }

        private ArrayList<SendDataInfo<?>> b() {
            if (this.f.isEmpty() == true) goto L5;
            ArrayList<SendDataInfo<?>> r0 = new ArrayList();
            Iterator<SendDataInfo<?>> r1 = this.f.iterator();
        L8:
            if (r1.hasNext() == false) goto L12;
            SendDataInfo<?> r2 = r1.next();
            if (r2.isSend() == false) goto L8;
            r0.add(r2);
            goto L8
        L12:
            return r0;
        L5:
            return new ArrayList();
        }

        private void b(final SendDataInfo<?> r5) {
            if (r5 != null) goto L4;
            return;
        L4:
            final CommandCallback<C> r0 = r5.getCallback();
            a(r5.getDevice(), r5.getOpCode(), r5.getSn());
            DataHandler.d(this.h).post(new XIi00iiXO(this, r5, r0));
        }

        private SendDataInfo<?> d() {
            if (this.f.isEmpty() == false) goto L5;
            return null;
        L5:
            Iterator<SendDataInfo<?>> r0 = this.f.iterator();
        L7:
            if (r0.hasNext() == false) goto L11;
            SendDataInfo<?> r2 = r0.next();
            if (r2.isSend() == true) goto L7;
            return r2;
        L11:
            return null;
        }

        private void a(ArrayList<BasePacket> r19) {
            ArrayList<BasePacket> r1 = r19;
            if (r1 != null) goto L5;
            return;
        L5:
            if (r1.isEmpty() == true) goto L49;
            ArrayList<SendDataInfo<?>> r2 = b();
            if (r2.isEmpty() == true) goto L50;
            JL_Log.d(DataHandler.g, "checkHaveResponseList", "waitList size : " + r2.size());
            ArrayList r3 = new ArrayList();
            long r6 = Calendar.getInstance().getTimeInMillis();
            int r8 = r1.size();
            int r10 = 0;
        L11:
            if (r10 >= r8) goto L39;
            BasePacket r11 = r1.get(r10);
            r10 = r10 + 1;
            BasePacket r12 = r11;
            if (r12 == null) goto L37;
            int r13 = r2.size();
            int r14 = 0;
        L16:
            if (r14 >= r13) goto L37;
            SendDataInfo<?> r15 = r2.get(r14);
            r14 = r14 + 1;
            final SendDataInfo<?> r16 = r15;
            if (r16.getOpCode() != r12.getOpCode()) goto L27;
            if (r16.getSn() != r12.getOpCodeSn()) goto L27;
            CommandBase<?, ?> r9 = ParseHelper.convert2Command(r12, a(r16.getDevice(), r12));
            final CommandCallback<C> r17 = r16.getCallback();
            JL_Log.d(DataHandler.g, "checkHaveResponseList", "callback command -> " + r9);
            a(r16.getDevice(), r16.getOpCode(), r16.getSn());
            if (r9 != null) goto L24;
            DataHandler.d(this.h).post(new O00(r17, r16));
        L25:
            r3.add(r16);
            goto L37
        L24:
            r16.setCommand(r9);
            a(r16);
        L27:
            if (r16.getTimeoutMs() >= 500) goto L29;
            r16.setTimeoutMs(500);
        L29:
            ArrayList<SendDataInfo<?>> r18 = r2;
            if ((r6 - r16.getSendTime()) <= r16.getTimeoutMs()) goto L36;
            int r4 = r16.getReSendCount();
            JL_Log.e(DataHandler.g, "checkHaveResponseList", "wait for response timeout !!! reSend count : " + r4 + ", data : " + r16);
            if (r4 < 3) goto L35;
            JL_Log.e(DataHandler.g, "checkHaveResponseList", "retry count over time, callbackTimeOutError.");
            b(r16);
            r3.add(r16);
            goto L36
        L35:
            r16.setReSendCount(r4 + 1);
            r16.setSend(false);
        L36:
            r2 = r18;
        L37:
            r1 = r19;
            r2 = r2;
            goto L11
        L39:
            if (r3.isEmpty() == true) goto L48;
            this.f.removeAll(r3);
            return;
        L48:
            return;
        L50:
            return;
        }

        private <C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void a(final SendDataInfo<C> r4) {
            if (r4 == null) goto L9;
            final CommandCallback<C> r0 = r4.getCallback();
            if (r0 != null) goto L7;
            return;
        L7:
            DataHandler.d(this.h).post(new OXO1(r0, r4));
            return;
        }

        private static /* synthetic */ void a(CommandCallback r0, SendDataInfo r1) {
            r0.onCommandResponse(r1.getCommand());
        }

        private /* synthetic */ void a(SendDataInfo r3, CommandCallback r4) {
            BaseError r0 = OTAError.buildError(ErrorCode.SUB_ERR_SEND_TIMEOUT).setOpCode(r3.getOpCode()).setCmdSn(r3.getSn());
            if (r4 == null) goto L6;
            r4.onErrCode(r0);
        L6:
            if (DataHandler.e(this.h) == null) goto L9;
            DataHandler.e(this.h).onRCSPError(r3.getDevice(), r0);
            return;
        }
    }

    public interface ThreadStateListener {
        void onFinish(long r1);

        void onStart(long r1);
    }

    public class TimerThread extends Thread {
        private final String a;
        private final long b;
        private volatile boolean c;
        private final ThreadStateListener d;
        final /* synthetic */ DataHandler e;

        public TimerThread(DataHandler r1, long r2, ThreadStateListener r4) {
            this.e = r1;
            super("TimerThread");
            this.a = "TimerThread";
            this.b = r2;
            this.d = r4;
        }

        public static /* synthetic */ boolean a(TimerThread r0) {
            return r0.c;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        L3:
            if (this.c == false) goto L11;
            Thread.sleep(this.b);     // Catch: InterruptedException -> L6
        L9:
            if (DataHandler.a(this.e) == null) goto L11;
            DataHandlerThread.b(DataHandler.a(this.e));
        L6:
            e = move-exception;
            e.printStackTrace();
        L11:
            this.c = false;
            JL_Log.w(DataHandler.g, "TimerThread", "end....id : " + getId());
            ThreadStateListener r0 = this.d;
            if (r0 == null) goto L19;
            r0.onFinish(getId());
            return;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            monitor-enter(this);
            this.c = true;     // Catch: Throwable -> L9
            super.start();     // Catch: Throwable -> L9
            JL_Log.w(DataHandler.g, "TimerThread", " start.... id : " + getId());     // Catch: Throwable -> L9
            ThreadStateListener r0 = this.d;     // Catch: Throwable -> L9
            if (r0 == null) goto L11;
            r0.onStart(getId());     // Catch: Throwable -> L9
            monitor-exit(this);
            return;
        L11:
            monitor-exit(this);
            return;
        L9:
            th = move-exception;
            throw th;
        }

        public static /* synthetic */ boolean a(TimerThread r0, boolean r1) {
            r0.c = r1;
            return r1;
        }

        public synchronized void a() {
            monitor-enter(this);
            this.c = false;     // Catch: Throwable -> L7
            monitor-exit(this);
            return;
        L7:
            th = move-exception;
            throw th;
        }
    }

    public class WorkThread extends HandlerThread implements Handler.Callback {
        private static final int c = 1;
        private static final int d = 2;
        private Handler a;
        final /* synthetic */ DataHandler b;

        public WorkThread(DataHandler r1, String r2) {
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
        public boolean handleMessage(Message r3) {
            int r0 = r3.what;
            if (r0 != 1) goto L5;
            DataInfo r4 = (DataInfo) r3.obj;
            if (DataHandler.a(this.b) == null) goto L19;
            DataHandler.a(this.b).tryToAddSendData(r4);
            return false;
        L19:
            return false;
        L5:
            if (r0 != 2) goto L20;
            DataInfo r5 = (DataInfo) r3.obj;
            if (DataHandler.a(this.b) == null) goto L16;
            if (r5 == null) goto L17;
            DataHandler.a(this.b).tryToAddRecvData(r5);
            return false;
        L17:
            return false;
        L16:
            return false;
        L20:
            return false;
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

    public DataHandler(IBtProxy r2, OnDataHandlerListener r3) {
        this.a = (IBtProxy) CommonUtil.checkNotNull(r2, "IBtProxy can not be null.");
        this.b = r3;
        this.c = new CommandCache();
        this.d = new Handler(Looper.getMainLooper());
        a();
    }

    public static /* synthetic */ DataHandlerThread a(DataHandler r0) {
        return r0.f;
    }

    public static /* synthetic */ CommandCache b(DataHandler r0) {
        return r0.c;
    }

    public static /* synthetic */ IBtProxy c(DataHandler r0) {
        return r0.a;
    }

    public static /* synthetic */ Handler d(DataHandler r0) {
        return r0.d;
    }

    public static /* synthetic */ OnDataHandlerListener e(DataHandler r0) {
        return r0.b;
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addRecvData(ReceivedDataInfo r2) {
        if (this.e != null) goto L5;
        a();
    L5:
        this.e.tryToAddRecvData(r2);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addSendData(SendDataInfo<?> r2) {
        if (this.e != null) goto L5;
        a();
    L5:
        this.e.tryToAddSendData(r2);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void release() {
        JL_Log.e(g, "release", "");
        c();
    }

    public static /* synthetic */ DataHandlerThread a(DataHandler r0, DataHandlerThread r1) {
        r0.f = r1;
        return r1;
    }

    private void b() {
        if (this.e != null) goto L5;
        this.e = new WorkThread(this, "Work_Thread");
    L5:
        this.e.start();
    }

    private void c() {
        DataHandlerThread r0 = this.f;
        if (r0 == null) goto L5;
        r0.stopThread();
    L5:
        d();
    }

    private void d() {
        WorkThread r0 = this.e;
        if (r0 == null) goto L6;
        r0.quitSafely();
        this.e = null;
        return;
    }

    private void a() {
        if (this.f != null) goto L6;
        DataHandlerThread r0 = new DataHandlerThread(this);
        this.f = r0;
        r0.start();
        b();
        return;
    }
}
