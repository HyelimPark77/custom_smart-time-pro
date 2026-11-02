package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class PrayerTimeSettings {
    private int arsJuristicMethod;
    private int asrAdjustment;
    private int calculationMethod;
    private int dhuhrAdjustment;
    private int fajrAdjustment;
    private int hijriDateAdjustment;
    private int ishaAdjustment;
    private int maghribAdjustment;
    private int sunriseAdjustment;

    public PrayerTimeSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ PrayerTimeSettings copy$default(PrayerTimeSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.calculationMethod;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.arsJuristicMethod;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.hijriDateAdjustment;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.fajrAdjustment;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.sunriseAdjustment;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.dhuhrAdjustment;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.asrAdjustment;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.maghribAdjustment;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.ishaAdjustment;
    L29:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.calculationMethod;
    }

    public final int component2() {
        return this.arsJuristicMethod;
    }

    public final int component3() {
        return this.hijriDateAdjustment;
    }

    public final int component4() {
        return this.fajrAdjustment;
    }

    public final int component5() {
        return this.sunriseAdjustment;
    }

    public final int component6() {
        return this.dhuhrAdjustment;
    }

    public final int component7() {
        return this.asrAdjustment;
    }

    public final int component8() {
        return this.maghribAdjustment;
    }

    public final int component9() {
        return this.ishaAdjustment;
    }

    @aa1
    public final PrayerTimeSettings copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new PrayerTimeSettings(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PrayerTimeSettings) == true) goto L8;
        return false;
    L8:
        PrayerTimeSettings r6 = (PrayerTimeSettings) r5;
        if (this.calculationMethod == r6.calculationMethod) goto L12;
        return false;
    L12:
        if (this.arsJuristicMethod == r6.arsJuristicMethod) goto L15;
        return false;
    L15:
        if (this.hijriDateAdjustment == r6.hijriDateAdjustment) goto L18;
        return false;
    L18:
        if (this.fajrAdjustment == r6.fajrAdjustment) goto L21;
        return false;
    L21:
        if (this.sunriseAdjustment == r6.sunriseAdjustment) goto L24;
        return false;
    L24:
        if (this.dhuhrAdjustment == r6.dhuhrAdjustment) goto L27;
        return false;
    L27:
        if (this.asrAdjustment == r6.asrAdjustment) goto L30;
        return false;
    L30:
        if (this.maghribAdjustment == r6.maghribAdjustment) goto L33;
        return false;
    L33:
        if (this.ishaAdjustment == r6.ishaAdjustment) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getArsJuristicMethod() {
        return this.arsJuristicMethod;
    }

    public final int getAsrAdjustment() {
        return this.asrAdjustment;
    }

    public final int getCalculationMethod() {
        return this.calculationMethod;
    }

    public final int getDhuhrAdjustment() {
        return this.dhuhrAdjustment;
    }

    public final int getFajrAdjustment() {
        return this.fajrAdjustment;
    }

    public final int getHijriDateAdjustment() {
        return this.hijriDateAdjustment;
    }

    public final int getIshaAdjustment() {
        return this.ishaAdjustment;
    }

    public final int getMaghribAdjustment() {
        return this.maghribAdjustment;
    }

    public final int getSunriseAdjustment() {
        return this.sunriseAdjustment;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.calculationMethod) * 31) + Integer.hashCode(this.arsJuristicMethod)) * 31) + Integer.hashCode(this.hijriDateAdjustment)) * 31) + Integer.hashCode(this.fajrAdjustment)) * 31) + Integer.hashCode(this.sunriseAdjustment)) * 31) + Integer.hashCode(this.dhuhrAdjustment)) * 31) + Integer.hashCode(this.asrAdjustment)) * 31) + Integer.hashCode(this.maghribAdjustment)) * 31) + Integer.hashCode(this.ishaAdjustment);
    }

    public final void setArsJuristicMethod(int r1) {
        this.arsJuristicMethod = r1;
    }

    public final void setAsrAdjustment(int r1) {
        this.asrAdjustment = r1;
    }

    public final void setCalculationMethod(int r1) {
        this.calculationMethod = r1;
    }

    public final void setDhuhrAdjustment(int r1) {
        this.dhuhrAdjustment = r1;
    }

    public final void setFajrAdjustment(int r1) {
        this.fajrAdjustment = r1;
    }

    public final void setHijriDateAdjustment(int r1) {
        this.hijriDateAdjustment = r1;
    }

    public final void setIshaAdjustment(int r1) {
        this.ishaAdjustment = r1;
    }

    public final void setMaghribAdjustment(int r1) {
        this.maghribAdjustment = r1;
    }

    public final void setSunriseAdjustment(int r1) {
        this.sunriseAdjustment = r1;
    }

    @aa1
    public String toString() {
        return "PrayerTimeSettings(calculationMethod=" + this.calculationMethod + ", arsJuristicMethod=" + this.arsJuristicMethod + ", hijriDateAdjustment=" + this.hijriDateAdjustment + ", fajrAdjustment=" + this.fajrAdjustment + ", sunriseAdjustment=" + this.sunriseAdjustment + ", dhuhrAdjustment=" + this.dhuhrAdjustment + ", asrAdjustment=" + this.asrAdjustment + ", maghribAdjustment=" + this.maghribAdjustment + ", ishaAdjustment=" + this.ishaAdjustment + I000IiI1O.iO.iO;
    }

    public PrayerTimeSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.calculationMethod = r1;
        this.arsJuristicMethod = r2;
        this.hijriDateAdjustment = r3;
        this.fajrAdjustment = r4;
        this.sunriseAdjustment = r5;
        this.dhuhrAdjustment = r6;
        this.asrAdjustment = r7;
        this.maghribAdjustment = r8;
        this.ishaAdjustment = r9;
    }

    public /* synthetic */ PrayerTimeSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r11 & 256) == 0) goto L30;
        int r13 = 0;
    L29:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
