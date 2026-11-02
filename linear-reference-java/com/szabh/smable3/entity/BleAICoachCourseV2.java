package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachCourseV2 extends BleWritable {
    private int mCourseID;
    private int mCourseLowerBoundHR;
    private int mCourseLowerBoundSpeech;
    private int mCourseTime;
    private int mCourseUpperBoundHR;
    private int mCourseUpperBoundSpeech;

    public BleAICoachCourseV2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleAICoachCourseV2 copy$default(BleAICoachCourseV2 r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mCourseID;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mCourseTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mCourseUpperBoundHR;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mCourseLowerBoundHR;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mCourseUpperBoundSpeech;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mCourseLowerBoundSpeech;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mCourseID;
    }

    public final int component2() {
        return this.mCourseTime;
    }

    public final int component3() {
        return this.mCourseUpperBoundHR;
    }

    public final int component4() {
        return this.mCourseLowerBoundHR;
    }

    public final int component5() {
        return this.mCourseUpperBoundSpeech;
    }

    public final int component6() {
        return this.mCourseLowerBoundSpeech;
    }

    @aa1
    public final BleAICoachCourseV2 copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleAICoachCourseV2(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCourseID = readInt8();
        this.mCourseTime = readInt8();
        this.mCourseUpperBoundHR = readInt8();
        this.mCourseLowerBoundHR = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourseUpperBoundSpeech = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCourseLowerBoundSpeech = readInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCourseID);
        writeInt8(this.mCourseTime);
        writeInt8(this.mCourseUpperBoundHR);
        writeInt8(this.mCourseLowerBoundHR);
        int r0 = this.mCourseUpperBoundSpeech;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        int r2 = this.mCourseLowerBoundSpeech;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachCourseV2) == true) goto L8;
        return false;
    L8:
        BleAICoachCourseV2 r6 = (BleAICoachCourseV2) r5;
        if (this.mCourseID == r6.mCourseID) goto L12;
        return false;
    L12:
        if (this.mCourseTime == r6.mCourseTime) goto L15;
        return false;
    L15:
        if (this.mCourseUpperBoundHR == r6.mCourseUpperBoundHR) goto L18;
        return false;
    L18:
        if (this.mCourseLowerBoundHR == r6.mCourseLowerBoundHR) goto L21;
        return false;
    L21:
        if (this.mCourseUpperBoundSpeech == r6.mCourseUpperBoundSpeech) goto L24;
        return false;
    L24:
        if (this.mCourseLowerBoundSpeech == r6.mCourseLowerBoundSpeech) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMCourseID() {
        return this.mCourseID;
    }

    public final int getMCourseLowerBoundHR() {
        return this.mCourseLowerBoundHR;
    }

    public final int getMCourseLowerBoundSpeech() {
        return this.mCourseLowerBoundSpeech;
    }

    public final int getMCourseTime() {
        return this.mCourseTime;
    }

    public final int getMCourseUpperBoundHR() {
        return this.mCourseUpperBoundHR;
    }

    public final int getMCourseUpperBoundSpeech() {
        return this.mCourseUpperBoundSpeech;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mCourseID) * 31) + Integer.hashCode(this.mCourseTime)) * 31) + Integer.hashCode(this.mCourseUpperBoundHR)) * 31) + Integer.hashCode(this.mCourseLowerBoundHR)) * 31) + Integer.hashCode(this.mCourseUpperBoundSpeech)) * 31) + Integer.hashCode(this.mCourseLowerBoundSpeech);
    }

    public final void setMCourseID(int r1) {
        this.mCourseID = r1;
    }

    public final void setMCourseLowerBoundHR(int r1) {
        this.mCourseLowerBoundHR = r1;
    }

    public final void setMCourseLowerBoundSpeech(int r1) {
        this.mCourseLowerBoundSpeech = r1;
    }

    public final void setMCourseTime(int r1) {
        this.mCourseTime = r1;
    }

    public final void setMCourseUpperBoundHR(int r1) {
        this.mCourseUpperBoundHR = r1;
    }

    public final void setMCourseUpperBoundSpeech(int r1) {
        this.mCourseUpperBoundSpeech = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachCourse(mCourseID=" + this.mCourseID + ", mCourseTime=" + this.mCourseTime + ", mCourseUpperBoundHR=" + this.mCourseUpperBoundHR + ",mCourseLowerBoundHR=" + this.mCourseLowerBoundHR + ",mCourseUpperBoundSpeech=" + this.mCourseUpperBoundSpeech + ",mCourseLowerBoundSpeech=" + this.mCourseLowerBoundSpeech + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachCourseV2(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mCourseID = r1;
        this.mCourseTime = r2;
        this.mCourseUpperBoundHR = r3;
        this.mCourseLowerBoundHR = r4;
        this.mCourseUpperBoundSpeech = r5;
        this.mCourseLowerBoundSpeech = r6;
    }

    public /* synthetic */ BleAICoachCourseV2(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
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
