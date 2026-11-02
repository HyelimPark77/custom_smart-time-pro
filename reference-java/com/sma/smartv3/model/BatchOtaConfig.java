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
        this(0, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ BatchOtaConfig copy$default(BatchOtaConfig batchOtaConfig, int i, BleFirmwareInfo bleFirmwareInfo, FirmwareVersion firmwareVersion, ExtraPackVersions extraPackVersions, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batchOtaConfig.platform;
        }
        if ((i2 & 2) != 0) {
            bleFirmwareInfo = batchOtaConfig.bleFirmwareInfo;
        }
        if ((i2 & 4) != 0) {
            firmwareVersion = batchOtaConfig.firmwareVersion;
        }
        if ((i2 & 8) != 0) {
            extraPackVersions = batchOtaConfig.extraPackageDatas;
        }
        if ((i2 & 16) != 0) {
            str = batchOtaConfig.bleName;
        }
        if ((i2 & 32) != 0) {
            z = batchOtaConfig.isLocalOta;
        }
        String str2 = str;
        boolean z2 = z;
        return batchOtaConfig.copy(i, bleFirmwareInfo, firmwareVersion, extraPackVersions, str2, z2);
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
    public final BatchOtaConfig copy(int i, @aa1 BleFirmwareInfo bleFirmwareInfo, @aa1 FirmwareVersion firmwareVersion, @aa1 ExtraPackVersions extraPackageDatas, @aa1 String bleName, boolean z) {
        Intrinsics.X0O(bleFirmwareInfo, "bleFirmwareInfo");
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        Intrinsics.X0O(extraPackageDatas, "extraPackageDatas");
        Intrinsics.X0O(bleName, "bleName");
        return new BatchOtaConfig(i, bleFirmwareInfo, firmwareVersion, extraPackageDatas, bleName, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchOtaConfig)) {
            return false;
        }
        BatchOtaConfig batchOtaConfig = (BatchOtaConfig) obj;
        return this.platform == batchOtaConfig.platform && Intrinsics.XOO0ii0(this.bleFirmwareInfo, batchOtaConfig.bleFirmwareInfo) && Intrinsics.XOO0ii0(this.firmwareVersion, batchOtaConfig.firmwareVersion) && Intrinsics.XOO0ii0(this.extraPackageDatas, batchOtaConfig.extraPackageDatas) && Intrinsics.XOO0ii0(this.bleName, batchOtaConfig.bleName) && this.isLocalOta == batchOtaConfig.isLocalOta;
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

    public final void setBleFirmwareInfo(@aa1 BleFirmwareInfo bleFirmwareInfo) {
        Intrinsics.X0O(bleFirmwareInfo, "<set-?>");
        this.bleFirmwareInfo = bleFirmwareInfo;
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setExtraPackageDatas(@aa1 ExtraPackVersions extraPackVersions) {
        Intrinsics.X0O(extraPackVersions, "<set-?>");
        this.extraPackageDatas = extraPackVersions;
    }

    public final void setFirmwareVersion(@aa1 FirmwareVersion firmwareVersion) {
        Intrinsics.X0O(firmwareVersion, "<set-?>");
        this.firmwareVersion = firmwareVersion;
    }

    public final void setLocalOta(boolean z) {
        this.isLocalOta = z;
    }

    public final void setPlatform(int i) {
        this.platform = i;
    }

    @aa1
    public String toString() {
        return "BatchOtaConfig(platform=" + this.platform + ", bleFirmwareInfo=" + this.bleFirmwareInfo + ", firmwareVersion=" + this.firmwareVersion + ", extraPackageDatas=" + this.extraPackageDatas + ", bleName=" + this.bleName + ", isLocalOta=" + this.isLocalOta + I000IiI1O.C2156iO.f1007iO;
    }

    public BatchOtaConfig(int i, @aa1 BleFirmwareInfo bleFirmwareInfo, @aa1 FirmwareVersion firmwareVersion, @aa1 ExtraPackVersions extraPackageDatas, @aa1 String bleName, boolean z) {
        Intrinsics.X0O(bleFirmwareInfo, "bleFirmwareInfo");
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        Intrinsics.X0O(extraPackageDatas, "extraPackageDatas");
        Intrinsics.X0O(bleName, "bleName");
        this.platform = i;
        this.bleFirmwareInfo = bleFirmwareInfo;
        this.firmwareVersion = firmwareVersion;
        this.extraPackageDatas = extraPackageDatas;
        this.bleName = bleName;
        this.isLocalOta = z;
    }

    public /* synthetic */ BatchOtaConfig(int i, BleFirmwareInfo bleFirmwareInfo, FirmwareVersion firmwareVersion, ExtraPackVersions extraPackVersions, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new BleFirmwareInfo(0, 0, null, null, null, 31, null) : bleFirmwareInfo, (i2 & 4) != 0 ? new FirmwareVersion(null, 0, null, null, null, 0, null, null, null, null, 1023, null) : firmwareVersion, (i2 & 8) != 0 ? new ExtraPackVersions(null, null, null, null, null, null, null, 127, null) : extraPackVersions, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? false : z);
    }
}
