package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.UploadOtaRecord;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseType extends JsonFieldContainer implements Serializable {

    @aa1
    private final String createBy;

    @aa1
    private final String createTime;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @aa1
    private final String f3256default;

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

    @aa1
    private final String remark;

    @aa1
    private final String status;

    public CourseType() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ CourseType copy$default(CourseType r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.dictCode;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.dictSort;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.dictLabel;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.dictValue;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.dictType;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.f3256default;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.status;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.createBy;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.createTime;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.remark;
    L32:
        String r13 = r9;
        String r14 = r10;
        String r15 = r7;
        String r16 = r8;
        String r17 = r5;
        String r18 = r6;
        String r19 = r3;
        String r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @aa1
    public final String component1() {
        return this.dictCode;
    }

    @aa1
    public final String component10() {
        return this.remark;
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
    public final String component6() {
        return this.f3256default;
    }

    @aa1
    public final String component7() {
        return this.status;
    }

    @aa1
    public final String component8() {
        return this.createBy;
    }

    @aa1
    public final String component9() {
        return this.createTime;
    }

    @aa1
    public final CourseType copy(@aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r13, "dictCode");
        Intrinsics.X0O(r14, "dictSort");
        Intrinsics.X0O(r15, "dictLabel");
        Intrinsics.X0O(r16, "dictValue");
        Intrinsics.X0O(r17, "dictType");
        Intrinsics.X0O(r18, "default");
        Intrinsics.X0O(r19, "status");
        Intrinsics.X0O(r20, "createBy");
        Intrinsics.X0O(r21, "createTime");
        Intrinsics.X0O(r22, UploadOtaRecord.REMARK);
        return new CourseType(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CourseType) == true) goto L8;
        return false;
    L8:
        CourseType r6 = (CourseType) r5;
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
        if (Intrinsics.XOO0ii0(this.dictType, r6.dictType) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.f3256default, r6.f3256default) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.status, r6.status) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.createBy, r6.createBy) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.createTime, r6.createTime) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.remark, r6.remark) == true) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getCreateBy() {
        return this.createBy;
    }

    @aa1
    public final String getCreateTime() {
        return this.createTime;
    }

    @aa1
    public final String getDefault() {
        return this.f3256default;
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

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((((((this.dictCode.hashCode() * 31) + this.dictSort.hashCode()) * 31) + this.dictLabel.hashCode()) * 31) + this.dictValue.hashCode()) * 31) + this.dictType.hashCode()) * 31) + this.f3256default.hashCode()) * 31) + this.status.hashCode()) * 31) + this.createBy.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.remark.hashCode();
    }

    @aa1
    public String toString() {
        return "CourseType(dictCode=" + this.dictCode + ", dictSort=" + this.dictSort + ", dictLabel=" + this.dictLabel + ", dictValue=" + this.dictValue + ", dictType=" + this.dictType + ", default=" + this.f3256default + ", status=" + this.status + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", remark=" + this.remark + I000IiI1O.iO.iO;
    }

    public CourseType(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r2, "dictCode");
        Intrinsics.X0O(r3, "dictSort");
        Intrinsics.X0O(r4, "dictLabel");
        Intrinsics.X0O(r5, "dictValue");
        Intrinsics.X0O(r6, "dictType");
        Intrinsics.X0O(r7, "default");
        Intrinsics.X0O(r8, "status");
        Intrinsics.X0O(r9, "createBy");
        Intrinsics.X0O(r10, "createTime");
        Intrinsics.X0O(r11, UploadOtaRecord.REMARK);
        this.dictCode = r2;
        this.dictSort = r3;
        this.dictLabel = r4;
        this.dictValue = r5;
        this.dictType = r6;
        this.f3256default = r7;
        this.status = r8;
        this.createBy = r9;
        this.createTime = r10;
        this.remark = r11;
    }

    public /* synthetic */ CourseType(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r14 = "";
    L32:
        String r15 = r10;
        String r16 = r9;
        String r17 = r8;
        String r18 = r7;
        String r19 = r6;
        String r20 = r5;
        String r21 = r4;
        String r22 = r3;
        this(r2, r22, r21, r20, r19, r18, r17, r16, r15, r14);
        return;
    L33:
        r14 = r11;
        goto L32
    }
}
