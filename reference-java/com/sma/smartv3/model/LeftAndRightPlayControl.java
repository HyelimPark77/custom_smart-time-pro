package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum LeftAndRightPlayControl {
    LEFT(1),
    RIGHT(2),
    LEFT_AND_RIGHT(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int model;

    LeftAndRightPlayControl(int i) {
        this.model = i;
    }

    @aa1
    public static EnumEntries<LeftAndRightPlayControl> getEntries() {
        return $ENTRIES;
    }

    public final int getModel() {
        return this.model;
    }
}
