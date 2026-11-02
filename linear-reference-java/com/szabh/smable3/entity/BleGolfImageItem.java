package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfImageItem {
    private final int distance;
    private final int type;

    public BleGolfImageItem(int r1, int r2) {
        this.type = r1;
        this.distance = r2;
    }

    public static /* synthetic */ BleGolfImageItem copy$default(BleGolfImageItem r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.distance;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.distance;
    }

    @aa1
    public final BleGolfImageItem copy(int r2, int r3) {
        return new BleGolfImageItem(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGolfImageItem) == true) goto L8;
        return false;
    L8:
        BleGolfImageItem r6 = (BleGolfImageItem) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (this.distance == r6.distance) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.distance);
    }

    @aa1
    public String toString() {
        return "BleGolfImageItem(type=" + this.type + ", distance=" + this.distance + HexStringBuilder.COMMENT_END_CHAR;
    }
}
