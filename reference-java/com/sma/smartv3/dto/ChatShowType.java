package com.sma.smartv3.dto;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum ChatShowType {
    FROM(1),
    TO(2);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int flag;

    ChatShowType(int i) {
        this.flag = i;
    }

    @aa1
    public static EnumEntries<ChatShowType> getEntries() {
        return $ENTRIES;
    }

    public final int getFlag() {
        return this.flag;
    }
}
