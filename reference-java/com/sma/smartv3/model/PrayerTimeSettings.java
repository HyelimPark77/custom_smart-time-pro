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
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
    }

    public static /* synthetic */ PrayerTimeSettings copy$default(PrayerTimeSettings prayerTimeSettings, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = prayerTimeSettings.calculationMethod;
        }
        if ((i10 & 2) != 0) {
            i2 = prayerTimeSettings.arsJuristicMethod;
        }
        if ((i10 & 4) != 0) {
            i3 = prayerTimeSettings.hijriDateAdjustment;
        }
        if ((i10 & 8) != 0) {
            i4 = prayerTimeSettings.fajrAdjustment;
        }
        if ((i10 & 16) != 0) {
            i5 = prayerTimeSettings.sunriseAdjustment;
        }
        if ((i10 & 32) != 0) {
            i6 = prayerTimeSettings.dhuhrAdjustment;
        }
        if ((i10 & 64) != 0) {
            i7 = prayerTimeSettings.asrAdjustment;
        }
        if ((i10 & 128) != 0) {
            i8 = prayerTimeSettings.maghribAdjustment;
        }
        if ((i10 & 256) != 0) {
            i9 = prayerTimeSettings.ishaAdjustment;
        }
        int i11 = i8;
        int i12 = i9;
        int i13 = i6;
        int i14 = i7;
        int i15 = i5;
        int i16 = i3;
        return prayerTimeSettings.copy(i, i2, i16, i4, i15, i13, i14, i11, i12);
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
    public final PrayerTimeSettings copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new PrayerTimeSettings(i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrayerTimeSettings)) {
            return false;
        }
        PrayerTimeSettings prayerTimeSettings = (PrayerTimeSettings) obj;
        return this.calculationMethod == prayerTimeSettings.calculationMethod && this.arsJuristicMethod == prayerTimeSettings.arsJuristicMethod && this.hijriDateAdjustment == prayerTimeSettings.hijriDateAdjustment && this.fajrAdjustment == prayerTimeSettings.fajrAdjustment && this.sunriseAdjustment == prayerTimeSettings.sunriseAdjustment && this.dhuhrAdjustment == prayerTimeSettings.dhuhrAdjustment && this.asrAdjustment == prayerTimeSettings.asrAdjustment && this.maghribAdjustment == prayerTimeSettings.maghribAdjustment && this.ishaAdjustment == prayerTimeSettings.ishaAdjustment;
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

    public final void setArsJuristicMethod(int i) {
        this.arsJuristicMethod = i;
    }

    public final void setAsrAdjustment(int i) {
        this.asrAdjustment = i;
    }

    public final void setCalculationMethod(int i) {
        this.calculationMethod = i;
    }

    public final void setDhuhrAdjustment(int i) {
        this.dhuhrAdjustment = i;
    }

    public final void setFajrAdjustment(int i) {
        this.fajrAdjustment = i;
    }

    public final void setHijriDateAdjustment(int i) {
        this.hijriDateAdjustment = i;
    }

    public final void setIshaAdjustment(int i) {
        this.ishaAdjustment = i;
    }

    public final void setMaghribAdjustment(int i) {
        this.maghribAdjustment = i;
    }

    public final void setSunriseAdjustment(int i) {
        this.sunriseAdjustment = i;
    }

    @aa1
    public String toString() {
        return "PrayerTimeSettings(calculationMethod=" + this.calculationMethod + ", arsJuristicMethod=" + this.arsJuristicMethod + ", hijriDateAdjustment=" + this.hijriDateAdjustment + ", fajrAdjustment=" + this.fajrAdjustment + ", sunriseAdjustment=" + this.sunriseAdjustment + ", dhuhrAdjustment=" + this.dhuhrAdjustment + ", asrAdjustment=" + this.asrAdjustment + ", maghribAdjustment=" + this.maghribAdjustment + ", ishaAdjustment=" + this.ishaAdjustment + I000IiI1O.C2156iO.f1007iO;
    }

    public PrayerTimeSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.calculationMethod = i;
        this.arsJuristicMethod = i2;
        this.hijriDateAdjustment = i3;
        this.fajrAdjustment = i4;
        this.sunriseAdjustment = i5;
        this.dhuhrAdjustment = i6;
        this.asrAdjustment = i7;
        this.maghribAdjustment = i8;
        this.ishaAdjustment = i9;
    }

    public /* synthetic */ PrayerTimeSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? 0 : i3, (i10 & 8) != 0 ? 0 : i4, (i10 & 16) != 0 ? 0 : i5, (i10 & 32) != 0 ? 0 : i6, (i10 & 64) != 0 ? 0 : i7, (i10 & 128) != 0 ? 0 : i8, (i10 & 256) != 0 ? 0 : i9);
    }
}
