package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRealTimeMeasurement extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 1;
    public static final int STATE_DONE = 0;
    public static final int STATE_PAUSE = 1;
    public static final int STATE_START = 2;
    public static final int STATE_STOP_TIP = 3;
    private int mBOSwitch;
    private int mBPSwitch;
    private int mHRSwitch;
    private int mHrvSwitch;
    private int mState;
    private int mStressSwitch;
    private int mTemperature;

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

    public BleRealTimeMeasurement() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleRealTimeMeasurement copy$default(BleRealTimeMeasurement r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mHRSwitch;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mBOSwitch;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mBPSwitch;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mStressSwitch;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mTemperature;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mHrvSwitch;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mState;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mHRSwitch;
    }

    public final int component2() {
        return this.mBOSwitch;
    }

    public final int component3() {
        return this.mBPSwitch;
    }

    public final int component4() {
        return this.mStressSwitch;
    }

    public final int component5() {
        return this.mTemperature;
    }

    public final int component6() {
        return this.mHrvSwitch;
    }

    public final int component7() {
        return this.mState;
    }

    @aa1
    public final BleRealTimeMeasurement copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleRealTimeMeasurement(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readIntN(2);
        this.mHrvSwitch = readIntN(1);
        this.mTemperature = readIntN(1);
        this.mStressSwitch = readIntN(1);
        this.mBPSwitch = readIntN(1);
        this.mBOSwitch = readIntN(1);
        this.mHRSwitch = readIntN(1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.mState, 2);
        writeIntN(this.mHrvSwitch, 1);
        writeIntN(this.mTemperature, 1);
        writeIntN(this.mStressSwitch, 1);
        writeIntN(this.mBPSwitch, 1);
        writeIntN(this.mBOSwitch, 1);
        writeIntN(this.mHRSwitch, 1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleRealTimeMeasurement) == true) goto L8;
        return false;
    L8:
        BleRealTimeMeasurement r6 = (BleRealTimeMeasurement) r5;
        if (this.mHRSwitch == r6.mHRSwitch) goto L12;
        return false;
    L12:
        if (this.mBOSwitch == r6.mBOSwitch) goto L15;
        return false;
    L15:
        if (this.mBPSwitch == r6.mBPSwitch) goto L18;
        return false;
    L18:
        if (this.mStressSwitch == r6.mStressSwitch) goto L21;
        return false;
    L21:
        if (this.mTemperature == r6.mTemperature) goto L24;
        return false;
    L24:
        if (this.mHrvSwitch == r6.mHrvSwitch) goto L27;
        return false;
    L27:
        if (this.mState == r6.mState) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMBOSwitch() {
        return this.mBOSwitch;
    }

    public final int getMBPSwitch() {
        return this.mBPSwitch;
    }

    public final int getMHRSwitch() {
        return this.mHRSwitch;
    }

    public final int getMHrvSwitch() {
        return this.mHrvSwitch;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 1;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMStressSwitch() {
        return this.mStressSwitch;
    }

    public final int getMTemperature() {
        return this.mTemperature;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mHRSwitch) * 31) + Integer.hashCode(this.mBOSwitch)) * 31) + Integer.hashCode(this.mBPSwitch)) * 31) + Integer.hashCode(this.mStressSwitch)) * 31) + Integer.hashCode(this.mTemperature)) * 31) + Integer.hashCode(this.mHrvSwitch)) * 31) + Integer.hashCode(this.mState);
    }

    public final void setMBOSwitch(int r1) {
        this.mBOSwitch = r1;
    }

    public final void setMBPSwitch(int r1) {
        this.mBPSwitch = r1;
    }

    public final void setMHRSwitch(int r1) {
        this.mHRSwitch = r1;
    }

    public final void setMHrvSwitch(int r1) {
        this.mHrvSwitch = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMStressSwitch(int r1) {
        this.mStressSwitch = r1;
    }

    public final void setMTemperature(int r1) {
        this.mTemperature = r1;
    }

    @aa1
    public String toString() {
        return "BleRealTimeMeasurement(mState=" + this.mState + ", mHRSwitch=" + this.mHRSwitch + ", mBOSwitch=" + this.mBOSwitch + ", mBPSwitch=" + this.mBPSwitch + ", mStressSwitch=" + this.mStressSwitch + ", mTemperature=" + this.mTemperature + ", mHrvSwitch=" + this.mHrvSwitch + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRealTimeMeasurement(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mHRSwitch = r1;
        this.mBOSwitch = r2;
        this.mBPSwitch = r3;
        this.mStressSwitch = r4;
        this.mTemperature = r5;
        this.mHrvSwitch = r6;
        this.mState = r7;
    }

    public /* synthetic */ BleRealTimeMeasurement(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
