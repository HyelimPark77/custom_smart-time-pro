package com.bestmafen.baseble.data;

import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.ironsource.C3164n2;
import com.ironsource.G5;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleWatchFaceId;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,322:1\n222#1,4:329\n1784#2,6:323\n13880#2,3:333\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n234#1:329,4\n190#1:323,6\n244#1:333,3\n*E\n"})
public class BleReadable extends BleByteArray {
    private static final byte BYTE0 = 0;

    @aa1
    public static final Companion Companion = null;

    @SourceDebugExtension({"SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,322:1\n277#1,5:323\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n295#1:323,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ List ofList$default(Companion r4, byte[] r5, int r6, int r7, int r8, int r9, Object r10) {
            if ((r9 & 4) == 0) goto L6;
            r7 = 0;
        L6:
            if ((r9 & 8) == 0) goto L8;
            r8 = r5.length;
        L8:
            Intrinsics.X0O(r5, "bytes");
            ArrayList r11 = new ArrayList();
            int r12 = (r8 - r7) / r6;
            if (r12 <= 0) goto L13;
            int r13 = 0;
        L11:
            if (r13 >= r12) goto L13;
            Companion r0 = BleReadable.Companion;
            int r1 = (r6 * r13) + r7;
            r13 = r13 + 1;
            byte[] r2 = ArraysKt___ArraysJvmKt.I0IIOI(r5, r1, (r6 * r13) + r7);
            int r3 = r2.length;
            Intrinsics.OX(4, "T");
            Object r14 = BleReadable.class.newInstance();
            BleReadable r15 = (BleReadable) r14;
            r15.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r2, 0, r3));
            r15.decode();
            Intrinsics.O10IXXX0X(r14, "also(...)");
            r11.add(r15);
        L13:
            return r11;
        }

        public static /* synthetic */ BleReadable ofObject$default(Companion r0, byte[] r1, int r2, int r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r4 & 4) == 0) goto L8;
            r3 = r1.length;
        L8:
            Intrinsics.X0O(r1, "bytes");
            Intrinsics.OX(4, "T");
            Object r6 = BleReadable.class.newInstance();
            BleReadable r7 = (BleReadable) r6;
            r7.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r1, r2, r3));
            r7.decode();
            Intrinsics.O10IXXX0X(r6, "also(...)");
            return r7;
        }

        public static /* synthetic */ SimpleDateFormat timeFormat$default(Companion r0, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = "yyyy/MM/dd HH:mm:ss";
        L6:
            return r0.timeFormat(r1);
        }

        public final long millisToTime(long r4) {
            return ((r4 + ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis()))) / ((long) 1000)) - ((long) BleConstsKt.DATA_EPOCH);
        }

        public final /* synthetic */ <T extends BleReadable> List<T> ofList(byte[] r8, int r9, int r10, int r11) {
            Intrinsics.X0O(r8, "bytes");
            ArrayList r0 = new ArrayList();
            int r12 = (r11 - r10) / r9;
            if (r12 <= 0) goto L7;
            int r2 = 0;
        L5:
            if (r2 >= r12) goto L7;
            Companion r3 = BleReadable.Companion;
            int r4 = (r9 * r2) + r10;
            r2 = r2 + 1;
            byte[] r5 = ArraysKt___ArraysJvmKt.I0IIOI(r8, r4, (r9 * r2) + r10);
            int r6 = r5.length;
            Intrinsics.OX(4, "T");
            Object r7 = BleReadable.class.newInstance();
            BleReadable r13 = (BleReadable) r7;
            r13.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r5, 0, r6));
            r13.decode();
            Intrinsics.O10IXXX0X(r7, "also(...)");
            r0.add(r13);
        L7:
            return r0;
        }

        public final /* synthetic */ <T extends BleReadable> T ofObject(byte[] r3, int r4, int r5) {
            Intrinsics.X0O(r3, "bytes");
            Intrinsics.OX(4, "T");
            Object r0 = BleReadable.class.newInstance();
            T r1 = (T) r0;
            r1.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r3, r4, r5));
            r1.decode();
            Intrinsics.O10IXXX0X(r0, "also(...)");
            return r1;
        }

        @aa1
        public final SimpleDateFormat timeFormat(@aa1 String r3) {
            Intrinsics.X0O(r3, "pattern");
            return new SimpleDateFormat(r3, Locale.ENGLISH);
        }

        public final long timeToMillis(int r7) {
            return (((long) (r7 + BleConstsKt.DATA_EPOCH)) * 1000) - TimeZone.getDefault().getOffset(System.currentTimeMillis());
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleReadable() {
        super(null, null, 3, null);
    }

    public static /* synthetic */ double readDouble$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readDouble(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readDouble");
    }

    public static /* synthetic */ float readFloat$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readFloat(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readFloat");
    }

    public static /* synthetic */ short readInt16$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readInt16(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt16");
    }

    public static /* synthetic */ int readInt24$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readInt24(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt24");
    }

    public static /* synthetic */ int readInt32$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readInt32(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt32");
    }

    public static /* synthetic */ long readInt64$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readInt64(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt64");
    }

    public static /* synthetic */ String readString$default(BleReadable r0, int r1, Charset r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r2, "defaultCharset(...)");
    L7:
        return r0.readString(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readString");
    }

    public static /* synthetic */ String readStringUtil$default(BleReadable r0, byte r1, Charset r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r2, "defaultCharset(...)");
    L7:
        return r0.readStringUtil(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readStringUtil");
    }

    public static /* synthetic */ char readUInt16$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readUInt16(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readUInt16");
    }

    public static /* synthetic */ long readUInt32$default(BleReadable r0, ByteOrder r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.getMByteOrder();
    L7:
        return r0.readUInt32(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readUInt32");
    }

    @CallSuper
    public void decode() {
        resetOffset();
    }

    public final boolean readBoolean() {
        if (readIntN(1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @aa1
    public final byte[] readBytes(int r5) {
        int r0 = 0;
        if (r5 >= 0) goto L6;
        i1O0OXO1O.OXO1.OXO1("readBytes error length = " + r5 + ' ');
        return new byte[0];
    L6:
        byte[] r1 = new byte[r5];
    L7:
        if (r0 >= r5) goto L9;
        r1[r0] = readInt8();
        r0 = r0 + 1;
        goto L7
    L9:
        return r1;
    }

    @aa1
    public final byte[] readBytesUtil(byte r9) {
        byte[] r0 = getMBytes();
        if (r0 == null) goto L13;
        int r2 = r0.length;
        int r3 = 0;
        int r4 = 0;
    L5:
        if (r3 >= r2) goto L13;
        byte r5 = r0[r3];
        int r6 = r4 + 1;
        if (r4 < getMPositions()[0]) goto L11;
        if (r5 != r9) goto L11;
        byte[] r10 = readBytes(r4 - getMPositions()[0]);
        skip(8);
        return r10;
    L11:
        r3 = r3 + 1;
        r4 = r6;
    L13:
        return new byte[0];
    }

    public final double readDouble(@aa1 ByteOrder r3) {
        Intrinsics.X0O(r3, C3164n2.u);
        return Double.longBitsToDouble(readInt64(r3));
    }

    public final float readFloat(@aa1 ByteOrder r2) {
        Intrinsics.X0O(r2, C3164n2.u);
        return Float.intBitsToFloat(readInt32(r2));
    }

    public final short readInt16(@aa1 ByteOrder r2) {
        Intrinsics.X0O(r2, C3164n2.u);
        if (Intrinsics.XOO0ii0(r2, ByteOrder.BIG_ENDIAN) == false) goto L5;
        byte r3 = readInt8();
        byte r0 = readInt8();
    L7:
        return (short) (((r3 & 255) << 8) | (r0 & 255));
    L5:
        r0 = readInt8();
        r3 = readInt8();
        goto L7
    }

    public final int readInt24(@aa1 ByteOrder r2) {
        Intrinsics.X0O(r2, C3164n2.u);
        if (Intrinsics.XOO0ii0(r2, ByteOrder.BIG_ENDIAN) == false) goto L5;
        char r0 = readUInt8();
        char r3 = readUInt16(r2);
    L7:
        return r3 | (r0 << 16);
    L5:
        r3 = readUInt16(r2);
        r0 = readUInt8();
        goto L7
    }

    public final int readInt32(@aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        if (Intrinsics.XOO0ii0(r4, ByteOrder.BIG_ENDIAN) == false) goto L5;
        short r0 = readInt16(r4);
        short r5 = readInt16(r4);
    L6:
        int r1 = (r0 & UShort.X11iII1O1) << 16;
        return (r5 & UShort.X11iII1O1) | r1;
    L5:
        short r2 = readInt16(r4);
        r0 = readInt16(r4);
        r5 = r2;
        goto L6
    }

    public final long readInt64(@aa1 ByteOrder r8) {
        Intrinsics.X0O(r8, C3164n2.u);
        if (Intrinsics.XOO0ii0(r8, ByteOrder.BIG_ENDIAN) == false) goto L5;
        int r0 = readInt32(r8);
        int r9 = readInt32(r8);
    L7:
        return ((((long) r0) & BleWatchFaceId.WATCHFACE_ID_INVALID) << 32) | (BleWatchFaceId.WATCHFACE_ID_INVALID & ((long) r9));
    L5:
        int r1 = readInt32(r8);
        r0 = readInt32(r8);
        r9 = r1;
        goto L7
    }

    public final byte readInt8() {
        return readIntN(8);
    }

    public final byte readIntN(@IntRange(from = 1, to = 8) int r7) {
        if (r7 >= 1) goto L5;
    L15:
        return 0;
    L5:
        if (r7 > 8) goto L15;
        if (outOfRange(r7) == true) goto L15;
        if ((getMPositions()[1] + r7) > 8) goto L12;
        byte[] r3 = getMBytes();
        Intrinsics.XXI(r3);
        int r0 = (r3[getMPositions()[0]] >> ((8 - getMPositions()[1]) - r7)) & (((2 << r7) >> 1) - 1);
    L13:
        skip(r7);
        return (byte) r0;
    L12:
        byte[] r4 = getMBytes();
        Intrinsics.XXI(r4);
        int r2 = (r4[getMPositions()[0]] & (((2 << (8 - getMPositions()[1])) >> 1) - 1)) << ((getMPositions()[1] + r7) - 8);
        byte[] r5 = getMBytes();
        Intrinsics.XXI(r5);
        r0 = ((r5[getMPositions()[0] + 1] & 255) >> ((16 - getMPositions()[1]) - r7)) | r2;
        goto L13
    }

    public final /* synthetic */ <T extends BleReadable> List<T> readList(int r5, int r6) {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L5;
        Intrinsics.OX(4, "T");
        BleReadable r2 = (BleReadable) BleReadable.class.newInstance();
        r2.setMBytes(readBytes(r6));
        r2.decode();
        Intrinsics.XXI(r2);
        r0.add(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public final /* synthetic */ <T extends BleReadable> T readObject(int r3) {
        Intrinsics.OX(4, "T");
        T r0 = (T) BleReadable.class.newInstance();
        r0.setMBytes(readBytes(r3));
        r0.decode();
        Intrinsics.XXI(r0);
        return r0;
    }

    @aa1
    public final String readString(int r8, @aa1 Charset r9) {
        Intrinsics.X0O(r9, G5.M);
        byte[] r1 = readBytes(r8);     // Catch: Exception -> L17
        int r4 = 0;
        if (Intrinsics.XOO0ii0(r9, Charsets.XIi00iiXO) == false) goto L7;
    L33:
        int r10 = r1.length;     // Catch: Exception -> L17
    L34:
        if (r4 >= r10) goto L39;
        if (r1[r4] == 0) goto L40;
        r4 = r4 + 1;     // Catch: Exception -> L17
    L40:
        if (r4 == (-1)) goto L42;
        byte[] r2 = Arrays.copyOf(r1, r4);     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r2, "copyOf(...)");     // Catch: Exception -> L17
        return new String(r2, r9);
    L42:
        return new String(r1, r9);
    L39:
        r4 = -1;
        goto L40
    L7:
        if (Intrinsics.XOO0ii0(r9, Charsets.IiI10X) == true) goto L33;
        if (Intrinsics.XOO0ii0(r9, Charsets.iO) == false) goto L12;
    L19:
        int r11 = r8 / 2;     // Catch: Exception -> L17
    L20:
        if (r4 >= r11) goto L27;
        int r3 = r4 * 2;     // Catch: Exception -> L17
        if (r1[r3] != 0) goto L26;
        if (r1[r3 + 1] != 0) goto L26;
    L28:
        if (r3 == (-1)) goto L30;
        byte[] r5 = Arrays.copyOf(r1, r3);     // Catch: Exception -> L17
        Intrinsics.O10IXXX0X(r5, "copyOf(...)");     // Catch: Exception -> L17
        return new String(r5, r9);
    L30:
        return new String(r1, r9);
    L26:
        r4 = r4 + 1;     // Catch: Exception -> L17
        goto L20
    L27:
        r3 = -1;
        goto L28
    L12:
        if (Intrinsics.XOO0ii0(r9, Charsets.XO0O10) == true) goto L19;
        if (Intrinsics.XOO0ii0(r9, Charsets.O00) == true) goto L19;
        return "";
    L17:
        e = move-exception;
        e.printStackTrace();
        return "";
    }

    @aa1
    public final String readStringUtil(byte r2, @aa1 Charset r3) {
        Intrinsics.X0O(r3, G5.M);
        byte[] r4 = readBytesUtil(r2);
        if (r4.length != 0) goto L7;
        return "";
    L7:
        return new String(r4, r3);
    }

    public final char readUInt16(@aa1 ByteOrder r2) {
        Intrinsics.X0O(r2, C3164n2.u);
        return (char) readInt16(r2);
    }

    public final long readUInt32(@aa1 ByteOrder r5) {
        Intrinsics.X0O(r5, C3164n2.u);
        return ((long) readInt32(r5)) & BleWatchFaceId.WATCHFACE_ID_INVALID;
    }

    public final char readUInt8() {
        return (char) (readIntN(8) & 255);
    }
}
