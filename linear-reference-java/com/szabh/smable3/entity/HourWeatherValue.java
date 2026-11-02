package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class HourWeatherValue extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int TIDE_ITEM_LENGTH = 1;
    private final int value;

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

    public HourWeatherValue() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ HourWeatherValue copy$default(HourWeatherValue r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.value;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.value;
    }

    @aa1
    public final HourWeatherValue copy(int r2) {
        return new HourWeatherValue(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.value);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof HourWeatherValue) == true) goto L9;
        return false;
    L9:
        if (this.value == ((HourWeatherValue) r4).value) goto L11;
        return false;
    L11:
        return true;
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

    public HourWeatherValue(int r1) {
        this.value = r1;
    }

    public /* synthetic */ HourWeatherValue(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
