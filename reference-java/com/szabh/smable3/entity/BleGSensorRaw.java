package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGSensorRaw extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;

    /* JADX INFO: renamed from: mX */
    private short f55326mX;

    /* JADX INFO: renamed from: mY */
    private short f55327mY;

    /* JADX INFO: renamed from: mZ */
    private short f55328mZ;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGSensorRaw() {
        this((short) 0, (short) 0, (short) 0, 7, null);
    }

    public static /* synthetic */ BleGSensorRaw copy$default(BleGSensorRaw bleGSensorRaw, short s, short s2, short s3, int i, Object obj) {
        if ((i & 1) != 0) {
            s = bleGSensorRaw.f55326mX;
        }
        if ((i & 2) != 0) {
            s2 = bleGSensorRaw.f55327mY;
        }
        if ((i & 4) != 0) {
            s3 = bleGSensorRaw.f55328mZ;
        }
        return bleGSensorRaw.copy(s, s2, s3);
    }

    public final short component1() {
        return this.f55326mX;
    }

    public final short component2() {
        return this.f55327mY;
    }

    public final short component3() {
        return this.f55328mZ;
    }

    @aa1
    public final BleGSensorRaw copy(short s, short s2, short s3) {
        return new BleGSensorRaw(s, s2, s3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55326mX = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55327mY = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.f55328mZ = readInt16(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGSensorRaw)) {
            return false;
        }
        BleGSensorRaw bleGSensorRaw = (BleGSensorRaw) obj;
        return this.f55326mX == bleGSensorRaw.f55326mX && this.f55327mY == bleGSensorRaw.f55327mY && this.f55328mZ == bleGSensorRaw.f55328mZ;
    }

    public final short getMX() {
        return this.f55326mX;
    }

    public final short getMY() {
        return this.f55327mY;
    }

    public final short getMZ() {
        return this.f55328mZ;
    }

    public int hashCode() {
        return (((Short.hashCode(this.f55326mX) * 31) + Short.hashCode(this.f55327mY)) * 31) + Short.hashCode(this.f55328mZ);
    }

    public final void setMX(short s) {
        this.f55326mX = s;
    }

    public final void setMY(short s) {
        this.f55327mY = s;
    }

    public final void setMZ(short s) {
        this.f55328mZ = s;
    }

    @aa1
    public String toString() {
        return "BleGSensorRaw(mX=" + ((int) this.f55326mX) + ", mY=" + ((int) this.f55327mY) + ", mZ=" + ((int) this.f55328mZ) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorRaw(short s, short s2, short s3) {
        this.f55326mX = s;
        this.f55327mY = s2;
        this.f55328mZ = s3;
    }

    public /* synthetic */ BleGSensorRaw(short s, short s2, short s3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (short) 0 : s, (i & 2) != 0 ? (short) 0 : s2, (i & 4) != 0 ? (short) 0 : s3);
    }
}
