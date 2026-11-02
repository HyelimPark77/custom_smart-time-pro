package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum HrZone extends Enum<HrZone> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ HrZone[] $VALUES = null;
    public static final HrZone HARD = null;
    public static final HrZone LOW = null;
    public static final HrZone MAXIMUM = null;
    public static final HrZone MODERATE = null;
    public static final HrZone NORMAL = null;
    private final int zone;

    private static final /* synthetic */ HrZone[] $values() {
        return new HrZone[]{LOW, NORMAL, MODERATE, HARD, MAXIMUM};
    }

    static {
        LOW = new HrZone("LOW", 0, 1);
        NORMAL = new HrZone("NORMAL", 1, 2);
        MODERATE = new HrZone("MODERATE", 2, 3);
        HARD = new HrZone("HARD", 3, 4);
        MAXIMUM = new HrZone("MAXIMUM", 4, 5);
        HrZone[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private HrZone(String r1, int r2, int r3) {
        super(r1, r2);
        this.zone = r3;
    }

    @aa1
    public static EnumEntries<HrZone> getEntries() {
        return $ENTRIES;
    }

    public static HrZone valueOf(String r1) {
        return (HrZone) Enum.valueOf(HrZone.class, r1);
    }

    public static HrZone[] values() {
        return (HrZone[]) $VALUES.clone();
    }

    public final int getZone() {
        return this.zone;
    }
}
