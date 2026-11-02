package com.jieli.jl_rcsp.model.device.settings.p201v0;

import android.os.Parcel;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class NetworkFunction extends SettingFunction {
    public NetworkBase networkBase;

    public NetworkFunction(byte[] bArr) {
        super(bArr);
    }

    public NetworkBase getNetworkBase() {
        return this.networkBase;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.p201v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] bArr) {
        int i = super.parse(bArr);
        if (i > 0) {
            byte[] payload = getPayload();
            if (payload.length != 0) {
                if (getOp() == 1) {
                    this.networkBase = new NetworkOTA(payload);
                    return i;
                }
                NetworkBase networkBase = new NetworkBase(payload);
                this.networkBase = networkBase;
                int type = networkBase.getType();
                if (type == 0) {
                    this.networkBase = new NetworkInfo(payload);
                    return i;
                }
                if (type == 1) {
                    this.networkBase = new NetworkOTAState(payload);
                    return i;
                }
            }
        }
        return i;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.p201v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData
    public String toString() {
        return "NetworkFunction{networkBase=" + this.networkBase + i0XO1.f7442IO;
    }

    public NetworkFunction(int i, NetworkBase networkBase) {
        super(5, 0, i, networkBase == null ? new byte[0] : networkBase.toData());
        this.networkBase = networkBase;
    }

    public NetworkFunction(Parcel parcel) {
        super(parcel);
        this.networkBase = (NetworkBase) parcel.readParcelable(NetworkBase.class.getClassLoader());
    }
}
