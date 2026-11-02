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
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CourSelectByType copy$default(CourSelectByType courSelectByType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courSelectByType.dictCode;
        }
        if ((i & 2) != 0) {
            str2 = courSelectByType.dictSort;
        }
        if ((i & 4) != 0) {
            str3 = courSelectByType.dictLabel;
        }
        if ((i & 8) != 0) {
            str4 = courSelectByType.dictValue;
        }
        if ((i & 16) != 0) {
            str5 = courSelectByType.dictType;
        }
        String str6 = str5;
        String str7 = str3;
        return courSelectByType.copy(str, str2, str7, str4, str6);
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
    public final CourSelectByType copy(@aa1 String dictCode, @aa1 String dictSort, @aa1 String dictLabel, @aa1 String dictValue, @aa1 String dictType) {
        Intrinsics.X0O(dictCode, "dictCode");
        Intrinsics.X0O(dictSort, "dictSort");
        Intrinsics.X0O(dictLabel, "dictLabel");
        Intrinsics.X0O(dictValue, "dictValue");
        Intrinsics.X0O(dictType, "dictType");
        return new CourSelectByType(dictCode, dictSort, dictLabel, dictValue, dictType);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourSelectByType)) {
            return false;
        }
        CourSelectByType courSelectByType = (CourSelectByType) obj;
        return Intrinsics.XOO0ii0(this.dictCode, courSelectByType.dictCode) && Intrinsics.XOO0ii0(this.dictSort, courSelectByType.dictSort) && Intrinsics.XOO0ii0(this.dictLabel, courSelectByType.dictLabel) && Intrinsics.XOO0ii0(this.dictValue, courSelectByType.dictValue) && Intrinsics.XOO0ii0(this.dictType, courSelectByType.dictType);
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
        return "CourSelectByType(dictCode=" + this.dictCode + ", dictSort=" + this.dictSort + ", dictLabel=" + this.dictLabel + ", dictValue=" + this.dictValue + ", dictType=" + this.dictType + I000IiI1O.C2156iO.f1007iO;
    }

    public CourSelectByType(@aa1 String dictCode, @aa1 String dictSort, @aa1 String dictLabel, @aa1 String dictValue, @aa1 String dictType) {
        Intrinsics.X0O(dictCode, "dictCode");
        Intrinsics.X0O(dictSort, "dictSort");
        Intrinsics.X0O(dictLabel, "dictLabel");
        Intrinsics.X0O(dictValue, "dictValue");
        Intrinsics.X0O(dictType, "dictType");
        this.dictCode = dictCode;
        this.dictSort = dictSort;
        this.dictLabel = dictLabel;
        this.dictValue = dictValue;
        this.dictType = dictType;
    }

    public /* synthetic */ CourSelectByType(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
