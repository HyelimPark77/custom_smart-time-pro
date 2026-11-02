package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWarningSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 24;
    private int mBOLowSwitch;
    private int mBOLowValue;
    private int mStressHighSwitch;
    private int mStressHighValue;
    private int mTemperatureHighSwitch;
    private int mTemperatureHighValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWarningSettings() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BleWarningSettings copy$default(BleWarningSettings bleWarningSettings, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleWarningSettings.mBOLowSwitch;
        }
        if ((i7 & 2) != 0) {
            i2 = bleWarningSettings.mBOLowValue;
        }
        if ((i7 & 4) != 0) {
            i3 = bleWarningSettings.mStressHighSwitch;
        }
        if ((i7 & 8) != 0) {
            i4 = bleWarningSettings.mStressHighValue;
        }
        if ((i7 & 16) != 0) {
            i5 = bleWarningSettings.mTemperatureHighSwitch;
        }
        if ((i7 & 32) != 0) {
            i6 = bleWarningSettings.mTemperatureHighValue;
        }
        int i8 = i5;
        int i9 = i6;
        return bleWarningSettings.copy(i, i2, i3, i4, i8, i9);
    }

    public final int component1() {
        return this.mBOLowSwitch;
    }

    public final int component2() {
        return this.mBOLowValue;
    }

    public final int component3() {
        return this.mStressHighSwitch;
    }

    public final int component4() {
        return this.mStressHighValue;
    }

    public final int component5() {
        return this.mTemperatureHighSwitch;
    }

    public final int component6() {
        return this.mTemperatureHighValue;
    }

    @aa1
    public final BleWarningSettings copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new BleWarningSettings(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mBOLowSwitch = readInt8();
        this.mBOLowValue = readInt8();
        this.mStressHighSwitch = readUInt8();
        this.mStressHighValue = readUInt8();
        this.mTemperatureHighSwitch = readUInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTemperatureHighValue = readUInt16(LITTLE_ENDIAN);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mBOLowSwitch);
        writeInt8(this.mBOLowValue);
        writeInt8(this.mStressHighSwitch);
        writeInt8(this.mStressHighValue);
        writeInt8(this.mTemperatureHighSwitch);
        int i = this.mTemperatureHighValue;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWarningSettings)) {
            return false;
        }
        BleWarningSettings bleWarningSettings = (BleWarningSettings) obj;
        return this.mBOLowSwitch == bleWarningSettings.mBOLowSwitch && this.mBOLowValue == bleWarningSettings.mBOLowValue && this.mStressHighSwitch == bleWarningSettings.mStressHighSwitch && this.mStressHighValue == bleWarningSettings.mStressHighValue && this.mTemperatureHighSwitch == bleWarningSettings.mTemperatureHighSwitch && this.mTemperatureHighValue == bleWarningSettings.mTemperatureHighValue;
    }

    public final int getMBOLowSwitch() {
        return this.mBOLowSwitch;
    }

    public final int getMBOLowValue() {
        return this.mBOLowValue;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 24;
    }

    public final int getMStressHighSwitch() {
        return this.mStressHighSwitch;
    }

    public final int getMStressHighValue() {
        return this.mStressHighValue;
    }

    public final int getMTemperatureHighSwitch() {
        return this.mTemperatureHighSwitch;
    }

    public final int getMTemperatureHighValue() {
        return this.mTemperatureHighValue;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mBOLowSwitch) * 31) + Integer.hashCode(this.mBOLowValue)) * 31) + Integer.hashCode(this.mStressHighSwitch)) * 31) + Integer.hashCode(this.mStressHighValue)) * 31) + Integer.hashCode(this.mTemperatureHighSwitch)) * 31) + Integer.hashCode(this.mTemperatureHighValue);
    }

    public final void setMBOLowSwitch(int i) {
        this.mBOLowSwitch = i;
    }

    public final void setMBOLowValue(int i) {
        this.mBOLowValue = i;
    }

    public final void setMStressHighSwitch(int i) {
        this.mStressHighSwitch = i;
    }

    public final void setMStressHighValue(int i) {
        this.mStressHighValue = i;
    }

    public final void setMTemperatureHighSwitch(int i) {
        this.mTemperatureHighSwitch = i;
    }

    public final void setMTemperatureHighValue(int i) {
        this.mTemperatureHighValue = i;
    }

    @aa1
    public String toString() {
        return "BleWarningSettings(mBOLowSwitch=" + this.mBOLowSwitch + ", mBOLowValue=" + this.mBOLowValue + ", mStressHighSwitch=" + this.mStressHighSwitch + ", mStressHighValue=" + this.mStressHighValue + ", mTemperatureHighSwitch=" + this.mTemperatureHighSwitch + ", mTemperatureHighValue=" + this.mTemperatureHighValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWarningSettings(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mBOLowSwitch = i;
        this.mBOLowValue = i2;
        this.mStressHighSwitch = i3;
        this.mStressHighValue = i4;
        this.mTemperatureHighSwitch = i5;
        this.mTemperatureHighValue = i6;
    }

    public /* synthetic */ BleWarningSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
