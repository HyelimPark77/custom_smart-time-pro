package com.bestmafen.baseble.util;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public enum LogLevel {
    V,
    D,
    I,
    W,
    E;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }
}
