package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNaviImage extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 64;

    @aa1
    private byte[] mImageBuffers;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleNaviImage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleNaviImage copy$default(BleNaviImage r0, byte[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mImageBuffers;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final byte[] component1() {
        return this.mImageBuffers;
    }

    @aa1
    public final BleNaviImage copy(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mImageBuffers");
        return new BleNaviImage(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeBytes$default(this, new byte[64], null, 2, null);
        BleWritable.writeBytes$default(this, this.mImageBuffers, null, 2, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleNaviImage) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mImageBuffers, ((BleNaviImage) r4).mImageBuffers) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final byte[] getMImageBuffers() {
        return this.mImageBuffers;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mImageBuffers.length + 64;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mImageBuffers);
    }

    public final void setMImageBuffers(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageBuffers = r2;
    }

    @aa1
    public String toString() {
        return "BleNaviImage(mImageBuffers=" + Arrays.toString(this.mImageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleNaviImage(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mImageBuffers");
        this.mImageBuffers = r2;
    }

    public /* synthetic */ BleNaviImage(byte[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new byte[0];
    L5:
        this(r1);
    }
}
