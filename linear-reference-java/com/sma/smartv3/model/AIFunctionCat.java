package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.language.bm.Rule;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum AIFunctionCat extends Enum<AIFunctionCat> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AIFunctionCat[] $VALUES = null;
    public static final AIFunctionCat ALL = null;
    public static final AIFunctionCat AMUSEMENT = null;
    public static final AIFunctionCat LIFE = null;
    public static final AIFunctionCat WORK = null;
    private final int cat;

    private static final /* synthetic */ AIFunctionCat[] $values() {
        return new AIFunctionCat[]{ALL, LIFE, WORK, AMUSEMENT};
    }

    static {
        ALL = new AIFunctionCat(Rule.ALL, 0, 0);
        LIFE = new AIFunctionCat("LIFE", 1, 1);
        WORK = new AIFunctionCat("WORK", 2, 2);
        AMUSEMENT = new AIFunctionCat("AMUSEMENT", 3, 3);
        AIFunctionCat[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private AIFunctionCat(String r1, int r2, int r3) {
        super(r1, r2);
        this.cat = r3;
    }

    @aa1
    public static EnumEntries<AIFunctionCat> getEntries() {
        return $ENTRIES;
    }

    public static AIFunctionCat valueOf(String r1) {
        return (AIFunctionCat) Enum.valueOf(AIFunctionCat.class, r1);
    }

    public static AIFunctionCat[] values() {
        return (AIFunctionCat[]) $VALUES.clone();
    }

    public final int getCat() {
        return this.cat;
    }
}
