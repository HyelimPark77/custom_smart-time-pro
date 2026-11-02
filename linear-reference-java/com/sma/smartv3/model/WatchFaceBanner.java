package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceBanner extends JsonFieldContainer implements Serializable {

    @aa1
    private final String id;
    private final int slideEleId;

    @aa1
    private final String slidePath;

    @aa1
    private final String slideType;

    public WatchFaceBanner() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ WatchFaceBanner copy$default(WatchFaceBanner r0, String r1, String r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.slidePath;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.slideType;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.slideEleId;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.id;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
        return this.id;
    }

    @aa1
    public final WatchFaceBanner copy(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "slidePath");
        Intrinsics.X0O(r3, "slideType");
        Intrinsics.X0O(r5, "id");
        return new WatchFaceBanner(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceBanner) == true) goto L8;
        return false;
    L8:
        WatchFaceBanner r6 = (WatchFaceBanner) r5;
        if (Intrinsics.XOO0ii0(this.slidePath, r6.slidePath) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.slideType, r6.slideType) == true) goto L15;
        return false;
    L15:
        if (this.slideEleId == r6.slideEleId) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getId() {
        return this.id;
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
        return (((((this.slidePath.hashCode() * 31) + this.slideType.hashCode()) * 31) + Integer.hashCode(this.slideEleId)) * 31) + this.id.hashCode();
    }

    @aa1
    public String toString() {
        return "WatchFaceBanner(slidePath=" + this.slidePath + ", slideType=" + this.slideType + ", slideEleId=" + this.slideEleId + ", id=" + this.id + I000IiI1O.iO.iO;
    }

    public WatchFaceBanner(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "slidePath");
        Intrinsics.X0O(r3, "slideType");
        Intrinsics.X0O(r5, "id");
        this.slidePath = r2;
        this.slideType = r3;
        this.slideEleId = r4;
        this.id = r5;
    }

    public /* synthetic */ WatchFaceBanner(String r2, String r3, int r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
