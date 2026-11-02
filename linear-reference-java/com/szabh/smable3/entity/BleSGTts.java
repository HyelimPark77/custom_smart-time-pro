package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGTts extends BleReadable {

    @aa1
    private Charset mCharset;

    @aa1
    private String mTts;

    /* JADX WARN: Multi-variable type inference failed */
    public BleSGTts() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSGTts copy$default(BleSGTts r0, Charset r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mCharset;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mTts;
    L9:
        return r0.copy(r1, r2);
    }

    private final boolean isUtf8(byte[] r7) {
        int r1 = 0;
    L4:
        if (r1 >= r7.length) goto L48;
        int r2 = r7[r1] & 255;
        if (r2 <= 127) goto L7;
        if (194 > r2) goto L19;
        if (r2 >= 224) goto L19;
        int r3 = r1 + 1;
        if (r3 >= r7.length) goto L13;
        if ((r7[r3] & 192) != 128) goto L16;
        r1 = r1 + 2;
        goto L4
    L16:
        return false;
    L13:
        return false;
    L19:
        if (224 > r2) goto L31;
        if (r2 >= 240) goto L31;
        int r4 = r1 + 2;
        if (r4 >= r7.length) goto L23;
        if ((r7[r1 + 1] & 192) != 128) goto L26;
        if ((r7[r4] & 192) != 128) goto L29;
        r1 = r1 + 3;
        goto L4
    L29:
        return false;
    L26:
        return false;
    L23:
        return false;
    L31:
        if (240 > r2) goto L47;
        if (r2 >= 245) goto L47;
        int r5 = r1 + 3;
        if (r5 >= r7.length) goto L36;
        if ((r7[r1 + 1] & 192) != 128) goto L39;
        if ((r7[r1 + 2] & 192) != 128) goto L42;
        if ((r7[r5] & 192) != 128) goto L45;
        r1 = r1 + 4;
        goto L4
    L45:
        return false;
    L42:
        return false;
    L39:
        return false;
    L36:
        return false;
    L47:
        return false;
    L7:
        r1 = r1 + 1;
        goto L4
    L48:
        return true;
    }

    @aa1
    public final Charset component1() {
        return this.mCharset;
    }

    @aa1
    public final String component2() {
        return this.mTts;
    }

    @aa1
    public final BleSGTts copy(@aa1 Charset r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mCharset");
        Intrinsics.X0O(r3, "mTts");
        return new BleSGTts(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() == null) goto L9;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (isUtf8(r0) == true) goto L7;
        Charset r1 = Charset.forName("GBK");
    L8:
        Intrinsics.XXI(r1);
        this.mCharset = r1;
        byte[] r2 = getMBytes();
        Intrinsics.XXI(r2);
        String r3 = new String(r2, this.mCharset);
    L10:
        this.mTts = r3;
        return;
    L7:
        r1 = StandardCharsets.UTF_8;
        goto L8
    L9:
        r3 = "";
        goto L10
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSGTts) == true) goto L8;
        return false;
    L8:
        BleSGTts r6 = (BleSGTts) r5;
        if (Intrinsics.XOO0ii0(this.mCharset, r6.mCharset) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mTts, r6.mTts) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final Charset getMCharset() {
        return this.mCharset;
    }

    @aa1
    public final String getMTts() {
        return this.mTts;
    }

    public int hashCode() {
        return (this.mCharset.hashCode() * 31) + this.mTts.hashCode();
    }

    public final void setMCharset(@aa1 Charset r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCharset = r2;
    }

    public final void setMTts(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTts = r2;
    }

    @aa1
    public String toString() {
        return "BleSGTTS(mCharset=" + this.mCharset + ", mContent='" + this.mTts + "')";
    }

    public BleSGTts(@aa1 Charset r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mCharset");
        Intrinsics.X0O(r3, "mTts");
        this.mCharset = r2;
        this.mTts = r3;
    }

    public /* synthetic */ BleSGTts(Charset r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(r1, "UTF_8");
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
