package com.szabh.smable3.component;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.I1Ii;
import com.android.mltcode.paycertificationapi.O1iO;
import com.android.mltcode.paycertificationapi.X01O0O1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg2;
import com.android.mltcode.paycertificationapi.h77;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iO00;
import com.android.mltcode.paycertificationapi.ib1;
import com.android.mltcode.paycertificationapi.jj3;
import com.android.mltcode.paycertificationapi.nk3;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMessenger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMessenger.kt\ncom/szabh/smable3/component/BleMessenger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class BleMessenger extends iO00 {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static final String LOG_HEADER = "BleMessenger";
    public static final int RETRY_MAX_TIMES = 3;

    @aa1
    private final LinkedList<X01O0O1> mBleMessages;

    @aa1
    private Handler mHandler;

    @tb1
    private MessageTask mMessageTask;

    @tb1
    private BleMessengerCallback mMessengerCallback;

    @aa1
    private final Semaphore mPacketSemaphore;

    @aa1
    private final Thread mPacketThread;
    private volatile boolean mRunning;

    @aa1
    private final LinkedBlockingDeque<h77> mWritePackets;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public final class MessageTask implements Runnable {
        private int mRetry;

        @aa1
        private final X01O0O1 message;
        final /* synthetic */ BleMessenger this$0;

        public MessageTask(@aa1 BleMessenger r2, X01O0O1 r3) {
            Intrinsics.X0O(r3, "message");
            this.this$0 = r2;
            this.message = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGatt r0 = this.this$0.getMAbsBleConnector().getMBluetoothGatt();
            if (r0 == null) goto L59;
            int r1 = this.mRetry;
            if (r1 != 3) goto L12;
            BleMessengerCallback r2 = this.this$0.getMMessengerCallback();
            if (r2 == null) goto L10;
            r2.onTimeout(this.message);
        L10:
            this.this$0.dequeueMessage();
            return;
        L12:
            this.mRetry = r1 + 1;
            if (BleConnector.INSTANCE.getDisableStreamLog() == true) goto L15;
        L16:
            i1O0OXO1O.OXO1.IiI10X("MessageTask -> try(" + this.mRetry + "), " + this.message);
        L17:
            X01O0O1 r3 = this.message;
            if ((r3 instanceof dg2) == false) goto L24;
            BluetoothGattCharacteristic r4 = this.this$0.getMAbsBleConnector().getCharacteristic(((dg2) this.message).IiI10X(), ((dg2) this.message).O00());
            if (r4 == null) goto L55;
            r0.readCharacteristic(r4);
            return;
        L55:
            return;
        L24:
            if ((r3 instanceof h77) == false) goto L33;
            if (this.mRetry <= 1) goto L30;
            BleMessengerCallback r5 = this.this$0.getMMessengerCallback();
            if (r5 == null) goto L30;
            r5.onRetry();
        L30:
            this.this$0.enqueueWritePackets((h77) this.message);
            BleMessenger.access$getMHandler$p(this.this$0).postDelayed(this, this.this$0.getMAbsBleConnector().getMTimeout());
            return;
        L33:
            if ((r3 instanceof ib1) == false) goto L45;
            BluetoothGattCharacteristic r6 = this.this$0.getMAbsBleConnector().getCharacteristic(((ib1) this.message).I0IIOi(), ((ib1) this.message).IiI10X());
            if (r6 == null) goto L56;
            BluetoothGattDescriptor r7 = this.this$0.getMAbsBleConnector().getNotifyDescriptor(r6);
            if (r7 != null) goto L39;
            return;
        L39:
            if (((ib1) this.message).XOO0ii0() == false) goto L41;
            byte[] r8 = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        L42:
            r7.setValue(r8);
            r0.setCharacteristicNotification(r6, ((ib1) this.message).XOO0ii0());
            r0.writeDescriptor(r7);
            return;
        L41:
            r8 = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            goto L42
        L56:
            return;
        L45:
            if ((r3 instanceof nk3) == false) goto L49;
            r0.requestMtu(((nk3) r3).XO0O10());
            return;
        L49:
            if ((r3 instanceof jj3) == false) goto L58;
            BluetoothGatt r9 = this.this$0.getMAbsBleConnector().getMBluetoothGatt();
            if (r9 == null) goto L53;
            r9.requestConnectionPriority(((jj3) this.message).XO0O10());
        L53:
            this.this$0.dequeueMessage();
            return;
        L58:
            return;
        L15:
            if (this.mRetry <= 1) goto L17;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMessenger() {
        this.mRunning = true;
        this.mBleMessages = new LinkedList();
        this.mWritePackets = new LinkedBlockingDeque();
        this.mPacketSemaphore = new Semaphore(1);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mPacketThread = ThreadsKt.iO(false, false, null, "BleMessenger WritePacket", 0, new O1iO(this), 23, null);
    }

    public static /* synthetic */ Unit OXO1(BleMessenger r0) {
        return mPacketThread$lambda$0(r0);
    }

    public static final /* synthetic */ Handler access$getMHandler$p(BleMessenger r0) {
        return r0.mHandler;
    }

    private static final Unit mPacketThread$lambda$0(BleMessenger r8) {
    L23:
        if (r8.mRunning == false) goto L22;
        h77 r0 = r8.mWritePackets.take();     // Catch: InterruptedException -> L20
        r8.mPacketSemaphore.acquire();     // Catch: InterruptedException -> L20
        if (r8.mRunning == false) goto L22;
        BluetoothGatt r1 = r8.getMAbsBleConnector().getMBluetoothGatt();     // Catch: InterruptedException -> L20
        BluetoothGattCharacteristic r2 = r8.getMAbsBleConnector().getCharacteristic(r0.iO(), r0.OXO1());     // Catch: InterruptedException -> L20
        boolean r3 = false;
        if (r1 == null) goto L17;
        if (r2 == null) goto L17;
        int r4 = r8.getMAbsBleConnector().getWriteType();     // Catch: InterruptedException -> L20
        if (Build.VERSION.SDK_INT >= 33) goto L12;
    L16:
        r2.setValue(r0.XIi00iiXO());     // Catch: InterruptedException -> L20
        r3 = r1.writeCharacteristic(r2);     // Catch: InterruptedException -> L20
        goto L17
    L12:
        if (r4 == (-1)) goto L16;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger WritePacket writeType " + r2.getWriteType() + ", " + r4);     // Catch: InterruptedException -> L20
        if (I1Ii.OXO1(r1, r2, r0.XIi00iiXO(), r4) != 0) goto L17;
        r3 = true;
    L17:
        if (r3 == true) goto L23;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger WritePacket failed");     // Catch: InterruptedException -> L20
        r8.mPacketSemaphore.release();     // Catch: InterruptedException -> L20
    L22:
        return Unit.OXO1;
    L20:
        i1O0OXO1O.OXO1.IiI10X("BleMessenger BleMessageThread interrupted -> exit");
        goto L22
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void dequeueMessage() {
        monitor-enter(this);
        MessageTask r0 = this.mMessageTask;     // Catch: Throwable -> L6
        if (r0 == null) goto L9;
        this.mHandler.removeCallbacks(r0);     // Catch: Throwable -> L6
        this.mMessageTask = null;     // Catch: Throwable -> L6
    L9:
        if (this.mBleMessages.isEmpty() == true) goto L11;
        X01O0O1 r1 = this.mBleMessages.removeFirst();     // Catch: Throwable -> L6
        Intrinsics.O10IXXX0X(r1, "removeFirst(...)");     // Catch: Throwable -> L6
        MessageTask r2 = new MessageTask(this, r1);     // Catch: Throwable -> L6
        this.mHandler.post(r2);     // Catch: Throwable -> L6
        this.mMessageTask = r2;     // Catch: Throwable -> L6
    L12:
        monitor-exit(this);
        return;
    L11:
        i1O0OXO1O.OXO1.IiI10X("BleMessenger dequeueMessage -> No message right now");     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void dequeueWritePacket() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (BleConnector.INSTANCE.getDisableStreamLog() == true) goto L9;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger dequeueWritePacket");     // Catch: Throwable -> L6
    L9:
        if (this.mPacketSemaphore.availablePermits() != 0) goto L11;
        this.mPacketSemaphore.release();     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void enqueueMessage(@aa1 X01O0O1 r4) {
        monitor-enter(this);
        Intrinsics.X0O(r4, "message");     // Catch: Throwable -> L6
        if (BleConnector.INSTANCE.getDisableStreamLog() == true) goto L8;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueMessage -> " + r4);     // Catch: Throwable -> L6
    L8:
        this.mBleMessages.addLast(r4);     // Catch: Throwable -> L6
        if (this.mMessageTask != null) goto L11;
        dequeueMessage();     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void enqueueWritePackets(@aa1 h77 r7) {
        monitor-enter(this);
        Intrinsics.X0O(r7, "message");     // Catch: Throwable -> L6
        if ((r7.XIi00iiXO().length % getMPacketSize()) != 0) goto L8;
        int r0 = r7.XIi00iiXO().length / getMPacketSize();     // Catch: Throwable -> L6
    L9:
        if (r0 == 1) goto L11;
        int r1 = 0;
    L15:
        if (r1 >= r0) goto L25;
        byte[] r2 = r7.XIi00iiXO();     // Catch: Throwable -> L6
        int r3 = getMPacketSize() * r1;     // Catch: Throwable -> L6
        if (r1 != (r0 - 1)) goto L19;
        int r4 = r7.XIi00iiXO().length;     // Catch: Throwable -> L6
    L20:
        h77 r5 = new h77(r7.iO(), r7.OXO1(), ArraysKt___ArraysJvmKt.I0IIOI(r2, r3, r4));     // Catch: Throwable -> L6
        if (BleConnector.INSTANCE.getDisableStreamLog() == true) goto L23;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueWritePackets -> " + r5);     // Catch: Throwable -> L6
    L23:
        this.mWritePackets.put(r5);     // Catch: Throwable -> L6
        r1 = r1 + 1;
        goto L15
    L19:
        r4 = (r1 + 1) * getMPacketSize();     // Catch: Throwable -> L6
    L25:
        monitor-exit(this);
        return;
    L11:
        if (BleConnector.INSTANCE.getDisableStreamLog() == true) goto L13;
        i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueWritePackets -> " + r7);     // Catch: Throwable -> L6
    L13:
        this.mWritePackets.put(r7);     // Catch: Throwable -> L6
        goto L25
    L8:
        r0 = (r7.XIi00iiXO().length / getMPacketSize()) + 1;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    @tb1
    public final BleMessengerCallback getMMessengerCallback() {
        return this.mMessengerCallback;
    }

    public final synchronized void release() {
        monitor-enter(this);
        i1O0OXO1O.OXO1.IiI10X("BleMessenger -> release");     // Catch: Throwable -> L6
        this.mRunning = false;     // Catch: Throwable -> L6
        reset();     // Catch: Throwable -> L6
        this.mPacketThread.interrupt();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void replyMessage(@aa1 h77 r4) {
        monitor-enter(this);
        Intrinsics.X0O(r4, "message");     // Catch: Throwable -> L6
        i1O0OXO1O.OXO1.IiI10X("BleMessenger replyMessage -> " + r4);     // Catch: Throwable -> L6
        enqueueWritePackets(r4);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void reset() {
        monitor-enter(this);
        i1O0OXO1O.OXO1.IiI10X("BleMessenger -> reset");     // Catch: Throwable -> L6
        MessageTask r0 = this.mMessageTask;     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        this.mHandler.removeCallbacks(r0);     // Catch: Throwable -> L6
    L8:
        this.mMessageTask = null;     // Catch: Throwable -> L6
        this.mBleMessages.clear();     // Catch: Throwable -> L6
        this.mWritePackets.clear();     // Catch: Throwable -> L6
        if (this.mPacketSemaphore.availablePermits() != 0) goto L12;
        this.mPacketSemaphore.release();     // Catch: Throwable -> L6
    L14:
        monitor-exit(this);
        return;
    L12:
        if (this.mPacketSemaphore.availablePermits() <= 1) goto L14;
        Semaphore r1 = this.mPacketSemaphore;     // Catch: Throwable -> L6
        r1.acquire(r1.availablePermits() - 1);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void sendDataDirectly(@aa1 h77 r4) {
        monitor-enter(this);
        Intrinsics.X0O(r4, "message");     // Catch: Throwable -> L6
        this.mWritePackets.addFirst(r4);     // Catch: Throwable -> L6
        i1O0OXO1O.OXO1.OXO1("BleMessenger 插队发送:" + ByteArrayExtKt.getMHexString(r4.XIi00iiXO()));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final void setMMessengerCallback(@tb1 BleMessengerCallback r1) {
        this.mMessengerCallback = r1;
    }
}
