package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourSelectByType extends JsonFieldContainer implements Serializable {

    @aa1
    private final String dictCode;

    @aa1
    private final String dictLabel;

    @aa1
    private final String dictSort;

    @aa1
    private final String dictType;

    @aa1
    private final String dictValue;

    public CourSelectByType() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ CourSelectByType copy$default(CourSelectByType r0, String r1, String r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.dictCode;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.dictSort;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.dictLabel;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.dictValue;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.dictType;
    L17:
        String r8 = r4;
        String r9 = r5;
        String r10 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    @aa1
    public final String component1() {
        return this.dictCode;
    }

    @aa1
    public final String component2() {
        return this.dictSort;
    }

    @aa1
    public final String component3() {
        return this.dictLabel;
    }

    @aa1
    public final String component4() {
        return this.dictValue;
    }

    @aa1
    public final String component5() {
        return this.dictType;
    }

    @aa1
    public final CourSelectByType copy(@aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r8, "dictCode");
        Intrinsics.X0O(r9, "dictSort");
        Intrinsics.X0O(r10, "dictLabel");
        Intrinsics.X0O(r11, "dictValue");
        Intrinsics.X0O(r12, "dictType");
        return new CourSelectByType(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CourSelectByType) == true) goto L8;
        return false;
    L8:
        CourSelectByType r6 = (CourSelectByType) r5;
        if (Intrinsics.XOO0ii0(this.dictCode, r6.dictCode) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dictSort, r6.dictSort) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.dictLabel, r6.dictLabel) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.dictValue, r6.dictValue) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.dictType, r6.dictType) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getDictCode() {
        return this.dictCode;
    }

    @aa1
    public final String getDictLabel() {
        return this.dictLabel;
    }

    @aa1
    public final String getDictSort() {
        return this.dictSort;
    }

    @aa1
    public final String getDictType() {
        return this.dictType;
    }

    @aa1
    public final String getDictValue() {
        return this.dictValue;
    }

    public int hashCode() {
        return (((((((this.dictCode.hashCode() * 31) + this.dictSort.hashCode()) * 31) + this.dictLabel.hashCode()) * 31) + this.dictValue.hashCode()) * 31) + this.dictType.hashCode();
    }

    @aa1
    public String toString() {
        return "CourSelectByType(dictCode=" + this.dictCode + ", dictSort=" + this.dictSort + ", dictLabel=" + this.dictLabel + ", dictValue=" + this.dictValue + ", dictType=" + this.dictType + I000IiI1O.iO.iO;
    }

    public CourSelectByType(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r2, "dictCode");
        Intrinsics.X0O(r3, "dictSort");
        Intrinsics.X0O(r4, "dictLabel");
        Intrinsics.X0O(r5, "dictValue");
        Intrinsics.X0O(r6, "dictType");
        this.dictCode = r2;
        this.dictSort = r3;
        this.dictLabel = r4;
        this.dictValue = r5;
        this.dictType = r6;
    }

    public /* synthetic */ CourSelectByType(String r2, String r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r9 = "";
    L17:
        String r10 = r5;
        String r11 = r4;
        String r12 = r3;
        this(r2, r12, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
