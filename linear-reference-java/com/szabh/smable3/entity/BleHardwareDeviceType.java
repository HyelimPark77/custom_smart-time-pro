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
public final enum BleHardwareDeviceType extends Enum<BleHardwareDeviceType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleHardwareDeviceType[] $VALUES = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_AIR_PRESSURE = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_GEOMAGNETISM = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_GPS = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_G_SENSOR = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_HEARTRATE = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_LCD = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_MAX = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_NONE = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_TEMPERATURE = null;
    public static final BleHardwareDeviceType CD_DEVICE_TYPE_TP = null;

    @aa1
    public static final Companion Companion = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDeviceType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleHardwareDeviceType of(int r6) {
            BleHardwareDeviceType[] r0 = BleHardwareDeviceType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleHardwareDeviceType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleHardwareDeviceType.CD_DEVICE_TYPE_NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ BleHardwareDeviceType[] $values() {
        return new BleHardwareDeviceType[]{CD_DEVICE_TYPE_NONE, CD_DEVICE_TYPE_LCD, CD_DEVICE_TYPE_HEARTRATE, CD_DEVICE_TYPE_G_SENSOR, CD_DEVICE_TYPE_TP, CD_DEVICE_TYPE_GPS, CD_DEVICE_TYPE_GEOMAGNETISM, CD_DEVICE_TYPE_AIR_PRESSURE, CD_DEVICE_TYPE_TEMPERATURE, CD_DEVICE_TYPE_MAX};
    }

    static {
        CD_DEVICE_TYPE_NONE = new BleHardwareDeviceType("CD_DEVICE_TYPE_NONE", 0, 0);
        CD_DEVICE_TYPE_LCD = new BleHardwareDeviceType("CD_DEVICE_TYPE_LCD", 1, 1);
        CD_DEVICE_TYPE_HEARTRATE = new BleHardwareDeviceType("CD_DEVICE_TYPE_HEARTRATE", 2, 2);
        CD_DEVICE_TYPE_G_SENSOR = new BleHardwareDeviceType("CD_DEVICE_TYPE_G_SENSOR", 3, 3);
        CD_DEVICE_TYPE_TP = new BleHardwareDeviceType("CD_DEVICE_TYPE_TP", 4, 4);
        CD_DEVICE_TYPE_GPS = new BleHardwareDeviceType("CD_DEVICE_TYPE_GPS", 5, 5);
        CD_DEVICE_TYPE_GEOMAGNETISM = new BleHardwareDeviceType("CD_DEVICE_TYPE_GEOMAGNETISM", 6, 6);
        CD_DEVICE_TYPE_AIR_PRESSURE = new BleHardwareDeviceType("CD_DEVICE_TYPE_AIR_PRESSURE", 7, 7);
        CD_DEVICE_TYPE_TEMPERATURE = new BleHardwareDeviceType("CD_DEVICE_TYPE_TEMPERATURE", 8, 8);
        CD_DEVICE_TYPE_MAX = new BleHardwareDeviceType("CD_DEVICE_TYPE_MAX", 9, 255);
        BleHardwareDeviceType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private BleHardwareDeviceType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<BleHardwareDeviceType> getEntries() {
        return $ENTRIES;
    }

    public static BleHardwareDeviceType valueOf(String r1) {
        return (BleHardwareDeviceType) Enum.valueOf(BleHardwareDeviceType.class, r1);
    }

    public static BleHardwareDeviceType[] values() {
        return (BleHardwareDeviceType[]) $VALUES.clone();
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
