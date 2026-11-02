package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum TimePeriod {
    HALF_HOUR,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR,
    ALL;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<TimePeriod> getEntries() {
        return $ENTRIES;
    }
}
