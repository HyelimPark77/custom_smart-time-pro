package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.GetDcsToken;
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
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ DeviceLaseRecord copy$default(DeviceLaseRecord r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.bleName;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.flag;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.bleVersion;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mac;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final DeviceLaseRecord copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "bleName");
        Intrinsics.X0O(r3, "flag");
        Intrinsics.X0O(r4, GetDcsToken.FIRMWARE_VERSION);
        Intrinsics.X0O(r5, "mac");
        return new DeviceLaseRecord(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeviceLaseRecord) == true) goto L8;
        return false;
    L8:
        DeviceLaseRecord r6 = (DeviceLaseRecord) r5;
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.flag, r6.flag) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.bleVersion, r6.bleVersion) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setBleVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleVersion = r2;
    }

    public final void setFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.flag = r2;
    }

    public final void setMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mac = r2;
    }

    @aa1
    public String toString() {
        return "DeviceLaseRecord(bleName=" + this.bleName + ", flag=" + this.flag + ", bleVersion=" + this.bleVersion + ", mac=" + this.mac + I000IiI1O.iO.iO;
    }

    public DeviceLaseRecord(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "bleName");
        Intrinsics.X0O(r3, "flag");
        Intrinsics.X0O(r4, GetDcsToken.FIRMWARE_VERSION);
        Intrinsics.X0O(r5, "mac");
        this.bleName = r2;
        this.flag = r3;
        this.bleVersion = r4;
        this.mac = r5;
    }

    public /* synthetic */ DeviceLaseRecord(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
