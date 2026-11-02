package com.bestmafen.baseble.data;

import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,322:1\n277#1,5:323\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n295#1:323,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List ofList$default(Companion companion, byte[] bytes, int i, int i2, int i3, int i4, Object obj) throws IllegalAccessException, InstantiationException {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bytes.length;
            }
            Intrinsics.X0O(bytes, "bytes");
            ArrayList arrayList = new ArrayList();
            int i5 = (i3 - i2) / i;
            if (i5 > 0) {
                int i6 = 0;
                while (i6 < i5) {
                    Companion companion2 = BleReadable.Companion;
                    int i7 = (i * i6) + i2;
                    i6++;
                    byte[] bArrI0IIOI = ArraysKt___ArraysJvmKt.I0IIOI(bytes, i7, (i * i6) + i2);
                    int length = bArrI0IIOI.length;
                    Intrinsics.m39537OX(4, "T");
                    Object objNewInstance = BleReadable.class.newInstance();
                    BleReadable bleReadable = (BleReadable) objNewInstance;
                    bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bArrI0IIOI, 0, length));
                    bleReadable.decode();
                    Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
                    arrayList.add(bleReadable);
                }
            }
            return arrayList;
        }

        public static /* synthetic */ BleReadable ofObject$default(Companion companion, byte[] bytes, int i, int i2, int i3, Object obj) throws IllegalAccessException, InstantiationException {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bytes.length;
            }
            Intrinsics.X0O(bytes, "bytes");
            Intrinsics.m39537OX(4, "T");
            Object objNewInstance = BleReadable.class.newInstance();
            BleReadable bleReadable = (BleReadable) objNewInstance;
            bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bytes, i, i2));
            bleReadable.decode();
            Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
            return bleReadable;
        }

        public static /* synthetic */ SimpleDateFormat timeFormat$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "yyyy/MM/dd HH:mm:ss";
            }
            return companion.timeFormat(str);
        }

        public final long millisToTime(long j) {
            return ((j + ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis()))) / ((long) 1000)) - ((long) BleConstsKt.DATA_EPOCH);
        }

        public final /* synthetic */ <T extends BleReadable> List<T> ofList(byte[] bytes, int i, int i2, int i3) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(bytes, "bytes");
            ArrayList arrayList = new ArrayList();
            int i4 = (i3 - i2) / i;
            if (i4 > 0) {
                int i5 = 0;
                while (i5 < i4) {
                    Companion companion = BleReadable.Companion;
                    int i6 = (i * i5) + i2;
                    i5++;
                    byte[] bArrI0IIOI = ArraysKt___ArraysJvmKt.I0IIOI(bytes, i6, (i * i5) + i2);
                    int length = bArrI0IIOI.length;
                    Intrinsics.m39537OX(4, "T");
                    Object objNewInstance = BleReadable.class.newInstance();
                    BleReadable bleReadable = (BleReadable) objNewInstance;
                    bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bArrI0IIOI, 0, length));
                    bleReadable.decode();
                    Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
                    arrayList.add(bleReadable);
                }
            }
            return arrayList;
        }

        public final /* synthetic */ <T extends BleReadable> T ofObject(byte[] bytes, int i, int i2) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(bytes, "bytes");
            Intrinsics.m39537OX(4, "T");
            Object objNewInstance = BleReadable.class.newInstance();
            T t = (T) objNewInstance;
            t.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bytes, i, i2));
            t.decode();
            Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
            return t;
        }

        @aa1
        public final SimpleDateFormat timeFormat(@aa1 String pattern) {
            Intrinsics.X0O(pattern, "pattern");
            return new SimpleDateFormat(pattern, Locale.ENGLISH);
        }

        public final long timeToMillis(int i) {
            return (((long) (i + BleConstsKt.DATA_EPOCH)) * 1000) - ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis()));
        }

        private Companion() {
        }
    }

    public BleReadable() {
        super(null, null, 3, null);
    }

    public static /* synthetic */ double readDouble$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readDouble");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readDouble(byteOrder);
    }

    public static /* synthetic */ float readFloat$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readFloat");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readFloat(byteOrder);
    }

    public static /* synthetic */ short readInt16$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt16");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readInt16(byteOrder);
    }

    public static /* synthetic */ int readInt24$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt24");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readInt24(byteOrder);
    }

    public static /* synthetic */ int readInt32$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt32");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readInt32(byteOrder);
    }

    public static /* synthetic */ long readInt64$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readInt64");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readInt64(byteOrder);
    }

    public static /* synthetic */ String readString$default(BleReadable bleReadable, int i, Charset charset, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readString");
        }
        if ((i2 & 2) != 0) {
            charset = Charset.defaultCharset();
            Intrinsics.O10IXXX0X(charset, "defaultCharset(...)");
        }
        return bleReadable.readString(i, charset);
    }

    public static /* synthetic */ String readStringUtil$default(BleReadable bleReadable, byte b, Charset charset, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readStringUtil");
        }
        if ((i & 2) != 0) {
            charset = Charset.defaultCharset();
            Intrinsics.O10IXXX0X(charset, "defaultCharset(...)");
        }
        return bleReadable.readStringUtil(b, charset);
    }

    public static /* synthetic */ char readUInt16$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readUInt16");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readUInt16(byteOrder);
    }

    public static /* synthetic */ long readUInt32$default(BleReadable bleReadable, ByteOrder byteOrder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readUInt32");
        }
        if ((i & 1) != 0) {
            byteOrder = bleReadable.getMByteOrder();
        }
        return bleReadable.readUInt32(byteOrder);
    }

    @CallSuper
    public void decode() {
        resetOffset();
    }

    public final boolean readBoolean() {
        return readIntN(1) == 1;
    }

    @aa1
    public final byte[] readBytes(int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = readInt8();
            }
            return bArr;
        }
        i1O0OXO1O.OXO1.OXO1("readBytes error length = " + i + ' ');
        return new byte[0];
    }

    @aa1
    public final byte[] readBytesUtil(byte b) {
        byte[] mBytes = getMBytes();
        if (mBytes != null) {
            int length = mBytes.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte b2 = mBytes[i];
                int i3 = i2 + 1;
                if (i2 >= getMPositions()[0] && b2 == b) {
                    byte[] bytes = readBytes(i2 - getMPositions()[0]);
                    skip(8);
                    return bytes;
                }
                i++;
                i2 = i3;
            }
        }
        return new byte[0];
    }

    public final double readDouble(@aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        return Double.longBitsToDouble(readInt64(order));
    }

    public final float readFloat(@aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        return Float.intBitsToFloat(readInt32(order));
    }

    public final short readInt16(@aa1 ByteOrder order) {
        byte int8;
        byte int9;
        Intrinsics.X0O(order, "order");
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            int9 = readInt8();
            int8 = readInt8();
        } else {
            int8 = readInt8();
            int9 = readInt8();
        }
        return (short) (((int9 & 255) << 8) | (int8 & 255));
    }

    public final int readInt24(@aa1 ByteOrder order) {
        char uInt16;
        char uInt8;
        Intrinsics.X0O(order, "order");
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            uInt8 = readUInt8();
            uInt16 = readUInt16(order);
        } else {
            uInt16 = readUInt16(order);
            uInt8 = readUInt8();
        }
        return uInt16 | (uInt8 << 16);
    }

    public final int readInt32(@aa1 ByteOrder order) {
        short int16;
        short int17;
        Intrinsics.X0O(order, "order");
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            int16 = readInt16(order);
            int17 = readInt16(order);
        } else {
            short int18 = readInt16(order);
            int16 = readInt16(order);
            int17 = int18;
        }
        return (int17 & UShort.X11iII1O1) | ((int16 & UShort.X11iII1O1) << 16);
    }

    public final long readInt64(@aa1 ByteOrder order) {
        int int32;
        int int33;
        Intrinsics.X0O(order, "order");
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            int32 = readInt32(order);
            int33 = readInt32(order);
        } else {
            int int34 = readInt32(order);
            int32 = readInt32(order);
            int33 = int34;
        }
        return ((((long) int32) & BleWatchFaceId.WATCHFACE_ID_INVALID) << 32) | (BleWatchFaceId.WATCHFACE_ID_INVALID & ((long) int33));
    }

    public final byte readInt8() {
        return readIntN(8);
    }

    public final byte readIntN(@IntRange(from = 1, m3to = 8) int i) {
        int i2;
        if (i < 1 || i > 8 || outOfRange(i)) {
            return (byte) 0;
        }
        if (getMPositions()[1] + i <= 8) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            i2 = (mBytes[getMPositions()[0]] >> ((8 - getMPositions()[1]) - i)) & (((2 << i) >> 1) - 1);
        } else {
            byte[] mBytes2 = getMBytes();
            Intrinsics.XXI(mBytes2);
            int i3 = (mBytes2[getMPositions()[0]] & (((2 << (8 - getMPositions()[1])) >> 1) - 1)) << ((getMPositions()[1] + i) - 8);
            byte[] mBytes3 = getMBytes();
            Intrinsics.XXI(mBytes3);
            i2 = ((mBytes3[getMPositions()[0] + 1] & 255) >> ((16 - getMPositions()[1]) - i)) | i3;
        }
        skip(i);
        return (byte) i2;
    }

    public final /* synthetic */ <T extends BleReadable> List<T> readList(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            Intrinsics.m39537OX(4, "T");
            BleReadable bleReadable = (BleReadable) BleReadable.class.newInstance();
            bleReadable.setMBytes(readBytes(i2));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList.add(bleReadable);
        }
        return arrayList;
    }

    public final /* synthetic */ <T extends BleReadable> T readObject(int i) {
        Intrinsics.m39537OX(4, "T");
        T t = (T) BleReadable.class.newInstance();
        t.setMBytes(readBytes(i));
        t.decode();
        Intrinsics.XXI(t);
        return t;
    }

    @aa1
    public final String readString(int i, @aa1 Charset charset) {
        int i2;
        Intrinsics.X0O(charset, "charset");
        try {
            byte[] bytes = readBytes(i);
            int i3 = 0;
            if (!Intrinsics.XOO0ii0(charset, Charsets.XIi00iiXO) && !Intrinsics.XOO0ii0(charset, Charsets.IiI10X)) {
                if (!Intrinsics.XOO0ii0(charset, Charsets.f56405iO) && !Intrinsics.XOO0ii0(charset, Charsets.XO0O10) && !Intrinsics.XOO0ii0(charset, Charsets.O00)) {
                    return "";
                }
                int i4 = i / 2;
                while (true) {
                    if (i3 >= i4) {
                        i2 = -1;
                        break;
                    }
                    i2 = i3 * 2;
                    if (bytes[i2] == 0 && bytes[i2 + 1] == 0) {
                        break;
                    }
                    i3++;
                }
                if (i2 == -1) {
                    return new String(bytes, charset);
                }
                byte[] bArrCopyOf = Arrays.copyOf(bytes, i2);
                Intrinsics.O10IXXX0X(bArrCopyOf, "copyOf(...)");
                return new String(bArrCopyOf, charset);
            }
            int length = bytes.length;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (bytes[i3] == 0) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return new String(bytes, charset);
            }
            byte[] bArrCopyOf2 = Arrays.copyOf(bytes, i3);
            Intrinsics.O10IXXX0X(bArrCopyOf2, "copyOf(...)");
            return new String(bArrCopyOf2, charset);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @aa1
    public final String readStringUtil(byte b, @aa1 Charset charset) {
        Intrinsics.X0O(charset, "charset");
        byte[] bytesUtil = readBytesUtil(b);
        return bytesUtil.length == 0 ? "" : new String(bytesUtil, charset);
    }

    public final char readUInt16(@aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        return (char) readInt16(order);
    }

    public final long readUInt32(@aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        return ((long) readInt32(order)) & BleWatchFaceId.WATCHFACE_ID_INVALID;
    }

    public final char readUInt8() {
        return (char) (readIntN(8) & 255);
    }
}
