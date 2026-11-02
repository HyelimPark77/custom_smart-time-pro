package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum PrayTimeType extends Enum<PrayTimeType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PrayTimeType[] $VALUES = null;
    public static final PrayTimeType ASR = null;
    public static final PrayTimeType DHUHR = null;
    public static final PrayTimeType FAJR = null;
    public static final PrayTimeType ISHA = null;
    public static final PrayTimeType MAGHRIB = null;
    public static final PrayTimeType SUNRISE = null;

    private static final /* synthetic */ PrayTimeType[] $values() {
        return new PrayTimeType[]{FAJR, SUNRISE, DHUHR, ASR, MAGHRIB, ISHA};
    }

    static {
        FAJR = new PrayTimeType("FAJR", 0);
        SUNRISE = new PrayTimeType("SUNRISE", 1);
        DHUHR = new PrayTimeType("DHUHR", 2);
        ASR = new PrayTimeType("ASR", 3);
        MAGHRIB = new PrayTimeType("MAGHRIB", 4);
        ISHA = new PrayTimeType("ISHA", 5);
        PrayTimeType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private PrayTimeType(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<PrayTimeType> getEntries() {
        return $ENTRIES;
    }

    public static PrayTimeType valueOf(String r1) {
        return (PrayTimeType) Enum.valueOf(PrayTimeType.class, r1);
    }

    public static PrayTimeType[] values() {
        return (PrayTimeType[]) $VALUES.clone();
    }
}
