package com.jieli.bluetooth_connect.tool;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.jf2;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.interfaces.IBluetoothOperation;
import com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback;
import com.jieli.bluetooth_connect.interfaces.callback.OnHistoryRecordCallback;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class ReConnectHelper {
    private static final long DEFAULT_TASK_TIMEOUT = 50000;
    private static final long DELAY = 2000;
    private static final int FAIL_CONNECT_MAX = 2;
    private static final int MSG_RECONNECT = 39271;
    private static final int MSG_RECONNECT_TIMEOUT = 39270;
    private static final long RECONNECT_TIMEOUT = 52000;
    private static final long SCAN_LIMIT = 16000;
    private static final int STATE_CONNECTING = 2;
    private static final int STATE_IDLE = 0;
    private static final int STATE_SCANNING = 1;
    private static final String TAG = "ReConnectHelper";
    private static int sTaskID = 1;
    private final BluetoothEventCallback mBluetoothEventCallback;
    private final IBluetoothOperation mBtOp;
    private final Context mContext;
    private final Handler mHandler;
    private final List<ReconnectTask> mTaskList;
    private long startTime;
    private int taskState;

    public static class ReconnectTask {
        public static final int TASK_TYPE_DEVICE = 1;
        public static final int TASK_TYPE_HISTORY = 2;
        private String address;
        private OnHistoryRecordCallback callback;
        private int connectFailCount;
        private int connectWay;
        private int taskId;
        private int taskTimeout;
        private int taskType;

        public ReconnectTask(String address) {
            setAddress(address);
        }

        public static /* synthetic */ String access$000(ReconnectTask r0) {
            return r0.address;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if (o != null) goto L8;
        L15:
            return false;
        L8:
            if (getClass() != o.getClass()) goto L15;
            ReconnectTask r5 = (ReconnectTask) o;
            if (this.taskType != r5.taskType) goto L15;
            if (Objects.equals(this.address, r5.address) == false) goto L15;
            return true;
        }

        @NonNull
        public String getAddress() {
            return this.address;
        }

        public OnHistoryRecordCallback getCallback() {
            return this.callback;
        }

        public int getConnectFailCount() {
            return this.connectFailCount;
        }

        public int getConnectWay() {
            return this.connectWay;
        }

        public int getTaskId() {
            return this.taskId;
        }

        public int getTaskTimeout() {
            return this.taskTimeout;
        }

        public int getTaskType() {
            return this.taskType;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.address, Integer.valueOf(this.taskType)});
        }

        public void setAddress(@NonNull String address) {
            this.address = address;
        }

        public void setCallback(OnHistoryRecordCallback callback) {
            this.callback = callback;
        }

        public void setConnectFailCount(int connectFailCount) {
            this.connectFailCount = connectFailCount;
        }

        public void setConnectWay(int connectWay) {
            this.connectWay = connectWay;
        }

        public void setTaskId(int taskId) {
            this.taskId = taskId;
        }

        public void setTaskTimeout(int taskTimeout) {
            this.taskTimeout = taskTimeout;
        }

        public void setTaskType(int taskType) {
            this.taskType = taskType;
        }

        @NonNull
        public String toString() {
            return "ReconnectTask{taskId=" + this.taskId + ", address='" + this.address + "', connectWay=" + this.connectWay + ", taskType=" + this.taskType + ", taskTimeout=" + this.taskTimeout + ", connectFailCount=" + this.connectFailCount + i0XO1.IO;
        }
    }

    static {
    }

    public ReConnectHelper(Context context, IBluetoothOperation operation) {
        this.mTaskList = new CopyOnWriteArrayList();
        this.taskState = 0;
        this.mHandler = new Handler(Looper.getMainLooper(), new jf2(this));
        BluetoothEventCallback r0 = new AnonymousClass1(this);
        this.mBluetoothEventCallback = r0;
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        IBluetoothOperation r4 = (IBluetoothOperation) ConnectUtil.checkNotNull(operation);
        this.mBtOp = r4;
        r4.registerBluetoothCallback(r0);
    }

    public static /* synthetic */ boolean OXO1(ReConnectHelper r3, Message r4) {
        r3.getClass();
        switch(r4.what) {
            case 39270: goto L8;
            case 39271: goto L7;
            default: goto L4;
        };
    L4:
        Object r5 = r4.obj;
        if ((r5 instanceof String) == false) goto L11;
        String r6 = (String) r5;
        JL_Log.w(TAG, "TASK_TIMEOUT", "address ： " + r6);
        r3.removeTask(r6, false);
        return true;
    L11:
        return true;
    L7:
        JL_Log.i(TAG, "MSG_RECONNECT", "");
        r3.startReconnectTask();
        return true;
    L8:
        JL_Log.w(TAG, "MSG_RECONNECT_TIMEOUT", "");
        r3.stopReconnect();
        return true;
    }

    public static /* synthetic */ void access$100(ReConnectHelper r0, long r1) {
        r0.postReconnectTaskMsg(r1);
    }

    public static /* synthetic */ void access$1000(ReConnectHelper r0, String r1, boolean r2) {
        r0.removeTask(r1, r2);
    }

    public static /* synthetic */ void access$200(ReConnectHelper r0, int r1) {
        r0.setTaskState(r1);
    }

    public static /* synthetic */ String access$300() {
        return TAG;
    }

    public static /* synthetic */ int access$400(ReConnectHelper r0) {
        return r0.taskState;
    }

    public static /* synthetic */ String access$500(ReConnectHelper r0, BluetoothDevice r1) {
        return r0.printBtDeviceInfo(r1);
    }

    public static /* synthetic */ ReconnectTask access$600(ReConnectHelper r0, String r1) {
        return r0.findReconnectTask(r1);
    }

    public static /* synthetic */ IBluetoothOperation access$700(ReConnectHelper r0) {
        return r0.mBtOp;
    }

    public static /* synthetic */ BluetoothDevice access$800(ReConnectHelper r0, BluetoothDevice r1, BleScanMessage r2, int r3) {
        return r0.findTargetDevice(r1, r2, r3);
    }

    public static /* synthetic */ void access$900(ReConnectHelper r0, BluetoothDevice r1, ReconnectTask r2) {
        r0.connectBtDevice(r1, r2);
    }

    private void addTask(ReconnectTask r5) {
        boolean r0 = false;
        int r1 = 0;
        r1 = 0;
        r0 = false;
        if (r5 != null) goto L5;
    L18:
        if (r0 == false) goto L29;
        r5.setTaskId(autoIncTaskId());
        if (r5.getTaskTimeout() != 0) goto L22;
        r5.setTaskTimeout(50000);
    L22:
        JL_Log.d(TAG, "addTask", "" + r5);
        this.mHandler.removeMessages(r5.getTaskId());
        Handler r2 = this.mHandler;
        r2.sendMessageDelayed(r2.obtainMessage(r5.getTaskId(), r5.getAddress()), (long) r5.getTaskTimeout());
        setStartTime(getCurrentTime());
        this.mHandler.removeMessages(MSG_RECONNECT_TIMEOUT);
        this.mHandler.sendEmptyMessageDelayed(MSG_RECONNECT_TIMEOUT, RECONNECT_TIMEOUT);
        postReconnectTaskMsg(0);
        return;
    L29:
        return;
    L5:
        if (this.mTaskList.contains(r5) == true) goto L18;
        if (r5.getTaskType() == 1) goto L9;
        r0 = this.mTaskList.add(r5);
        goto L18
    L9:
        if (this.mTaskList.isEmpty() == true) goto L16;
        Iterator r3 = new ArrayList(this.mTaskList).iterator();
    L12:
        if (r3.hasNext() == false) goto L16;
        if (1 != ((ReconnectTask) r3.next()).getTaskType()) goto L12;
        r1 = r1 + 1;
    L16:
        this.mTaskList.add(r1, r5);
        r0 = true;
        goto L18
    }

    private static int autoIncTaskId() {
        int r0 = sTaskID;
        int r1 = r0 + 1;
        sTaskID = r1;
        if (r1 < 256) goto L5;
        sTaskID = 1;
    L5:
        return r0;
    }

    private void connectBtDevice(@NonNull BluetoothDevice device, @NonNull ReconnectTask task) {
        String r0 = TAG;
        JL_Log.d(r0, "connectBtDevice", "Ready to connect device. " + device + ", " + task);
        setTaskState(2);
        stopScan();
        if (this.mBtOp.connectBtDevice(device, task.getConnectWay()) == true) goto L10;
        int r7 = task.getConnectFailCount() + 1;
        setTaskState(0);
        JL_Log.w(r0, "connectBtDevice", "Connect device failed. Failure count = " + r7 + ", limit = 2");
        if (r7 >= 2) goto L8;
        task.setConnectFailCount(r7);
        postReconnectTaskMsg(2000);
        return;
    L8:
        removeTask(task, false);
        return;
    }

    private void doReconnectEvent(@NonNull ReconnectTask task) {
        if (BluetoothUtil.isBluetoothEnable() == true) goto L7;
        JL_Log.w(TAG, "doReconnectEvent", "bluetooth is close.");
        return;
    L7:
        if (isTaskRunning() == false) goto L10;
        JL_Log.w(TAG, "doReconnectEvent", "task is running.");
        return;
    L10:
        int r2 = 2;
        if (task.getTaskType() == 2) goto L13;
    L18:
        BluetoothDevice r0 = findSysConnectedDevice(ReconnectTask.access$000(task));
        String r3 = TAG;
        JL_Log.i(r3, "doReconnectEvent", "device ： " + printBtDeviceInfo(r0) + ", reconnectTask = " + task);
        if (r0 == null) goto L23;
        connectBtDevice(r0, task);
        return;
    L23:
        if (this.mBtOp.isScanning() == true) goto L25;
    L47:
        long r6 = getNowLeftTime();
        String r1 = TAG;
        JL_Log.d(r1, "doReconnectEvent", "leftTime ： " + r6 + ", startTime : " + this.startTime);
        if (r6 < 20000) goto L54;
        if (task.getConnectWay() != 1) goto L52;
        boolean r11 = this.mBtOp.startDeviceScan(16000);
        JL_Log.i(r1, "doReconnectEvent", "startDeviceScan ---> " + r11);
    L57:
        if (r11 == false) goto L59;
        setTaskState(1);
        return;
    L59:
        postReconnectTaskMsg(2000);
        return;
    L52:
        r11 = this.mBtOp.startBLEScan(16000);
        JL_Log.i(r1, "doReconnectEvent", "startBLEScan ---> " + r11);
        goto L57
    L54:
        if (task.getConnectWay() != 1) goto L56;
        r2 = 0;
    L56:
        r11 = this.mBtOp.startDeviceScan(r2, r6);
        JL_Log.i(r1, "doReconnectEvent", "startDeviceScan : " + r11 + ", way = " + r2);
        goto L57
    L25:
        if (this.mBtOp.getScanType() != 2) goto L27;
        boolean r4 = true;
    L28:
        if (r4 == false) goto L30;
    L39:
        JL_Log.i(r3, "doReconnectEvent", "isScanOk : " + r4);
        if (r4 == true) goto L64;
        stopScan();
        Thread.sleep(50);     // Catch: InterruptedException -> L45
    L45:
        e = move-exception;
        e.printStackTrace();
        goto L47
    L64:
        return;
    L30:
        if (task.getConnectWay() != 1) goto L34;
        if (this.mBtOp.getScanType() != 1) goto L34;
    L37:
        r4 = true;
    L34:
        if (task.getConnectWay() == 0) goto L36;
    L38:
        r4 = false;
        goto L39
    L36:
        if (this.mBtOp.getScanType() != 0) goto L38;
    L27:
        r4 = false;
        goto L28
    L13:
        if (this.mBtOp.getConnectedDevice() == null) goto L18;
        if (this.mBtOp.getBluetoothOption().isUseMultiDevice() == true) goto L18;
        JL_Log.w(TAG, "doReconnectEvent", "single device manager ");
        stopReconnect();
    }

    private ReconnectTask findReconnectTask(String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L6;
        return null;
    L6:
        if (this.mTaskList.isEmpty() == true) goto L13;
        Iterator r0 = new ArrayList(this.mTaskList).iterator();
    L9:
        if (r0.hasNext() == false) goto L13;
        ReconnectTask r2 = (ReconnectTask) r0.next();
        if (address.equals(r2.getAddress()) == false) goto L9;
        return r2;
    L13:
        return null;
    }

    private BluetoothDevice findSysConnectedDevice(String address) {
        List<BluetoothDevice> r0 = BluetoothUtil.getSystemConnectedBtDeviceList(this.mContext);
        if (r0 == null) goto L10;
        Iterator<BluetoothDevice> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L15;
        BluetoothDevice r2 = r1.next();
        if (r2.getAddress().equals(address) == false) goto L6;
        return r2;
    L15:
        return null;
    L10:
        return null;
    }

    @SuppressLint({"MissingPermission"})
    private BluetoothDevice findTargetDevice(@NonNull BluetoothDevice target, @NonNull BleScanMessage scanMessage, int connectWay) {
        if (connectWay == 0) goto L5;
        BluetoothDevice r4 = getRemoteDevice(scanMessage.getEdrAddr());
        if (r4 != null) goto L29;
        HistoryRecord r5 = this.mBtOp.getHistoryRecord(target.getAddress());
        if (r5 == null) goto L29;
        if (r5.getConnectType() != 1) goto L27;
        String r6 = r5.getAddress();
    L28:
        r4 = getRemoteDevice(r6);
        goto L29
    L27:
        r6 = r5.getMappedAddress();
    L29:
        if (r4 == null) goto L31;
        return r4;
    L31:
        return target;
    L5:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L31;
        if (target.getType() != 1) goto L31;
        HistoryRecord r7 = this.mBtOp.getHistoryRecord(target.getAddress());
        if (r7 != null) goto L11;
        BluetoothDevice r8 = null;
    L16:
        if (r8 == null) goto L31;
        if (BluetoothUtil.deviceEquals(target, r8) == true) goto L31;
        return r8;
    L11:
        if (r7.getConnectType() != 0) goto L13;
        String r9 = r7.getAddress();
    L14:
        r8 = getRemoteDevice(r9);
        goto L16
    L13:
        r9 = r7.getMappedAddress();
        goto L14
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private long getNowLeftTime() {
        return RECONNECT_TIMEOUT - (getCurrentTime() - this.startTime);
    }

    private BluetoothDevice getRemoteDevice(String address) {
        return BluetoothUtil.getRemoteDevice(this.mContext, address);
    }

    private boolean isMatchAddress(String address, String address2) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L5;
    L21:
        return false;
    L5:
        if (BluetoothAdapter.checkBluetoothAddress(address2) == false) goto L21;
        HistoryRecord r0 = this.mBtOp.getHistoryRecord(address);
        if (r0 != null) goto L12;
        return address.equals(address2);
    L12:
        if (address2.equals(r0.getAddress()) == false) goto L14;
        return true;
    L14:
        if (address2.equals(r0.getMappedAddress()) == false) goto L16;
        return true;
    L16:
        if (address2.equals(r0.getUpdateAddress()) == true) goto L23;
        return false;
    L23:
        return true;
    }

    private boolean isTaskRunning() {
        if (this.mBtOp.isConnecting() == false) goto L5;
        return true;
    L5:
        if (this.mBtOp.isScanning() == false) goto L7;
        return true;
    L7:
        if (this.taskState != 0) goto L14;
        return false;
    L14:
        return true;
    }

    private void postReconnectTaskMsg(long delay) {
        this.mHandler.removeMessages(MSG_RECONNECT);
        if (delay <= 0) goto L6;
        this.mHandler.sendEmptyMessageDelayed(MSG_RECONNECT, delay);
        return;
    L6:
        this.mHandler.sendEmptyMessage(MSG_RECONNECT);
    }

    private String printBtDeviceInfo(BluetoothDevice device) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device);
    }

    private void release() {
        setTaskState(0);
        setStartTime(0);
        this.mHandler.removeMessages(MSG_RECONNECT_TIMEOUT);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    private void removeTask(String address, boolean result) {
        ReconnectTask r1 = findReconnectTask(address);
        if (r1 == null) goto L6;
        removeTask(r1, result);
        return;
    }

    private void setStartTime(long time) {
        this.startTime = time;
    }

    private void setTaskState(int taskState) {
        this.taskState = taskState;
    }

    private void startReconnectTask() {
        if (this.mTaskList.isEmpty() == false) goto L5;
        return;
    L5:
        if (isReconnecting() == true) goto L7;
        return;
    L7:
        if (isTaskRunning() == true) goto L12;
        ReconnectTask r0 = this.mTaskList.get(0);
        long r1 = getNowLeftTime();
        JL_Log.i(TAG, "startReconnectTask", "left = " + r1 + ", start reconnect task.");
        doReconnectEvent(r0);
        return;
    }

    private void stopScan() {
        if (this.mBtOp.isScanning() == true) goto L6;
        return;
    L6:
        if (this.mBtOp.getScanType() != 0) goto L9;
        this.mBtOp.stopBLEScan();
        return;
    L9:
        this.mBtOp.stopDeviceScan();
    }

    public void destroy() {
        stopReconnect();
        this.mBtOp.unregisterBluetoothCallback(this.mBluetoothEventCallback);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public boolean isReconnectDev(BluetoothDevice device) {
        if (device != null) goto L6;
        return false;
    L6:
        if (findReconnectTask(device.getAddress()) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean isReconnecting() {
        return this.mHandler.hasMessages(MSG_RECONNECT_TIMEOUT);
    }

    public void reconnectDevice(String address, int connectWay, OnHistoryRecordCallback callback) {
        reconnectDevice(address, connectWay, 0, callback);
    }

    public void reconnectHistory(@NonNull HistoryRecord record) {
        int r3 = 0;
        if (record.getDevType() != 5) goto L5;
    L10:
        boolean r0 = true;
    L12:
        if (record.getConnectType() != 1) goto L15;
        if (r0 == false) goto L15;
        String r1 = record.getMappedAddress();
    L16:
        if (r0 == false) goto L18;
        int r2 = 0;
    L20:
        if (BluetoothAdapter.checkBluetoothAddress(record.getUpdateAddress()) == true) goto L22;
    L24:
        r3 = r2;
    L25:
        ReconnectTask r5 = new ReconnectTask(r1);
        r5.setConnectWay(r3);
        r5.setTaskType(2);
        addTask(r5);
        return;
    L22:
        if (record.getUpdateAddress().equals(r1) == true) goto L24;
        r1 = record.getUpdateAddress();
        goto L25
    L18:
        r2 = record.getConnectType();
    L15:
        r1 = record.getAddress();
        goto L16
    L5:
        if (record.getSdkFlag() == 8) goto L10;
        if (record.getSdkFlag() == 9) goto L10;
        r0 = false;
        goto L12
    }

    public void stopReconnect() {
        if (this.mTaskList.isEmpty() == true) goto L12;
        Iterator r0 = new ArrayList(this.mTaskList).iterator();
    L6:
        if (r0.hasNext() == false) goto L11;
        ReconnectTask r1 = (ReconnectTask) r0.next();
        if (r1.getCallback() == null) goto L10;
        r1.getCallback().onFailed(0, "Reconnect task is stop.");
    L10:
        this.mHandler.removeMessages(r1.getTaskId());
        goto L6
    L11:
        this.mTaskList.clear();
    L12:
        release();
    }

    public void reconnectDevice(String address, int connectWay, int timeout, OnHistoryRecordCallback callback) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L7;
        if (callback == null) goto L9;
        callback.onFailed(1, "Address is error.");
        return;
    L9:
        return;
    L7:
        ReconnectTask r0 = new ReconnectTask(address);
        r0.setTaskType(1);
        r0.setConnectWay(connectWay);
        r0.setTaskTimeout(timeout);
        r0.setCallback(callback);
        addTask(r0);
    }

    private void removeTask(@NonNull ReconnectTask task, boolean result) {
        boolean r0 = this.mTaskList.remove(task);
        JL_Log.w(TAG, "removeTask", task + ", ret = " + r0 + ", result = " + result);
        if (r0 == true) goto L5;
        return;
    L5:
        if (task.getCallback() == null) goto L9;
        if (result == false) goto L8;
        task.getCallback().onSuccess(this.mBtOp.getHistoryRecord(task.getAddress()));
        goto L9
    L8:
        task.getCallback().onFailed(9, ConnectUtil.formatString("Connect device[%s] timeout.", new Object[]{task.getAddress()}));
    L9:
        this.mHandler.removeMessages(task.getTaskId());
        if (this.mTaskList.isEmpty() == true) goto L13;
        postReconnectTaskMsg(0);
        return;
    L13:
        stopReconnect();
    }
}
