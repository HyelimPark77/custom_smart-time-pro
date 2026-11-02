package com.bestmafen.androidbase.extension;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public final enum PermissionStatus extends Enum<PermissionStatus> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PermissionStatus[] $VALUES = null;
    public static final PermissionStatus DENIED = null;
    public static final PermissionStatus DENIED_FOREVER = null;
    public static final PermissionStatus GRANTED = null;

    private static final /* synthetic */ PermissionStatus[] $values() {
        return new PermissionStatus[]{GRANTED, DENIED, DENIED_FOREVER};
    }

    static {
        GRANTED = new PermissionStatus("GRANTED", 0);
        DENIED = new PermissionStatus("DENIED", 1);
        DENIED_FOREVER = new PermissionStatus("DENIED_FOREVER", 2);
        PermissionStatus[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private PermissionStatus(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<PermissionStatus> getEntries() {
        return $ENTRIES;
    }

    public static PermissionStatus valueOf(String r1) {
        return (PermissionStatus) Enum.valueOf(PermissionStatus.class, r1);
    }

    public static PermissionStatus[] values() {
        return (PermissionStatus[]) $VALUES.clone();
    }
}
