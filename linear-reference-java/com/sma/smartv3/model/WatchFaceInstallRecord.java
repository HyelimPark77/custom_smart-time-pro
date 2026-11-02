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
    private final int id;

    @aa1
    private final String updateAt;
    private final int userId;

    @tb1
    private final WatchFaceCategoryV2 watchFace;

    public WatchFaceInstallRecord(int r2, @tb1 WatchFaceCategoryV2 r3, int r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "createdAt");
        Intrinsics.X0O(r6, "updateAt");
        this.userId = r2;
        this.watchFace = r3;
        this.id = r4;
        this.createdAt = r5;
        this.updateAt = r6;
    }

    public static /* synthetic */ WatchFaceInstallRecord copy$default(WatchFaceInstallRecord r0, int r1, WatchFaceCategoryV2 r2, int r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.userId;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.watchFace;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.id;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.createdAt;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.updateAt;
    L17:
        String r8 = r4;
        String r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.userId;
    }

    @tb1
    public final WatchFaceCategoryV2 component2() {
        return this.watchFace;
    }

    public final int component3() {
        return this.id;
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
    public final WatchFaceInstallRecord copy(int r8, @tb1 WatchFaceCategoryV2 r9, int r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r11, "createdAt");
        Intrinsics.X0O(r12, "updateAt");
        return new WatchFaceInstallRecord(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceInstallRecord) == true) goto L8;
        return false;
    L8:
        WatchFaceInstallRecord r6 = (WatchFaceInstallRecord) r5;
        if (this.userId == r6.userId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.watchFace, r6.watchFace) == true) goto L15;
        return false;
    L15:
        if (this.id == r6.id) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
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
        int r0 = Integer.hashCode(this.userId) * 31;
        WatchFaceCategoryV2 r1 = this.watchFace;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((((((r0 + r2) * 31) + Integer.hashCode(this.id)) * 31) + this.createdAt.hashCode()) * 31) + this.updateAt.hashCode();
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    @aa1
    public String toString() {
        return "WatchFaceInstallRecord(userId=" + this.userId + ", watchFace=" + this.watchFace + ", id=" + this.id + ", createdAt=" + this.createdAt + ", updateAt=" + this.updateAt + I000IiI1O.iO.iO;
    }

    public /* synthetic */ WatchFaceInstallRecord(int r2, WatchFaceCategoryV2 r3, int r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = "";
    L12:
        if ((r7 & 16) == 0) goto L15;
        String r9 = "";
    L16:
        this(r2, r3, r4, r5, r9);
        return;
    L15:
        r9 = r6;
        goto L16
    }
}
