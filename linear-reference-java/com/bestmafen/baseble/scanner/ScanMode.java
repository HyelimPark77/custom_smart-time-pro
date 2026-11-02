package com.bestmafen.baseble.scanner;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public final enum ScanMode extends Enum<ScanMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ScanMode[] $VALUES = null;
    public static final ScanMode BALANCED = null;
    public static final ScanMode LOW_LATENCY = null;
    public static final ScanMode LOW_POWER = null;

    private static final /* synthetic */ ScanMode[] $values() {
        return new ScanMode[]{LOW_POWER, BALANCED, LOW_LATENCY};
    }

    static {
        LOW_POWER = new ScanMode("LOW_POWER", 0);
        BALANCED = new ScanMode("BALANCED", 1);
        LOW_LATENCY = new ScanMode("LOW_LATENCY", 2);
        ScanMode[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private ScanMode(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<ScanMode> getEntries() {
        return $ENTRIES;
    }

    public static ScanMode valueOf(String r1) {
        return (ScanMode) Enum.valueOf(ScanMode.class, r1);
    }

    public static ScanMode[] values() {
        return (ScanMode[]) $VALUES.clone();
    }
}
