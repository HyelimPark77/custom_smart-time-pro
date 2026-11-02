package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FlashlightSetting extends SettingFunction {
    public static final Parcelable.Creator<FlashlightSetting> CREATOR = null;
    private int value;

    static {
        CREATOR = new AnonymousClass1();
    }

    public FlashlightSetting(byte[] r1) {
        super(r1);
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r3) {
        int r4 = super.parse(r3);
        if (r4 == 0) goto L7;
        byte[] r0 = getPayload();
        if (r0.length == 0) goto L7;
        this.value = CHexConver.byteToInt(r0[0]);
        return r4;
    L7:
        return r4;
    }

    @Override // com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction, com.jieli.jl_rcsp.model.device.settings.SettingData, android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.value);
    }

    public FlashlightSetting(int r4, Integer r5) {
        if (r5 != null) goto L5;
        byte[] r1 = new byte[0];
    L6:
        super(2, 0, r4, r1);
        if (r5 == null) goto L10;
        this.value = r5.intValue();
        return;
    L10:
        return;
    L5:
        r1 = new byte[]{CHexConver.intToByte(r5.intValue())};
        goto L6
    }

    public FlashlightSetting(Parcel r1) {
        super(r1);
        this.value = r1.readInt();
    }
}
