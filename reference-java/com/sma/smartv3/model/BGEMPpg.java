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
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMPpg copy$default(BGEMPpg bGEMPpg, Integer[] numArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            numArr = bGEMPpg.ppg;
        }
        if ((i & 2) != 0) {
            str = bGEMPpg.timestamp;
        }
        return bGEMPpg.copy(numArr, str);
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
    public final BGEMPpg copy(@aa1 Integer[] ppg, @aa1 String timestamp) {
        Intrinsics.X0O(ppg, "ppg");
        Intrinsics.X0O(timestamp, "timestamp");
        return new BGEMPpg(ppg, timestamp);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMPpg)) {
            return false;
        }
        BGEMPpg bGEMPpg = (BGEMPpg) obj;
        return Intrinsics.XOO0ii0(this.ppg, bGEMPpg.ppg) && Intrinsics.XOO0ii0(this.timestamp, bGEMPpg.timestamp);
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

    public final void setPpg(@aa1 Integer[] numArr) {
        Intrinsics.X0O(numArr, "<set-?>");
        this.ppg = numArr;
    }

    public final void setTimestamp(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.timestamp = str;
    }

    @aa1
    public String toString() {
        return "BGEMPpg(ppg=" + Arrays.toString(this.ppg) + ", timestamp=" + this.timestamp + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMPpg(@aa1 Integer[] ppg, @aa1 String timestamp) {
        Intrinsics.X0O(ppg, "ppg");
        Intrinsics.X0O(timestamp, "timestamp");
        this.ppg = ppg;
        this.timestamp = timestamp;
    }

    public /* synthetic */ BGEMPpg(Integer[] numArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Integer[0] : numArr, (i & 2) != 0 ? "" : str);
    }
}
