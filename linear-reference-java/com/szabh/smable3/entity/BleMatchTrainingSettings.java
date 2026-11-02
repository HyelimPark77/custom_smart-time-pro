package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchTrainingSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 10;
    private int mFinshRestingTime;
    private int mPeriods;
    private int mRestingTime;
    private int mScreen;
    private int mTrainingTime;
    private int mVibration;

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

    public BleMatchTrainingSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleMatchTrainingSettings copy$default(BleMatchTrainingSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mPeriods;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mTrainingTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mRestingTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mFinshRestingTime;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mVibration;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mScreen;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mPeriods;
    }

    public final int component2() {
        return this.mTrainingTime;
    }

    public final int component3() {
        return this.mRestingTime;
    }

    public final int component4() {
        return this.mFinshRestingTime;
    }

    public final int component5() {
        return this.mVibration;
    }

    public final int component6() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchTrainingSettings copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleMatchTrainingSettings(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(3);
        writeInt8(this.mPeriods);
        BleWritable.writeInt16$default(this, this.mTrainingTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mRestingTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mFinshRestingTime, null, 2, null);
        writeInt8(this.mVibration);
        writeInt8(this.mScreen);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchTrainingSettings) == true) goto L8;
        return false;
    L8:
        BleMatchTrainingSettings r6 = (BleMatchTrainingSettings) r5;
        if (this.mPeriods == r6.mPeriods) goto L12;
        return false;
    L12:
        if (this.mTrainingTime == r6.mTrainingTime) goto L15;
        return false;
    L15:
        if (this.mRestingTime == r6.mRestingTime) goto L18;
        return false;
    L18:
        if (this.mFinshRestingTime == r6.mFinshRestingTime) goto L21;
        return false;
    L21:
        if (this.mVibration == r6.mVibration) goto L24;
        return false;
    L24:
        if (this.mScreen == r6.mScreen) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMFinshRestingTime() {
        return this.mFinshRestingTime;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final int getMPeriods() {
        return this.mPeriods;
    }

    public final int getMRestingTime() {
        return this.mRestingTime;
    }

    public final int getMScreen() {
        return this.mScreen;
    }

    public final int getMTrainingTime() {
        return this.mTrainingTime;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mPeriods) * 31) + Integer.hashCode(this.mTrainingTime)) * 31) + Integer.hashCode(this.mRestingTime)) * 31) + Integer.hashCode(this.mFinshRestingTime)) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mScreen);
    }

    public final void setMFinshRestingTime(int r1) {
        this.mFinshRestingTime = r1;
    }

    public final void setMPeriods(int r1) {
        this.mPeriods = r1;
    }

    public final void setMRestingTime(int r1) {
        this.mRestingTime = r1;
    }

    public final void setMScreen(int r1) {
        this.mScreen = r1;
    }

    public final void setMTrainingTime(int r1) {
        this.mTrainingTime = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchTrainingSettings(mPeriods=" + this.mPeriods + ", mTrainingTime=" + this.mTrainingTime + ", mRestingTime=" + this.mRestingTime + ", mFinshRestingTime=" + this.mFinshRestingTime + ", mVibration=" + this.mVibration + ", mScreen=" + this.mScreen + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchTrainingSettings(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mPeriods = r1;
        this.mTrainingTime = r2;
        this.mRestingTime = r3;
        this.mFinshRestingTime = r4;
        this.mVibration = r5;
        this.mScreen = r6;
    }

    public /* synthetic */ BleMatchTrainingSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
