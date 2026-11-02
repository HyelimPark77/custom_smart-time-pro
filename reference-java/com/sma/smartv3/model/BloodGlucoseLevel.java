package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public enum BloodGlucoseLevel {
    UNKNOWN(0.0f),
    START(3.4f),
    NORMAL(6.1f),
    PREDIABETES(6.9f),
    DIABETES(8.1f);

    private final float mValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final BloodGlucoseLevel getBloodGlucoseLevel(float f) {
            BloodGlucoseLevel bloodGlucoseLevel = BloodGlucoseLevel.NORMAL;
            if (f < bloodGlucoseLevel.getMValue()) {
                return bloodGlucoseLevel;
            }
            BloodGlucoseLevel bloodGlucoseLevel2 = BloodGlucoseLevel.PREDIABETES;
            if (f <= bloodGlucoseLevel2.getMValue()) {
                return bloodGlucoseLevel2;
            }
            BloodGlucoseLevel bloodGlucoseLevel3 = BloodGlucoseLevel.DIABETES;
            return f > bloodGlucoseLevel3.getMValue() ? bloodGlucoseLevel3 : BloodGlucoseLevel.UNKNOWN;
        }

        private Companion() {
        }
    }

    BloodGlucoseLevel(float f) {
        this.mValue = f;
    }

    @aa1
    public static EnumEntries<BloodGlucoseLevel> getEntries() {
        return $ENTRIES;
    }

    public final float getMValue() {
        return this.mValue;
    }
}
