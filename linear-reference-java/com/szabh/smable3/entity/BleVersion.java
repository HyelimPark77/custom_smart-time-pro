package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.IOXO1I0O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.tenmeter.smlibrary.utils.FileUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVersion extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 3;

    @aa1
    private String mVersion;

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
    public BleVersion() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return decode$lambda$0(r0);
    }

    public static /* synthetic */ BleVersion copy$default(BleVersion r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mVersion;
    L6:
        return r0.copy(r1);
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

    @aa1
    public final BleVersion copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mVersion");
        return new BleVersion(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte[] r0 = getMBytes();
        if (r0 == null) goto L6;
        String r1 = ArraysKt___ArraysKt.i0I(r0, FileUtils.FILE_EXTENSION_SEPARATOR, null, null, 0, null, new IOXO1I0O(), 30, null);
        if (r1 == null) goto L6;
    L7:
        this.mVersion = r1;
        return;
    L6:
        r1 = "";
        goto L7
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleVersion) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mVersion, ((BleVersion) r4).mVersion) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return this.mVersion.hashCode();
    }

    public final void setMVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVersion = r2;
    }

    @aa1
    public String toString() {
        return "BleVersion(mVersion=" + this.mVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "mVersion");
        this.mVersion = r2;
    }

    public /* synthetic */ BleVersion(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
