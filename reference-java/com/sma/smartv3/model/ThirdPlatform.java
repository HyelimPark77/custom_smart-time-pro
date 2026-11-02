package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ThirdPlatform {

    @aa1
    private String accessToken;
    private long createTime;

    @aa1
    private String extInfo;

    /* JADX INFO: renamed from: id */
    @aa1
    private String f51325id;

    @aa1
    private String openId;

    @aa1
    private String platform;
    private int projectId;
    private int replaced;

    @aa1
    private String unionId;
    private long updateTime;

    public ThirdPlatform() {
        this(null, 0, null, 0, null, null, null, null, 0L, 0L, 1023, null);
    }

    public static /* synthetic */ ThirdPlatform copy$default(ThirdPlatform thirdPlatform, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, long j, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = thirdPlatform.f51325id;
        }
        if ((i3 & 2) != 0) {
            i = thirdPlatform.projectId;
        }
        if ((i3 & 4) != 0) {
            str2 = thirdPlatform.platform;
        }
        if ((i3 & 8) != 0) {
            i2 = thirdPlatform.replaced;
        }
        if ((i3 & 16) != 0) {
            str3 = thirdPlatform.openId;
        }
        if ((i3 & 32) != 0) {
            str4 = thirdPlatform.accessToken;
        }
        if ((i3 & 64) != 0) {
            str5 = thirdPlatform.extInfo;
        }
        if ((i3 & 128) != 0) {
            str6 = thirdPlatform.unionId;
        }
        if ((i3 & 256) != 0) {
            j = thirdPlatform.createTime;
        }
        if ((i3 & 512) != 0) {
            j2 = thirdPlatform.updateTime;
        }
        long j3 = j2;
        long j4 = j;
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return thirdPlatform.copy(str, i, str2, i2, str9, str10, str7, str8, j4, j3);
    }

    @aa1
    public final String component1() {
        return this.f51325id;
    }

    public final long component10() {
        return this.updateTime;
    }

    public final int component2() {
        return this.projectId;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    public final int component4() {
        return this.replaced;
    }

    @aa1
    public final String component5() {
        return this.openId;
    }

    @aa1
    public final String component6() {
        return this.accessToken;
    }

    @aa1
    public final String component7() {
        return this.extInfo;
    }

    @aa1
    public final String component8() {
        return this.unionId;
    }

    public final long component9() {
        return this.createTime;
    }

    @aa1
    public final ThirdPlatform copy(@aa1 String id, int i, @aa1 String platform, int i2, @aa1 String openId, @aa1 String accessToken, @aa1 String extInfo, @aa1 String unionId, long j, long j2) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(openId, "openId");
        Intrinsics.X0O(accessToken, "accessToken");
        Intrinsics.X0O(extInfo, "extInfo");
        Intrinsics.X0O(unionId, "unionId");
        return new ThirdPlatform(id, i, platform, i2, openId, accessToken, extInfo, unionId, j, j2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPlatform)) {
            return false;
        }
        ThirdPlatform thirdPlatform = (ThirdPlatform) obj;
        return Intrinsics.XOO0ii0(this.f51325id, thirdPlatform.f51325id) && this.projectId == thirdPlatform.projectId && Intrinsics.XOO0ii0(this.platform, thirdPlatform.platform) && this.replaced == thirdPlatform.replaced && Intrinsics.XOO0ii0(this.openId, thirdPlatform.openId) && Intrinsics.XOO0ii0(this.accessToken, thirdPlatform.accessToken) && Intrinsics.XOO0ii0(this.extInfo, thirdPlatform.extInfo) && Intrinsics.XOO0ii0(this.unionId, thirdPlatform.unionId) && this.createTime == thirdPlatform.createTime && this.updateTime == thirdPlatform.updateTime;
    }

    @aa1
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @aa1
    public final String getExtInfo() {
        return this.extInfo;
    }

    @aa1
    public final String getId() {
        return this.f51325id;
    }

    @aa1
    public final String getOpenId() {
        return this.openId;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final int getReplaced() {
        return this.replaced;
    }

    @aa1
    public final String getUnionId() {
        return this.unionId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((this.f51325id.hashCode() * 31) + Integer.hashCode(this.projectId)) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.replaced)) * 31) + this.openId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.extInfo.hashCode()) * 31) + this.unionId.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setAccessToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setExtInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.extInfo = str;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f51325id = str;
    }

    public final void setOpenId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.openId = str;
    }

    public final void setPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.platform = str;
    }

    public final void setProjectId(int i) {
        this.projectId = i;
    }

    public final void setReplaced(int i) {
        this.replaced = i;
    }

    public final void setUnionId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.unionId = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @aa1
    public String toString() {
        return "ThirdPlatform(id=" + this.f51325id + ", projectId=" + this.projectId + ", platform=" + this.platform + ", replaced=" + this.replaced + ", openId=" + this.openId + ", accessToken=" + this.accessToken + ", extInfo=" + this.extInfo + ", unionId=" + this.unionId + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + I000IiI1O.C2156iO.f1007iO;
    }

    public ThirdPlatform(@aa1 String id, int i, @aa1 String platform, int i2, @aa1 String openId, @aa1 String accessToken, @aa1 String extInfo, @aa1 String unionId, long j, long j2) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(openId, "openId");
        Intrinsics.X0O(accessToken, "accessToken");
        Intrinsics.X0O(extInfo, "extInfo");
        Intrinsics.X0O(unionId, "unionId");
        this.f51325id = id;
        this.projectId = i;
        this.platform = platform;
        this.replaced = i2;
        this.openId = openId;
        this.accessToken = accessToken;
        this.extInfo = extInfo;
        this.unionId = unionId;
        this.createTime = j;
        this.updateTime = j2;
    }

    public /* synthetic */ ThirdPlatform(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) == 0 ? str6 : "", (i3 & 256) != 0 ? 0L : j, (i3 & 512) != 0 ? 0L : j2);
    }
}
