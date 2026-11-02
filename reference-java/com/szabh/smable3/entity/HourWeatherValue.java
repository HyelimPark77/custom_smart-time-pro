package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class HourWeatherValue extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TIDE_ITEM_LENGTH = 1;
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HourWeatherValue() {
        this(0, 1, null);
    }

    public static /* synthetic */ HourWeatherValue copy$default(HourWeatherValue hourWeatherValue, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hourWeatherValue.value;
        }
        return hourWeatherValue.copy(i);
    }

    public final int component1() {
        return this.value;
    }

    @aa1
    public final HourWeatherValue copy(int i) {
        return new HourWeatherValue(i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.value);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HourWeatherValue) && this.value == ((HourWeatherValue) obj).value;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 1;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @aa1
    public String toString() {
        return "HourWeatherValue(value=" + this.value + HexStringBuilder.COMMENT_END_CHAR;
    }

    public HourWeatherValue(int i) {
        this.value = i;
    }

    public /* synthetic */ HourWeatherValue(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
