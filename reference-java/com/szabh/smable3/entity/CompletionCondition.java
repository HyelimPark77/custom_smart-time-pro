package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum CompletionCondition {
    DURATION(0),
    MANUAL(1),
    DURATION_IN_HR_ZONE(2),
    HR_ABOVE(3),
    HR_BELOW(4);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int condition;

    CompletionCondition(int i) {
        this.condition = i;
    }

    @aa1
    public static EnumEntries<CompletionCondition> getEntries() {
        return $ENTRIES;
    }

    public final int getCondition() {
        return this.condition;
    }
}
