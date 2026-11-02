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
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[BleHardwareDeviceType.values().length];
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_LCD.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L19:
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_HEARTRATE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L27:
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_G_SENSOR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L21:
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_GEOMAGNETISM.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L23:
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_TP.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L17:
            r0[BleHardwareDeviceType.CD_DEVICE_TYPE_AIR_PRESSURE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public BleHardwareDevice() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleHardwareDevice copy$default(BleHardwareDevice r0, int r1, int r2, int r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mLength;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mCurrent;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mCompatible;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleHardwareDevice copy(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mCompatible");
        return new BleHardwareDevice(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHardwareDevice) == true) goto L8;
        return false;
    L8:
        BleHardwareDevice r6 = (BleHardwareDevice) r5;
        if (this.mLength == r6.mLength) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (this.mCurrent == r6.mCurrent) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mCompatible, r6.mCompatible) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final BleHardwareType getHardwareType(int r2, int r3) {
        BleHardwareDeviceType r4 = BleHardwareDeviceType.Companion.of(r2);
        switch(WhenMappings.$EnumSwitchMapping$0[r4.ordinal()]) {
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L5;
        };
    L5:
        return BleHardwareLCDType.CD_LCD_TYPE_NONE;
    L7:
        return BleHardwareAirPressureType.Companion.of(r3);
    L9:
        return BleHardwareTPType.Companion.of(r3);
    L11:
        return BleHardwareGeomagnetismType.Companion.of(r3);
    L13:
        return BleHardwareGsensorType.Companion.of(r3);
    L15:
        return BleHardwareHeatrateType.Companion.of(r3);
    L17:
        return BleHardwareLCDType.Companion.of(r3);
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

    public final void setMCompatible(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCompatible = r2;
    }

    public final void setMCurrent(int r1) {
        this.mCurrent = r1;
    }

    public final void setMLength(int r1) {
        this.mLength = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleHardwareDevice(\nmLength=");
        r0.append(this.mLength);
        r0.append(", \nmType=");
        r0.append(BleHardwareDeviceType.Companion.of(this.mType));
        r0.append(", \nmCurrent=");
        r0.append(getHardwareType(this.mType, this.mCurrent));
        r0.append(", \nmCompatible=");
        byte[] r1 = this.mCompatible;
        ArrayList r2 = new ArrayList(r1.length);
        int r3 = r1.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        byte r5 = r1[r4];
        r2.add(getHardwareType(this.mType, r5));
        r4 = r4 + 1;
        goto L3
    L5:
        r0.append(r2);
        r0.append(")\n");
        return r0.toString();
    }

    public BleHardwareDevice(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mCompatible");
        this.mLength = r2;
        this.mType = r3;
        this.mCurrent = r4;
        this.mCompatible = r5;
    }

    public /* synthetic */ BleHardwareDevice(int r2, int r3, int r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = new byte[0];
    L14:
        this(r2, r3, r4, r5);
    }
}
