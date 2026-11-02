package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LearnCardDataItem implements Serializable {
    private final int id;
    private boolean isChoose;

    @aa1
    private final String name;
    private final int path;

    @aa1
    private final String size;

    public LearnCardDataItem() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        boolean r4 = false;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ LearnCardDataItem copy$default(LearnCardDataItem r0, int r1, String r2, String r3, boolean r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.size;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.isChoose;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.path;
    L17:
        boolean r8 = r4;
        int r9 = r5;
        String r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.name;
    }

    @aa1
    public final String component3() {
        return this.size;
    }

    public final boolean component4() {
        return this.isChoose;
    }

    public final int component5() {
        return this.path;
    }

    @aa1
    public final LearnCardDataItem copy(int r8, @aa1 String r9, @aa1 String r10, boolean r11, int r12) {
        Intrinsics.X0O(r9, "name");
        Intrinsics.X0O(r10, MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE);
        return new LearnCardDataItem(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LearnCardDataItem) == true) goto L8;
        return false;
    L8:
        LearnCardDataItem r6 = (LearnCardDataItem) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.size, r6.size) == true) goto L18;
        return false;
    L18:
        if (this.isChoose == r6.isChoose) goto L21;
        return false;
    L21:
        if (this.path == r6.path) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final int getPath() {
        return this.path;
    }

    @aa1
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.size.hashCode()) * 31) + Boolean.hashCode(this.isChoose)) * 31) + Integer.hashCode(this.path);
    }

    public final boolean isChoose() {
        return this.isChoose;
    }

    public final void setChoose(boolean r1) {
        this.isChoose = r1;
    }

    @aa1
    public String toString() {
        return "LearnCardDataItem(id=" + this.id + ", name=" + this.name + ", size=" + this.size + ", isChoose=" + this.isChoose + ", path=" + this.path + I000IiI1O.iO.iO;
    }

    public LearnCardDataItem(int r2, @aa1 String r3, @aa1 String r4, boolean r5, int r6) {
        Intrinsics.X0O(r3, "name");
        Intrinsics.X0O(r4, MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE);
        this.id = r2;
        this.name = r3;
        this.size = r4;
        this.isChoose = r5;
        this.path = r6;
    }

    public /* synthetic */ LearnCardDataItem(int r2, String r3, String r4, boolean r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = -1;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "0KB";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = -1;
    L17:
        boolean r10 = r5;
        String r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
