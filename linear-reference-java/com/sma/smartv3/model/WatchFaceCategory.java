package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceCategory extends JsonFieldContainer implements Serializable {

    @aa1
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public WatchFaceCategory(int r2, @aa1 String r3, int r4, @aa1 WatchFaceInfo[] r5) {
        Intrinsics.X0O(r3, MapBundleKey.MapObjKey.OBJ_DIR);
        Intrinsics.X0O(r5, "list");
        this.type = r2;
        this.dir = r3;
        this.total = r4;
        this.list = r5;
    }

    public static /* synthetic */ WatchFaceCategory copy$default(WatchFaceCategory r0, int r1, String r2, int r3, WatchFaceInfo[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.dir;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.total;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.list;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final WatchFaceCategory copy(int r2, @aa1 String r3, int r4, @aa1 WatchFaceInfo[] r5) {
        Intrinsics.X0O(r3, MapBundleKey.MapObjKey.OBJ_DIR);
        Intrinsics.X0O(r5, "list");
        return new WatchFaceCategory(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceCategory) == true) goto L8;
        return false;
    L8:
        WatchFaceCategory r6 = (WatchFaceCategory) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dir, r6.dir) == true) goto L15;
        return false;
    L15:
        if (this.total == r6.total) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.list, r6.list) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setList(@aa1 WatchFaceInfo[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.list = r2;
    }

    @aa1
    public String toString() {
        return "WatchFaceCategory(type=" + this.type + ", dir=" + this.dir + ", total=" + this.total + ", list=" + Arrays.toString(this.list) + I000IiI1O.iO.iO;
    }
}
