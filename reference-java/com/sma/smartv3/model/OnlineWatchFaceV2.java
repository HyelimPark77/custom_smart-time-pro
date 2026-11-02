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

    public OnlineWatchFaceV2(@aa1 String typeId, @aa1 String typeName, @aa1 String typeCssClass, @tb1 WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
        Intrinsics.X0O(typeId, "typeId");
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(typeCssClass, "typeCssClass");
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeCssClass = typeCssClass;
        this.watchFaceList = watchFaceCategoryV2Arr;
    }

    public static /* synthetic */ OnlineWatchFaceV2 copy$default(OnlineWatchFaceV2 onlineWatchFaceV2, String str, String str2, String str3, WatchFaceCategoryV2[] watchFaceCategoryV2Arr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onlineWatchFaceV2.typeId;
        }
        if ((i & 2) != 0) {
            str2 = onlineWatchFaceV2.typeName;
        }
        if ((i & 4) != 0) {
            str3 = onlineWatchFaceV2.typeCssClass;
        }
        if ((i & 8) != 0) {
            watchFaceCategoryV2Arr = onlineWatchFaceV2.watchFaceList;
        }
        return onlineWatchFaceV2.copy(str, str2, str3, watchFaceCategoryV2Arr);
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
    public final OnlineWatchFaceV2 copy(@aa1 String typeId, @aa1 String typeName, @aa1 String typeCssClass, @tb1 WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
        Intrinsics.X0O(typeId, "typeId");
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(typeCssClass, "typeCssClass");
        return new OnlineWatchFaceV2(typeId, typeName, typeCssClass, watchFaceCategoryV2Arr);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnlineWatchFaceV2)) {
            return false;
        }
        OnlineWatchFaceV2 onlineWatchFaceV2 = (OnlineWatchFaceV2) obj;
        return Intrinsics.XOO0ii0(this.typeId, onlineWatchFaceV2.typeId) && Intrinsics.XOO0ii0(this.typeName, onlineWatchFaceV2.typeName) && Intrinsics.XOO0ii0(this.typeCssClass, onlineWatchFaceV2.typeCssClass) && Intrinsics.XOO0ii0(this.watchFaceList, onlineWatchFaceV2.watchFaceList);
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
        int iHashCode = ((((this.typeId.hashCode() * 31) + this.typeName.hashCode()) * 31) + this.typeCssClass.hashCode()) * 31;
        WatchFaceCategoryV2[] watchFaceCategoryV2Arr = this.watchFaceList;
        return iHashCode + (watchFaceCategoryV2Arr == null ? 0 : Arrays.hashCode(watchFaceCategoryV2Arr));
    }

    @aa1
    public String toString() {
        return "OnlineWatchFaceV2(typeId=" + this.typeId + ", typeName=" + this.typeName + ", typeCssClass=" + this.typeCssClass + ", watchFaceList=" + Arrays.toString(this.watchFaceList) + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ OnlineWatchFaceV2(String str, String str2, String str3, WatchFaceCategoryV2[] watchFaceCategoryV2Arr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, watchFaceCategoryV2Arr);
    }
}
