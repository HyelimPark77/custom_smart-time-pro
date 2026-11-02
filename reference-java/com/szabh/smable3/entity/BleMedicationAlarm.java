package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMedicationAlarm extends BleIdObject {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 7;
    private int mDay;
    private int mEnabled;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mRepeat;
    private int mYear;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMedicationAlarm() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleMedicationAlarm copy$default(BleMedicationAlarm bleMedicationAlarm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleMedicationAlarm.mEnabled;
        }
        if ((i8 & 2) != 0) {
            i2 = bleMedicationAlarm.mRepeat;
        }
        if ((i8 & 4) != 0) {
            i3 = bleMedicationAlarm.mYear;
        }
        if ((i8 & 8) != 0) {
            i4 = bleMedicationAlarm.mMonth;
        }
        if ((i8 & 16) != 0) {
            i5 = bleMedicationAlarm.mDay;
        }
        if ((i8 & 32) != 0) {
            i6 = bleMedicationAlarm.mHour;
        }
        if ((i8 & 64) != 0) {
            i7 = bleMedicationAlarm.mMinute;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleMedicationAlarm.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mRepeat;
    }

    public final int component3() {
        return this.mYear;
    }

    public final int component4() {
        return this.mMonth;
    }

    public final int component5() {
        return this.mDay;
    }

    public final int component6() {
        return this.mHour;
    }

    public final int component7() {
        return this.mMinute;
    }

    @aa1
    public final BleMedicationAlarm copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleMedicationAlarm(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        this.mEnabled = readIntN(1);
        this.mRepeat = readIntN(7);
        this.mYear = readUInt8() + 2000;
        this.mMonth = readUInt8();
        this.mDay = readUInt8();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        writeIntN(this.mEnabled, 1);
        writeIntN(this.mRepeat, 7);
        writeInt8(this.mYear - 2000);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMedicationAlarm)) {
            return false;
        }
        BleMedicationAlarm bleMedicationAlarm = (BleMedicationAlarm) obj;
        return this.mEnabled == bleMedicationAlarm.mEnabled && this.mRepeat == bleMedicationAlarm.mRepeat && this.mYear == bleMedicationAlarm.mYear && this.mMonth == bleMedicationAlarm.mMonth && this.mDay == bleMedicationAlarm.mDay && this.mHour == bleMedicationAlarm.mHour && this.mMinute == bleMedicationAlarm.mMinute;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMHour() {
        return this.mHour;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mRepeat)) * 31) + Integer.hashCode(this.mYear)) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute);
    }

    public final void setMDay(int i) {
        this.mDay = i;
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMHour(int i) {
        this.mHour = i;
    }

    public final void setMMinute(int i) {
        this.mMinute = i;
    }

    public final void setMMonth(int i) {
        this.mMonth = i;
    }

    public final void setMRepeat(int i) {
        this.mRepeat = i;
    }

    public final void setMYear(int i) {
        this.mYear = i;
    }

    @aa1
    public String toString() {
        return "BleMedicationAlarm(mId=" + getMId() + ", mEnabled=" + this.mEnabled + ", mRepeat=" + this.mRepeat + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMedicationAlarm(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mEnabled = i;
        this.mRepeat = i2;
        this.mYear = i3;
        this.mMonth = i4;
        this.mDay = i5;
        this.mHour = i6;
        this.mMinute = i7;
    }

    public /* synthetic */ BleMedicationAlarm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 1 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
