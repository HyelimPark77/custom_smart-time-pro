package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.setting.ISettingFunction;
import com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;

/* JADX INFO: loaded from: classes17.dex */
public class SettingFunctionImpl implements ISettingFunction {
    public static volatile SettingFunctionImpl e;
    public final String a;
    public final RcspOpImpl b;
    public final CallbackManager c;
    public final OnRcspCallback d;

    public static class CallbackManager extends BaseCallbackManager<OnSettingFunctionListener> implements OnSettingFunctionListener {
        public CallbackManager() {
        }

        public static /* synthetic */ void a(BluetoothDevice r0, SettingData r1, OnSettingFunctionListener r2) {
            r2.onSettingData(r0, r1);
        }

        @Override // com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener
        public void onSettingData(final BluetoothDevice r2, final SettingData r3) {
            callbackEvent(new OIi0(r2, r3));
        }

        @Override // com.jieli.jl_rcsp.interfaces.setting.OnSettingFunctionListener
        public void onSettingFunction(final BluetoothDevice r2, final SettingFunction r3) {
            callbackEvent(new I0IIOi(r2, r3));
        }

        public /* synthetic */ CallbackManager(AnonymousClass1 r1) {
            this();
        }

        public static /* synthetic */ void a(BluetoothDevice r0, SettingFunction r1, OnSettingFunctionListener r2) {
            r2.onSettingFunction(r0, r1);
        }
    }

    public SettingFunctionImpl(RcspOpImpl r3) {
        this.a = SettingFunctionImpl.class.getSimpleName();
        this.c = new CallbackManager(null);
        OnRcspCallback r0 = new AnonymousClass2(this);
        this.d = r0;
        if (r3 == null) goto L7;
        this.b = r3;
        r3.registerOnRcspCallback(r0);
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    public static /* synthetic */ CallbackManager a(SettingFunctionImpl r0) {
        return r0.c;
    }

    public static /* synthetic */ String b(SettingFunctionImpl r0) {
        return r0.a;
    }

    public static /* synthetic */ RcspOpImpl c(SettingFunctionImpl r0) {
        return r0.b;
    }

    public static SettingFunctionImpl instance(RcspOpImpl r2) {
        if (e != null) goto L16;
        monitor-enter(SettingFunctionImpl.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (e != null) goto L11;
        e = new SettingFunctionImpl(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(SettingFunctionImpl.class);     // Catch: Throwable -> L9
    L16:
        return e;
    }

    @Override // com.jieli.jl_rcsp.interfaces.setting.ISettingFunction
    public void addOnSettingFunctionListener(OnSettingFunctionListener r2) {
        this.c.registerCallback(r2);
    }

    public void destroy() {
        this.b.unregisterOnRcspCallback(this.d);
        this.c.release();
        e = null;
    }

    public RcspOpImpl getRcspOp() {
        return this.b;
    }

    @Override // com.jieli.jl_rcsp.interfaces.setting.ISettingFunction
    public void removeOnSettingFunctionListener(OnSettingFunctionListener r2) {
        this.c.unregisterCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.setting.ISettingFunction
    public void settingFunction(BluetoothDevice r5, PublicSettingsCmd.Param r6, OnOperationCallback<PublicSettingsCmd.Response> r7) {
        this.b.sendRcspCommand(r5, new PublicSettingsCmd(r6), new CustomRcspActionCallback("settingFunction", r7, new AnonymousClass1(this)));
    }
}
