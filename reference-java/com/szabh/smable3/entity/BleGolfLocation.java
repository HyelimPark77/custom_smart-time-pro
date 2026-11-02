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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 12;
    private int mBack;
    private int mCenter;
    private int mElevation;
    private int mFront;
    private int mMapIndex;

    @aa1
    private ArrayList<BleGolfImageItem> mBanker = new ArrayList<>();

    @aa1
    private ArrayList<BleGolfImageItem> mWater = new ArrayList<>();

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
        writeInt8(this.mElevation);
        writeInt8(this.mMapIndex);
        BleWritable.writeInt16$default(this, this.mFront, null, 2, null);
        BleWritable.writeInt16$default(this, this.mCenter, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBack, null, 2, null);
        BleWritable.writeInt16$default(this, this.mBanker.size(), null, 2, null);
        Iterator<BleGolfImageItem> it = this.mBanker.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            BleGolfImageItem next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            BleGolfImageItem bleGolfImageItem = next;
            writeInt8(bleGolfImageItem.getType());
            BleWritable.writeInt24$default(this, bleGolfImageItem.getDistance(), null, 2, null);
        }
        BleWritable.writeInt16$default(this, this.mWater.size(), null, 2, null);
        Iterator<BleGolfImageItem> it2 = this.mWater.iterator();
        Intrinsics.O10IXXX0X(it2, "iterator(...)");
        while (it2.hasNext()) {
            BleGolfImageItem next2 = it2.next();
            Intrinsics.O10IXXX0X(next2, "next(...)");
            BleGolfImageItem bleGolfImageItem2 = next2;
            writeInt8(bleGolfImageItem2.getType());
            BleWritable.writeInt24$default(this, bleGolfImageItem2.getDistance(), null, 2, null);
        }
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
        return (this.mBanker.size() * 4) + 12 + (this.mWater.size() * 4);
    }

    public final int getMMapIndex() {
        return this.mMapIndex;
    }

    @aa1
    public final ArrayList<BleGolfImageItem> getMWater() {
        return this.mWater;
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

    public final void setMElevation(int i) {
        this.mElevation = i;
    }

    public final void setMFront(int i) {
        this.mFront = i;
    }

    public final void setMMapIndex(int i) {
        this.mMapIndex = i;
    }

    public final void setMWater(@aa1 ArrayList<BleGolfImageItem> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.mWater = arrayList;
    }

    @aa1
    public String toString() {
        return "BleGolfLocation(,mMapIndex=" + this.mMapIndex + ", mElevation=" + this.mElevation + "mFront=" + this.mFront + " mCenter=" + this.mCenter + "mBack=" + this.mBack + " mBanker=" + this.mBanker + " mWater=" + this.mWater + HexStringBuilder.COMMENT_END_CHAR;
    }
}
