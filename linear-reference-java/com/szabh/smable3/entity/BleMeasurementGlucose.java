package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMeasurementGlucose extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    private int mValue;

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

    public BleMeasurementGlucose() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleMeasurementGlucose copy$default(BleMeasurementGlucose r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mValue;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mValue;
    }

    @aa1
    public final BleMeasurementGlucose copy(int r2) {
        return new BleMeasurementGlucose(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mValue = BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleMeasurementGlucose) == true) goto L9;
        return false;
    L9:
        if (this.mValue == ((BleMeasurementGlucose) r4).mValue) goto L11;
        return false;
    L11:
        return true;
    }

    public final int getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.mValue);
    }

    public final void setMValue(int r1) {
        this.mValue = r1;
    }

    @aa1
    public String toString() {
        return "BleMeasurementGlucose(mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurementGlucose(int r1) {
        this.mValue = r1;
    }

    public /* synthetic */ BleMeasurementGlucose(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
