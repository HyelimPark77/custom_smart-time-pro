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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 80;
    private int mCoursePar;
    private long mDuration;
    private int mHoleCount;
    private float mRating;
    private float mSlope;
    private long mStartTime;
    private long mTotalLength;

    @aa1
    private String mCourseId = "";

    @aa1
    private String mCourseName = "";

    @aa1
    private String mDifficultyName = "";

    @aa1
    private List<BleWatchScoreSegment> mHoleScores = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStartTime = readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDuration = readUInt32(LITTLE_ENDIAN);
        this.mCourseId = BleReadable.readString$default(this, 16, null, 2, null);
        this.mCourseName = BleReadable.readString$default(this, 32, null, 2, null);
        this.mHoleCount = readUInt8();
        this.mDifficultyName = BleReadable.readString$default(this, 8, null, 2, null);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTotalLength = readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSlope = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRating = readFloat(LITTLE_ENDIAN);
        this.mCoursePar = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
        int i = this.mHoleCount;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            BleReadable bleReadable = (BleReadable) BleWatchScoreSegment.class.newInstance();
            bleReadable.setMBytes(readBytes(12));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList.add(bleReadable);
        }
        this.mHoleScores = arrayList;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long j = this.mStartTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeUInt32(j, LITTLE_ENDIAN);
        long j2 = this.mDuration;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeUInt32(j2, LITTLE_ENDIAN);
        String str = this.mCourseId;
        Charset charset = Charsets.IiI10X;
        writeString(str, charset);
        writeString(this.mCourseName, charset);
        writeInt8(this.mHoleCount);
        writeString(this.mDifficultyName, charset);
        long j3 = this.mTotalLength;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeUInt32(j3, LITTLE_ENDIAN);
        float f = this.mSlope;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        float f2 = this.mRating;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN);
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

    public final void setMCourseId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCourseId = str;
    }

    public final void setMCourseName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCourseName = str;
    }

    public final void setMCoursePar(int i) {
        this.mCoursePar = i;
    }

    public final void setMDifficultyName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDifficultyName = str;
    }

    public final void setMDuration(long j) {
        this.mDuration = j;
    }

    public final void setMHoleCount(int i) {
        this.mHoleCount = i;
    }

    public final void setMHoleScores(@aa1 List<BleWatchScoreSegment> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHoleScores = list;
    }

    public final void setMRating(float f) {
        this.mRating = f;
    }

    public final void setMSlope(float f) {
        this.mSlope = f;
    }

    public final void setMStartTime(long j) {
        this.mStartTime = j;
    }

    public final void setMTotalLength(long j) {
        this.mTotalLength = j;
    }

    @aa1
    public String toString() {
        return he5.OiIIX101O("\n            BleGolfWatchScore(mStartTime=" + this.mStartTime + ",mDuration=" + this.mDuration + ",mCourseId=" + this.mCourseId + ",mCourseName=" + this.mCourseName + ",mHoleCount=" + this.mHoleCount + ",mDifficultyName=" + this.mDifficultyName + ",mTotalLength=" + this.mTotalLength + ",mSlope=" + this.mSlope + ",mRating=" + this.mRating + ",mCoursePar=" + this.mCoursePar + ",mHoleScores=" + this.mHoleScores + ")\n        ");
    }
}
