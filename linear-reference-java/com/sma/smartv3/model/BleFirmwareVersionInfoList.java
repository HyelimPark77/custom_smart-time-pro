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
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleFirmwareVersionInfoList copy$default(BleFirmwareVersionInfoList r0, int r1, ArrayList r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.total;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.data;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.total;
    }

    @aa1
    public final ArrayList<BleFirmwareInfo> component2() {
        return this.data;
    }

    @aa1
    public final BleFirmwareVersionInfoList copy(int r2, @aa1 ArrayList<BleFirmwareInfo> r3) {
        Intrinsics.X0O(r3, "data");
        return new BleFirmwareVersionInfoList(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleFirmwareVersionInfoList) == true) goto L8;
        return false;
    L8:
        BleFirmwareVersionInfoList r6 = (BleFirmwareVersionInfoList) r5;
        if (this.total == r6.total) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.data, r6.data) == true) goto L14;
        return false;
    L14:
        return true;
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

    public final void setData(@aa1 ArrayList<BleFirmwareInfo> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.data = r2;
    }

    public final void setTotal(int r1) {
        this.total = r1;
    }

    @aa1
    public String toString() {
        return "BleFirmwareVersionInfoList(total=" + this.total + ", data=" + this.data + I000IiI1O.iO.iO;
    }

    public BleFirmwareVersionInfoList(int r2, @aa1 ArrayList<BleFirmwareInfo> r3) {
        Intrinsics.X0O(r3, "data");
        this.total = r2;
        this.data = r3;
    }

    public /* synthetic */ BleFirmwareVersionInfoList(int r1, ArrayList r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
