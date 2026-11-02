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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 10;
    private int mActionType;
    private int mId;
    private long mTime;

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

    public BleLoveTap() {
        long r1 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r3, r4, 7, null);
    }

    public static /* synthetic */ BleLoveTap copy$default(BleLoveTap r0, long r1, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.mId;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.mActionType;
    L12:
        return r0.copy(r1, r3, r4);
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
    public final BleLoveTap copy(long r2, int r4, int r5) {
        return new BleLoveTap(r2, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        this.mId = readUInt8();
        this.mActionType = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        writeInt8(this.mId);
        writeInt8(this.mActionType);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleLoveTap) == true) goto L8;
        return false;
    L8:
        BleLoveTap r9 = (BleLoveTap) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mId == r9.mId) goto L15;
        return false;
    L15:
        if (this.mActionType == r9.mActionType) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMActionType(int r1) {
        this.mActionType = r1;
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleLoveTap(mTime=" + this.mTime + ", mId=" + this.mId + ", mActionType=" + this.mActionType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLoveTap(long r1, int r3, int r4) {
        this.mTime = r1;
        this.mId = r3;
        this.mActionType = r4;
    }

    public /* synthetic */ BleLoveTap(long r2, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r5 = 0;
    L11:
        this(r2, r4, r5);
    }
}
