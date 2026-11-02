package com.sma.smartv3.view.text;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum MyTypeface {
    DIN_COND_BOLD("DINCond-Bold.otf"),
    PF_MEDIUM("PingFang Medium_0.ttf"),
    PF_BOLD("PingFang Bold.ttf"),
    PF_EXTRA_LIGHT("PingFang ExtraLight.ttf"),
    PF_REGULAR("PingFang Regular_0.ttf");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    private final String fontName;

    MyTypeface(String str) {
        this.fontName = str;
    }

    @aa1
    public static EnumEntries<MyTypeface> getEntries() {
        return $ENTRIES;
    }

    @aa1
    public final String getFontName() {
        return this.fontName;
    }
}
