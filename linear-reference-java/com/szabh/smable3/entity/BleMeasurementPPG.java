package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMeasurementPPG extends BleReadable {

    @aa1
    private List<Integer> mPpgData;

    /* JADX WARN: Multi-variable type inference failed */
    public BleMeasurementPPG() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMeasurementPPG copy$default(BleMeasurementPPG r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mPpgData;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mPpgData;
    }

    @aa1
    public final BleMeasurementPPG copy(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mPpgData");
        return new BleMeasurementPPG(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] r0 = getMBytes();     // Catch: Exception -> L6
        int r1 = 0;
        if (r0 == null) goto L8;
        int r2 = r0.length;     // Catch: Exception -> L6
    L9:
        int r3 = r2 / 4;     // Catch: Exception -> L6
    L10:
        if (r1 >= r3) goto L18;
        List<Integer> r4 = this.mPpgData;     // Catch: Exception -> L6
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");     // Catch: Exception -> L6
        r4.add(Integer.valueOf(readInt32(r5)));     // Catch: Exception -> L6
        r1 = r1 + 1;
        goto L10
    L18:
        return;
    L8:
        r2 = 0;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleMeasurementPPG) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mPpgData, ((BleMeasurementPPG) r4).mPpgData) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<Integer> getMPpgData() {
        return this.mPpgData;
    }

    public int hashCode() {
        return this.mPpgData.hashCode();
    }

    public final void setMPpgData(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPpgData = r2;
    }

    @aa1
    public String toString() {
        return "BleMeasurementPPG(mSize=" + this.mPpgData.size() + ", mPpgData=" + this.mPpgData + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurementPPG(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "mPpgData");
        this.mPpgData = r2;
    }

    public /* synthetic */ BleMeasurementPPG(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
