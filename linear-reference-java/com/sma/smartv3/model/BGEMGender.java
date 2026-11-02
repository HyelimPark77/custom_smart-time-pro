package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum BGEMGender extends Enum<BGEMGender> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BGEMGender[] $VALUES = null;
    public static final BGEMGender F = null;
    public static final BGEMGender M = null;

    private static final /* synthetic */ BGEMGender[] $values() {
        return new BGEMGender[]{M, F};
    }

    static {
        M = new BGEMGender("M", 0);
        F = new BGEMGender("F", 1);
        BGEMGender[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private BGEMGender(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<BGEMGender> getEntries() {
        return $ENTRIES;
    }

    public static BGEMGender valueOf(String r1) {
        return (BGEMGender) Enum.valueOf(BGEMGender.class, r1);
    }

    public static BGEMGender[] values() {
        return (BGEMGender[]) $VALUES.clone();
    }
}
