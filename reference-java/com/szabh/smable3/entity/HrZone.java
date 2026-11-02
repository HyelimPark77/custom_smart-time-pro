package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum HrZone {
    LOW(1),
    NORMAL(2),
    MODERATE(3),
    HARD(4),
    MAXIMUM(5);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int zone;

    HrZone(int i) {
        this.zone = i;
    }

    @aa1
    public static EnumEntries<HrZone> getEntries() {
        return $ENTRIES;
    }

    public final int getZone() {
        return this.zone;
    }
}
