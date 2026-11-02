package com.bestmafen.androidbase.extension;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public enum PermissionStatus {
    GRANTED,
    DENIED,
    DENIED_FOREVER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<PermissionStatus> getEntries() {
        return $ENTRIES;
    }
}
