package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum TranslateUseCaseMODE extends Enum<TranslateUseCaseMODE> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TranslateUseCaseMODE[] $VALUES = null;
    public static final TranslateUseCaseMODE FILE = null;
    public static final TranslateUseCaseMODE STREAM = null;

    private static final /* synthetic */ TranslateUseCaseMODE[] $values() {
        return new TranslateUseCaseMODE[]{STREAM, FILE};
    }

    static {
        STREAM = new TranslateUseCaseMODE("STREAM", 0);
        FILE = new TranslateUseCaseMODE("FILE", 1);
        TranslateUseCaseMODE[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private TranslateUseCaseMODE(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<TranslateUseCaseMODE> getEntries() {
        return $ENTRIES;
    }

    public static TranslateUseCaseMODE valueOf(String r1) {
        return (TranslateUseCaseMODE) Enum.valueOf(TranslateUseCaseMODE.class, r1);
    }

    public static TranslateUseCaseMODE[] values() {
        return (TranslateUseCaseMODE[]) $VALUES.clone();
    }
}
