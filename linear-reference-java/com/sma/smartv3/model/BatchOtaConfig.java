package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BatchOtaConfig extends JsonFieldContainer implements Serializable {

    @aa1
    private BleFirmwareInfo bleFirmwareInfo;

    @aa1
    private String bleName;

    @aa1
    private ExtraPackVersions extraPackageDatas;

    @aa1
    private FirmwareVersion firmwareVersion;
    private boolean isLocalOta;
    private int platform;

    public BatchOtaConfig() {
        int r1 = 0;
        BleFirmwareInfo r2 = null;
        FirmwareVersion r3 = null;
        ExtraPackVersions r4 = null;
        String r5 = null;
        boolean r6 = false;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BatchOtaConfig copy$default(BatchOtaConfig r0, int r1, BleFirmwareInfo r2, FirmwareVersion r3, ExtraPackVersions r4, String r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.platform;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.bleFirmwareInfo;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.firmwareVersion;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.extraPackageDatas;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.bleName;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.isLocalOta;
    L20:
        String r9 = r5;
        boolean r10 = r6;
        FirmwareVersion r11 = r3;
        ExtraPackVersions r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.platform;
    }

    @aa1
    public final BleFirmwareInfo component2() {
        return this.bleFirmwareInfo;
    }

    @aa1
    public final FirmwareVersion component3() {
        return this.firmwareVersion;
    }

    @aa1
    public final ExtraPackVersions component4() {
        return this.extraPackageDatas;
    }

    @aa1
    public final String component5() {
        return this.bleName;
    }

    public final boolean component6() {
        return this.isLocalOta;
    }

    @aa1
    public final BatchOtaConfig copy(int r9, @aa1 BleFirmwareInfo r10, @aa1 FirmwareVersion r11, @aa1 ExtraPackVersions r12, @aa1 String r13, boolean r14) {
        Intrinsics.X0O(r10, "bleFirmwareInfo");
        Intrinsics.X0O(r11, "firmwareVersion");
        Intrinsics.X0O(r12, "extraPackageDatas");
        Intrinsics.X0O(r13, "bleName");
        return new BatchOtaConfig(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BatchOtaConfig) == true) goto L8;
        return false;
    L8:
        BatchOtaConfig r6 = (BatchOtaConfig) r5;
        if (this.platform == r6.platform) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.bleFirmwareInfo, r6.bleFirmwareInfo) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.firmwareVersion, r6.firmwareVersion) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.extraPackageDatas, r6.extraPackageDatas) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L24;
        return false;
    L24:
        if (this.isLocalOta == r6.isLocalOta) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final BleFirmwareInfo getBleFirmwareInfo() {
        return this.bleFirmwareInfo;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final ExtraPackVersions getExtraPackageDatas() {
        return this.extraPackageDatas;
    }

    @aa1
    public final FirmwareVersion getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.platform) * 31) + this.bleFirmwareInfo.hashCode()) * 31) + this.firmwareVersion.hashCode()) * 31) + this.extraPackageDatas.hashCode()) * 31) + this.bleName.hashCode()) * 31) + Boolean.hashCode(this.isLocalOta);
    }

    public final boolean isLocalOta() {
        return this.isLocalOta;
    }

    public final void setBleFirmwareInfo(@aa1 BleFirmwareInfo r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleFirmwareInfo = r2;
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setExtraPackageDatas(@aa1 ExtraPackVersions r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extraPackageDatas = r2;
    }

    public final void setFirmwareVersion(@aa1 FirmwareVersion r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareVersion = r2;
    }

    public final void setLocalOta(boolean r1) {
        this.isLocalOta = r1;
    }

    public final void setPlatform(int r1) {
        this.platform = r1;
    }

    @aa1
    public String toString() {
        return "BatchOtaConfig(platform=" + this.platform + ", bleFirmwareInfo=" + this.bleFirmwareInfo + ", firmwareVersion=" + this.firmwareVersion + ", extraPackageDatas=" + this.extraPackageDatas + ", bleName=" + this.bleName + ", isLocalOta=" + this.isLocalOta + I000IiI1O.iO.iO;
    }

    public BatchOtaConfig(int r2, @aa1 BleFirmwareInfo r3, @aa1 FirmwareVersion r4, @aa1 ExtraPackVersions r5, @aa1 String r6, boolean r7) {
        Intrinsics.X0O(r3, "bleFirmwareInfo");
        Intrinsics.X0O(r4, "firmwareVersion");
        Intrinsics.X0O(r5, "extraPackageDatas");
        Intrinsics.X0O(r6, "bleName");
        this.platform = r2;
        this.bleFirmwareInfo = r3;
        this.firmwareVersion = r4;
        this.extraPackageDatas = r5;
        this.bleName = r6;
        this.isLocalOta = r7;
    }

    public /* synthetic */ BatchOtaConfig(int r18, BleFirmwareInfo r19, FirmwareVersion r20, ExtraPackVersions r21, String r22, boolean r23, int r24, DefaultConstructorMarker r25) {
        if ((r24 & 1) == 0) goto L5;
        int r0 = 0;
    L7:
        if ((r24 & 2) == 0) goto L9;
        BleFirmwareInfo r3 = new BleFirmwareInfo(0, 0, null, null, null, 31, null);
    L11:
        if ((r24 & 4) == 0) goto L13;
        FirmwareVersion r4 = new FirmwareVersion(null, 0, null, null, null, 0, null, null, null, null, 1023, null);
    L15:
        if ((r24 & 8) == 0) goto L17;
        ExtraPackVersions r5 = new ExtraPackVersions(null, null, null, null, null, null, null, 127, null);
    L19:
        if ((r24 & 16) == 0) goto L21;
        String r2 = "";
    L23:
        if ((r24 & 32) == 0) goto L26;
        boolean r26 = false;
    L27:
        this(r0, r3, r4, r5, r2, r26);
        return;
    L26:
        r26 = r23;
        goto L27
    L21:
        r2 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r0 = r18;
        goto L7
    }
}
