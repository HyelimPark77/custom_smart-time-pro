package com.jieli.jl_bt_ota.impl.bt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.ironsource.C2985d4;
import com.ironsource.Z3;
import com.jieli.jl_bt_ota.interfaces.bt.OnBtAssistantCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.tool.callback.BtAssistantCallbackManager;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
class BluetoothBase {
    protected static final int OPERATION_TIMEOUT = 6000;
    protected String TAG;
    private BluetoothAdapterReceiver a;
    private BluetoothOTAConfigure b;
    protected final BluetoothAdapter mBluetoothAdapter;
    protected final BtAssistantCallbackManager mCallbackManager;
    protected final Context mContext;
    protected final boolean mHasBle;
    protected final Handler mUIHandler;

    /* JADX INFO: renamed from: com.jieli.jl_bt_ota.impl.bt.BluetoothBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public class BluetoothAdapterReceiver extends BroadcastReceiver {
        final /* synthetic */ BluetoothBase a;

        private BluetoothAdapterReceiver(BluetoothBase r1) {
            this.a = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context r4, Intent r5) {
            if (r5 != null) goto L5;
            return;
        L5:
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(r5.getAction()) == false) goto L20;
            int r6 = r5.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            int r7 = r5.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (r7 == (-1)) goto L23;
            JL_Log.i(this.a.TAG, "ACTION_STATE_CHANGED", "state : " + r7 + ", prevState : " + r6);
            if (r6 != r7) goto L13;
            return;
        L13:
            if (10 != r7) goto L17;
            this.a.onAdapterStatus(false);
            return;
        L17:
            if (12 != r7) goto L21;
            this.a.onAdapterStatus(true);
            return;
        L21:
            return;
        L23:
            return;
        }

        public /* synthetic */ BluetoothAdapterReceiver(BluetoothBase r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public BluetoothBase(Context r4) {
        this.TAG = getClass().getSimpleName();
        this.mUIHandler = new Handler(Looper.getMainLooper(), new OXO1(this));
        this.mContext = (Context) CommonUtil.checkNotNull(r4, "Context can not be null.");
        CommonUtil.setMainContext(r4);
        this.mHasBle = BluetoothUtil.hasBle(r4);
        this.mCallbackManager = new BtAssistantCallbackManager();
        this.b = BluetoothOTAConfigure.createDefault();
        BluetoothManager r5 = (BluetoothManager) r4.getSystemService(Z3.d);
        if (r5 == null) goto L5;
        BluetoothAdapter r6 = r5.getAdapter();
    L6:
        if (r6 != null) goto L8;
        r6 = BluetoothAdapter.getDefaultAdapter();
    L8:
        this.mBluetoothAdapter = r6;
        a();
        JL_Log.i(this.TAG, C2985d4.a.f, "clazz : " + this);
        return;
    L5:
        r6 = null;
        goto L6
    }

    private void a() {
        if (this.a == null) goto L5;
        return;
    L5:
        if (this.mContext == null) goto L9;
        this.a = new BluetoothAdapterReceiver(this, null);
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.mContext.registerReceiver(this.a, r0);
        return;
    }

    private void b() {
        BluetoothAdapterReceiver r0 = this.a;
        if (r0 == null) goto L8;
        Context r1 = this.mContext;
        if (r1 == null) goto L9;
        r1.unregisterReceiver(r0);
        this.a = null;
        return;
    L9:
        return;
    }

    public void addOnBtAssistantCallback(OnBtAssistantCallback r2) {
        this.mCallbackManager.addCallback(r2);
    }

    public void configure(BluetoothOTAConfigure r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        this.b = r1;
    }

    public void executeTimeoutTask(int r4, BluetoothDevice r5, long r6) {
        removeTimeoutTask(r4);
        if (r6 >= 0) goto L5;
        r6 = 0;
    L5:
        if (r5 != null) goto L8;
        this.mUIHandler.sendEmptyMessageDelayed(r4, r6);
        return;
    L8:
        Handler r0 = this.mUIHandler;
        r0.sendMessageDelayed(r0.obtainMessage(r4, r5), r6);
    }

    public BluetoothOTAConfigure getBluetoothOption() {
        return this.b;
    }

    public boolean handleMessageEvent(@NonNull Message r1) {
        return true;
    }

    public boolean isBluetoothEnable() {
        BluetoothAdapter r0 = this.mBluetoothAdapter;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isEnabled() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isHasTimeoutTask(int r2) {
        return this.mUIHandler.hasMessages(r2);
    }

    public boolean isInvalidEnv(String r3, BluetoothDevice r4) {
        if (CommonUtil.checkHasConnectPermission(this.mContext) == true) goto L6;
        JL_Log.w(this.TAG, r3, "Missing connect permissions.");
        return true;
    L6:
        if (r4 != null) goto L10;
        JL_Log.w(this.TAG, r3, "Device is null.");
        return true;
    L10:
        if (BluetoothUtil.isBluetoothEnable() == true) goto L13;
        JL_Log.w(this.TAG, r3, "Bluetooth is off.");
        return true;
    L13:
        return false;
    }

    public void onAdapterStatus(boolean r3) {
        this.mCallbackManager.onAdapterStatus(r3, this.mHasBle);
    }

    public String printBtDeviceInfo(BluetoothDevice r2) {
        return printBtDeviceInfo(r2, true);
    }

    public void release() {
        b();
        this.mUIHandler.removeCallbacksAndMessages(null);
        this.mCallbackManager.release();
        JL_Log.i(this.TAG, "release", "clazz : " + this);
    }

    public void removeOnBtAssistantCallback(OnBtAssistantCallback r2) {
        this.mCallbackManager.removeCallback(r2);
    }

    public void removeTimeoutTask(int r2) {
        this.mUIHandler.removeMessages(r2);
    }

    public void runOnMainThread(Runnable r5) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) goto L8;
        r5.run();
        return;
    L8:
        this.mUIHandler.post(r5);
    }

    public String printBtDeviceInfo(BluetoothDevice r2, boolean r3) {
        return BluetoothUtil.printBtDeviceInfo(this.mContext, r2, r3);
    }
}
