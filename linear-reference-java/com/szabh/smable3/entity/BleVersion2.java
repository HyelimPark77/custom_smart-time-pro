package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVersion2 extends BleReadable {

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
    public BleVersion2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleVersion2 copy$default(BleVersion2 r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mVersion;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mVersion;
    }

    @aa1
    public final BleVersion2 copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mVersion");
        return new BleVersion2(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        int r0 = readInt8() & 255;
        int r1 = readInt8() & 255;
        byte r3 = readIntN(4);
        byte r2 = readIntN(4);
        StringBuilder r4 = new StringBuilder();
        r4.append(r0);
        r4.append('.');
        r4.append(r1);
        r4.append('.');
        r4.append(r2);
        if (r3 <= 0) goto L5;
        StringBuilder r5 = new StringBuilder();
        r5.append('.');
        r5.append((char) (r3 + 64));
        String r6 = r5.toString();
    L6:
        r4.append(r6);
        this.mVersion = r4.toString();
        return;
    L5:
        r6 = "";
        goto L6
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleVersion2) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mVersion, ((BleVersion2) r4).mVersion) == true) goto L11;
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
        return "BleVersion2(mVersion=" + this.mVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVersion2(@aa1 String r2) {
        Intrinsics.X0O(r2, "mVersion");
        this.mVersion = r2;
    }

    public /* synthetic */ BleVersion2(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
