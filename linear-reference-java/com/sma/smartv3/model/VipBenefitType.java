package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum VipBenefitType extends Enum<VipBenefitType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ VipBenefitType[] $VALUES = null;
    public static final VipBenefitType AI = null;
    public static final VipBenefitType AIGC = null;
    public static final VipBenefitType BUY_VIP = null;
    public static final VipBenefitType DIAL = null;
    private final int type;

    private static final /* synthetic */ VipBenefitType[] $values() {
        return new VipBenefitType[]{AI, AIGC, DIAL, BUY_VIP};
    }

    static {
        AI = new VipBenefitType("AI", 0, 257);
        AIGC = new VipBenefitType("AIGC", 1, 258);
        DIAL = new VipBenefitType("DIAL", 2, 259);
        BUY_VIP = new VipBenefitType("BUY_VIP", 3, 260);
        VipBenefitType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private VipBenefitType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<VipBenefitType> getEntries() {
        return $ENTRIES;
    }

    public static VipBenefitType valueOf(String r1) {
        return (VipBenefitType) Enum.valueOf(VipBenefitType.class, r1);
    }

    public static VipBenefitType[] values() {
        return (VipBenefitType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
