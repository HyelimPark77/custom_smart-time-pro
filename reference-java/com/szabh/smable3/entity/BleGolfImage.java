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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 36;
    private int greenImageLen;
    private int holeGpsDataImageLen;
    private int mBack;
    private int mCenter;
    private int mFront;
    private int mGreenHeight;
    private int mGreenWidth;
    private int mHoleHeight;
    private int mHoleWidth;
    private int mMapIndex;
    private int mTotalMaps;

    @aa1
    private ArrayList<BleGolfImageItem> mBanker = new ArrayList<>();

    @aa1
    private ArrayList<BleGolfImageItem> mWater = new ArrayList<>();

    @aa1
    private byte[] mholeImageBuffers = new byte[0];

    @aa1
    private byte[] mGreenImageBuffers = new byte[0];
    private int mPar = 4;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
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
        Iterator<BleGolfImageItem> it = this.mBanker.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            BleGolfImageItem next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            BleGolfImageItem bleGolfImageItem = next;
            writeInt8(bleGolfImageItem.getType());
            BleWritable.writeInt24$default(this, bleGolfImageItem.getDistance(), null, 2, null);
        }
        BleWritable.writeInt32$default(this, this.mWater.size(), null, 2, null);
        Iterator<BleGolfImageItem> it2 = this.mWater.iterator();
        Intrinsics.O10IXXX0X(it2, "iterator(...)");
        while (it2.hasNext()) {
            BleGolfImageItem next2 = it2.next();
            Intrinsics.O10IXXX0X(next2, "next(...)");
            BleGolfImageItem bleGolfImageItem2 = next2;
            writeInt8(bleGolfImageItem2.getType());
            BleWritable.writeInt24$default(this, bleGolfImageItem2.getDistance(), null, 2, null);
        }
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
        return this.mholeImageBuffers.length + 36 + this.mGreenImageBuffers.length + (this.mBanker.size() * 4) + (this.mWater.size() * 4);
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

    public final void setGreenImageLen(int i) {
        this.greenImageLen = i;
    }

    public final void setHoleGpsDataImageLen(int i) {
        this.holeGpsDataImageLen = i;
    }

    public final void setMBack(int i) {
        this.mBack = i;
    }

    public final void setMBanker(@aa1 ArrayList<BleGolfImageItem> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mBanker = arrayList;
    }

    public final void setMCenter(int i) {
        this.mCenter = i;
    }

    public final void setMFront(int i) {
        this.mFront = i;
    }

    public final void setMGreenHeight(int i) {
        this.mGreenHeight = i;
    }

    public final void setMGreenImageBuffers(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mGreenImageBuffers = bArr;
    }

    public final void setMGreenWidth(int i) {
        this.mGreenWidth = i;
    }

    public final void setMHoleHeight(int i) {
        this.mHoleHeight = i;
    }

    public final void setMHoleWidth(int i) {
        this.mHoleWidth = i;
    }

    public final void setMMapIndex(int i) {
        this.mMapIndex = i;
    }

    public final void setMPar(int i) {
        this.mPar = i;
    }

    public final void setMTotalMaps(int i) {
        this.mTotalMaps = i;
    }

    public final void setMWater(@aa1 ArrayList<BleGolfImageItem> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mWater = arrayList;
    }

    public final void setMholeImageBuffers(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mholeImageBuffers = bArr;
    }

    @aa1
    public String toString() {
        return "BleGolfImage(mTotalMaps=" + this.mTotalMaps + ",mMapIndex=" + this.mMapIndex + ", mPar=" + this.mPar + ", mFront=" + this.mFront + " mCenter=" + this.mCenter + "mBack=" + this.mBack + " mholeImageBuffers.size=" + this.mholeImageBuffers.length + " mHoleWidth=" + this.mHoleWidth + " mHoleHeight=" + this.mHoleHeight + " mGreenImageBuffers.size=" + this.mGreenImageBuffers.length + " mGreenWidth=" + this.mGreenWidth + " mGreenHeight=" + this.mGreenHeight + " mBanker.size=" + this.mBanker.size() + " mWater.size=" + this.mWater.size() + HexStringBuilder.COMMENT_END_CHAR;
    }
}
