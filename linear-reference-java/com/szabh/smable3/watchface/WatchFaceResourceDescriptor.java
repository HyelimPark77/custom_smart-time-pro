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

    public static final class ImageDesc {
        private final int colorFormat;
        private final int compressMode;
        private final int height;
        private final int paletteFormat;

        @aa1
        private final byte[] reversed;
        private final int reversedTop;
        private final int width;

        public ImageDesc(int r2, int r3, int r4, int r5, int r6, int r7, @aa1 byte[] r8) {
            Intrinsics.X0O(r8, "reversed");
            this.colorFormat = r2;
            this.paletteFormat = r3;
            this.compressMode = r4;
            this.reversedTop = r5;
            this.width = r6;
            this.height = r7;
            this.reversed = r8;
        }

        public static /* synthetic */ ImageDesc copy$default(ImageDesc r0, int r1, int r2, int r3, int r4, int r5, int r6, byte[] r7, int r8, Object r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = r0.colorFormat;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r2 = r0.paletteFormat;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r3 = r0.compressMode;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r4 = r0.reversedTop;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r5 = r0.width;
        L18:
            if ((r8 & 32) == 0) goto L21;
            r6 = r0.height;
        L21:
            if ((r8 & 64) == 0) goto L23;
            r7 = r0.reversed;
        L23:
            int r10 = r6;
            byte[] r11 = r7;
            int r12 = r4;
            int r13 = r5;
            int r14 = r3;
            int r15 = r1;
            return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
        public final ImageDesc copy(int r10, int r11, int r12, int r13, int r14, int r15, @aa1 byte[] r16) {
            Intrinsics.X0O(r16, "reversed");
            return new ImageDesc(r10, r11, r12, r13, r14, r15, r16);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof ImageDesc) == true) goto L8;
            return false;
        L8:
            ImageDesc r6 = (ImageDesc) r5;
            if (this.colorFormat == r6.colorFormat) goto L12;
            return false;
        L12:
            if (this.paletteFormat == r6.paletteFormat) goto L15;
            return false;
        L15:
            if (this.compressMode == r6.compressMode) goto L18;
            return false;
        L18:
            if (this.reversedTop == r6.reversedTop) goto L21;
            return false;
        L21:
            if (this.width == r6.width) goto L24;
            return false;
        L24:
            if (this.height == r6.height) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.reversed, r6.reversed) == true) goto L29;
            return false;
        L29:
            return true;
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
            ByteBuffer r0 = ByteBuffer.allocate(24);
            r0.order(ByteOrder.LITTLE_ENDIAN);
            r0.putInt((((this.reversedTop << 16) | (this.compressMode << 11)) | (this.paletteFormat << 8)) | this.colorFormat);
            r0.putShort((short) this.width);
            r0.putShort((short) this.height);
            r0.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 16)));
            byte[] r1 = r0.array();
            Intrinsics.O10IXXX0X(r1, "array(...)");
            return r1;
        }

        @aa1
        public String toString() {
            return "ImageDesc{colorFormat=" + this.colorFormat + ", paletteFormat=" + this.paletteFormat + ", compressMode=" + this.compressMode + ", reversedTop=" + this.reversedTop + ", width=" + this.width + ", height=" + this.height + i0XO1.IO;
        }

        public /* synthetic */ ImageDesc(int r1, int r2, int r3, int r4, int r5, int r6, byte[] r7, int r8, DefaultConstructorMarker r9) {
            if ((r8 & 1) == 0) goto L6;
            r1 = WatchFaceEnumUtil.ImageType.LV_COLOR_FORMAT_ARGB8888.getValue();
        L6:
            if ((r8 & 8) == 0) goto L9;
            r4 = 0;
        L9:
            if ((r8 & 64) == 0) goto L11;
            r7 = new byte[16];
        L11:
            int r10 = r4;
            int r11 = r1;
            this(r11, r2, r3, r10, r5, r6, r7);
        }
    }

    public WatchFaceResourceDescriptor(byte r1, int r2, int r3, @tb1 ImageDesc r4) {
        this.type = r1;
        this.dataSize = r2;
        this.dataOffset = r3;
        this.imageDesc = r4;
    }

    public static /* synthetic */ WatchFaceResourceDescriptor copy$default(WatchFaceResourceDescriptor r0, byte r1, int r2, int r3, ImageDesc r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.dataSize;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.dataOffset;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.imageDesc;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final WatchFaceResourceDescriptor copy(byte r2, int r3, int r4, @tb1 ImageDesc r5) {
        return new WatchFaceResourceDescriptor(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceResourceDescriptor) == true) goto L8;
        return false;
    L8:
        WatchFaceResourceDescriptor r6 = (WatchFaceResourceDescriptor) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (this.dataSize == r6.dataSize) goto L15;
        return false;
    L15:
        if (this.dataOffset == r6.dataOffset) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.imageDesc, r6.imageDesc) == true) goto L20;
        return false;
    L20:
        return true;
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
        int r0 = ((((Byte.hashCode(this.type) * 31) + Integer.hashCode(this.dataSize)) * 31) + Integer.hashCode(this.dataOffset)) * 31;
        ImageDesc r1 = this.imageDesc;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setDataSize(int r1) {
        this.dataSize = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        ByteBuffer r0 = ByteBuffer.allocate(32);
        r0.order(ByteOrder.LITTLE_ENDIAN);
        r0.putInt((this.dataSize << 8) | (this.type & 255));
        r0.putInt(this.dataOffset);
        if (this.type != 0) goto L7;
        ImageDesc r1 = this.imageDesc;
        if (r1 == null) goto L7;
        r0.put(r1.toByteArray());
    L7:
        byte[] r2 = r0.array();
        Intrinsics.O10IXXX0X(r2, "array(...)");
        return r2;
    }

    @aa1
    public String toString() {
        return "WatchFaceResourceDescriptor{type=" + this.type + ", dataSize=" + this.dataSize + "}, dataOffset=" + this.dataOffset + ", imageDesc=" + this.imageDesc + i0XO1.IO;
    }

    public /* synthetic */ WatchFaceResourceDescriptor(byte r1, int r2, int r3, ImageDesc r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = null;
    L8:
        this(r1, r2, r3, r4);
    }
}
