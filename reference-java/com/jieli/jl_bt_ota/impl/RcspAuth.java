package com.jieli.jl_bt_ota.impl;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.constant.BluetoothConstant;
import com.jieli.jl_bt_ota.interfaces.JieLiLibLoader;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class RcspAuth {
    public static int AUTH_RETRY_COUNT = 2;
    private static final long DEFAULT_AUTH_TIMEOUT = 3000;
    private static long DELAY_AUTH_WAITING_TIME = 3000;
    public static final int ERR_AUTH_DATA_CHECK = 40980;
    public static final int ERR_AUTH_DATA_SEND = 40979;
    public static final int ERR_AUTH_DEVICE_TIMEOUT = 40977;
    public static final int ERR_AUTH_USER_STOP = 40978;
    public static final int ERR_NONE = 0;
    private static final long MIN_AUTH_INTERVAL = 500;
    private static final int MSG_AUTH_DEVICE_TIMEOUT = 18;
    private static final int MSG_SEND_AUTH_DATA_TIMEOUT = 17;
    private static final long OP_DELAY = 50;
    private static final String TAG = "RcspAuth";
    private static volatile boolean mIsLibLoaded = false;
    public static final JieLiLibLoader sLocalLibLoader = new JieLiLibLoader() { // from class: com.android.mltcode.paycertificationapi.zc2
        @Override // com.jieli.jl_bt_ota.interfaces.JieLiLibLoader
        public final void loadLibrary(String str) {
            System.loadLibrary(str);
        }
    };
    private boolean isLibInit;
    private final Map<String, AuthTask> mAuthTaskMap = Collections.synchronizedMap(new HashMap());
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.jieli.jl_bt_ota.impl.RcspAuth.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 17) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) message.obj;
                AuthTask authTask = (AuthTask) RcspAuth.this.mAuthTaskMap.get(bluetoothDevice.getAddress());
                if (authTask == null) {
                    return false;
                }
                if (authTask.getRetryNum() < RcspAuth.AUTH_RETRY_COUNT) {
                    authTask.setRetryNum(authTask.getRetryNum() + 1);
                    RcspAuth.this.sendAuthDataToDevice(authTask.getDevice(), authTask.getRandomData());
                    RcspAuth.this.mHandler.removeMessages(18);
                    RcspAuth.this.mHandler.sendMessageDelayed(RcspAuth.this.mHandler.obtainMessage(17, bluetoothDevice), RcspAuth.DELAY_AUTH_WAITING_TIME);
                } else {
                    RcspAuth.this.onAuthFailed(bluetoothDevice, 40977);
                }
            } else if (i == 18) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) message.obj;
                AuthTask authTask2 = (AuthTask) RcspAuth.this.mAuthTaskMap.get(bluetoothDevice2.getAddress());
                if (authTask2 != null && !authTask2.isAuthDevice()) {
                    RcspAuth.this.onAuthFailed(bluetoothDevice2, 40977);
                }
            }
            return true;
        }
    });
    private final OnRcspAuthListener mListener;
    private final IRcspAuthOp mRcspAuthOp;

    public static class AuthTask {

        /* JADX INFO: renamed from: a */
        private BluetoothDevice f37537a;

        /* JADX INFO: renamed from: b */
        private boolean f37538b;

        /* JADX INFO: renamed from: c */
        private boolean f37539c;

        /* JADX INFO: renamed from: d */
        private byte[] f37540d;

        /* JADX INFO: renamed from: e */
        private int f37541e;

        private AuthTask() {
        }

        public BluetoothDevice getDevice() {
            return this.f37537a;
        }

        public byte[] getRandomData() {
            return this.f37540d;
        }

        public int getRetryNum() {
            return this.f37541e;
        }

        public boolean isAuthDevice() {
            return this.f37539c;
        }

        public boolean isAuthProgressResult() {
            return this.f37538b;
        }

        public void setAuthDevice(boolean z) {
            this.f37539c = z;
        }

        public void setAuthProgressResult(boolean z) {
            this.f37538b = z;
        }

        public AuthTask setDevice(BluetoothDevice bluetoothDevice) {
            this.f37537a = bluetoothDevice;
            return this;
        }

        public AuthTask setRandomData(byte[] bArr) {
            this.f37540d = bArr;
            return this;
        }

        public void setRetryNum(int i) {
            this.f37541e = i;
        }

        public String toString() {
            return "AuthTask{device=" + this.f37537a + ", isAuthProgressResult=" + this.f37538b + ", isAuthDevice=" + this.f37539c + ", randomData=" + CHexConver.byte2HexStr(this.f37540d) + ", retryNum=" + this.f37541e + i0XO1.f7442IO;
        }
    }

    public interface IRcspAuthOp {
        boolean sendAuthDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr);
    }

    public interface OnRcspAuthListener {
        void onAuthFailed(BluetoothDevice bluetoothDevice, int i, String str);

        void onAuthSuccess(BluetoothDevice bluetoothDevice);

        void onInitResult(boolean z);
    }

    public RcspAuth(Context context, IRcspAuthOp iRcspAuthOp, OnRcspAuthListener onRcspAuthListener) {
        if (iRcspAuthOp == null) {
            throw new IllegalArgumentException("IRcspAuthOp can not be null.");
        }
        this.mRcspAuthOp = iRcspAuthOp;
        this.mListener = onRcspAuthListener;
        loadLibrariesOnce(null);
        boolean zNativeInit = nativeInit();
        this.isLibInit = zNativeInit;
        onInitResult(zNativeInit);
    }

    private String getErrorMsg(int i) {
        switch (i) {
            case 40977:
                return "Auth device timeout.";
            case 40978:
                return "User stop auth device.";
            case 40979:
                return "Failed to send data.";
            case 40980:
                return "Check auth data error.";
            default:
                return "";
        }
    }

    private byte[] getResetAuthFlagCmdData() {
        return CHexConver.hexStr2Bytes("FEDCBAC00600020001EF");
    }

    private boolean isValidAuthData(byte[] bArr) {
        byte b;
        return (bArr == null || bArr.length == 0 || ((bArr.length != 5 || bArr[0] != 2) && (bArr.length != 17 || ((b = bArr[0]) != 0 && b != 1)))) ? false : true;
    }

    public static void loadLibrariesOnce(JieLiLibLoader jieLiLibLoader) {
        synchronized (RcspAuth.class) {
            try {
                if (!mIsLibLoaded) {
                    if (jieLiLibLoader == null) {
                        jieLiLibLoader = sLocalLibLoader;
                    }
                    jieLiLibLoader.loadLibrary(BluetoothConstant.JL_AUTH);
                    mIsLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAuthFailed(BluetoothDevice bluetoothDevice, int i) {
        onAuthFailed(bluetoothDevice, i, getErrorMsg(i));
    }

    private void onAuthSuccess(BluetoothDevice bluetoothDevice) {
        JL_Log.m27240w(TAG, "onAuthSuccess", CommonUtil.formatString("Device = %s,  auth ok.", bluetoothDevice));
        if (bluetoothDevice != null) {
            this.mAuthTaskMap.remove(bluetoothDevice.getAddress());
        }
        OnRcspAuthListener onRcspAuthListener = this.mListener;
        if (onRcspAuthListener != null) {
            onRcspAuthListener.onAuthSuccess(bluetoothDevice);
        }
    }

    private void onInitResult(final boolean z) {
        if (this.mListener != null) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.bd2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5719IO.mListener.onInitResult(z);
                }
            }, OP_DELAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendAuthDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (bluetoothDevice == null || bArr == null) {
            return false;
        }
        boolean zSendAuthDataToDevice = this.mRcspAuthOp.sendAuthDataToDevice(bluetoothDevice, bArr);
        JL_Log.m27236i(TAG, "sendAuthDataToDevice", CommonUtil.formatString("device : %s, send ---> %s, authData : %s", bluetoothDevice, Boolean.valueOf(zSendAuthDataToDevice), CHexConver.byte2HexStr(bArr)));
        return zSendAuthDataToDevice;
    }

    public static boolean setAuthTimeout(long j) {
        if (j < 500) {
            JL_Log.m27232d(TAG, "setAuthTimeout", CommonUtil.formatString("The set time[%d] cannot be less than the minimum time[%d].", Long.valueOf(j), 500L));
            return false;
        }
        DELAY_AUTH_WAITING_TIME = j;
        return true;
    }

    @Deprecated
    public void addListener(OnRcspAuthListener onRcspAuthListener) {
    }

    public void destroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mAuthTaskMap.clear();
        this.isLibInit = false;
        mIsLibLoaded = false;
    }

    public byte[] getAuthData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return getEncryptedAuthData(bArr);
    }

    public byte[] getAuthOkData() {
        return new byte[]{2, 112, 97, 115, 115};
    }

    public native byte[] getEncryptedAuthData(byte[] bArr);

    public native byte[] getRandomAuthData();

    public byte[] getRandomData() {
        return getRandomAuthData();
    }

    public void handleAuthData(BluetoothDevice bluetoothDevice, byte[] bArr) {
        AuthTask authTask;
        if (bluetoothDevice == null || !this.isLibInit || !isValidAuthData(bArr) || (authTask = this.mAuthTaskMap.get(bluetoothDevice.getAddress())) == null || authTask.isAuthDevice()) {
            return;
        }
        String str = TAG;
        JL_Log.m27232d(str, "handleAuthData", CommonUtil.formatString("Device : %s, data : %s", bluetoothDevice, CHexConver.byte2HexStr(bArr)));
        int i = 40979;
        if (authTask.isAuthProgressResult()) {
            if (bArr.length == 17 && bArr[0] == 0) {
                byte[] authData = getAuthData(bArr);
                i = sendAuthDataToDevice(bluetoothDevice, authData) ? 0 : 40979;
                JL_Log.m27236i(str, "handleAuthData", "send ret : " + i + ", devAuthData : " + CHexConver.byte2HexStr(authData));
            } else {
                byte[] authOkData = getAuthOkData();
                if (bArr.length < authOkData.length) {
                    return;
                }
                int length = authOkData.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                if (!Arrays.equals(bArr2, authOkData)) {
                    return;
                }
                authTask.setAuthDevice(true);
                onAuthSuccess(bluetoothDevice);
                i = 0;
            }
        } else {
            if (bArr.length != 17 || bArr[0] != 1) {
                return;
            }
            byte[] authData2 = getAuthData(authTask.getRandomData());
            if (authData2 == null || !Arrays.equals(authData2, bArr)) {
                JL_Log.m27240w(str, "handleAuthData", "Data not match. authData : " + CHexConver.byte2HexStr(authData2));
                i = 40980;
            } else if (sendAuthDataToDevice(bluetoothDevice, getAuthOkData())) {
                i = 0;
            }
        }
        authTask.setAuthProgressResult(i == 0);
        if (i != 0) {
            authTask.setAuthDevice(false);
            onAuthFailed(bluetoothDevice, i);
            return;
        }
        this.mHandler.removeMessages(17);
        this.mHandler.removeMessages(18);
        if (authTask.isAuthDevice()) {
            return;
        }
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(18, bluetoothDevice), DELAY_AUTH_WAITING_TIME);
    }

    public native boolean nativeInit();

    @Deprecated
    public void removeListener(OnRcspAuthListener onRcspAuthListener) {
    }

    public int setDeviceConnectionLinkKey(byte[] bArr) {
        return setLinkKey(bArr);
    }

    public native int setLinkKey(byte[] bArr);

    public boolean startAuth(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || !this.isLibInit) {
            return false;
        }
        if (this.mAuthTaskMap.containsKey(bluetoothDevice.getAddress())) {
            AuthTask authTask = this.mAuthTaskMap.get(bluetoothDevice.getAddress());
            if (authTask != null && (authTask.isAuthDevice() || this.mHandler.hasMessages(18))) {
                JL_Log.m27236i(TAG, "startAuth", "The device has been certified or certification of device is in progress.");
                return true;
            }
            this.mAuthTaskMap.remove(bluetoothDevice.getAddress());
        }
        JL_Log.m27232d(TAG, "startAuth", "device : " + bluetoothDevice);
        AuthTask randomData = new AuthTask().setDevice(bluetoothDevice).setRandomData(getRandomData());
        this.mAuthTaskMap.put(bluetoothDevice.getAddress(), randomData);
        boolean zSendAuthDataToDevice = sendAuthDataToDevice(bluetoothDevice, getResetAuthFlagCmdData());
        if (zSendAuthDataToDevice) {
            this.mHandler.removeMessages(17);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(17, bluetoothDevice), DELAY_AUTH_WAITING_TIME);
            SystemClock.sleep(OP_DELAY);
            zSendAuthDataToDevice = sendAuthDataToDevice(bluetoothDevice, randomData.getRandomData());
        }
        if (!zSendAuthDataToDevice) {
            onAuthFailed(bluetoothDevice, 40979);
        }
        return zSendAuthDataToDevice;
    }

    public void stopAuth(BluetoothDevice bluetoothDevice) {
        stopAuth(bluetoothDevice, true);
    }

    private void onAuthFailed(BluetoothDevice bluetoothDevice, int i, String str) {
        JL_Log.m27234e(TAG, "onAuthFailed", CommonUtil.formatString("Device = %s,  code = %d, message = %s.", bluetoothDevice, Integer.valueOf(i), str));
        this.mHandler.removeMessages(17);
        this.mHandler.removeMessages(18);
        if (bluetoothDevice != null) {
            this.mAuthTaskMap.remove(bluetoothDevice.getAddress());
        }
        OnRcspAuthListener onRcspAuthListener = this.mListener;
        if (onRcspAuthListener != null) {
            onRcspAuthListener.onAuthFailed(bluetoothDevice, i, str);
        }
    }

    public void stopAuth(BluetoothDevice bluetoothDevice, boolean z) {
        if (bluetoothDevice == null || !this.isLibInit) {
            return;
        }
        AuthTask authTaskRemove = this.mAuthTaskMap.remove(bluetoothDevice.getAddress());
        if (z) {
            if (authTaskRemove != null) {
                onAuthFailed(bluetoothDevice, 40978);
            }
            this.mHandler.removeMessages(17);
            this.mHandler.removeMessages(18);
        }
    }
}
