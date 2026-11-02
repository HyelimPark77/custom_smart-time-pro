package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStreamPacket extends BleWritable {
    private static long BUFFER_MAX_SIZE;

    @aa1
    public static final Companion Companion = null;
    private final long mIndex;

    @aa1
    private final byte[] mPacket;
    private final long mSize;
    private final int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final long getBUFFER_MAX_SIZE() {
            return BleStreamPacket.access$getBUFFER_MAX_SIZE$cp();
        }

        public final void setBUFFER_MAX_SIZE(long r1) {
            BleStreamPacket.access$setBUFFER_MAX_SIZE$cp(r1);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        BUFFER_MAX_SIZE = 480;
    }

    public BleStreamPacket(int r2, long r3, long r5, @aa1 byte[] r7) {
        Intrinsics.X0O(r7, "mPacket");
        this.mType = r2;
        this.mSize = r3;
        this.mIndex = r5;
        this.mPacket = r7;
    }

    public static final /* synthetic */ long access$getBUFFER_MAX_SIZE$cp() {
        return BUFFER_MAX_SIZE;
    }

    public static final /* synthetic */ void access$setBUFFER_MAX_SIZE$cp(long r0) {
        BUFFER_MAX_SIZE = r0;
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
