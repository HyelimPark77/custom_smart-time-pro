package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum LeftAndRightPlayControl extends Enum<LeftAndRightPlayControl> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LeftAndRightPlayControl[] $VALUES = null;
    public static final LeftAndRightPlayControl LEFT = null;
    public static final LeftAndRightPlayControl LEFT_AND_RIGHT = null;
    public static final LeftAndRightPlayControl RIGHT = null;
    private final int model;

    private static final /* synthetic */ LeftAndRightPlayControl[] $values() {
        return new LeftAndRightPlayControl[]{LEFT, RIGHT, LEFT_AND_RIGHT};
    }

    static {
        LEFT = new LeftAndRightPlayControl("LEFT", 0, 1);
        RIGHT = new LeftAndRightPlayControl("RIGHT", 1, 2);
        LEFT_AND_RIGHT = new LeftAndRightPlayControl("LEFT_AND_RIGHT", 2, 3);
        LeftAndRightPlayControl[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private LeftAndRightPlayControl(String r1, int r2, int r3) {
        super(r1, r2);
        this.model = r3;
    }

    @aa1
    public static EnumEntries<LeftAndRightPlayControl> getEntries() {
        return $ENTRIES;
    }

    public static LeftAndRightPlayControl valueOf(String r1) {
        return (LeftAndRightPlayControl) Enum.valueOf(LeftAndRightPlayControl.class, r1);
    }

    public static LeftAndRightPlayControl[] values() {
        return (LeftAndRightPlayControl[]) $VALUES.clone();
    }

    public final int getModel() {
        return this.model;
    }
}
