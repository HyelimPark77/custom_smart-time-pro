package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum CompletionCondition extends Enum<CompletionCondition> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CompletionCondition[] $VALUES = null;
    public static final CompletionCondition DURATION = null;
    public static final CompletionCondition DURATION_IN_HR_ZONE = null;
    public static final CompletionCondition HR_ABOVE = null;
    public static final CompletionCondition HR_BELOW = null;
    public static final CompletionCondition MANUAL = null;
    private final int condition;

    private static final /* synthetic */ CompletionCondition[] $values() {
        return new CompletionCondition[]{DURATION, MANUAL, DURATION_IN_HR_ZONE, HR_ABOVE, HR_BELOW};
    }

    static {
        DURATION = new CompletionCondition("DURATION", 0, 0);
        MANUAL = new CompletionCondition("MANUAL", 1, 1);
        DURATION_IN_HR_ZONE = new CompletionCondition("DURATION_IN_HR_ZONE", 2, 2);
        HR_ABOVE = new CompletionCondition("HR_ABOVE", 3, 3);
        HR_BELOW = new CompletionCondition("HR_BELOW", 4, 4);
        CompletionCondition[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private CompletionCondition(String r1, int r2, int r3) {
        super(r1, r2);
        this.condition = r3;
    }

    @aa1
    public static EnumEntries<CompletionCondition> getEntries() {
        return $ENTRIES;
    }

    public static CompletionCondition valueOf(String r1) {
        return (CompletionCondition) Enum.valueOf(CompletionCondition.class, r1);
    }

    public static CompletionCondition[] values() {
        return (CompletionCondition[]) $VALUES.clone();
    }

    public final int getCondition() {
        return this.condition;
    }
}
