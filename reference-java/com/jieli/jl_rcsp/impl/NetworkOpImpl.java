package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.NetworkOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import com.jieli.jl_rcsp.interfaces.network.INetworkOp;
import com.jieli.jl_rcsp.interfaces.network.OnNetworkListener;
import com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkBase;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkFunction;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkInfo;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkOTA;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkOTAState;
import com.jieli.jl_rcsp.model.device.settings.p201v0.SettingFunction;
import com.jieli.jl_rcsp.model.network.OTAParam;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkOpImpl implements INetworkOp {
    public static long WAITING_END_STATE_TIMEOUT = 240000;
    public static long WAITING_START_STATE_TIMEOUT = 60000;

    /* JADX INFO: renamed from: j */
    public static volatile NetworkOpImpl f37863j = null;

    /* JADX INFO: renamed from: k */
    public static final int f37864k = 4112;

    /* JADX INFO: renamed from: a */
    public final String f37865a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b */
    public final RcspOpImpl f37866b;

    /* JADX INFO: renamed from: c */
    public final SettingFunctionImpl f37867c;

    /* JADX INFO: renamed from: d */
    public final DataTransferOpImpl f37868d;

    /* JADX INFO: renamed from: e */
    public final CallbackManager f37869e;

    /* JADX INFO: renamed from: f */
    public Param f37870f;

    /* JADX INFO: renamed from: g */
    public final Handler f37871g;

    /* JADX INFO: renamed from: h */
    public final OnRcspCallback f37872h;

    /* JADX INFO: renamed from: i */
    public final OnSettingFunctionListener f37873i;

    public static class CallbackManager extends BaseCallbackManager<OnNetworkListener> implements OnNetworkListener {
        public CallbackManager(Handler handler) {
            super(handler);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkListener
        public void onNetworkInfo(final BluetoothDevice bluetoothDevice, final NetworkInfo networkInfo) {
            callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.jieli.jl_rcsp.impl.XO0O10
                @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
                public final void onPost(Object obj) {
                    ((OnNetworkListener) obj).onNetworkInfo(bluetoothDevice, networkInfo);
                }
            });
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkListener
        public void onNetworkOTAState(final BluetoothDevice bluetoothDevice, final NetworkOTAState networkOTAState) {
            callbackEvent(new BaseCallbackManager.CallbackImpl() { // from class: com.jieli.jl_rcsp.impl.O00
                @Override // com.jieli.jl_rcsp.tool.callback.BaseCallbackManager.CallbackImpl
                public final void onPost(Object obj) {
                    ((OnNetworkListener) obj).onNetworkOTAState(bluetoothDevice, networkOTAState);
                }
            });
        }
    }

    public static class Param {

        /* JADX INFO: renamed from: a */
        public final BluetoothDevice f37885a;

        /* JADX INFO: renamed from: b */
        public final OnNetworkOTACallback f37886b;

        /* JADX INFO: renamed from: c */
        public byte[] f37887c;

        /* JADX INFO: renamed from: d */
        public boolean f37888d;

        public Param(BluetoothDevice bluetoothDevice, OnNetworkOTACallback onNetworkOTACallback) {
            this.f37885a = bluetoothDevice;
            this.f37886b = onNetworkOTACallback;
        }

        public OnNetworkOTACallback getCallback() {
            return this.f37886b;
        }

        public BluetoothDevice getDevice() {
            return this.f37885a;
        }

        public byte[] getOtaData() {
            return this.f37887c;
        }

        public boolean isNetworkOTA() {
            return this.f37888d;
        }

        public Param setNetworkOTA(boolean z) {
            this.f37888d = z;
            return this;
        }

        public Param setOtaData(byte[] bArr) {
            this.f37887c = bArr;
            return this;
        }
    }

    public NetworkOpImpl(RcspOpImpl rcspOpImpl) {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.y51
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f12313IO.m27366a(message);
            }
        });
        this.f37871g = handler;
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.6
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i) {
                if (!NetworkOpImpl.this.isNetworkOTA() || i == 1) {
                    return;
                }
                NetworkOpImpl.this.m27361a(8192);
            }
        };
        this.f37872h = onRcspCallback;
        OnSettingFunctionListener onSettingFunctionListener = new OnSettingFunctionListener() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.7
            @Override // com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener
            public void onSettingData(BluetoothDevice bluetoothDevice, SettingData settingData) {
            }

            @Override // com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener
            public void onSettingFunction(BluetoothDevice bluetoothDevice, SettingFunction settingFunction) {
                NetworkBase networkBase;
                if (!(settingFunction instanceof NetworkFunction) || (networkBase = ((NetworkFunction) settingFunction).getNetworkBase()) == null) {
                    return;
                }
                if (networkBase instanceof NetworkInfo) {
                    NetworkInfo networkInfo = (NetworkInfo) networkBase;
                    DeviceInfo deviceInfo = NetworkOpImpl.this.f37866b.getDeviceInfo(bluetoothDevice);
                    if (deviceInfo != null) {
                        deviceInfo.setNetworkInfo(networkInfo);
                    }
                    NetworkOpImpl.this.f37869e.onNetworkInfo(bluetoothDevice, networkInfo);
                    return;
                }
                if (networkBase instanceof NetworkOTAState) {
                    NetworkOTAState networkOTAState = (NetworkOTAState) networkBase;
                    NetworkOpImpl.this.f37869e.onNetworkOTAState(bluetoothDevice, networkOTAState);
                    JL_Log.m27877d(NetworkOpImpl.this.f37865a, "onSettingFunction", networkOTAState + ", isNetworkOTA = " + NetworkOpImpl.this.isNetworkOTA());
                    if (NetworkOpImpl.this.isNetworkOTA()) {
                        NetworkOpImpl.this.f37871g.removeMessages(4112);
                        int state = networkOTAState.getState();
                        if (state != 0) {
                            if (state != 1) {
                                return;
                            }
                            NetworkOpImpl networkOpImpl = NetworkOpImpl.this;
                            networkOpImpl.m27365a(networkOpImpl.f37870f.f37887c);
                            return;
                        }
                        int code = networkOTAState.getCode();
                        if (code == 0) {
                            NetworkOpImpl.this.f37870f.setNetworkOTA(false);
                            OnNetworkOTACallback onNetworkOTACallback = NetworkOpImpl.this.f37870f.f37886b;
                            if (onNetworkOTACallback != null) {
                                onNetworkOTACallback.onProgress(100);
                                onNetworkOTACallback.onStop();
                                return;
                            }
                            return;
                        }
                        if (code == 1) {
                            NetworkOpImpl.this.m27361a(20481);
                        } else if (code == 2) {
                            NetworkOpImpl.this.m27361a(WatchError.ERR_NETWORK_OTA_TIMEOUT);
                        } else {
                            BaseError baseErrorBuildJsonError = RcspErrorCode.buildJsonError(51, 20480, networkOTAState.getCode(), "");
                            NetworkOpImpl.this.m27362a(baseErrorBuildJsonError.getSubCode(), baseErrorBuildJsonError.getMessage());
                        }
                    }
                }
            }
        };
        this.f37873i = onSettingFunctionListener;
        if (rcspOpImpl == null) {
            throw new NullPointerException("WatchOpImpl can not be null.");
        }
        this.f37866b = rcspOpImpl;
        rcspOpImpl.registerOnRcspCallback(onRcspCallback);
        SettingFunctionImpl settingFunctionImplInstance = SettingFunctionImpl.instance(rcspOpImpl);
        this.f37867c = settingFunctionImplInstance;
        this.f37868d = DataTransferOpImpl.instance(rcspOpImpl);
        this.f37869e = new CallbackManager(handler);
        settingFunctionImplInstance.addOnSettingFunctionListener(onSettingFunctionListener);
    }

    public static NetworkOpImpl instance(RcspOpImpl rcspOpImpl) {
        if (f37863j == null) {
            synchronized (NetworkOpImpl.class) {
                try {
                    if (f37863j == null) {
                        f37863j = new NetworkOpImpl(rcspOpImpl);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37863j;
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void addOnNetworkListener(OnNetworkListener onNetworkListener) {
        this.f37869e.registerCallback(onNetworkListener);
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void cancelNetworkOTA(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        if (onOperationCallback != null) {
            onOperationCallback.onSuccess(Boolean.FALSE);
        }
    }

    public void destroy() {
        cancelNetworkOTA(m27367b(), null);
        this.f37866b.unregisterOnRcspCallback(this.f37872h);
        this.f37867c.removeOnSettingFunctionListener(this.f37873i);
        this.f37867c.destroy();
        this.f37868d.destroy();
        this.f37869e.release();
        f37863j = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public boolean isNetworkOTA() {
        Param param = this.f37870f;
        return param != null && param.isNetworkOTA();
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void queryNetworkInfo(final BluetoothDevice bluetoothDevice, final OnOperationCallback<Boolean> onOperationCallback) {
        this.f37867c.settingFunction(bluetoothDevice, new PublicSettingsCmd.Param(new NetworkFunction(0, new NetworkBase(0))), new OnOperationCallback<PublicSettingsCmd.Response>() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(PublicSettingsCmd.Response response) {
                if (response.getResult() == 0 && (response.getSettingData() instanceof NetworkFunction)) {
                    NetworkFunction networkFunction = (NetworkFunction) response.getSettingData();
                    if (networkFunction.getNetworkBase() instanceof NetworkInfo) {
                        NetworkInfo networkInfo = (NetworkInfo) networkFunction.getNetworkBase();
                        DeviceInfo deviceInfo = NetworkOpImpl.this.f37866b.getDeviceInfo();
                        if (deviceInfo != null) {
                            deviceInfo.setNetworkInfo(networkInfo);
                        }
                        OnOperationCallback onOperationCallback2 = onOperationCallback;
                        if (onOperationCallback2 != null) {
                            onOperationCallback2.onSuccess(Boolean.TRUE);
                        }
                        NetworkOpImpl.this.f37869e.onNetworkInfo(bluetoothDevice, networkInfo);
                        return;
                    }
                }
                onFailed(RcspErrorCode.buildJsonError(51, 12293, response.getResult(), null));
            }
        });
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void removeOnNetworkListener(OnNetworkListener onNetworkListener) {
        this.f37869e.unregisterCallback(onNetworkListener);
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void startNetworkOTA(BluetoothDevice bluetoothDevice, OTAParam oTAParam, OnNetworkOTACallback onNetworkOTACallback) {
        if (isNetworkOTA()) {
            if (onNetworkOTACallback != null) {
                onNetworkOTACallback.onError(4352, WatchError.getErrorDesc(4352));
                return;
            }
            return;
        }
        this.f37870f = new Param(bluetoothDevice, onNetworkOTACallback).setNetworkOTA(true);
        if (onNetworkOTACallback != null) {
            onNetworkOTACallback.onStart();
        }
        if (oTAParam.getOtaData() == null || oTAParam.getOtaData().length <= 0) {
            m27369b(oTAParam.getOtaFilePath(), new OnOperationCallback<byte[]>() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.2
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    NetworkOpImpl.this.m27362a(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(byte[] bArr) {
                    NetworkOpImpl.this.f37870f.setOtaData(bArr);
                    NetworkOpImpl networkOpImpl = NetworkOpImpl.this;
                    networkOpImpl.m27368b(networkOpImpl.f37870f.getOtaData().length);
                }
            });
        } else {
            this.f37870f.setOtaData(oTAParam.getOtaData());
            m27368b(this.f37870f.getOtaData().length);
        }
    }

    /* JADX INFO: renamed from: b */
    public final BluetoothDevice m27367b() {
        return this.f37866b.getConnectedDevice();
    }

    /* JADX INFO: renamed from: b */
    public final void m27369b(final String str, final OnOperationCallback<byte[]> onOperationCallback) {
        new Thread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.c61
            @Override // java.lang.Runnable
            public final void run() {
                this.f5916IO.m27364a(str, onOperationCallback);
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean m27366a(Message message) {
        if (4112 != message.what) {
            return true;
        }
        m27361a(WatchError.ERR_NETWORK_OTA_WAITING_COMMAND_TIMEOUT);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m27368b(int i) {
        if (isNetworkOTA()) {
            m27363a(this.f37870f.f37885a, i, new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.3
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    NetworkOpImpl.this.m27362a(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    if (NetworkOpImpl.this.isNetworkOTA()) {
                        NetworkInfo networkInfoM27360a = NetworkOpImpl.this.m27360a();
                        long startOtaTimeout = networkInfoM27360a == null ? NetworkOpImpl.WAITING_START_STATE_TIMEOUT : ((long) networkInfoM27360a.getStartOtaTimeout()) * 1000;
                        JL_Log.m27877d(NetworkOpImpl.this.f37865a, "prepareOta", "start OTA timeout = " + startOtaTimeout);
                        NetworkOpImpl.this.f37871g.removeMessages(4112);
                        NetworkOpImpl.this.f37871g.sendEmptyMessageDelayed(4112, startOtaTimeout);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final NetworkInfo m27360a() {
        DeviceInfo deviceInfo = this.f37866b.getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return deviceInfo.getNetworkInfo();
    }

    /* JADX INFO: renamed from: a */
    public final void m27361a(int i) {
        m27362a(i, WatchError.getErrorDesc(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m27362a(int i, String str) {
        if (isNetworkOTA()) {
            this.f37871g.removeMessages(4112);
            this.f37870f.setNetworkOTA(false);
            OnNetworkOTACallback onNetworkOTACallback = this.f37870f.f37886b;
            if (onNetworkOTACallback != null) {
                if (i == 4098) {
                    onNetworkOTACallback.onCancel();
                } else {
                    onNetworkOTACallback.onError(i, str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27364a(final String str, final OnOperationCallback onOperationCallback) {
        int i;
        File file = new File(str);
        if (file.exists() && file.isFile() && file.length() != 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                do {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } while (i != -1);
                fileInputStream.close();
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f37871g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.z51
                    @Override // java.lang.Runnable
                    public final void run() {
                        NetworkOpImpl.m27353a(onOperationCallback, byteArray);
                    }
                });
                byteArrayOutputStream.close();
                return;
            } catch (IOException e) {
                e.printStackTrace();
                this.f37871g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.a61
                    @Override // java.lang.Runnable
                    public final void run() {
                        NetworkOpImpl.m27351a(onOperationCallback, e);
                    }
                });
                return;
            }
        }
        this.f37871g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.b61
            @Override // java.lang.Runnable
            public final void run() {
                NetworkOpImpl.m27352a(onOperationCallback, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27352a(OnOperationCallback onOperationCallback, String str) {
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4097, WatchError.getErrorDesc(4097) + " Error Path : " + str));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27353a(OnOperationCallback onOperationCallback, byte[] bArr) {
        if (onOperationCallback != null) {
            onOperationCallback.onSuccess(bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27351a(OnOperationCallback onOperationCallback, IOException iOException) {
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(16389, WatchError.getErrorDesc(16389) + ", " + iOException.getMessage()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27365a(byte[] bArr) {
        if (isNetworkOTA()) {
            final OnNetworkOTACallback onNetworkOTACallback = this.f37870f.f37886b;
            this.f37868d.sendLargeData(new SendParams(7, 0, 4096, 4096, bArr), new OnDataEventCallback() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.4
                @Override // com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback
                public void onBegin(int i) {
                }

                @Override // com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback
                public void onError(BaseError baseError) {
                    NetworkOpImpl.this.m27362a(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback
                public void onProgress(float f) {
                    int i = (int) f;
                    if (i >= 100) {
                        i = 99;
                    }
                    OnNetworkOTACallback onNetworkOTACallback2 = onNetworkOTACallback;
                    if (onNetworkOTACallback2 != null) {
                        onNetworkOTACallback2.onProgress(i);
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback
                public void onStop(int i, byte[] bArr2) {
                    NetworkInfo networkInfoM27360a = NetworkOpImpl.this.m27360a();
                    long stopOtaTimeout = networkInfoM27360a == null ? NetworkOpImpl.WAITING_END_STATE_TIMEOUT : ((long) networkInfoM27360a.getStopOtaTimeout()) * 1000;
                    JL_Log.m27877d(NetworkOpImpl.this.f37865a, "prepareOta", "stop OTA timeout = " + stopOtaTimeout);
                    NetworkOpImpl.this.f37871g.removeMessages(4112);
                    NetworkOpImpl.this.f37871g.sendEmptyMessageDelayed(4112, stopOtaTimeout);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27363a(BluetoothDevice bluetoothDevice, int i, final OnOperationCallback<Boolean> onOperationCallback) {
        this.f37867c.settingFunction(bluetoothDevice, new PublicSettingsCmd.Param(new NetworkFunction(1, new NetworkOTA(i))), new OnOperationCallback<PublicSettingsCmd.Response>() { // from class: com.jieli.jl_rcsp.impl.NetworkOpImpl.5
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(PublicSettingsCmd.Response response) {
                if (response.getResult() != 0) {
                    onFailed(RcspErrorCode.buildJsonError(51, 12293, response.getResult(), null));
                    return;
                }
                OnOperationCallback onOperationCallback2 = onOperationCallback;
                if (onOperationCallback2 != null) {
                    onOperationCallback2.onSuccess(Boolean.TRUE);
                }
            }
        });
    }
}
