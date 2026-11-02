package com.jieli.jl_bt_ota.tool.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import com.facebook.login.widget.ToolTipPopup;
import com.ironsource.C12616d4;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.model.base.ThreadState;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import com.jieli.jl_bt_ota.model.ble.BleSendTask;
import com.jieli.jl_bt_ota.tool.ble.SendBleDataThread;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class SendBleDataThread extends Thread {

    /* JADX INFO: renamed from: j */
    private static final String f37663j = "SendBleDataThread";

    /* JADX INFO: renamed from: k */
    private static final long f37664k = 50;

    /* JADX INFO: renamed from: l */
    private static final int f37665l = 26433;

    /* JADX INFO: renamed from: a */
    private final IBleOperation f37666a;

    /* JADX INFO: renamed from: b */
    private final Consumer<ThreadState> f37667b;

    /* JADX INFO: renamed from: c */
    private final LinkedBlockingQueue<BleSendTask> f37668c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f37669d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f37670e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f37671f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f37672g;

    /* JADX INFO: renamed from: h */
    private volatile BleSendTask f37673h;

    /* JADX INFO: renamed from: i */
    private final Handler f37674i;

    public interface IBleOperation {
        int getBleMtu(BluetoothDevice bluetoothDevice);

        boolean writeBleData(BleSendParam bleSendParam);
    }

    public SendBleDataThread(@NonNull IBleOperation iBleOperation, @NonNull Consumer<ThreadState> consumer) {
        super(f37663j);
        this.f37668c = new LinkedBlockingQueue<>();
        this.f37669d = false;
        this.f37670e = false;
        this.f37671f = true;
        this.f37672g = false;
        this.f37674i = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.w04
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f11851IO.m27123a(message);
            }
        });
        this.f37666a = iBleOperation;
        this.f37667b = consumer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m27123a(Message message) {
        if (f37665l != message.what || !this.f37670e || this.f37668c.isEmpty()) {
            return true;
        }
        JL_Log.m27232d(f37663j, "MSG_CHECK_QUEUE", "size ---> " + this.f37668c.size());
        m27118a();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m27125b() {
        synchronized (this.f37668c) {
            m27122a("unlock", "isLocked : " + this.f37670e);
            if (!this.f37670e) {
                return false;
            }
            try {
                m27122a("unlock", "try to unlock");
                this.f37668c.notifyAll();
                this.f37674i.removeMessages(f37665l);
                return true;
            } catch (Exception e) {
                JL_Log.m27240w(f37663j, "unlock", "occurred exception : " + e.getMessage());
                return false;
            }
        }
    }

    public boolean addSendTask(@NonNull BleSendTask bleSendTask) {
        BluetoothDevice device;
        int bleMtu;
        if (!this.f37669d) {
            return false;
        }
        byte[] data = bleSendTask.getData();
        if (data.length == 0 || (bleMtu = this.f37666a.getBleMtu((device = bleSendTask.getDevice()))) <= 0) {
            return false;
        }
        int i = 0;
        while (i < data.length) {
            int iMin = Math.min(data.length - i, bleMtu);
            byte[] bArr = new byte[iMin];
            System.arraycopy(data, i, bArr, 0, iMin);
            if (!m27124a(new BleSendTask(device, bleSendTask.getServiceUUID(), bleSendTask.getCharacteristicUUID(), bleSendTask.getWriteType(), bArr, bleSendTask.getCallback()))) {
                JL_Log.m27236i(f37663j, "addSendTask", CommonUtil.formatString("loss data, data = [ %s ]", CHexConver.byte2HexStr(bArr)));
                return false;
            }
            i += iMin;
        }
        return true;
    }

    public boolean isRunning() {
        return this.f37669d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        JL_Log.m27232d(f37663j, "run", "start");
        Consumer<ThreadState> consumer = this.f37667b;
        if (consumer != null) {
            consumer.accept(new ThreadState(getId(), getName()).setState(1));
        }
        while (this.f37669d) {
            this.f37673h = null;
            this.f37672g = false;
            this.f37671f = this.f37668c.isEmpty();
            if (this.f37671f) {
                JL_Log.m27232d(f37663j, "run", "queue is empty, so waiting for data");
                m27119a(0L);
            } else {
                try {
                    if (m27126b(this.f37668c.peek())) {
                        this.f37668c.poll();
                    }
                } catch (InterruptedException e) {
                    JL_Log.m27240w(f37663j, "run", "exception : " + e.getMessage());
                }
            }
        }
        this.f37669d = false;
        this.f37670e = false;
        this.f37672g = false;
        this.f37668c.clear();
        this.f37671f = true;
        this.f37674i.removeCallbacksAndMessages(null);
        Consumer<ThreadState> consumer2 = this.f37667b;
        if (consumer2 != null) {
            consumer2.accept(new ThreadState(getId(), getName()).setState(0));
        }
        JL_Log.m27232d(f37663j, "run", "exit");
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        this.f37669d = true;
        super.start();
    }

    public synchronized void stopThread() {
        JL_Log.m27232d(f37663j, "stopThread", "");
        this.f37669d = false;
        m27118a();
    }

    public void wakeupSendThread(BleSendTask bleSendTask) {
        BleSendTask bleSendTask2;
        if (!this.f37669d || bleSendTask == null || (bleSendTask2 = this.f37673h) == null || !bleSendTask2.equals(bleSendTask)) {
            return;
        }
        bleSendTask.setCallback(bleSendTask2.getCallback());
        this.f37673h = bleSendTask;
        m27122a("wakeupSendThread", "status = " + bleSendTask.getStatus());
        m27118a();
    }

    /* JADX INFO: renamed from: a */
    private void m27121a(final BleSendTask bleSendTask, final boolean z) {
        final OnBleSendDataCallback callback;
        if (bleSendTask == null || bleSendTask.getCallback() == null || (callback = bleSendTask.getCallback()) == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.v04
            @Override // java.lang.Runnable
            public final void run() {
                SendBleDataThread.m27120a(callback, bleSendTask, z);
            }
        };
        if (BluetoothConstant.IS_CALLBACK_IN_MAIN) {
            this.f37674i.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27120a(OnBleSendDataCallback onBleSendDataCallback, BleSendTask bleSendTask, boolean z) {
        onBleSendDataCallback.onResult(bleSendTask.getDevice(), bleSendTask.getServiceUUID(), bleSendTask.getCharacteristicUUID(), z, bleSendTask.getData());
    }

    /* JADX INFO: renamed from: b */
    private boolean m27126b(BleSendTask bleSendTask) throws InterruptedException {
        if (bleSendTask == null) {
            return true;
        }
        this.f37673h = bleSendTask;
        m27122a("handleTask", "" + bleSendTask);
        this.f37673h.setStatus(257);
        this.f37672g = this.f37666a.writeBleData(this.f37673h.getSendParam());
        m27122a("handleTask", "writeDataByBleSync : " + this.f37672g);
        if (this.f37672g && this.f37673h.getStatus() == 257) {
            m27119a(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        }
        int status = this.f37673h.getStatus();
        StringBuilder sb = new StringBuilder();
        sb.append("send data status : ");
        sb.append(status);
        sb.append(", ");
        sb.append(status == 0 ? "success" : C12616d4.g.f34259e);
        m27122a("handleTask", sb.toString());
        if (status != 0) {
            if (this.f37673h.isSendFailedOverLimit()) {
                m27121a(this.f37673h, false);
            } else {
                Thread.sleep(10L);
                return false;
            }
        } else {
            m27121a(this.f37673h, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m27124a(@NonNull BleSendTask bleSendTask) {
        boolean z;
        if (!this.f37669d) {
            return false;
        }
        synchronized (this.f37668c) {
            try {
                this.f37668c.put(bleSendTask);
                z = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
                z = false;
            }
            m27122a("addTask", "result : " + z + ", " + bleSendTask + "\n size : " + this.f37668c.size() + ", isQueueEmpty : " + this.f37671f + ", isWaitingForResult : " + this.f37672g);
            if (z && this.f37671f && !this.f37672g) {
                this.f37671f = false;
                m27118a();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private void m27119a(long j) {
        synchronized (this.f37668c) {
            if (this.f37670e) {
                return;
            }
            try {
                m27122a("lock", "try to lock, timeout = " + j);
                if (j > 0) {
                    this.f37670e = true;
                    this.f37668c.wait(j);
                } else if (!this.f37668c.isEmpty()) {
                    JL_Log.m27232d(f37663j, "lock", "Continue working because the task queue is not empty");
                    return;
                } else {
                    this.f37670e = true;
                    this.f37668c.wait();
                }
            } catch (InterruptedException e) {
                JL_Log.m27240w(f37663j, "lock", "occurred exception : " + e.getMessage());
            }
            this.f37670e = false;
            m27122a("lock", "release lock.");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27118a() {
        boolean zM27125b = m27125b();
        m27122a("tryToUnlock", "unlock : " + zM27125b);
        if (zM27125b) {
            return;
        }
        this.f37674i.removeMessages(f37665l);
        this.f37674i.sendEmptyMessageDelayed(f37665l, f37664k);
    }

    /* JADX INFO: renamed from: a */
    private void m27122a(String str, String str2) {
        if (BluetoothConstant.IS_LOG_BLE_SEND) {
            JL_Log.m27232d(f37663j, str, str2);
        }
    }
}
