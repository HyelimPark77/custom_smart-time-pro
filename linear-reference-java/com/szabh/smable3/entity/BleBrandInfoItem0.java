package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
final class BleBrandInfoItem0 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 128;
    private static final int NAME_LENGTH = 126;

    @aa1
    private String mBleName;

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
    public BleBrandInfoItem0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleBrandInfoItem0 copy$default(BleBrandInfoItem0 r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mBleName;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mBleName;
    }

    @aa1
    public final BleBrandInfoItem0 copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mBleName");
        return new BleBrandInfoItem0(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(Integer.min(this.mBleName.length(), 126) + 1);
        writeStringWithFix(this.mBleName, 126, Charsets.IiI10X);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleBrandInfoItem0) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mBleName, ((BleBrandInfoItem0) r4).mBleName) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 128;
    }

    public int hashCode() {
        return this.mBleName.hashCode();
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoItem0(mBleName=" + this.mBleName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoItem0(@aa1 String r2) {
        Intrinsics.X0O(r2, "mBleName");
        this.mBleName = r2;
    }

    public /* synthetic */ BleBrandInfoItem0(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
