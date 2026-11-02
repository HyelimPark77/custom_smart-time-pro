package com.bestmafen.baseble.data;

import com.android.mltcode.paycertificationapi.XiOiXOi1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.C3164n2;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nByteArrayExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArrayExt.kt\ncom/bestmafen/baseble/data/ByteArrayExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,124:1\n1#2:125\n13880#3,3:126\n*S KotlinDebug\n*F\n+ 1 ByteArrayExt.kt\ncom/bestmafen/baseble/data/ByteArrayExtKt\n*L\n103#1:126,3\n*E\n"})
public final class ByteArrayExtKt {
    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return _get_mHexString_$lambda$0(r0);
    }

    private static final CharSequence _get_mHexString_$lambda$0(byte r1) {
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r2 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    }

    @aa1
    public static final byte[] append(@tb1 byte[] r0, @tb1 byte[] r1) {
        if (r0 != null) goto L6;
        if (r1 != null) goto L6;
        return new byte[0];
    L6:
        if (r0 != null) goto L9;
        Intrinsics.XXI(r1);
        return r1;
    L9:
        if (r1 != null) goto L12;
        return r0;
    L12:
        return ArraysKt___ArraysJvmKt.i1i(r0, r1);
    }

    @aa1
    public static final byte[] byteArrayOfBoolean(boolean r2) {
        return new byte[]{r2 ? 1 : 0};
    }

    @aa1
    public static final byte[] byteArrayOfInt16(int r3, @aa1 ByteOrder r4) {
        Intrinsics.X0O(r4, C3164n2.u);
        byte[] r0 = new byte[2];
        if (Intrinsics.XOO0ii0(r4, ByteOrder.BIG_ENDIAN) == false) goto L6;
        r0[0] = (byte) ((r3 >> 8) & 255);
        r0[1] = (byte) (r3 & 255);
        return r0;
    L6:
        r0[1] = (byte) ((r3 >> 8) & 255);
        r0[0] = (byte) (r3 & 255);
        return r0;
    }

    @aa1
    public static final byte[] byteArrayOfInt24(int r4, @aa1 ByteOrder r5) {
        Intrinsics.X0O(r5, C3164n2.u);
        byte[] r0 = new byte[3];
        if (Intrinsics.XOO0ii0(r5, ByteOrder.BIG_ENDIAN) == false) goto L6;
        r0[0] = (byte) ((r4 >> 16) & 255);
        r0[1] = (byte) ((r4 >> 8) & 255);
        r0[2] = (byte) (r4 & 255);
        return r0;
    L6:
        r0[2] = (byte) ((r4 >> 16) & 255);
        r0[1] = (byte) ((r4 >> 8) & 255);
        r0[0] = (byte) (r4 & 255);
        return r0;
    }

    @aa1
    public static final byte[] byteArrayOfInt32(int r5, @aa1 ByteOrder r6) {
        Intrinsics.X0O(r6, C3164n2.u);
        byte[] r0 = new byte[4];
        if (Intrinsics.XOO0ii0(r6, ByteOrder.BIG_ENDIAN) == false) goto L6;
        r0[0] = (byte) ((r5 >> 24) & 255);
        r0[1] = (byte) ((r5 >> 16) & 255);
        r0[2] = (byte) ((r5 >> 8) & 255);
        r0[3] = (byte) (r5 & 255);
        return r0;
    L6:
        r0[0] = (byte) (r5 & 255);
        r0[1] = (byte) ((r5 >> 8) & 255);
        r0[2] = (byte) ((r5 >> 16) & 255);
        r0[3] = (byte) ((r5 >> 24) & 255);
        return r0;
    }

    @aa1
    public static final byte[] byteArrayOfInt8(int r2) {
        return new byte[]{(byte) r2};
    }

    public static final int getInt(@aa1 byte[] r5, int r6, int r7, @aa1 ByteOrder r8) {
        Intrinsics.X0O(r5, "<this>");
        Intrinsics.X0O(r8, "byteOrder");
        if (r7 < 1) goto L38;
        if (r7 > 4) goto L38;
        if ((r6 + r7) <= r5.length) goto L10;
        return 0;
    L10:
        if (Intrinsics.XOO0ii0(r8, ByteOrder.BIG_ENDIAN) == false) goto L24;
        if (r7 == 1) goto L23;
        if (r7 == 2) goto L20;
        if (r7 == 3) goto L18;
        if (r7 == 4) goto L16;
        return 0;
    L16:
        int r9 = (((r5[r6] & 255) << 24) | ((r5[r6 + 1] & 255) << 16)) | ((r5[r6 + 2] & 255) << 8);
        return (r5[r6 + 3] & 255) | r9;
    L18:
        int r10 = ((r5[r6] & 255) << 16) | ((r5[r6 + 1] & 255) << 8);
        return (r5[r6 + 2] & 255) | r10;
    L20:
        int r11 = (r5[r6] & 255) << 8;
        return (r5[r6 + 1] & 255) | r11;
    L23:
        return r5[r6] & 255;
    L24:
        if (r7 == 1) goto L36;
        if (r7 == 2) goto L33;
        if (r7 == 3) goto L31;
        if (r7 == 4) goto L29;
        return 0;
    L29:
        int r12 = ((r5[r6] & 255) | ((r5[r6 + 1] & 255) << 8)) | ((r5[r6 + 2] & 255) << 16);
        return ((r5[r6 + 3] & 255) << 24) | r12;
    L31:
        int r13 = (r5[r6] & 255) | ((r5[r6 + 1] & 255) << 8);
        return ((r5[r6 + 2] & 255) << 16) | r13;
    L33:
        int r14 = r5[r6] & 255;
        return ((r5[r6 + 1] & 255) << 8) | r14;
    L36:
        return r5[r6] & 255;
    L38:
        throw new IllegalArgumentException("length must be in [1, 4]");
    }

    public static /* synthetic */ int getInt$default(byte[] r0, int r1, int r2, ByteOrder r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = ByteOrder.BIG_ENDIAN;
        Intrinsics.O10IXXX0X(r3, "BIG_ENDIAN");
    L6:
        return getInt(r0, r1, r2, r3);
    }

    @aa1
    public static final String getMHexString(@tb1 byte[] r9) {
        if (r9 != null) goto L6;
        return "";
    L6:
        return ArraysKt___ArraysKt.i0I(r9, " ", null, null, 0, null, new XiOiXOi1i(), 30, null);
    }

    @aa1
    public static final List<byte[]> splitWith0(@tb1 byte[] r9, int r10) {
        ArrayList r0 = new ArrayList();
        if (r9 == null) goto L18;
        int r1 = r9.length;
        int r3 = 0;
        int r4 = 0;
        boolean r5 = false;
        int r6 = 0;
    L5:
        if (r3 >= r1) goto L18;
        byte r7 = r9[r3];
        int r8 = r4 + 1;
        if (r4 < r10) goto L17;
        if (r7 != 0) goto L11;
        if (r5 == false) goto L17;
        r0.add(ArraysKt___ArraysJvmKt.I0IIOI(r9, r6, r4));
        r5 = false;
        goto L17
    L11:
        if (r5 == true) goto L14;
        r5 = true;
        r6 = r4;
    L14:
        if (r4 != ArraysKt___ArraysKt.XOO1Iii(r9)) goto L17;
        if (r5 == false) goto L17;
        r0.add(ArraysKt___ArraysJvmKt.I0IIOI(r9, r6, r8));
    L17:
        r3 = r3 + 1;
        r4 = r8;
    L18:
        return r0;
    }

    public static /* synthetic */ List splitWith0$default(byte[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return splitWith0(r0, r1);
    }
}
