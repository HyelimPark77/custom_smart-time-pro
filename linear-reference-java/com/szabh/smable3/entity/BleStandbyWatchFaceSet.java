package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleStandbyWatchFaceSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,34:1\n222#2,4:35\n*S KotlinDebug\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n*L\n26#1:35,4\n*E\n"})
public final class BleStandbyWatchFaceSet extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;

    @aa1
    private BleTimeRange mBleTimeRange1;
    private int mEnabled;
    private int mReserved;
    private int mStandbyEnable;

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

    public BleStandbyWatchFaceSet() {
        int r1 = 0;
        int r2 = 0;
        BleTimeRange r3 = null;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleStandbyWatchFaceSet copy$default(BleStandbyWatchFaceSet r0, int r1, int r2, BleTimeRange r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mStandbyEnable;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mEnabled;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mBleTimeRange1;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mReserved;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mStandbyEnable;
    }

    public final int component2() {
        return this.mEnabled;
    }

    @aa1
    public final BleTimeRange component3() {
        return this.mBleTimeRange1;
    }

    public final int component4() {
        return this.mReserved;
    }

    @aa1
    public final BleStandbyWatchFaceSet copy(int r2, int r3, @aa1 BleTimeRange r4, int r5) {
        Intrinsics.X0O(r4, "mBleTimeRange1");
        return new BleStandbyWatchFaceSet(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStandbyEnable = readUInt8();
        this.mEnabled = readUInt8();
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange1 = (BleTimeRange) r0;
        this.mReserved = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mStandbyEnable);
        writeInt8(this.mEnabled);
        writeObject(this.mBleTimeRange1);
        writeInt8(this.mReserved);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleStandbyWatchFaceSet) == true) goto L8;
        return false;
    L8:
        BleStandbyWatchFaceSet r6 = (BleStandbyWatchFaceSet) r5;
        if (this.mStandbyEnable == r6.mStandbyEnable) goto L12;
        return false;
    L12:
        if (this.mEnabled == r6.mEnabled) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange1, r6.mBleTimeRange1) == true) goto L18;
        return false;
    L18:
        if (this.mReserved == r6.mReserved) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange1() {
        return this.mBleTimeRange1;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMReserved() {
        return this.mReserved;
    }

    public final int getMStandbyEnable() {
        return this.mStandbyEnable;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mStandbyEnable) * 31) + Integer.hashCode(this.mEnabled)) * 31) + this.mBleTimeRange1.hashCode()) * 31) + Integer.hashCode(this.mReserved);
    }

    public final void setMBleTimeRange1(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange1 = r2;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMReserved(int r1) {
        this.mReserved = r1;
    }

    public final void setMStandbyEnable(int r1) {
        this.mStandbyEnable = r1;
    }

    @aa1
    public String toString() {
        return "BleStandbyWatchFaceSet(mStandbyEnable=" + this.mStandbyEnable + ", mEnabled=" + this.mEnabled + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mReserved=" + this.mReserved + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleStandbyWatchFaceSet(int r2, int r3, @aa1 BleTimeRange r4, int r5) {
        Intrinsics.X0O(r4, "mBleTimeRange1");
        this.mStandbyEnable = r2;
        this.mEnabled = r3;
        this.mBleTimeRange1 = r4;
        this.mReserved = r5;
    }

    public /* synthetic */ BleStandbyWatchFaceSet(int r9, int r10, BleTimeRange r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r9 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r10 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r11 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L12:
        if ((r13 & 8) == 0) goto L14;
        r12 = 1;
    L14:
        this(r9, r10, r11, r12);
    }
}
