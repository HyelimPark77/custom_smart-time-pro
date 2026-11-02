package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVibrationLightSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 12;
    private int mLight;
    private int mLightDuration;
    private int mLightFreq;
    private int mLightType;
    private int mVibration;
    private int mVibrationDurationAndCount;
    private int mVibrationLongAndShort;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleVibrationLightSettings() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleVibrationLightSettings copy$default(BleVibrationLightSettings bleVibrationLightSettings, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleVibrationLightSettings.mVibration;
        }
        if ((i8 & 2) != 0) {
            i2 = bleVibrationLightSettings.mVibrationLongAndShort;
        }
        if ((i8 & 4) != 0) {
            i3 = bleVibrationLightSettings.mVibrationDurationAndCount;
        }
        if ((i8 & 8) != 0) {
            i4 = bleVibrationLightSettings.mLight;
        }
        if ((i8 & 16) != 0) {
            i5 = bleVibrationLightSettings.mLightType;
        }
        if ((i8 & 32) != 0) {
            i6 = bleVibrationLightSettings.mLightFreq;
        }
        if ((i8 & 64) != 0) {
            i7 = bleVibrationLightSettings.mLightDuration;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleVibrationLightSettings.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mVibration;
    }

    public final int component2() {
        return this.mVibrationLongAndShort;
    }

    public final int component3() {
        return this.mVibrationDurationAndCount;
    }

    public final int component4() {
        return this.mLight;
    }

    public final int component5() {
        return this.mLightType;
    }

    public final int component6() {
        return this.mLightFreq;
    }

    public final int component7() {
        return this.mLightDuration;
    }

    @aa1
    public final BleVibrationLightSettings copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleVibrationLightSettings(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mVibration);
        writeInt8(this.mVibrationLongAndShort);
        int i = this.mVibrationDurationAndCount;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        writeInt8(this.mLight);
        writeInt8(this.mLightType);
        writeInt8(this.mLightFreq);
        int i2 = this.mLightDuration;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[3], null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleVibrationLightSettings)) {
            return false;
        }
        BleVibrationLightSettings bleVibrationLightSettings = (BleVibrationLightSettings) obj;
        return this.mVibration == bleVibrationLightSettings.mVibration && this.mVibrationLongAndShort == bleVibrationLightSettings.mVibrationLongAndShort && this.mVibrationDurationAndCount == bleVibrationLightSettings.mVibrationDurationAndCount && this.mLight == bleVibrationLightSettings.mLight && this.mLightType == bleVibrationLightSettings.mLightType && this.mLightFreq == bleVibrationLightSettings.mLightFreq && this.mLightDuration == bleVibrationLightSettings.mLightDuration;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMLight() {
        return this.mLight;
    }

    public final int getMLightDuration() {
        return this.mLightDuration;
    }

    public final int getMLightFreq() {
        return this.mLightFreq;
    }

    public final int getMLightType() {
        return this.mLightType;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public final int getMVibrationDurationAndCount() {
        return this.mVibrationDurationAndCount;
    }

    public final int getMVibrationLongAndShort() {
        return this.mVibrationLongAndShort;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mVibration) * 31) + Integer.hashCode(this.mVibrationLongAndShort)) * 31) + Integer.hashCode(this.mVibrationDurationAndCount)) * 31) + Integer.hashCode(this.mLight)) * 31) + Integer.hashCode(this.mLightType)) * 31) + Integer.hashCode(this.mLightFreq)) * 31) + Integer.hashCode(this.mLightDuration);
    }

    public final void setMLight(int i) {
        this.mLight = i;
    }

    public final void setMLightDuration(int i) {
        this.mLightDuration = i;
    }

    public final void setMLightFreq(int i) {
        this.mLightFreq = i;
    }

    public final void setMLightType(int i) {
        this.mLightType = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    public final void setMVibrationDurationAndCount(int i) {
        this.mVibrationDurationAndCount = i;
    }

    public final void setMVibrationLongAndShort(int i) {
        this.mVibrationLongAndShort = i;
    }

    @aa1
    public String toString() {
        return "BleVibrationLightSettings(mVibration=" + this.mVibration + ", mVibrationLongAndShort=" + this.mVibrationLongAndShort + ", mVibrationDurationAndCount=" + this.mVibrationDurationAndCount + ", mLight=" + this.mLight + ", mLightType=" + this.mLightType + ", mLightFreq=" + this.mLightFreq + ", mLightDuration=" + this.mLightDuration + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVibrationLightSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mVibration = i;
        this.mVibrationLongAndShort = i2;
        this.mVibrationDurationAndCount = i3;
        this.mLight = i4;
        this.mLightType = i5;
        this.mLightFreq = i6;
        this.mLightDuration = i7;
    }

    public /* synthetic */ BleVibrationLightSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
