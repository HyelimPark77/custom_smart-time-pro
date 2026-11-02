package com.bestmafen.androidbase.io;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public final enum Location extends Enum<Location> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ Location[] $VALUES = null;
    public static final Location EXTERNAL = null;
    public static final Location INTERNAL = null;
    public static final Location PUBLIC = null;

    private static final /* synthetic */ Location[] $values() {
        return new Location[]{INTERNAL, EXTERNAL, PUBLIC};
    }

    static {
        INTERNAL = new Location("INTERNAL", 0);
        EXTERNAL = new Location("EXTERNAL", 1);
        PUBLIC = new Location("PUBLIC", 2);
        Location[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private Location(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<Location> getEntries() {
        return $ENTRIES;
    }

    public static Location valueOf(String r1) {
        return (Location) Enum.valueOf(Location.class, r1);
    }

    public static Location[] values() {
        return (Location[]) $VALUES.clone();
    }
}
