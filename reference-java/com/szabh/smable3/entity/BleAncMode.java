package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAncMode extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mLeftCurVal;
    private int mLeftMax;
    private int mRightCurVal;
    private int mRightMax;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAncMode() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleAncMode copy$default(BleAncMode bleAncMode, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleAncMode.mLeftMax;
        }
        if ((i5 & 2) != 0) {
            i2 = bleAncMode.mRightMax;
        }
        if ((i5 & 4) != 0) {
            i3 = bleAncMode.mLeftCurVal;
        }
        if ((i5 & 8) != 0) {
            i4 = bleAncMode.mRightCurVal;
        }
        return bleAncMode.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mLeftMax;
    }

    public final int component2() {
        return this.mRightMax;
    }

    public final int component3() {
        return this.mLeftCurVal;
    }

    public final int component4() {
        return this.mRightCurVal;
    }

    @aa1
    public final BleAncMode copy(int i, int i2, int i3, int i4) {
        return new BleAncMode(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLeftMax = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRightMax = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLeftCurVal = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mRightCurVal = readUInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.mLeftMax;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        int i2 = this.mRightMax;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        int i3 = this.mLeftCurVal;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i3, LITTLE_ENDIAN);
        int i4 = this.mRightCurVal;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i4, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAncMode)) {
            return false;
        }
        BleAncMode bleAncMode = (BleAncMode) obj;
        return this.mLeftMax == bleAncMode.mLeftMax && this.mRightMax == bleAncMode.mRightMax && this.mLeftCurVal == bleAncMode.mLeftCurVal && this.mRightCurVal == bleAncMode.mRightCurVal;
    }

    public final int getMLeftCurVal() {
        return this.mLeftCurVal;
    }

    public final int getMLeftMax() {
        return this.mLeftMax;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMRightCurVal() {
        return this.mRightCurVal;
    }

    public final int getMRightMax() {
        return this.mRightMax;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mLeftMax) * 31) + Integer.hashCode(this.mRightMax)) * 31) + Integer.hashCode(this.mLeftCurVal)) * 31) + Integer.hashCode(this.mRightCurVal);
    }

    public final void setMLeftCurVal(int i) {
        this.mLeftCurVal = i;
    }

    public final void setMLeftMax(int i) {
        this.mLeftMax = i;
    }

    public final void setMRightCurVal(int i) {
        this.mRightCurVal = i;
    }

    public final void setMRightMax(int i) {
        this.mRightMax = i;
    }

    @aa1
    public String toString() {
        return "BleAncMode(mLeftMax=" + this.mLeftMax + ", mRightMax=" + this.mRightMax + ", mLeftCurVal=" + this.mLeftCurVal + ", mRightCurVal=" + this.mRightCurVal + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAncMode(int i, int i2, int i3, int i4) {
        this.mLeftMax = i;
        this.mRightMax = i2;
        this.mLeftCurVal = i3;
        this.mRightCurVal = i4;
    }

    public /* synthetic */ BleAncMode(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
