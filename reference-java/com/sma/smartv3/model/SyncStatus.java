package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum SyncStatus {
    DOWNLOAD,
    FAILED,
    NO_SYNC,
    SYNCING,
    SYNCED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<SyncStatus> getEntries() {
        return $ENTRIES;
    }
}
