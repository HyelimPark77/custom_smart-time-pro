package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum FunctionType extends Enum<FunctionType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ FunctionType[] $VALUES = null;
    public static final FunctionType THIRD_PARTY_AI_ASSISTANT = null;
    private final int flag;

    private static final /* synthetic */ FunctionType[] $values() {
        return new FunctionType[]{THIRD_PARTY_AI_ASSISTANT};
    }

    static {
        THIRD_PARTY_AI_ASSISTANT = new FunctionType("THIRD_PARTY_AI_ASSISTANT", 0, 1001);
        FunctionType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private FunctionType(String r1, int r2, int r3) {
        super(r1, r2);
        this.flag = r3;
    }

    @aa1
    public static EnumEntries<FunctionType> getEntries() {
        return $ENTRIES;
    }

    public static FunctionType valueOf(String r1) {
        return (FunctionType) Enum.valueOf(FunctionType.class, r1);
    }

    public static FunctionType[] values() {
        return (FunctionType[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
