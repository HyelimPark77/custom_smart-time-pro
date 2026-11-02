package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGolfLocation extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 12;
    private int mBack;

    @aa1
    private ArrayList<BleGolfImageItem> mBanker;
    private int mCenter;
    private int mElevation;
    private int mFront;
    private int mMapIndex;

    @aa1
    private ArrayList<BleGolfImageItem> mWater;

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

    public BleGolfLocation() {
        this.mBanker = new ArrayList();
        this.mWater = new ArrayList();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mElevation);
        writeInt8(this.mMapIndex);
        BleWritable.writeInt16$default(this, this.mFront, null, 2, null);
        BleWritable.writeInt16$default(this, this.mCenter, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBack, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBanker.size(), null, 2, null);
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
        BleWritable.writeInt16$default(this, this.mWater.size(), null, 2, null);
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

    public final int getMElevation() {
        return this.mElevation;
    }

    public final int getMFront() {
        return this.mFront;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return ((this.mBanker.size() * 4) + 12) + (this.mWater.size() * 4);
    }

    public final int getMMapIndex() {
        return this.mMapIndex;
    }

    @aa1
    public final ArrayList<BleGolfImageItem> getMWater() {
        return this.mWater;
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

    public final void setMElevation(int r1) {
        this.mElevation = r1;
    }

    public final void setMFront(int r1) {
        this.mFront = r1;
    }

    public final void setMMapIndex(int r1) {
        this.mMapIndex = r1;
    }

    public final void setMWater(@aa1 ArrayList<BleGolfImageItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWater = r2;
    }

    @aa1
    public String toString() {
        return "BleGolfLocation(,mMapIndex=" + this.mMapIndex + ", mElevation=" + this.mElevation + "mFront=" + this.mFront + " mCenter=" + this.mCenter + "mBack=" + this.mBack + " mBanker=" + this.mBanker + " mWater=" + this.mWater + HexStringBuilder.COMMENT_END_CHAR;
    }
}
