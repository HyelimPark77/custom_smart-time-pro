package com.sma.smartv3.ui.device.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes18.dex */
public final enum LanguageUiType extends Enum<LanguageUiType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LanguageUiType[] $VALUES = null;
    public static final LanguageUiType ADD = null;
    public static final LanguageUiType NORMAL = null;

    private static final /* synthetic */ LanguageUiType[] $values() {
        return new LanguageUiType[]{NORMAL, ADD};
    }

    static {
        NORMAL = new LanguageUiType("NORMAL", 0);
        ADD = new LanguageUiType("ADD", 1);
        LanguageUiType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private LanguageUiType(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<LanguageUiType> getEntries() {
        return $ENTRIES;
    }

    public static LanguageUiType valueOf(String r1) {
        return (LanguageUiType) Enum.valueOf(LanguageUiType.class, r1);
    }

    public static LanguageUiType[] values() {
        return (LanguageUiType[]) $VALUES.clone();
    }
}
