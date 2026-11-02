package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum AppStoreItemType extends Enum<AppStoreItemType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AppStoreItemType[] $VALUES = null;
    public static final AppStoreItemType INSTALL = null;
    public static final AppStoreItemType INSTALLED = null;
    public static final AppStoreItemType NOT_RENEW = null;
    public static final AppStoreItemType RENEW = null;
    private final int type;

    private static final /* synthetic */ AppStoreItemType[] $values() {
        return new AppStoreItemType[]{INSTALLED, INSTALL, RENEW, NOT_RENEW};
    }

    static {
        INSTALLED = new AppStoreItemType("INSTALLED", 0, 0);
        INSTALL = new AppStoreItemType("INSTALL", 1, 1);
        RENEW = new AppStoreItemType("RENEW", 2, 2);
        NOT_RENEW = new AppStoreItemType("NOT_RENEW", 3, 3);
        AppStoreItemType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private AppStoreItemType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<AppStoreItemType> getEntries() {
        return $ENTRIES;
    }

    public static AppStoreItemType valueOf(String r1) {
        return (AppStoreItemType) Enum.valueOf(AppStoreItemType.class, r1);
    }

    public static AppStoreItemType[] values() {
        return (AppStoreItemType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
