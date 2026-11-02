package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHrLeakData extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mMaxLedCur;
    private int mPreValue;
    private int mPsValue;
    private int mType;

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

    public BleHrLeakData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleHrLeakData copy$default(BleHrLeakData r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mPsValue;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mPreValue;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mMaxLedCur;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mPsValue;
    }

    public final int component3() {
        return this.mPreValue;
    }

    public final int component4() {
        return this.mMaxLedCur;
    }

    @aa1
    public final BleHrLeakData copy(int r2, int r3, int r4, int r5) {
        return new BleHrLeakData(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mPsValue = readUInt8();
        this.mPreValue = readUInt8();
        this.mMaxLedCur = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHrLeakData) == true) goto L8;
        return false;
    L8:
        BleHrLeakData r6 = (BleHrLeakData) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mPsValue == r6.mPsValue) goto L15;
        return false;
    L15:
        if (this.mPreValue == r6.mPreValue) goto L18;
        return false;
    L18:
        if (this.mMaxLedCur == r6.mMaxLedCur) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMMaxLedCur() {
        return this.mMaxLedCur;
    }

    public final int getMPreValue() {
        return this.mPreValue;
    }

    public final int getMPsValue() {
        return this.mPsValue;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mPsValue)) * 31) + Integer.hashCode(this.mPreValue)) * 31) + Integer.hashCode(this.mMaxLedCur);
    }

    public final void setMMaxLedCur(int r1) {
        this.mMaxLedCur = r1;
    }

    public final void setMPreValue(int r1) {
        this.mPreValue = r1;
    }

    public final void setMPsValue(int r1) {
        this.mPsValue = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleHrLeakData(mType=" + this.mType + ", mPsValue=" + this.mPsValue + ", mPreValue=" + this.mPreValue + ", mMaxLedCur=" + this.mMaxLedCur + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrLeakData(int r1, int r2, int r3, int r4) {
        this.mType = r1;
        this.mPsValue = r2;
        this.mPreValue = r3;
        this.mMaxLedCur = r4;
    }

    public /* synthetic */ BleHrLeakData(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
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
