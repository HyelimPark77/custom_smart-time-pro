package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final enum BleHardwareHeatrateType extends Enum<BleHardwareHeatrateType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareHeatrateType[] $VALUES = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_BD1662 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_BD1688 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_FAKE = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_LC09A = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_LC11S = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_MAX = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_NONE = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_PAH8007 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_SC7R31 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_TY3300 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_TY3602 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_TY3603 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_TY3605 = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_VC30F = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_VC30F_SC = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_VC32S = null;
    public static final BleHardwareHeatrateType CD_HEART_RATE_TYPE_VC9202 = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareHeatrateType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareHeatrateType of(int r6) {
            BleHardwareHeatrateType[] r0 = BleHardwareHeatrateType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareHeatrateType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareHeatrateType.CD_HEART_RATE_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareHeatrateType[] $values() {
        return new BleHardwareHeatrateType[]{CD_HEART_RATE_TYPE_NONE, CD_HEART_RATE_TYPE_FAKE, CD_HEART_RATE_TYPE_BD1662, CD_HEART_RATE_TYPE_BD1688, CD_HEART_RATE_TYPE_SC7R31, CD_HEART_RATE_TYPE_PAH8007, CD_HEART_RATE_TYPE_TY3300, CD_HEART_RATE_TYPE_TY3602, CD_HEART_RATE_TYPE_TY3603, CD_HEART_RATE_TYPE_TY3605, CD_HEART_RATE_TYPE_LC09A, CD_HEART_RATE_TYPE_LC11S, CD_HEART_RATE_TYPE_VC32S, CD_HEART_RATE_TYPE_VC30F, CD_HEART_RATE_TYPE_VC9202, CD_HEART_RATE_TYPE_VC30F_SC, CD_HEART_RATE_TYPE_MAX};
    }

    static {
        CD_HEART_RATE_TYPE_NONE = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_NONE", 0, 0);
        CD_HEART_RATE_TYPE_FAKE = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_FAKE", 1, 1);
        CD_HEART_RATE_TYPE_BD1662 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_BD1662", 2, 2);
        CD_HEART_RATE_TYPE_BD1688 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_BD1688", 3, 3);
        CD_HEART_RATE_TYPE_SC7R31 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_SC7R31", 4, 4);
        CD_HEART_RATE_TYPE_PAH8007 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_PAH8007", 5, 5);
        CD_HEART_RATE_TYPE_TY3300 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_TY3300", 6, 6);
        CD_HEART_RATE_TYPE_TY3602 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_TY3602", 7, 7);
        CD_HEART_RATE_TYPE_TY3603 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_TY3603", 8, 8);
        CD_HEART_RATE_TYPE_TY3605 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_TY3605", 9, 9);
        CD_HEART_RATE_TYPE_LC09A = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_LC09A", 10, 10);
        CD_HEART_RATE_TYPE_LC11S = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_LC11S", 11, 11);
        CD_HEART_RATE_TYPE_VC32S = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_VC32S", 12, 12);
        CD_HEART_RATE_TYPE_VC30F = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_VC30F", 13, 13);
        CD_HEART_RATE_TYPE_VC9202 = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_VC9202", 14, 14);
        CD_HEART_RATE_TYPE_VC30F_SC = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_VC30F_SC", 15, 15);
        CD_HEART_RATE_TYPE_MAX = new BleHardwareHeatrateType("CD_HEART_RATE_TYPE_MAX", 16, 255);
        BleHardwareHeatrateType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareHeatrateType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareHeatrateType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareHeatrateType valueOf(String r1) {
        return (BleHardwareHeatrateType) Enum.valueOf(BleHardwareHeatrateType.class, r1);
    }

    public static BleHardwareHeatrateType[] values() {
        return (BleHardwareHeatrateType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.type)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(name());
        return r0.toString();
    }
}
