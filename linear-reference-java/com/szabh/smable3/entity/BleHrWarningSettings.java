package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrWarningSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mHighSwitch;
    private int mHighValue;
    private int mLowSwitch;
    private int mLowValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleHrWarningSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleHrWarningSettings copy$default(BleHrWarningSettings r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mHighSwitch;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mHighValue;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mLowSwitch;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mLowValue;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mHighSwitch;
    }

    public final int component2() {
        return this.mHighValue;
    }

    public final int component3() {
        return this.mLowSwitch;
    }

    public final int component4() {
        return this.mLowValue;
    }

    @aa1
    public final BleHrWarningSettings copy(int r2, int r3, int r4, int r5) {
        return new BleHrWarningSettings(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mHighSwitch = readUInt8();
        this.mHighValue = readUInt8();
        this.mLowSwitch = readUInt8();
        this.mLowValue = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mHighSwitch);
        writeInt8(this.mHighValue);
        writeInt8(this.mLowSwitch);
        writeInt8(this.mLowValue);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHrWarningSettings) == true) goto L8;
        return false;
    L8:
        BleHrWarningSettings r6 = (BleHrWarningSettings) r5;
        if (this.mHighSwitch == r6.mHighSwitch) goto L12;
        return false;
    L12:
        if (this.mHighValue == r6.mHighValue) goto L15;
        return false;
    L15:
        if (this.mLowSwitch == r6.mLowSwitch) goto L18;
        return false;
    L18:
        if (this.mLowValue == r6.mLowValue) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMHighSwitch() {
        return this.mHighSwitch;
    }

    public final int getMHighValue() {
        return this.mHighValue;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMLowSwitch() {
        return this.mLowSwitch;
    }

    public final int getMLowValue() {
        return this.mLowValue;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mHighSwitch) * 31) + Integer.hashCode(this.mHighValue)) * 31) + Integer.hashCode(this.mLowSwitch)) * 31) + Integer.hashCode(this.mLowValue);
    }

    public final void setMHighSwitch(int r1) {
        this.mHighSwitch = r1;
    }

    public final void setMHighValue(int r1) {
        this.mHighValue = r1;
    }

    public final void setMLowSwitch(int r1) {
        this.mLowSwitch = r1;
    }

    public final void setMLowValue(int r1) {
        this.mLowValue = r1;
    }

    @aa1
    public String toString() {
        return "BleHrWarningSettings(mHighSwitch=" + this.mHighSwitch + ", mHighValue=" + this.mHighValue + ", mLowSwitch=" + this.mLowSwitch + ", mLowValue=" + this.mLowValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrWarningSettings(int r1, int r2, int r3, int r4) {
        this.mHighSwitch = r1;
        this.mHighValue = r2;
        this.mLowSwitch = r3;
        this.mLowValue = r4;
    }

    public /* synthetic */ BleHrWarningSettings(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
