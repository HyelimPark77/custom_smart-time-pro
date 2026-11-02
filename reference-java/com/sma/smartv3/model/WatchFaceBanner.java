package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceBanner extends JsonFieldContainer implements Serializable {

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f51328id;
    private final int slideEleId;

    @aa1
    private final String slidePath;

    @aa1
    private final String slideType;

    public WatchFaceBanner() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ WatchFaceBanner copy$default(WatchFaceBanner watchFaceBanner, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = watchFaceBanner.slidePath;
        }
        if ((i2 & 2) != 0) {
            str2 = watchFaceBanner.slideType;
        }
        if ((i2 & 4) != 0) {
            i = watchFaceBanner.slideEleId;
        }
        if ((i2 & 8) != 0) {
            str3 = watchFaceBanner.f51328id;
        }
        return watchFaceBanner.copy(str, str2, i, str3);
    }

    @aa1
    public final String component1() {
        return this.slidePath;
    }

    @aa1
    public final String component2() {
        return this.slideType;
    }

    public final int component3() {
        return this.slideEleId;
    }

    @aa1
    public final String component4() {
        return this.f51328id;
    }

    @aa1
    public final WatchFaceBanner copy(@aa1 String slidePath, @aa1 String slideType, int i, @aa1 String id) {
        Intrinsics.X0O(slidePath, "slidePath");
        Intrinsics.X0O(slideType, "slideType");
        Intrinsics.X0O(id, "id");
        return new WatchFaceBanner(slidePath, slideType, i, id);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceBanner)) {
            return false;
        }
        WatchFaceBanner watchFaceBanner = (WatchFaceBanner) obj;
        return Intrinsics.XOO0ii0(this.slidePath, watchFaceBanner.slidePath) && Intrinsics.XOO0ii0(this.slideType, watchFaceBanner.slideType) && this.slideEleId == watchFaceBanner.slideEleId && Intrinsics.XOO0ii0(this.f51328id, watchFaceBanner.f51328id);
    }

    @aa1
    public final String getId() {
        return this.f51328id;
    }

    public final int getSlideEleId() {
        return this.slideEleId;
    }

    @aa1
    public final String getSlidePath() {
        return this.slidePath;
    }

    @aa1
    public final String getSlideType() {
        return this.slideType;
    }

    public int hashCode() {
        return (((((this.slidePath.hashCode() * 31) + this.slideType.hashCode()) * 31) + Integer.hashCode(this.slideEleId)) * 31) + this.f51328id.hashCode();
    }

    @aa1
    public String toString() {
        return "WatchFaceBanner(slidePath=" + this.slidePath + ", slideType=" + this.slideType + ", slideEleId=" + this.slideEleId + ", id=" + this.f51328id + I000IiI1O.C2156iO.f1007iO;
    }

    public WatchFaceBanner(@aa1 String slidePath, @aa1 String slideType, int i, @aa1 String id) {
        Intrinsics.X0O(slidePath, "slidePath");
        Intrinsics.X0O(slideType, "slideType");
        Intrinsics.X0O(id, "id");
        this.slidePath = slidePath;
        this.slideType = slideType;
        this.slideEleId = i;
        this.f51328id = id;
    }

    public /* synthetic */ WatchFaceBanner(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
