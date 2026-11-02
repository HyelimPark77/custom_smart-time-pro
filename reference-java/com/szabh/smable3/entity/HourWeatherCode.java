package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HourWeatherCode extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TIDE_ITEM_LENGTH = 2;
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HourWeatherCode() {
        this(0, 1, null);
    }

    public static /* synthetic */ HourWeatherCode copy$default(HourWeatherCode hourWeatherCode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hourWeatherCode.value;
        }
        return hourWeatherCode.copy(i);
    }

    public final int component1() {
        return this.value;
    }

    @aa1
    public final HourWeatherCode copy(int i) {
        return new HourWeatherCode(i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.value;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HourWeatherCode) && this.value == ((HourWeatherCode) obj).value;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 2;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @aa1
    public String toString() {
        return "HourWeatherCode(value=" + this.value + HexStringBuilder.COMMENT_END_CHAR;
    }

    public HourWeatherCode(int i) {
        this.value = i;
    }

    public /* synthetic */ HourWeatherCode(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
