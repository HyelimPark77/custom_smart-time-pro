package com.sma.smartv3.ui.device;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes18.dex */
public final enum OTAStatus extends Enum<OTAStatus> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ OTAStatus[] $VALUES = null;
    public static final OTAStatus NONE = null;
    public static final OTAStatus UPGRADEING = null;
    public static final OTAStatus UPGRADE_CHECKING = null;
    public static final OTAStatus UPGRADE_FAILED = null;
    public static final OTAStatus UPGRADE_PREPARE = null;
    public static final OTAStatus UPGRADE_PREPARE_FAILED = null;
    public static final OTAStatus UPGRADE_SCANNING_START = null;
    public static final OTAStatus UPGRADE_SCANNING_STOP = null;
    public static final OTAStatus UPGRADE_SCANNING_TIMEOUT = null;
    public static final OTAStatus UPGRADE_START = null;
    public static final OTAStatus UPGRADE_STOP = null;

    private static final /* synthetic */ OTAStatus[] $values() {
        return new OTAStatus[]{NONE, UPGRADE_SCANNING_START, UPGRADE_SCANNING_TIMEOUT, UPGRADE_SCANNING_STOP, UPGRADE_PREPARE, UPGRADE_PREPARE_FAILED, UPGRADE_START, UPGRADE_CHECKING, UPGRADEING, UPGRADE_STOP, UPGRADE_FAILED};
    }

    static {
        NONE = new OTAStatus("NONE", 0);
        UPGRADE_SCANNING_START = new OTAStatus("UPGRADE_SCANNING_START", 1);
        UPGRADE_SCANNING_TIMEOUT = new OTAStatus("UPGRADE_SCANNING_TIMEOUT", 2);
        UPGRADE_SCANNING_STOP = new OTAStatus("UPGRADE_SCANNING_STOP", 3);
        UPGRADE_PREPARE = new OTAStatus("UPGRADE_PREPARE", 4);
        UPGRADE_PREPARE_FAILED = new OTAStatus("UPGRADE_PREPARE_FAILED", 5);
        UPGRADE_START = new OTAStatus("UPGRADE_START", 6);
        UPGRADE_CHECKING = new OTAStatus("UPGRADE_CHECKING", 7);
        UPGRADEING = new OTAStatus("UPGRADEING", 8);
        UPGRADE_STOP = new OTAStatus("UPGRADE_STOP", 9);
        UPGRADE_FAILED = new OTAStatus("UPGRADE_FAILED", 10);
        OTAStatus[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private OTAStatus(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<OTAStatus> getEntries() {
        return $ENTRIES;
    }

    public static OTAStatus valueOf(String r1) {
        return (OTAStatus) Enum.valueOf(OTAStatus.class, r1);
    }

    public static OTAStatus[] values() {
        return (OTAStatus[]) $VALUES.clone();
    }
}
