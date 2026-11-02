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

    public DataBody(@aa1 String bleName, @aa1 String firmwareFlag, int i, int i2, @aa1 String appVersion, int i3, @aa1 String callTime, @aa1 String macAddress, @aa1 String model, @aa1 String remark) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(firmwareFlag, "firmwareFlag");
        Intrinsics.X0O(appVersion, "appVersion");
        Intrinsics.X0O(callTime, "callTime");
        Intrinsics.X0O(macAddress, "macAddress");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(remark, "remark");
        this.bleName = bleName;
        this.firmwareFlag = firmwareFlag;
        this.projectId = i;
        this.platform = i2;
        this.appVersion = appVersion;
        this.callType = i3;
        this.callTime = callTime;
        this.macAddress = macAddress;
        this.model = model;
        this.remark = remark;
    }

    public static /* synthetic */ DataBody copy$default(DataBody dataBody, String str, String str2, int i, int i2, String str3, int i3, String str4, String str5, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dataBody.bleName;
        }
        if ((i4 & 2) != 0) {
            str2 = dataBody.firmwareFlag;
        }
        if ((i4 & 4) != 0) {
            i = dataBody.projectId;
        }
        if ((i4 & 8) != 0) {
            i2 = dataBody.platform;
        }
        if ((i4 & 16) != 0) {
            str3 = dataBody.appVersion;
        }
        if ((i4 & 32) != 0) {
            i3 = dataBody.callType;
        }
        if ((i4 & 64) != 0) {
            str4 = dataBody.callTime;
        }
        if ((i4 & 128) != 0) {
            str5 = dataBody.macAddress;
        }
        if ((i4 & 256) != 0) {
            str6 = dataBody.model;
        }
        if ((i4 & 512) != 0) {
            str7 = dataBody.remark;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        int i5 = i3;
        return dataBody.copy(str, str2, i, i2, str12, i5, str10, str11, str8, str9);
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
    public final DataBody copy(@aa1 String bleName, @aa1 String firmwareFlag, int i, int i2, @aa1 String appVersion, int i3, @aa1 String callTime, @aa1 String macAddress, @aa1 String model, @aa1 String remark) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(firmwareFlag, "firmwareFlag");
        Intrinsics.X0O(appVersion, "appVersion");
        Intrinsics.X0O(callTime, "callTime");
        Intrinsics.X0O(macAddress, "macAddress");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(remark, "remark");
        return new DataBody(bleName, firmwareFlag, i, i2, appVersion, i3, callTime, macAddress, model, remark);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataBody)) {
            return false;
        }
        DataBody dataBody = (DataBody) obj;
        return Intrinsics.XOO0ii0(this.bleName, dataBody.bleName) && Intrinsics.XOO0ii0(this.firmwareFlag, dataBody.firmwareFlag) && this.projectId == dataBody.projectId && this.platform == dataBody.platform && Intrinsics.XOO0ii0(this.appVersion, dataBody.appVersion) && this.callType == dataBody.callType && Intrinsics.XOO0ii0(this.callTime, dataBody.callTime) && Intrinsics.XOO0ii0(this.macAddress, dataBody.macAddress) && Intrinsics.XOO0ii0(this.model, dataBody.model) && Intrinsics.XOO0ii0(this.remark, dataBody.remark);
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

    public final void setAppVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setCallTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.callTime = str;
    }

    public final void setCallType(int i) {
        this.callType = i;
    }

    public final void setFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareFlag = str;
    }

    public final void setMacAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.macAddress = str;
    }

    public final void setModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.model = str;
    }

    public final void setPlatform(int i) {
        this.platform = i;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setRemark(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.remark = str;
    }

    @aa1
    public String toString() {
        return "DataBody(bleName=" + this.bleName + ", firmwareFlag=" + this.firmwareFlag + ", projectId=" + this.projectId + ", platform=" + this.platform + ", appVersion=" + this.appVersion + ", callType=" + this.callType + ", callTime=" + this.callTime + ", macAddress=" + this.macAddress + ", model=" + this.model + ", remark=" + this.remark + I000IiI1O.C2156iO.f1007iO;
    }
}
