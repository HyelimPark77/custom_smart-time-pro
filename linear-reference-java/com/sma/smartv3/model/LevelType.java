package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.language.bm.Rule;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum LevelType extends Enum<LevelType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LevelType[] $VALUES = null;
    public static final LevelType ALL = null;
    public static final LevelType HIGH = null;
    public static final LevelType LOW = null;
    public static final LevelType STANDARD = null;

    private static final /* synthetic */ LevelType[] $values() {
        return new LevelType[]{ALL, STANDARD, LOW, HIGH};
    }

    static {
        ALL = new LevelType(Rule.ALL, 0);
        STANDARD = new LevelType("STANDARD", 1);
        LOW = new LevelType("LOW", 2);
        HIGH = new LevelType("HIGH", 3);
        LevelType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private LevelType(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<LevelType> getEntries() {
        return $ENTRIES;
    }

    public static LevelType valueOf(String r1) {
        return (LevelType) Enum.valueOf(LevelType.class, r1);
    }

    public static LevelType[] values() {
        return (LevelType[]) $VALUES.clone();
    }
}
