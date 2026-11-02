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

    public OnlineWatchFace(int i, @aa1 String time, @tb1 WatchFaceCategory[] watchFaceCategoryArr) {
        Intrinsics.X0O(time, "time");
        this.total = i;
        this.time = time;
        this.categorys = watchFaceCategoryArr;
    }

    public static /* synthetic */ OnlineWatchFace copy$default(OnlineWatchFace onlineWatchFace, int i, String str, WatchFaceCategory[] watchFaceCategoryArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onlineWatchFace.total;
        }
        if ((i2 & 2) != 0) {
            str = onlineWatchFace.time;
        }
        if ((i2 & 4) != 0) {
            watchFaceCategoryArr = onlineWatchFace.categorys;
        }
        return onlineWatchFace.copy(i, str, watchFaceCategoryArr);
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
    public final OnlineWatchFace copy(int i, @aa1 String time, @tb1 WatchFaceCategory[] watchFaceCategoryArr) {
        Intrinsics.X0O(time, "time");
        return new OnlineWatchFace(i, time, watchFaceCategoryArr);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnlineWatchFace)) {
            return false;
        }
        OnlineWatchFace onlineWatchFace = (OnlineWatchFace) obj;
        return this.total == onlineWatchFace.total && Intrinsics.XOO0ii0(this.time, onlineWatchFace.time) && Intrinsics.XOO0ii0(this.categorys, onlineWatchFace.categorys);
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
        int iHashCode = ((Integer.hashCode(this.total) * 31) + this.time.hashCode()) * 31;
        WatchFaceCategory[] watchFaceCategoryArr = this.categorys;
        return iHashCode + (watchFaceCategoryArr == null ? 0 : Arrays.hashCode(watchFaceCategoryArr));
    }

    @aa1
    public String toString() {
        return "OnlineWatchFace(total=" + this.total + ", time=" + this.time + ", categorys=" + Arrays.toString(this.categorys) + I000IiI1O.C2156iO.f1007iO;
    }
}
