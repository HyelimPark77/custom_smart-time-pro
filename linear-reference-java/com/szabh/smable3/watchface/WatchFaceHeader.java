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
        byte[] r1 = null;
        long r2 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        byte[] r12 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, 2047, null);
    }

    public static /* synthetic */ WatchFaceHeader copy$default(WatchFaceHeader r0, byte[] r1, long r2, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, byte[] r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.magic;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.timestamp;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = r0.size;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = r0.crc;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = r0.platform;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = r0.elementCount;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = r0.resDescCount;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = r0.version;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = r0.feature;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = r0.type;
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = r0.reversed;
    L35:
        int r15 = r11;
        byte[] r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        int r20 = r6;
        int r21 = r4;
        long r22 = r2;
        byte[] r3 = r1;
        return r0.copy(r3, r22, r21, r5, r20, r19, r110, r17, r18, r15, r16);
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
    public final WatchFaceHeader copy(@aa1 byte[] r15, long r16, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, @aa1 byte[] r26) {
        Intrinsics.X0O(r15, "magic");
        Intrinsics.X0O(r26, "reversed");
        return new WatchFaceHeader(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WatchFaceHeader) == true) goto L8;
        return false;
    L8:
        WatchFaceHeader r9 = (WatchFaceHeader) r8;
        if (Intrinsics.XOO0ii0(this.magic, r9.magic) == true) goto L12;
        return false;
    L12:
        if (this.timestamp == r9.timestamp) goto L15;
        return false;
    L15:
        if (this.size == r9.size) goto L18;
        return false;
    L18:
        if (this.crc == r9.crc) goto L21;
        return false;
    L21:
        if (this.platform == r9.platform) goto L24;
        return false;
    L24:
        if (this.elementCount == r9.elementCount) goto L27;
        return false;
    L27:
        if (this.resDescCount == r9.resDescCount) goto L30;
        return false;
    L30:
        if (this.version == r9.version) goto L33;
        return false;
    L33:
        if (this.feature == r9.feature) goto L36;
        return false;
    L36:
        if (this.type == r9.type) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.reversed, r9.reversed) == true) goto L41;
        return false;
    L41:
        return true;
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

    public final void setCrc(int r1) {
        this.crc = r1;
    }

    public final void setSize(int r1) {
        this.size = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        ByteBuffer r0 = ByteBuffer.allocate(64);
        r0.order(ByteOrder.LITTLE_ENDIAN);
        r0.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.magic, 4)));
        r0.putInt((int) this.timestamp);
        r0.putInt(this.size);
        r0.putShort((short) this.crc);
        r0.put((byte) this.platform);
        r0.put((byte) this.elementCount);
        r0.putShort((short) this.resDescCount);
        r0.put((byte) this.version);
        r0.put((byte) this.feature);
        r0.put((byte) this.type);
        r0.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 43)));
        byte[] r1 = r0.array();
        Intrinsics.O10IXXX0X(r1, "array(...)");
        return r1;
    }

    @aa1
    public String toString() {
        return "WatchFaceHeader{size=" + this.size + ", crc=" + this.crc + "}, elementCount=" + this.elementCount + ", resDescCount=" + this.resDescCount + i0XO1.IO;
    }

    public WatchFaceHeader(@aa1 byte[] r2, long r3, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, @aa1 byte[] r13) {
        Intrinsics.X0O(r2, "magic");
        Intrinsics.X0O(r13, "reversed");
        this.magic = r2;
        this.timestamp = r3;
        this.size = r5;
        this.crc = r6;
        this.platform = r7;
        this.elementCount = r8;
        this.resDescCount = r9;
        this.version = r10;
        this.feature = r11;
        this.type = r12;
        this.reversed = r13;
    }

    public /* synthetic */ WatchFaceHeader(byte[] r13, long r14, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, byte[] r24, int r25, DefaultConstructorMarker r26) {
        int r2 = 0;
        if ((r25 & 1) == 0) goto L6;
        byte[] r15 = "WFB".getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r15, "getBytes(...)");
        r13 = ArraysKt___ArraysJvmKt.iO0iiOi(r15, (byte) 0);
    L6:
        if ((r25 & 2) == 0) goto L8;
        long r3 = System.currentTimeMillis();
    L10:
        if ((r25 & 4) == 0) goto L12;
        int r1 = 0;
    L14:
        if ((r25 & 8) == 0) goto L16;
        int r5 = 0;
    L18:
        if ((r25 & 16) == 0) goto L20;
        int r6 = WatchFaceEnumUtil.McuPlatform.JL707N.getValue();
    L21:
        int r8 = 1;
        if ((r25 & 32) == 0) goto L24;
        int r7 = 1;
    L26:
        if ((r25 & 64) != 0) goto L30;
        r8 = r20;
    L30:
        if ((r25 & 128) == 0) goto L32;
        int r9 = 0;
    L34:
        if ((r25 & 256) == 0) goto L36;
        int r10 = 0;
    L38:
        if ((r25 & 512) != 0) goto L42;
        r2 = r23;
    L42:
        if ((r25 & 1024) == 0) goto L45;
        byte[] r27 = new byte[43];
    L46:
        this(r13, r3, r1, r5, r6, r7, r8, r9, r10, r2, r27);
        return;
    L45:
        r27 = r24;
        goto L46
    L36:
        r10 = r22;
        goto L38
    L32:
        r9 = r21;
        goto L34
    L24:
        r7 = r19;
        goto L26
    L20:
        r6 = r18;
        goto L21
    L16:
        r5 = r17;
        goto L18
    L12:
        r1 = r16;
        goto L14
    L8:
        r3 = r14;
        goto L10
    }
}
