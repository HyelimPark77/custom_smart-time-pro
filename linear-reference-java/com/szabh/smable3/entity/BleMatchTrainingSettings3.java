package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchTrainingSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchTrainingSettings3.kt\ncom/szabh/smable3/entity/BleMatchTrainingSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class BleMatchTrainingSettings3 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 25;
    private int mFinshRestingTime;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;

    @aa1
    private List<Integer> mRestingTime;
    private int mRingVolume;
    private int mScreen;
    private int mTrainings;
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

    public BleMatchTrainingSettings3() {
        int r1 = 0;
        int r2 = 0;
        List r3 = null;
        List r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchTrainingSettings3 copy$default(BleMatchTrainingSettings3 r0, int r1, int r2, List r3, List r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mTrainings;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mPeriods;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mPeriodTime;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mRestingTime;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mFinshRestingTime;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mVibration;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mRingVolume;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mScreen;
    L26:
        int r11 = r7;
        int r12 = r8;
        int r13 = r5;
        int r14 = r6;
        List r15 = r3;
        List r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mTrainings;
    }

    public final int component2() {
        return this.mPeriods;
    }

    @aa1
    public final List<Integer> component3() {
        return this.mPeriodTime;
    }

    @aa1
    public final List<Integer> component4() {
        return this.mRestingTime;
    }

    public final int component5() {
        return this.mFinshRestingTime;
    }

    public final int component6() {
        return this.mVibration;
    }

    public final int component7() {
        return this.mRingVolume;
    }

    public final int component8() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchTrainingSettings3 copy(int r11, int r12, @aa1 List<Integer> r13, @aa1 List<Integer> r14, int r15, int r16, int r17, int r18) {
        Intrinsics.X0O(r13, "mPeriodTime");
        Intrinsics.X0O(r14, "mRestingTime");
        return new BleMatchTrainingSettings3(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(9);
        writeInt8(this.mTrainings);
        writeInt8(this.mPeriods);
        int r1 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 9) goto L13;
        List<Integer> r6 = this.mPeriodTime;
        if (r3 >= 0) goto L8;
    L10:
        Integer r7 = 0;
    L11:
        BleWritable.writeInt16$default(this, r7.intValue(), null, 2, null);
        r3 = r3 + 1;
        goto L4
    L8:
        if (r3 >= r6.size()) goto L10;
        r7 = r6.get(r3);
    L13:
        if (r1 >= 8) goto L21;
        List<Integer> r0 = this.mRestingTime;
        if (r1 >= 0) goto L17;
    L19:
        Integer r2 = 0;
    L20:
        BleWritable.writeInt16$default(this, r2.intValue(), null, 2, null);
        r1 = r1 + 1;
        goto L13
    L17:
        if (r1 >= r0.size()) goto L19;
        r2 = r0.get(r1);
        goto L20
    L21:
        BleWritable.writeInt16$default(this, this.mFinshRestingTime, null, 2, null);
        writeInt8(this.mVibration);
        writeInt8(this.mRingVolume);
        writeInt8(this.mScreen);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchTrainingSettings3) == true) goto L8;
        return false;
    L8:
        BleMatchTrainingSettings3 r6 = (BleMatchTrainingSettings3) r5;
        if (this.mTrainings == r6.mTrainings) goto L12;
        return false;
    L12:
        if (this.mPeriods == r6.mPeriods) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mPeriodTime, r6.mPeriodTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mRestingTime, r6.mRestingTime) == true) goto L21;
        return false;
    L21:
        if (this.mFinshRestingTime == r6.mFinshRestingTime) goto L24;
        return false;
    L24:
        if (this.mVibration == r6.mVibration) goto L27;
        return false;
    L27:
        if (this.mRingVolume == r6.mRingVolume) goto L30;
        return false;
    L30:
        if (this.mScreen == r6.mScreen) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMFinshRestingTime() {
        return this.mFinshRestingTime;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 42;
    }

    @aa1
    public final List<Integer> getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMPeriods() {
        return this.mPeriods;
    }

    @aa1
    public final List<Integer> getMRestingTime() {
        return this.mRestingTime;
    }

    public final int getMRingVolume() {
        return this.mRingVolume;
    }

    public final int getMScreen() {
        return this.mScreen;
    }

    public final int getMTrainings() {
        return this.mTrainings;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mTrainings) * 31) + Integer.hashCode(this.mPeriods)) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mRestingTime.hashCode()) * 31) + Integer.hashCode(this.mFinshRestingTime)) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mScreen);
    }

    public final void setMFinshRestingTime(int r1) {
        this.mFinshRestingTime = r1;
    }

    public final void setMPeriodTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodTime = r2;
    }

    public final void setMPeriods(int r1) {
        this.mPeriods = r1;
    }

    public final void setMRestingTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRestingTime = r2;
    }

    public final void setMRingVolume(int r1) {
        this.mRingVolume = r1;
    }

    public final void setMScreen(int r1) {
        this.mScreen = r1;
    }

    public final void setMTrainings(int r1) {
        this.mTrainings = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchTrainingSettings3(mTrainings=" + this.mTrainings + ", mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mRestingTime=" + this.mRestingTime + ", mFinshRestingTime=" + this.mFinshRestingTime + ", mVibration=" + this.mVibration + ", mRingVolume=" + this.mRingVolume + ", mScreen=" + this.mScreen + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchTrainingSettings3(int r2, int r3, @aa1 List<Integer> r4, @aa1 List<Integer> r5, int r6, int r7, int r8, int r9) {
        Intrinsics.X0O(r4, "mPeriodTime");
        Intrinsics.X0O(r5, "mRestingTime");
        this.mTrainings = r2;
        this.mPeriods = r3;
        this.mPeriodTime = r4;
        this.mRestingTime = r5;
        this.mFinshRestingTime = r6;
        this.mVibration = r7;
        this.mRingVolume = r8;
        this.mScreen = r9;
    }

    public /* synthetic */ BleMatchTrainingSettings3(int r2, int r3, List r4, List r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = new ArrayList();
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = new ArrayList();
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L27;
        int r12 = 0;
    L26:
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        List r16 = r5;
        List r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
