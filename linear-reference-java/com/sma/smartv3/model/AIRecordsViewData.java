package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.AIRecords;
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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AIRecordsViewData copy$default(AIRecordsViewData r0, AIRecords r1, AIRecords r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.first;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.last;
    L9:
        return r0.copy(r1, r2);
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
    public final AIRecordsViewData copy(@tb1 AIRecords r2, @tb1 AIRecords r3) {
        return new AIRecordsViewData(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AIRecordsViewData) == true) goto L8;
        return false;
    L8:
        AIRecordsViewData r6 = (AIRecordsViewData) r5;
        if (Intrinsics.XOO0ii0(this.first, r6.first) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.last, r6.last) == true) goto L14;
        return false;
    L14:
        return true;
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
        AIRecords r0 = this.first;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        AIRecords r4 = this.last;
        if (r4 == null) goto L11;
        r1 = r4.hashCode();
    L11:
        return r3 + r1;
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setFirst(@tb1 AIRecords r1) {
        this.first = r1;
    }

    public final void setLast(@tb1 AIRecords r1) {
        this.last = r1;
    }

    @aa1
    public String toString() {
        return "AIRecordsViewData(first=" + this.first + ", last=" + this.last + I000IiI1O.iO.iO;
    }

    public AIRecordsViewData(@tb1 AIRecords r1, @tb1 AIRecords r2) {
        this.first = r1;
        this.last = r2;
    }

    public /* synthetic */ AIRecordsViewData(AIRecords r2, AIRecords r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
