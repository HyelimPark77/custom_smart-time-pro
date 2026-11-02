package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum AppStoreItemType {
    INSTALLED(0),
    INSTALL(1),
    RENEW(2),
    NOT_RENEW(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int type;

    AppStoreItemType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<AppStoreItemType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
