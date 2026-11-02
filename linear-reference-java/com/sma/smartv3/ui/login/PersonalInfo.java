package com.sma.smartv3.ui.login;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum PersonalInfo extends Enum<PersonalInfo> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PersonalInfo[] $VALUES = null;
    public static final PersonalInfo BIRTHDAY_UNIT = null;
    public static final PersonalInfo HEIGHT_WEIGHT = null;
    public static final PersonalInfo MOVING_TARGET = null;
    public static final PersonalInfo NAME_GENDER = null;

    private static final /* synthetic */ PersonalInfo[] $values() {
        return new PersonalInfo[]{NAME_GENDER, BIRTHDAY_UNIT, HEIGHT_WEIGHT, MOVING_TARGET};
    }

    static {
        NAME_GENDER = new PersonalInfo("NAME_GENDER", 0);
        BIRTHDAY_UNIT = new PersonalInfo("BIRTHDAY_UNIT", 1);
        HEIGHT_WEIGHT = new PersonalInfo("HEIGHT_WEIGHT", 2);
        MOVING_TARGET = new PersonalInfo("MOVING_TARGET", 3);
        PersonalInfo[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private PersonalInfo(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<PersonalInfo> getEntries() {
        return $ENTRIES;
    }

    public static PersonalInfo valueOf(String r1) {
        return (PersonalInfo) Enum.valueOf(PersonalInfo.class, r1);
    }

    public static PersonalInfo[] values() {
        return (PersonalInfo[]) $VALUES.clone();
    }
}
