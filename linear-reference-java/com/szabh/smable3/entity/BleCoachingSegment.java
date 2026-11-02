package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCoachingSegment extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 21;
    private static final int LENGTH_NAME = 15;
    private int mActivity;
    private int mCompletionCondition;
    private int mCompletionValue;
    private int mHrZone;

    @aa1
    private String mName;
    private int mStage;

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

    public BleCoachingSegment() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleCoachingSegment copy$default(BleCoachingSegment r0, int r1, String r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mCompletionCondition;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mName;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mActivity;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mStage;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mCompletionValue;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mHrZone;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mCompletionCondition;
    }

    @aa1
    public final String component2() {
        return this.mName;
    }

    public final int component3() {
        return this.mActivity;
    }

    public final int component4() {
        return this.mStage;
    }

    public final int component5() {
        return this.mCompletionValue;
    }

    public final int component6() {
        return this.mHrZone;
    }

    @aa1
    public final BleCoachingSegment copy(int r9, @aa1 String r10, int r11, int r12, int r13, int r14) {
        Intrinsics.X0O(r10, "mName");
        return new BleCoachingSegment(r9, r10, r11, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStage = readInt8();
        this.mName = BleReadable.readString$default(this, 15, null, 2, null);
        this.mActivity = readInt8();
        this.mCompletionCondition = readInt8();
        this.mCompletionValue = BleReadable.readInt16$default(this, null, 1, null);
        this.mHrZone = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mStage);
        BleWritable.writeStringWithFix$default(this, this.mName, 15, null, 4, null);
        writeInt8(this.mActivity);
        writeInt8(this.mCompletionCondition);
        BleWritable.writeInt16$default(this, this.mCompletionValue, null, 2, null);
        writeInt8(this.mHrZone);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCoachingSegment) == true) goto L8;
        return false;
    L8:
        BleCoachingSegment r6 = (BleCoachingSegment) r5;
        if (this.mCompletionCondition == r6.mCompletionCondition) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L15;
        return false;
    L15:
        if (this.mActivity == r6.mActivity) goto L18;
        return false;
    L18:
        if (this.mStage == r6.mStage) goto L21;
        return false;
    L21:
        if (this.mCompletionValue == r6.mCompletionValue) goto L24;
        return false;
    L24:
        if (this.mHrZone == r6.mHrZone) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMActivity() {
        return this.mActivity;
    }

    public final int getMCompletionCondition() {
        return this.mCompletionCondition;
    }

    public final int getMCompletionValue() {
        return this.mCompletionValue;
    }

    public final int getMHrZone() {
        return this.mHrZone;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 21;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMStage() {
        return this.mStage;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mCompletionCondition) * 31) + this.mName.hashCode()) * 31) + Integer.hashCode(this.mActivity)) * 31) + Integer.hashCode(this.mStage)) * 31) + Integer.hashCode(this.mCompletionValue)) * 31) + Integer.hashCode(this.mHrZone);
    }

    public final void setMActivity(int r1) {
        this.mActivity = r1;
    }

    public final void setMCompletionCondition(int r1) {
        this.mCompletionCondition = r1;
    }

    public final void setMCompletionValue(int r1) {
        this.mCompletionValue = r1;
    }

    public final void setMHrZone(int r1) {
        this.mHrZone = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMStage(int r1) {
        this.mStage = r1;
    }

    @aa1
    public String toString() {
        return "BleCoachingSegment(mCompletionCondition=" + this.mCompletionCondition + ", mName='" + this.mName + "', mActivity=" + this.mActivity + ", mStage=" + this.mStage + ", mCompletionValue=" + this.mCompletionValue + ", mHrZone=" + this.mHrZone + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCoachingSegment(int r2, @aa1 String r3, int r4, int r5, int r6, int r7) {
        Intrinsics.X0O(r3, "mName");
        this.mCompletionCondition = r2;
        this.mName = r3;
        this.mActivity = r4;
        this.mStage = r5;
        this.mCompletionValue = r6;
        this.mHrZone = r7;
    }

    public /* synthetic */ BleCoachingSegment(int r2, String r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
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
