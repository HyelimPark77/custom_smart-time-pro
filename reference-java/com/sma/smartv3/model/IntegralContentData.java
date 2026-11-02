package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class IntegralContentData extends JsonFieldContainer implements Serializable {

    @aa1
    private String accountId;
    private int changeFlag;

    @aa1
    private String createdAt;

    @aa1
    private String createdBy;

    /* JADX INFO: renamed from: id */
    @aa1
    private String f51310id;

    @aa1
    private String pointsChange;

    @aa1
    private String recordItem;

    @aa1
    private String updateAt;

    @aa1
    private String updateBy;
    private float version;

    public IntegralContentData() {
        this(null, null, null, null, 0.0f, null, 0, null, null, null, 1023, null);
    }

    public static /* synthetic */ IntegralContentData copy$default(IntegralContentData integralContentData, String str, String str2, String str3, String str4, float f, String str5, int i, String str6, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = integralContentData.accountId;
        }
        if ((i2 & 2) != 0) {
            str2 = integralContentData.recordItem;
        }
        if ((i2 & 4) != 0) {
            str3 = integralContentData.pointsChange;
        }
        if ((i2 & 8) != 0) {
            str4 = integralContentData.f51310id;
        }
        if ((i2 & 16) != 0) {
            f = integralContentData.version;
        }
        if ((i2 & 32) != 0) {
            str5 = integralContentData.createdBy;
        }
        if ((i2 & 64) != 0) {
            i = integralContentData.changeFlag;
        }
        if ((i2 & 128) != 0) {
            str6 = integralContentData.createdAt;
        }
        if ((i2 & 256) != 0) {
            str7 = integralContentData.updateBy;
        }
        if ((i2 & 512) != 0) {
            str8 = integralContentData.updateAt;
        }
        String str9 = str7;
        String str10 = str8;
        int i3 = i;
        String str11 = str6;
        float f2 = f;
        String str12 = str5;
        return integralContentData.copy(str, str2, str3, str4, f2, str12, i3, str11, str9, str10);
    }

    @aa1
    public final String component1() {
        return this.accountId;
    }

    @aa1
    public final String component10() {
        return this.updateAt;
    }

    @aa1
    public final String component2() {
        return this.recordItem;
    }

    @aa1
    public final String component3() {
        return this.pointsChange;
    }

    @aa1
    public final String component4() {
        return this.f51310id;
    }

    public final float component5() {
        return this.version;
    }

    @aa1
    public final String component6() {
        return this.createdBy;
    }

    public final int component7() {
        return this.changeFlag;
    }

    @aa1
    public final String component8() {
        return this.createdAt;
    }

    @aa1
    public final String component9() {
        return this.updateBy;
    }

    @aa1
    public final IntegralContentData copy(@aa1 String accountId, @aa1 String recordItem, @aa1 String pointsChange, @aa1 String id, float f, @aa1 String createdBy, int i, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(accountId, "accountId");
        Intrinsics.X0O(recordItem, "recordItem");
        Intrinsics.X0O(pointsChange, "pointsChange");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(updateAt, "updateAt");
        return new IntegralContentData(accountId, recordItem, pointsChange, id, f, createdBy, i, createdAt, updateBy, updateAt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegralContentData)) {
            return false;
        }
        IntegralContentData integralContentData = (IntegralContentData) obj;
        return Intrinsics.XOO0ii0(this.accountId, integralContentData.accountId) && Intrinsics.XOO0ii0(this.recordItem, integralContentData.recordItem) && Intrinsics.XOO0ii0(this.pointsChange, integralContentData.pointsChange) && Intrinsics.XOO0ii0(this.f51310id, integralContentData.f51310id) && Float.compare(this.version, integralContentData.version) == 0 && Intrinsics.XOO0ii0(this.createdBy, integralContentData.createdBy) && this.changeFlag == integralContentData.changeFlag && Intrinsics.XOO0ii0(this.createdAt, integralContentData.createdAt) && Intrinsics.XOO0ii0(this.updateBy, integralContentData.updateBy) && Intrinsics.XOO0ii0(this.updateAt, integralContentData.updateAt);
    }

    @aa1
    public final String getAccountId() {
        return this.accountId;
    }

    public final int getChangeFlag() {
        return this.changeFlag;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @aa1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @aa1
    public final String getId() {
        return this.f51310id;
    }

    @aa1
    public final String getPointsChange() {
        return this.pointsChange;
    }

    @aa1
    public final String getRecordItem() {
        return this.recordItem;
    }

    @aa1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @aa1
    public final String getUpdateBy() {
        return this.updateBy;
    }

    public final float getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((this.accountId.hashCode() * 31) + this.recordItem.hashCode()) * 31) + this.pointsChange.hashCode()) * 31) + this.f51310id.hashCode()) * 31) + Float.hashCode(this.version)) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.changeFlag)) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAccountId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.accountId = str;
    }

    public final void setChangeFlag(int i) {
        this.changeFlag = i;
    }

    public final void setCreatedAt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setCreatedBy(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createdBy = str;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f51310id = str;
    }

    public final void setPointsChange(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.pointsChange = str;
    }

    public final void setRecordItem(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.recordItem = str;
    }

    public final void setUpdateAt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateAt = str;
    }

    public final void setUpdateBy(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateBy = str;
    }

    public final void setVersion(float f) {
        this.version = f;
    }

    @aa1
    public String toString() {
        return "IntegralContentData(accountId=" + this.accountId + ", recordItem=" + this.recordItem + ", pointsChange=" + this.pointsChange + ", id=" + this.f51310id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", changeFlag=" + this.changeFlag + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.C2156iO.f1007iO;
    }

    public IntegralContentData(@aa1 String accountId, @aa1 String recordItem, @aa1 String pointsChange, @aa1 String id, float f, @aa1 String createdBy, int i, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(accountId, "accountId");
        Intrinsics.X0O(recordItem, "recordItem");
        Intrinsics.X0O(pointsChange, "pointsChange");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(updateAt, "updateAt");
        this.accountId = accountId;
        this.recordItem = recordItem;
        this.pointsChange = pointsChange;
        this.f51310id = id;
        this.version = f;
        this.createdBy = createdBy;
        this.changeFlag = i;
        this.createdAt = createdAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public /* synthetic */ IntegralContentData(String str, String str2, String str3, String str4, float f, String str5, int i, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8);
    }
}
