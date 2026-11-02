package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.tb1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceHeader {
    private int crc;
    private final int elementCount;
    private final int feature;

    @aa1
    private final byte[] magic;
    private final int platform;
    private final int resDescCount;

    @aa1
    private final byte[] reversed;
    private int size;
    private final long timestamp;
    private final int type;
    private final int version;

    public WatchFaceHeader() {
        this(null, 0L, 0, 0, 0, 0, 0, 0, 0, 0, null, 2047, null);
    }

    public static /* synthetic */ WatchFaceHeader copy$default(WatchFaceHeader watchFaceHeader, byte[] bArr, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bArr = watchFaceHeader.magic;
        }
        if ((i9 & 2) != 0) {
            j = watchFaceHeader.timestamp;
        }
        if ((i9 & 4) != 0) {
            i = watchFaceHeader.size;
        }
        if ((i9 & 8) != 0) {
            i2 = watchFaceHeader.crc;
        }
        if ((i9 & 16) != 0) {
            i3 = watchFaceHeader.platform;
        }
        if ((i9 & 32) != 0) {
            i4 = watchFaceHeader.elementCount;
        }
        if ((i9 & 64) != 0) {
            i5 = watchFaceHeader.resDescCount;
        }
        if ((i9 & 128) != 0) {
            i6 = watchFaceHeader.version;
        }
        if ((i9 & 256) != 0) {
            i7 = watchFaceHeader.feature;
        }
        if ((i9 & 512) != 0) {
            i8 = watchFaceHeader.type;
        }
        if ((i9 & 1024) != 0) {
            bArr2 = watchFaceHeader.reversed;
        }
        int i10 = i8;
        byte[] bArr3 = bArr2;
        int i11 = i6;
        int i12 = i7;
        int i13 = i5;
        int i14 = i3;
        int i15 = i;
        return watchFaceHeader.copy(bArr, j, i15, i2, i14, i4, i13, i11, i12, i10, bArr3);
    }

    @aa1
    public final byte[] component1() {
        return this.magic;
    }

    public final int component10() {
        return this.type;
    }

    @aa1
    public final byte[] component11() {
        return this.reversed;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final int component3() {
        return this.size;
    }

    public final int component4() {
        return this.crc;
    }

    public final int component5() {
        return this.platform;
    }

    public final int component6() {
        return this.elementCount;
    }

    public final int component7() {
        return this.resDescCount;
    }

    public final int component8() {
        return this.version;
    }

    public final int component9() {
        return this.feature;
    }

    @aa1
    public final WatchFaceHeader copy(@aa1 byte[] magic, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 byte[] reversed) {
        Intrinsics.X0O(magic, "magic");
        Intrinsics.X0O(reversed, "reversed");
        return new WatchFaceHeader(magic, j, i, i2, i3, i4, i5, i6, i7, i8, reversed);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceHeader)) {
            return false;
        }
        WatchFaceHeader watchFaceHeader = (WatchFaceHeader) obj;
        return Intrinsics.XOO0ii0(this.magic, watchFaceHeader.magic) && this.timestamp == watchFaceHeader.timestamp && this.size == watchFaceHeader.size && this.crc == watchFaceHeader.crc && this.platform == watchFaceHeader.platform && this.elementCount == watchFaceHeader.elementCount && this.resDescCount == watchFaceHeader.resDescCount && this.version == watchFaceHeader.version && this.feature == watchFaceHeader.feature && this.type == watchFaceHeader.type && Intrinsics.XOO0ii0(this.reversed, watchFaceHeader.reversed);
    }

    public final int getCrc() {
        return this.crc;
    }

    public final int getElementCount() {
        return this.elementCount;
    }

    public final int getFeature() {
        return this.feature;
    }

    @aa1
    public final byte[] getMagic() {
        return this.magic;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final int getResDescCount() {
        return this.resDescCount;
    }

    @aa1
    public final byte[] getReversed() {
        return this.reversed;
    }

    public final int getSize() {
        return this.size;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((Arrays.hashCode(this.magic) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.crc)) * 31) + Integer.hashCode(this.platform)) * 31) + Integer.hashCode(this.elementCount)) * 31) + Integer.hashCode(this.resDescCount)) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.feature)) * 31) + Integer.hashCode(this.type)) * 31) + Arrays.hashCode(this.reversed);
    }

    public final void setCrc(int i) {
        this.crc = i;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    @aa1
    public final byte[] toByteArray() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(64);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.magic, 4)));
        byteBufferAllocate.putInt((int) this.timestamp);
        byteBufferAllocate.putInt(this.size);
        byteBufferAllocate.putShort((short) this.crc);
        byteBufferAllocate.put((byte) this.platform);
        byteBufferAllocate.put((byte) this.elementCount);
        byteBufferAllocate.putShort((short) this.resDescCount);
        byteBufferAllocate.put((byte) this.version);
        byteBufferAllocate.put((byte) this.feature);
        byteBufferAllocate.put((byte) this.type);
        byteBufferAllocate.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 43)));
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "WatchFaceHeader{size=" + this.size + ", crc=" + this.crc + "}, elementCount=" + this.elementCount + ", resDescCount=" + this.resDescCount + i0XO1.f7442IO;
    }

    public WatchFaceHeader(@aa1 byte[] magic, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 byte[] reversed) {
        Intrinsics.X0O(magic, "magic");
        Intrinsics.X0O(reversed, "reversed");
        this.magic = magic;
        this.timestamp = j;
        this.size = i;
        this.crc = i2;
        this.platform = i3;
        this.elementCount = i4;
        this.resDescCount = i5;
        this.version = i6;
        this.feature = i7;
        this.type = i8;
        this.reversed = reversed;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WatchFaceHeader(byte[] bArr, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i9 & 1) != 0) {
            byte[] bytes = "WFB".getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            bArr = ArraysKt___ArraysJvmKt.iO0iiOi(bytes, (byte) 0);
        }
        this(bArr, (i9 & 2) != 0 ? System.currentTimeMillis() : j, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? 0 : i2, (i9 & 16) != 0 ? WatchFaceEnumUtil.McuPlatform.JL707N.getValue() : i3, (i9 & 32) != 0 ? 1 : i4, (i9 & 64) == 0 ? i5 : 1, (i9 & 128) != 0 ? 0 : i6, (i9 & 256) != 0 ? 0 : i7, (i9 & 512) == 0 ? i8 : 0, (i9 & 1024) != 0 ? new byte[43] : bArr2);
    }
}
