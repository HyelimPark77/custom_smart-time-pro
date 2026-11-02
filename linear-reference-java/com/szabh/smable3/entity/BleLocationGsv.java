package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLocationGsv extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int azimuth;
    private int elevation;
    private int satelliteNo;
    private int snr;

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

    public BleLocationGsv() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleLocationGsv copy$default(BleLocationGsv r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.satelliteNo;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.elevation;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.azimuth;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.snr;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.satelliteNo;
    }

    public final int component2() {
        return this.elevation;
    }

    public final int component3() {
        return this.azimuth;
    }

    public final int component4() {
        return this.snr;
    }

    @aa1
    public final BleLocationGsv copy(int r2, int r3, int r4, int r5) {
        return new BleLocationGsv(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.satelliteNo = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.elevation = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.azimuth = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.snr = readInt32(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLocationGsv) == true) goto L8;
        return false;
    L8:
        BleLocationGsv r6 = (BleLocationGsv) r5;
        if (this.satelliteNo == r6.satelliteNo) goto L12;
        return false;
    L12:
        if (this.elevation == r6.elevation) goto L15;
        return false;
    L15:
        if (this.azimuth == r6.azimuth) goto L18;
        return false;
    L18:
        if (this.snr == r6.snr) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getAzimuth() {
        return this.azimuth;
    }

    public final int getElevation() {
        return this.elevation;
    }

    public final int getSatelliteNo() {
        return this.satelliteNo;
    }

    public final int getSnr() {
        return this.snr;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.satelliteNo) * 31) + Integer.hashCode(this.elevation)) * 31) + Integer.hashCode(this.azimuth)) * 31) + Integer.hashCode(this.snr);
    }

    public final void setAzimuth(int r1) {
        this.azimuth = r1;
    }

    public final void setElevation(int r1) {
        this.elevation = r1;
    }

    public final void setSatelliteNo(int r1) {
        this.satelliteNo = r1;
    }

    public final void setSnr(int r1) {
        this.snr = r1;
    }

    @aa1
    public String toString() {
        return "BleLocationGsv(satelliteNo=" + this.satelliteNo + ", elevation=" + this.elevation + ", azimuth=" + this.azimuth + ", snr=" + this.snr + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationGsv(int r1, int r2, int r3, int r4) {
        this.satelliteNo = r1;
        this.elevation = r2;
        this.azimuth = r3;
        this.snr = r4;
    }

    public /* synthetic */ BleLocationGsv(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
