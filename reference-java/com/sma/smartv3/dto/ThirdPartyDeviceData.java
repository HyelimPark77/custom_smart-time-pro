package com.sma.smartv3.dto;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class ThirdPartyDeviceData {

    @tb1
    private final String aiServerName;

    @aa1
    private final Batch batch;

    @aa1
    private final String bleName;

    @aa1
    private final String code;

    @aa1
    private final Object createdAt;

    @aa1
    private final String createdBy;
    private final int duration;

    @aa1
    private final String flag;

    /* JADX INFO: renamed from: id */
    private final int f51204id;

    @aa1
    private final String macAdd;
    private final int modelId;
    private final int status;

    @aa1
    private final Object updateAt;

    @aa1
    private final String updateBy;

    @aa1
    private final String usageTime;
    private final int version;

    public ThirdPartyDeviceData(@aa1 Batch batch, @aa1 String bleName, @aa1 String code, @aa1 Object createdAt, @aa1 String createdBy, int i, @aa1 String flag, int i2, @aa1 String macAdd, int i3, int i4, @aa1 Object updateAt, @aa1 String updateBy, @aa1 String usageTime, int i5, @tb1 String str) {
        Intrinsics.X0O(batch, "batch");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(macAdd, "macAdd");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(usageTime, "usageTime");
        this.batch = batch;
        this.bleName = bleName;
        this.code = code;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.duration = i;
        this.flag = flag;
        this.f51204id = i2;
        this.macAdd = macAdd;
        this.modelId = i3;
        this.status = i4;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.usageTime = usageTime;
        this.version = i5;
        this.aiServerName = str;
    }

    @aa1
    public final Batch component1() {
        return this.batch;
    }

    public final int component10() {
        return this.modelId;
    }

    public final int component11() {
        return this.status;
    }

    @aa1
    public final Object component12() {
        return this.updateAt;
    }

    @aa1
    public final String component13() {
        return this.updateBy;
    }

    @aa1
    public final String component14() {
        return this.usageTime;
    }

    public final int component15() {
        return this.version;
    }

    @tb1
    public final String component16() {
        return this.aiServerName;
    }

    @aa1
    public final String component2() {
        return this.bleName;
    }

    @aa1
    public final String component3() {
        return this.code;
    }

    @aa1
    public final Object component4() {
        return this.createdAt;
    }

    @aa1
    public final String component5() {
        return this.createdBy;
    }

    public final int component6() {
        return this.duration;
    }

    @aa1
    public final String component7() {
        return this.flag;
    }

    public final int component8() {
        return this.f51204id;
    }

    @aa1
    public final String component9() {
        return this.macAdd;
    }

    @aa1
    public final ThirdPartyDeviceData copy(@aa1 Batch batch, @aa1 String bleName, @aa1 String code, @aa1 Object createdAt, @aa1 String createdBy, int i, @aa1 String flag, int i2, @aa1 String macAdd, int i3, int i4, @aa1 Object updateAt, @aa1 String updateBy, @aa1 String usageTime, int i5, @tb1 String str) {
        Intrinsics.X0O(batch, "batch");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(macAdd, "macAdd");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(usageTime, "usageTime");
        return new ThirdPartyDeviceData(batch, bleName, code, createdAt, createdBy, i, flag, i2, macAdd, i3, i4, updateAt, updateBy, usageTime, i5, str);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyDeviceData)) {
            return false;
        }
        ThirdPartyDeviceData thirdPartyDeviceData = (ThirdPartyDeviceData) obj;
        return Intrinsics.XOO0ii0(this.batch, thirdPartyDeviceData.batch) && Intrinsics.XOO0ii0(this.bleName, thirdPartyDeviceData.bleName) && Intrinsics.XOO0ii0(this.code, thirdPartyDeviceData.code) && Intrinsics.XOO0ii0(this.createdAt, thirdPartyDeviceData.createdAt) && Intrinsics.XOO0ii0(this.createdBy, thirdPartyDeviceData.createdBy) && this.duration == thirdPartyDeviceData.duration && Intrinsics.XOO0ii0(this.flag, thirdPartyDeviceData.flag) && this.f51204id == thirdPartyDeviceData.f51204id && Intrinsics.XOO0ii0(this.macAdd, thirdPartyDeviceData.macAdd) && this.modelId == thirdPartyDeviceData.modelId && this.status == thirdPartyDeviceData.status && Intrinsics.XOO0ii0(this.updateAt, thirdPartyDeviceData.updateAt) && Intrinsics.XOO0ii0(this.updateBy, thirdPartyDeviceData.updateBy) && Intrinsics.XOO0ii0(this.usageTime, thirdPartyDeviceData.usageTime) && this.version == thirdPartyDeviceData.version && Intrinsics.XOO0ii0(this.aiServerName, thirdPartyDeviceData.aiServerName);
    }

    @tb1
    public final String getAiServerName() {
        return this.aiServerName;
    }

    @aa1
    public final Batch getBatch() {
        return this.batch;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getCode() {
        return this.code;
    }

    @aa1
    public final Object getCreatedAt() {
        return this.createdAt;
    }

    @aa1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final int getDuration() {
        return this.duration;
    }

    @aa1
    public final String getFlag() {
        return this.flag;
    }

    public final int getId() {
        return this.f51204id;
    }

    @aa1
    public final String getMacAdd() {
        return this.macAdd;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getStatus() {
        return this.status;
    }

    @aa1
    public final Object getUpdateAt() {
        return this.updateAt;
    }

    @aa1
    public final String getUpdateBy() {
        return this.updateBy;
    }

    @aa1
    public final String getUsageTime() {
        return this.usageTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.batch.hashCode() * 31) + this.bleName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.flag.hashCode()) * 31) + Integer.hashCode(this.f51204id)) * 31) + this.macAdd.hashCode()) * 31) + Integer.hashCode(this.modelId)) * 31) + Integer.hashCode(this.status)) * 31) + this.updateAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.usageTime.hashCode()) * 31) + Integer.hashCode(this.version)) * 31;
        String str = this.aiServerName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @aa1
    public String toString() {
        return "ThirdPartyDeviceData(batch=" + this.batch + ", bleName=" + this.bleName + ", code=" + this.code + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", duration=" + this.duration + ", flag=" + this.flag + ", id=" + this.f51204id + ", macAdd=" + this.macAdd + ", modelId=" + this.modelId + ", status=" + this.status + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", usageTime=" + this.usageTime + ", version=" + this.version + ", aiServerName=" + this.aiServerName + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ ThirdPartyDeviceData(Batch batch, String str, String str2, Object obj, String str3, int i, String str4, int i2, String str5, int i3, int i4, Object obj2, String str6, String str7, int i5, String str8, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(batch, str, str2, obj, str3, (i6 & 32) != 0 ? 0 : i, str4, i2, str5, i3, i4, obj2, str6, str7, i5, (i6 & 32768) != 0 ? "" : str8);
    }
}
