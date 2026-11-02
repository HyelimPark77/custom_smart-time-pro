package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleDevice extends JsonFieldContainer {

    @aa1
    private String address;
    private int agpsType;

    @aa1
    private String extraInfo;

    @aa1
    private String firmwareFlag;

    @aa1
    private String name;

    @aa1
    private String platform;

    @aa1
    private String prototype;

    @aa1
    private String settings;

    @aa1
    private String version;

    public BleDevice() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleDevice copy$default(BleDevice r0, String r1, String r2, String r3, String r4, String r5, int r6, String r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.address;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.platform;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.prototype;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.firmwareFlag;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.agpsType;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.version;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.extraInfo;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.settings;
    L29:
        String r12 = r8;
        String r13 = r9;
        int r14 = r6;
        String r15 = r7;
        String r16 = r4;
        String r17 = r5;
        String r18 = r3;
        String r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    @aa1
    public final String component2() {
        return this.address;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    @aa1
    public final String component4() {
        return this.prototype;
    }

    @aa1
    public final String component5() {
        return this.firmwareFlag;
    }

    public final int component6() {
        return this.agpsType;
    }

    @aa1
    public final String component7() {
        return this.version;
    }

    @aa1
    public final String component8() {
        return this.extraInfo;
    }

    @aa1
    public final String component9() {
        return this.settings;
    }

    @aa1
    public final BleDevice copy(@aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, int r17, @aa1 String r18, @aa1 String r19, @aa1 String r20) {
        Intrinsics.X0O(r12, "name");
        Intrinsics.X0O(r13, "address");
        Intrinsics.X0O(r14, "platform");
        Intrinsics.X0O(r15, "prototype");
        Intrinsics.X0O(r16, "firmwareFlag");
        Intrinsics.X0O(r18, "version");
        Intrinsics.X0O(r19, "extraInfo");
        Intrinsics.X0O(r20, "settings");
        return new BleDevice(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDevice) == true) goto L8;
        return false;
    L8:
        BleDevice r6 = (BleDevice) r5;
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.address, r6.address) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.platform, r6.platform) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.prototype, r6.prototype) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.firmwareFlag, r6.firmwareFlag) == true) goto L24;
        return false;
    L24:
        if (this.agpsType == r6.agpsType) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.extraInfo, r6.extraInfo) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.settings, r6.settings) == true) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final String getAddress() {
        return this.address;
    }

    public final int getAgpsType() {
        return this.agpsType;
    }

    @aa1
    public final String getExtraInfo() {
        return this.extraInfo;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getPrototype() {
        return this.prototype;
    }

    @aa1
    public final String getSettings() {
        return this.settings;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + this.address.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.prototype.hashCode()) * 31) + this.firmwareFlag.hashCode()) * 31) + Integer.hashCode(this.agpsType)) * 31) + this.version.hashCode()) * 31) + this.extraInfo.hashCode()) * 31) + this.settings.hashCode();
    }

    public final void setAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.address = r2;
    }

    public final void setAgpsType(int r1) {
        this.agpsType = r1;
    }

    public final void setExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extraInfo = r2;
    }

    public final void setFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareFlag = r2;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.platform = r2;
    }

    public final void setPrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.prototype = r2;
    }

    public final void setSettings(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.settings = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "BleDevice(name=" + this.name + ", address=" + this.address + ", platform=" + this.platform + ", prototype=" + this.prototype + ", firmwareFlag=" + this.firmwareFlag + ", agpsType=" + this.agpsType + ", version=" + this.version + ", extraInfo=" + this.extraInfo + ", settings=" + this.settings + I000IiI1O.iO.iO;
    }

    public BleDevice(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, int r7, @aa1 String r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "address");
        Intrinsics.X0O(r4, "platform");
        Intrinsics.X0O(r5, "prototype");
        Intrinsics.X0O(r6, "firmwareFlag");
        Intrinsics.X0O(r8, "version");
        Intrinsics.X0O(r9, "extraInfo");
        Intrinsics.X0O(r10, "settings");
        this.name = r2;
        this.address = r3;
        this.platform = r4;
        this.prototype = r5;
        this.firmwareFlag = r6;
        this.agpsType = r7;
        this.version = r8;
        this.extraInfo = r9;
        this.settings = r10;
    }

    public /* synthetic */ BleDevice(String r2, String r3, String r4, String r5, String r6, int r7, String r8, String r9, String r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r13 = "";
    L29:
        String r14 = r9;
        String r15 = r8;
        int r16 = r7;
        String r17 = r6;
        String r18 = r5;
        String r19 = r4;
        String r20 = r3;
        this(r2, r20, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
