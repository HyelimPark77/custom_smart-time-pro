package com.jieli.jl_bt_ota.tool.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import com.android.mltcode.paycertificationapi.v04;
import com.android.mltcode.paycertificationapi.w04;
import com.facebook.login.widget.ToolTipPopup;
import com.ironsource.C2985d4;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.interfaces.bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.model.base.ThreadState;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import com.jieli.jl_bt_ota.model.ble.BleSendTask;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class SendBleDataThread extends Thread {
    private static final String j = "SendBleDataThread";
    private static final long k = 50;
    private static final int l = 26433;
    private final IBleOperation a;
    private final Consumer<ThreadState> b;
    private final LinkedBlockingQueue<BleSendTask> c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;
    private volatile boolean g;
    private volatile BleSendTask h;
    private final Handler i;

    public interface IBleOperation {
        int getBleMtu(BluetoothDevice r1);

        boolean writeBleData(BleSendParam r1);
    }

    static {
    }

    public SendBleDataThread(@NonNull IBleOperation r4, @NonNull Consumer<ThreadState> r5) {
        super(j);
        this.c = new LinkedBlockingQueue();
        this.d = false;
        this.e = false;
        this.f = true;
        this.g = false;
        this.i = new Handler(Looper.getMainLooper(), new w04(this));
        this.a = r4;
        this.b = r5;
    }

    public static /* synthetic */ void OXO1(OnBleSendDataCallback r0, BleSendTask r1, boolean r2) {
        a(r0, r1, r2);
    }

    public static /* synthetic */ boolean XIi00iiXO(SendBleDataThread r0, Message r1) {
        return r0.a(r1);
    }

    private /* synthetic */ boolean a(Message r3) {
        if (l == r3.what) goto L5;
        return true;
    L5:
        if (this.e == true) goto L7;
        return true;
    L7:
        if (this.c.isEmpty() == true) goto L13;
        JL_Log.d(j, "MSG_CHECK_QUEUE", "size ---> " + this.c.size());
        a();
        return true;
    L13:
        return true;
    }

    private boolean b() {
        LinkedBlockingQueue<BleSendTask> r0 = this.c;
        monitor-enter(r0);
        a("unlock", "isLocked : " + this.e);     // Catch: Throwable -> L8
        if (this.e == true) goto L21;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return false;
    L21:
        a("unlock", "try to unlock");     // Catch: Throwable -> L8 Exception -> L14
        this.c.notifyAll();     // Catch: Throwable -> L8 Exception -> L14
        this.i.removeMessages(l);     // Catch: Throwable -> L8 Exception -> L14
    L12:
        monitor-exit(r0);     // Catch: Throwable -> L8
        return true;
    L14:
        e = move-exception;
        JL_Log.w(j, "unlock", "occurred exception : " + e.getMessage());     // Catch: Throwable -> L8
        return false;
    L8:
        th = move-exception;
        throw th;
    }

    public boolean addSendTask(@NonNull BleSendTask r13) {
        if (this.d == true) goto L5;
        return false;
    L5:
        byte[] r0 = r13.getData();
        if (r0.length != 0) goto L8;
        return false;
    L8:
        BluetoothDevice r4 = r13.getDevice();
        int r2 = this.a.getBleMtu(r4);
        if (r2 > 0) goto L11;
        return false;
    L11:
        int r10 = 0;
    L13:
        if (r10 >= r0.length) goto L19;
        int r11 = Math.min(r0.length - r10, r2);
        byte[] r8 = new byte[r11];
        System.arraycopy(r0, r10, r8, 0, r11);
        if (a(new BleSendTask(r4, r13.getServiceUUID(), r13.getCharacteristicUUID(), r13.getWriteType(), r8, r13.getCallback())) == false) goto L16;
        r10 = r10 + r11;
        goto L13
    L16:
        JL_Log.i(j, "addSendTask", CommonUtil.formatString("loss data, data = [ %s ]", new Object[]{CHexConver.byte2HexStr(r8)}));
        return false;
    L19:
        return true;
    }

    public boolean isRunning() {
        return this.d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        JL_Log.d(j, "run", "start");
        Consumer<ThreadState> r0 = this.b;
        if (r0 == null) goto L6;
        r0.accept(new ThreadState(getId(), getName()).setState(1));
    L6:
        if (this.d == false) goto L16;
        this.h = null;
        this.g = false;
        this.f = this.c.isEmpty();
        if (this.f == true) goto L9;
        if (b(this.c.peek()) == false) goto L6;
    L15:
        this.c.poll();
    L13:
        e = move-exception;
        JL_Log.w(j, "run", "exception : " + e.getMessage());
        goto L15
    L9:
        JL_Log.d(j, "run", "queue is empty, so waiting for data");
        a(0);
        goto L6
    L16:
        this.d = false;
        this.e = false;
        this.g = false;
        this.c.clear();
        this.f = true;
        this.i.removeCallbacksAndMessages(null);
        Consumer<ThreadState> r1 = this.b;
        if (r1 == null) goto L19;
        r1.accept(new ThreadState(getId(), getName()).setState(0));
    L19:
        JL_Log.d(j, "run", "exit");
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        monitor-enter(this);
        this.d = true;     // Catch: Throwable -> L7
        super.start();     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void stopThread() {
        monitor-enter(this);
        JL_Log.d(j, "stopThread", "");     // Catch: Throwable -> L6
        this.d = false;     // Catch: Throwable -> L6
        a();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public void wakeupSendThread(BleSendTask r3) {
        if (this.d == false) goto L12;
        if (r3 == null) goto L15;
        BleSendTask r0 = this.h;
        if (r0 != null) goto L9;
        return;
    L9:
        if (r0.equals(r3) == false) goto L14;
        r3.setCallback(r0.getCallback());
        this.h = r3;
        a("wakeupSendThread", "status = " + r3.getStatus());
        a();
        return;
    L14:
        return;
    L15:
        return;
    }

    private void a(final BleSendTask r3, final boolean r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.getCallback() == null) goto L15;
        final OnBleSendDataCallback r0 = r3.getCallback();
        if (r0 == null) goto L16;
        Runnable r1 = new v04(r0, r3, r4);
        if (BluetoothConstant.IS_CALLBACK_IN_MAIN == false) goto L12;
        this.i.post(r1);
        return;
    L12:
        r1.run();
        return;
    L16:
        return;
    }

    private static /* synthetic */ void a(OnBleSendDataCallback r6, BleSendTask r7, boolean r8) {
        r6.onResult(r7.getDevice(), r7.getServiceUUID(), r7.getCharacteristicUUID(), r8, r7.getData());
    }

    private boolean b(BleSendTask r5) throws InterruptedException {
        if (r5 != null) goto L5;
        return true;
    L5:
        this.h = r5;
        a("handleTask", "" + r5);
        this.h.setStatus(257);
        this.g = this.a.writeBleData(this.h.getSendParam());
        a("handleTask", "writeDataByBleSync : " + this.g);
        if (this.g == true) goto L8;
    L10:
        int r6 = this.h.getStatus();
        StringBuilder r2 = new StringBuilder();
        r2.append("send data status : ");
        r2.append(r6);
        r2.append(", ");
        if (r6 != 0) goto L13;
        String r3 = "success";
    L14:
        r2.append(r3);
        a("handleTask", r2.toString());
        if (r6 != 0) goto L17;
        a(this.h, true);
    L22:
        return true;
    L17:
        if (this.h.isSendFailedOverLimit() == false) goto L19;
        a(this.h, false);
        goto L22
    L19:
        Thread.sleep(10);
        return false;
    L13:
        r3 = C2985d4.g.e;
        goto L14
    L8:
        if (this.h.getStatus() != 257) goto L10;
        a(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        goto L10
    }

    private boolean a(@NonNull BleSendTask r8) {
        if (this.d == true) goto L5;
        return false;
    L5:
        LinkedBlockingQueue<BleSendTask> r0 = this.c;
        monitor-enter(r0);
        this.c.put(r8);     // Catch: Throwable -> L9 InterruptedException -> L11
        boolean r2 = true;
    L13:
        a("addTask", "result : " + r2 + ", " + r8 + "\n size : " + this.c.size() + ", isQueueEmpty : " + this.f + ", isWaitingForResult : " + this.g);     // Catch: Throwable -> L9
        if (r2 == true) goto L16;
    L20:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r2;
    L16:
        if (this.f == false) goto L20;
        if (this.g == true) goto L20;
        this.f = false;     // Catch: Throwable -> L9
        a();     // Catch: Throwable -> L9
        goto L20
    L9:
        th = move-exception;
        throw th;
    L11:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L9
        r2 = false;
        goto L13
    }

    private void a(long r5) {
        LinkedBlockingQueue<BleSendTask> r0 = this.c;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.e == false) goto L28;
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L28:
        a("lock", "try to lock, timeout = " + r5);     // Catch: Throwable -> L8 InterruptedException -> L13
        if (r5 <= 0) goto L16;
        this.e = true;     // Catch: Throwable -> L8 InterruptedException -> L13
        this.c.wait(r5);     // Catch: Throwable -> L8 InterruptedException -> L13
    L23:
        this.e = false;     // Catch: Throwable -> L8
        a("lock", "release lock.");     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L16:
        if (this.c.isEmpty() == true) goto L20;
        JL_Log.d(j, "lock", "Continue working because the task queue is not empty");     // Catch: Throwable -> L8 InterruptedException -> L13
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L20:
        this.e = true;     // Catch: Throwable -> L8 InterruptedException -> L13
        this.c.wait();     // Catch: Throwable -> L8 InterruptedException -> L13
    L13:
        e = move-exception;
        JL_Log.w(j, "lock", "occurred exception : " + e.getMessage());     // Catch: Throwable -> L8
        goto L23
    }

    private void a() {
        boolean r0 = b();
        a("tryToUnlock", "unlock : " + r0);
        if (r0 == true) goto L6;
        this.i.removeMessages(l);
        this.i.sendEmptyMessageDelayed(l, k);
        return;
    }

    private void a(String r2, String r3) {
        if (BluetoothConstant.IS_LOG_BLE_SEND == true) goto L5;
        return;
    L5:
        JL_Log.d(j, r2, r3);
    }
}
