package com.jieli.jl_bt_ota.impl;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.ironsource.C12616d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.constant.JL_Constant;
import com.jieli.jl_bt_ota.constant.StateCode;
import com.jieli.jl_bt_ota.impl.p198bt.BluetoothAssistant;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.interfaces.IUpgradeManager;
import com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager;
import com.jieli.jl_bt_ota.interfaces.p199bt.IBtProxy;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtBleListener;
import com.jieli.jl_bt_ota.interfaces.p199bt.OnBtListener;
import com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.FileOffset;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.ReConnectDevMsg;
import com.jieli.jl_bt_ota.model.ReconnectParam;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.ble.BleCharacteristic;
import com.jieli.jl_bt_ota.model.ble.BleSendParam;
import com.jieli.jl_bt_ota.model.command.EnterUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.ExitUpdateModeCmd;
import com.jieli.jl_bt_ota.model.command.FirmwareUpdateBlockCmd;
import com.jieli.jl_bt_ota.model.command.NotifyUpdateContentSizeCmd;
import com.jieli.jl_bt_ota.model.command.SettingsMtuCmd;
import com.jieli.jl_bt_ota.model.parameter.FirmwareUpdateBlockParam;
import com.jieli.jl_bt_ota.model.parameter.FirmwareUpdateBlockResponseParam;
import com.jieli.jl_bt_ota.model.parameter.NotifyUpdateContentSizeParam;
import com.jieli.jl_bt_ota.model.parameter.SettingsMtuParam;
import com.jieli.jl_bt_ota.model.response.EnterUpdateModeResponse;
import com.jieli.jl_bt_ota.model.response.SettingsMtuResponse;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.thread.OtaDataCache;
import com.jieli.jl_bt_ota.tool.DeviceReConnectManager;
import com.jieli.jl_bt_ota.tool.RcspOTA;
import com.jieli.jl_bt_ota.tool.callback.BtEventCallbackHelper;
import com.jieli.jl_bt_ota.tool.configure.OtaConfigureHelper;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.jl_bt_ota.util.UuidUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BluetoothOTAManager implements IBluetoothManager, IUpgradeManager {
    public static long FILE_CACHE_DATA_LIMIT = 2097152;
    public static boolean IS_SUPPORT_NEW_RECONNECT_WAY = true;

    /* JADX INFO: renamed from: a */
    private static final long f37471a = 6000;

    /* JADX INFO: renamed from: b */
    private static final long f37472b = 1000;

    /* JADX INFO: renamed from: c */
    private static final long f37473c = 5000;

    /* JADX INFO: renamed from: d */
    private static final int f37474d = 4660;

    /* JADX INFO: renamed from: e */
    private static final int f37475e = 4661;

    /* JADX INFO: renamed from: f */
    private static final int f37476f = 4662;

    /* JADX INFO: renamed from: g */
    private static final int f37477g = 4663;

    /* JADX INFO: renamed from: h */
    private static final int f37478h = 4664;

    /* JADX INFO: renamed from: i */
    private static final int f37479i = 4665;

    /* JADX INFO: renamed from: j */
    private static final int f37480j = 4672;

    /* JADX INFO: renamed from: k */
    private static final int f37481k = 4673;

    /* JADX INFO: renamed from: l */
    private static final int f37482l = 4674;

    /* JADX INFO: renamed from: m */
    private static final int f37483m = 1;

    /* JADX INFO: renamed from: n */
    private static final int f37484n = 2;

    /* JADX INFO: renamed from: A */
    private long f37485A;

    /* JADX INFO: renamed from: B */
    private int f37486B;

    /* JADX INFO: renamed from: C */
    private int f37487C;

    /* JADX INFO: renamed from: D */
    private final OtaConfigureHelper f37488D;

    /* JADX INFO: renamed from: E */
    private ReconnectParam f37489E;

    /* JADX INFO: renamed from: F */
    private final Handler f37490F;

    /* JADX INFO: renamed from: G */
    private final OnBtBleListener f37491G;

    /* JADX INFO: renamed from: H */
    private final OnBtAssistantCallback f37492H;

    /* JADX INFO: renamed from: I */
    private final OnRcspCallback f37493I;
    protected final String TAG;
    protected final Context context;

    /* JADX INFO: renamed from: o */
    private final RcspOpImpl f37494o;

    /* JADX INFO: renamed from: p */
    private final RcspOTA f37495p;

    /* JADX INFO: renamed from: q */
    private final BluetoothAssistant f37496q;

    /* JADX INFO: renamed from: r */
    private final DeviceReConnectManager f37497r;

    /* JADX INFO: renamed from: s */
    private final BtEventCallbackHelper f37498s;

    /* JADX INFO: renamed from: t */
    private final Map<String, Integer> f37499t;

    /* JADX INFO: renamed from: u */
    private final OtaDataCache f37500u;

    /* JADX INFO: renamed from: v */
    private OnBtListener f37501v;

    /* JADX INFO: renamed from: w */
    private IUpgradeCallback f37502w;

    /* JADX INFO: renamed from: x */
    private volatile boolean f37503x;

    /* JADX INFO: renamed from: y */
    private long f37504y;

    /* JADX INFO: renamed from: z */
    private long f37505z;

    public BluetoothOTAManager(Context context) {
        String simpleName = getClass().getSimpleName();
        this.TAG = simpleName;
        this.f37499t = new HashMap();
        this.f37503x = false;
        this.f37504y = 20000L;
        this.f37505z = 0L;
        this.f37485A = 0L;
        this.f37486B = 0;
        this.f37487C = 0;
        this.f37490F = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                int i = message.what;
                if (i == BluetoothOTAManager.f37478h) {
                    Object obj = message.obj;
                    if (!(obj instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                    JL_Log.m27236i(BluetoothOTAManager.this.TAG, "WAIT_EDR_DISCONNECT", "sppDevice :" + BluetoothOTAManager.this.printBtDeviceInfo(bluetoothDevice));
                    BluetoothOTAManager.this.m26927d(bluetoothDevice);
                } else if (i != BluetoothOTAManager.f37479i) {
                    switch (i) {
                        case BluetoothOTAManager.f37474d /* 4660 */:
                            BluetoothOTAManager.this.m26898a("RECEIVE_CMD_TIMEOUT", OTAError.buildError(ErrorCode.SUB_ERR_WAITING_COMMAND_TIMEOUT));
                            break;
                        case BluetoothOTAManager.f37475e /* 4661 */:
                            Object obj2 = message.obj;
                            if (!(obj2 instanceof BluetoothDevice)) {
                                return false;
                            }
                            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) obj2;
                            JL_Log.m27236i(BluetoothOTAManager.this.TAG, "CHANGE_BLE_MTU_TIMEOUT", "device : " + BluetoothOTAManager.this.printBtDeviceInfo(bluetoothDevice2));
                            BluetoothOTAManager.this.m26939g(bluetoothDevice2);
                            break;
                            break;
                        case BluetoothOTAManager.f37476f /* 4662 */:
                            boolean zIsOTA = BluetoothOTAManager.this.isOTA();
                            BluetoothDevice targetDevice = BluetoothOTAManager.this.getTargetDevice();
                            boolean zM26937f = BluetoothOTAManager.this.m26937f(targetDevice);
                            boolean zIsWaitingForUpdate = BluetoothOTAManager.this.f37497r.isWaitingForUpdate();
                            ReconnectParam reconnectParam = BluetoothOTAManager.this.f37489E;
                            BluetoothOTAManager bluetoothOTAManager = BluetoothOTAManager.this;
                            JL_Log.m27236i(bluetoothOTAManager.TAG, "OTA_RECONNECT_DEVICE", CommonUtil.formatString("device : %s, isOTA = %s, isWaitingForUpdate = %s, isConnectedDevice = %s\n %s", bluetoothOTAManager.printBtDeviceInfo(targetDevice), Boolean.valueOf(zIsOTA), Boolean.valueOf(zIsWaitingForUpdate), Boolean.valueOf(zM26937f), reconnectParam));
                            if (zIsOTA && zIsWaitingForUpdate) {
                                if (zM26937f || reconnectParam == null) {
                                    JL_Log.m27240w(BluetoothOTAManager.this.TAG, "OTA_RECONNECT_DEVICE", "Is the implementation of getConnectedDevice() incorrect?");
                                } else {
                                    BluetoothOTAManager bluetoothOTAManager2 = BluetoothOTAManager.this;
                                    bluetoothOTAManager2.m26900a(bluetoothOTAManager2.f37497r.getReconnectAddress(), reconnectParam.getFlag() == 1);
                                    if (BluetoothOTAManager.this.getBluetoothOption().isUseReconnect()) {
                                        BluetoothOTAManager.this.f37490F.removeMessages(BluetoothOTAManager.f37481k);
                                        BluetoothOTAManager.this.f37490F.sendEmptyMessageDelayed(BluetoothOTAManager.f37481k, DeviceReConnectManager.RECONNECT_TIMEOUT);
                                    } else {
                                        BluetoothOTAManager.this.f37497r.startReconnectTask();
                                    }
                                    BluetoothOTAManager.this.m26896a((ReconnectParam) null);
                                }
                            }
                            break;
                        default:
                            switch (i) {
                                case BluetoothOTAManager.f37480j /* 4672 */:
                                    JL_Log.m27232d(BluetoothOTAManager.this.TAG, "CALLBACK_OTA_FINISH", "---->");
                                    BluetoothOTAManager.this.m26920c();
                                    break;
                                case BluetoothOTAManager.f37481k /* 4673 */:
                                    BluetoothOTAManager.this.m26898a("OTA_RECONNECT_DEVICE_TIMEOUT", OTAError.buildError(ErrorCode.SUB_ERR_RECONNECT_TIMEOUT));
                                    break;
                                case BluetoothOTAManager.f37482l /* 4674 */:
                                    Object obj3 = message.obj;
                                    if (!(obj3 instanceof BluetoothDevice)) {
                                        return false;
                                    }
                                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) obj3;
                                    JL_Log.m27232d(BluetoothOTAManager.this.TAG, "DISCONNECT_DEVICE_TIMEOUT", "device : " + bluetoothDevice3);
                                    BluetoothOTAManager.this.onBtDeviceConnection(bluetoothDevice3, 0);
                                    break;
                                    break;
                            }
                            break;
                    }
                } else {
                    JL_Log.m27236i(BluetoothOTAManager.this.TAG, "WAIT_DEVICE_DISCONNECT", "----> " + BluetoothOTAManager.this.f37489E);
                    BluetoothOTAManager bluetoothOTAManager3 = BluetoothOTAManager.this;
                    bluetoothOTAManager3.m26877a(bluetoothOTAManager3.getTargetDevice(), BluetoothOTAManager.this.f37489E);
                }
                return true;
            }
        });
        OnBtBleListener onBtBleListener = new OnBtBleListener() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.15
            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtBleListener
            public void onBleConnection(BluetoothDevice bluetoothDevice, int i) {
                if (BluetoothOTAManager.this.getBluetoothOption().isAutoConnectBle()) {
                    BluetoothOTAManager bluetoothOTAManager = BluetoothOTAManager.this;
                    bluetoothOTAManager.onBtDeviceConnection(bluetoothDevice, bluetoothOTAManager.m26866a(i));
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                byte[] value;
                if (!BluetoothOTAManager.this.getBluetoothOption().isAutoConnectBle() || bluetoothGatt == null) {
                    return;
                }
                BluetoothDevice device = bluetoothGatt.getDevice();
                if (!BluetoothUtil.deviceEquals(device, BluetoothOTAManager.this.getTargetDevice()) || (value = bluetoothGattCharacteristic.getValue()) == null || value.length == 0) {
                    return;
                }
                BluetoothOTAManager.this.onReceiveDeviceData(device, value);
            }
        };
        this.f37491G = onBtBleListener;
        OnBtAssistantCallback onBtAssistantCallback = new OnBtAssistantCallback() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.16
            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onA2dpStatus(BluetoothDevice bluetoothDevice, int i) {
                BluetoothOTAManager.this.f37498s.onA2dpStatus(bluetoothDevice, i);
                BluetoothOTAManager.this.m26876a(bluetoothDevice, 2, i);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onAdapterStatus(boolean z, boolean z2) {
                BluetoothOTAManager.this.f37498s.onAdapterStatus(z, z2);
                if (z) {
                    return;
                }
                BluetoothOTAManager.this.m26898a("onAdapterStatus", OTAError.buildError(4099));
                BluetoothDevice targetDevice = BluetoothOTAManager.this.getTargetDevice();
                if (targetDevice != null) {
                    BluetoothOTAManager.this.m26907b(targetDevice, 0);
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onDiscovery(BluetoothDevice bluetoothDevice, BleScanMessage bleScanMessage) {
                BluetoothOTAManager.this.f37498s.onDiscovery(bluetoothDevice, bleScanMessage);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onDiscoveryStatus(boolean z, boolean z2) {
                BluetoothOTAManager.this.f37498s.onDiscoveryStatus(z, z2);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBtAssistantCallback, com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
            public void onHfpStatus(BluetoothDevice bluetoothDevice, int i) {
                BluetoothOTAManager.this.f37498s.onHfpStatus(bluetoothDevice, i);
                BluetoothOTAManager.this.m26876a(bluetoothDevice, 1, i);
            }
        };
        this.f37492H = onBtAssistantCallback;
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.17
            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i) {
                if (i != 1) {
                    BluetoothOTAManager.this.m26907b(bluetoothDevice, i);
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback
            public void onMandatoryUpgrade(BluetoothDevice bluetoothDevice) {
                BluetoothOTAManager.this.f37498s.onMandatoryUpgrade(bluetoothDevice);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                BluetoothOTAManager.this.f37498s.onReceiveCommand(bluetoothDevice, commandBase);
                if (bluetoothDevice == null || commandBase == null) {
                    return;
                }
                if (commandBase.isResponseCmd()) {
                    BluetoothOTAManager.this.m26909b(bluetoothDevice, commandBase);
                } else {
                    BluetoothOTAManager.this.m26878a(bluetoothDevice, commandBase);
                }
            }

            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback
            public void onRcspError(BluetoothDevice bluetoothDevice, BaseError baseError) {
                BluetoothOTAManager.this.f37498s.onError(baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback
            public void onRcspInit(BluetoothDevice bluetoothDevice, boolean z) {
                if (z) {
                    BluetoothOTAManager.this.m26907b(bluetoothDevice, 1);
                } else {
                    BluetoothOTAManager.this.m26947i(bluetoothDevice);
                }
            }
        };
        this.f37493I = onRcspCallback;
        this.context = (Context) CommonUtil.checkNotNull(context, "Context can not be null.");
        this.f37488D = new OtaConfigureHelper(context);
        if (!BluetoothAssistant.isInit()) {
            BluetoothAssistant.init(context);
        }
        BluetoothAssistant bluetoothAssistant = BluetoothAssistant.getInstance();
        this.f37496q = bluetoothAssistant;
        RcspOpImpl rcspOpImpl = new RcspOpImpl(context, new IBtProxy() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.2
            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtProxy
            public void setOnBtListener(OnBtListener onBtListener) {
                BluetoothOTAManager.this.f37501v = onBtListener;
            }

            @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtProxy
            public boolean writeData(BluetoothDevice bluetoothDevice, byte[] bArr) {
                return BluetoothOTAManager.this.m26917b(bluetoothDevice, bArr);
            }
        });
        this.f37494o = rcspOpImpl;
        JL_Log.m27236i(simpleName, C12616d4.a.f34169f, CommonUtil.formatString("Lib version name = %s(%d)", JL_Constant.getLibVersionName(), Integer.valueOf(JL_Constant.getLibVersionCode())));
        this.f37495p = new RcspOTA(rcspOpImpl);
        this.f37498s = new BtEventCallbackHelper();
        this.f37500u = new OtaDataCache();
        this.f37497r = new DeviceReConnectManager(context, this);
        bluetoothAssistant.addOnBtAssistantCallback(onBtAssistantCallback);
        bluetoothAssistant.addOnBtBleListener(onBtBleListener);
        rcspOpImpl.registerOnRcspCallback(onRcspCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m26866a(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m26957m() {
        if (m26903a("upgradeStep03")) {
            return;
        }
        this.f37495p.enterUpdateMode(new IActionCallback<Integer>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.11
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                BluetoothOTAManager.this.m26898a("upgradeStep03", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(Integer num) {
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "upgradeStep03", "Step3. Request to enter upgrade mode. Result : " + num);
                if (num.intValue() == 0) {
                    BluetoothOTAManager.this.m26950j();
                    return;
                }
                onError(OTAError.buildError(16385, "Device is not allowed to enter the upgrade mode : " + num));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private void m26958n() {
        if (m26903a("upgradeStep05")) {
            return;
        }
        this.f37495p.queryUpdateResult(new IActionCallback<Integer>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.13
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                BluetoothOTAManager.this.m26898a("upgradeStep05", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(Integer num) {
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "upgradeStep05", "Step05. Check upgrade status. Result : " + CommonUtil.formatInt(num.intValue()));
                BluetoothDevice targetDevice = BluetoothOTAManager.this.getTargetDevice();
                TargetInfoResponse deviceInfo = BluetoothOTAManager.this.getDeviceInfo();
                boolean z = false;
                if (num.intValue() == 0) {
                    BluetoothOTAManager.this.m26916b(false);
                    if (deviceInfo != null) {
                        BluetoothOTAManager.this.f37488D.removeAddress(deviceInfo.getUid(), deviceInfo.getPid());
                    }
                    if (BluetoothOTAManager.this.getBluetoothOption().isPriorityCallbackOtaFinish()) {
                        BluetoothOTAManager.this.m26920c();
                    } else {
                        BluetoothOTAManager.this.f37490F.removeMessages(BluetoothOTAManager.f37480j);
                        BluetoothOTAManager.this.f37490F.sendEmptyMessageDelayed(BluetoothOTAManager.f37480j, 500L);
                    }
                    BluetoothOTAManager.this.f37495p.rebootDevice(new IActionCallback<Boolean>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.13.1
                        @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                        public void onError(BaseError baseError) {
                        }

                        @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                        public void onSuccess(Boolean bool) {
                            BluetoothOTAManager.this.m26938g();
                        }
                    });
                    return;
                }
                if (num.intValue() != 128) {
                    if (num.intValue() != 254) {
                        onError(RcspOTA.convertCmdE6Error(num.intValue()));
                        return;
                    }
                    BluetoothOTAManager.this.m26946i();
                    if (deviceInfo == null || !deviceInfo.isSupportReuseSpaceOTA() || deviceInfo.getExpandMode() != 2) {
                        BluetoothOTAManager.this.m26921c(targetDevice, 2);
                        return;
                    } else {
                        final String strM26870a = BluetoothOTAManager.this.m26870a(targetDevice, deviceInfo.isMandatoryUpgrade());
                        BluetoothOTAManager.this.f37495p.rebootDevice(new IActionCallback<Boolean>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.13.2
                            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                            public void onError(BaseError baseError) {
                                BluetoothOTAManager.this.m26899a("upgradeStep05", new BaseError(ErrorCode.SUB_ERR_NEED_UPDATE_RESOURCE, strM26870a), true);
                            }

                            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                            public void onSuccess(Boolean bool) {
                                onError(OTAError.buildError(0));
                            }
                        });
                        return;
                    }
                }
                BluetoothOTAManager.this.m26946i();
                if (deviceInfo != null && deviceInfo.isSupportDoubleBackup()) {
                    z = true;
                }
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "upgradeStep05", "download resource finish. isSupportDoubleBackup : " + z);
                if (z) {
                    BluetoothOTAManager.this.m26957m();
                } else {
                    BluetoothOTAManager.this.m26921c(targetDevice, 1);
                }
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void addOnRcspCallback(OnRcspCallback onRcspCallback) {
        this.f37494o.registerOnRcspCallback(onRcspCallback);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void cancelOTA() {
        m26901a(false);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void configure(BluetoothOTAConfigure bluetoothOTAConfigure) {
        JL_Log.m27232d(this.TAG, "configure", "" + bluetoothOTAConfigure);
        this.f37496q.configure(bluetoothOTAConfigure);
        this.f37494o.configure(bluetoothOTAConfigure);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public BluetoothOTAConfigure getBluetoothOption() {
        return this.f37494o.getBluetoothOption();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public TargetInfoResponse getDeviceInfo() {
        return getDeviceInfo(getTargetDevice());
    }

    public BluetoothDevice getTargetDevice() {
        return this.f37494o.getTargetDevice();
    }

    public long getTimeout_ms() {
        return this.f37504y;
    }

    public long getTotalTime() {
        return this.f37485A;
    }

    public int getUpdateContentSize() {
        return this.f37486B;
    }

    public boolean isOTA() {
        return this.f37503x;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothDevice == null) {
            JL_Log.m27236i(this.TAG, "onBtDeviceConnection", "BluetoothDevice is null.");
            return;
        }
        Integer num = this.f37499t.get(bluetoothDevice.getAddress());
        if (num != null && num.intValue() == i) {
            JL_Log.m27236i(this.TAG, "onBtDeviceConnection", "Same status : " + StateCode.printConnectionState(i));
            return;
        }
        if (i == 0) {
            this.f37499t.remove(bluetoothDevice.getAddress());
        } else {
            this.f37499t.put(bluetoothDevice.getAddress(), Integer.valueOf(i));
        }
        this.f37498s.onBtDeviceConnection(bluetoothDevice, i);
        JL_Log.m27236i(this.TAG, "onBtDeviceConnection", "device : " + printBtDeviceInfo(bluetoothDevice) + ", " + StateCode.printConnectionState(i));
        if (i != 3) {
            this.f37490F.removeMessages(f37481k);
        }
        if (i == 1) {
            boolean zM26932e = m26932e(bluetoothDevice);
            JL_Log.m27232d(this.TAG, "onBtDeviceConnection", "isConnectedBLE : " + zM26932e);
            if (zM26932e) {
                m26943h(bluetoothDevice);
                return;
            }
        }
        OnBtListener onBtListener = this.f37501v;
        if (onBtListener != null) {
            onBtListener.onConnection(bluetoothDevice, i);
        }
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void onError(BaseError baseError) {
        this.f37498s.onError(baseError);
        m26898a("errorEventCallback", baseError);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (bluetoothGatt == null) {
            return;
        }
        int i3 = i2 == 0 ? i - 3 : 20;
        JL_Log.m27236i(this.TAG, "onMtuChanged", "bleMtu : " + i3);
        m26908b(bluetoothGatt.getDevice(), i3, i2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void onReceiveDeviceData(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (bluetoothDevice == null || bArr == null) {
            return;
        }
        JL_Log.m27232d(this.TAG, "onReceiveDeviceData", "device : " + bluetoothDevice + ", recv data : " + CHexConver.byte2HexStr(bArr));
        OnBtListener onBtListener = this.f37501v;
        if (onBtListener != null) {
            onBtListener.onReceivedData(bluetoothDevice, bArr);
        }
    }

    public String printBtDeviceInfo(BluetoothDevice bluetoothDevice) {
        return BluetoothUtil.printBtDeviceInfo(this.context, bluetoothDevice);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void queryMandatoryUpdate(final IActionCallback<TargetInfoResponse> iActionCallback) {
        BluetoothDevice targetDevice = getTargetDevice();
        if (targetDevice == null) {
            CommonUtil.callbackError(this.TAG, "queryMandatoryUpdate", iActionCallback, OTAError.buildError(4114));
            return;
        }
        TargetInfoResponse deviceInfo = getDeviceInfo(targetDevice);
        JL_Log.m27236i(this.TAG, "queryMandatoryUpdate", "cache deviceInfo : " + deviceInfo);
        if (deviceInfo == null) {
            this.f37494o.syncDeviceInfo(new IActionCallback<TargetInfoResponse>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.3
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    CommonUtil.callbackError(BluetoothOTAManager.this.TAG, "queryMandatoryUpdate", iActionCallback, baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(TargetInfoResponse targetInfoResponse) {
                    BluetoothOTAManager.this.queryMandatoryUpdate(iActionCallback);
                }
            });
            return;
        }
        if (!deviceInfo.isMandatoryUpgrade() && deviceInfo.getRequestOtaFlag() != 1) {
            CommonUtil.callbackError(this.TAG, "queryMandatoryUpdate", iActionCallback, OTAError.buildError(0, "Device is connected."));
            return;
        }
        if (iActionCallback != null) {
            iActionCallback.onSuccess(deviceInfo);
        }
        this.f37498s.onMandatoryUpgrade(targetDevice);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void registerBluetoothCallback(BtEventCallback btEventCallback) {
        this.f37498s.addCallback(btEventCallback);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void release() {
        JL_Log.m27236i(this.TAG, "release", "clazz : " + this);
        m26901a(true);
        m26942h();
        this.f37499t.clear();
        this.f37497r.release();
        this.f37498s.release();
        this.f37490F.removeCallbacksAndMessages(null);
        this.f37494o.unregisterOnRcspCallback(this.f37493I);
        this.f37494o.release();
        this.f37496q.removeOnBtBleListener(this.f37491G);
        this.f37496q.removeOnBtAssistantCallback(this.f37492H);
        this.f37496q.release();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void removeRcspCallback(OnRcspCallback onRcspCallback) {
        this.f37494o.unregisterOnRcspCallback(onRcspCallback);
    }

    public void resetTotalTime() {
        this.f37485A = 0L;
    }

    public void runOnMainThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            runnable.run();
        } else {
            this.f37490F.post(runnable);
        }
    }

    public void setReconnectAddress(String str) {
        if (this.f37497r.isWaitingForUpdate() && CHexConver.checkBluetoothAddress(str)) {
            this.f37497r.setReconnectAddress(str);
        }
    }

    public void setTimeout_ms(long j) {
        this.f37504y = j;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void startOTA(IUpgradeCallback iUpgradeCallback) {
        final BluetoothDevice targetDevice = getTargetDevice();
        if (targetDevice == null) {
            JL_Log.m27240w(this.TAG, "startOTA", "Bluetooth device is disconnected.");
            if (iUpgradeCallback != null) {
                iUpgradeCallback.onError(OTAError.buildError(4114));
                return;
            }
            return;
        }
        if (isOTA()) {
            JL_Log.m27240w(this.TAG, "startOTA", "OTA in progress.");
            if (iUpgradeCallback != null) {
                iUpgradeCallback.onError(OTAError.buildError(ErrorCode.SUB_ERR_OTA_IN_HANDLE));
                return;
            }
            return;
        }
        m26916b(true);
        this.f37502w = iUpgradeCallback;
        BluetoothOTAConfigure bluetoothOption = getBluetoothOption();
        JL_Log.m27232d(this.TAG, "startOTA", "device : " + printBtDeviceInfo(targetDevice) + ", " + bluetoothOption);
        m26905b();
        this.f37500u.init(getBluetoothOption(), new IActionCallback<Boolean>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.4
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                BluetoothOTAManager.this.m26898a("startOTA", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(Boolean bool) {
                BluetoothOTAManager.this.m26951j(targetDevice);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBluetoothManager
    public void unregisterBluetoothCallback(BtEventCallback btEventCallback) {
        this.f37498s.removeCallback(btEventCallback);
    }

    /* JADX INFO: renamed from: h */
    private void m26943h(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return;
        }
        if (this.f37490F.hasMessages(f37475e)) {
            JL_Log.m27240w(this.TAG, "startChangeMtu", "Adjusting the MTU for BLE");
            return;
        }
        BluetoothOTAConfigure bluetoothOption = getBluetoothOption();
        boolean zM26929d = (!bluetoothOption.isNeedChangeMtu() || bluetoothOption.getMtu() <= 20) ? false : m26929d(bluetoothDevice, bluetoothOption.getMtu());
        JL_Log.m27232d(this.TAG, "startChangeMtu", "requestBleMtu : " + zM26929d);
        if (!zM26929d) {
            m26939g(bluetoothDevice);
            return;
        }
        this.f37490F.removeMessages(f37475e);
        Handler handler = this.f37490F;
        handler.sendMessageDelayed(handler.obtainMessage(f37475e, bluetoothDevice), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m26947i(BluetoothDevice bluetoothDevice) {
        this.f37490F.removeMessages(f37482l);
        Handler handler = this.f37490F;
        handler.sendMessageDelayed(handler.obtainMessage(f37482l, bluetoothDevice), 6000L);
        disconnectBluetoothDevice(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m26950j() {
        if (m26903a("startReceiveCmdTimeout")) {
            return;
        }
        long timeout_ms = getTimeout_ms();
        if (timeout_ms <= 0) {
            return;
        }
        this.f37490F.removeMessages(f37474d);
        this.f37490F.sendEmptyMessageDelayed(f37474d, timeout_ms);
    }

    /* JADX INFO: renamed from: k */
    private void m26953k() {
        this.f37490F.removeMessages(f37474d);
    }

    /* JADX INFO: renamed from: l */
    private void m26956l() {
        if (this.f37497r.isWaitingForUpdate()) {
            this.f37497r.stopReconnectTask();
        }
    }

    public TargetInfoResponse getDeviceInfo(BluetoothDevice bluetoothDevice) {
        return this.f37494o.getDeviceInfo(bluetoothDevice);
    }

    /* JADX INFO: renamed from: c */
    private int m26918c(BluetoothDevice bluetoothDevice) {
        int singleBackupOtaWay;
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo != null && !deviceInfo.isSupportDoubleBackup()) {
            if (deviceInfo.isMandatoryUpgrade() || (singleBackupOtaWay = deviceInfo.getSingleBackupOtaWay()) == 1) {
                return 0;
            }
            if (singleBackupOtaWay == 2) {
                return 1;
            }
            if (deviceInfo.getSdkType() >= 2) {
                return 0;
            }
            return getBluetoothOption().getPriority();
        }
        return getBluetoothOption().getPriority();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    private boolean m26929d(BluetoothDevice bluetoothDevice, int i) {
        if (!CommonUtil.checkHasConnectPermission(this.context)) {
            JL_Log.m27236i(this.TAG, "requestBleMtu", "Missing connect permission");
            return false;
        }
        BluetoothGatt connectedBluetoothGatt = getConnectedBluetoothGatt();
        if (connectedBluetoothGatt == null) {
            JL_Log.m27236i(this.TAG, "requestBleMtu", "getConnectedBluetoothGatt is null.");
            return false;
        }
        if (!BluetoothUtil.deviceEquals(connectedBluetoothGatt.getDevice(), bluetoothDevice)) {
            JL_Log.m27236i(this.TAG, "requestBleMtu", "Device is not match.");
            return false;
        }
        JL_Log.m27232d(this.TAG, "requestBleMtu", "requestMtu is started. mtu : " + i);
        if (connectedBluetoothGatt.requestMtu(i + 3)) {
            return true;
        }
        JL_Log.m27236i(this.TAG, "requestBleMtu", "Failed to request BLE MTU. callback old mtu.");
        m26908b(bluetoothDevice, 20, 4115);
        return false;
    }

    /* JADX INFO: renamed from: e */
    private boolean m26931e() {
        return m26937f(getTargetDevice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public boolean m26937f(BluetoothDevice bluetoothDevice) {
        Integer num;
        return (bluetoothDevice == null || (num = this.f37499t.get(bluetoothDevice.getAddress())) == null || num.intValue() != 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m26939g(BluetoothDevice bluetoothDevice) {
        OnBtListener onBtListener = this.f37501v;
        if (onBtListener != null) {
            onBtListener.onConnection(bluetoothDevice, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m26954k(final BluetoothDevice bluetoothDevice) {
        if (m26903a("upgradeStep01")) {
            return;
        }
        this.f37495p.readUpgradeFileFlag(new IActionCallback<FileOffset>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.6
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                BluetoothOTAManager.this.m26898a("upgradeStep01", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(FileOffset fileOffset) {
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "upgradeStep01", CommonUtil.formatString("Step01. Query upgrade file information, %s", fileOffset));
                BluetoothOTAManager.this.m26875a(bluetoothDevice, 0.0f);
                BluetoothOTAManager.this.m26922c(bluetoothDevice, fileOffset.getOffset(), fileOffset.getLen());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private boolean m26932e(BluetoothDevice bluetoothDevice) {
        if (!m26937f(bluetoothDevice)) {
            return false;
        }
        BluetoothGatt connectedBluetoothGatt = getConnectedBluetoothGatt();
        return (connectedBluetoothGatt != null && BluetoothUtil.deviceEquals(connectedBluetoothGatt.getDevice(), bluetoothDevice)) || getBluetoothOption().getPriority() == 0;
    }

    /* JADX INFO: renamed from: f */
    private boolean m26936f() {
        TargetInfoResponse deviceInfo = getDeviceInfo();
        return deviceInfo != null && deviceInfo.isSupportDoubleBackup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m26938g() {
        if (this.f37490F.hasMessages(f37480j)) {
            this.f37490F.removeMessages(f37480j);
            this.f37490F.sendEmptyMessage(f37480j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m26946i() {
        this.f37487C = 0;
        this.f37486B = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m26951j(final BluetoothDevice bluetoothDevice) {
        if (m26903a("upgradePrepare")) {
            return;
        }
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null) {
            this.f37494o.syncDeviceInfo(new IActionCallback<TargetInfoResponse>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.5
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    BluetoothOTAManager.this.m26898a("upgradePrepare", baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(TargetInfoResponse targetInfoResponse) {
                    BluetoothOTAManager.this.m26954k(bluetoothDevice);
                }
            });
            return;
        }
        if (deviceInfo.isMandatoryUpgrade()) {
            this.f37488D.saveAddress(deviceInfo.getUid(), deviceInfo.getPid(), 1, 0, bluetoothDevice.getAddress());
        } else {
            String bleAddr = deviceInfo.getBleAddr();
            if (!CHexConver.checkBluetoothAddress(bleAddr) && m26932e(bluetoothDevice)) {
                bleAddr = bluetoothDevice.getAddress();
            }
            this.f37488D.saveAddress(deviceInfo.getUid(), deviceInfo.getPid(), 0, 0, bleAddr);
            String edrAddr = deviceInfo.getEdrAddr();
            if (!CHexConver.checkBluetoothAddress(edrAddr) && !m26932e(bluetoothDevice)) {
                edrAddr = bluetoothDevice.getAddress();
            }
            this.f37488D.saveAddress(deviceInfo.getUid(), deviceInfo.getPid(), 0, 1, edrAddr);
        }
        m26954k(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m26916b(boolean z) {
        this.f37503x = z;
    }

    /* JADX INFO: renamed from: b */
    private void m26908b(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f37498s.onBleDataBlockChanged(bluetoothDevice, i, i2);
        JL_Log.m27236i(this.TAG, "onBleDataBlockChanged", CommonUtil.formatString("device : %s, block : %d, status : %d", printBtDeviceInfo(bluetoothDevice), Integer.valueOf(i), Integer.valueOf(i2)));
        if (this.f37490F.hasMessages(f37475e)) {
            this.f37490F.removeMessages(f37475e);
            m26939g(bluetoothDevice);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m26924c(boolean z) {
        if (this.f37505z > 0) {
            this.f37485A = CommonUtil.getCurrentTime() - this.f37505z;
            if (z) {
                this.f37505z = 0L;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m26942h() {
        m26916b(false);
        this.f37502w = null;
        m26953k();
        m26946i();
        m26924c(true);
        m26896a((ReconnectParam) null);
        this.f37500u.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m26920c() {
        final IUpgradeCallback iUpgradeCallback = this.f37502w;
        JL_Log.m27236i(this.TAG, "callbackStopOTA", "callback : " + iUpgradeCallback);
        m26942h();
        if (iUpgradeCallback != null) {
            runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1iOiO
                @Override // java.lang.Runnable
                public final void run() {
                    iUpgradeCallback.onStopOTA();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m26927d(BluetoothDevice bluetoothDevice) {
        this.f37490F.removeMessages(f37478h);
        boolean zIsWaitingForUpdate = this.f37497r.isWaitingForUpdate();
        JL_Log.m27236i(this.TAG, "handleBrEdrDisconnect", "isWaitingForUpdate : " + zIsWaitingForUpdate);
        if (zIsWaitingForUpdate) {
            if (m26937f(bluetoothDevice)) {
                m26947i(bluetoothDevice);
            } else {
                m26926d();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private float m26904b(int i) {
        int i2 = this.f37486B;
        if (i2 <= 0) {
            return 0.0f;
        }
        float f = (i * 100.0f) / i2;
        if (f >= 100.0f) {
            return 99.9f;
        }
        return f;
    }

    /* JADX INFO: renamed from: b */
    private void m26905b() {
        JL_Log.m27236i(this.TAG, "callbackStartOTA", "");
        resetTotalTime();
        final IUpgradeCallback iUpgradeCallback = this.f37502w;
        if (iUpgradeCallback != null) {
            runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O00OOOXXi
                @Override // java.lang.Runnable
                public final void run() {
                    iUpgradeCallback.onStartOTA();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m26922c(final BluetoothDevice bluetoothDevice, int i, int i2) {
        if (m26903a("upgradeStep02")) {
            return;
        }
        if (i2 < 0 || i < 0) {
            m26898a("upgradeStep02", OTAError.buildError(4097, CommonUtil.formatString("upgradeStep02: offset = %d, len = %d", Integer.valueOf(i), Integer.valueOf(i2))));
        } else if (i == 0 && i2 == 0) {
            m26880a(bluetoothDevice, new byte[]{CHexConver.intToByte(getBluetoothOption().getPriority())});
        } else {
            this.f37500u.readOtaData(i, i2, new IActionCallback<byte[]>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.7
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    BluetoothOTAManager.this.m26898a("upgradeStep02", baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(byte[] bArr) {
                    BluetoothOTAManager.this.m26880a(bluetoothDevice, bArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26896a(ReconnectParam reconnectParam) {
        this.f37489E = reconnectParam;
    }

    /* JADX INFO: renamed from: a */
    private String m26869a(BluetoothDevice bluetoothDevice, int i) {
        String bleAddr;
        String address = bluetoothDevice.getAddress();
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo != null && !deviceInfo.isSupportDoubleBackup()) {
            if (!deviceInfo.isMandatoryUpgrade() && i != 0) {
                bleAddr = deviceInfo.getEdrAddr();
            } else {
                bleAddr = deviceInfo.getBleAddr();
            }
            if (CHexConver.checkBluetoothAddress(bleAddr) && !bleAddr.equals(address)) {
                return bleAddr;
            }
        }
        return address;
    }

    /* JADX INFO: renamed from: d */
    private void m26926d() {
        this.f37490F.removeMessages(f37476f);
        this.f37490F.sendEmptyMessageDelayed(f37476f, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m26906b(BluetoothDevice bluetoothDevice) {
        if (m26903a("checkUpgradeEnvironment")) {
            return;
        }
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        JL_Log.m27232d(this.TAG, "checkUpgradeEnvironment", CommonUtil.formatString("device : %s, %s", printBtDeviceInfo(bluetoothDevice), deviceInfo));
        if (deviceInfo == null) {
            m26898a("checkUpgradeEnvironment", OTAError.buildError(4114));
            return;
        }
        m26956l();
        if (deviceInfo.isSupportDoubleBackup()) {
            m26957m();
            return;
        }
        if (deviceInfo.isNeedBootLoader()) {
            m26874a(bluetoothDevice);
            m26950j();
        } else if (deviceInfo.isMandatoryUpgrade()) {
            m26957m();
        } else {
            m26921c(bluetoothDevice, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m26921c(final BluetoothDevice bluetoothDevice, int i) {
        TargetInfoResponse deviceInfo;
        if (m26903a("readyToReconnectDevice") || (deviceInfo = getDeviceInfo()) == null) {
            return;
        }
        int iM26918c = m26918c(bluetoothDevice);
        int i2 = (IS_SUPPORT_NEW_RECONNECT_WAY && i == 1) ? 1 : 0;
        String strM26869a = m26869a(bluetoothDevice, iM26918c);
        String strM26870a = m26870a(bluetoothDevice, deviceInfo.isMandatoryUpgrade());
        if (i == 2 && CHexConver.checkBluetoothAddress(strM26870a)) {
            strM26869a = strM26870a;
        }
        m26896a(new ReconnectParam(bluetoothDevice.getAddress(), iM26918c, strM26869a).setFlag(i2));
        ReConnectDevMsg reConnectDevMsg = new ReConnectDevMsg(iM26918c, strM26869a, i2 == 1);
        this.f37497r.setReConnectDevMsg(reConnectDevMsg);
        JL_Log.m27232d(this.TAG, "readyToReconnectDevice", "flag = " + i2 + ", way = " + i + ", " + reConnectDevMsg);
        this.f37490F.removeMessages(f37479i);
        this.f37490F.sendEmptyMessageDelayed(f37479i, 6000L);
        if (i == 1) {
            this.f37495p.changeCommunicationWay(iM26918c, i2, new IActionCallback<Integer>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.9
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    BluetoothOTAManager.this.m26898a("readyToReconnectDevice", baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(Integer num) {
                    JL_Log.m27232d(BluetoothOTAManager.this.TAG, "changeCommunicationWay", "onSuccess : " + num);
                    BluetoothOTAManager.this.f37490F.removeMessages(BluetoothOTAManager.f37479i);
                    if (BluetoothOTAManager.this.f37497r.isWaitingForUpdate()) {
                        BluetoothOTAManager.this.f37497r.setReconnectUseADV(num.intValue() == 1);
                    }
                    if (BluetoothOTAManager.this.f37489E != null) {
                        BluetoothOTAManager.this.f37489E.setFlag(num.intValue());
                        BluetoothOTAManager bluetoothOTAManager = BluetoothOTAManager.this;
                        bluetoothOTAManager.m26877a(bluetoothDevice, bluetoothOTAManager.f37489E);
                    }
                }
            });
        } else if (i == 2) {
            if (deviceInfo.isMandatoryUpgrade() && getBluetoothOption().getPriority() != 0) {
                getBluetoothOption().setPriority(0);
            }
            this.f37495p.rebootDevice(new IActionCallback<Boolean>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.10
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    BluetoothOTAManager.this.m26898a("readyToReconnectDevice", baseError);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(Boolean bool) {
                    BluetoothOTAManager.this.f37490F.removeMessages(BluetoothOTAManager.f37479i);
                    BluetoothOTAManager bluetoothOTAManager = BluetoothOTAManager.this;
                    bluetoothOTAManager.m26877a(bluetoothDevice, bluetoothOTAManager.f37489E);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26877a(BluetoothDevice bluetoothDevice, ReconnectParam reconnectParam) {
        JL_Log.m27232d(this.TAG, "startReConnectTask", CommonUtil.formatString("device : %s, ReconnectParam = %s", printBtDeviceInfo(bluetoothDevice), reconnectParam));
        if (bluetoothDevice == null || reconnectParam == null) {
            return;
        }
        boolean zM26937f = m26937f(bluetoothDevice);
        JL_Log.m27236i(this.TAG, "startReConnectTask", "isConnectedDevice = " + zM26937f);
        if (!zM26937f) {
            m26926d();
            return;
        }
        boolean zM26932e = m26932e(bluetoothDevice);
        JL_Log.m27236i(this.TAG, "startReConnectTask", "isBLEConnected = " + zM26932e);
        if (zM26932e) {
            JL_Log.m27232d(this.TAG, "startReConnectTask", "Waiting for ble disconnect... ");
            m26926d();
            return;
        }
        boolean z = this.f37496q.isConnectedByProfile(bluetoothDevice) == 2;
        JL_Log.m27232d(this.TAG, "startReConnectTask", "isEDRConnected : " + z);
        if (!z) {
            JL_Log.m27232d(this.TAG, "startReConnectTask", "handleBrEdrDisconnect >>> ");
            m26927d(bluetoothDevice);
            return;
        }
        this.f37490F.removeMessages(f37478h);
        Handler handler = this.f37490F;
        handler.sendMessageDelayed(handler.obtainMessage(f37478h, bluetoothDevice), 6000L);
        boolean zDisconnectByProfiles = this.f37496q.disconnectByProfiles(bluetoothDevice);
        JL_Log.m27236i(this.TAG, "startReConnectTask", "disconnectEdrRet : " + zDisconnectByProfiles);
        if (zDisconnectByProfiles) {
            return;
        }
        JL_Log.m27236i(this.TAG, "startReConnectTask", "Failed to disconnect Classic device.");
        boolean zRemoveBond = BluetoothUtil.removeBond(this.context, bluetoothDevice);
        JL_Log.m27236i(this.TAG, "startReConnectTask", "removeBond >>> " + zRemoveBond);
        if (zRemoveBond) {
            return;
        }
        m26927d(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Code duplicated, block: B:40:0x013e  */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0038, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00b6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x010b, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public void m26907b(BluetoothDevice bluetoothDevice, int i) {
        ReconnectParam reconnectParam;
        boolean zIsMandatoryUpgrade;
        boolean zIsOTA = isOTA();
        boolean zIsWaitingForUpdate = this.f37497r.isWaitingForUpdate();
        JL_Log.m27236i(this.TAG, "notifyConnectionStatus", CommonUtil.formatString("device : %s, state: %s\n isOTA : %s, isWaitingForUpdate : %s.", printBtDeviceInfo(bluetoothDevice), StateCode.printConnectionState(i), Boolean.valueOf(zIsOTA), Boolean.valueOf(zIsWaitingForUpdate)));
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
                JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "handle connected event. " + deviceInfo);
                zIsMandatoryUpgrade = deviceInfo.isMandatoryUpgrade();
                boolean zIsSupportReuseSpaceOTA = deviceInfo.isSupportReuseSpaceOTA();
                int expandMode = deviceInfo.getExpandMode();
                if (!zIsMandatoryUpgrade && (!zIsSupportReuseSpaceOTA || expandMode != 3)) {
                    z = false;
                }
                m26956l();
                JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "isForceOTA : " + z + ", isMandatoryUpgrade : " + zIsMandatoryUpgrade + ", isSupportReuseSpaceOTA : " + zIsSupportReuseSpaceOTA + ", expandMode : " + expandMode);
                if (z) {
                    m26874a(bluetoothDevice);
                    if (zIsOTA && zIsWaitingForUpdate) {
                        m26875a(bluetoothDevice, 0.0f);
                        JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "Reconnect device successfully, continue ...");
                        if (getBluetoothOption().isAutoConnectBle()) {
                            JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "onConnection : " + StateCode.printConnectionState(i));
                            this.f37498s.onConnection(bluetoothDevice, i);
                        }
                        if (zIsMandatoryUpgrade) {
                            m26957m();
                            return;
                        } else {
                            m26954k(bluetoothDevice);
                            return;
                        }
                    }
                } else if (zIsOTA) {
                    JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "The device is functioning properly. However, the cache status is currently being upgraded, so the upgrade call is complete.");
                    m26920c();
                }
            } else if (i == 2) {
                JL_Log.m27240w(this.TAG, "notifyConnectionStatus", "handle disconnect event.");
                this.f37490F.removeMessages(f37477g);
                this.f37490F.removeMessages(f37482l);
                m26953k();
                m26938g();
                if (zIsOTA) {
                    if (zIsWaitingForUpdate) {
                        reconnectParam = this.f37489E;
                        JL_Log.m27236i(this.TAG, "notifyConnectionStatus", " " + reconnectParam);
                        this.f37490F.removeMessages(f37478h);
                        this.f37490F.removeMessages(f37479i);
                        if (reconnectParam != null) {
                            JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "device communication channel is disconnect. ready reconnect task. ");
                            m26926d();
                            return;
                        }
                    } else {
                        m26898a("notifyConnectionStatus", OTAError.buildError(4114));
                    }
                }
            } else if (i == 4) {
                TargetInfoResponse deviceInfo2 = getDeviceInfo(bluetoothDevice);
                JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "handle connected event. " + deviceInfo2);
                zIsMandatoryUpgrade = deviceInfo2.isMandatoryUpgrade();
                boolean zIsSupportReuseSpaceOTA2 = deviceInfo2.isSupportReuseSpaceOTA();
                int expandMode2 = deviceInfo2.getExpandMode();
                if (!zIsMandatoryUpgrade) {
                    z = false;
                }
                m26956l();
                JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "isForceOTA : " + z + ", isMandatoryUpgrade : " + zIsMandatoryUpgrade + ", isSupportReuseSpaceOTA : " + zIsSupportReuseSpaceOTA2 + ", expandMode : " + expandMode2);
                if (z) {
                    m26874a(bluetoothDevice);
                    if (zIsOTA) {
                        m26875a(bluetoothDevice, 0.0f);
                        JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "Reconnect device successfully, continue ...");
                        if (getBluetoothOption().isAutoConnectBle()) {
                            JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "onConnection : " + StateCode.printConnectionState(i));
                            this.f37498s.onConnection(bluetoothDevice, i);
                        }
                        if (zIsMandatoryUpgrade) {
                            m26957m();
                            return;
                        } else {
                            m26954k(bluetoothDevice);
                            return;
                        }
                    }
                } else if (zIsOTA) {
                    JL_Log.m27232d(this.TAG, "notifyConnectionStatus", "The device is functioning properly. However, the cache status is currently being upgraded, so the upgrade call is complete.");
                    m26920c();
                }
            }
        } else {
            JL_Log.m27240w(this.TAG, "notifyConnectionStatus", "handle disconnect event.");
            this.f37490F.removeMessages(f37477g);
            this.f37490F.removeMessages(f37482l);
            m26953k();
            m26938g();
            if (zIsOTA) {
                if (zIsWaitingForUpdate) {
                    reconnectParam = this.f37489E;
                    JL_Log.m27236i(this.TAG, "notifyConnectionStatus", " " + reconnectParam);
                    this.f37490F.removeMessages(f37478h);
                    this.f37490F.removeMessages(f37479i);
                    if (reconnectParam != null) {
                        JL_Log.m27236i(this.TAG, "notifyConnectionStatus", "device communication channel is disconnect. ready reconnect task. ");
                        m26926d();
                        return;
                    }
                } else {
                    m26898a("notifyConnectionStatus", OTAError.buildError(4114));
                }
            }
        }
        JL_Log.m27236i(this.TAG, "notifyConnectionStatus", CommonUtil.formatString("onConnection :: device : %s, state: %s", printBtDeviceInfo(bluetoothDevice), StateCode.printConnectionState(i)));
        this.f37498s.onConnection(bluetoothDevice, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m26870a(BluetoothDevice bluetoothDevice, boolean z) {
        byte[] bArrAddressCovertToByteArray;
        if (bluetoothDevice == null) {
            return null;
        }
        TargetInfoResponse deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo != null) {
            String address = this.f37488D.getAddress(deviceInfo.getUid(), deviceInfo.getPid(), 0, 0);
            if (CHexConver.checkBluetoothAddress(address)) {
                return address;
            }
            String address2 = this.f37488D.getAddress(deviceInfo.getUid(), deviceInfo.getPid(), 0, 1);
            if (CHexConver.checkBluetoothAddress(address2)) {
                return address2;
            }
        }
        String address3 = bluetoothDevice.getAddress();
        if (!z || (bArrAddressCovertToByteArray = BluetoothUtil.addressCovertToByteArray(address3)) == null) {
            return address3;
        }
        int iByteToInt = CHexConver.byteToInt(bArrAddressCovertToByteArray[bArrAddressCovertToByteArray.length - 1]) - 1;
        if (iByteToInt < 0) {
            iByteToInt = 255;
        }
        bArrAddressCovertToByteArray[bArrAddressCovertToByteArray.length - 1] = CHexConver.intToByte(iByteToInt);
        return BluetoothUtil.hexDataCovetToAddress(bArrAddressCovertToByteArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26900a(final String str, final boolean z) {
        if (m26903a("callbackReconnectEvent")) {
            return;
        }
        JL_Log.m27236i(this.TAG, "callbackReconnectEvent", "address : " + str + ", " + z);
        final IUpgradeCallback iUpgradeCallback = this.f37502w;
        if (iUpgradeCallback != null) {
            runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1iXO
                @Override // java.lang.Runnable
                public final void run() {
                    iUpgradeCallback.onNeedReconnect(str, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26875a(BluetoothDevice bluetoothDevice, float f) {
        TargetInfoResponse deviceInfo;
        if (m26903a("callbackProgress") || (deviceInfo = getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        m26873a((deviceInfo.isSupportReuseSpaceOTA() && deviceInfo.getExpandMode() == 3) ? 1 : !deviceInfo.isNeedBootLoader(), f);
    }

    /* JADX INFO: renamed from: a */
    private void m26873a(final int i, final float f) {
        if (m26903a("callbackProgress")) {
            return;
        }
        JL_Log.m27232d(this.TAG, "callbackProgress", "type = " + i + ", progress = " + f);
        m26924c(false);
        final IUpgradeCallback iUpgradeCallback = this.f37502w;
        if (iUpgradeCallback != null) {
            runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iXXiiiiI
                @Override // java.lang.Runnable
                public final void run() {
                    iUpgradeCallback.onProgress(i, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m26909b(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
        if (bluetoothDevice == null || commandBase == null || commandBase.getStatus() != 0) {
            return;
        }
        int id = commandBase.getId();
        if (id == 209) {
            SettingsMtuResponse settingsMtuResponse = (SettingsMtuResponse) ((SettingsMtuCmd) commandBase).getResponse();
            if (settingsMtuResponse != null) {
                this.f37494o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(bluetoothDevice, settingsMtuResponse.getRealMtu());
                return;
            }
            return;
        }
        if (id != 227) {
            if (id != 231) {
                return;
            }
            JL_Log.m27236i(this.TAG, "handleResponseCommand", "reboot >>> ");
            disconnectBluetoothDevice(bluetoothDevice);
            return;
        }
        EnterUpdateModeResponse enterUpdateModeResponse = (EnterUpdateModeResponse) ((EnterUpdateModeCmd) commandBase).getResponse();
        if (enterUpdateModeResponse == null || enterUpdateModeResponse.getCanUpdateFlag() != 0) {
            return;
        }
        m26874a(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26872a() {
        final IUpgradeCallback iUpgradeCallback = this.f37502w;
        JL_Log.m27240w(this.TAG, "callbackCancelOTA", "callback : " + iUpgradeCallback);
        m26942h();
        if (iUpgradeCallback != null) {
            runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OIX0OI0i
                @Override // java.lang.Runnable
                public final void run() {
                    iUpgradeCallback.onCancelOTA();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26898a(String str, BaseError baseError) {
        m26899a(str, baseError, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26899a(String str, final BaseError baseError, boolean z) {
        if (baseError == null) {
            return;
        }
        if (z || !m26903a("callbackError")) {
            final IUpgradeCallback iUpgradeCallback = this.f37502w;
            JL_Log.m27234e(this.TAG, "callbackError", CommonUtil.formatString("(%s) ---> %s", str, baseError));
            m26942h();
            if (iUpgradeCallback != null) {
                runOnMainThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XIiX100i
                    @Override // java.lang.Runnable
                    public final void run() {
                        iUpgradeCallback.onError(baseError);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m26917b(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (getBluetoothOption().isAutoConnectBle() && this.f37496q.isConnectedBLEDevice(bluetoothDevice)) {
            BleCharacteristic bleCharacteristic = getBluetoothOption().getBleConnectParam().getBleWriteCharacteristicList().get(0);
            this.f37496q.sendBleData(new BleSendParam(bluetoothDevice, bleCharacteristic.getServiceUUID(), bleCharacteristic.getCharacteristicUUID(), bArr, new OnBleSendDataCallback() { // from class: com.android.mltcode.paycertificationapi.iIiXOii
                @Override // com.jieli.jl_bt_ota.interfaces.p199bt.OnBleSendDataCallback
                public final void onResult(BluetoothDevice bluetoothDevice2, UUID uuid, UUID uuid2, boolean z, byte[] bArr2) {
                    this.OXO1.m26879a(bluetoothDevice2, uuid, uuid2, z, bArr2);
                }
            }));
            return true;
        }
        return sendDataToDevice(bluetoothDevice, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26876a(BluetoothDevice bluetoothDevice, int i, int i2) {
        if (bluetoothDevice == null || i2 != 0) {
            return;
        }
        boolean z = true;
        if (i != 1 ? !(i != 2 || this.f37496q.isConnectedByHfp(bluetoothDevice) == 0) : this.f37496q.isConnectedByA2dp(bluetoothDevice) != 0) {
            z = false;
        }
        boolean zHasMessages = this.f37490F.hasMessages(f37478h);
        JL_Log.m27232d(this.TAG, "handleBrEdrProfileStatus", "isBrEdrDisconnect : " + z + ", isWaitingEdrDisconnectTask : " + zHasMessages);
        if (z && zHasMessages) {
            m26927d(bluetoothDevice);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m26874a(BluetoothDevice bluetoothDevice) {
        if (this.f37494o.getDeviceStatusCache().getMaxReceiveMtu(bluetoothDevice) < 530) {
            this.f37494o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(bluetoothDevice, 530);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26880a(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f37495p.inquiryDeviceCanOTA(bArr, new IActionCallback<Integer>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.8
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                BluetoothOTAManager.this.m26898a("upgradeStep02", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(Integer num) {
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "inquiryDeviceCanOTA", CommonUtil.formatString("Step2.Check if the device can be upgraded. Result : %d", num));
                if (num.intValue() == 0) {
                    BluetoothOTAManager.this.m26906b(bluetoothDevice);
                } else {
                    onError(RcspOTA.convertCmdE2Error(num.intValue()));
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m26897a(final FirmwareUpdateBlockCmd firmwareUpdateBlockCmd, final int i, int i2) {
        if (m26903a("upgradeStep04")) {
            return;
        }
        m26953k();
        if (i == 0 && i2 == 0) {
            JL_Log.m27236i(this.TAG, "upgradeStep04", "Read data completed.");
            firmwareUpdateBlockCmd.setParam(null);
            firmwareUpdateBlockCmd.setStatus(0);
            this.f37495p.sendCommandResponse(firmwareUpdateBlockCmd);
            m26958n();
            return;
        }
        this.f37500u.readOtaData(i, i2, new IActionCallback<byte[]>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.12
            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onError(BaseError baseError) {
                baseError.setCmdSn(firmwareUpdateBlockCmd.getId()).setCmdSn(firmwareUpdateBlockCmd.getOpCodeSn());
                BluetoothOTAManager.this.m26898a("upgradeStep04", baseError);
            }

            @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
            public void onSuccess(byte[] bArr) {
                int length = bArr != null ? bArr.length : 0;
                String string = CommonUtil.formatString("read data, offset : %s, data len : %s.", CommonUtil.formatInt(i), CommonUtil.formatInt(length));
                JL_Log.m27236i(BluetoothOTAManager.this.TAG, "upgradeStep04", string);
                if (length <= 0) {
                    onError(OTAError.buildError(16388, string));
                    return;
                }
                firmwareUpdateBlockCmd.setParam(new FirmwareUpdateBlockResponseParam(bArr));
                firmwareUpdateBlockCmd.setStatus(0);
                BluetoothOTAManager.this.f37495p.sendCommandResponse(firmwareUpdateBlockCmd);
                BluetoothOTAManager.this.m26950j();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m26901a(boolean z) {
        if (m26903a("exitUpdateMode")) {
            return;
        }
        boolean zM26936f = m26936f();
        JL_Log.m27232d(this.TAG, "exitUpdateMode", "isRelease : " + z + ", isSupportDoubleBackup : " + zM26936f);
        if (!zM26936f) {
            JL_Log.m27236i(this.TAG, "exitUpdateMode", CommonUtil.formatString("device[%s] is single flash ota, so ota progress cannot be interrupted.", getTargetDevice()));
        } else {
            m26916b(false);
            this.f37495p.exitUpdateMode(new IActionCallback<Integer>() { // from class: com.jieli.jl_bt_ota.impl.BluetoothOTAManager.14
                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onError(BaseError baseError) {
                    BluetoothOTAManager.this.m26899a("exitUpdateMode", baseError, true);
                }

                @Override // com.jieli.jl_bt_ota.interfaces.IActionCallback
                public void onSuccess(Integer num) {
                    JL_Log.m27232d(BluetoothOTAManager.this.TAG, "exitUpdateMode", "onSuccess >>> " + num);
                    if (num.intValue() == 0) {
                        BluetoothOTAManager.this.m26872a();
                        return;
                    }
                    onError(OTAError.buildError(16385, num.intValue(), "Device return a bad code : " + num));
                }
            });
        }
        if (z) {
            m26898a("exitUpdateMode", OTAError.buildError(ErrorCode.SUB_ERR_SDK_RELEASE));
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m26903a(String str) {
        if (isOTA()) {
            return false;
        }
        JL_Log.m27240w(this.TAG, str, "OTA process has exited.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m26878a(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
        BaseError baseErrorBuildError;
        if (bluetoothDevice == null || commandBase == null) {
            return;
        }
        int i = 0;
        boolean z = commandBase.getType() == 2 || commandBase.getType() == 3;
        int id = commandBase.getId();
        if (id == 194) {
            boolean zIsOTA = isOTA();
            boolean zHasMessages = this.f37490F.hasMessages(f37477g);
            JL_Log.m27232d(this.TAG, "Receive C2 Command", "0xC2 : isOTA = " + zIsOTA + ", hasStopAdvNotify = " + zHasMessages);
            if (!zIsOTA || zHasMessages) {
                return;
            }
            this.f37490F.sendEmptyMessageDelayed(f37477g, 5000L);
            this.f37495p.stopADVInfo(null);
            return;
        }
        if (id == 209) {
            SettingsMtuCmd settingsMtuCmd = (SettingsMtuCmd) commandBase;
            SettingsMtuParam settingsMtuParam = (SettingsMtuParam) settingsMtuCmd.getParam();
            if (settingsMtuParam == null) {
                JL_Log.m27232d(this.TAG, "Receive D1 command", "0xD1 : command is error.");
                if (z) {
                    settingsMtuCmd.setStatus(1);
                    this.f37495p.sendCommandResponse(settingsMtuCmd);
                    return;
                }
                return;
            }
            int mtu = settingsMtuParam.getMtu();
            int maxReceiveMtu = this.f37494o.getDeviceStatusCache().getMaxReceiveMtu(bluetoothDevice);
            if (mtu >= 530) {
                this.f37494o.getDeviceStatusCache().updateDeviceMaxReceiveMtu(bluetoothDevice, mtu);
            } else {
                mtu = maxReceiveMtu;
            }
            if (z) {
                settingsMtuParam.setMtu(mtu);
                settingsMtuCmd.setStatus(0);
                this.f37495p.sendCommandResponse(settingsMtuCmd);
                return;
            }
            return;
        }
        if (id != 232) {
            if (id == 228) {
                ExitUpdateModeCmd exitUpdateModeCmd = (ExitUpdateModeCmd) commandBase;
                if (isOTA()) {
                    m26872a();
                }
                exitUpdateModeCmd.setParam(null);
                exitUpdateModeCmd.setStatus(0);
                this.f37495p.sendCommandResponse(exitUpdateModeCmd);
                return;
            }
            if (id != 229) {
                return;
            }
            m26953k();
            FirmwareUpdateBlockCmd firmwareUpdateBlockCmd = (FirmwareUpdateBlockCmd) commandBase;
            if (m26903a("Receive E5 command")) {
                firmwareUpdateBlockCmd.setParam(null);
                firmwareUpdateBlockCmd.setStatus(1);
                this.f37495p.sendCommandResponse(firmwareUpdateBlockCmd);
                return;
            }
            FirmwareUpdateBlockParam firmwareUpdateBlockParam = (FirmwareUpdateBlockParam) firmwareUpdateBlockCmd.getParam();
            if (firmwareUpdateBlockParam == null) {
                JL_Log.m27232d(this.TAG, "Receive E5 Command", "0xE5 : command is error.");
                firmwareUpdateBlockCmd.setStatus(1);
                this.f37495p.sendCommandResponse(firmwareUpdateBlockCmd);
                m26898a("Receive E5 command", OTAError.buildError(12293, "E5 command"));
                return;
            }
            int nextUpdateBlockOffsetAddr = firmwareUpdateBlockParam.getNextUpdateBlockOffsetAddr();
            int nextUpdateBlockLen = firmwareUpdateBlockParam.getNextUpdateBlockLen();
            if (this.f37486B > 0) {
                int i2 = this.f37487C + nextUpdateBlockLen;
                this.f37487C = i2;
                m26875a(bluetoothDevice, m26904b(i2));
            }
            m26897a(firmwareUpdateBlockCmd, nextUpdateBlockOffsetAddr, nextUpdateBlockLen);
            return;
        }
        NotifyUpdateContentSizeCmd notifyUpdateContentSizeCmd = (NotifyUpdateContentSizeCmd) commandBase;
        if (!m26903a("Receive E8 command ")) {
            NotifyUpdateContentSizeParam notifyUpdateContentSizeParam = (NotifyUpdateContentSizeParam) notifyUpdateContentSizeCmd.getParam();
            if (notifyUpdateContentSizeParam == null) {
                JL_Log.m27240w(this.TAG, "Receive E8 Command", "0xE8 : command is error.");
                baseErrorBuildError = OTAError.buildError(12293, "E8 command");
            } else {
                JL_Log.m27240w(this.TAG, "Receive E8 Command", "0xE8 : " + notifyUpdateContentSizeParam);
                int contentSize = notifyUpdateContentSizeParam.getContentSize();
                if (contentSize < 0) {
                    JL_Log.m27240w(this.TAG, "Receive E8 Command", "0xE8 : length = " + contentSize);
                    baseErrorBuildError = OTAError.buildError(4097, "Update content size : " + contentSize);
                } else {
                    this.f37505z = CommonUtil.getCurrentTime();
                    int currentProgress = notifyUpdateContentSizeParam.getCurrentProgress();
                    this.f37487C = currentProgress;
                    this.f37486B = contentSize;
                    m26875a(bluetoothDevice, m26904b(currentProgress));
                }
            }
            i = 1;
            notifyUpdateContentSizeCmd.setStatus(i);
            notifyUpdateContentSizeCmd.setParam(null);
            this.f37495p.sendCommandResponse(notifyUpdateContentSizeCmd);
            if (baseErrorBuildError != null) {
                m26898a("Receive E8 command", baseErrorBuildError);
            }
        }
        i = 1;
        baseErrorBuildError = null;
        notifyUpdateContentSizeCmd.setStatus(i);
        notifyUpdateContentSizeCmd.setParam(null);
        this.f37495p.sendCommandResponse(notifyUpdateContentSizeCmd);
        if (baseErrorBuildError != null) {
            m26898a("Receive E8 command", baseErrorBuildError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m26879a(BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, boolean z, byte[] bArr) {
        JL_Log.m27232d(this.TAG, "writeBleData", CommonUtil.formatString("(%s) | UUID(%s : %s) | (%s) ---> \n %s", bluetoothDevice, UuidUtil.read16BitUUID(uuid), UuidUtil.read16BitUUID(uuid2), Boolean.valueOf(z), CHexConver.byte2HexStr(bArr)));
    }
}
