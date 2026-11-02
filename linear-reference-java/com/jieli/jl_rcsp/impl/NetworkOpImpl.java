package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.a61;
import com.android.mltcode.paycertificationapi.b61;
import com.android.mltcode.paycertificationapi.c61;
import com.android.mltcode.paycertificationapi.y51;
import com.android.mltcode.paycertificationapi.z51;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.network.INetworkOp;
import com.jieli.jl_rcsp.interfaces.network.OnNetworkListener;
import com.jieli.jl_rcsp.interfaces.network.OnNetworkOTACallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkBase;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkFunction;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkOTA;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkOTAState;
import com.jieli.jl_rcsp.model.network.OTAParam;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkOpImpl implements INetworkOp {
    public static long WAITING_END_STATE_TIMEOUT = 240000;
    public static long WAITING_START_STATE_TIMEOUT = 60000;
    public static volatile NetworkOpImpl j = null;
    public static final int k = 4112;
    public final String a;
    public final RcspOpImpl b;
    public final SettingFunctionImpl c;
    public final DataTransferOpImpl d;
    public final CallbackManager e;
    public Param f;
    public final Handler g;
    public final OnRcspCallback h;
    public final OnSettingFunctionListener i;

    public static class CallbackManager extends BaseCallbackManager<OnNetworkListener> implements OnNetworkListener {
        public CallbackManager(Handler r1) {
            super(r1);
        }

        public static /* synthetic */ void a(BluetoothDevice r0, NetworkInfo r1, OnNetworkListener r2) {
            r2.onNetworkInfo(r0, r1);
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkListener
        public void onNetworkInfo(final BluetoothDevice r2, final NetworkInfo r3) {
            callbackEvent(new XO0O10(r2, r3));
        }

        @Override // com.jieli.jl_rcsp.interfaces.network.OnNetworkListener
        public void onNetworkOTAState(final BluetoothDevice r2, final NetworkOTAState r3) {
            callbackEvent(new O00(r2, r3));
        }

        public static /* synthetic */ void a(BluetoothDevice r0, NetworkOTAState r1, OnNetworkListener r2) {
            r2.onNetworkOTAState(r0, r1);
        }
    }

    public static class Param {
        public final BluetoothDevice a;
        public final OnNetworkOTACallback b;
        public byte[] c;
        public boolean d;

        public Param(BluetoothDevice r1, OnNetworkOTACallback r2) {
            this.a = r1;
            this.b = r2;
        }

        public static /* synthetic */ byte[] a(Param r0) {
            return r0.c;
        }

        public static /* synthetic */ OnNetworkOTACallback b(Param r0) {
            return r0.b;
        }

        public static /* synthetic */ BluetoothDevice c(Param r0) {
            return r0.a;
        }

        public OnNetworkOTACallback getCallback() {
            return this.b;
        }

        public BluetoothDevice getDevice() {
            return this.a;
        }

        public byte[] getOtaData() {
            return this.c;
        }

        public boolean isNetworkOTA() {
            return this.d;
        }

        public Param setNetworkOTA(boolean r1) {
            this.d = r1;
            return this;
        }

        public Param setOtaData(byte[] r1) {
            this.c = r1;
            return this;
        }
    }

    static {
    }

    public NetworkOpImpl(RcspOpImpl r4) {
        this.a = getClass().getSimpleName();
        Handler r0 = new Handler(Looper.getMainLooper(), new y51(this));
        this.g = r0;
        OnRcspCallback r1 = new AnonymousClass6(this);
        this.h = r1;
        OnSettingFunctionListener r2 = new AnonymousClass7(this);
        this.i = r2;
        if (r4 == null) goto L7;
        this.b = r4;
        r4.registerOnRcspCallback(r1);
        SettingFunctionImpl r3 = SettingFunctionImpl.instance(r4);
        this.c = r3;
        this.d = DataTransferOpImpl.instance(r4);
        this.e = new CallbackManager(r0);
        r3.addOnSettingFunctionListener(r2);
        return;
    L7:
        throw new NullPointerException("WatchOpImpl can not be null.");
    }

    public static /* synthetic */ RcspOpImpl a(NetworkOpImpl r0) {
        return r0.b;
    }

    public static /* synthetic */ CallbackManager b(NetworkOpImpl r0) {
        return r0.e;
    }

    public static /* synthetic */ Param c(NetworkOpImpl r0) {
        return r0.f;
    }

    public static /* synthetic */ NetworkInfo d(NetworkOpImpl r0) {
        return r0.a();
    }

    public static /* synthetic */ String e(NetworkOpImpl r0) {
        return r0.a;
    }

    public static /* synthetic */ Handler f(NetworkOpImpl r0) {
        return r0.g;
    }

    public static NetworkOpImpl instance(RcspOpImpl r2) {
        if (j != null) goto L16;
        monitor-enter(NetworkOpImpl.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (j != null) goto L11;
        j = new NetworkOpImpl(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(NetworkOpImpl.class);     // Catch: Throwable -> L9
    L16:
        return j;
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void addOnNetworkListener(OnNetworkListener r2) {
        this.e.registerCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void cancelNetworkOTA(BluetoothDevice r1, OnOperationCallback<Boolean> r2) {
        if (r2 == null) goto L5;
        r2.onSuccess(Boolean.FALSE);
        return;
    }

    public void destroy() {
        cancelNetworkOTA(b(), null);
        this.b.unregisterOnRcspCallback(this.h);
        this.c.removeOnSettingFunctionListener(this.i);
        this.c.destroy();
        this.d.destroy();
        this.e.release();
        j = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public boolean isNetworkOTA() {
        Param r0 = this.f;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isNetworkOTA() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void queryNetworkInfo(final BluetoothDevice r6, final OnOperationCallback<Boolean> r7) {
        this.c.settingFunction(r6, new PublicSettingsCmd.Param(new NetworkFunction(0, new NetworkBase(0))), new AnonymousClass1(this, r7, r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void removeOnNetworkListener(OnNetworkListener r2) {
        this.e.unregisterCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.network.INetworkOp
    public void startNetworkOTA(BluetoothDevice r2, OTAParam r3, OnNetworkOTACallback r4) {
        if (isNetworkOTA() == false) goto L7;
        if (r4 == null) goto L18;
        r4.onError(4352, WatchError.getErrorDesc(4352));
        return;
    L18:
        return;
    L7:
        this.f = new Param(r2, r4).setNetworkOTA(true);
        if (r4 == null) goto L11;
        r4.onStart();
    L11:
        if (r3.getOtaData() != null) goto L13;
    L16:
        b(r3.getOtaFilePath(), new AnonymousClass2(this));
        return;
    L13:
        if (r3.getOtaData().length <= 0) goto L16;
        this.f.setOtaData(r3.getOtaData());
        b(this.f.getOtaData().length);
    }

    public static /* synthetic */ void a(NetworkOpImpl r0, int r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void b(NetworkOpImpl r0, int r1) {
        r0.b(r1);
    }

    public static /* synthetic */ void a(NetworkOpImpl r0, byte[] r1) {
        r0.a(r1);
    }

    public final BluetoothDevice b() {
        return this.b.getConnectedDevice();
    }

    public static /* synthetic */ void a(NetworkOpImpl r0, int r1, String r2) {
        r0.a(r1, r2);
    }

    public final void b(final String r3, final OnOperationCallback<byte[]> r4) {
        new Thread(new c61(this, r3, r4)).start();
    }

    public final /* synthetic */ boolean a(Message r2) {
        if (4112 != r2.what) goto L7;
        a(WatchError.ERR_NETWORK_OTA_WAITING_COMMAND_TIMEOUT);
        return true;
    L7:
        return true;
    }

    public final void b(int r3) {
        if (isNetworkOTA() == true) goto L5;
        return;
    L5:
        a(Param.c(this.f), r3, new AnonymousClass3(this));
    }

    public final NetworkInfo a() {
        DeviceInfo r0 = this.b.getDeviceInfo();
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getNetworkInfo();
    }

    public final void a(int r2) {
        a(r2, WatchError.getErrorDesc(r2));
    }

    public final void a(int r3, String r4) {
        if (isNetworkOTA() == false) goto L14;
        this.g.removeMessages(4112);
        this.f.setNetworkOTA(false);
        OnNetworkOTACallback r0 = Param.b(this.f);
        if (r0 != null) goto L8;
        return;
    L8:
        if (r3 != 4098) goto L11;
        r0.onCancel();
        return;
    L11:
        r0.onError(r3, r4);
        return;
    }

    public final /* synthetic */ void a(final String r6, final OnOperationCallback r7) {
        File r0 = new File(r6);
        if (r0.exists() == true) goto L5;
    L21:
        this.g.post(new b61(r7, r6));
        return;
    L5:
        if (r0.isFile() == false) goto L21;
        if (r0.length() == 0) goto L21;
        FileInputStream r8 = new FileInputStream(r0);     // Catch: IOException -> L13
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();     // Catch: IOException -> L13
        byte[] r2 = new byte[4096];     // Catch: IOException -> L13
    L10:
        int r3 = r8.read(r2);     // Catch: IOException -> L13
        if (r3 <= 0) goto L16;
        r1.write(r2, 0, r3);     // Catch: IOException -> L13
    L16:
        if (r3 != (-1)) goto L10;
        r8.close();     // Catch: IOException -> L13
        final byte[] r9 = r1.toByteArray();     // Catch: IOException -> L13
        this.g.post(new z51(r7, r9));     // Catch: IOException -> L13
        r1.close();     // Catch: IOException -> L13
        return;
    L13:
        e = move-exception;
        e.printStackTrace();
        this.g.post(new a61(r7, e));
    }

    public static /* synthetic */ void a(OnOperationCallback r4, String r5) {
        if (r4 == null) goto L5;
        r4.onFailed(new BaseError(4097, WatchError.getErrorDesc(4097) + " Error Path : " + r5));
        return;
    }

    public static /* synthetic */ void a(OnOperationCallback r0, byte[] r1) {
        if (r0 == null) goto L5;
        r0.onSuccess(r1);
        return;
    }

    public static /* synthetic */ void a(OnOperationCallback r4, IOException r5) {
        if (r4 == null) goto L5;
        r4.onFailed(new BaseError(16389, WatchError.getErrorDesc(16389) + ", " + r5.getMessage()));
        return;
    }

    public final void a(byte[] r9) {
        if (isNetworkOTA() == true) goto L5;
        return;
    L5:
        final OnNetworkOTACallback r0 = Param.b(this.f);
        this.d.sendLargeData(new SendParams(7, 0, 4096, 4096, r9), new AnonymousClass4(this, r0));
    }

    public final void a(BluetoothDevice r5, int r6, final OnOperationCallback<Boolean> r7) {
        this.c.settingFunction(r5, new PublicSettingsCmd.Param(new NetworkFunction(1, new NetworkOTA(r6))), new AnonymousClass5(this, r7));
    }
}
