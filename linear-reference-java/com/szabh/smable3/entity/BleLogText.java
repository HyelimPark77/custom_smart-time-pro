package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLogText extends BleReadable {
    private static final int COMOTION_HEADER_HIGH_BYTE_OFFSET = 3;
    private static final int COMOTION_HEADER_MASK = 252;
    private static final int COMOTION_HEADER_V1 = 196;
    private static final int COMOTION_RECORDS_PER_BLOCK = 2;
    private static final int COMOTION_RECORD_LENGTH = 32;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 64;

    @aa1
    private String mContent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final boolean hasCoMotionHeader(@aa1 byte[] r4, int r5) {
            Intrinsics.X0O(r4, "bytes");
            if (r5 >= 0) goto L5;
        L11:
            return false;
        L5:
            if ((r5 + 32) > r4.length) goto L11;
            if ((r4[r5 + 3] & 252) != 196) goto L11;
            return true;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleLogText() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleLogText copy$default(BleLogText r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mContent;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<byte[]> coMotionRecords() {
        byte[] r0 = getMBytes();
        if (r0 != null) goto L7;
        return CollectionsKt__CollectionsKt.iI();
    L7:
        if (r0.length != 64) goto L16;
        Companion r1 = Companion;
        if (r1.hasCoMotionHeader(r0, 0) == false) goto L16;
        ArrayList r4 = new ArrayList(2);
        r4.add(ArraysKt___ArraysJvmKt.I0IIOI(r0, 0, 32));
        if (r1.hasCoMotionHeader(r0, 32) == false) goto L14;
        r4.add(ArraysKt___ArraysJvmKt.I0IIOI(r0, 32, 64));
    L14:
        return r4;
    L16:
        return CollectionsKt__CollectionsKt.iI();
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleLogText copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        return new BleLogText(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] r0 = getMBytes();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.length != 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == false) goto L10;
        return;
    L10:
        if (Companion.hasCoMotionHeader(r0, 0) == false) goto L13;
        this.mContent = "";
        return;
    L13:
        int r2 = ArraysKt___ArraysKt.OO1XIX(r0, (byte) 0);
        if (r2 != (-1)) goto L16;
        Charset r3 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(r3, "UTF_8");
        String r4 = new String(r0, r3);
    L17:
        this.mContent = r4;
        return;
    L16:
        Charset r5 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(r5, "UTF_8");
        r4 = new String(r0, 0, r2, r5);
        goto L17
    L7:
        r1 = false;
        goto L8
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleLogText) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mContent, ((BleLogText) r4).mContent) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public int hashCode() {
        return this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    @aa1
    public String toString() {
        return "BleLogText(mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLogText(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        this.mContent = r2;
    }

    public /* synthetic */ BleLogText(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
