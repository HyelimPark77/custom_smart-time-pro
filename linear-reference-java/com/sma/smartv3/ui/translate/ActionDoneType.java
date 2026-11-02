package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum ActionDoneType extends Enum<ActionDoneType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ActionDoneType[] $VALUES = null;
    public static final ActionDoneType COMPLETE = null;
    public static final ActionDoneType INCOMPLETE = null;
    private final int flag;

    private static final /* synthetic */ ActionDoneType[] $values() {
        return new ActionDoneType[]{COMPLETE, INCOMPLETE};
    }

    static {
        COMPLETE = new ActionDoneType("COMPLETE", 0, 1);
        INCOMPLETE = new ActionDoneType("INCOMPLETE", 1, 0);
        ActionDoneType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private ActionDoneType(String r1, int r2, int r3) {
        super(r1, r2);
        this.flag = r3;
    }

    @aa1
    public static EnumEntries<ActionDoneType> getEntries() {
        return $ENTRIES;
    }

    public static ActionDoneType valueOf(String r1) {
        return (ActionDoneType) Enum.valueOf(ActionDoneType.class, r1);
    }

    public static ActionDoneType[] values() {
        return (ActionDoneType[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
