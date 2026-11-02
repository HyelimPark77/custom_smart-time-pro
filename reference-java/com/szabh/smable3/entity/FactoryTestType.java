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
public enum FactoryTestType {
    RESULT(0),
    FIRMWARE_VERSION(1),
    UI_VERSION(2),
    BATTERY_POWER(3),
    GSENSOR(4),
    TP(5),
    KEY(6),
    MOTOR(7),
    SPEAKER(8),
    MICROPHONE(9),
    HR_LEAK(10),
    HR_PS(11),
    HR_BIO(12),
    BIO_CALC(13),
    FLASH(14),
    SD(15),
    TEMPERATURE(16),
    MAGNETIC_SENSOR(17),
    TUYA_INFO(18),
    RSSI_RESULT(19),
    HARDWARE(20),
    BLE_NAME(21),
    GOMORE_INFO(22),
    HR_VALUE(23),
    HARDWARE_ALIPAY(24),
    AIR_ALTITUDE_CALIBRATION(25),
    VOLTAGE(26),
    LIGHT_SENSITIVITY(30),
    PRE_MADE_MAP_QUERY(31),
    MAP_AUTHORIZATION_QUERY(32),
    BOTTOM_CASE_NTC(33),
    USB_TEST(34),
    SAIWEI_INFO(35),
    ENTER(128),
    QUIT(129),
    AGEING(130),
    EXIT(131),
    TEST_FAILED(132),
    TEST_RESET(133),
    STEWING(134),
    STEWING_RESULT(135),
    HARDWARE_INFO(136),
    LIGHT_SWITCH(137),
    RESET_OFF_FLAG(144),
    CHECK_MAC(240),
    NONE(65535);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/FactoryTestType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final FactoryTestType m39004of(int i) {
            for (FactoryTestType factoryTestType : FactoryTestType.values()) {
                if (factoryTestType.getType() == i) {
                    if (factoryTestType == null) {
                        return FactoryTestType.NONE;
                    }
                    return factoryTestType;
                }
            }
            factoryTestType = null;
            if (factoryTestType == null) {
                return FactoryTestType.NONE;
            }
            return factoryTestType;
        }

        private Companion() {
        }
    }

    FactoryTestType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<FactoryTestType> getEntries() {
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
