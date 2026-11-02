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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    private int azimuth;
    private int elevation;
    private int satelliteNo;
    private int snr;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleLocationGsv() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleLocationGsv copy$default(BleLocationGsv bleLocationGsv, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleLocationGsv.satelliteNo;
        }
        if ((i5 & 2) != 0) {
            i2 = bleLocationGsv.elevation;
        }
        if ((i5 & 4) != 0) {
            i3 = bleLocationGsv.azimuth;
        }
        if ((i5 & 8) != 0) {
            i4 = bleLocationGsv.snr;
        }
        return bleLocationGsv.copy(i, i2, i3, i4);
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
    public final BleLocationGsv copy(int i, int i2, int i3, int i4) {
        return new BleLocationGsv(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.satelliteNo = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.elevation = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.azimuth = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.snr = readInt32(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLocationGsv)) {
            return false;
        }
        BleLocationGsv bleLocationGsv = (BleLocationGsv) obj;
        return this.satelliteNo == bleLocationGsv.satelliteNo && this.elevation == bleLocationGsv.elevation && this.azimuth == bleLocationGsv.azimuth && this.snr == bleLocationGsv.snr;
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

    public final void setAzimuth(int i) {
        this.azimuth = i;
    }

    public final void setElevation(int i) {
        this.elevation = i;
    }

    public final void setSatelliteNo(int i) {
        this.satelliteNo = i;
    }

    public final void setSnr(int i) {
        this.snr = i;
    }

    @aa1
    public String toString() {
        return "BleLocationGsv(satelliteNo=" + this.satelliteNo + ", elevation=" + this.elevation + ", azimuth=" + this.azimuth + ", snr=" + this.snr + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationGsv(int i, int i2, int i3, int i4) {
        this.satelliteNo = i;
        this.elevation = i2;
        this.azimuth = i3;
        this.snr = i4;
    }

    public /* synthetic */ BleLocationGsv(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
