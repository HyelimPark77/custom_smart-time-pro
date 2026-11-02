package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OnlineWatchFaceV2 extends JsonFieldContainer implements Serializable {

    @aa1
    private final String typeCssClass;

    @aa1
    private final String typeId;

    @aa1
    private final String typeName;

    @tb1
    private final WatchFaceCategoryV2[] watchFaceList;

    public OnlineWatchFaceV2(@aa1 String r2, @aa1 String r3, @aa1 String r4, @tb1 WatchFaceCategoryV2[] r5) {
        Intrinsics.X0O(r2, "typeId");
        Intrinsics.X0O(r3, "typeName");
        Intrinsics.X0O(r4, "typeCssClass");
        this.typeId = r2;
        this.typeName = r3;
        this.typeCssClass = r4;
        this.watchFaceList = r5;
    }

    public static /* synthetic */ OnlineWatchFaceV2 copy$default(OnlineWatchFaceV2 r0, String r1, String r2, String r3, WatchFaceCategoryV2[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.typeId;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.typeName;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.typeCssClass;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.watchFaceList;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.typeId;
    }

    @aa1
    public final String component2() {
        return this.typeName;
    }

    @aa1
    public final String component3() {
        return this.typeCssClass;
    }

    @tb1
    public final WatchFaceCategoryV2[] component4() {
        return this.watchFaceList;
    }

    @aa1
    public final OnlineWatchFaceV2 copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @tb1 WatchFaceCategoryV2[] r5) {
        Intrinsics.X0O(r2, "typeId");
        Intrinsics.X0O(r3, "typeName");
        Intrinsics.X0O(r4, "typeCssClass");
        return new OnlineWatchFaceV2(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OnlineWatchFaceV2) == true) goto L8;
        return false;
    L8:
        OnlineWatchFaceV2 r6 = (OnlineWatchFaceV2) r5;
        if (Intrinsics.XOO0ii0(this.typeId, r6.typeId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.typeName, r6.typeName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.typeCssClass, r6.typeCssClass) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.watchFaceList, r6.watchFaceList) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getTypeCssClass() {
        return this.typeCssClass;
    }

    @aa1
    public final String getTypeId() {
        return this.typeId;
    }

    @aa1
    public final String getTypeName() {
        return this.typeName;
    }

    @tb1
    public final WatchFaceCategoryV2[] getWatchFaceList() {
        return this.watchFaceList;
    }

    public int hashCode() {
        int r0 = ((((this.typeId.hashCode() * 31) + this.typeName.hashCode()) * 31) + this.typeCssClass.hashCode()) * 31;
        WatchFaceCategoryV2[] r1 = this.watchFaceList;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = Arrays.hashCode(r1);
        goto L7
    }

    @aa1
    public String toString() {
        return "OnlineWatchFaceV2(typeId=" + this.typeId + ", typeName=" + this.typeName + ", typeCssClass=" + this.typeCssClass + ", watchFaceList=" + Arrays.toString(this.watchFaceList) + I000IiI1O.iO.iO;
    }

    public /* synthetic */ OnlineWatchFaceV2(String r2, String r3, String r4, WatchFaceCategoryV2[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "0";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4, r5);
    }
}
