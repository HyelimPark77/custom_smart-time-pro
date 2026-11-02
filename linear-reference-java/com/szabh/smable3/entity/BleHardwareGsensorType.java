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
public final enum BleHardwareGsensorType extends Enum<BleHardwareGsensorType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareGsensorType[] $VALUES = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_DA267 = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_KX022 = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_MAX = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_MSA310 = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_NONE = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_QMA6100 = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_SLW7A20 = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_SLW7A20E = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_SLW7A20H = null;
    public static final BleHardwareGsensorType CD_G_SENSOR_TYPE_STK8321 = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareGsensorType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareGsensorType of(int r6) {
            BleHardwareGsensorType[] r0 = BleHardwareGsensorType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareGsensorType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareGsensorType.CD_G_SENSOR_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareGsensorType[] $values() {
        return new BleHardwareGsensorType[]{CD_G_SENSOR_TYPE_NONE, CD_G_SENSOR_TYPE_STK8321, CD_G_SENSOR_TYPE_KX022, CD_G_SENSOR_TYPE_SLW7A20, CD_G_SENSOR_TYPE_SLW7A20E, CD_G_SENSOR_TYPE_SLW7A20H, CD_G_SENSOR_TYPE_MSA310, CD_G_SENSOR_TYPE_DA267, CD_G_SENSOR_TYPE_QMA6100, CD_G_SENSOR_TYPE_MAX};
    }

    static {
        CD_G_SENSOR_TYPE_NONE = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_NONE", 0, 0);
        CD_G_SENSOR_TYPE_STK8321 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_STK8321", 1, 1);
        CD_G_SENSOR_TYPE_KX022 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_KX022", 2, 2);
        CD_G_SENSOR_TYPE_SLW7A20 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_SLW7A20", 3, 3);
        CD_G_SENSOR_TYPE_SLW7A20E = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_SLW7A20E", 4, 4);
        CD_G_SENSOR_TYPE_SLW7A20H = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_SLW7A20H", 5, 5);
        CD_G_SENSOR_TYPE_MSA310 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_MSA310", 6, 6);
        CD_G_SENSOR_TYPE_DA267 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_DA267", 7, 7);
        CD_G_SENSOR_TYPE_QMA6100 = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_QMA6100", 8, 8);
        CD_G_SENSOR_TYPE_MAX = new BleHardwareGsensorType("CD_G_SENSOR_TYPE_MAX", 9, 255);
        BleHardwareGsensorType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareGsensorType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareGsensorType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareGsensorType valueOf(String r1) {
        return (BleHardwareGsensorType) Enum.valueOf(BleHardwareGsensorType.class, r1);
    }

    public static BleHardwareGsensorType[] values() {
        return (BleHardwareGsensorType[]) $VALUES.clone();
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
