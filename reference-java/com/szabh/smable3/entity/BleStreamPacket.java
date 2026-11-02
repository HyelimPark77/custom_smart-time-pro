package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStreamPacket extends BleWritable {
    private final long mIndex;

    @aa1
    private final byte[] mPacket;
    private final long mSize;
    private final int mType;

    @aa1
    public static final Companion Companion = new Companion(null);
    private static long BUFFER_MAX_SIZE = 480;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getBUFFER_MAX_SIZE() {
            return BleStreamPacket.BUFFER_MAX_SIZE;
        }

        public final void setBUFFER_MAX_SIZE(long j) {
            BleStreamPacket.BUFFER_MAX_SIZE = j;
        }

        private Companion() {
        }
    }

    public BleStreamPacket(int i, long j, long j2, @aa1 byte[] mPacket) {
        Intrinsics.X0O(mPacket, "mPacket");
        this.mType = i;
        this.mSize = j;
        this.mIndex = j2;
        this.mPacket = mPacket;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        BleWritable.writeUInt32$default(this, this.mSize, null, 2, null);
        BleWritable.writeUInt32$default(this, this.mIndex, null, 2, null);
        BleWritable.writeBytes$default(this, this.mPacket, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mPacket.length + 9;
    }

    @aa1
    public String toString() {
        return "BleStreamPacket(mType=" + this.mType + ", mSize=" + this.mSize + ", mIndex=" + this.mIndex + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }
}
