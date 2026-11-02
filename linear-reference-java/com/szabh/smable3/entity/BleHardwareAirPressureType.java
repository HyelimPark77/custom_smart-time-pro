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
public final enum BleHardwareAirPressureType extends Enum<BleHardwareAirPressureType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareAirPressureType[] $VALUES = null;
    public static final BleHardwareAirPressureType CD_AIR_PRESSURE_TYPE_AIR3535R = null;
    public static final BleHardwareAirPressureType CD_AIR_PRESSURE_TYPE_BMP280 = null;
    public static final BleHardwareAirPressureType CD_AIR_PRESSURE_TYPE_MAX = null;
    public static final BleHardwareAirPressureType CD_AIR_PRESSURE_TYPE_NONE = null;
    public static final BleHardwareAirPressureType CD_AIR_PRESSURE_TYPE_SPL06 = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareAirPressureType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareAirPressureType of(int r6) {
            BleHardwareAirPressureType[] r0 = BleHardwareAirPressureType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareAirPressureType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareAirPressureType.CD_AIR_PRESSURE_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareAirPressureType[] $values() {
        return new BleHardwareAirPressureType[]{CD_AIR_PRESSURE_TYPE_NONE, CD_AIR_PRESSURE_TYPE_SPL06, CD_AIR_PRESSURE_TYPE_AIR3535R, CD_AIR_PRESSURE_TYPE_BMP280, CD_AIR_PRESSURE_TYPE_MAX};
    }

    static {
        CD_AIR_PRESSURE_TYPE_NONE = new BleHardwareAirPressureType("CD_AIR_PRESSURE_TYPE_NONE", 0, 0);
        CD_AIR_PRESSURE_TYPE_SPL06 = new BleHardwareAirPressureType("CD_AIR_PRESSURE_TYPE_SPL06", 1, 1);
        CD_AIR_PRESSURE_TYPE_AIR3535R = new BleHardwareAirPressureType("CD_AIR_PRESSURE_TYPE_AIR3535R", 2, 2);
        CD_AIR_PRESSURE_TYPE_BMP280 = new BleHardwareAirPressureType("CD_AIR_PRESSURE_TYPE_BMP280", 3, 3);
        CD_AIR_PRESSURE_TYPE_MAX = new BleHardwareAirPressureType("CD_AIR_PRESSURE_TYPE_MAX", 4, 255);
        BleHardwareAirPressureType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareAirPressureType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareAirPressureType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareAirPressureType valueOf(String r1) {
        return (BleHardwareAirPressureType) Enum.valueOf(BleHardwareAirPressureType.class, r1);
    }

    public static BleHardwareAirPressureType[] values() {
        return (BleHardwareAirPressureType[]) $VALUES.clone();
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
