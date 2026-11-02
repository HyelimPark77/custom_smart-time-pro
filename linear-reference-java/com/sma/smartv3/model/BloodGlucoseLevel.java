package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final enum BloodGlucoseLevel extends Enum<BloodGlucoseLevel> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BloodGlucoseLevel[] $VALUES = null;

    @aa1
    public static final Companion Companion = null;
    public static final BloodGlucoseLevel DIABETES = null;
    public static final BloodGlucoseLevel NORMAL = null;
    public static final BloodGlucoseLevel PREDIABETES = null;
    public static final BloodGlucoseLevel START = null;
    public static final BloodGlucoseLevel UNKNOWN = null;
    private final float mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BloodGlucoseLevel getBloodGlucoseLevel(float r3) {
            BloodGlucoseLevel r0 = BloodGlucoseLevel.NORMAL;
            if (r3 >= r0.getMValue()) goto L5;
            return r0;
        L5:
            BloodGlucoseLevel r1 = BloodGlucoseLevel.PREDIABETES;
            if (r3 > r1.getMValue()) goto L8;
            return r1;
        L8:
            BloodGlucoseLevel r2 = BloodGlucoseLevel.DIABETES;
            if (r3 <= r2.getMValue()) goto L12;
            return r2;
        L12:
            return BloodGlucoseLevel.UNKNOWN;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BloodGlucoseLevel[] $values() {
        return new BloodGlucoseLevel[]{UNKNOWN, START, NORMAL, PREDIABETES, DIABETES};
    }

    static {
        UNKNOWN = new BloodGlucoseLevel("UNKNOWN", 0, 0.0f);
        START = new BloodGlucoseLevel("START", 1, 3.4f);
        NORMAL = new BloodGlucoseLevel("NORMAL", 2, 6.1f);
        PREDIABETES = new BloodGlucoseLevel("PREDIABETES", 3, 6.9f);
        DIABETES = new BloodGlucoseLevel("DIABETES", 4, 8.1f);
        BloodGlucoseLevel[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BloodGlucoseLevel(String r1, int r2, float r3) {
        super(r1, r2);
        this.mValue = r3;
    }

    @aa1
    public static EnumEntries<BloodGlucoseLevel> getEntries() {
        return $ENTRIES;
    }

    public static BloodGlucoseLevel valueOf(String r1) {
        return (BloodGlucoseLevel) Enum.valueOf(BloodGlucoseLevel.class, r1);
    }

    public static BloodGlucoseLevel[] values() {
        return (BloodGlucoseLevel[]) $VALUES.clone();
    }

    public final float getMValue() {
        return this.mValue;
    }
}
