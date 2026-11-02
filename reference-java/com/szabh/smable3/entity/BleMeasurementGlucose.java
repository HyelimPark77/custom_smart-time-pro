package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMeasurementGlucose extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2;
    private int mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMeasurementGlucose() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleMeasurementGlucose copy$default(BleMeasurementGlucose bleMeasurementGlucose, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleMeasurementGlucose.mValue;
        }
        return bleMeasurementGlucose.copy(i);
    }

    public final int component1() {
        return this.mValue;
    }

    @aa1
    public final BleMeasurementGlucose copy(int i) {
        return new BleMeasurementGlucose(i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mValue = BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleMeasurementGlucose) && this.mValue == ((BleMeasurementGlucose) obj).mValue;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.mValue);
    }

    public final void setMValue(int i) {
        this.mValue = i;
    }

    @aa1
    public String toString() {
        return "BleMeasurementGlucose(mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurementGlucose(int i) {
        this.mValue = i;
    }

    public /* synthetic */ BleMeasurementGlucose(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
