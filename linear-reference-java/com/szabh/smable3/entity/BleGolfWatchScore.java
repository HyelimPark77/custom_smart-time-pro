package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.he5;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleGolfWatchScore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,135:1\n232#2,3:136\n222#2,15:139\n*S KotlinDebug\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n*L\n42#1:136,3\n42#1:139,15\n*E\n"})
public final class BleGolfWatchScore extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 80;

    @aa1
    private String mCourseId;

    @aa1
    private String mCourseName;
    private int mCoursePar;

    @aa1
    private String mDifficultyName;
    private long mDuration;
    private int mHoleCount;

    @aa1
    private List<BleWatchScoreSegment> mHoleScores;
    private float mRating;
    private float mSlope;
    private long mStartTime;
    private long mTotalLength;

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

    public BleGolfWatchScore() {
        this.mCourseId = "";
        this.mCourseName = "";
        this.mDifficultyName = "";
        this.mHoleScores = new ArrayList();
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStartTime = readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDuration = readUInt32(r0);
        this.mCourseId = BleReadable.readString$default(this, 16, null, 2, null);
        this.mCourseName = BleReadable.readString$default(this, 32, null, 2, null);
        this.mHoleCount = readUInt8();
        this.mDifficultyName = BleReadable.readString$default(this, 8, null, 2, null);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTotalLength = readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSlope = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mRating = readFloat(r0);
        this.mCoursePar = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
        int r1 = this.mHoleCount;
        ArrayList r2 = new ArrayList();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        BleReadable r4 = (BleReadable) BleWatchScoreSegment.class.newInstance();
        r4.setMBytes(readBytes(12));
        r4.decode();
        Intrinsics.XXI(r4);
        r2.add(r4);
        r3 = r3 + 1;
        goto L3
    L5:
        this.mHoleScores = r2;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mStartTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r0, r2);
        long r1 = this.mDuration;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r1, r2);
        String r3 = this.mCourseId;
        Charset r4 = Charsets.IiI10X;
        writeString(r3, r4);
        writeString(this.mCourseName, r4);
        writeInt8(this.mHoleCount);
        writeString(this.mDifficultyName, r4);
        long r5 = this.mTotalLength;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r5, r2);
        float r6 = this.mSlope;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeFloat(r6, r2);
        float r7 = this.mRating;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeFloat(r7, r2);
        writeInt8(this.mCoursePar);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
        writeList(this.mHoleScores);
    }

    @aa1
    public final String getMCourseId() {
        return this.mCourseId;
    }

    @aa1
    public final String getMCourseName() {
        return this.mCourseName;
    }

    public final int getMCoursePar() {
        return this.mCoursePar;
    }

    @aa1
    public final String getMDifficultyName() {
        return this.mDifficultyName;
    }

    public final long getMDuration() {
        return this.mDuration;
    }

    public final int getMHoleCount() {
        return this.mHoleCount;
    }

    @aa1
    public final List<BleWatchScoreSegment> getMHoleScores() {
        return this.mHoleScores;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 80;
    }

    public final float getMRating() {
        return this.mRating;
    }

    public final float getMSlope() {
        return this.mSlope;
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    public final long getMTotalLength() {
        return this.mTotalLength;
    }

    public final void setMCourseId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCourseId = r2;
    }

    public final void setMCourseName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCourseName = r2;
    }

    public final void setMCoursePar(int r1) {
        this.mCoursePar = r1;
    }

    public final void setMDifficultyName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDifficultyName = r2;
    }

    public final void setMDuration(long r1) {
        this.mDuration = r1;
    }

    public final void setMHoleCount(int r1) {
        this.mHoleCount = r1;
    }

    public final void setMHoleScores(@aa1 List<BleWatchScoreSegment> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHoleScores = r2;
    }

    public final void setMRating(float r1) {
        this.mRating = r1;
    }

    public final void setMSlope(float r1) {
        this.mSlope = r1;
    }

    public final void setMStartTime(long r1) {
        this.mStartTime = r1;
    }

    public final void setMTotalLength(long r1) {
        this.mTotalLength = r1;
    }

    @aa1
    public String toString() {
        return he5.OiIIX101O("\n            BleGolfWatchScore(mStartTime=" + this.mStartTime + ",mDuration=" + this.mDuration + ",mCourseId=" + this.mCourseId + ",mCourseName=" + this.mCourseName + ",mHoleCount=" + this.mHoleCount + ",mDifficultyName=" + this.mDifficultyName + ",mTotalLength=" + this.mTotalLength + ",mSlope=" + this.mSlope + ",mRating=" + this.mRating + ",mCoursePar=" + this.mCoursePar + ",mHoleScores=" + this.mHoleScores + ")\n        ");
    }
}
