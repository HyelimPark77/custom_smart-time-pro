package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DcsData extends JsonFieldContainer implements Serializable {

    @aa1
    private final List<DcsStruct> dcs;

    @aa1
    private final DcsTts tts;

    public DcsData(@aa1 List<DcsStruct> r2, @aa1 DcsTts r3) {
        Intrinsics.X0O(r2, "dcs");
        Intrinsics.X0O(r3, "tts");
        this.dcs = r2;
        this.tts = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DcsData copy$default(DcsData r0, List r1, DcsTts r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.dcs;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.tts;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final List<DcsStruct> component1() {
        return this.dcs;
    }

    @aa1
    public final DcsTts component2() {
        return this.tts;
    }

    @aa1
    public final DcsData copy(@aa1 List<DcsStruct> r2, @aa1 DcsTts r3) {
        Intrinsics.X0O(r2, "dcs");
        Intrinsics.X0O(r3, "tts");
        return new DcsData(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DcsData) == true) goto L8;
        return false;
    L8:
        DcsData r6 = (DcsData) r5;
        if (Intrinsics.XOO0ii0(this.dcs, r6.dcs) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.tts, r6.tts) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final List<DcsStruct> getDcs() {
        return this.dcs;
    }

    @aa1
    public final DcsTts getTts() {
        return this.tts;
    }

    public int hashCode() {
        return (this.dcs.hashCode() * 31) + this.tts.hashCode();
    }

    @aa1
    public String toString() {
        return "DcsData(dcs=" + this.dcs + ", tts=" + this.tts + I000IiI1O.iO.iO;
    }
}
