package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfImage extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 36;
    private int greenImageLen;
    private int holeGpsDataImageLen;
    private int mBack;

    @aa1
    private ArrayList<BleGolfImageItem> mBanker;
    private int mCenter;
    private int mFront;
    private int mGreenHeight;

    @aa1
    private byte[] mGreenImageBuffers;
    private int mGreenWidth;
    private int mHoleHeight;
    private int mHoleWidth;
    private int mMapIndex;
    private int mPar;
    private int mTotalMaps;

    @aa1
    private ArrayList<BleGolfImageItem> mWater;

    @aa1
    private byte[] mholeImageBuffers;

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

    public BleGolfImage() {
        this.mBanker = new ArrayList();
        this.mWater = new ArrayList();
        this.mholeImageBuffers = new byte[0];
        this.mGreenImageBuffers = new byte[0];
        this.mPar = 4;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mTotalMaps, null, 2, null);
        writeInt8(this.mMapIndex);
        writeInt8(this.mPar);
        BleWritable.writeInt16$default(this, this.mFront, null, 2, null);
        BleWritable.writeInt16$default(this, this.mCenter, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBack, null, 2, null);
        BleWritable.writeInt32$default(this, this.mholeImageBuffers.length, null, 2, null);
        BleWritable.writeInt16$default(this, this.mHoleHeight, null, 2, null);
        BleWritable.writeInt16$default(this, this.mHoleWidth, null, 2, null);
        BleWritable.writeInt32$default(this, this.mGreenImageBuffers.length, null, 2, null);
        BleWritable.writeInt16$default(this, this.mGreenHeight, null, 2, null);
        BleWritable.writeInt16$default(this, this.mGreenWidth, null, 2, null);
        BleWritable.writeInt32$default(this, this.mBanker.size(), null, 2, null);
        Iterator<BleGolfImageItem> r0 = this.mBanker.iterator();
        Intrinsics.O10IXXX0X(r0, "iterator(...)");
    L4:
        if (r0.hasNext() == false) goto L6;
        BleGolfImageItem r4 = r0.next();
        Intrinsics.O10IXXX0X(r4, "next(...)");
        BleGolfImageItem r5 = r4;
        writeInt8(r5.getType());
        BleWritable.writeInt24$default(this, r5.getDistance(), null, 2, null);
        goto L4
    L6:
        BleWritable.writeInt32$default(this, this.mWater.size(), null, 2, null);
        Iterator<BleGolfImageItem> r1 = this.mWater.iterator();
        Intrinsics.O10IXXX0X(r1, "iterator(...)");
    L8:
        if (r1.hasNext() == false) goto L10;
        BleGolfImageItem r3 = r1.next();
        Intrinsics.O10IXXX0X(r3, "next(...)");
        BleGolfImageItem r6 = r3;
        writeInt8(r6.getType());
        BleWritable.writeInt24$default(this, r6.getDistance(), null, 2, null);
        goto L8
    L10:
        BleWritable.writeBytes$default(this, this.mholeImageBuffers, null, 2, null);
        BleWritable.writeBytes$default(this, this.mGreenImageBuffers, null, 2, null);
    }

    public final int getGreenImageLen() {
        return this.greenImageLen;
    }

    public final int getHoleGpsDataImageLen() {
        return this.holeGpsDataImageLen;
    }

    public final int getMBack() {
        return this.mBack;
    }

    @aa1
    public final ArrayList<BleGolfImageItem> getMBanker() {
        return this.mBanker;
    }

    public final int getMCenter() {
        return this.mCenter;
    }

    public final int getMFront() {
        return this.mFront;
    }

    public final int getMGreenHeight() {
        return this.mGreenHeight;
    }

    @aa1
    public final byte[] getMGreenImageBuffers() {
        return this.mGreenImageBuffers;
    }

    public final int getMGreenWidth() {
        return this.mGreenWidth;
    }

    public final int getMHoleHeight() {
        return this.mHoleHeight;
    }

    public final int getMHoleWidth() {
        return this.mHoleWidth;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (((this.mholeImageBuffers.length + 36) + this.mGreenImageBuffers.length) + (this.mBanker.size() * 4)) + (this.mWater.size() * 4);
    }

    public final int getMMapIndex() {
        return this.mMapIndex;
    }

    public final int getMPar() {
        return this.mPar;
    }

    public final int getMTotalMaps() {
        return this.mTotalMaps;
    }

    @aa1
    public final ArrayList<BleGolfImageItem> getMWater() {
        return this.mWater;
    }

    @aa1
    public final byte[] getMholeImageBuffers() {
        return this.mholeImageBuffers;
    }

    public final void setGreenImageLen(int r1) {
        this.greenImageLen = r1;
    }

    public final void setHoleGpsDataImageLen(int r1) {
        this.holeGpsDataImageLen = r1;
    }

    public final void setMBack(int r1) {
        this.mBack = r1;
    }

    public final void setMBanker(@aa1 ArrayList<BleGolfImageItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBanker = r2;
    }

    public final void setMCenter(int r1) {
        this.mCenter = r1;
    }

    public final void setMFront(int r1) {
        this.mFront = r1;
    }

    public final void setMGreenHeight(int r1) {
        this.mGreenHeight = r1;
    }

    public final void setMGreenImageBuffers(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGreenImageBuffers = r2;
    }

    public final void setMGreenWidth(int r1) {
        this.mGreenWidth = r1;
    }

    public final void setMHoleHeight(int r1) {
        this.mHoleHeight = r1;
    }

    public final void setMHoleWidth(int r1) {
        this.mHoleWidth = r1;
    }

    public final void setMMapIndex(int r1) {
        this.mMapIndex = r1;
    }

    public final void setMPar(int r1) {
        this.mPar = r1;
    }

    public final void setMTotalMaps(int r1) {
        this.mTotalMaps = r1;
    }

    public final void setMWater(@aa1 ArrayList<BleGolfImageItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWater = r2;
    }

    public final void setMholeImageBuffers(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mholeImageBuffers = r2;
    }

    @aa1
    public String toString() {
        return "BleGolfImage(mTotalMaps=" + this.mTotalMaps + ",mMapIndex=" + this.mMapIndex + ", mPar=" + this.mPar + ", mFront=" + this.mFront + " mCenter=" + this.mCenter + "mBack=" + this.mBack + " mholeImageBuffers.size=" + this.mholeImageBuffers.length + " mHoleWidth=" + this.mHoleWidth + " mHoleHeight=" + this.mHoleHeight + " mGreenImageBuffers.size=" + this.mGreenImageBuffers.length + " mGreenWidth=" + this.mGreenWidth + " mGreenHeight=" + this.mGreenHeight + " mBanker.size=" + this.mBanker.size() + " mWater.size=" + this.mWater.size() + HexStringBuilder.COMMENT_END_CHAR;
    }
}
