package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum SyncStatus extends Enum<SyncStatus> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SyncStatus[] $VALUES = null;
    public static final SyncStatus DOWNLOAD = null;
    public static final SyncStatus FAILED = null;
    public static final SyncStatus NO_SYNC = null;
    public static final SyncStatus SYNCED = null;
    public static final SyncStatus SYNCING = null;

    private static final /* synthetic */ SyncStatus[] $values() {
        return new SyncStatus[]{DOWNLOAD, FAILED, NO_SYNC, SYNCING, SYNCED};
    }

    static {
        DOWNLOAD = new SyncStatus("DOWNLOAD", 0);
        FAILED = new SyncStatus("FAILED", 1);
        NO_SYNC = new SyncStatus("NO_SYNC", 2);
        SYNCING = new SyncStatus("SYNCING", 3);
        SYNCED = new SyncStatus("SYNCED", 4);
        SyncStatus[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private SyncStatus(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<SyncStatus> getEntries() {
        return $ENTRIES;
    }

    public static SyncStatus valueOf(String r1) {
        return (SyncStatus) Enum.valueOf(SyncStatus.class, r1);
    }

    public static SyncStatus[] values() {
        return (SyncStatus[]) $VALUES.clone();
    }
}
