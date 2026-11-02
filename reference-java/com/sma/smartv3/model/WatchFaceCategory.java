package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceCategory extends JsonFieldContainer implements Serializable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_BUSINESS = 3;
    public static final int TYPE_CUSTOM = 100;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_EXERCISE = 2;
    public static final int TYPE_ILLUSTRATION = 6;
    public static final int TYPE_MACHINERY = 4;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SIMPLE = 5;

    @aa1
    private final String dir;

    @aa1
    private WatchFaceInfo[] list;
    private final int total;
    private final int type;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WatchFaceCategory(int i, @aa1 String dir, int i2, @aa1 WatchFaceInfo[] list) {
        Intrinsics.X0O(dir, "dir");
        Intrinsics.X0O(list, "list");
        this.type = i;
        this.dir = dir;
        this.total = i2;
        this.list = list;
    }

    public static /* synthetic */ WatchFaceCategory copy$default(WatchFaceCategory watchFaceCategory, int i, String str, int i2, WatchFaceInfo[] watchFaceInfoArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = watchFaceCategory.type;
        }
        if ((i3 & 2) != 0) {
            str = watchFaceCategory.dir;
        }
        if ((i3 & 4) != 0) {
            i2 = watchFaceCategory.total;
        }
        if ((i3 & 8) != 0) {
            watchFaceInfoArr = watchFaceCategory.list;
        }
        return watchFaceCategory.copy(i, str, i2, watchFaceInfoArr);
    }

    public final int component1() {
        return this.type;
    }

    @aa1
    public final String component2() {
        return this.dir;
    }

    public final int component3() {
        return this.total;
    }

    @aa1
    public final WatchFaceInfo[] component4() {
        return this.list;
    }

    @aa1
    public final WatchFaceCategory copy(int i, @aa1 String dir, int i2, @aa1 WatchFaceInfo[] list) {
        Intrinsics.X0O(dir, "dir");
        Intrinsics.X0O(list, "list");
        return new WatchFaceCategory(i, dir, i2, list);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceCategory)) {
            return false;
        }
        WatchFaceCategory watchFaceCategory = (WatchFaceCategory) obj;
        return this.type == watchFaceCategory.type && Intrinsics.XOO0ii0(this.dir, watchFaceCategory.dir) && this.total == watchFaceCategory.total && Intrinsics.XOO0ii0(this.list, watchFaceCategory.list);
    }

    @aa1
    public final String getDir() {
        return this.dir;
    }

    @aa1
    public final WatchFaceInfo[] getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + this.dir.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Arrays.hashCode(this.list);
    }

    public final void setList(@aa1 WatchFaceInfo[] watchFaceInfoArr) {
        Intrinsics.X0O(watchFaceInfoArr, "<set-?>");
        this.list = watchFaceInfoArr;
    }

    @aa1
    public String toString() {
        return "WatchFaceCategory(type=" + this.type + ", dir=" + this.dir + ", total=" + this.total + ", list=" + Arrays.toString(this.list) + I000IiI1O.C2156iO.f1007iO;
    }
}
