package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfScore extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 8;
    private int mGreensweepingRate;
    private int mIsToEnterTheLane;
    private int mMapId;
    private int mNumberOfPutts;
    private int mTime;
    private int mTotalNumberOfSwings;
    private int mTotalPar;

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

    public BleGolfScore() {
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMapId = readUInt8();
        this.mTotalNumberOfSwings = readUInt8();
        this.mNumberOfPutts = readUInt8();
        this.mIsToEnterTheLane = readUInt8();
        this.mGreensweepingRate = readUInt8();
        this.mTotalPar = BleReadable.readUInt16$default(this, null, 1, null);
        readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMapId);
        writeInt8(this.mTotalNumberOfSwings);
        writeInt8(this.mNumberOfPutts);
        writeInt8(this.mIsToEnterTheLane);
        writeInt8(this.mGreensweepingRate);
        BleWritable.writeInt16$default(this, this.mTotalPar, null, 2, null);
        writeInt8(0);
    }

    public final int getMGreensweepingRate() {
        return this.mGreensweepingRate;
    }

    public final int getMIsToEnterTheLane() {
        return this.mIsToEnterTheLane;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMMapId() {
        return this.mMapId;
    }

    public final int getMNumberOfPutts() {
        return this.mNumberOfPutts;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMTotalNumberOfSwings() {
        return this.mTotalNumberOfSwings;
    }

    public final int getMTotalPar() {
        return this.mTotalPar;
    }

    public final void setMGreensweepingRate(int r1) {
        this.mGreensweepingRate = r1;
    }

    public final void setMIsToEnterTheLane(int r1) {
        this.mIsToEnterTheLane = r1;
    }

    public final void setMMapId(int r1) {
        this.mMapId = r1;
    }

    public final void setMNumberOfPutts(int r1) {
        this.mNumberOfPutts = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMTotalNumberOfSwings(int r1) {
        this.mTotalNumberOfSwings = r1;
    }

    public final void setMTotalPar(int r1) {
        this.mTotalPar = r1;
    }

    @aa1
    public String toString() {
        return "BleGolfScore(mMapId=" + this.mMapId + ", mTotalNumberOfSwings=" + this.mTotalNumberOfSwings + ",mNumberOfPutts=" + this.mNumberOfPutts + " mIsToEnterTheLane=" + this.mIsToEnterTheLane + " mGreensweepingRate=" + this.mGreensweepingRate + " mTotalPar=" + this.mTotalPar + "  )";
    }
}
