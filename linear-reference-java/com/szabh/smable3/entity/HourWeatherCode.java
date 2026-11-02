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
    public static final Companion Companion = null;
    public static final int TIDE_ITEM_LENGTH = 2;
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

    public HourWeatherCode() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ HourWeatherCode copy$default(HourWeatherCode r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.value;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.value;
    }

    @aa1
    public final HourWeatherCode copy(int r2) {
        return new HourWeatherCode(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.value;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof HourWeatherCode) == true) goto L9;
        return false;
    L9:
        if (this.value == ((HourWeatherCode) r4).value) goto L11;
        return false;
    L11:
        return true;
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

    public HourWeatherCode(int r1) {
        this.value = r1;
    }

    public /* synthetic */ HourWeatherCode(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
