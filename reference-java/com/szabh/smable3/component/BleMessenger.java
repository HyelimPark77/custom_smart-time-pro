package com.szabh.smable3.component;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
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
import com.szabh.smable3.component.BleMessenger;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMessenger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMessenger.kt\ncom/szabh/smable3/component/BleMessenger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class BleMessenger extends iO00 {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private static final String LOG_HEADER = "BleMessenger";
    public static final int RETRY_MAX_TIMES = 3;

    @tb1
    private MessageTask mMessageTask;

    @tb1
    private BleMessengerCallback mMessengerCallback;
    private volatile boolean mRunning = true;

    @aa1
    private final LinkedList<X01O0O1> mBleMessages = new LinkedList<>();

    @aa1
    private final LinkedBlockingDeque<h77> mWritePackets = new LinkedBlockingDeque<>();

    @aa1
    private final Semaphore mPacketSemaphore = new Semaphore(1);

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @aa1
    private final Thread mPacketThread = ThreadsKt.m39451iO(false, false, null, "BleMessenger WritePacket", 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.O1iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleMessenger.mPacketThread$lambda$0(this.f2844IO);
        }
    }, 23, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
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

        public MessageTask(@aa1 BleMessenger bleMessenger, X01O0O1 message) {
            Intrinsics.X0O(message, "message");
            this.this$0 = bleMessenger;
            this.message = message;
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothGattDescriptor notifyDescriptor;
            BleMessengerCallback mMessengerCallback;
            BluetoothGatt mBluetoothGatt = this.this$0.getMAbsBleConnector().getMBluetoothGatt();
            if (mBluetoothGatt == null) {
                return;
            }
            int i = this.mRetry;
            if (i == 3) {
                BleMessengerCallback mMessengerCallback2 = this.this$0.getMMessengerCallback();
                if (mMessengerCallback2 != null) {
                    mMessengerCallback2.onTimeout(this.message);
                }
                this.this$0.dequeueMessage();
                return;
            }
            this.mRetry = i + 1;
            if (!BleConnector.INSTANCE.getDisableStreamLog() || this.mRetry > 1) {
                i1O0OXO1O.OXO1.IiI10X("MessageTask -> try(" + this.mRetry + "), " + this.message);
            }
            X01O0O1 x01o0o1 = this.message;
            if (x01o0o1 instanceof dg2) {
                BluetoothGattCharacteristic characteristic = this.this$0.getMAbsBleConnector().getCharacteristic(((dg2) this.message).IiI10X(), ((dg2) this.message).O00());
                if (characteristic != null) {
                    mBluetoothGatt.readCharacteristic(characteristic);
                    return;
                }
                return;
            }
            if (x01o0o1 instanceof h77) {
                if (this.mRetry > 1 && (mMessengerCallback = this.this$0.getMMessengerCallback()) != null) {
                    mMessengerCallback.onRetry();
                }
                this.this$0.enqueueWritePackets((h77) this.message);
                this.this$0.mHandler.postDelayed(this, this.this$0.getMAbsBleConnector().getMTimeout());
                return;
            }
            if (x01o0o1 instanceof ib1) {
                BluetoothGattCharacteristic characteristic2 = this.this$0.getMAbsBleConnector().getCharacteristic(((ib1) this.message).I0IIOi(), ((ib1) this.message).IiI10X());
                if (characteristic2 == null || (notifyDescriptor = this.this$0.getMAbsBleConnector().getNotifyDescriptor(characteristic2)) == null) {
                    return;
                }
                notifyDescriptor.setValue(((ib1) this.message).XOO0ii0() ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                mBluetoothGatt.setCharacteristicNotification(characteristic2, ((ib1) this.message).XOO0ii0());
                mBluetoothGatt.writeDescriptor(notifyDescriptor);
                return;
            }
            if (x01o0o1 instanceof nk3) {
                mBluetoothGatt.requestMtu(((nk3) x01o0o1).XO0O10());
            } else if (x01o0o1 instanceof jj3) {
                BluetoothGatt mBluetoothGatt2 = this.this$0.getMAbsBleConnector().getMBluetoothGatt();
                if (mBluetoothGatt2 != null) {
                    mBluetoothGatt2.requestConnectionPriority(((jj3) this.message).XO0O10());
                }
                this.this$0.dequeueMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mPacketThread$lambda$0(BleMessenger bleMessenger) {
        while (bleMessenger.mRunning) {
            try {
                h77 h77VarTake = bleMessenger.mWritePackets.take();
                bleMessenger.mPacketSemaphore.acquire();
                if (!bleMessenger.mRunning) {
                    break;
                }
                BluetoothGatt mBluetoothGatt = bleMessenger.getMAbsBleConnector().getMBluetoothGatt();
                BluetoothGattCharacteristic characteristic = bleMessenger.getMAbsBleConnector().getCharacteristic(h77VarTake.m1883iO(), h77VarTake.OXO1());
                boolean zWriteCharacteristic = false;
                if (mBluetoothGatt != null && characteristic != null) {
                    int writeType = bleMessenger.getMAbsBleConnector().getWriteType();
                    if (Build.VERSION.SDK_INT < 33 || writeType == -1) {
                        characteristic.setValue(h77VarTake.XIi00iiXO());
                        zWriteCharacteristic = mBluetoothGatt.writeCharacteristic(characteristic);
                    } else {
                        i1O0OXO1O.OXO1.IiI10X("BleMessenger WritePacket writeType " + characteristic.getWriteType() + ", " + writeType);
                        if (mBluetoothGatt.writeCharacteristic(characteristic, h77VarTake.XIi00iiXO(), writeType) == 0) {
                            zWriteCharacteristic = true;
                        }
                    }
                }
                if (!zWriteCharacteristic) {
                    i1O0OXO1O.OXO1.IiI10X("BleMessenger WritePacket failed");
                    bleMessenger.mPacketSemaphore.release();
                }
            } catch (InterruptedException unused) {
                i1O0OXO1O.OXO1.IiI10X("BleMessenger BleMessageThread interrupted -> exit");
            }
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void dequeueMessage() {
        try {
            MessageTask messageTask = this.mMessageTask;
            if (messageTask != null) {
                this.mHandler.removeCallbacks(messageTask);
                this.mMessageTask = null;
            }
            if (this.mBleMessages.isEmpty()) {
                i1O0OXO1O.OXO1.IiI10X("BleMessenger dequeueMessage -> No message right now");
            } else {
                X01O0O1 x01o0o1RemoveFirst = this.mBleMessages.removeFirst();
                Intrinsics.O10IXXX0X(x01o0o1RemoveFirst, "removeFirst(...)");
                MessageTask messageTask2 = new MessageTask(this, x01o0o1RemoveFirst);
                this.mHandler.post(messageTask2);
                this.mMessageTask = messageTask2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void dequeueWritePacket() {
        try {
            if (!BleConnector.INSTANCE.getDisableStreamLog()) {
                i1O0OXO1O.OXO1.IiI10X("BleMessenger dequeueWritePacket");
            }
            if (this.mPacketSemaphore.availablePermits() == 0) {
                this.mPacketSemaphore.release();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void enqueueMessage(@aa1 X01O0O1 message) {
        try {
            Intrinsics.X0O(message, "message");
            if (!BleConnector.INSTANCE.getDisableStreamLog()) {
                i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueMessage -> " + message);
            }
            this.mBleMessages.addLast(message);
            if (this.mMessageTask == null) {
                dequeueMessage();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void enqueueWritePackets(@aa1 h77 message) {
        try {
            Intrinsics.X0O(message, "message");
            int length = message.XIi00iiXO().length % getMPacketSize() == 0 ? message.XIi00iiXO().length / getMPacketSize() : (message.XIi00iiXO().length / getMPacketSize()) + 1;
            if (length == 1) {
                if (!BleConnector.INSTANCE.getDisableStreamLog()) {
                    i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueWritePackets -> " + message);
                }
                this.mWritePackets.put(message);
            } else {
                int i = 0;
                while (i < length) {
                    h77 h77Var = new h77(message.m1883iO(), message.OXO1(), ArraysKt___ArraysJvmKt.I0IIOI(message.XIi00iiXO(), getMPacketSize() * i, i == length + (-1) ? message.XIi00iiXO().length : (i + 1) * getMPacketSize()));
                    if (!BleConnector.INSTANCE.getDisableStreamLog()) {
                        i1O0OXO1O.OXO1.IiI10X("BleMessenger enqueueWritePackets -> " + h77Var);
                    }
                    this.mWritePackets.put(h77Var);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @tb1
    public final BleMessengerCallback getMMessengerCallback() {
        return this.mMessengerCallback;
    }

    public final synchronized void release() {
        i1O0OXO1O.OXO1.IiI10X("BleMessenger -> release");
        this.mRunning = false;
        reset();
        this.mPacketThread.interrupt();
    }

    public final synchronized void replyMessage(@aa1 h77 message) {
        Intrinsics.X0O(message, "message");
        i1O0OXO1O.OXO1.IiI10X("BleMessenger replyMessage -> " + message);
        enqueueWritePackets(message);
    }

    @Override // com.android.mltcode.paycertificationapi.iO00
    public synchronized void reset() {
        try {
            i1O0OXO1O.OXO1.IiI10X("BleMessenger -> reset");
            MessageTask messageTask = this.mMessageTask;
            if (messageTask != null) {
                this.mHandler.removeCallbacks(messageTask);
            }
            this.mMessageTask = null;
            this.mBleMessages.clear();
            this.mWritePackets.clear();
            if (this.mPacketSemaphore.availablePermits() == 0) {
                this.mPacketSemaphore.release();
            } else if (this.mPacketSemaphore.availablePermits() > 1) {
                Semaphore semaphore = this.mPacketSemaphore;
                semaphore.acquire(semaphore.availablePermits() - 1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void sendDataDirectly(@aa1 h77 message) {
        Intrinsics.X0O(message, "message");
        this.mWritePackets.addFirst(message);
        i1O0OXO1O.OXO1.OXO1("BleMessenger 插队发送:" + ByteArrayExtKt.getMHexString(message.XIi00iiXO()));
    }

    public final void setMMessengerCallback(@tb1 BleMessengerCallback bleMessengerCallback) {
        this.mMessengerCallback = bleMessengerCallback;
    }
}
