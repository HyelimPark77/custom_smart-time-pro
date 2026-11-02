package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum VipBenefitType {
    AI(257),
    AIGC(258),
    DIAL(259),
    BUY_VIP(260);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int type;

    VipBenefitType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<VipBenefitType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
