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

    public DcsData(@aa1 List<DcsStruct> dcs, @aa1 DcsTts tts) {
        Intrinsics.X0O(dcs, "dcs");
        Intrinsics.X0O(tts, "tts");
        this.dcs = dcs;
        this.tts = tts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DcsData copy$default(DcsData dcsData, List list, DcsTts dcsTts, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dcsData.dcs;
        }
        if ((i & 2) != 0) {
            dcsTts = dcsData.tts;
        }
        return dcsData.copy(list, dcsTts);
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
    public final DcsData copy(@aa1 List<DcsStruct> dcs, @aa1 DcsTts tts) {
        Intrinsics.X0O(dcs, "dcs");
        Intrinsics.X0O(tts, "tts");
        return new DcsData(dcs, tts);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsData)) {
            return false;
        }
        DcsData dcsData = (DcsData) obj;
        return Intrinsics.XOO0ii0(this.dcs, dcsData.dcs) && Intrinsics.XOO0ii0(this.tts, dcsData.tts);
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
        return "DcsData(dcs=" + this.dcs + ", tts=" + this.tts + I000IiI1O.C2156iO.f1007iO;
    }
}
