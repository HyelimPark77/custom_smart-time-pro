package com.jieli.jl_rcsp.tool.callback;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.cd2;
import com.android.mltcode.paycertificationapi.dd2;
import com.android.mltcode.paycertificationapi.ed2;
import com.android.mltcode.paycertificationapi.fd2;
import com.android.mltcode.paycertificationapi.gd2;
import com.android.mltcode.paycertificationapi.hd2;
import com.android.mltcode.paycertificationapi.id2;
import com.android.mltcode.paycertificationapi.jd2;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public class RcspCallbackManager extends BaseCallbackManager<OnRcspCallback> {
    public RcspCallbackManager() {
    }

    public static /* synthetic */ void a(BluetoothDevice r0, boolean r1, OnRcspCallback r2) {
        r2.onRcspInit(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, CommandBase r1, OnRcspCallback r2) {
        r2.onRcspDataCmd(r0, r1);
    }

    public void onConnectStateChange(final BluetoothDevice r2, final int r3) {
        callbackEvent(new id2(r2, r3));
    }

    public void onMandatoryUpgrade(final BluetoothDevice r2) {
        callbackEvent(new dd2(r2));
    }

    public void onPutDataToDataHandler(final BluetoothDevice r2, final byte[] r3) {
        callbackEvent(new hd2(r2, r3));
    }

    public void onRcspCommand(final BluetoothDevice r2, final CommandBase r3) {
        callbackEvent(new ed2(r2, r3));
    }

    public void onRcspDataCmd(final BluetoothDevice r2, final CommandBase r3) {
        callbackEvent(new fd2(r2, r3));
    }

    public void onRcspError(final BluetoothDevice r2, final BaseError r3) {
        callbackEvent(new cd2(r2, r3));
    }

    public void onRcspInit(final BluetoothDevice r2, final boolean r3) {
        callbackEvent(new gd2(r2, r3));
    }

    public void onSwitchConnectedDevice(final BluetoothDevice r2) {
        callbackEvent(new jd2(r2));
    }

    public static /* synthetic */ void a(BluetoothDevice r0, CommandBase r1, OnRcspCallback r2) {
        r2.onRcspCommand(r0, r1);
    }

    public static /* synthetic */ void b(BluetoothDevice r0, OnRcspCallback r1) {
        r1.onSwitchConnectedDevice(r0);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, BaseError r1, OnRcspCallback r2) {
        r2.onRcspError(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, OnRcspCallback r1) {
        r1.onMandatoryUpgrade(r0);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, int r1, OnRcspCallback r2) {
        r2.onConnectStateChange(r0, r1);
    }

    public static /* synthetic */ void a(BluetoothDevice r0, byte[] r1, OnRcspCallback r2) {
        r2.onPutDataToDataHandler(r0, r1);
    }
}
