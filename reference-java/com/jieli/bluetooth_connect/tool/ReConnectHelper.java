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
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.impl.BluetoothManager;
import com.jieli.bluetooth_connect.interfaces.IBluetoothOperation;
import com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback;
import com.jieli.bluetooth_connect.interfaces.callback.OnHistoryRecordCallback;
import com.jieli.bluetooth_connect.tool.ReConnectHelper;
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
    private long startTime;
    private final List<ReconnectTask> mTaskList = new CopyOnWriteArrayList();
    private int taskState = 0;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.jf2
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return ReConnectHelper.OXO1(this.f8952IO, message);
        }
    });

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

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && getClass() == o.getClass()) {
                ReconnectTask reconnectTask = (ReconnectTask) o;
                if (this.taskType == reconnectTask.taskType && Objects.equals(this.address, reconnectTask.address)) {
                    return true;
                }
            }
            return false;
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
            return Objects.hash(this.address, Integer.valueOf(this.taskType));
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
            return "ReconnectTask{taskId=" + this.taskId + ", address='" + this.address + "', connectWay=" + this.connectWay + ", taskType=" + this.taskType + ", taskTimeout=" + this.taskTimeout + ", connectFailCount=" + this.connectFailCount + i0XO1.f7442IO;
        }
    }

    public ReConnectHelper(Context context, IBluetoothOperation operation) {
        BluetoothEventCallback bluetoothEventCallback = new BluetoothEventCallback() { // from class: com.jieli.bluetooth_connect.tool.ReConnectHelper.1
            @Override // com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback, com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
            public void onAdapterStatus(boolean bEnabled, boolean bHasBle) {
                if (ReConnectHelper.this.isReconnecting()) {
                    if (bEnabled) {
                        ReConnectHelper.this.postReconnectTaskMsg(0L);
                    } else {
                        ReConnectHelper.this.setTaskState(0);
                    }
                }
            }

            @Override // com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback, com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
            public void onConnection(BluetoothDevice device, int status) {
                if (ReConnectHelper.this.isReconnecting()) {
                    if (status == 1) {
                        return;
                    }
                    boolean zIsReconnectDev = ReConnectHelper.this.isReconnectDev(device);
                    JL_Log.m26851i(ReConnectHelper.TAG, "onConnection", "device ： " + ReConnectHelper.this.printBtDeviceInfo(device) + ", status : " + status + ", isReconnectDevice = " + zIsReconnectDev);
                    if (zIsReconnectDev) {
                        ReConnectHelper.this.setTaskState(0);
                        ReConnectHelper.this.removeTask(device.getAddress(), status == 2);
                    }
                }
            }

            @Override // com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback, com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
            public void onDiscovery(BluetoothDevice device, BleScanMessage bleScanMessage) {
                ReconnectTask reconnectTaskFindReconnectTask;
                if (device == null || bleScanMessage == null || !ReConnectHelper.this.isReconnecting()) {
                    return;
                }
                String address = device.getAddress();
                JL_Log.m26847d(ReConnectHelper.TAG, "onDiscovery", "device : " + ReConnectHelper.this.printBtDeviceInfo(device) + ", " + bleScanMessage);
                if (bleScanMessage.isOTA()) {
                    reconnectTaskFindReconnectTask = ReConnectHelper.this.findReconnectTask(bleScanMessage.getOtaBleAddress());
                    if (reconnectTaskFindReconnectTask == null) {
                        reconnectTaskFindReconnectTask = ReConnectHelper.this.findReconnectTask(address);
                    }
                    if (reconnectTaskFindReconnectTask != null) {
                        if (reconnectTaskFindReconnectTask.getConnectWay() != 0) {
                            reconnectTaskFindReconnectTask.setConnectWay(0);
                        }
                        HistoryRecord historyRecord = ReConnectHelper.this.mBtOp.getHistoryRecord(address);
                        if (historyRecord != null && !device.getAddress().equals(historyRecord.getUpdateAddress())) {
                            historyRecord.setUpdateAddress(device.getAddress());
                            ((BluetoothManager) ReConnectHelper.this.mBtOp).getHistoryRecordHelper().updateHistoryRecord(historyRecord);
                        }
                    } else {
                        device = null;
                    }
                } else {
                    ReconnectTask reconnectTaskFindReconnectTask2 = ReConnectHelper.this.findReconnectTask(address);
                    if (reconnectTaskFindReconnectTask2 != null) {
                        device = ReConnectHelper.this.findTargetDevice(device, bleScanMessage, reconnectTaskFindReconnectTask2.getConnectWay());
                        reconnectTaskFindReconnectTask = reconnectTaskFindReconnectTask2;
                    } else {
                        reconnectTaskFindReconnectTask = reconnectTaskFindReconnectTask2;
                        device = null;
                    }
                }
                JL_Log.m26851i(ReConnectHelper.TAG, "onDiscovery", "connectDev = " + ReConnectHelper.this.printBtDeviceInfo(device) + ", " + reconnectTaskFindReconnectTask);
                if (device != null) {
                    ReConnectHelper.this.connectBtDevice(device, reconnectTaskFindReconnectTask);
                }
            }

            @Override // com.jieli.bluetooth_connect.interfaces.callback.BluetoothEventCallback, com.jieli.bluetooth_connect.interfaces.callback.IBluetoothEventCallback
            public void onDiscoveryStatus(boolean bBle, boolean bStart) {
                if (ReConnectHelper.this.isReconnecting()) {
                    JL_Log.m26851i(ReConnectHelper.TAG, "onDiscoveryStatus", "Start ： " + bStart);
                    if (bStart || ReConnectHelper.this.taskState > 1) {
                        return;
                    }
                    ReConnectHelper.this.setTaskState(0);
                    ReConnectHelper.this.postReconnectTaskMsg(2000L);
                }
            }
        };
        this.mBluetoothEventCallback = bluetoothEventCallback;
        this.mContext = (Context) ConnectUtil.checkNotNull(context);
        IBluetoothOperation iBluetoothOperation = (IBluetoothOperation) ConnectUtil.checkNotNull(operation);
        this.mBtOp = iBluetoothOperation;
        iBluetoothOperation.registerBluetoothCallback(bluetoothEventCallback);
    }

    public static /* synthetic */ boolean OXO1(ReConnectHelper reConnectHelper, Message message) {
        reConnectHelper.getClass();
        switch (message.what) {
            case MSG_RECONNECT_TIMEOUT /* 39270 */:
                JL_Log.m26855w(TAG, "MSG_RECONNECT_TIMEOUT", "");
                reConnectHelper.stopReconnect();
                break;
            case MSG_RECONNECT /* 39271 */:
                JL_Log.m26851i(TAG, "MSG_RECONNECT", "");
                reConnectHelper.startReconnectTask();
                break;
            default:
                Object obj = message.obj;
                if (obj instanceof String) {
                    String str = (String) obj;
                    JL_Log.m26855w(TAG, "TASK_TIMEOUT", "address ： " + str);
                    reConnectHelper.removeTask(str, false);
                }
                break;
        }
        return true;
    }

    private void addTask(ReconnectTask reconnectTask) {
        boolean zAdd = false;
        i = 0;
        int i = 0;
        zAdd = false;
        if (reconnectTask != null && !this.mTaskList.contains(reconnectTask)) {
            if (reconnectTask.getTaskType() == 1) {
                if (!this.mTaskList.isEmpty()) {
                    Iterator it = new ArrayList(this.mTaskList).iterator();
                    while (it.hasNext()) {
                        if (1 == ((ReconnectTask) it.next()).getTaskType()) {
                            i++;
                        }
                    }
                }
                this.mTaskList.add(i, reconnectTask);
                zAdd = true;
            } else {
                zAdd = this.mTaskList.add(reconnectTask);
            }
        }
        if (zAdd) {
            reconnectTask.setTaskId(autoIncTaskId());
            if (reconnectTask.getTaskTimeout() == 0) {
                reconnectTask.setTaskTimeout(50000);
            }
            JL_Log.m26847d(TAG, "addTask", "" + reconnectTask);
            this.mHandler.removeMessages(reconnectTask.getTaskId());
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(reconnectTask.getTaskId(), reconnectTask.getAddress()), (long) reconnectTask.getTaskTimeout());
            setStartTime(getCurrentTime());
            this.mHandler.removeMessages(MSG_RECONNECT_TIMEOUT);
            this.mHandler.sendEmptyMessageDelayed(MSG_RECONNECT_TIMEOUT, RECONNECT_TIMEOUT);
            postReconnectTaskMsg(0L);
        }
    }

    private static int autoIncTaskId() {
        int i = sTaskID;
        int i2 = i + 1;
        sTaskID = i2;
        if (i2 >= 256) {
            sTaskID = 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectBtDevice(@NonNull BluetoothDevice device, @NonNull ReconnectTask task) {
        String str = TAG;
        JL_Log.m26847d(str, "connectBtDevice", "Ready to connect device. " + device + ", " + task);
        setTaskState(2);
        stopScan();
        if (this.mBtOp.connectBtDevice(device, task.getConnectWay())) {
            return;
        }
        int connectFailCount = task.getConnectFailCount() + 1;
        setTaskState(0);
        JL_Log.m26855w(str, "connectBtDevice", "Connect device failed. Failure count = " + connectFailCount + ", limit = 2");
        if (connectFailCount >= 2) {
            removeTask(task, false);
        } else {
            task.setConnectFailCount(connectFailCount);
            postReconnectTaskMsg(2000L);
        }
    }

    private void doReconnectEvent(@NonNull ReconnectTask task) {
        boolean zStartDeviceScan;
        if (!BluetoothUtil.isBluetoothEnable()) {
            JL_Log.m26855w(TAG, "doReconnectEvent", "bluetooth is close.");
            return;
        }
        if (isTaskRunning()) {
            JL_Log.m26855w(TAG, "doReconnectEvent", "task is running.");
            return;
        }
        if (task.getTaskType() == 2 && this.mBtOp.getConnectedDevice() != null && !this.mBtOp.getBluetoothOption().isUseMultiDevice()) {
            JL_Log.m26855w(TAG, "doReconnectEvent", "single device manager ");
            stopReconnect();
            return;
        }
        BluetoothDevice bluetoothDeviceFindSysConnectedDevice = findSysConnectedDevice(task.address);
        String str = TAG;
        JL_Log.m26851i(str, "doReconnectEvent", "device ： " + printBtDeviceInfo(bluetoothDeviceFindSysConnectedDevice) + ", reconnectTask = " + task);
        if (bluetoothDeviceFindSysConnectedDevice != null) {
            connectBtDevice(bluetoothDeviceFindSysConnectedDevice, task);
            return;
        }
        if (this.mBtOp.isScanning()) {
            boolean z = this.mBtOp.getScanType() == 2;
            if (!z) {
                z = (task.getConnectWay() == 1 && this.mBtOp.getScanType() == 1) || (task.getConnectWay() == 0 && this.mBtOp.getScanType() == 0);
            }
            JL_Log.m26851i(str, "doReconnectEvent", "isScanOk : " + z);
            if (z) {
                return;
            }
            stopScan();
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long nowLeftTime = getNowLeftTime();
        String str2 = TAG;
        JL_Log.m26847d(str2, "doReconnectEvent", "leftTime ： " + nowLeftTime + ", startTime : " + this.startTime);
        if (nowLeftTime < 20000) {
            int i = task.getConnectWay() == 1 ? 0 : 2;
            zStartDeviceScan = this.mBtOp.startDeviceScan(i, nowLeftTime);
            JL_Log.m26851i(str2, "doReconnectEvent", "startDeviceScan : " + zStartDeviceScan + ", way = " + i);
        } else if (task.getConnectWay() == 1) {
            zStartDeviceScan = this.mBtOp.startDeviceScan(16000L);
            JL_Log.m26851i(str2, "doReconnectEvent", "startDeviceScan ---> " + zStartDeviceScan);
        } else {
            zStartDeviceScan = this.mBtOp.startBLEScan(16000L);
            JL_Log.m26851i(str2, "doReconnectEvent", "startBLEScan ---> " + zStartDeviceScan);
        }
        if (zStartDeviceScan) {
            setTaskState(1);
        } else {
            postReconnectTaskMsg(2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReconnectTask findReconnectTask(String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address) && !this.mTaskList.isEmpty()) {
            for (ReconnectTask reconnectTask : new ArrayList(this.mTaskList)) {
                if (address.equals(reconnectTask.getAddress())) {
                    return reconnectTask;
                }
            }
        }
        return null;
    }

    private BluetoothDevice findSysConnectedDevice(String address) {
        List<BluetoothDevice> systemConnectedBtDeviceList = BluetoothUtil.getSystemConnectedBtDeviceList(this.mContext);
        if (systemConnectedBtDeviceList == null) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
            if (bluetoothDevice.getAddress().equals(address)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public BluetoothDevice findTargetDevice(@NonNull BluetoothDevice target, @NonNull BleScanMessage scanMessage, int connectWay) {
        HistoryRecord historyRecord;
        BluetoothDevice remoteDevice;
        if (connectWay != 0) {
            BluetoothDevice remoteDevice2 = getRemoteDevice(scanMessage.getEdrAddr());
            if (remoteDevice2 == null && (historyRecord = this.mBtOp.getHistoryRecord(target.getAddress())) != null) {
                remoteDevice2 = getRemoteDevice(historyRecord.getConnectType() == 1 ? historyRecord.getAddress() : historyRecord.getMappedAddress());
            }
            if (remoteDevice2 != null) {
                return remoteDevice2;
            }
        } else if (ConnectUtil.isHasConnectPermission(this.mContext) && target.getType() == 1) {
            HistoryRecord historyRecord2 = this.mBtOp.getHistoryRecord(target.getAddress());
            if (historyRecord2 != null) {
                remoteDevice = getRemoteDevice(historyRecord2.getConnectType() == 0 ? historyRecord2.getAddress() : historyRecord2.getMappedAddress());
            } else {
                remoteDevice = null;
            }
            if (remoteDevice != null && !BluetoothUtil.deviceEquals(target, remoteDevice)) {
                return remoteDevice;
            }
        }
        return target;
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
        if (!BluetoothAdapter.checkBluetoothAddress(address) || !BluetoothAdapter.checkBluetoothAddress(address2)) {
            return false;
        }
        HistoryRecord historyRecord = this.mBtOp.getHistoryRecord(address);
        if (historyRecord == null) {
            return address.equals(address2);
        }
        return address2.equals(historyRecord.getAddress()) || address2.equals(historyRecord.getMappedAddress()) || address2.equals(historyRecord.getUpdateAddress());
    }

    private boolean isTaskRunning() {
        return this.mBtOp.isConnecting() || this.mBtOp.isScanning() || this.taskState != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postReconnectTaskMsg(long delay) {
        this.mHandler.removeMessages(MSG_RECONNECT);
        if (delay > 0) {
            this.mHandler.sendEmptyMessageDelayed(MSG_RECONNECT, delay);
        } else {
            this.mHandler.sendEmptyMessage(MSG_RECONNECT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printBtDeviceInfo(BluetoothDevice device) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, device);
    }

    private void release() {
        setTaskState(0);
        setStartTime(0L);
        this.mHandler.removeMessages(MSG_RECONNECT_TIMEOUT);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTask(String address, boolean result) {
        ReconnectTask reconnectTaskFindReconnectTask = findReconnectTask(address);
        if (reconnectTaskFindReconnectTask != null) {
            removeTask(reconnectTaskFindReconnectTask, result);
        }
    }

    private void setStartTime(long time) {
        this.startTime = time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskState(int taskState) {
        this.taskState = taskState;
    }

    private void startReconnectTask() {
        if (this.mTaskList.isEmpty() || !isReconnecting() || isTaskRunning()) {
            return;
        }
        ReconnectTask reconnectTask = this.mTaskList.get(0);
        long nowLeftTime = getNowLeftTime();
        JL_Log.m26851i(TAG, "startReconnectTask", "left = " + nowLeftTime + ", start reconnect task.");
        doReconnectEvent(reconnectTask);
    }

    private void stopScan() {
        if (this.mBtOp.isScanning()) {
            if (this.mBtOp.getScanType() == 0) {
                this.mBtOp.stopBLEScan();
            } else {
                this.mBtOp.stopDeviceScan();
            }
        }
    }

    public void destroy() {
        stopReconnect();
        this.mBtOp.unregisterBluetoothCallback(this.mBluetoothEventCallback);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public boolean isReconnectDev(BluetoothDevice device) {
        return (device == null || findReconnectTask(device.getAddress()) == null) ? false : true;
    }

    public boolean isReconnecting() {
        return this.mHandler.hasMessages(MSG_RECONNECT_TIMEOUT);
    }

    public void reconnectDevice(String address, int connectWay, OnHistoryRecordCallback callback) {
        reconnectDevice(address, connectWay, 0, callback);
    }

    public void reconnectHistory(@NonNull HistoryRecord record) {
        int i = 0;
        boolean z = record.getDevType() == 5 || record.getSdkFlag() == 8 || record.getSdkFlag() == 9;
        String mappedAddress = (record.getConnectType() == 1 && z) ? record.getMappedAddress() : record.getAddress();
        int connectType = z ? 0 : record.getConnectType();
        if (!BluetoothAdapter.checkBluetoothAddress(record.getUpdateAddress()) || record.getUpdateAddress().equals(mappedAddress)) {
            i = connectType;
        } else {
            mappedAddress = record.getUpdateAddress();
        }
        ReconnectTask reconnectTask = new ReconnectTask(mappedAddress);
        reconnectTask.setConnectWay(i);
        reconnectTask.setTaskType(2);
        addTask(reconnectTask);
    }

    public void stopReconnect() {
        if (!this.mTaskList.isEmpty()) {
            for (ReconnectTask reconnectTask : new ArrayList(this.mTaskList)) {
                if (reconnectTask.getCallback() != null) {
                    reconnectTask.getCallback().onFailed(0, "Reconnect task is stop.");
                }
                this.mHandler.removeMessages(reconnectTask.getTaskId());
            }
            this.mTaskList.clear();
        }
        release();
    }

    public void reconnectDevice(String address, int connectWay, int timeout, OnHistoryRecordCallback callback) {
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            if (callback != null) {
                callback.onFailed(1, "Address is error.");
            }
        } else {
            ReconnectTask reconnectTask = new ReconnectTask(address);
            reconnectTask.setTaskType(1);
            reconnectTask.setConnectWay(connectWay);
            reconnectTask.setTaskTimeout(timeout);
            reconnectTask.setCallback(callback);
            addTask(reconnectTask);
        }
    }

    private void removeTask(@NonNull ReconnectTask task, boolean result) {
        boolean zRemove = this.mTaskList.remove(task);
        JL_Log.m26855w(TAG, "removeTask", task + ", ret = " + zRemove + ", result = " + result);
        if (zRemove) {
            if (task.getCallback() != null) {
                if (result) {
                    task.getCallback().onSuccess(this.mBtOp.getHistoryRecord(task.getAddress()));
                } else {
                    task.getCallback().onFailed(9, ConnectUtil.formatString("Connect device[%s] timeout.", task.getAddress()));
                }
            }
            this.mHandler.removeMessages(task.getTaskId());
            if (!this.mTaskList.isEmpty()) {
                postReconnectTaskMsg(0L);
            } else {
                stopReconnect();
            }
        }
    }
}
