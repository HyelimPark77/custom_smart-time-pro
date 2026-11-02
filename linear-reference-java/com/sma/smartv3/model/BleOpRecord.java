package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleOpRecord extends JsonFieldContainer {

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String TYPE_AIR_PRESSURE = "1";

    @aa1
    private String bleName;

    @aa1
    private String mac;

    @aa1
    private String markType;

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

    public BleOpRecord() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleOpRecord copy$default(BleOpRecord r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.bleName;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mac;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.markType;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final String component2() {
        return this.mac;
    }

    @aa1
    public final String component3() {
        return this.markType;
    }

    @aa1
    public final BleOpRecord copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "bleName");
        Intrinsics.X0O(r3, "mac");
        Intrinsics.X0O(r4, "markType");
        return new BleOpRecord(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleOpRecord) == true) goto L8;
        return false;
    L8:
        BleOpRecord r6 = (BleOpRecord) r5;
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.markType, r6.markType) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getMac() {
        return this.mac;
    }

    @aa1
    public final String getMarkType() {
        return this.markType;
    }

    public int hashCode() {
        return (((this.bleName.hashCode() * 31) + this.mac.hashCode()) * 31) + this.markType.hashCode();
    }

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mac = r2;
    }

    public final void setMarkType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.markType = r2;
    }

    @aa1
    public String toString() {
        return "BleOpRecord(bleName=" + this.bleName + ", mac=" + this.mac + ", markType=" + this.markType + I000IiI1O.iO.iO;
    }

    public BleOpRecord(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "bleName");
        Intrinsics.X0O(r3, "mac");
        Intrinsics.X0O(r4, "markType");
        this.bleName = r2;
        this.mac = r3;
        this.markType = r4;
    }

    public /* synthetic */ BleOpRecord(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
