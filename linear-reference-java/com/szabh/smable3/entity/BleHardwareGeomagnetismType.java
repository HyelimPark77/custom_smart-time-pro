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
public final enum BleHardwareGeomagnetismType extends Enum<BleHardwareGeomagnetismType> implements BleHardwareType {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareGeomagnetismType[] $VALUES = null;
    public static final BleHardwareGeomagnetismType CD_GEOMAGNETISM_TYPE_AF8133J = null;
    public static final BleHardwareGeomagnetismType CD_GEOMAGNETISM_TYPE_MAX = null;
    public static final BleHardwareGeomagnetismType CD_GEOMAGNETISM_TYPE_MMC5603 = null;
    public static final BleHardwareGeomagnetismType CD_GEOMAGNETISM_TYPE_NONE = null;
    public static final BleHardwareGeomagnetismType CD_GEOMAGNETISM_TYPE_QMC6309 = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareGeomagnetismType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareGeomagnetismType of(int r6) {
            BleHardwareGeomagnetismType[] r0 = BleHardwareGeomagnetismType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareGeomagnetismType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareGeomagnetismType.CD_GEOMAGNETISM_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareGeomagnetismType[] $values() {
        return new BleHardwareGeomagnetismType[]{CD_GEOMAGNETISM_TYPE_NONE, CD_GEOMAGNETISM_TYPE_MMC5603, CD_GEOMAGNETISM_TYPE_AF8133J, CD_GEOMAGNETISM_TYPE_QMC6309, CD_GEOMAGNETISM_TYPE_MAX};
    }

    static {
        CD_GEOMAGNETISM_TYPE_NONE = new BleHardwareGeomagnetismType("CD_GEOMAGNETISM_TYPE_NONE", 0, 0);
        CD_GEOMAGNETISM_TYPE_MMC5603 = new BleHardwareGeomagnetismType("CD_GEOMAGNETISM_TYPE_MMC5603", 1, 1);
        CD_GEOMAGNETISM_TYPE_AF8133J = new BleHardwareGeomagnetismType("CD_GEOMAGNETISM_TYPE_AF8133J", 2, 2);
        CD_GEOMAGNETISM_TYPE_QMC6309 = new BleHardwareGeomagnetismType("CD_GEOMAGNETISM_TYPE_QMC6309", 3, 3);
        CD_GEOMAGNETISM_TYPE_MAX = new BleHardwareGeomagnetismType("CD_GEOMAGNETISM_TYPE_MAX", 4, 255);
        BleHardwareGeomagnetismType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareGeomagnetismType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareGeomagnetismType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareGeomagnetismType valueOf(String r1) {
        return (BleHardwareGeomagnetismType) Enum.valueOf(BleHardwareGeomagnetismType.class, r1);
    }

    public static BleHardwareGeomagnetismType[] values() {
        return (BleHardwareGeomagnetismType[]) $VALUES.clone();
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
