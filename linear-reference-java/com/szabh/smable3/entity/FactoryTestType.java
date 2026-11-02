package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.constant.PermissionConstants;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final enum FactoryTestType extends Enum<FactoryTestType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ FactoryTestType[] $VALUES = null;
    public static final FactoryTestType AGEING = null;
    public static final FactoryTestType AIR_ALTITUDE_CALIBRATION = null;
    public static final FactoryTestType BATTERY_POWER = null;
    public static final FactoryTestType BIO_CALC = null;
    public static final FactoryTestType BLE_NAME = null;
    public static final FactoryTestType BOTTOM_CASE_NTC = null;
    public static final FactoryTestType CHECK_MAC = null;

    @aa1
    public static final Companion Companion = null;
    public static final FactoryTestType ENTER = null;
    public static final FactoryTestType EXIT = null;
    public static final FactoryTestType FIRMWARE_VERSION = null;
    public static final FactoryTestType FLASH = null;
    public static final FactoryTestType GOMORE_INFO = null;
    public static final FactoryTestType GSENSOR = null;
    public static final FactoryTestType HARDWARE = null;
    public static final FactoryTestType HARDWARE_ALIPAY = null;
    public static final FactoryTestType HARDWARE_INFO = null;
    public static final FactoryTestType HR_BIO = null;
    public static final FactoryTestType HR_LEAK = null;
    public static final FactoryTestType HR_PS = null;
    public static final FactoryTestType HR_VALUE = null;
    public static final FactoryTestType KEY = null;
    public static final FactoryTestType LIGHT_SENSITIVITY = null;
    public static final FactoryTestType LIGHT_SWITCH = null;
    public static final FactoryTestType MAGNETIC_SENSOR = null;
    public static final FactoryTestType MAP_AUTHORIZATION_QUERY = null;
    public static final FactoryTestType MICROPHONE = null;
    public static final FactoryTestType MOTOR = null;
    public static final FactoryTestType NONE = null;
    public static final FactoryTestType PRE_MADE_MAP_QUERY = null;
    public static final FactoryTestType QUIT = null;
    public static final FactoryTestType RESET_OFF_FLAG = null;
    public static final FactoryTestType RESULT = null;
    public static final FactoryTestType RSSI_RESULT = null;
    public static final FactoryTestType SAIWEI_INFO = null;
    public static final FactoryTestType SD = null;
    public static final FactoryTestType SPEAKER = null;
    public static final FactoryTestType STEWING = null;
    public static final FactoryTestType STEWING_RESULT = null;
    public static final FactoryTestType TEMPERATURE = null;
    public static final FactoryTestType TEST_FAILED = null;
    public static final FactoryTestType TEST_RESET = null;
    public static final FactoryTestType TP = null;
    public static final FactoryTestType TUYA_INFO = null;
    public static final FactoryTestType UI_VERSION = null;
    public static final FactoryTestType USB_TEST = null;
    public static final FactoryTestType VOLTAGE = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/FactoryTestType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final FactoryTestType of(int r6) {
            FactoryTestType[] r0 = FactoryTestType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            FactoryTestType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return FactoryTestType.NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FactoryTestType[] $values() {
        return new FactoryTestType[]{RESULT, FIRMWARE_VERSION, UI_VERSION, BATTERY_POWER, GSENSOR, TP, KEY, MOTOR, SPEAKER, MICROPHONE, HR_LEAK, HR_PS, HR_BIO, BIO_CALC, FLASH, SD, TEMPERATURE, MAGNETIC_SENSOR, TUYA_INFO, RSSI_RESULT, HARDWARE, BLE_NAME, GOMORE_INFO, HR_VALUE, HARDWARE_ALIPAY, AIR_ALTITUDE_CALIBRATION, VOLTAGE, LIGHT_SENSITIVITY, PRE_MADE_MAP_QUERY, MAP_AUTHORIZATION_QUERY, BOTTOM_CASE_NTC, USB_TEST, SAIWEI_INFO, ENTER, QUIT, AGEING, EXIT, TEST_FAILED, TEST_RESET, STEWING, STEWING_RESULT, HARDWARE_INFO, LIGHT_SWITCH, RESET_OFF_FLAG, CHECK_MAC, NONE};
    }

    static {
        RESULT = new FactoryTestType("RESULT", 0, 0);
        FIRMWARE_VERSION = new FactoryTestType("FIRMWARE_VERSION", 1, 1);
        UI_VERSION = new FactoryTestType("UI_VERSION", 2, 2);
        BATTERY_POWER = new FactoryTestType("BATTERY_POWER", 3, 3);
        GSENSOR = new FactoryTestType("GSENSOR", 4, 4);
        TP = new FactoryTestType("TP", 5, 5);
        KEY = new FactoryTestType("KEY", 6, 6);
        MOTOR = new FactoryTestType("MOTOR", 7, 7);
        SPEAKER = new FactoryTestType("SPEAKER", 8, 8);
        MICROPHONE = new FactoryTestType(PermissionConstants.MICROPHONE, 9, 9);
        HR_LEAK = new FactoryTestType("HR_LEAK", 10, 10);
        HR_PS = new FactoryTestType("HR_PS", 11, 11);
        HR_BIO = new FactoryTestType("HR_BIO", 12, 12);
        BIO_CALC = new FactoryTestType("BIO_CALC", 13, 13);
        FLASH = new FactoryTestType("FLASH", 14, 14);
        SD = new FactoryTestType("SD", 15, 15);
        TEMPERATURE = new FactoryTestType("TEMPERATURE", 16, 16);
        MAGNETIC_SENSOR = new FactoryTestType("MAGNETIC_SENSOR", 17, 17);
        TUYA_INFO = new FactoryTestType("TUYA_INFO", 18, 18);
        RSSI_RESULT = new FactoryTestType("RSSI_RESULT", 19, 19);
        HARDWARE = new FactoryTestType("HARDWARE", 20, 20);
        BLE_NAME = new FactoryTestType("BLE_NAME", 21, 21);
        GOMORE_INFO = new FactoryTestType("GOMORE_INFO", 22, 22);
        HR_VALUE = new FactoryTestType("HR_VALUE", 23, 23);
        HARDWARE_ALIPAY = new FactoryTestType("HARDWARE_ALIPAY", 24, 24);
        AIR_ALTITUDE_CALIBRATION = new FactoryTestType("AIR_ALTITUDE_CALIBRATION", 25, 25);
        VOLTAGE = new FactoryTestType("VOLTAGE", 26, 26);
        LIGHT_SENSITIVITY = new FactoryTestType("LIGHT_SENSITIVITY", 27, 30);
        PRE_MADE_MAP_QUERY = new FactoryTestType("PRE_MADE_MAP_QUERY", 28, 31);
        MAP_AUTHORIZATION_QUERY = new FactoryTestType("MAP_AUTHORIZATION_QUERY", 29, 32);
        BOTTOM_CASE_NTC = new FactoryTestType("BOTTOM_CASE_NTC", 30, 33);
        USB_TEST = new FactoryTestType("USB_TEST", 31, 34);
        SAIWEI_INFO = new FactoryTestType("SAIWEI_INFO", 32, 35);
        ENTER = new FactoryTestType("ENTER", 33, 128);
        QUIT = new FactoryTestType("QUIT", 34, 129);
        AGEING = new FactoryTestType("AGEING", 35, 130);
        EXIT = new FactoryTestType("EXIT", 36, 131);
        TEST_FAILED = new FactoryTestType("TEST_FAILED", 37, 132);
        TEST_RESET = new FactoryTestType("TEST_RESET", 38, 133);
        STEWING = new FactoryTestType("STEWING", 39, 134);
        STEWING_RESULT = new FactoryTestType("STEWING_RESULT", 40, 135);
        HARDWARE_INFO = new FactoryTestType("HARDWARE_INFO", 41, 136);
        LIGHT_SWITCH = new FactoryTestType("LIGHT_SWITCH", 42, 137);
        RESET_OFF_FLAG = new FactoryTestType("RESET_OFF_FLAG", 43, 144);
        CHECK_MAC = new FactoryTestType("CHECK_MAC", 44, 240);
        NONE = new FactoryTestType("NONE", 45, 65535);
        FactoryTestType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private FactoryTestType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<FactoryTestType> getEntries() {
        return $ENTRIES;
    }

    public static FactoryTestType valueOf(String r1) {
        return (FactoryTestType) Enum.valueOf(FactoryTestType.class, r1);
    }

    public static FactoryTestType[] values() {
        return (FactoryTestType[]) $VALUES.clone();
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
