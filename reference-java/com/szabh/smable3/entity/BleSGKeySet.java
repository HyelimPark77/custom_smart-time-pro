package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGKeySet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int TYPE_PHOTO = 0;
    public static final int TYPE_RECORD = 2;
    public static final int TYPE_VIDEO = 1;
    private int mClick;
    private int mClickDouble;
    private int mClickTriple;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSGKeySet() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleSGKeySet copy$default(BleSGKeySet bleSGKeySet, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleSGKeySet.mClick;
        }
        if ((i4 & 2) != 0) {
            i2 = bleSGKeySet.mClickDouble;
        }
        if ((i4 & 4) != 0) {
            i3 = bleSGKeySet.mClickTriple;
        }
        return bleSGKeySet.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mClick;
    }

    public final int component2() {
        return this.mClickDouble;
    }

    public final int component3() {
        return this.mClickTriple;
    }

    @aa1
    public final BleSGKeySet copy(int i, int i2, int i3) {
        return new BleSGKeySet(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mClick = readInt8();
        this.mClickDouble = readInt8();
        this.mClickTriple = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mClick);
        writeInt8(this.mClickDouble);
        writeInt8(this.mClickTriple);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSGKeySet)) {
            return false;
        }
        BleSGKeySet bleSGKeySet = (BleSGKeySet) obj;
        return this.mClick == bleSGKeySet.mClick && this.mClickDouble == bleSGKeySet.mClickDouble && this.mClickTriple == bleSGKeySet.mClickTriple;
    }

    public final int getMClick() {
        return this.mClick;
    }

    public final int getMClickDouble() {
        return this.mClickDouble;
    }

    public final int getMClickTriple() {
        return this.mClickTriple;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mClick) * 31) + Integer.hashCode(this.mClickDouble)) * 31) + Integer.hashCode(this.mClickTriple);
    }

    public final void setMClick(int i) {
        this.mClick = i;
    }

    public final void setMClickDouble(int i) {
        this.mClickDouble = i;
    }

    public final void setMClickTriple(int i) {
        this.mClickTriple = i;
    }

    @aa1
    public String toString() {
        return "BleSGKeySet(mClick=" + this.mClick + ", mClickDouble=" + this.mClickDouble + ", mClickTriple=" + this.mClickTriple + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGKeySet(int i, int i2, int i3) {
        this.mClick = i;
        this.mClickDouble = i2;
        this.mClickTriple = i3;
    }

    public /* synthetic */ BleSGKeySet(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
