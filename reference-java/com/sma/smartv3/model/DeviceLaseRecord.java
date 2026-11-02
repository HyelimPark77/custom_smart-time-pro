package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceLaseRecord {

    @aa1
    private String bleName;

    @aa1
    private String bleVersion;

    @aa1
    private String flag;

    @aa1
    private String mac;

    public DeviceLaseRecord() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DeviceLaseRecord copy$default(DeviceLaseRecord deviceLaseRecord, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceLaseRecord.bleName;
        }
        if ((i & 2) != 0) {
            str2 = deviceLaseRecord.flag;
        }
        if ((i & 4) != 0) {
            str3 = deviceLaseRecord.bleVersion;
        }
        if ((i & 8) != 0) {
            str4 = deviceLaseRecord.mac;
        }
        return deviceLaseRecord.copy(str, str2, str3, str4);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final String component2() {
        return this.flag;
    }

    @aa1
    public final String component3() {
        return this.bleVersion;
    }

    @aa1
    public final String component4() {
        return this.mac;
    }

    @aa1
    public final DeviceLaseRecord copy(@aa1 String bleName, @aa1 String flag, @aa1 String bleVersion, @aa1 String mac) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(bleVersion, "bleVersion");
        Intrinsics.X0O(mac, "mac");
        return new DeviceLaseRecord(bleName, flag, bleVersion, mac);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceLaseRecord)) {
            return false;
        }
        DeviceLaseRecord deviceLaseRecord = (DeviceLaseRecord) obj;
        return Intrinsics.XOO0ii0(this.bleName, deviceLaseRecord.bleName) && Intrinsics.XOO0ii0(this.flag, deviceLaseRecord.flag) && Intrinsics.XOO0ii0(this.bleVersion, deviceLaseRecord.bleVersion) && Intrinsics.XOO0ii0(this.mac, deviceLaseRecord.mac);
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getBleVersion() {
        return this.bleVersion;
    }

    @aa1
    public final String getFlag() {
        return this.flag;
    }

    @aa1
    public final String getMac() {
        return this.mac;
    }

    public int hashCode() {
        return (((((this.bleName.hashCode() * 31) + this.flag.hashCode()) * 31) + this.bleVersion.hashCode()) * 31) + this.mac.hashCode();
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setBleVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleVersion = str;
    }

    public final void setFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.flag = str;
    }

    public final void setMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mac = str;
    }

    @aa1
    public String toString() {
        return "DeviceLaseRecord(bleName=" + this.bleName + ", flag=" + this.flag + ", bleVersion=" + this.bleVersion + ", mac=" + this.mac + I000IiI1O.C2156iO.f1007iO;
    }

    public DeviceLaseRecord(@aa1 String bleName, @aa1 String flag, @aa1 String bleVersion, @aa1 String mac) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(bleVersion, "bleVersion");
        Intrinsics.X0O(mac, "mac");
        this.bleName = bleName;
        this.flag = flag;
        this.bleVersion = bleVersion;
        this.mac = mac;
    }

    public /* synthetic */ DeviceLaseRecord(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
