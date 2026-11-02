package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,303:1\n11571#2:304\n11906#2,3:305\n*S KotlinDebug\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n*L\n58#1:304\n58#1:305,3\n*E\n"})
public final class BleHardwareDevice extends BleReadable {

    @aa1
    private byte[] mCompatible;
    private int mCurrent;
    private int mLength;
    private int mType;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BleHardwareDeviceType.values().length];
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_LCD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_HEARTRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_G_SENSOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_GEOMAGNETISM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_TP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleHardwareDeviceType.CD_DEVICE_TYPE_AIR_PRESSURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BleHardwareDevice() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ BleHardwareDevice copy$default(BleHardwareDevice bleHardwareDevice, int i, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleHardwareDevice.mLength;
        }
        if ((i4 & 2) != 0) {
            i2 = bleHardwareDevice.mType;
        }
        if ((i4 & 4) != 0) {
            i3 = bleHardwareDevice.mCurrent;
        }
        if ((i4 & 8) != 0) {
            bArr = bleHardwareDevice.mCompatible;
        }
        return bleHardwareDevice.copy(i, i2, i3, bArr);
    }

    public final int component1() {
        return this.mLength;
    }

    public final int component2() {
        return this.mType;
    }

    public final int component3() {
        return this.mCurrent;
    }

    @aa1
    public final byte[] component4() {
        return this.mCompatible;
    }

    @aa1
    public final BleHardwareDevice copy(int i, int i2, int i3, @aa1 byte[] mCompatible) {
        Intrinsics.X0O(mCompatible, "mCompatible");
        return new BleHardwareDevice(i, i2, i3, mCompatible);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHardwareDevice)) {
            return false;
        }
        BleHardwareDevice bleHardwareDevice = (BleHardwareDevice) obj;
        return this.mLength == bleHardwareDevice.mLength && this.mType == bleHardwareDevice.mType && this.mCurrent == bleHardwareDevice.mCurrent && Intrinsics.XOO0ii0(this.mCompatible, bleHardwareDevice.mCompatible);
    }

    @aa1
    public final BleHardwareType getHardwareType(int i, int i2) {
        switch (WhenMappings.$EnumSwitchMapping$0[BleHardwareDeviceType.Companion.m38990of(i).ordinal()]) {
            case 1:
                return BleHardwareLCDType.Companion.m38995of(i2);
            case 2:
                return BleHardwareHeatrateType.Companion.m38994of(i2);
            case 3:
                return BleHardwareGsensorType.Companion.m38993of(i2);
            case 4:
                return BleHardwareGeomagnetismType.Companion.m38992of(i2);
            case 5:
                return BleHardwareTPType.Companion.m38996of(i2);
            case 6:
                return BleHardwareAirPressureType.Companion.m38989of(i2);
            default:
                return BleHardwareLCDType.CD_LCD_TYPE_NONE;
        }
    }

    @aa1
    public final byte[] getMCompatible() {
        return this.mCompatible;
    }

    public final int getMCurrent() {
        return this.mCurrent;
    }

    public final int getMLength() {
        return this.mLength;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mLength) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCurrent)) * 31) + Arrays.hashCode(this.mCompatible);
    }

    public final void setMCompatible(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mCompatible = bArr;
    }

    public final void setMCurrent(int i) {
        this.mCurrent = i;
    }

    public final void setMLength(int i) {
        this.mLength = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleHardwareDevice(\nmLength=");
        sb.append(this.mLength);
        sb.append(", \nmType=");
        sb.append(BleHardwareDeviceType.Companion.m38990of(this.mType));
        sb.append(", \nmCurrent=");
        sb.append(getHardwareType(this.mType, this.mCurrent));
        sb.append(", \nmCompatible=");
        byte[] bArr = this.mCompatible;
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(getHardwareType(this.mType, b));
        }
        sb.append(arrayList);
        sb.append(")\n");
        return sb.toString();
    }

    public BleHardwareDevice(int i, int i2, int i3, @aa1 byte[] mCompatible) {
        Intrinsics.X0O(mCompatible, "mCompatible");
        this.mLength = i;
        this.mType = i2;
        this.mCurrent = i3;
        this.mCompatible = mCompatible;
    }

    public /* synthetic */ BleHardwareDevice(int i, int i2, int i3, byte[] bArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new byte[0] : bArr);
    }
}
