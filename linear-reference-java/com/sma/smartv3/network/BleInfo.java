package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleInfo {

    @aa1
    private String bleName;

    @aa1
    private String bleVersion;

    @aa1
    private String flag;

    @aa1
    private String mac;

    @aa1
    private String pVersion;
    private int phoneOs;

    @aa1
    private String pid;

    @aa1
    private String uid;

    public BleInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleInfo copy$default(BleInfo r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.uid;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.bleName;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.flag;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.pid;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.bleVersion;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.pVersion;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mac;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.phoneOs;
    L26:
        String r11 = r7;
        int r12 = r8;
        String r13 = r5;
        String r14 = r6;
        String r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    @aa1
    public final String component1() {
        return this.uid;
    }

    @aa1
    public final String component2() {
        return this.bleName;
    }

    @aa1
    public final String component3() {
        return this.flag;
    }

    @aa1
    public final String component4() {
        return this.pid;
    }

    @aa1
    public final String component5() {
        return this.bleVersion;
    }

    @aa1
    public final String component6() {
        return this.pVersion;
    }

    @aa1
    public final String component7() {
        return this.mac;
    }

    public final int component8() {
        return this.phoneOs;
    }

    @aa1
    public final BleInfo copy(@aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, int r18) {
        Intrinsics.X0O(r11, "uid");
        Intrinsics.X0O(r12, "bleName");
        Intrinsics.X0O(r13, "flag");
        Intrinsics.X0O(r14, "pid");
        Intrinsics.X0O(r15, GetDcsToken.FIRMWARE_VERSION);
        Intrinsics.X0O(r16, "pVersion");
        Intrinsics.X0O(r17, "mac");
        return new BleInfo(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleInfo) == true) goto L8;
        return false;
    L8:
        BleInfo r6 = (BleInfo) r5;
        if (Intrinsics.XOO0ii0(this.uid, r6.uid) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.flag, r6.flag) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.pid, r6.pid) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.bleVersion, r6.bleVersion) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.pVersion, r6.pVersion) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L30;
        return false;
    L30:
        if (this.phoneOs == r6.phoneOs) goto L32;
        return false;
    L32:
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

    @aa1
    public final String getPVersion() {
        return this.pVersion;
    }

    public final int getPhoneOs() {
        return this.phoneOs;
    }

    @aa1
    public final String getPid() {
        return this.pid;
    }

    @aa1
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((((((((((((this.uid.hashCode() * 31) + this.bleName.hashCode()) * 31) + this.flag.hashCode()) * 31) + this.pid.hashCode()) * 31) + this.bleVersion.hashCode()) * 31) + this.pVersion.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.phoneOs);
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

    public final void setPVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pVersion = r2;
    }

    public final void setPhoneOs(int r1) {
        this.phoneOs = r1;
    }

    public final void setPid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pid = r2;
    }

    public final void setUid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.uid = r2;
    }

    @aa1
    public String toString() {
        return "BleInfo(uid=" + this.uid + ", bleName=" + this.bleName + ", flag=" + this.flag + ", pid=" + this.pid + ", bleVersion=" + this.bleVersion + ", pVersion=" + this.pVersion + ", mac=" + this.mac + ", phoneOs=" + this.phoneOs + I000IiI1O.iO.iO;
    }

    public BleInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, int r9) {
        Intrinsics.X0O(r2, "uid");
        Intrinsics.X0O(r3, "bleName");
        Intrinsics.X0O(r4, "flag");
        Intrinsics.X0O(r5, "pid");
        Intrinsics.X0O(r6, GetDcsToken.FIRMWARE_VERSION);
        Intrinsics.X0O(r7, "pVersion");
        Intrinsics.X0O(r8, "mac");
        this.uid = r2;
        this.bleName = r3;
        this.flag = r4;
        this.pid = r5;
        this.bleVersion = r6;
        this.pVersion = r7;
        this.mac = r8;
        this.phoneOs = r9;
    }

    public /* synthetic */ BleInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = 0;
    L26:
        int r12 = r9;
        String r13 = r8;
        String r14 = r7;
        String r15 = r6;
        String r16 = r5;
        String r17 = r4;
        String r18 = r3;
        this(r2, r18, r17, r16, r15, r14, r13, r12);
    }
}
