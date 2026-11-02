package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleFindEarphone extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mLeft;
    private int mRight;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleFindEarphone() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleFindEarphone copy$default(BleFindEarphone bleFindEarphone, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleFindEarphone.mLeft;
        }
        if ((i3 & 2) != 0) {
            i2 = bleFindEarphone.mRight;
        }
        return bleFindEarphone.copy(i, i2);
    }

    public final int component1() {
        return this.mLeft;
    }

    public final int component2() {
        return this.mRight;
    }

    @aa1
    public final BleFindEarphone copy(int i, int i2) {
        return new BleFindEarphone(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mLeft = readInt8();
        this.mRight = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mLeft);
        writeInt8(this.mRight);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleFindEarphone)) {
            return false;
        }
        BleFindEarphone bleFindEarphone = (BleFindEarphone) obj;
        return this.mLeft == bleFindEarphone.mLeft && this.mRight == bleFindEarphone.mRight;
    }

    public final int getMLeft() {
        return this.mLeft;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getMRight() {
        return this.mRight;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mLeft) * 31) + Integer.hashCode(this.mRight);
    }

    public final void setMLeft(int i) {
        this.mLeft = i;
    }

    public final void setMRight(int i) {
        this.mRight = i;
    }

    @aa1
    public String toString() {
        return "BleFindEarphone(mLeft=" + this.mLeft + ", mRight=" + this.mRight + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleFindEarphone(int i, int i2) {
        this.mLeft = i;
        this.mRight = i2;
    }

    public /* synthetic */ BleFindEarphone(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
