package com.bestmafen.baseble.data;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nByteArrayExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArrayExt.kt\ncom/bestmafen/baseble/data/ByteArrayExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,124:1\n1#2:125\n13880#3,3:126\n*S KotlinDebug\n*F\n+ 1 ByteArrayExt.kt\ncom/bestmafen/baseble/data/ByteArrayExtKt\n*L\n103#1:126,3\n*E\n"})
public final class ByteArrayExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_mHexString_$lambda$0(byte b) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @aa1
    public static final byte[] append(@tb1 byte[] bArr, @tb1 byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return new byte[0];
        }
        if (bArr != null) {
            return bArr2 == null ? bArr : ArraysKt___ArraysJvmKt.i1i(bArr, bArr2);
        }
        Intrinsics.XXI(bArr2);
        return bArr2;
    }

    @aa1
    public static final byte[] byteArrayOfBoolean(boolean z) {
        return new byte[]{z ? (byte) 1 : (byte) 0};
    }

    @aa1
    public static final byte[] byteArrayOfInt16(int i, @aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        byte[] bArr = new byte[2];
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            bArr[0] = (byte) ((i >> 8) & 255);
            bArr[1] = (byte) (i & 255);
            return bArr;
        }
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[0] = (byte) (i & 255);
        return bArr;
    }

    @aa1
    public static final byte[] byteArrayOfInt24(int i, @aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        byte[] bArr = new byte[3];
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            bArr[0] = (byte) ((i >> 16) & 255);
            bArr[1] = (byte) ((i >> 8) & 255);
            bArr[2] = (byte) (i & 255);
            return bArr;
        }
        bArr[2] = (byte) ((i >> 16) & 255);
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[0] = (byte) (i & 255);
        return bArr;
    }

    @aa1
    public static final byte[] byteArrayOfInt32(int i, @aa1 ByteOrder order) {
        Intrinsics.X0O(order, "order");
        byte[] bArr = new byte[4];
        if (Intrinsics.XOO0ii0(order, ByteOrder.BIG_ENDIAN)) {
            bArr[0] = (byte) ((i >> 24) & 255);
            bArr[1] = (byte) ((i >> 16) & 255);
            bArr[2] = (byte) ((i >> 8) & 255);
            bArr[3] = (byte) (i & 255);
            return bArr;
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[2] = (byte) ((i >> 16) & 255);
        bArr[3] = (byte) ((i >> 24) & 255);
        return bArr;
    }

    @aa1
    public static final byte[] byteArrayOfInt8(int i) {
        return new byte[]{(byte) i};
    }

    public static final int getInt(@aa1 byte[] bArr, int i, int i2, @aa1 ByteOrder byteOrder) {
        Intrinsics.X0O(bArr, "<this>");
        Intrinsics.X0O(byteOrder, "byteOrder");
        if (i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("length must be in [1, 4]");
        }
        if (i + i2 > bArr.length) {
            return 0;
        }
        if (Intrinsics.XOO0ii0(byteOrder, ByteOrder.BIG_ENDIAN)) {
            if (i2 == 1) {
                return bArr[i] & 255;
            }
            if (i2 == 2) {
                return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            }
            if (i2 == 3) {
                return (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            }
            if (i2 != 4) {
                return 0;
            }
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        if (i2 == 1) {
            return bArr[i] & 255;
        }
        if (i2 == 2) {
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        }
        if (i2 == 3) {
            return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        }
        if (i2 != 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static /* synthetic */ int getInt$default(byte[] bArr, int i, int i2, ByteOrder BIG_ENDIAN, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
            Intrinsics.O10IXXX0X(BIG_ENDIAN, "BIG_ENDIAN");
        }
        return getInt(bArr, i, i2, BIG_ENDIAN);
    }

    @aa1
    public static final String getMHexString(@tb1 byte[] bArr) {
        return bArr == null ? "" : ArraysKt___ArraysKt.i0I(bArr, " ", null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.XiOiXOi1i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ByteArrayExtKt._get_mHexString_$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    @aa1
    public static final List<byte[]> splitWith0(@tb1 byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            int length = bArr.length;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                byte b = bArr[i2];
                int i5 = i3 + 1;
                if (i3 >= i) {
                    if (b != 0) {
                        if (!z) {
                            z = true;
                            i4 = i3;
                        }
                        if (i3 == ArraysKt___ArraysKt.XOO1Iii(bArr) && z) {
                            arrayList.add(ArraysKt___ArraysJvmKt.I0IIOI(bArr, i4, i5));
                        }
                    } else if (z) {
                        arrayList.add(ArraysKt___ArraysJvmKt.I0IIOI(bArr, i4, i3));
                        z = false;
                    }
                }
                i2++;
                i3 = i5;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List splitWith0$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return splitWith0(bArr, i);
    }
}
