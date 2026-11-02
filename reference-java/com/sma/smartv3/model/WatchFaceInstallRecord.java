package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceInstallRecord extends JsonFieldContainer implements Serializable {

    @aa1
    private final String createdAt;

    /* JADX INFO: renamed from: id */
    private final int f51332id;

    @aa1
    private final String updateAt;
    private final int userId;

    @tb1
    private final WatchFaceCategoryV2 watchFace;

    public WatchFaceInstallRecord(int i, @tb1 WatchFaceCategoryV2 watchFaceCategoryV2, int i2, @aa1 String createdAt, @aa1 String updateAt) {
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateAt, "updateAt");
        this.userId = i;
        this.watchFace = watchFaceCategoryV2;
        this.f51332id = i2;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public static /* synthetic */ WatchFaceInstallRecord copy$default(WatchFaceInstallRecord watchFaceInstallRecord, int i, WatchFaceCategoryV2 watchFaceCategoryV2, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = watchFaceInstallRecord.userId;
        }
        if ((i3 & 2) != 0) {
            watchFaceCategoryV2 = watchFaceInstallRecord.watchFace;
        }
        if ((i3 & 4) != 0) {
            i2 = watchFaceInstallRecord.f51332id;
        }
        if ((i3 & 8) != 0) {
            str = watchFaceInstallRecord.createdAt;
        }
        if ((i3 & 16) != 0) {
            str2 = watchFaceInstallRecord.updateAt;
        }
        String str3 = str2;
        int i4 = i2;
        return watchFaceInstallRecord.copy(i, watchFaceCategoryV2, i4, str, str3);
    }

    public final int component1() {
        return this.userId;
    }

    @tb1
    public final WatchFaceCategoryV2 component2() {
        return this.watchFace;
    }

    public final int component3() {
        return this.f51332id;
    }

    @aa1
    public final String component4() {
        return this.createdAt;
    }

    @aa1
    public final String component5() {
        return this.updateAt;
    }

    @aa1
    public final WatchFaceInstallRecord copy(int i, @tb1 WatchFaceCategoryV2 watchFaceCategoryV2, int i2, @aa1 String createdAt, @aa1 String updateAt) {
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateAt, "updateAt");
        return new WatchFaceInstallRecord(i, watchFaceCategoryV2, i2, createdAt, updateAt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceInstallRecord)) {
            return false;
        }
        WatchFaceInstallRecord watchFaceInstallRecord = (WatchFaceInstallRecord) obj;
        return this.userId == watchFaceInstallRecord.userId && Intrinsics.XOO0ii0(this.watchFace, watchFaceInstallRecord.watchFace) && this.f51332id == watchFaceInstallRecord.f51332id && Intrinsics.XOO0ii0(this.createdAt, watchFaceInstallRecord.createdAt) && Intrinsics.XOO0ii0(this.updateAt, watchFaceInstallRecord.updateAt);
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f51332id;
    }

    @aa1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    @tb1
    public final WatchFaceCategoryV2 getWatchFace() {
        return this.watchFace;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.userId) * 31;
        WatchFaceCategoryV2 watchFaceCategoryV2 = this.watchFace;
        return ((((((iHashCode + (watchFaceCategoryV2 == null ? 0 : watchFaceCategoryV2.hashCode())) * 31) + Integer.hashCode(this.f51332id)) * 31) + this.createdAt.hashCode()) * 31) + this.updateAt.hashCode();
    }

    @aa1
    public String toString() {
        return "WatchFaceInstallRecord(userId=" + this.userId + ", watchFace=" + this.watchFace + ", id=" + this.f51332id + ", createdAt=" + this.createdAt + ", updateAt=" + this.updateAt + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ WatchFaceInstallRecord(int i, WatchFaceCategoryV2 watchFaceCategoryV2, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, watchFaceCategoryV2, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2);
    }
}
