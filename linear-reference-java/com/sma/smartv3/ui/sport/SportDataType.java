package com.sma.smartv3.ui.sport;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum SportDataType extends Enum<SportDataType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SportDataType[] $VALUES = null;
    public static final SportDataType ALTITUDE = null;
    public static final SportDataType CALORIES = null;
    public static final SportDataType DISTANCE = null;
    public static final SportDataType HEARTRATE = null;
    public static final SportDataType PACE = null;
    public static final SportDataType SPEED = null;
    public static final SportDataType SPM = null;
    public static final SportDataType STEP = null;
    public static final SportDataType TIME = null;

    private static final /* synthetic */ SportDataType[] $values() {
        return new SportDataType[]{TIME, DISTANCE, CALORIES, STEP, SPM, PACE, SPEED, ALTITUDE, HEARTRATE};
    }

    static {
        TIME = new SportDataType(q62.X0iO, 0);
        DISTANCE = new SportDataType("DISTANCE", 1);
        CALORIES = new SportDataType("CALORIES", 2);
        STEP = new SportDataType("STEP", 3);
        SPM = new SportDataType("SPM", 4);
        PACE = new SportDataType("PACE", 5);
        SPEED = new SportDataType("SPEED", 6);
        ALTITUDE = new SportDataType("ALTITUDE", 7);
        HEARTRATE = new SportDataType("HEARTRATE", 8);
        SportDataType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private SportDataType(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<SportDataType> getEntries() {
        return $ENTRIES;
    }

    public static SportDataType valueOf(String r1) {
        return (SportDataType) Enum.valueOf(SportDataType.class, r1);
    }

    public static SportDataType[] values() {
        return (SportDataType[]) $VALUES.clone();
    }
}
