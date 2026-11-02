package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleFirmwareVersionInfoList extends JsonFieldContainer {

    @aa1
    private ArrayList<BleFirmwareInfo> data;
    private int total;

    /* JADX WARN: Multi-variable type inference failed */
    public BleFirmwareVersionInfoList() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleFirmwareVersionInfoList copy$default(BleFirmwareVersionInfoList bleFirmwareVersionInfoList, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleFirmwareVersionInfoList.total;
        }
        if ((i2 & 2) != 0) {
            arrayList = bleFirmwareVersionInfoList.data;
        }
        return bleFirmwareVersionInfoList.copy(i, arrayList);
    }

    public final int component1() {
        return this.total;
    }

    @aa1
    public final ArrayList<BleFirmwareInfo> component2() {
        return this.data;
    }

    @aa1
    public final BleFirmwareVersionInfoList copy(int i, @aa1 ArrayList<BleFirmwareInfo> data) {
        Intrinsics.X0O(data, "data");
        return new BleFirmwareVersionInfoList(i, data);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleFirmwareVersionInfoList)) {
            return false;
        }
        BleFirmwareVersionInfoList bleFirmwareVersionInfoList = (BleFirmwareVersionInfoList) obj;
        return this.total == bleFirmwareVersionInfoList.total && Intrinsics.XOO0ii0(this.data, bleFirmwareVersionInfoList.data);
    }

    @aa1
    public final ArrayList<BleFirmwareInfo> getData() {
        return this.data;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.data.hashCode();
    }

    public final void setData(@aa1 ArrayList<BleFirmwareInfo> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "BleFirmwareVersionInfoList(total=" + this.total + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }

    public BleFirmwareVersionInfoList(int i, @aa1 ArrayList<BleFirmwareInfo> data) {
        Intrinsics.X0O(data, "data");
        this.total = i;
        this.data = data;
    }

    public /* synthetic */ BleFirmwareVersionInfoList(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
