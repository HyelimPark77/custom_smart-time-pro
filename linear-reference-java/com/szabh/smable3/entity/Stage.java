package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum Stage extends Enum<Stage> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ Stage[] $VALUES = null;
    public static final Stage COOL_DOWN = null;
    public static final Stage GO_FOR = null;
    public static final Stage OTHER = null;
    public static final Stage RECOVERY = null;
    public static final Stage REST_FOR = null;
    public static final Stage WARM_UP = null;
    private final int stage;

    private static final /* synthetic */ Stage[] $values() {
        return new Stage[]{WARM_UP, GO_FOR, RECOVERY, REST_FOR, COOL_DOWN, OTHER};
    }

    static {
        WARM_UP = new Stage("WARM_UP", 0, 0);
        GO_FOR = new Stage("GO_FOR", 1, 1);
        RECOVERY = new Stage("RECOVERY", 2, 2);
        REST_FOR = new Stage("REST_FOR", 3, 3);
        COOL_DOWN = new Stage("COOL_DOWN", 4, 4);
        OTHER = new Stage("OTHER", 5, 255);
        Stage[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private Stage(String r1, int r2, int r3) {
        super(r1, r2);
        this.stage = r3;
    }

    @aa1
    public static EnumEntries<Stage> getEntries() {
        return $ENTRIES;
    }

    public static Stage valueOf(String r1) {
        return (Stage) Enum.valueOf(Stage.class, r1);
    }

    public static Stage[] values() {
        return (Stage[]) $VALUES.clone();
    }

    public final int getStage() {
        return this.stage;
    }
}
