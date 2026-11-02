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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;

    @aa1
    private BleTimeRange mBleTimeRange1;
    private int mEnabled;
    private int mReserved;
    private int mStandbyEnable;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleStandbyWatchFaceSet() {
        this(0, 0, null, 0, 15, null);
    }

    public static /* synthetic */ BleStandbyWatchFaceSet copy$default(BleStandbyWatchFaceSet bleStandbyWatchFaceSet, int i, int i2, BleTimeRange bleTimeRange, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleStandbyWatchFaceSet.mStandbyEnable;
        }
        if ((i4 & 2) != 0) {
            i2 = bleStandbyWatchFaceSet.mEnabled;
        }
        if ((i4 & 4) != 0) {
            bleTimeRange = bleStandbyWatchFaceSet.mBleTimeRange1;
        }
        if ((i4 & 8) != 0) {
            i3 = bleStandbyWatchFaceSet.mReserved;
        }
        return bleStandbyWatchFaceSet.copy(i, i2, bleTimeRange, i3);
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
    public final BleStandbyWatchFaceSet copy(int i, int i2, @aa1 BleTimeRange mBleTimeRange1, int i3) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        return new BleStandbyWatchFaceSet(i, i2, mBleTimeRange1, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStandbyEnable = readUInt8();
        this.mEnabled = readUInt8();
        BleReadable bleReadable = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable.setMBytes(readBytes(5));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mBleTimeRange1 = (BleTimeRange) bleReadable;
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleStandbyWatchFaceSet)) {
            return false;
        }
        BleStandbyWatchFaceSet bleStandbyWatchFaceSet = (BleStandbyWatchFaceSet) obj;
        return this.mStandbyEnable == bleStandbyWatchFaceSet.mStandbyEnable && this.mEnabled == bleStandbyWatchFaceSet.mEnabled && Intrinsics.XOO0ii0(this.mBleTimeRange1, bleStandbyWatchFaceSet.mBleTimeRange1) && this.mReserved == bleStandbyWatchFaceSet.mReserved;
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

    public final void setMBleTimeRange1(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange1 = bleTimeRange;
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMReserved(int i) {
        this.mReserved = i;
    }

    public final void setMStandbyEnable(int i) {
        this.mStandbyEnable = i;
    }

    @aa1
    public String toString() {
        return "BleStandbyWatchFaceSet(mStandbyEnable=" + this.mStandbyEnable + ", mEnabled=" + this.mEnabled + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mReserved=" + this.mReserved + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleStandbyWatchFaceSet(int i, int i2, @aa1 BleTimeRange mBleTimeRange1, int i3) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        this.mStandbyEnable = i;
        this.mEnabled = i2;
        this.mBleTimeRange1 = mBleTimeRange1;
        this.mReserved = i3;
    }

    public /* synthetic */ BleStandbyWatchFaceSet(int i, int i2, BleTimeRange bleTimeRange, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange, (i4 & 8) != 0 ? 1 : i3);
    }
}
