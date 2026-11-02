package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OnlineWatchFace extends JsonFieldContainer implements Serializable {

    @tb1
    private final WatchFaceCategory[] categorys;

    @aa1
    private final String time;
    private final int total;

    public OnlineWatchFace(int r2, @aa1 String r3, @tb1 WatchFaceCategory[] r4) {
        Intrinsics.X0O(r3, "time");
        this.total = r2;
        this.time = r3;
        this.categorys = r4;
    }

    public static /* synthetic */ OnlineWatchFace copy$default(OnlineWatchFace r0, int r1, String r2, WatchFaceCategory[] r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.total;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.time;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.categorys;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.total;
    }

    @aa1
    public final String component2() {
        return this.time;
    }

    @tb1
    public final WatchFaceCategory[] component3() {
        return this.categorys;
    }

    @aa1
    public final OnlineWatchFace copy(int r2, @aa1 String r3, @tb1 WatchFaceCategory[] r4) {
        Intrinsics.X0O(r3, "time");
        return new OnlineWatchFace(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OnlineWatchFace) == true) goto L8;
        return false;
    L8:
        OnlineWatchFace r6 = (OnlineWatchFace) r5;
        if (this.total == r6.total) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.time, r6.time) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.categorys, r6.categorys) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @tb1
    public final WatchFaceCategory[] getCategorys() {
        return this.categorys;
    }

    @aa1
    public final String getTime() {
        return this.time;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int r0 = ((Integer.hashCode(this.total) * 31) + this.time.hashCode()) * 31;
        WatchFaceCategory[] r1 = this.categorys;
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
        return "OnlineWatchFace(total=" + this.total + ", time=" + this.time + ", categorys=" + Arrays.toString(this.categorys) + I000IiI1O.iO.iO;
    }
}
