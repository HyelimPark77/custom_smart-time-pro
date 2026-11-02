package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleXMLYBandSet extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 68;

    @aa1
    private String mEncrypt;

    @aa1
    private String mRandom;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleXMLYBandSet() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleXMLYBandSet copy$default(BleXMLYBandSet r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mRandom;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mEncrypt;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.mRandom;
    }

    @aa1
    public final String component2() {
        return this.mEncrypt;
    }

    @aa1
    public final BleXMLYBandSet copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mRandom");
        Intrinsics.X0O(r3, "mEncrypt");
        return new BleXMLYBandSet(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        Charset r0 = Charsets.IiI10X;
        this.mRandom = readString(34, r0);
        this.mEncrypt = readString(34, r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        String r0 = this.mRandom;
        Charset r1 = Charsets.IiI10X;
        writeStringWithFix(r0, 34, r1);
        writeStringWithFix(this.mEncrypt, 34, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleXMLYBandSet) == true) goto L8;
        return false;
    L8:
        BleXMLYBandSet r6 = (BleXMLYBandSet) r5;
        if (Intrinsics.XOO0ii0(this.mRandom, r6.mRandom) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mEncrypt, r6.mEncrypt) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getMEncrypt() {
        return this.mEncrypt;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 68;
    }

    @aa1
    public final String getMRandom() {
        return this.mRandom;
    }

    public int hashCode() {
        return (this.mRandom.hashCode() * 31) + this.mEncrypt.hashCode();
    }

    public final void setMEncrypt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mEncrypt = r2;
    }

    public final void setMRandom(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRandom = r2;
    }

    @aa1
    public String toString() {
        return "BleXMLYBandSet(mRandom=" + this.mRandom + ", mEncrypt=" + this.mEncrypt + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleXMLYBandSet(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mRandom");
        Intrinsics.X0O(r3, "mEncrypt");
        this.mRandom = r2;
        this.mEncrypt = r3;
    }

    public /* synthetic */ BleXMLYBandSet(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
