package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum SegmentActivity extends Enum<SegmentActivity> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SegmentActivity[] $VALUES = null;
    public static final SegmentActivity BICYCLE = null;
    public static final SegmentActivity COOL_DOWN = null;
    public static final SegmentActivity DISTANCE = null;
    public static final SegmentActivity JUMP_JACKS = null;
    public static final SegmentActivity PUSH_UP = null;
    public static final SegmentActivity REST = null;
    public static final SegmentActivity RUN = null;
    public static final SegmentActivity RUN_FAST = null;
    public static final SegmentActivity SIT_UP = null;
    public static final SegmentActivity SPINNING = null;
    public static final SegmentActivity STRETCH = null;
    public static final SegmentActivity SWIM = null;
    public static final SegmentActivity TIMER = null;
    public static final SegmentActivity WALK = null;
    public static final SegmentActivity WARM_UP = null;
    public static final SegmentActivity WORKOUT = null;
    private final int activity;

    private static final /* synthetic */ SegmentActivity[] $values() {
        return new SegmentActivity[]{TIMER, RUN, JUMP_JACKS, PUSH_UP, DISTANCE, RUN_FAST, WALK, SWIM, BICYCLE, WORKOUT, REST, STRETCH, SPINNING, SIT_UP, WARM_UP, COOL_DOWN};
    }

    static {
        TIMER = new SegmentActivity("TIMER", 0, 0);
        RUN = new SegmentActivity("RUN", 1, 1);
        JUMP_JACKS = new SegmentActivity("JUMP_JACKS", 2, 2);
        PUSH_UP = new SegmentActivity("PUSH_UP", 3, 3);
        DISTANCE = new SegmentActivity("DISTANCE", 4, 4);
        RUN_FAST = new SegmentActivity("RUN_FAST", 5, 5);
        WALK = new SegmentActivity("WALK", 6, 6);
        SWIM = new SegmentActivity("SWIM", 7, 7);
        BICYCLE = new SegmentActivity("BICYCLE", 8, 8);
        WORKOUT = new SegmentActivity("WORKOUT", 9, 9);
        REST = new SegmentActivity("REST", 10, 10);
        STRETCH = new SegmentActivity("STRETCH", 11, 11);
        SPINNING = new SegmentActivity("SPINNING", 12, 12);
        SIT_UP = new SegmentActivity("SIT_UP", 13, 15);
        WARM_UP = new SegmentActivity("WARM_UP", 14, 16);
        COOL_DOWN = new SegmentActivity("COOL_DOWN", 15, 17);
        SegmentActivity[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private SegmentActivity(String r1, int r2, int r3) {
        super(r1, r2);
        this.activity = r3;
    }

    @aa1
    public static EnumEntries<SegmentActivity> getEntries() {
        return $ENTRIES;
    }

    public static SegmentActivity valueOf(String r1) {
        return (SegmentActivity) Enum.valueOf(SegmentActivity.class, r1);
    }

    public static SegmentActivity[] values() {
        return (SegmentActivity[]) $VALUES.clone();
    }

    public final int getActivity() {
        return this.activity;
    }
}
