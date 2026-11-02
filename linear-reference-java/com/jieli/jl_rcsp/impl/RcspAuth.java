package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.android.mltcode.paycertificationapi.ad2;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.constant.RcspConstant;
import com.jieli.jl_rcsp.interfaces.listener.LibLoader;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class RcspAuth {
    private static final int AUTH_RETRY_COUNT = 2;
    private static final long DEFAULT_AUTH_TIMEOUT = 3000;
    private static long DELAY_AUTH_WAITING_TIME = 3000;
    public static final int ERR_AUTH_DATA_CHECK = 40980;
    public static final int ERR_AUTH_DATA_SEND = 40979;
    public static final int ERR_AUTH_DEVICE_TIMEOUT = 40977;
    public static final int ERR_AUTH_USER_STOP = 40978;
    public static final int ERR_NONE = 0;
    private static final int MSG_AUTH_DEVICE_TIMEOUT = 18;
    private static final int MSG_SEND_AUTH_DATA_TIMEOUT = 17;
    private static final String TAG = "RcspAuth";
    private static volatile boolean mIsLibLoaded = false;
    public static final LibLoader sLocalLibLoader = null;
    private boolean isLibInit;
    private final Map<String, AuthTask> mAuthTaskMap;
    private final Handler mHandler;
    private final OnRcspAuthListener mListener;
    private final IRcspAuthOp mRcspAuthOp;

    public static class AuthTask {
        public BluetoothDevice a;
        public boolean b;
        public boolean c;
        public byte[] d;
        public int e;

        public AuthTask() {
        }

        public BluetoothDevice getDevice() {
            return this.a;
        }

        public byte[] getRandomData() {
            return this.d;
        }

        public int getRetryNum() {
            return this.e;
        }

        public boolean isAuthDevice() {
            return this.c;
        }

        public boolean isAuthProgressResult() {
            return this.b;
        }

        public void setAuthDevice(boolean r1) {
            this.c = r1;
        }

        public void setAuthProgressResult(boolean r1) {
            this.b = r1;
        }

        public AuthTask setDevice(BluetoothDevice r1) {
            this.a = r1;
            return this;
        }

        public AuthTask setRandomData(byte[] r1) {
            this.d = r1;
            return this;
        }

        public void setRetryNum(int r1) {
            this.e = r1;
        }

        public String toString() {
            return "AuthTask{device=" + this.a + ", isAuthProgressResult=" + this.b + ", isAuthDevice=" + this.c + ", randomData=" + CHexConver.byte2HexStr(this.d) + ", retryNum=" + this.e + i0XO1.IO;
        }

        public /* synthetic */ AuthTask(AnonymousClass1 r1) {
            this();
        }
    }

    public interface IRcspAuthOp {
        boolean sendAuthDataToDevice(BluetoothDevice r1, byte[] r2);
    }

    public interface OnRcspAuthListener {
        void onAuthFailed(BluetoothDevice r1, int r2, String r3);

        void onAuthSuccess(BluetoothDevice r1);

        void onInitResult(boolean r1);
    }

    static {
        sLocalLibLoader = new ad2();
    }

    public RcspAuth(IRcspAuthOp r4, OnRcspAuthListener r5) {
        this.mAuthTaskMap = Collections.synchronizedMap(new HashMap());
        this.mHandler = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        if (r4 == null) goto L7;
        this.mRcspAuthOp = r4;
        this.mListener = r5;
        loadLibrariesOnce(null);
        boolean r6 = nativeInit();
        this.isLibInit = r6;
        onInitResult(r6);
        return;
    L7:
        throw new IllegalArgumentException("IRcspAuthOp can not be null.");
    }

    public static /* synthetic */ void OXO1(RcspAuth r2, BluetoothDevice r3, AuthTask r4) {
        if (r2.mRcspAuthOp.sendAuthDataToDevice(r3, r4.getRandomData()) == false) goto L6;
        r2.mHandler.removeMessages(17);
        Handler r5 = r2.mHandler;
        r5.sendMessageDelayed(r5.obtainMessage(17, r3), DELAY_AUTH_WAITING_TIME);
        return;
    L6:
        r2.onAuthFailed(r3, 40979, "Failed to send data.");
    }

    public static /* synthetic */ Map access$000(RcspAuth r0) {
        return r0.mAuthTaskMap;
    }

    public static /* synthetic */ IRcspAuthOp access$100(RcspAuth r0) {
        return r0.mRcspAuthOp;
    }

    public static /* synthetic */ Handler access$200(RcspAuth r0) {
        return r0.mHandler;
    }

    public static /* synthetic */ long access$300() {
        return DELAY_AUTH_WAITING_TIME;
    }

    public static /* synthetic */ void access$400(RcspAuth r0, BluetoothDevice r1, int r2) {
        r0.onAuthFailed(r1, r2);
    }

    private String getErrorMsg(int r1) {
        switch(r1) {
            case 40977: goto L11;
            case 40978: goto L9;
            case 40979: goto L7;
            case 40980: goto L5;
            default: goto L3;
        };
    L3:
        return "";
    L5:
        return "Check auth data error.";
    L7:
        return "Failed to send data.";
    L9:
        return "User stop auth device.";
    L11:
        return "Auth device timeout.";
    }

    private byte[] getResetAuthFlagCmdData() {
        return CHexConver.hexStr2Bytes("FEDCBAC00600020001EF");
    }

    private boolean isValidAuthData(byte[] r5) {
        if (r5 != null) goto L5;
    L17:
        return false;
    L5:
        if (r5.length == 0) goto L17;
        if (r5.length != 5) goto L12;
        if (r5[0] != 2) goto L12;
    L16:
        return true;
    L12:
        if (r5.length != 17) goto L17;
        byte r6 = r5[0];
        if (r6 == 0) goto L16;
        if (r6 != 1) goto L17;
        goto L16
    }

    public static void loadLibrariesOnce(LibLoader r2) {
        monitor-enter(RcspAuth.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (mIsLibLoaded == true) goto L11;
        if (r2 != null) goto L10;
        r2 = sLocalLibLoader;     // Catch: Throwable -> L8
    L10:
        r2.loadLibrary(RcspConstant.JL_RCSP_LIB);     // Catch: Throwable -> L8
        mIsLibLoaded = true;     // Catch: Throwable -> L8
    L11:
        monitor-exit(RcspAuth.class);     // Catch: Throwable -> L8
    }

    private void onAuthFailed(BluetoothDevice r2, int r3) {
        onAuthFailed(r2, r3, getErrorMsg(r3));
    }

    private void onAuthSuccess(BluetoothDevice r4) {
        JL_Log.w(TAG, "onAuthSuccess", RcspUtil.formatString("device = %s, auth ok.", new Object[]{r4}));
        if (r4 == null) goto L5;
        this.mAuthTaskMap.remove(r4.getAddress());
    L5:
        OnRcspAuthListener r0 = this.mListener;
        if (r0 == null) goto L9;
        r0.onAuthSuccess(r4);
        return;
    }

    private void onInitResult(boolean r2) {
        OnRcspAuthListener r0 = this.mListener;
        if (r0 == null) goto L6;
        r0.onInitResult(r2);
        return;
    }

    public static boolean setAuthTimeout(long r3) {
        if (r3 >= 3000) goto L6;
        JL_Log.d(TAG, "setAuthTimeout", "The timeout is too short to be set successfully.  timeout : " + r3);
        return false;
    L6:
        DELAY_AUTH_WAITING_TIME = r3;
        return true;
    }

    @Deprecated
    public void addListener(OnRcspAuthListener r1) {
    }

    public void destroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mAuthTaskMap.clear();
        this.isLibInit = false;
        mIsLibLoaded = false;
    }

    public byte[] getAuthData(byte[] r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return getEncryptedAuthData(r1);
    }

    public byte[] getAuthOkData() {
        return new byte[]{2, 112, 97, 115, 115};
    }

    public native byte[] getEncryptedAuthData(byte[] r1);

    public native byte[] getRandomAuthData();

    public byte[] getRandomData() {
        return getRandomAuthData();
    }

    public void handleAuthData(BluetoothDevice r9, byte[] r10) {
        if (r9 != null) goto L4;
        return;
    L4:
        if (this.isLibInit == true) goto L6;
        return;
    L6:
        if (isValidAuthData(r10) == false) goto L56;
        AuthTask r0 = this.mAuthTaskMap.get(r9.getAddress());
        if (r0 != null) goto L11;
        return;
    L11:
        if (r0.isAuthDevice() == true) goto L57;
        String r1 = TAG;
        JL_Log.d(r1, "handleAuthData", RcspUtil.formatString("Device : %s, data : %s", new Object[]{r9, CHexConver.byte2HexStr(r10)}));
        boolean r4 = true;
        if (r0.isAuthProgressResult() == true) goto L29;
        if (r10.length == 17) goto L18;
        return;
    L18:
        if (r10[0] != 1) goto L58;
        byte[] r2 = getAuthData(r0.getRandomData());
        if (r2 != null) goto L23;
    L27:
        JL_Log.w(r1, "handleAuthData", "Data not match. authData : " + CHexConver.byte2HexStr(r2));
        int r11 = 40980;
    L39:
        if (r11 == 0) goto L42;
        r4 = false;
    L42:
        r0.setAuthProgressResult(r4);
        if (r11 == 0) goto L46;
        r0.setAuthDevice(false);
        onAuthFailed(r9, r11, getErrorMsg(r11));
        return;
    L46:
        this.mHandler.removeMessages(17);
        this.mHandler.removeMessages(18);
        if (r0.isAuthDevice() == true) goto L55;
        Handler r12 = this.mHandler;
        r12.sendMessageDelayed(r12.obtainMessage(18, r9), DELAY_AUTH_WAITING_TIME);
        return;
    L55:
        return;
    L23:
        if (Arrays.equals(r2, r10) == false) goto L27;
        if (this.mRcspAuthOp.sendAuthDataToDevice(r9, getAuthOkData()) == true) goto L34;
    L35:
        r11 = 40979;
    L34:
        r11 = 0;
        goto L39
    L58:
        return;
    L29:
        if (r10.length != 17) goto L37;
        if (r10[0] != 0) goto L37;
        byte[] r13 = getAuthData(r10);
        JL_Log.i(r1, "handleAuthData", "devAuthData : " + CHexConver.byte2HexStr(r13));
        if (this.mRcspAuthOp.sendAuthDataToDevice(r9, r13) == false) goto L35;
    L37:
        if (Arrays.equals(r10, getAuthOkData()) == false) goto L54;
        r0.setAuthDevice(true);
        onAuthSuccess(r9);
        goto L34
    L54:
        return;
    L57:
        return;
    }

    public native boolean nativeInit();

    @Deprecated
    public void removeListener(OnRcspAuthListener r1) {
    }

    public int setDeviceConnectionLinkKey(byte[] r1) {
        return setLinkKey(r1);
    }

    public native int setLinkKey(byte[] r1);

    public boolean startAuth(final BluetoothDevice r7) {
        if (r7 != null) goto L4;
        return false;
    L4:
        if (this.isLibInit == true) goto L7;
        return false;
    L7:
        if (this.mAuthTaskMap.containsKey(r7.getAddress()) == false) goto L17;
        AuthTask r0 = this.mAuthTaskMap.get(r7.getAddress());
        if (r0 != null) goto L11;
    L16:
        this.mAuthTaskMap.remove(r7.getAddress());
        goto L17
    L11:
        if (r0.isAuthDevice() == false) goto L13;
    L14:
        JL_Log.i(TAG, "startAuth", "The device has been certified or certification of device is in progress.");
        return true;
    L13:
        if (this.mHandler.hasMessages(18) == false) goto L16;
    L17:
        JL_Log.d(TAG, "startAuth", "device : " + RcspUtil.printBtDeviceInfo(r7));
        final AuthTask r1 = new AuthTask(null).setDevice(r7).setRandomData(getRandomData());
        this.mAuthTaskMap.put(r7.getAddress(), r1);
        boolean r2 = this.mRcspAuthOp.sendAuthDataToDevice(r7, getResetAuthFlagCmdData());
        if (r2 == false) goto L20;
        this.mHandler.postDelayed(new IiI10X(this, r7, r1), 500);
    L20:
        return r2;
    }

    public void stopAuth(BluetoothDevice r2) {
        stopAuth(r2, true);
    }

    private void onAuthFailed(BluetoothDevice r4, int r5, String r6) {
        JL_Log.e(TAG, "onAuthFailed", RcspUtil.formatString("Device = %s, code = %d, message = %s.", new Object[]{r4, Integer.valueOf(r5), r6}));
        this.mHandler.removeMessages(17);
        this.mHandler.removeMessages(18);
        if (r4 == null) goto L5;
        this.mAuthTaskMap.remove(r4.getAddress());
    L5:
        OnRcspAuthListener r0 = this.mListener;
        if (r0 == null) goto L9;
        r0.onAuthFailed(r4, r5, r6);
        return;
    }

    public void stopAuth(BluetoothDevice r3, boolean r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (this.isLibInit == false) goto L14;
        AuthTask r0 = this.mAuthTaskMap.remove(r3.getAddress());
        if (r4 == false) goto L15;
        if (r0 == null) goto L11;
        onAuthFailed(r3, 40978);
    L11:
        this.mHandler.removeMessages(17);
        this.mHandler.removeMessages(18);
        return;
    L15:
        return;
    }
}
