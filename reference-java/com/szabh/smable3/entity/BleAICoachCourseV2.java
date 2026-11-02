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
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BleAICoachCourseV2 copy$default(BleAICoachCourseV2 bleAICoachCourseV2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleAICoachCourseV2.mCourseID;
        }
        if ((i7 & 2) != 0) {
            i2 = bleAICoachCourseV2.mCourseTime;
        }
        if ((i7 & 4) != 0) {
            i3 = bleAICoachCourseV2.mCourseUpperBoundHR;
        }
        if ((i7 & 8) != 0) {
            i4 = bleAICoachCourseV2.mCourseLowerBoundHR;
        }
        if ((i7 & 16) != 0) {
            i5 = bleAICoachCourseV2.mCourseUpperBoundSpeech;
        }
        if ((i7 & 32) != 0) {
            i6 = bleAICoachCourseV2.mCourseLowerBoundSpeech;
        }
        int i8 = i5;
        int i9 = i6;
        return bleAICoachCourseV2.copy(i, i2, i3, i4, i8, i9);
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
    public final BleAICoachCourseV2 copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new BleAICoachCourseV2(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCourseID = readInt8();
        this.mCourseTime = readInt8();
        this.mCourseUpperBoundHR = readInt8();
        this.mCourseLowerBoundHR = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourseUpperBoundSpeech = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCourseLowerBoundSpeech = readInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCourseID);
        writeInt8(this.mCourseTime);
        writeInt8(this.mCourseUpperBoundHR);
        writeInt8(this.mCourseLowerBoundHR);
        int i = this.mCourseUpperBoundSpeech;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        int i2 = this.mCourseLowerBoundSpeech;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachCourseV2)) {
            return false;
        }
        BleAICoachCourseV2 bleAICoachCourseV2 = (BleAICoachCourseV2) obj;
        return this.mCourseID == bleAICoachCourseV2.mCourseID && this.mCourseTime == bleAICoachCourseV2.mCourseTime && this.mCourseUpperBoundHR == bleAICoachCourseV2.mCourseUpperBoundHR && this.mCourseLowerBoundHR == bleAICoachCourseV2.mCourseLowerBoundHR && this.mCourseUpperBoundSpeech == bleAICoachCourseV2.mCourseUpperBoundSpeech && this.mCourseLowerBoundSpeech == bleAICoachCourseV2.mCourseLowerBoundSpeech;
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

    public final void setMCourseID(int i) {
        this.mCourseID = i;
    }

    public final void setMCourseLowerBoundHR(int i) {
        this.mCourseLowerBoundHR = i;
    }

    public final void setMCourseLowerBoundSpeech(int i) {
        this.mCourseLowerBoundSpeech = i;
    }

    public final void setMCourseTime(int i) {
        this.mCourseTime = i;
    }

    public final void setMCourseUpperBoundHR(int i) {
        this.mCourseUpperBoundHR = i;
    }

    public final void setMCourseUpperBoundSpeech(int i) {
        this.mCourseUpperBoundSpeech = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachCourse(mCourseID=" + this.mCourseID + ", mCourseTime=" + this.mCourseTime + ", mCourseUpperBoundHR=" + this.mCourseUpperBoundHR + ",mCourseLowerBoundHR=" + this.mCourseLowerBoundHR + ",mCourseUpperBoundSpeech=" + this.mCourseUpperBoundSpeech + ",mCourseLowerBoundSpeech=" + this.mCourseLowerBoundSpeech + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachCourseV2(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mCourseID = i;
        this.mCourseTime = i2;
        this.mCourseUpperBoundHR = i3;
        this.mCourseLowerBoundHR = i4;
        this.mCourseUpperBoundSpeech = i5;
        this.mCourseLowerBoundSpeech = i6;
    }

    public /* synthetic */ BleAICoachCourseV2(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
