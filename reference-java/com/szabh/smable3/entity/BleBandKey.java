package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBandKey extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mClick;
    private int mClickDouble;
    private int mClickTriple;
    private int mKey;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleBandKey() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleBandKey copy$default(BleBandKey bleBandKey, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleBandKey.mClick;
        }
        if ((i5 & 2) != 0) {
            i2 = bleBandKey.mClickDouble;
        }
        if ((i5 & 4) != 0) {
            i3 = bleBandKey.mClickTriple;
        }
        if ((i5 & 8) != 0) {
            i4 = bleBandKey.mKey;
        }
        return bleBandKey.copy(i, i2, i3, i4);
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

    public final int component4() {
        return this.mKey;
    }

    @aa1
    public final BleBandKey copy(int i, int i2, int i3, int i4) {
        return new BleBandKey(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mClick = readInt8();
        this.mClickDouble = readInt8();
        this.mClickTriple = readInt8();
        this.mKey = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBandKey)) {
            return false;
        }
        BleBandKey bleBandKey = (BleBandKey) obj;
        return this.mClick == bleBandKey.mClick && this.mClickDouble == bleBandKey.mClickDouble && this.mClickTriple == bleBandKey.mClickTriple && this.mKey == bleBandKey.mKey;
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

    public final int getMKey() {
        return this.mKey;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mClick) * 31) + Integer.hashCode(this.mClickDouble)) * 31) + Integer.hashCode(this.mClickTriple)) * 31) + Integer.hashCode(this.mKey);
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

    public final void setMKey(int i) {
        this.mKey = i;
    }

    @aa1
    public String toString() {
        return "BleBandKey(mClick=" + this.mClick + ", mClickDouble=" + this.mClickDouble + ", mClickTriple=" + this.mClickTriple + ", mKey=" + this.mKey + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBandKey(int i, int i2, int i3, int i4) {
        this.mClick = i;
        this.mClickDouble = i2;
        this.mClickTriple = i3;
        this.mKey = i4;
    }

    public /* synthetic */ BleBandKey(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
