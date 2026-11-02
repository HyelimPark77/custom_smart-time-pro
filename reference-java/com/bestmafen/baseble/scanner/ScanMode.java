package com.bestmafen.baseble.scanner;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public enum ScanMode {
    LOW_POWER,
    BALANCED,
    LOW_LATENCY;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<ScanMode> getEntries() {
        return $ENTRIES;
    }
}
