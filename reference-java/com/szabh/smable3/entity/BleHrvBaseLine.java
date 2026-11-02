package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrvBaseLine extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mMaximumBaseline;
    private int mMinimumBaseline;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleHrvBaseLine() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleHrvBaseLine copy$default(BleHrvBaseLine bleHrvBaseLine, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleHrvBaseLine.mMinimumBaseline;
        }
        if ((i3 & 2) != 0) {
            i2 = bleHrvBaseLine.mMaximumBaseline;
        }
        return bleHrvBaseLine.copy(i, i2);
    }

    public final int component1() {
        return this.mMinimumBaseline;
    }

    public final int component2() {
        return this.mMaximumBaseline;
    }

    @aa1
    public final BleHrvBaseLine copy(int i, int i2) {
        return new BleHrvBaseLine(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMinimumBaseline = readUInt8();
        this.mMaximumBaseline = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHrvBaseLine)) {
            return false;
        }
        BleHrvBaseLine bleHrvBaseLine = (BleHrvBaseLine) obj;
        return this.mMinimumBaseline == bleHrvBaseLine.mMinimumBaseline && this.mMaximumBaseline == bleHrvBaseLine.mMaximumBaseline;
    }

    public final int getMMaximumBaseline() {
        return this.mMaximumBaseline;
    }

    public final int getMMinimumBaseline() {
        return this.mMinimumBaseline;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMinimumBaseline) * 31) + Integer.hashCode(this.mMaximumBaseline);
    }

    public final void setMMaximumBaseline(int i) {
        this.mMaximumBaseline = i;
    }

    public final void setMMinimumBaseline(int i) {
        this.mMinimumBaseline = i;
    }

    @aa1
    public String toString() {
        return "BleHrvBaseLine(mMinimumBaseline=" + this.mMinimumBaseline + ", mMaximumBaseline=" + this.mMaximumBaseline + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrvBaseLine(int i, int i2) {
        this.mMinimumBaseline = i;
        this.mMaximumBaseline = i2;
    }

    public /* synthetic */ BleHrvBaseLine(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
