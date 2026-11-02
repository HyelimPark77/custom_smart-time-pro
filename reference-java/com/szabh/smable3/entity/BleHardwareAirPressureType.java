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
public enum BleHardwareAirPressureType implements BleHardwareType {
    CD_AIR_PRESSURE_TYPE_NONE(0),
    CD_AIR_PRESSURE_TYPE_SPL06(1),
    CD_AIR_PRESSURE_TYPE_AIR3535R(2),
    CD_AIR_PRESSURE_TYPE_BMP280(3),
    CD_AIR_PRESSURE_TYPE_MAX(255);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareAirPressureType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final BleHardwareAirPressureType m38989of(int i) {
            for (BleHardwareAirPressureType bleHardwareAirPressureType : BleHardwareAirPressureType.values()) {
                if (bleHardwareAirPressureType.getType() == i) {
                    if (bleHardwareAirPressureType == null) {
                        return BleHardwareAirPressureType.CD_AIR_PRESSURE_TYPE_NONE;
                    }
                    return bleHardwareAirPressureType;
                }
            }
            bleHardwareAirPressureType = null;
            if (bleHardwareAirPressureType == null) {
                return BleHardwareAirPressureType.CD_AIR_PRESSURE_TYPE_NONE;
            }
            return bleHardwareAirPressureType;
        }

        private Companion() {
        }
    }

    BleHardwareAirPressureType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<BleHardwareAirPressureType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.type)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(name());
        return sb.toString();
    }
}
