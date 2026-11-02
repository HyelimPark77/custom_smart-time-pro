package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.he5;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWatchScoreSegment extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 12;
    private int mFairwayHit;
    private int mGreenInRegulation;
    private int mHandicap;
    private int mHoleId;
    private int mPar;
    private int mPuttCount;
    private int mReserved;
    private long mStartTime;
    private int mStrokeCount;

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

    public BleWatchScoreSegment() {
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mHoleId = readInt8();
        this.mPar = readUInt8();
        this.mHandicap = readUInt8();
        this.mStrokeCount = readUInt8();
        this.mPuttCount = readUInt8();
        this.mFairwayHit = readUInt8();
        this.mGreenInRegulation = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStartTime = readUInt32(r0);
        this.mReserved = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mHoleId);
        writeInt8(this.mPar);
        writeInt8(this.mHandicap);
        writeInt8(this.mStrokeCount);
        writeInt8(this.mPuttCount);
        writeInt8(this.mFairwayHit);
        writeInt8(this.mGreenInRegulation);
        long r0 = this.mStartTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r0, r2);
        writeInt8(this.mReserved);
    }

    public final int getMFairwayHit() {
        return this.mFairwayHit;
    }

    public final int getMGreenInRegulation() {
        return this.mGreenInRegulation;
    }

    public final int getMHandicap() {
        return this.mHandicap;
    }

    public final int getMHoleId() {
        return this.mHoleId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMPar() {
        return this.mPar;
    }

    public final int getMPuttCount() {
        return this.mPuttCount;
    }

    public final int getMReserved() {
        return this.mReserved;
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    public final int getMStrokeCount() {
        return this.mStrokeCount;
    }

    public final void setMFairwayHit(int r1) {
        this.mFairwayHit = r1;
    }

    public final void setMGreenInRegulation(int r1) {
        this.mGreenInRegulation = r1;
    }

    public final void setMHandicap(int r1) {
        this.mHandicap = r1;
    }

    public final void setMHoleId(int r1) {
        this.mHoleId = r1;
    }

    public final void setMPar(int r1) {
        this.mPar = r1;
    }

    public final void setMPuttCount(int r1) {
        this.mPuttCount = r1;
    }

    public final void setMReserved(int r1) {
        this.mReserved = r1;
    }

    public final void setMStartTime(long r1) {
        this.mStartTime = r1;
    }

    public final void setMStrokeCount(int r1) {
        this.mStrokeCount = r1;
    }

    @aa1
    public String toString() {
        return he5.OiIIX101O("\n            BleWatchScoreSegment(mHoleId=" + this.mHoleId + ",mPar=" + this.mPar + ",mHandicap=" + this.mHandicap + ",mStrokeCount=" + this.mStrokeCount + ",mPuttCount=" + this.mPuttCount + ",mFairWayHit=" + this.mFairwayHit + ",mGreenInRegulation=" + this.mGreenInRegulation + ",mReserved=" + this.mReserved + ",mStartTime=" + this.mStartTime + ")\n        ");
    }
}
