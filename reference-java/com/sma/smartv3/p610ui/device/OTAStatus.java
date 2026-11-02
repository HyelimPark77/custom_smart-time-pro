package com.sma.smartv3.p610ui.device;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes18.dex */
public enum OTAStatus {
    NONE,
    UPGRADE_SCANNING_START,
    UPGRADE_SCANNING_TIMEOUT,
    UPGRADE_SCANNING_STOP,
    UPGRADE_PREPARE,
    UPGRADE_PREPARE_FAILED,
    UPGRADE_START,
    UPGRADE_CHECKING,
    UPGRADEING,
    UPGRADE_STOP,
    UPGRADE_FAILED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<OTAStatus> getEntries() {
        return $ENTRIES;
    }
}
