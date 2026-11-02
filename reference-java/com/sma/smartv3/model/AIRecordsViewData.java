package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.AIRecords;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIRecordsViewData implements Serializable {

    @tb1
    private AIRecords first;

    @tb1
    private AIRecords last;

    /* JADX WARN: Multi-variable type inference failed */
    public AIRecordsViewData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AIRecordsViewData copy$default(AIRecordsViewData aIRecordsViewData, AIRecords aIRecords, AIRecords aIRecords2, int i, Object obj) {
        if ((i & 1) != 0) {
            aIRecords = aIRecordsViewData.first;
        }
        if ((i & 2) != 0) {
            aIRecords2 = aIRecordsViewData.last;
        }
        return aIRecordsViewData.copy(aIRecords, aIRecords2);
    }

    @tb1
    public final AIRecords component1() {
        return this.first;
    }

    @tb1
    public final AIRecords component2() {
        return this.last;
    }

    @aa1
    public final AIRecordsViewData copy(@tb1 AIRecords aIRecords, @tb1 AIRecords aIRecords2) {
        return new AIRecordsViewData(aIRecords, aIRecords2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRecordsViewData)) {
            return false;
        }
        AIRecordsViewData aIRecordsViewData = (AIRecordsViewData) obj;
        return Intrinsics.XOO0ii0(this.first, aIRecordsViewData.first) && Intrinsics.XOO0ii0(this.last, aIRecordsViewData.last);
    }

    @tb1
    public final AIRecords getFirst() {
        return this.first;
    }

    @tb1
    public final AIRecords getLast() {
        return this.last;
    }

    public int hashCode() {
        AIRecords aIRecords = this.first;
        int iHashCode = (aIRecords == null ? 0 : aIRecords.hashCode()) * 31;
        AIRecords aIRecords2 = this.last;
        return iHashCode + (aIRecords2 != null ? aIRecords2.hashCode() : 0);
    }

    public final void setFirst(@tb1 AIRecords aIRecords) {
        this.first = aIRecords;
    }

    public final void setLast(@tb1 AIRecords aIRecords) {
        this.last = aIRecords;
    }

    @aa1
    public String toString() {
        return "AIRecordsViewData(first=" + this.first + ", last=" + this.last + I000IiI1O.C2156iO.f1007iO;
    }

    public AIRecordsViewData(@tb1 AIRecords aIRecords, @tb1 AIRecords aIRecords2) {
        this.first = aIRecords;
        this.last = aIRecords2;
    }

    public /* synthetic */ AIRecordsViewData(AIRecords aIRecords, AIRecords aIRecords2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aIRecords, (i & 2) != 0 ? null : aIRecords2);
    }
}
