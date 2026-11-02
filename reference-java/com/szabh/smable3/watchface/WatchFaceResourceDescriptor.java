package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.android.mltcode.paycertificationapi.tb1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceResourceDescriptor {
    private final int dataOffset;
    private int dataSize;

    @tb1
    private final ImageDesc imageDesc;
    private final byte type;

    public WatchFaceResourceDescriptor(byte b, int i, int i2, @tb1 ImageDesc imageDesc) {
        this.type = b;
        this.dataSize = i;
        this.dataOffset = i2;
        this.imageDesc = imageDesc;
    }

    public static /* synthetic */ WatchFaceResourceDescriptor copy$default(WatchFaceResourceDescriptor watchFaceResourceDescriptor, byte b, int i, int i2, ImageDesc imageDesc, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            b = watchFaceResourceDescriptor.type;
        }
        if ((i3 & 2) != 0) {
            i = watchFaceResourceDescriptor.dataSize;
        }
        if ((i3 & 4) != 0) {
            i2 = watchFaceResourceDescriptor.dataOffset;
        }
        if ((i3 & 8) != 0) {
            imageDesc = watchFaceResourceDescriptor.imageDesc;
        }
        return watchFaceResourceDescriptor.copy(b, i, i2, imageDesc);
    }

    public final byte component1() {
        return this.type;
    }

    public final int component2() {
        return this.dataSize;
    }

    public final int component3() {
        return this.dataOffset;
    }

    @tb1
    public final ImageDesc component4() {
        return this.imageDesc;
    }

    @aa1
    public final WatchFaceResourceDescriptor copy(byte b, int i, int i2, @tb1 ImageDesc imageDesc) {
        return new WatchFaceResourceDescriptor(b, i, i2, imageDesc);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceResourceDescriptor)) {
            return false;
        }
        WatchFaceResourceDescriptor watchFaceResourceDescriptor = (WatchFaceResourceDescriptor) obj;
        return this.type == watchFaceResourceDescriptor.type && this.dataSize == watchFaceResourceDescriptor.dataSize && this.dataOffset == watchFaceResourceDescriptor.dataOffset && Intrinsics.XOO0ii0(this.imageDesc, watchFaceResourceDescriptor.imageDesc);
    }

    public final int getDataOffset() {
        return this.dataOffset;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    @tb1
    public final ImageDesc getImageDesc() {
        return this.imageDesc;
    }

    public final byte getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Byte.hashCode(this.type) * 31) + Integer.hashCode(this.dataSize)) * 31) + Integer.hashCode(this.dataOffset)) * 31;
        ImageDesc imageDesc = this.imageDesc;
        return iHashCode + (imageDesc == null ? 0 : imageDesc.hashCode());
    }

    public final void setDataSize(int i) {
        this.dataSize = i;
    }

    @aa1
    public final byte[] toByteArray() {
        ImageDesc imageDesc;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt((this.dataSize << 8) | (this.type & 255));
        byteBufferAllocate.putInt(this.dataOffset);
        if (this.type == 0 && (imageDesc = this.imageDesc) != null) {
            byteBufferAllocate.put(imageDesc.toByteArray());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "WatchFaceResourceDescriptor{type=" + ((int) this.type) + ", dataSize=" + this.dataSize + "}, dataOffset=" + this.dataOffset + ", imageDesc=" + this.imageDesc + i0XO1.f7442IO;
    }

    public /* synthetic */ WatchFaceResourceDescriptor(byte b, int i, int i2, ImageDesc imageDesc, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? (byte) 0 : b, i, i2, (i3 & 8) != 0 ? null : imageDesc);
    }

    public static final class ImageDesc {
        private final int colorFormat;
        private final int compressMode;
        private final int height;
        private final int paletteFormat;

        @aa1
        private final byte[] reversed;
        private final int reversedTop;
        private final int width;

        public ImageDesc(int i, int i2, int i3, int i4, int i5, int i6, @aa1 byte[] reversed) {
            Intrinsics.X0O(reversed, "reversed");
            this.colorFormat = i;
            this.paletteFormat = i2;
            this.compressMode = i3;
            this.reversedTop = i4;
            this.width = i5;
            this.height = i6;
            this.reversed = reversed;
        }

        public static /* synthetic */ ImageDesc copy$default(ImageDesc imageDesc, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i = imageDesc.colorFormat;
            }
            if ((i7 & 2) != 0) {
                i2 = imageDesc.paletteFormat;
            }
            if ((i7 & 4) != 0) {
                i3 = imageDesc.compressMode;
            }
            if ((i7 & 8) != 0) {
                i4 = imageDesc.reversedTop;
            }
            if ((i7 & 16) != 0) {
                i5 = imageDesc.width;
            }
            if ((i7 & 32) != 0) {
                i6 = imageDesc.height;
            }
            if ((i7 & 64) != 0) {
                bArr = imageDesc.reversed;
            }
            int i8 = i6;
            byte[] bArr2 = bArr;
            int i9 = i5;
            int i10 = i3;
            return imageDesc.copy(i, i2, i10, i4, i9, i8, bArr2);
        }

        public final int component1() {
            return this.colorFormat;
        }

        public final int component2() {
            return this.paletteFormat;
        }

        public final int component3() {
            return this.compressMode;
        }

        public final int component4() {
            return this.reversedTop;
        }

        public final int component5() {
            return this.width;
        }

        public final int component6() {
            return this.height;
        }

        @aa1
        public final byte[] component7() {
            return this.reversed;
        }

        @aa1
        public final ImageDesc copy(int i, int i2, int i3, int i4, int i5, int i6, @aa1 byte[] reversed) {
            Intrinsics.X0O(reversed, "reversed");
            return new ImageDesc(i, i2, i3, i4, i5, i6, reversed);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDesc)) {
                return false;
            }
            ImageDesc imageDesc = (ImageDesc) obj;
            return this.colorFormat == imageDesc.colorFormat && this.paletteFormat == imageDesc.paletteFormat && this.compressMode == imageDesc.compressMode && this.reversedTop == imageDesc.reversedTop && this.width == imageDesc.width && this.height == imageDesc.height && Intrinsics.XOO0ii0(this.reversed, imageDesc.reversed);
        }

        public final int getColorFormat() {
            return this.colorFormat;
        }

        public final int getCompressMode() {
            return this.compressMode;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getPaletteFormat() {
            return this.paletteFormat;
        }

        @aa1
        public final byte[] getReversed() {
            return this.reversed;
        }

        public final int getReversedTop() {
            return this.reversedTop;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.colorFormat) * 31) + Integer.hashCode(this.paletteFormat)) * 31) + Integer.hashCode(this.compressMode)) * 31) + Integer.hashCode(this.reversedTop)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Arrays.hashCode(this.reversed);
        }

        @aa1
        public final byte[] toByteArray() {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt((this.reversedTop << 16) | (this.compressMode << 11) | (this.paletteFormat << 8) | this.colorFormat);
            byteBufferAllocate.putShort((short) this.width);
            byteBufferAllocate.putShort((short) this.height);
            byteBufferAllocate.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 16)));
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.O10IXXX0X(bArrArray, "array(...)");
            return bArrArray;
        }

        @aa1
        public String toString() {
            return "ImageDesc{colorFormat=" + this.colorFormat + ", paletteFormat=" + this.paletteFormat + ", compressMode=" + this.compressMode + ", reversedTop=" + this.reversedTop + ", width=" + this.width + ", height=" + this.height + i0XO1.f7442IO;
        }

        public /* synthetic */ ImageDesc(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? WatchFaceEnumUtil.ImageType.LV_COLOR_FORMAT_ARGB8888.getValue() : i, i2, i3, (i7 & 8) != 0 ? 0 : i4, i5, i6, (i7 & 64) != 0 ? new byte[16] : bArr);
        }
    }
}
