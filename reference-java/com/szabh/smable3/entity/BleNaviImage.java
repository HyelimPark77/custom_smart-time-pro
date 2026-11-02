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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 64;

    @aa1
    private byte[] mImageBuffers;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleNaviImage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleNaviImage copy$default(BleNaviImage bleNaviImage, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = bleNaviImage.mImageBuffers;
        }
        return bleNaviImage.copy(bArr);
    }

    @aa1
    public final byte[] component1() {
        return this.mImageBuffers;
    }

    @aa1
    public final BleNaviImage copy(@aa1 byte[] mImageBuffers) {
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        return new BleNaviImage(mImageBuffers);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeBytes$default(this, new byte[64], null, 2, null);
        BleWritable.writeBytes$default(this, this.mImageBuffers, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleNaviImage) && Intrinsics.XOO0ii0(this.mImageBuffers, ((BleNaviImage) obj).mImageBuffers);
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

    public final void setMImageBuffers(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageBuffers = bArr;
    }

    @aa1
    public String toString() {
        return "BleNaviImage(mImageBuffers=" + Arrays.toString(this.mImageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleNaviImage(@aa1 byte[] mImageBuffers) {
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        this.mImageBuffers = mImageBuffers;
    }

    public /* synthetic */ BleNaviImage(byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new byte[0] : bArr);
    }
}
