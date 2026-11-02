package com.sma.smartv3.p610ui.sport;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum SportDataType {
    TIME,
    DISTANCE,
    CALORIES,
    STEP,
    SPM,
    PACE,
    SPEED,
    ALTITUDE,
    HEARTRATE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static EnumEntries<SportDataType> getEntries() {
        return $ENTRIES;
    }
}
