package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DataBody {

    @aa1
    private String appVersion;

    @aa1
    private String bleName;

    @aa1
    private String callTime;
    private int callType;

    @aa1
    private String firmwareFlag;

    @aa1
    private String macAddress;

    @aa1
    private String model;
    private int platform;
    private int projectId;

    @aa1
    private String remark;

    public DataBody(@aa1 String r2, @aa1 String r3, int r4, int r5, @aa1 String r6, int r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r2, "bleName");
        Intrinsics.X0O(r3, "firmwareFlag");
        Intrinsics.X0O(r6, "appVersion");
        Intrinsics.X0O(r8, "callTime");
        Intrinsics.X0O(r9, "macAddress");
        Intrinsics.X0O(r10, "model");
        Intrinsics.X0O(r11, UploadOtaRecord.REMARK);
        this.bleName = r2;
        this.firmwareFlag = r3;
        this.projectId = r4;
        this.platform = r5;
        this.appVersion = r6;
        this.callType = r7;
        this.callTime = r8;
        this.macAddress = r9;
        this.model = r10;
        this.remark = r11;
    }

    public static /* synthetic */ DataBody copy$default(DataBody r0, String r1, String r2, int r3, int r4, String r5, int r6, String r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.bleName;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.firmwareFlag;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.projectId;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.platform;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.appVersion;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.callType;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.callTime;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.macAddress;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.model;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.remark;
    L32:
        String r13 = r9;
        String r14 = r10;
        String r15 = r7;
        String r16 = r8;
        String r17 = r5;
        int r18 = r6;
        int r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final String component10() {
        return this.remark;
    }

    @aa1
    public final String component2() {
        return this.firmwareFlag;
    }

    public final int component3() {
        return this.projectId;
    }

    public final int component4() {
        return this.platform;
    }

    @aa1
    public final String component5() {
        return this.appVersion;
    }

    public final int component6() {
        return this.callType;
    }

    @aa1
    public final String component7() {
        return this.callTime;
    }

    @aa1
    public final String component8() {
        return this.macAddress;
    }

    @aa1
    public final String component9() {
        return this.model;
    }

    @aa1
    public final DataBody copy(@aa1 String r13, @aa1 String r14, int r15, int r16, @aa1 String r17, int r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r13, "bleName");
        Intrinsics.X0O(r14, "firmwareFlag");
        Intrinsics.X0O(r17, "appVersion");
        Intrinsics.X0O(r19, "callTime");
        Intrinsics.X0O(r20, "macAddress");
        Intrinsics.X0O(r21, "model");
        Intrinsics.X0O(r22, UploadOtaRecord.REMARK);
        return new DataBody(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DataBody) == true) goto L8;
        return false;
    L8:
        DataBody r6 = (DataBody) r5;
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.firmwareFlag, r6.firmwareFlag) == true) goto L15;
        return false;
    L15:
        if (this.projectId == r6.projectId) goto L18;
        return false;
    L18:
        if (this.platform == r6.platform) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.appVersion, r6.appVersion) == true) goto L24;
        return false;
    L24:
        if (this.callType == r6.callType) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.callTime, r6.callTime) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.macAddress, r6.macAddress) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.model, r6.model) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.remark, r6.remark) == true) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getAppVersion() {
        return this.appVersion;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getCallTime() {
        return this.callTime;
    }

    public final int getCallType() {
        return this.callType;
    }

    @aa1
    public final String getFirmwareFlag() {
        return this.firmwareFlag;
    }

    @aa1
    public final String getMacAddress() {
        return this.macAddress;
    }

    @aa1
    public final String getModel() {
        return this.model;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        return (((((((((((((((((this.bleName.hashCode() * 31) + this.firmwareFlag.hashCode()) * 31) + Integer.hashCode(this.projectId)) * 31) + Integer.hashCode(this.platform)) * 31) + this.appVersion.hashCode()) * 31) + Integer.hashCode(this.callType)) * 31) + this.callTime.hashCode()) * 31) + this.macAddress.hashCode()) * 31) + this.model.hashCode()) * 31) + this.remark.hashCode();
    }

    public final void setAppVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.appVersion = r2;
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setCallTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.callTime = r2;
    }

    public final void setCallType(int r1) {
        this.callType = r1;
    }

    public final void setFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareFlag = r2;
    }

    public final void setMacAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.macAddress = r2;
    }

    public final void setModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.model = r2;
    }

    public final void setPlatform(int r1) {
        this.platform = r1;
    }

    public final void setProjectId(int r1) {
        this.projectId = r1;
    }

    public final void setRemark(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.remark = r2;
    }

    @aa1
    public String toString() {
        return "DataBody(bleName=" + this.bleName + ", firmwareFlag=" + this.firmwareFlag + ", projectId=" + this.projectId + ", platform=" + this.platform + ", appVersion=" + this.appVersion + ", callType=" + this.callType + ", callTime=" + this.callTime + ", macAddress=" + this.macAddress + ", model=" + this.model + ", remark=" + this.remark + I000IiI1O.iO.iO;
    }
}
