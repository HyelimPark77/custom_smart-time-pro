package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLoveTap extends BleWritable {
    public static final int ACTION_DOWN = 1;
    public static final int ACTION_UP = 2;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 10;
    private int mActionType;
    private int mId;
    private long mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleLoveTap() {
        this(0L, 0, 0, 7, null);
    }

    public static /* synthetic */ BleLoveTap copy$default(BleLoveTap bleLoveTap, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = bleLoveTap.mTime;
        }
        if ((i3 & 2) != 0) {
            i = bleLoveTap.mId;
        }
        if ((i3 & 4) != 0) {
            i2 = bleLoveTap.mActionType;
        }
        return bleLoveTap.copy(j, i, i2);
    }

    public final long component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mId;
    }

    public final int component3() {
        return this.mActionType;
    }

    @aa1
    public final BleLoveTap copy(long j, int i, int i2) {
        return new BleLoveTap(j, i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        this.mId = readUInt8();
        this.mActionType = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        writeInt8(this.mId);
        writeInt8(this.mActionType);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLoveTap)) {
            return false;
        }
        BleLoveTap bleLoveTap = (BleLoveTap) obj;
        return this.mTime == bleLoveTap.mTime && this.mId == bleLoveTap.mId && this.mActionType == bleLoveTap.mActionType;
    }

    public final int getMActionType() {
        return this.mActionType;
    }

    public final int getMId() {
        return this.mId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mId)) * 31) + Integer.hashCode(this.mActionType);
    }

    public final void setMActionType(int i) {
        this.mActionType = i;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BleLoveTap(mTime=" + this.mTime + ", mId=" + this.mId + ", mActionType=" + this.mActionType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLoveTap(long j, int i, int i2) {
        this.mTime = j;
        this.mId = i;
        this.mActionType = i2;
    }

    public /* synthetic */ BleLoveTap(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
