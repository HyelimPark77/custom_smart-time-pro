package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.language.bm.Rule;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum TimePeriod extends Enum<TimePeriod> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TimePeriod[] $VALUES = null;
    public static final TimePeriod ALL = null;
    public static final TimePeriod DAY = null;
    public static final TimePeriod HALF_HOUR = null;
    public static final TimePeriod HOUR = null;
    public static final TimePeriod MONTH = null;
    public static final TimePeriod WEEK = null;
    public static final TimePeriod YEAR = null;

    private static final /* synthetic */ TimePeriod[] $values() {
        return new TimePeriod[]{HALF_HOUR, HOUR, DAY, WEEK, MONTH, YEAR, ALL};
    }

    static {
        HALF_HOUR = new TimePeriod("HALF_HOUR", 0);
        HOUR = new TimePeriod("HOUR", 1);
        DAY = new TimePeriod("DAY", 2);
        WEEK = new TimePeriod("WEEK", 3);
        MONTH = new TimePeriod("MONTH", 4);
        YEAR = new TimePeriod("YEAR", 5);
        ALL = new TimePeriod(Rule.ALL, 6);
        TimePeriod[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private TimePeriod(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<TimePeriod> getEntries() {
        return $ENTRIES;
    }

    public static TimePeriod valueOf(String r1) {
        return (TimePeriod) Enum.valueOf(TimePeriod.class, r1);
    }

    public static TimePeriod[] values() {
        return (TimePeriod[]) $VALUES.clone();
    }
}
