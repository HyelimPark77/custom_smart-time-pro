package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum AIFunctionCat {
    ALL(0),
    LIFE(1),
    WORK(2),
    AMUSEMENT(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int cat;

    AIFunctionCat(int i) {
        this.cat = i;
    }

    @aa1
    public static EnumEntries<AIFunctionCat> getEntries() {
        return $ENTRIES;
    }

    public final int getCat() {
        return this.cat;
    }
}
