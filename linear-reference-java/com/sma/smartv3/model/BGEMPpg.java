package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMPpg extends JsonFieldContainer {

    @aa1
    private Integer[] ppg;

    @aa1
    private String timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public BGEMPpg() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMPpg copy$default(BGEMPpg r0, Integer[] r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.ppg;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.timestamp;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final Integer[] component1() {
        return this.ppg;
    }

    @aa1
    public final String component2() {
        return this.timestamp;
    }

    @aa1
    public final BGEMPpg copy(@aa1 Integer[] r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "ppg");
        Intrinsics.X0O(r3, "timestamp");
        return new BGEMPpg(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMPpg) == true) goto L8;
        return false;
    L8:
        BGEMPpg r6 = (BGEMPpg) r5;
        if (Intrinsics.XOO0ii0(this.ppg, r6.ppg) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.timestamp, r6.timestamp) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final Integer[] getPpg() {
        return this.ppg;
    }

    @aa1
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.ppg) * 31) + this.timestamp.hashCode();
    }

    public final void setPpg(@aa1 Integer[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ppg = r2;
    }

    public final void setTimestamp(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.timestamp = r2;
    }

    @aa1
    public String toString() {
        return "BGEMPpg(ppg=" + Arrays.toString(this.ppg) + ", timestamp=" + this.timestamp + I000IiI1O.iO.iO;
    }

    public BGEMPpg(@aa1 Integer[] r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "ppg");
        Intrinsics.X0O(r3, "timestamp");
        this.ppg = r2;
        this.timestamp = r3;
    }

    public /* synthetic */ BGEMPpg(Integer[] r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = new Integer[0];
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
