package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes17.dex */
public class BoundDeviceState extends SettingFunction {
    public static final Parcelable.Creator<BoundDeviceState> CREATOR = null;
    public static final int STATE_CONNECTED = 1;
    public static final int STATE_CONNECTING = 2;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_UNCONNECTABLE = 255;
    public static final int TYPE_CHARGING_CASE = 2;
    public static final int TYPE_TWS_HEADSET = 1;
    private DeviceState state;

    static {
        CREATOR = new AnonymousClass1();
    }

    public BoundDeviceState(byte[] r1) {
        super(r1);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DeviceState getState() {
        return this.state;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r3) {
        int r4 = super.parse(r3);
        if (r4 == 0) goto L7;
        byte[] r0 = getPayload();
        if (r0.length == 0) goto L7;
        this.state = new DeviceState(r0);
        return r4;
    L7:
        return r4;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeParcelable(this.state, r3);
    }

    public BoundDeviceState(int r3, DeviceState r4) {
        if (r4 != null) goto L5;
        byte[] r5 = new byte[0];
    L6:
        super(3, 0, r3, r5);
        return;
    L5:
        r5 = r4.toData();
        goto L6
    }

    public BoundDeviceState(Parcel r2) {
        super(r2);
        this.state = (DeviceState) r2.readParcelable(DeviceState.class.getClassLoader());
    }
}
