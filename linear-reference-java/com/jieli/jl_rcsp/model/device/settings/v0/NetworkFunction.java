package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkFunction extends SettingFunction {
    public NetworkBase networkBase;

    public NetworkFunction(byte[] r1) {
        super(r1);
    }

    public NetworkBase getNetworkBase() {
        return this.networkBase;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r4) {
        int r5 = super.parse(r4);
        if (r5 <= 0) goto L15;
        byte[] r0 = getPayload();
        if (r0.length == 0) goto L15;
        if (getOp() != 1) goto L12;
        this.networkBase = new NetworkOTA(r0);
        return r5;
    L12:
        NetworkBase r1 = new NetworkBase(r0);
        this.networkBase = r1;
        int r2 = r1.getType();
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L15;
        this.networkBase = new NetworkOTAState(r0);
        return r5;
    L18:
        this.networkBase = new NetworkInfo(r0);
        return r5;
    L15:
        return r5;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData
    public String toString() {
        return "NetworkFunction{networkBase=" + this.networkBase + i0XO1.IO;
    }

    public NetworkFunction(int r4, NetworkBase r5) {
        if (r5 != null) goto L5;
        byte[] r1 = new byte[0];
    L6:
        super(5, 0, r4, r1);
        this.networkBase = r5;
        return;
    L5:
        r1 = r5.toData();
        goto L6
    }

    public NetworkFunction(Parcel r2) {
        super(r2);
        this.networkBase = (NetworkBase) r2.readParcelable(NetworkBase.class.getClassLoader());
    }
}
