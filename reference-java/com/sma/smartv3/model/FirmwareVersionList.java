package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FirmwareVersionList extends JsonFieldContainer {

    @aa1
    private ArrayList<FirmwareVersion> data;
    private int total;

    /* JADX WARN: Multi-variable type inference failed */
    public FirmwareVersionList() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FirmwareVersionList copy$default(FirmwareVersionList firmwareVersionList, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = firmwareVersionList.total;
        }
        if ((i2 & 2) != 0) {
            arrayList = firmwareVersionList.data;
        }
        return firmwareVersionList.copy(i, arrayList);
    }

    public final int component1() {
        return this.total;
    }

    @aa1
    public final ArrayList<FirmwareVersion> component2() {
        return this.data;
    }

    @aa1
    public final FirmwareVersionList copy(int i, @aa1 ArrayList<FirmwareVersion> data) {
        Intrinsics.X0O(data, "data");
        return new FirmwareVersionList(i, data);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirmwareVersionList)) {
            return false;
        }
        FirmwareVersionList firmwareVersionList = (FirmwareVersionList) obj;
        return this.total == firmwareVersionList.total && Intrinsics.XOO0ii0(this.data, firmwareVersionList.data);
    }

    @aa1
    public final ArrayList<FirmwareVersion> getData() {
        return this.data;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.data.hashCode();
    }

    public final void setData(@aa1 ArrayList<FirmwareVersion> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "FirmwareVersionList(total=" + this.total + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }

    public FirmwareVersionList(int i, @aa1 ArrayList<FirmwareVersion> data) {
        Intrinsics.X0O(data, "data");
        this.total = i;
        this.data = data;
    }

    public /* synthetic */ FirmwareVersionList(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
