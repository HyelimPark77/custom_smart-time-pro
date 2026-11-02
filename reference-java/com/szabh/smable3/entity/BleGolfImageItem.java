package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfImageItem {
    private final int distance;
    private final int type;

    public BleGolfImageItem(int i, int i2) {
        this.type = i;
        this.distance = i2;
    }

    public static /* synthetic */ BleGolfImageItem copy$default(BleGolfImageItem bleGolfImageItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleGolfImageItem.type;
        }
        if ((i3 & 2) != 0) {
            i2 = bleGolfImageItem.distance;
        }
        return bleGolfImageItem.copy(i, i2);
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.distance;
    }

    @aa1
    public final BleGolfImageItem copy(int i, int i2) {
        return new BleGolfImageItem(i, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGolfImageItem)) {
            return false;
        }
        BleGolfImageItem bleGolfImageItem = (BleGolfImageItem) obj;
        return this.type == bleGolfImageItem.type && this.distance == bleGolfImageItem.distance;
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
