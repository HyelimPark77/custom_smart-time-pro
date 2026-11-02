package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStewingData extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 13;
    private long mDuration;
    private float mEndVoltage;
    private float mStartVoltage;
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

    public BleStewingData() {
        int r1 = 0;
        float r2 = 0.0f;
        float r3 = 0.0f;
        long r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleStewingData copy$default(BleStewingData r0, int r1, float r2, float r3, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mStartVoltage;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mEndVoltage;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r4 = r0.mDuration;
    L14:
        long r8 = r4;
        float r5 = r3;
        int r9 = r1;
        return r0.copy(r9, r2, r5, r8);
    }

    public final int component1() {
        return this.mType;
    }

    public final float component2() {
        return this.mStartVoltage;
    }

    public final float component3() {
        return this.mEndVoltage;
    }

    public final long component4() {
        return this.mDuration;
    }

    @aa1
    public final BleStewingData copy(int r7, float r8, float r9, long r10) {
        return new BleStewingData(r7, r8, r9, r10);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mStartVoltage = BleReadable.readUInt32$default(this, null, 1, null) / 10000.0f;
        this.mEndVoltage = BleReadable.readUInt32$default(this, null, 1, null) / 10000.0f;
        this.mDuration = BleReadable.readUInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleStewingData) == true) goto L8;
        return false;
    L8:
        BleStewingData r9 = (BleStewingData) r8;
        if (this.mType == r9.mType) goto L12;
        return false;
    L12:
        if (Float.compare(this.mStartVoltage, r9.mStartVoltage) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.mEndVoltage, r9.mEndVoltage) == 0) goto L18;
        return false;
    L18:
        if (this.mDuration == r9.mDuration) goto L20;
        return false;
    L20:
        return true;
    }

    public final long getMDuration() {
        return this.mDuration;
    }

    public final float getMEndVoltage() {
        return this.mEndVoltage;
    }

    public final float getMStartVoltage() {
        return this.mStartVoltage;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Float.hashCode(this.mStartVoltage)) * 31) + Float.hashCode(this.mEndVoltage)) * 31) + Long.hashCode(this.mDuration);
    }

    public final void setMDuration(long r1) {
        this.mDuration = r1;
    }

    public final void setMEndVoltage(float r1) {
        this.mEndVoltage = r1;
    }

    public final void setMStartVoltage(float r1) {
        this.mStartVoltage = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleStewingData(mType=" + this.mType + ", mStartVoltage=" + this.mStartVoltage + ", mEndVoltage=" + this.mEndVoltage + ", mDuration=" + this.mDuration + "s)";
    }

    public BleStewingData(int r1, float r2, float r3, long r4) {
        this.mType = r1;
        this.mStartVoltage = r2;
        this.mEndVoltage = r3;
        this.mDuration = r4;
    }

    public /* synthetic */ BleStewingData(int r2, float r3, float r4, long r5, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0f;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        float r6 = r4;
        int r9 = r2;
        this(r9, r3, r6, r5);
    }
}
