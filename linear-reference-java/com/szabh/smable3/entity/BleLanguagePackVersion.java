package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.OIOi1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.tenmeter.smlibrary.utils.FileUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLanguagePackVersion extends BleReadable {
    private int mLanguageCode;

    @aa1
    private String mVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public BleLanguagePackVersion() {
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return decode$lambda$0(r0);
    }

    public static /* synthetic */ BleLanguagePackVersion copy$default(BleLanguagePackVersion r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mVersion;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mLanguageCode;
    L9:
        return r0.copy(r1, r2);
    }

    private static final CharSequence decode$lambda$0(byte r1) {
        int r2 = r1 & 255;
        if (r2 <= 9) goto L7;
        return "0";
    L7:
        return String.valueOf(r2);
    }

    @aa1
    public final String component1() {
        return this.mVersion;
    }

    public final int component2() {
        return this.mLanguageCode;
    }

    @aa1
    public final BleLanguagePackVersion copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mVersion");
        return new BleLanguagePackVersion(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() == null) goto L8;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length != 4) goto L9;
        this.mVersion = ArraysKt___ArraysKt.i0I(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR, null, null, 0, null, new OIOi1X(), 30, null);
        this.mLanguageCode = readUInt8();
        return;
    L9:
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLanguagePackVersion) == true) goto L8;
        return false;
    L8:
        BleLanguagePackVersion r6 = (BleLanguagePackVersion) r5;
        if (Intrinsics.XOO0ii0(this.mVersion, r6.mVersion) == true) goto L12;
        return false;
    L12:
        if (this.mLanguageCode == r6.mLanguageCode) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMLanguageCode() {
        return this.mLanguageCode;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return (this.mVersion.hashCode() * 31) + Integer.hashCode(this.mLanguageCode);
    }

    public final void setMLanguageCode(int r1) {
        this.mLanguageCode = r1;
    }

    public final void setMVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVersion = r2;
    }

    @aa1
    public String toString() {
        return "BleLanguagePackVersion(mVersion=" + this.mVersion + ", mLanguageCode=" + this.mLanguageCode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLanguagePackVersion(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mVersion");
        this.mVersion = r2;
        this.mLanguageCode = r3;
    }

    public /* synthetic */ BleLanguagePackVersion(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "0.0.0";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 1;
    L8:
        this(r1, r2);
    }
}
