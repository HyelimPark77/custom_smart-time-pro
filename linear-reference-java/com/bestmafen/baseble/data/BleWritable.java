package com.bestmafen.baseble.data;

import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import com.android.mltcode.paycertificationapi.OOXX1OOO1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.C3164n2;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.iO;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBleWritable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n13812#2,2:264\n1869#3,2:266\n1869#3,2:268\n*S KotlinDebug\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n*L\n155#1:264,2\n159#1:266,2\n258#1:268,2\n*E\n"})
public class BleWritable extends BleReadable implements BleBuffer {
    public BleWritable() {
    }

    public static /* synthetic */ void writeBytes$default(BleWritable r0, byte[] r1, ByteOrder r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getMByteOrder();
    L6:
        r0.writeBytes(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeBytes");
    }

    public static /* synthetic */ void writeDouble$default(BleWritable r0, double r1, ByteOrder r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r3 = r0.getMByteOrder();
    L6:
        r0.writeDouble(r1, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeDouble");
    }

    public static /* synthetic */ void writeFloat$default(BleWritable r0, float r1, ByteOrder r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getMByteOrder();
    L6:
        r0.writeFloat(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeFloat");
    }

    public static /* synthetic */ void writeInt16$default(BleWritable r0, int r1, ByteOrder r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getMByteOrder();
    L6:
        r0.writeInt16(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeInt16");
    }

    public static /* synthetic */ void writeInt24$default(BleWritable r0, int r1, ByteOrder r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getMByteOrder();
    L6:
        r0.writeInt24(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeInt24");
    }

    public static /* synthetic */ void writeInt32$default(BleWritable r0, int r1, ByteOrder r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r0.getMByteOrder();
    L6:
        r0.writeInt32(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeInt32");
    }

    public static /* synthetic */ void writeLong$default(BleWritable r0, long r1, ByteOrder r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r3 = r0.getMByteOrder();
    L6:
        r0.writeLong(r1, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeLong");
    }

    public static /* synthetic */ void writeString$default(BleWritable r0, String r1, Charset r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r2, "defaultCharset(...)");
    L6:
        r0.writeString(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeString");
    }

    public static /* synthetic */ void writeStringWithFix$default(BleWritable r0, String r1, int r2, Charset r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r3, "defaultCharset(...)");
    L6:
        r0.writeStringWithFix(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeStringWithFix");
    }

    public static /* synthetic */ void writeStringWithLimit$default(BleWritable r0, String r1, int r2, Charset r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 4) == 0) goto L7;
        r3 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r3, "defaultCharset(...)");
    L7:
        if ((r5 & 8) == 0) goto L9;
        r4 = false;
    L9:
        r0.writeStringWithLimit(r1, r2, r3, r4);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeStringWithLimit");
    }

    public static /* synthetic */ void writeStringWithMax$default(BleWritable r0, String r1, int r2, Charset r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r3, "defaultCharset(...)");
    L6:
        r0.writeStringWithMax(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeStringWithMax");
    }

    public static /* synthetic */ void writeUInt32$default(BleWritable r0, long r1, ByteOrder r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L6;
        r3 = r0.getMByteOrder();
    L6:
        r0.writeUInt32(r1, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeUInt32");
    }

    @CallSuper
    public void encode() {
        resetOffset();
        setMBytes(new byte[getMLengthToWrite()]);
    }

    public int getMLengthToWrite() {
        return 0;
    }

    @Override // com.bestmafen.baseble.data.BleBuffer
    @aa1
    public byte[] toByteArray() {
        encode();
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        return r0;
    }

    public final void writeBoolean(boolean r2) {
        writeIntN(r2 ? 1 : 0, 1);
    }

    public final void writeByte(byte r1) {
        writeInt8(r1);
    }

    public final void writeBytes(@tb1 byte[] r3, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        if (r3 != null) goto L6;
        return;
    L6:
        if (Intrinsics.XOO0ii0(r4, ByteOrder.BIG_ENDIAN) == false) goto L10;
        int r5 = r3.length;
        int r0 = 0;
    L8:
        if (r0 >= r5) goto L17;
        writeInt8(r3[r0]);
        r0 = r0 + 1;
        goto L8
    L17:
        return;
    L10:
        Iterator<T> r6 = ArraysKt___ArraysKt.iiXX(r3).iterator();
    L12:
        if (r6.hasNext() == false) goto L18;
        writeInt8(((Number) r6.next()).byteValue());
        goto L12
    }

    public final void writeDouble(double r2, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        writeLong(Double.doubleToLongBits(r2), r4);
    }

    public final void writeFloat(float r2, @aa1 ByteOrder r3) {
        Intrinsics.X0O(r3, C3164n2.u);
        writeInt32(Float.floatToIntBits(r2), r3);
    }

    public final void writeInt16(int r3, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        if (Intrinsics.XOO0ii0(r4, ByteOrder.BIG_ENDIAN) == false) goto L5;
        int r5 = (r3 >> 8) & 255;
        int r6 = r3 & 255;
    L6:
        writeInt8(r5);
        writeInt8(r6);
        return;
    L5:
        int r7 = (r3 >> 8) & 255;
        r5 = r3 & 255;
        r6 = r7;
        goto L6
    }

    public final void writeInt24(int r2, @aa1 ByteOrder r3) {
        Intrinsics.X0O(r3, C3164n2.u);
        if (Intrinsics.XOO0ii0(r3, ByteOrder.BIG_ENDIAN) == false) goto L6;
        writeInt16(r2 >> 8, r3);
        writeInt8(r2 & 255);
        return;
    L6:
        writeInt16(65535 & r2, r3);
        writeInt8(r2 >> 16);
    }

    public final void writeInt32(int r3, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        if (Intrinsics.XOO0ii0(r4, ByteOrder.BIG_ENDIAN) == false) goto L6;
        writeInt16(r3 >> 16, r4);
        writeInt16(r3 & 65535, r4);
        return;
    L6:
        writeInt16(r3 & 65535, r4);
        writeInt16(r3 >> 16, r4);
    }

    public final void writeInt8(int r2) {
        writeIntN(r2, 8);
    }

    public final void writeIntN(int r10, @IntRange(from = 1, to = 8) int r11) {
        if (r11 >= 1) goto L5;
        return;
    L5:
        if (r11 <= 8) goto L7;
        return;
    L7:
        if (outOfRange(r11) == true) goto L17;
        int r12 = r10 & (((2 << r11) >> 1) - 1);
        if ((getMPositions()[1] + r11) > 8) goto L12;
        int r1 = 8 - (getMPositions()[1] + r11);
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        int r2 = getMPositions()[0];
        byte[] r3 = getMBytes();
        Intrinsics.XXI(r3);
        byte r13 = (byte) (r12 << r1);
        r0[r2] = (byte) (r13 | r3[getMPositions()[0]]);
    L13:
        skip(r11);
        return;
    L12:
        int r4 = (getMPositions()[1] + r11) - 8;
        byte[] r5 = getMBytes();
        Intrinsics.XXI(r5);
        int r6 = getMPositions()[0];
        byte[] r7 = getMBytes();
        Intrinsics.XXI(r7);
        r5[r6] = (byte) (r7[getMPositions()[0]] | ((byte) (r12 >> r4)));
        byte[] r8 = getMBytes();
        Intrinsics.XXI(r8);
        int r9 = getMPositions()[0] + 1;
        byte[] r14 = getMBytes();
        Intrinsics.XXI(r14);
        byte r15 = (byte) ((r12 & (((2 << r4) >> 1) - 1)) << (8 - r4));
        r8[r9] = (byte) (r15 | r14[getMPositions()[0] + 1]);
        goto L13
    }

    public final void writeList(@tb1 List<? extends BleBuffer> r2) {
        if (r2 == null) goto L7;
        Iterator<T> r3 = r2.iterator();
    L5:
        if (r3.hasNext() == false) goto L9;
        writeObject((BleBuffer) r3.next());
        goto L5
    L9:
        return;
    }

    public final void writeLong(long r3, @aa1 ByteOrder r5) {
        Intrinsics.X0O(r5, C3164n2.u);
        if (Intrinsics.XOO0ii0(r5, ByteOrder.BIG_ENDIAN) == false) goto L6;
        writeInt32((int) (r3 >> 32), r5);
        writeInt32((int) r3, r5);
        return;
    L6:
        writeInt32((int) r3, r5);
        writeInt32((int) (r3 >> 32), r5);
    }

    public final void writeObject(@tb1 BleBuffer r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        writeBytes$default(this, r3.toByteArray(), null, 2, null);
    }

    public final void writeString(@tb1 String r2, @aa1 Charset r3) {
        Intrinsics.X0O(r3, "charSet");
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.length() != 0) goto L7;
        return;
    L7:
        byte[] r4 = r2.getBytes(r3);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        writeBytes$default(this, r4, null, 2, null);
    }

    public final void writeStringWithFix(@tb1 String r4, int r5, @aa1 Charset r6) {
        Intrinsics.X0O(r6, "charSet");
        if (r4 != null) goto L5;
    L14:
        skip(r5 * 8);
        return;
    L5:
        if (r4.length() == 0) goto L14;
        byte[] r7 = r4.getBytes(r6);
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");
        writeBytes$default(this, ArraysKt___ArraysKt.O11IIOOX(r7, iO.Oi1(0, Math.min(r7.length, r5))), null, 2, null);
        if (r7.length >= r5) goto L17;
        int r8 = r5 - r7.length;
        byte[] r9 = new byte[r8];
        int r10 = 0;
    L10:
        if (r10 >= r8) goto L12;
        r9[r10] = 0;
        r10 = r10 + 1;
        goto L10
    L12:
        writeBytes$default(this, r9, null, 2, null);
        return;
    }

    public final void writeStringWithLimit(@tb1 String r8, int r9, @aa1 Charset r10, boolean r11) {
        Intrinsics.X0O(r10, "charSet");
        if (r8 != null) goto L5;
        return;
    L5:
        if (r8.length() != 0) goto L7;
        return;
    L7:
        byte[] r0 = r8.getBytes(r10);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        if (r0.length > r9) goto L12;
        writeBytes$default(this, r0, null, 2, null);
        return;
    L12:
        if (r11 == false) goto L21;
        int r12 = r8.length();
    L14:
        r12 = r12 - 1;
        if ((-1) >= r12) goto L26;
        StringBuilder r1 = new StringBuilder();
        String r5 = r8.substring(0, r12);
        Intrinsics.O10IXXX0X(r5, "substring(...)");
        r1.append(r5);
        r1.append(Typography.IXXOO);
        byte[] r2 = r1.toString().getBytes(r10);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        if (r2.length > r9) goto L14;
        writeBytes$default(this, r2, null, 2, null);
        return;
    L26:
        return;
    L21:
        writeBytes$default(this, ArraysKt___ArraysKt.O11IIOOX(r0, iO.Oi1(0, Math.min(r0.length, r9))), null, 2, null);
    }

    public final void writeStringWithMax(@aa1 String r2, int r3, @aa1 Charset r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r4, "charSet");
        writeStringWithFix(OOXX1OOO1.XIi00iiXO(r2, r3 - 1, r4), r3, r4);
    }

    public final void writeUInt32(long r2, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        writeInt32((int) r2, r4);
    }
}
