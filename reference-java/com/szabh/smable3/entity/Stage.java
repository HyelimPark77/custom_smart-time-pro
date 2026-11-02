package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum Stage {
    WARM_UP(0),
    GO_FOR(1),
    RECOVERY(2),
    REST_FOR(3),
    COOL_DOWN(4),
    OTHER(255);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int stage;

    Stage(int i) {
        this.stage = i;
    }

    @aa1
    public static EnumEntries<Stage> getEntries() {
        return $ENTRIES;
    }

    public final int getStage() {
        return this.stage;
    }
}
