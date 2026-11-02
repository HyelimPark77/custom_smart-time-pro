package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEcg extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;
    private int mTime;
    private int mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleEcg() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleEcg copy$default(BleEcg bleEcg, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleEcg.mTime;
        }
        if ((i3 & 2) != 0) {
            i2 = bleEcg.mValue;
        }
        return bleEcg.copy(i, i2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mValue;
    }

    @aa1
    public final BleEcg copy(int i, int i2) {
        return new BleEcg(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mValue = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEcg)) {
            return false;
        }
        BleEcg bleEcg = (BleEcg) obj;
        return this.mTime == bleEcg.mTime && this.mValue == bleEcg.mValue;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mValue);
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMValue(int i) {
        this.mValue = i;
    }

    @aa1
    public String toString() {
        return "BleEcg(mTime=" + this.mTime + ", mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEcg(int i, int i2) {
        this.mTime = i;
        this.mValue = i2;
    }

    public /* synthetic */ BleEcg(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
