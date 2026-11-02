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
public enum BleHardwareGeomagnetismType implements BleHardwareType {
    CD_GEOMAGNETISM_TYPE_NONE(0),
    CD_GEOMAGNETISM_TYPE_MMC5603(1),
    CD_GEOMAGNETISM_TYPE_AF8133J(2),
    CD_GEOMAGNETISM_TYPE_QMC6309(3),
    CD_GEOMAGNETISM_TYPE_MAX(255);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareGeomagnetismType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final BleHardwareGeomagnetismType m38992of(int i) {
            for (BleHardwareGeomagnetismType bleHardwareGeomagnetismType : BleHardwareGeomagnetismType.values()) {
                if (bleHardwareGeomagnetismType.getType() == i) {
                    if (bleHardwareGeomagnetismType == null) {
                        return BleHardwareGeomagnetismType.CD_GEOMAGNETISM_TYPE_NONE;
                    }
                    return bleHardwareGeomagnetismType;
                }
            }
            bleHardwareGeomagnetismType = null;
            if (bleHardwareGeomagnetismType == null) {
                return BleHardwareGeomagnetismType.CD_GEOMAGNETISM_TYPE_NONE;
            }
            return bleHardwareGeomagnetismType;
        }

        private Companion() {
        }
    }

    BleHardwareGeomagnetismType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<BleHardwareGeomagnetismType> getEntries() {
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
