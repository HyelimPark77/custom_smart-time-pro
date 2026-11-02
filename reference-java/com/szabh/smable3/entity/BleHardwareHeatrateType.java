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
public enum BleHardwareHeatrateType implements BleHardwareType {
    CD_HEART_RATE_TYPE_NONE(0),
    CD_HEART_RATE_TYPE_FAKE(1),
    CD_HEART_RATE_TYPE_BD1662(2),
    CD_HEART_RATE_TYPE_BD1688(3),
    CD_HEART_RATE_TYPE_SC7R31(4),
    CD_HEART_RATE_TYPE_PAH8007(5),
    CD_HEART_RATE_TYPE_TY3300(6),
    CD_HEART_RATE_TYPE_TY3602(7),
    CD_HEART_RATE_TYPE_TY3603(8),
    CD_HEART_RATE_TYPE_TY3605(9),
    CD_HEART_RATE_TYPE_LC09A(10),
    CD_HEART_RATE_TYPE_LC11S(11),
    CD_HEART_RATE_TYPE_VC32S(12),
    CD_HEART_RATE_TYPE_VC30F(13),
    CD_HEART_RATE_TYPE_VC9202(14),
    CD_HEART_RATE_TYPE_VC30F_SC(15),
    CD_HEART_RATE_TYPE_MAX(255);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareHeatrateType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final BleHardwareHeatrateType m38994of(int i) {
            for (BleHardwareHeatrateType bleHardwareHeatrateType : BleHardwareHeatrateType.values()) {
                if (bleHardwareHeatrateType.getType() == i) {
                    if (bleHardwareHeatrateType == null) {
                        return BleHardwareHeatrateType.CD_HEART_RATE_TYPE_NONE;
                    }
                    return bleHardwareHeatrateType;
                }
            }
            bleHardwareHeatrateType = null;
            if (bleHardwareHeatrateType == null) {
                return BleHardwareHeatrateType.CD_HEART_RATE_TYPE_NONE;
            }
            return bleHardwareHeatrateType;
        }

        private Companion() {
        }
    }

    BleHardwareHeatrateType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<BleHardwareHeatrateType> getEntries() {
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
