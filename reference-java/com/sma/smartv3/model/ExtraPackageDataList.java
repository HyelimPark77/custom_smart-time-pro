package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtraPackageDataList extends JsonFieldContainer {

    @aa1
    private ArrayList<ExtraPackageData> data;
    private int total;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtraPackageDataList() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtraPackageDataList copy$default(ExtraPackageDataList extraPackageDataList, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = extraPackageDataList.total;
        }
        if ((i2 & 2) != 0) {
            arrayList = extraPackageDataList.data;
        }
        return extraPackageDataList.copy(i, arrayList);
    }

    public final int component1() {
        return this.total;
    }

    @aa1
    public final ArrayList<ExtraPackageData> component2() {
        return this.data;
    }

    @aa1
    public final ExtraPackageDataList copy(int i, @aa1 ArrayList<ExtraPackageData> data) {
        Intrinsics.X0O(data, "data");
        return new ExtraPackageDataList(i, data);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraPackageDataList)) {
            return false;
        }
        ExtraPackageDataList extraPackageDataList = (ExtraPackageDataList) obj;
        return this.total == extraPackageDataList.total && Intrinsics.XOO0ii0(this.data, extraPackageDataList.data);
    }

    @aa1
    public final ArrayList<ExtraPackageData> getData() {
        return this.data;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.data.hashCode();
    }

    public final void setData(@aa1 ArrayList<ExtraPackageData> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "ExtraPackageDataList(total=" + this.total + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }

    public ExtraPackageDataList(int i, @aa1 ArrayList<ExtraPackageData> data) {
        Intrinsics.X0O(data, "data");
        this.total = i;
        this.data = data;
    }

    public /* synthetic */ ExtraPackageDataList(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
