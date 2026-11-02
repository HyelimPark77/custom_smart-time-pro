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
public final enum BleHardwareLCDType extends Enum<BleHardwareLCDType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareLCDType[] $VALUES = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_AXS15231 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_C05300 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_CH13613 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ER76288A = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_GC9307 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_GC9A01 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_GC9B71 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_GC9C01 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ILI8688F = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_JD5858 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_MAX = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NA3311 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NONE = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NV3002 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NV3002B = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NV3029S = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NV3030B = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_NV3310 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_RM69092 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_RM690C = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_RM69330 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_SH8501 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_SH8601A = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_SPD2012 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST7388 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST7789 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST7789V = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST7789W3 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST77903 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST77916 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST9851 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_ST9853 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_WEA2012 = null;
    public static final BleHardwareLCDType CD_LCD_TYPE_XM80240G = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareLCDType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareLCDType of(int r6) {
            BleHardwareLCDType[] r0 = BleHardwareLCDType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareLCDType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareLCDType.CD_LCD_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareLCDType[] $values() {
        return new BleHardwareLCDType[]{CD_LCD_TYPE_NONE, CD_LCD_TYPE_AXS15231, CD_LCD_TYPE_CH13613, CD_LCD_TYPE_ER76288A, CD_LCD_TYPE_NA3311, CD_LCD_TYPE_RM690C, CD_LCD_TYPE_RM69092, CD_LCD_TYPE_SH8501, CD_LCD_TYPE_SPD2012, CD_LCD_TYPE_ST7388, CD_LCD_TYPE_ST77903, CD_LCD_TYPE_ST77916, CD_LCD_TYPE_C05300, CD_LCD_TYPE_ST9851, CD_LCD_TYPE_GC9A01, CD_LCD_TYPE_GC9B71, CD_LCD_TYPE_GC9C01, CD_LCD_TYPE_GC9307, CD_LCD_TYPE_ILI8688F, CD_LCD_TYPE_WEA2012, CD_LCD_TYPE_NV3002, CD_LCD_TYPE_NV3002B, CD_LCD_TYPE_NV3029S, CD_LCD_TYPE_NV3030B, CD_LCD_TYPE_NV3310, CD_LCD_TYPE_RM69330, CD_LCD_TYPE_SH8601A, CD_LCD_TYPE_ST7789, CD_LCD_TYPE_ST7789W3, CD_LCD_TYPE_ST7789V, CD_LCD_TYPE_XM80240G, CD_LCD_TYPE_JD5858, CD_LCD_TYPE_ST9853, CD_LCD_TYPE_MAX};
    }

    static {
        CD_LCD_TYPE_NONE = new BleHardwareLCDType("CD_LCD_TYPE_NONE", 0, 0);
        CD_LCD_TYPE_AXS15231 = new BleHardwareLCDType("CD_LCD_TYPE_AXS15231", 1, 1);
        CD_LCD_TYPE_CH13613 = new BleHardwareLCDType("CD_LCD_TYPE_CH13613", 2, 2);
        CD_LCD_TYPE_ER76288A = new BleHardwareLCDType("CD_LCD_TYPE_ER76288A", 3, 3);
        CD_LCD_TYPE_NA3311 = new BleHardwareLCDType("CD_LCD_TYPE_NA3311", 4, 4);
        CD_LCD_TYPE_RM690C = new BleHardwareLCDType("CD_LCD_TYPE_RM690C", 5, 5);
        CD_LCD_TYPE_RM69092 = new BleHardwareLCDType("CD_LCD_TYPE_RM69092", 6, 6);
        CD_LCD_TYPE_SH8501 = new BleHardwareLCDType("CD_LCD_TYPE_SH8501", 7, 7);
        CD_LCD_TYPE_SPD2012 = new BleHardwareLCDType("CD_LCD_TYPE_SPD2012", 8, 8);
        CD_LCD_TYPE_ST7388 = new BleHardwareLCDType("CD_LCD_TYPE_ST7388", 9, 9);
        CD_LCD_TYPE_ST77903 = new BleHardwareLCDType("CD_LCD_TYPE_ST77903", 10, 10);
        CD_LCD_TYPE_ST77916 = new BleHardwareLCDType("CD_LCD_TYPE_ST77916", 11, 11);
        CD_LCD_TYPE_C05300 = new BleHardwareLCDType("CD_LCD_TYPE_C05300", 12, 12);
        CD_LCD_TYPE_ST9851 = new BleHardwareLCDType("CD_LCD_TYPE_ST9851", 13, 13);
        CD_LCD_TYPE_GC9A01 = new BleHardwareLCDType("CD_LCD_TYPE_GC9A01", 14, 14);
        CD_LCD_TYPE_GC9B71 = new BleHardwareLCDType("CD_LCD_TYPE_GC9B71", 15, 15);
        CD_LCD_TYPE_GC9C01 = new BleHardwareLCDType("CD_LCD_TYPE_GC9C01", 16, 16);
        CD_LCD_TYPE_GC9307 = new BleHardwareLCDType("CD_LCD_TYPE_GC9307", 17, 17);
        CD_LCD_TYPE_ILI8688F = new BleHardwareLCDType("CD_LCD_TYPE_ILI8688F", 18, 18);
        CD_LCD_TYPE_WEA2012 = new BleHardwareLCDType("CD_LCD_TYPE_WEA2012", 19, 19);
        CD_LCD_TYPE_NV3002 = new BleHardwareLCDType("CD_LCD_TYPE_NV3002", 20, 20);
        CD_LCD_TYPE_NV3002B = new BleHardwareLCDType("CD_LCD_TYPE_NV3002B", 21, 21);
        CD_LCD_TYPE_NV3029S = new BleHardwareLCDType("CD_LCD_TYPE_NV3029S", 22, 22);
        CD_LCD_TYPE_NV3030B = new BleHardwareLCDType("CD_LCD_TYPE_NV3030B", 23, 23);
        CD_LCD_TYPE_NV3310 = new BleHardwareLCDType("CD_LCD_TYPE_NV3310", 24, 24);
        CD_LCD_TYPE_RM69330 = new BleHardwareLCDType("CD_LCD_TYPE_RM69330", 25, 25);
        CD_LCD_TYPE_SH8601A = new BleHardwareLCDType("CD_LCD_TYPE_SH8601A", 26, 26);
        CD_LCD_TYPE_ST7789 = new BleHardwareLCDType("CD_LCD_TYPE_ST7789", 27, 27);
        CD_LCD_TYPE_ST7789W3 = new BleHardwareLCDType("CD_LCD_TYPE_ST7789W3", 28, 28);
        CD_LCD_TYPE_ST7789V = new BleHardwareLCDType("CD_LCD_TYPE_ST7789V", 29, 29);
        CD_LCD_TYPE_XM80240G = new BleHardwareLCDType("CD_LCD_TYPE_XM80240G", 30, 30);
        CD_LCD_TYPE_JD5858 = new BleHardwareLCDType("CD_LCD_TYPE_JD5858", 31, 31);
        CD_LCD_TYPE_ST9853 = new BleHardwareLCDType("CD_LCD_TYPE_ST9853", 32, 32);
        CD_LCD_TYPE_MAX = new BleHardwareLCDType("CD_LCD_TYPE_MAX", 33, 255);
        BleHardwareLCDType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareLCDType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareLCDType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareLCDType valueOf(String r1) {
        return (BleHardwareLCDType) Enum.valueOf(BleHardwareLCDType.class, r1);
    }

    public static BleHardwareLCDType[] values() {
        return (BleHardwareLCDType[]) $VALUES.clone();
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
