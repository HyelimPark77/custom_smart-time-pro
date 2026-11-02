package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMedicationAlarm extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 7;
    private int mDay;
    private int mEnabled;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mRepeat;
    private int mYear;

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

    public BleMedicationAlarm() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleMedicationAlarm copy$default(BleMedicationAlarm r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mRepeat;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mYear;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mMonth;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mDay;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mHour;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mMinute;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
    public final BleMedicationAlarm copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleMedicationAlarm(r9, r10, r11, r12, r13, r14, r15);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMedicationAlarm) == true) goto L8;
        return false;
    L8:
        BleMedicationAlarm r6 = (BleMedicationAlarm) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mRepeat == r6.mRepeat) goto L15;
        return false;
    L15:
        if (this.mYear == r6.mYear) goto L18;
        return false;
    L18:
        if (this.mMonth == r6.mMonth) goto L21;
        return false;
    L21:
        if (this.mDay == r6.mDay) goto L24;
        return false;
    L24:
        if (this.mHour == r6.mHour) goto L27;
        return false;
    L27:
        if (this.mMinute == r6.mMinute) goto L29;
        return false;
    L29:
        return true;
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

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMRepeat(int r1) {
        this.mRepeat = r1;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleMedicationAlarm(mId=" + getMId() + ", mEnabled=" + this.mEnabled + ", mRepeat=" + this.mRepeat + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMedicationAlarm(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mEnabled = r1;
        this.mRepeat = r2;
        this.mYear = r3;
        this.mMonth = r4;
        this.mDay = r5;
        this.mHour = r6;
        this.mMinute = r7;
    }

    public /* synthetic */ BleMedicationAlarm(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 1;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L23;
        int r11 = 0;
    L24:
        this(r2, r3, r4, r5, r6, r7, r11);
        return;
    L23:
        r11 = r8;
        goto L24
    }
}
