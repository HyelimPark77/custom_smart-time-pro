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
public enum BleHardwareTPType implements BleHardwareType {
    CD_TP_TYPE_NONE(0),
    CD_TP_TYPE_CST816(1),
    CD_TP_TYPE_FT6336G(2),
    CD_TP_TYPE_BL6133(3),
    CD_TP_TYPE_CHS5816(4),
    CD_TP_TYPE_SPD2010(5),
    CD_TP_TYPE_CHSC6X(6),
    CD_TP_TYPE_CF1133(7),
    CD_TP_TYPE_AXS5106L(8),
    CD_TP_TYPE_AXS1523(9),
    CD_TP_TYPE_CST92XX(10),
    CD_TP_TYPE_MAX(255);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareTPType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final BleHardwareTPType m38996of(int i) {
            for (BleHardwareTPType bleHardwareTPType : BleHardwareTPType.values()) {
                if (bleHardwareTPType.getType() == i) {
                    if (bleHardwareTPType == null) {
                        return BleHardwareTPType.CD_TP_TYPE_NONE;
                    }
                    return bleHardwareTPType;
                }
            }
            bleHardwareTPType = null;
            if (bleHardwareTPType == null) {
                return BleHardwareTPType.CD_TP_TYPE_NONE;
            }
            return bleHardwareTPType;
        }

        private Companion() {
        }
    }

    BleHardwareTPType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<BleHardwareTPType> getEntries() {
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
