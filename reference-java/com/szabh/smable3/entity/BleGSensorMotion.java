package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGSensorMotion extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private short mMotion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGSensorMotion() {
        this((short) 0, 1, null);
    }

    public static /* synthetic */ BleGSensorMotion copy$default(BleGSensorMotion bleGSensorMotion, short s, int i, Object obj) {
        if ((i & 1) != 0) {
            s = bleGSensorMotion.mMotion;
        }
        return bleGSensorMotion.copy(s);
    }

    public final short component1() {
        return this.mMotion;
    }

    @aa1
    public final BleGSensorMotion copy(short s) {
        return new BleGSensorMotion(s);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMotion = readInt16(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleGSensorMotion) && this.mMotion == ((BleGSensorMotion) obj).mMotion;
    }

    public final short getMMotion() {
        return this.mMotion;
    }

    public int hashCode() {
        return Short.hashCode(this.mMotion);
    }

    public final void setMMotion(short s) {
        this.mMotion = s;
    }

    @aa1
    public String toString() {
        return "BleGSensorMotion(mMotion=" + ((int) this.mMotion) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGSensorMotion(short s) {
        this.mMotion = s;
    }

    public /* synthetic */ BleGSensorMotion(short s, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (short) 0 : s);
    }
}
