package com.jieli.jl_bt_ota.tool;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.constant.JL_Constant;
import com.jieli.jl_bt_ota.impl.BluetoothOTAManager;
import com.jieli.jl_bt_ota.impl.p198bt.BluetoothAssistant;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.ReConnectDevMsg;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.jl_bt_ota.util.ParseDataUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceReConnectManager {
    public static long RECONNECT_TIMEOUT = 65000;

    /* JADX INFO: renamed from: i */
    private static final String f37625i = "DeviceReConnectManager";

    /* JADX INFO: renamed from: j */
    private static final int f37626j = 3000;

    /* JADX INFO: renamed from: k */
    private static final int f37627k = 20000;

    /* JADX INFO: renamed from: l */
    private static final int f37628l = 2;

    /* JADX INFO: renamed from: m */
    private static final int f37629m = 30000;

    /* JADX INFO: renamed from: n */
    private static final int f37630n = 2000;

    /* JADX INFO: renamed from: o */
    private static final int f37631o = 37973;

    /* JADX INFO: renamed from: p */
    private static final int f37632p = 37974;

    /* JADX INFO: renamed from: q */
    private static final int f37633q = 37975;

    /* JADX INFO: renamed from: a */
    private final Context f37634a;

    /* JADX INFO: renamed from: b */
    private final BluetoothOTAManager f37635b;

    /* JADX INFO: renamed from: c */
    private final BluetoothAssistant f37636c;

    /* JADX INFO: renamed from: d */
    private volatile ReConnectDevMsg f37637d;

    /* JADX INFO: renamed from: e */
    private long f37638e = 0;

    /* JADX INFO: renamed from: f */
    private final Map<String, BleScanMessage> f37639f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final Handler f37640g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.jl_bt_ota.tool.DeviceReConnectManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            switch (message.what) {
                case DeviceReConnectManager.f37631o /* 37973 */:
                    DeviceReConnectManager.this.m27081b();
                    break;
                case DeviceReConnectManager.f37632p /* 37974 */:
                    JL_Log.m27240w(DeviceReConnectManager.f37625i, "MSG_RECONNECT_DEVICE_TIMEOUT", "" + DeviceReConnectManager.this.f37637d);
                    if (DeviceReConnectManager.this.f37637d != null) {
                        DeviceReConnectManager.this.f37637d.setState(0);
                        DeviceReConnectManager deviceReConnectManager = DeviceReConnectManager.this;
                        deviceReConnectManager.m27067a(OTAError.buildError(ErrorCode.SUB_ERR_RECONNECT_TIMEOUT, deviceReConnectManager.f37637d.toString()));
                    }
                    break;
                case DeviceReConnectManager.f37633q /* 37975 */:
                    JL_Log.m27240w(DeviceReConnectManager.f37625i, "MSG_CONNECT_DEVICE_TIMEOUT", "" + DeviceReConnectManager.this.f37637d);
                    if (DeviceReConnectManager.this.f37637d != null) {
                        DeviceReConnectManager.this.f37637d.setState(0);
                        DeviceReConnectManager deviceReConnectManager2 = DeviceReConnectManager.this;
                        deviceReConnectManager2.m27073a(deviceReConnectManager2.f37637d.getAddress());
                    }
                    break;
            }
            return true;
        }
    });

    /* JADX INFO: renamed from: h */
    private final BtEventCallback f37641h;

    public DeviceReConnectManager(Context context, BluetoothOTAManager bluetoothOTAManager) {
        BtEventCallback btEventCallback = new BtEventCallback() { // from class: com.jieli.jl_bt_ota.tool.DeviceReConnectManager.2
            @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onAdapterStatus(boolean z, boolean z2) {
                if (DeviceReConnectManager.this.isDeviceReconnecting()) {
                    if (!z) {
                        JL_Log.m27232d(DeviceReConnectManager.f37625i, "onAdapterStatus", "bluetooth is off.");
                    } else {
                        JL_Log.m27236i(DeviceReConnectManager.f37625i, "onAdapterStatus", "Bluetooth is on, so resume reconnect task.");
                        DeviceReConnectManager.this.m27064a(DeviceReConnectManager.f37631o, 0L);
                    }
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothCallback
            public void onConnection(BluetoothDevice bluetoothDevice, int i) {
                byte[] rawData;
                if (bluetoothDevice == null || !DeviceReConnectManager.this.isDeviceReconnecting() || i == 3) {
                    return;
                }
                boolean z = DeviceReConnectManager.this.m27074a(DeviceReConnectManager.f37633q) || DeviceReConnectManager.this.m27091f();
                JL_Log.m27232d(DeviceReConnectManager.f37625i, "onConnection", "isConnecting: " + z + ", status = " + i);
                if (z) {
                    BleScanMessage bleScanMessage = (BleScanMessage) DeviceReConnectManager.this.f37639f.get(bluetoothDevice.getAddress());
                    if (bleScanMessage != null) {
                        JL_Log.m27232d(DeviceReConnectManager.f37625i, "onConnection", "bleScanMessage: " + bleScanMessage);
                        rawData = bleScanMessage.getRawData();
                    } else {
                        rawData = null;
                    }
                    boolean zM27075a = DeviceReConnectManager.this.m27075a(bluetoothDevice, rawData);
                    JL_Log.m27240w(DeviceReConnectManager.f37625i, "onConnection", CommonUtil.formatString("device : %s, status : %d, isReConnectDevice : %s", DeviceReConnectManager.this.m27079b(bluetoothDevice), Integer.valueOf(i), Boolean.valueOf(zM27075a)));
                    if (zM27075a) {
                        if (DeviceReConnectManager.this.f37637d != null) {
                            DeviceReConnectManager.this.f37637d.setState(0);
                        }
                        DeviceReConnectManager.this.m27082b(DeviceReConnectManager.f37633q);
                        if (i == 1 || i == 4) {
                            JL_Log.m27232d(DeviceReConnectManager.f37625i, "onConnection", "reconnect device success.");
                            DeviceReConnectManager.this.stopReconnectTask();
                        } else if (i == 2 || i == 0) {
                            JL_Log.m27236i(DeviceReConnectManager.f37625i, "onConnection", "connect device failed.");
                            DeviceReConnectManager.this.m27073a(bluetoothDevice.getAddress());
                        }
                    }
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onDiscovery(BluetoothDevice bluetoothDevice, BleScanMessage bleScanMessage) {
                byte[] rawData;
                if (bluetoothDevice == null || !DeviceReConnectManager.this.isDeviceReconnecting()) {
                    return;
                }
                if (bleScanMessage != null) {
                    DeviceReConnectManager.this.f37639f.put(bluetoothDevice.getAddress(), bleScanMessage);
                    rawData = bleScanMessage.getRawData();
                } else {
                    rawData = null;
                }
                boolean zM27075a = DeviceReConnectManager.this.m27075a(bluetoothDevice, rawData);
                JL_Log.m27232d(DeviceReConnectManager.f37625i, "onDiscovery", CommonUtil.formatString("isReConnectDevice : %s, device : %s", Boolean.valueOf(zM27075a), DeviceReConnectManager.this.m27079b(bluetoothDevice)));
                if (zM27075a) {
                    DeviceReConnectManager.this.m27066a(bluetoothDevice);
                    DeviceReConnectManager.this.m27092g();
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.BtEventCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onDiscoveryStatus(boolean z, boolean z2) {
                if (!DeviceReConnectManager.this.isDeviceReconnecting() || DeviceReConnectManager.this.m27091f()) {
                    return;
                }
                JL_Log.m27232d(DeviceReConnectManager.f37625i, "onDiscoveryStatus", "bStart : " + z2);
                if (!z2) {
                    JL_Log.m27232d(DeviceReConnectManager.f37625i, "onDiscoveryStatus", "ready start scan");
                    DeviceReConnectManager.this.m27064a(DeviceReConnectManager.f37631o, 3000L);
                } else {
                    if (DeviceReConnectManager.this.f37637d == null || DeviceReConnectManager.this.f37637d.getState() != 0) {
                        return;
                    }
                    DeviceReConnectManager.this.f37637d.setState(1);
                }
            }
        };
        this.f37641h = btEventCallback;
        this.f37634a = (Context) CommonUtil.checkNotNull(context);
        BluetoothOTAManager bluetoothOTAManager2 = (BluetoothOTAManager) CommonUtil.checkNotNull(bluetoothOTAManager);
        this.f37635b = bluetoothOTAManager2;
        this.f37636c = BluetoothAssistant.getInstance();
        bluetoothOTAManager2.registerBluetoothCallback(btEventCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public boolean m27091f() {
        return m27089e() != null && m27089e().getState() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m27092g() {
        JL_Log.m27232d(f37625i, "stopScan", "---->");
        this.f37636c.stopBLEScan();
        this.f37636c.stopDeviceScan();
    }

    public String getReconnectAddress() {
        ReConnectDevMsg reConnectDevMsgM27089e = m27089e();
        if (reConnectDevMsgM27089e == null) {
            return null;
        }
        return reConnectDevMsgM27089e.getAddress();
    }

    public boolean isDeviceReconnecting() {
        return m27074a(f37632p);
    }

    public boolean isWaitingForUpdate() {
        return m27089e() != null;
    }

    public void release() {
        stopReconnectTask();
        this.f37635b.unregisterBluetoothCallback(this.f37641h);
        this.f37640g.removeCallbacksAndMessages(null);
    }

    public void setReConnectDevMsg(ReConnectDevMsg reConnectDevMsg) {
        if (this.f37637d != reConnectDevMsg) {
            this.f37637d = reConnectDevMsg;
            this.f37639f.clear();
            JL_Log.m27232d(f37625i, "setReConnectDevMsg", "" + reConnectDevMsg);
        }
    }

    public void setReconnectAddress(String str) {
        if (CHexConver.checkBluetoothAddress(str)) {
            if (this.f37637d == null) {
                setReConnectDevMsg(new ReConnectDevMsg(this.f37636c.getBluetoothOption().getPriority(), str));
            } else {
                this.f37637d.setAddress(str);
            }
            JL_Log.m27232d(f37625i, "setReconnectAddress", "" + this.f37637d);
        }
    }

    public void setReconnectUseADV(boolean z) {
        if (this.f37637d != null) {
            this.f37637d.setUseADV(z);
        }
    }

    public void startReconnectTask() {
        if (isDeviceReconnecting()) {
            return;
        }
        JL_Log.m27236i(f37625i, "startReconnectTask", "start...., timeout : " + RECONNECT_TIMEOUT);
        m27065a(m27085c());
        m27064a(f37632p, RECONNECT_TIMEOUT);
        m27064a(f37631o, 0L);
    }

    public void stopReconnectTask() {
        boolean zIsDeviceReconnecting = isDeviceReconnecting();
        boolean zIsWaitingForUpdate = isWaitingForUpdate();
        JL_Log.m27236i(f37625i, "stopReconnectTask", "isReconnecting : " + zIsDeviceReconnecting + ", isWaitingForUpdate : " + zIsWaitingForUpdate);
        m27065a(0L);
        setReConnectDevMsg(null);
        m27092g();
        this.f37640g.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: c */
    private long m27085c() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    private long m27087d() {
        long jM27085c = RECONNECT_TIMEOUT - (m27085c() - this.f37638e);
        if (jM27085c < 0) {
            return 0L;
        }
        return jM27085c;
    }

    /* JADX INFO: renamed from: e */
    private ReConnectDevMsg m27089e() {
        if (this.f37637d == null) {
            return null;
        }
        return this.f37637d.cloneObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m27081b() {
        int iStartBLEScan;
        ReConnectDevMsg reConnectDevMsgM27089e = m27089e();
        if (reConnectDevMsgM27089e == null) {
            JL_Log.m27240w(f37625i, "doReconnectTask", "reConnectDevMsg is null.");
            stopReconnectTask();
            return;
        }
        if (!BluetoothUtil.isBluetoothEnable()) {
            JL_Log.m27240w(f37625i, "doReconnectTask", "Bluetooth is close.");
            m27082b(f37631o);
            return;
        }
        if (reConnectDevMsgM27089e.getState() == 2) {
            JL_Log.m27240w(f37625i, "doReconnectTask", "Task is connecting. " + reConnectDevMsgM27089e);
            if (m27074a(f37633q)) {
                return;
            }
            m27064a(f37633q, 30000L);
            return;
        }
        BluetoothDevice targetDevice = this.f37635b.getTargetDevice();
        boolean z = targetDevice != null;
        String str = f37625i;
        JL_Log.m27236i(str, "doReconnectTask", reConnectDevMsgM27089e + ", isConnected : " + z);
        if (z) {
            JL_Log.m27236i(str, "doReconnectTask", "device is connected. " + reConnectDevMsgM27089e + ", device = " + targetDevice);
            return;
        }
        BluetoothDevice bluetoothDeviceM27078b = m27078b(reConnectDevMsgM27089e.getAddress());
        JL_Log.m27240w(str, "doReconnectTask", "connectedDevice : " + m27079b(bluetoothDeviceM27078b));
        if (bluetoothDeviceM27078b != null) {
            m27066a(bluetoothDeviceM27078b);
            return;
        }
        if (reConnectDevMsgM27089e.isUseADV() && reConnectDevMsgM27089e.getWay() != 0) {
            reConnectDevMsgM27089e.setWay(0);
        }
        if (this.f37636c.isScanning()) {
            int scanType = this.f37636c.getScanType();
            boolean z2 = scanType == 2;
            if (!z2) {
                z2 = (reConnectDevMsgM27089e.getWay() == 1 && scanType == 1) || (reConnectDevMsgM27089e.getWay() == 0 && scanType == 0);
            }
            JL_Log.m27236i(str, "doReconnectTask", "isScanOk : " + z2 + ", scanType = " + scanType);
            if (z2) {
                return;
            }
            m27092g();
            SystemClock.sleep(100L);
        }
        long jM27087d = m27087d();
        JL_Log.m27232d(str, "doReconnectTask", "leftTime ： " + jM27087d + ", beginTaskTime : " + this.f37638e);
        if (jM27087d < RECONNECT_TIMEOUT - 40000 && !reConnectDevMsgM27089e.isUseADV()) {
            int i = reConnectDevMsgM27089e.getWay() == 1 ? 0 : 2;
            long j = jM27087d - 3000;
            if (j > 0) {
                jM27087d = j;
            }
            iStartBLEScan = this.f37636c.startDeviceScan(jM27087d, i);
            JL_Log.m27236i(str, "doReconnectTask", "startDeviceScan : " + iStartBLEScan + ", way = " + i + ", timeout = " + jM27087d);
        } else {
            long jMin = Math.min(jM27087d, 20000L);
            if (reConnectDevMsgM27089e.getWay() == 1) {
                iStartBLEScan = this.f37636c.startDeviceScan(jMin, 1);
                JL_Log.m27236i(str, "doReconnectTask", "startDeviceScan : " + iStartBLEScan + ", scanTime = " + jMin);
            } else {
                iStartBLEScan = this.f37636c.startBLEScan(jMin);
                JL_Log.m27236i(str, "doReconnectTask", "startBLEScan : " + iStartBLEScan + ", scanTime = " + jMin);
            }
        }
        if (iStartBLEScan != 0) {
            m27064a(f37631o, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m27075a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        ReConnectDevMsg reConnectDevMsgM27089e;
        if (bluetoothDevice == null || (reConnectDevMsgM27089e = m27089e()) == null) {
            return false;
        }
        String address = reConnectDevMsgM27089e.getAddress();
        if (!CHexConver.checkBluetoothAddress(address)) {
            return false;
        }
        String str = f37625i;
        JL_Log.m27232d(str, "checkIsReconnectDevice", "device : " + m27079b(bluetoothDevice));
        if (!reConnectDevMsgM27089e.isUseADV()) {
            return address.equals(bluetoothDevice.getAddress());
        }
        JL_Log.m27232d(str, "checkIsReconnectDevice", "advertiseRawData : " + CHexConver.byte2HexStr(bArr));
        BleScanMessage oTAFlagFilterWithBroad = ParseDataUtil.parseOTAFlagFilterWithBroad(bArr, JL_Constant.OTA_IDENTIFY);
        if (oTAFlagFilterWithBroad == null) {
            return false;
        }
        JL_Log.m27232d(str, "checkIsReconnectDevice", "" + oTAFlagFilterWithBroad);
        return address.equalsIgnoreCase(oTAFlagFilterWithBroad.getOldBleAddress());
    }

    /* JADX INFO: renamed from: a */
    private void m27065a(long j) {
        this.f37638e = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27066a(BluetoothDevice bluetoothDevice) {
        String str = f37625i;
        JL_Log.m27232d(str, "connectBtDevice", this.f37637d + ", device : " + bluetoothDevice);
        if (this.f37637d == null || this.f37637d.getState() == 2) {
            return;
        }
        this.f37637d.setState(2);
        long jM27087d = m27087d();
        JL_Log.m27236i(str, "connectBtDevice", "left time = " + jM27087d);
        if (jM27087d <= 2000) {
            m27064a(f37632p, 31000L);
            JL_Log.m27236i(str, "connectBtDevice", "Extend the time of reconnecting to the device.");
        }
        m27064a(f37633q, 30000L);
        BluetoothOTAConfigure bluetoothOption = this.f37635b.getBluetoothOption();
        if (bluetoothOption.isAutoConnectBle()) {
            JL_Log.m27236i(str, "connectBtDevice", "Start automatic BLE reconnection.");
            this.f37636c.connectBLEDevice(bluetoothDevice, bluetoothOption.getBleConnectParam());
        } else {
            this.f37635b.connectBluetoothDevice(bluetoothDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27067a(BaseError baseError) {
        if (baseError == null) {
            return;
        }
        if (this.f37635b.isOTA()) {
            JL_Log.m27240w(f37625i, "cbReconnectError", "error : " + baseError);
            this.f37635b.onError(baseError);
        }
        stopReconnectTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27073a(String str) {
        long jM27087d = m27087d();
        String str2 = f37625i;
        JL_Log.m27232d(str2, "dealWithConnectFailed", "address : " + str + ", Left Time = " + jM27087d);
        if (jM27087d <= 2000) {
            JL_Log.m27236i(str2, "dealWithConnectFailed", "time not enough.");
            m27067a(OTAError.buildError(ErrorCode.SUB_ERR_RECONNECT_FAILED, str));
        } else {
            JL_Log.m27236i(str2, "dealWithConnectFailed", "resume reconnect task.");
            m27064a(f37631o, 0L);
        }
    }

    /* JADX INFO: renamed from: b */
    private BluetoothDevice m27078b(String str) {
        List<BluetoothDevice> systemConnectedBtDeviceList;
        if (CHexConver.checkBluetoothAddress(str) && (systemConnectedBtDeviceList = BluetoothUtil.getSystemConnectedBtDeviceList(this.f37634a)) != null && !systemConnectedBtDeviceList.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
                if (str.equals(bluetoothDevice.getAddress())) {
                    return bluetoothDevice;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m27074a(int i) {
        return this.f37640g.hasMessages(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27064a(int i, long j) {
        m27082b(i);
        if (j > 0) {
            this.f37640g.sendEmptyMessageDelayed(i, j);
        } else {
            this.f37640g.sendEmptyMessage(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m27079b(BluetoothDevice bluetoothDevice) {
        return BluetoothUtil.printBtDeviceInfo(this.f37634a, bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m27082b(int i) {
        this.f37640g.removeMessages(i);
    }
}
