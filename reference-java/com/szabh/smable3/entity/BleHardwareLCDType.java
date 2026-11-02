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
public enum BleHardwareLCDType implements BleHardwareType {
    CD_LCD_TYPE_NONE(0),
    CD_LCD_TYPE_AXS15231(1),
    CD_LCD_TYPE_CH13613(2),
    CD_LCD_TYPE_ER76288A(3),
    CD_LCD_TYPE_NA3311(4),
    CD_LCD_TYPE_RM690C(5),
    CD_LCD_TYPE_RM69092(6),
    CD_LCD_TYPE_SH8501(7),
    CD_LCD_TYPE_SPD2012(8),
    CD_LCD_TYPE_ST7388(9),
    CD_LCD_TYPE_ST77903(10),
    CD_LCD_TYPE_ST77916(11),
    CD_LCD_TYPE_C05300(12),
    CD_LCD_TYPE_ST9851(13),
    CD_LCD_TYPE_GC9A01(14),
    CD_LCD_TYPE_GC9B71(15),
    CD_LCD_TYPE_GC9C01(16),
    CD_LCD_TYPE_GC9307(17),
    CD_LCD_TYPE_ILI8688F(18),
    CD_LCD_TYPE_WEA2012(19),
    CD_LCD_TYPE_NV3002(20),
    CD_LCD_TYPE_NV3002B(21),
    CD_LCD_TYPE_NV3029S(22),
    CD_LCD_TYPE_NV3030B(23),
    CD_LCD_TYPE_NV3310(24),
    CD_LCD_TYPE_RM69330(25),
    CD_LCD_TYPE_SH8601A(26),
    CD_LCD_TYPE_ST7789(27),
    CD_LCD_TYPE_ST7789W3(28),
    CD_LCD_TYPE_ST7789V(29),
    CD_LCD_TYPE_XM80240G(30),
    CD_LCD_TYPE_JD5858(31),
    CD_LCD_TYPE_ST9853(32),
    CD_LCD_TYPE_MAX(255);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareLCDType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final BleHardwareLCDType m38995of(int i) {
            for (BleHardwareLCDType bleHardwareLCDType : BleHardwareLCDType.values()) {
                if (bleHardwareLCDType.getType() == i) {
                    if (bleHardwareLCDType == null) {
                        return BleHardwareLCDType.CD_LCD_TYPE_NONE;
                    }
                    return bleHardwareLCDType;
                }
            }
            bleHardwareLCDType = null;
            if (bleHardwareLCDType == null) {
                return BleHardwareLCDType.CD_LCD_TYPE_NONE;
            }
            return bleHardwareLCDType;
        }

        private Companion() {
        }
    }

    BleHardwareLCDType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<BleHardwareLCDType> getEntries() {
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
