package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGirlCareSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 10;
    private int mEnabled;
    private int mLatestDay;
    private int mLatestMonth;
    private int mLatestYear;
    private int mMenstruationDuration;
    private int mMenstruationPeriod;
    private int mMenstruationReminderAdvance;
    private int mOvulationReminderAdvance;
    private int mReminderEnable;
    private int mReminderHour;
    private int mReminderMinute;

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

    public BleGirlCareSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ BleGirlCareSettings copy$default(BleGirlCareSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mReminderEnable;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mReminderHour;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mReminderMinute;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mMenstruationReminderAdvance;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mOvulationReminderAdvance;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mLatestYear;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mLatestMonth;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mLatestDay;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mMenstruationDuration;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mMenstruationPeriod;
    L35:
        int r14 = r10;
        int r15 = r11;
        int r16 = r8;
        int r17 = r9;
        int r18 = r6;
        int r19 = r7;
        int r20 = r4;
        int r21 = r5;
        int r22 = r3;
        int r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component10() {
        return this.mMenstruationDuration;
    }

    public final int component11() {
        return this.mMenstruationPeriod;
    }

    public final int component2() {
        return this.mReminderEnable;
    }

    public final int component3() {
        return this.mReminderHour;
    }

    public final int component4() {
        return this.mReminderMinute;
    }

    public final int component5() {
        return this.mMenstruationReminderAdvance;
    }

    public final int component6() {
        return this.mOvulationReminderAdvance;
    }

    public final int component7() {
        return this.mLatestYear;
    }

    public final int component8() {
        return this.mLatestMonth;
    }

    public final int component9() {
        return this.mLatestDay;
    }

    @aa1
    public final BleGirlCareSettings copy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        return new BleGirlCareSettings(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mReminderEnable = readIntN(1);
        readIntN(6);
        this.mEnabled = readIntN(1);
        this.mReminderHour = readInt8();
        this.mReminderMinute = readInt8();
        this.mMenstruationReminderAdvance = readInt8();
        this.mOvulationReminderAdvance = readInt8();
        this.mLatestYear = readInt8() + 2000;
        this.mLatestMonth = readInt8();
        this.mLatestDay = readInt8();
        this.mMenstruationDuration = readInt8();
        this.mMenstruationPeriod = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.mReminderEnable, 1);
        writeIntN(0, 6);
        writeIntN(this.mEnabled, 1);
        writeInt8(this.mReminderHour);
        writeInt8(this.mReminderMinute);
        writeInt8(this.mMenstruationReminderAdvance);
        writeInt8(this.mOvulationReminderAdvance);
        writeInt8(this.mLatestYear - 2000);
        writeInt8(this.mLatestMonth);
        writeInt8(this.mLatestDay);
        writeInt8(this.mMenstruationDuration);
        writeInt8(this.mMenstruationPeriod);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGirlCareSettings) == true) goto L8;
        return false;
    L8:
        BleGirlCareSettings r6 = (BleGirlCareSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mReminderEnable == r6.mReminderEnable) goto L15;
        return false;
    L15:
        if (this.mReminderHour == r6.mReminderHour) goto L18;
        return false;
    L18:
        if (this.mReminderMinute == r6.mReminderMinute) goto L21;
        return false;
    L21:
        if (this.mMenstruationReminderAdvance == r6.mMenstruationReminderAdvance) goto L24;
        return false;
    L24:
        if (this.mOvulationReminderAdvance == r6.mOvulationReminderAdvance) goto L27;
        return false;
    L27:
        if (this.mLatestYear == r6.mLatestYear) goto L30;
        return false;
    L30:
        if (this.mLatestMonth == r6.mLatestMonth) goto L33;
        return false;
    L33:
        if (this.mLatestDay == r6.mLatestDay) goto L36;
        return false;
    L36:
        if (this.mMenstruationDuration == r6.mMenstruationDuration) goto L39;
        return false;
    L39:
        if (this.mMenstruationPeriod == r6.mMenstruationPeriod) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMLatestDay() {
        return this.mLatestDay;
    }

    public final int getMLatestMonth() {
        return this.mLatestMonth;
    }

    public final int getMLatestYear() {
        return this.mLatestYear;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final int getMMenstruationDuration() {
        return this.mMenstruationDuration;
    }

    public final int getMMenstruationPeriod() {
        return this.mMenstruationPeriod;
    }

    public final int getMMenstruationReminderAdvance() {
        return this.mMenstruationReminderAdvance;
    }

    public final int getMOvulationReminderAdvance() {
        return this.mOvulationReminderAdvance;
    }

    public final int getMReminderEnable() {
        return this.mReminderEnable;
    }

    public final int getMReminderHour() {
        return this.mReminderHour;
    }

    public final int getMReminderMinute() {
        return this.mReminderMinute;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mReminderEnable)) * 31) + Integer.hashCode(this.mReminderHour)) * 31) + Integer.hashCode(this.mReminderMinute)) * 31) + Integer.hashCode(this.mMenstruationReminderAdvance)) * 31) + Integer.hashCode(this.mOvulationReminderAdvance)) * 31) + Integer.hashCode(this.mLatestYear)) * 31) + Integer.hashCode(this.mLatestMonth)) * 31) + Integer.hashCode(this.mLatestDay)) * 31) + Integer.hashCode(this.mMenstruationDuration)) * 31) + Integer.hashCode(this.mMenstruationPeriod);
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMLatestDay(int r1) {
        this.mLatestDay = r1;
    }

    public final void setMLatestMonth(int r1) {
        this.mLatestMonth = r1;
    }

    public final void setMLatestYear(int r1) {
        this.mLatestYear = r1;
    }

    public final void setMMenstruationDuration(int r1) {
        this.mMenstruationDuration = r1;
    }

    public final void setMMenstruationPeriod(int r1) {
        this.mMenstruationPeriod = r1;
    }

    public final void setMMenstruationReminderAdvance(int r1) {
        this.mMenstruationReminderAdvance = r1;
    }

    public final void setMOvulationReminderAdvance(int r1) {
        this.mOvulationReminderAdvance = r1;
    }

    public final void setMReminderEnable(int r1) {
        this.mReminderEnable = r1;
    }

    public final void setMReminderHour(int r1) {
        this.mReminderHour = r1;
    }

    public final void setMReminderMinute(int r1) {
        this.mReminderMinute = r1;
    }

    @aa1
    public String toString() {
        return "BleGirlCareSettings(mEnabled=" + this.mEnabled + ", mReminderEnable=" + this.mReminderEnable + ", mReminderHour=" + this.mReminderHour + ", mReminderMinute=" + this.mReminderMinute + ", mMenstruationReminderAdvance=" + this.mMenstruationReminderAdvance + ", mOvulationReminderAdvance=" + this.mOvulationReminderAdvance + ", mLatestYear=" + this.mLatestYear + ", mLatestMonth=" + this.mLatestMonth + ", mLatestDay=" + this.mLatestDay + ", mMenstruationDuration=" + this.mMenstruationDuration + ", mMenstruationPeriod=" + this.mMenstruationPeriod + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGirlCareSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        this.mEnabled = r1;
        this.mReminderEnable = r2;
        this.mReminderHour = r3;
        this.mReminderMinute = r4;
        this.mMenstruationReminderAdvance = r5;
        this.mOvulationReminderAdvance = r6;
        this.mLatestYear = r7;
        this.mLatestMonth = r8;
        this.mLatestDay = r9;
        this.mMenstruationDuration = r10;
        this.mMenstruationPeriod = r11;
    }

    public /* synthetic */ BleGirlCareSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        int r15 = 0;
    L35:
        int r16 = r11;
        int r17 = r10;
        int r18 = r9;
        int r19 = r8;
        int r20 = r7;
        int r21 = r6;
        int r22 = r5;
        int r23 = r4;
        this(r2, r3, r23, r22, r21, r20, r19, r18, r17, r16, r15);
        return;
    L36:
        r15 = r12;
        goto L35
    }
}
