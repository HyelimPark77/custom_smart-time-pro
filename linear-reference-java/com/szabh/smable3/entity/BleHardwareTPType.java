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
public final enum BleHardwareTPType extends Enum<BleHardwareTPType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareTPType[] $VALUES = null;
    public static final BleHardwareTPType CD_TP_TYPE_AXS1523 = null;
    public static final BleHardwareTPType CD_TP_TYPE_AXS5106L = null;
    public static final BleHardwareTPType CD_TP_TYPE_BL6133 = null;
    public static final BleHardwareTPType CD_TP_TYPE_CF1133 = null;
    public static final BleHardwareTPType CD_TP_TYPE_CHS5816 = null;
    public static final BleHardwareTPType CD_TP_TYPE_CHSC6X = null;
    public static final BleHardwareTPType CD_TP_TYPE_CST816 = null;
    public static final BleHardwareTPType CD_TP_TYPE_CST92XX = null;
    public static final BleHardwareTPType CD_TP_TYPE_FT6336G = null;
    public static final BleHardwareTPType CD_TP_TYPE_MAX = null;
    public static final BleHardwareTPType CD_TP_TYPE_NONE = null;
    public static final BleHardwareTPType CD_TP_TYPE_SPD2010 = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareTPType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareTPType of(int r6) {
            BleHardwareTPType[] r0 = BleHardwareTPType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareTPType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareTPType.CD_TP_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareTPType[] $values() {
        return new BleHardwareTPType[]{CD_TP_TYPE_NONE, CD_TP_TYPE_CST816, CD_TP_TYPE_FT6336G, CD_TP_TYPE_BL6133, CD_TP_TYPE_CHS5816, CD_TP_TYPE_SPD2010, CD_TP_TYPE_CHSC6X, CD_TP_TYPE_CF1133, CD_TP_TYPE_AXS5106L, CD_TP_TYPE_AXS1523, CD_TP_TYPE_CST92XX, CD_TP_TYPE_MAX};
    }

    static {
        CD_TP_TYPE_NONE = new BleHardwareTPType("CD_TP_TYPE_NONE", 0, 0);
        CD_TP_TYPE_CST816 = new BleHardwareTPType("CD_TP_TYPE_CST816", 1, 1);
        CD_TP_TYPE_FT6336G = new BleHardwareTPType("CD_TP_TYPE_FT6336G", 2, 2);
        CD_TP_TYPE_BL6133 = new BleHardwareTPType("CD_TP_TYPE_BL6133", 3, 3);
        CD_TP_TYPE_CHS5816 = new BleHardwareTPType("CD_TP_TYPE_CHS5816", 4, 4);
        CD_TP_TYPE_SPD2010 = new BleHardwareTPType("CD_TP_TYPE_SPD2010", 5, 5);
        CD_TP_TYPE_CHSC6X = new BleHardwareTPType("CD_TP_TYPE_CHSC6X", 6, 6);
        CD_TP_TYPE_CF1133 = new BleHardwareTPType("CD_TP_TYPE_CF1133", 7, 7);
        CD_TP_TYPE_AXS5106L = new BleHardwareTPType("CD_TP_TYPE_AXS5106L", 8, 8);
        CD_TP_TYPE_AXS1523 = new BleHardwareTPType("CD_TP_TYPE_AXS1523", 9, 9);
        CD_TP_TYPE_CST92XX = new BleHardwareTPType("CD_TP_TYPE_CST92XX", 10, 10);
        CD_TP_TYPE_MAX = new BleHardwareTPType("CD_TP_TYPE_MAX", 11, 255);
        BleHardwareTPType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareTPType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareTPType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareTPType valueOf(String r1) {
        return (BleHardwareTPType) Enum.valueOf(BleHardwareTPType.class, r1);
    }

    public static BleHardwareTPType[] values() {
        return (BleHardwareTPType[]) $VALUES.clone();
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
