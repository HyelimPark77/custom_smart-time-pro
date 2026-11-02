package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppFileDetail extends JsonFieldContainer implements Serializable {

    @aa1
    private final String appDetailImgs;

    @aa1
    private final String appGroupId;

    @aa1
    private final String appGroupName;

    @aa1
    private final String appModuleName;

    @aa1
    private final String appName;
    private final boolean appNewFlag;

    @tb1
    private final String appPack;

    @aa1
    private final String appPackName;

    @aa1
    private final String appPackVersion;

    @aa1
    private final String appPreImg;
    private final double appSize;

    @aa1
    private final String createdAt;

    /* JADX INFO: renamed from: id */
    private final long f51297id;

    public AppFileDetail() {
        this(null, null, 0.0d, 0L, null, null, null, null, null, null, null, null, false, 8191, null);
    }

    @aa1
    public final String component1() {
        return this.appGroupId;
    }

    @aa1
    public final String component10() {
        return this.appGroupName;
    }

    @aa1
    public final String component11() {
        return this.appModuleName;
    }

    @aa1
    public final String component12() {
        return this.appPackVersion;
    }

    public final boolean component13() {
        return this.appNewFlag;
    }

    @aa1
    public final String component2() {
        return this.appName;
    }

    public final double component3() {
        return this.appSize;
    }

    public final long component4() {
        return this.f51297id;
    }

    @aa1
    public final String component5() {
        return this.createdAt;
    }

    @aa1
    public final String component6() {
        return this.appPreImg;
    }

    @aa1
    public final String component7() {
        return this.appDetailImgs;
    }

    @tb1
    public final String component8() {
        return this.appPack;
    }

    @aa1
    public final String component9() {
        return this.appPackName;
    }

    @aa1
    public final AppFileDetail copy(@aa1 String appGroupId, @aa1 String appName, double d, long j, @aa1 String createdAt, @aa1 String appPreImg, @aa1 String appDetailImgs, @tb1 String str, @aa1 String appPackName, @aa1 String appGroupName, @aa1 String appModuleName, @aa1 String appPackVersion, boolean z) {
        Intrinsics.X0O(appGroupId, "appGroupId");
        Intrinsics.X0O(appName, "appName");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(appPreImg, "appPreImg");
        Intrinsics.X0O(appDetailImgs, "appDetailImgs");
        Intrinsics.X0O(appPackName, "appPackName");
        Intrinsics.X0O(appGroupName, "appGroupName");
        Intrinsics.X0O(appModuleName, "appModuleName");
        Intrinsics.X0O(appPackVersion, "appPackVersion");
        return new AppFileDetail(appGroupId, appName, d, j, createdAt, appPreImg, appDetailImgs, str, appPackName, appGroupName, appModuleName, appPackVersion, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppFileDetail)) {
            return false;
        }
        AppFileDetail appFileDetail = (AppFileDetail) obj;
        return Intrinsics.XOO0ii0(this.appGroupId, appFileDetail.appGroupId) && Intrinsics.XOO0ii0(this.appName, appFileDetail.appName) && Double.compare(this.appSize, appFileDetail.appSize) == 0 && this.f51297id == appFileDetail.f51297id && Intrinsics.XOO0ii0(this.createdAt, appFileDetail.createdAt) && Intrinsics.XOO0ii0(this.appPreImg, appFileDetail.appPreImg) && Intrinsics.XOO0ii0(this.appDetailImgs, appFileDetail.appDetailImgs) && Intrinsics.XOO0ii0(this.appPack, appFileDetail.appPack) && Intrinsics.XOO0ii0(this.appPackName, appFileDetail.appPackName) && Intrinsics.XOO0ii0(this.appGroupName, appFileDetail.appGroupName) && Intrinsics.XOO0ii0(this.appModuleName, appFileDetail.appModuleName) && Intrinsics.XOO0ii0(this.appPackVersion, appFileDetail.appPackVersion) && this.appNewFlag == appFileDetail.appNewFlag;
    }

    @aa1
    public final String getAppDetailImgs() {
        return this.appDetailImgs;
    }

    @aa1
    public final String getAppGroupId() {
        return this.appGroupId;
    }

    @aa1
    public final String getAppGroupName() {
        return this.appGroupName;
    }

    @aa1
    public final String getAppModuleName() {
        return this.appModuleName;
    }

    @aa1
    public final String getAppName() {
        return this.appName;
    }

    public final boolean getAppNewFlag() {
        return this.appNewFlag;
    }

    @tb1
    public final String getAppPack() {
        return this.appPack;
    }

    @aa1
    public final String getAppPackName() {
        return this.appPackName;
    }

    @aa1
    public final String getAppPackVersion() {
        return this.appPackVersion;
    }

    @aa1
    public final String getAppPreImg() {
        return this.appPreImg;
    }

    public final double getAppSize() {
        return this.appSize;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.f51297id;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.appGroupId.hashCode() * 31) + this.appName.hashCode()) * 31) + Double.hashCode(this.appSize)) * 31) + Long.hashCode(this.f51297id)) * 31) + this.createdAt.hashCode()) * 31) + this.appPreImg.hashCode()) * 31) + this.appDetailImgs.hashCode()) * 31;
        String str = this.appPack;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appPackName.hashCode()) * 31) + this.appGroupName.hashCode()) * 31) + this.appModuleName.hashCode()) * 31) + this.appPackVersion.hashCode()) * 31) + Boolean.hashCode(this.appNewFlag);
    }

    @aa1
    public String toString() {
        return "AppFileDetail(appGroupId=" + this.appGroupId + ", appName=" + this.appName + ", appSize=" + this.appSize + ", id=" + this.f51297id + ", createdAt=" + this.createdAt + ", appPreImg=" + this.appPreImg + ", appDetailImgs=" + this.appDetailImgs + ", appPack=" + this.appPack + ", appPackName=" + this.appPackName + ", appGroupName=" + this.appGroupName + ", appModuleName=" + this.appModuleName + ", appPackVersion=" + this.appPackVersion + ", appNewFlag=" + this.appNewFlag + I000IiI1O.C2156iO.f1007iO;
    }

    public AppFileDetail(@aa1 String appGroupId, @aa1 String appName, double d, long j, @aa1 String createdAt, @aa1 String appPreImg, @aa1 String appDetailImgs, @tb1 String str, @aa1 String appPackName, @aa1 String appGroupName, @aa1 String appModuleName, @aa1 String appPackVersion, boolean z) {
        Intrinsics.X0O(appGroupId, "appGroupId");
        Intrinsics.X0O(appName, "appName");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(appPreImg, "appPreImg");
        Intrinsics.X0O(appDetailImgs, "appDetailImgs");
        Intrinsics.X0O(appPackName, "appPackName");
        Intrinsics.X0O(appGroupName, "appGroupName");
        Intrinsics.X0O(appModuleName, "appModuleName");
        Intrinsics.X0O(appPackVersion, "appPackVersion");
        this.appGroupId = appGroupId;
        this.appName = appName;
        this.appSize = d;
        this.f51297id = j;
        this.createdAt = createdAt;
        this.appPreImg = appPreImg;
        this.appDetailImgs = appDetailImgs;
        this.appPack = str;
        this.appPackName = appPackName;
        this.appGroupName = appGroupName;
        this.appModuleName = appModuleName;
        this.appPackVersion = appPackVersion;
        this.appNewFlag = z;
    }

    public /* synthetic */ AppFileDetail(String str, String str2, double d, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? false : z);
    }
}
