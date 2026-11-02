package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CourseType extends JsonFieldContainer implements Serializable {

    @aa1
    private final String createBy;

    @aa1
    private final String createTime;

    /* JADX INFO: renamed from: default */
    @aa1
    private final String f63153default;

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
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CourseType copy$default(CourseType courseType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courseType.dictCode;
        }
        if ((i & 2) != 0) {
            str2 = courseType.dictSort;
        }
        if ((i & 4) != 0) {
            str3 = courseType.dictLabel;
        }
        if ((i & 8) != 0) {
            str4 = courseType.dictValue;
        }
        if ((i & 16) != 0) {
            str5 = courseType.dictType;
        }
        if ((i & 32) != 0) {
            str6 = courseType.f63153default;
        }
        if ((i & 64) != 0) {
            str7 = courseType.status;
        }
        if ((i & 128) != 0) {
            str8 = courseType.createBy;
        }
        if ((i & 256) != 0) {
            str9 = courseType.createTime;
        }
        if ((i & 512) != 0) {
            str10 = courseType.remark;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return courseType.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
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
        return this.f63153default;
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
    public final CourseType copy(@aa1 String dictCode, @aa1 String dictSort, @aa1 String dictLabel, @aa1 String dictValue, @aa1 String dictType, @aa1 String str, @aa1 String status, @aa1 String createBy, @aa1 String createTime, @aa1 String remark) {
        Intrinsics.X0O(dictCode, "dictCode");
        Intrinsics.X0O(dictSort, "dictSort");
        Intrinsics.X0O(dictLabel, "dictLabel");
        Intrinsics.X0O(dictValue, "dictValue");
        Intrinsics.X0O(dictType, "dictType");
        Intrinsics.X0O(str, "default");
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(createBy, "createBy");
        Intrinsics.X0O(createTime, "createTime");
        Intrinsics.X0O(remark, "remark");
        return new CourseType(dictCode, dictSort, dictLabel, dictValue, dictType, str, status, createBy, createTime, remark);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseType)) {
            return false;
        }
        CourseType courseType = (CourseType) obj;
        return Intrinsics.XOO0ii0(this.dictCode, courseType.dictCode) && Intrinsics.XOO0ii0(this.dictSort, courseType.dictSort) && Intrinsics.XOO0ii0(this.dictLabel, courseType.dictLabel) && Intrinsics.XOO0ii0(this.dictValue, courseType.dictValue) && Intrinsics.XOO0ii0(this.dictType, courseType.dictType) && Intrinsics.XOO0ii0(this.f63153default, courseType.f63153default) && Intrinsics.XOO0ii0(this.status, courseType.status) && Intrinsics.XOO0ii0(this.createBy, courseType.createBy) && Intrinsics.XOO0ii0(this.createTime, courseType.createTime) && Intrinsics.XOO0ii0(this.remark, courseType.remark);
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
        return this.f63153default;
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
        return (((((((((((((((((this.dictCode.hashCode() * 31) + this.dictSort.hashCode()) * 31) + this.dictLabel.hashCode()) * 31) + this.dictValue.hashCode()) * 31) + this.dictType.hashCode()) * 31) + this.f63153default.hashCode()) * 31) + this.status.hashCode()) * 31) + this.createBy.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.remark.hashCode();
    }

    @aa1
    public String toString() {
        return "CourseType(dictCode=" + this.dictCode + ", dictSort=" + this.dictSort + ", dictLabel=" + this.dictLabel + ", dictValue=" + this.dictValue + ", dictType=" + this.dictType + ", default=" + this.f63153default + ", status=" + this.status + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", remark=" + this.remark + I000IiI1O.C2156iO.f1007iO;
    }

    public CourseType(@aa1 String dictCode, @aa1 String dictSort, @aa1 String dictLabel, @aa1 String dictValue, @aa1 String dictType, @aa1 String str, @aa1 String status, @aa1 String createBy, @aa1 String createTime, @aa1 String remark) {
        Intrinsics.X0O(dictCode, "dictCode");
        Intrinsics.X0O(dictSort, "dictSort");
        Intrinsics.X0O(dictLabel, "dictLabel");
        Intrinsics.X0O(dictValue, "dictValue");
        Intrinsics.X0O(dictType, "dictType");
        Intrinsics.X0O(str, "default");
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(createBy, "createBy");
        Intrinsics.X0O(createTime, "createTime");
        Intrinsics.X0O(remark, "remark");
        this.dictCode = dictCode;
        this.dictSort = dictSort;
        this.dictLabel = dictLabel;
        this.dictValue = dictValue;
        this.dictType = dictType;
        this.f63153default = str;
        this.status = status;
        this.createBy = createBy;
        this.createTime = createTime;
        this.remark = remark;
    }

    public /* synthetic */ CourseType(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10);
    }
}
