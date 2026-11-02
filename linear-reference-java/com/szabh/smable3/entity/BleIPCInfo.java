package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.XOIX1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCInfo\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,281:1\n222#2,4:282\n222#2,4:286\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCInfo\n*L\n27#1:282,4\n30#1:286,4\n*E\n"})
public final class BleIPCInfo extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_DEVICE_MODEL = 5;
    public static final int TYPE_DEVICE_SN = 6;
    public static final int TYPE_IPC_IC_INFO = 1;
    public static final int TYPE_ISV_NAME = 4;
    public static final int TYPE_SUPPORT = 2;
    public static final int TYPE_WIFI_MAC = 3;

    @aa1
    private String mDeviceModel;

    @aa1
    private String mDeviceSN;

    @aa1
    private BleIPCICInfo mIPCICInfo;

    @aa1
    private BleIPCSupport mIPCSupport;

    @aa1
    private String mIsvName;

    @aa1
    private String mWifiMac;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCInfo() {
        BleIPCICInfo r1 = null;
        BleIPCSupport r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return decode$lambda$0(r0);
    }

    public static /* synthetic */ BleIPCInfo copy$default(BleIPCInfo r0, BleIPCICInfo r1, BleIPCSupport r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mIPCICInfo;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mIPCSupport;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mWifiMac;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mIsvName;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mDeviceModel;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mDeviceSN;
    L20:
        String r9 = r5;
        String r10 = r6;
        String r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    private static final CharSequence decode$lambda$0(byte r1) {
        String r2 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    }

    @aa1
    public final BleIPCICInfo component1() {
        return this.mIPCICInfo;
    }

    @aa1
    public final BleIPCSupport component2() {
        return this.mIPCSupport;
    }

    @aa1
    public final String component3() {
        return this.mWifiMac;
    }

    @aa1
    public final String component4() {
        return this.mIsvName;
    }

    @aa1
    public final String component5() {
        return this.mDeviceModel;
    }

    @aa1
    public final String component6() {
        return this.mDeviceSN;
    }

    @aa1
    public final BleIPCInfo copy(@aa1 BleIPCICInfo r9, @aa1 BleIPCSupport r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r9, "mIPCICInfo");
        Intrinsics.X0O(r10, "mIPCSupport");
        Intrinsics.X0O(r11, "mWifiMac");
        Intrinsics.X0O(r12, "mIsvName");
        Intrinsics.X0O(r13, "mDeviceModel");
        Intrinsics.X0O(r14, "mDeviceSN");
        return new BleIPCInfo(r9, r10, r11, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
    L3:
        char r1 = readUInt8();
        switch(r0) {
            case 1: goto L11;
            case 2: goto L10;
            case 3: goto L9;
            case 4: goto L8;
            case 5: goto L7;
            case 6: goto L6;
            default: goto L5;
        };
    L5:
        readBytes(r1);
    L12:
        r0 = readUInt8();
        if (r0 > 0) goto L3;
        return;
    L6:
        this.mDeviceSN = BleReadable.readString$default(this, r1, null, 2, null);
        goto L12
    L7:
        this.mDeviceModel = BleReadable.readString$default(this, r1, null, 2, null);
        goto L12
    L8:
        this.mIsvName = BleReadable.readString$default(this, r1, null, 2, null);
        goto L12
    L9:
        this.mWifiMac = ArraysKt___ArraysKt.i0I(readBytes(r1), CertificateUtil.DELIMITER, null, null, 0, null, new XOIX1(), 30, null);
        goto L12
    L10:
        BleReadable r2 = (BleReadable) BleIPCSupport.class.newInstance();
        r2.setMBytes(readBytes(r1));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mIPCSupport = (BleIPCSupport) r2;
        goto L12
    L11:
        BleReadable r3 = (BleReadable) BleIPCICInfo.class.newInstance();
        r3.setMBytes(readBytes(r1));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mIPCICInfo = (BleIPCICInfo) r3;
        goto L12
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCInfo) == true) goto L8;
        return false;
    L8:
        BleIPCInfo r6 = (BleIPCInfo) r5;
        if (Intrinsics.XOO0ii0(this.mIPCICInfo, r6.mIPCICInfo) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mIPCSupport, r6.mIPCSupport) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWifiMac, r6.mWifiMac) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mIsvName, r6.mIsvName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mDeviceModel, r6.mDeviceModel) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mDeviceSN, r6.mDeviceSN) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final String getMDeviceModel() {
        return this.mDeviceModel;
    }

    @aa1
    public final String getMDeviceSN() {
        return this.mDeviceSN;
    }

    @aa1
    public final BleIPCICInfo getMIPCICInfo() {
        return this.mIPCICInfo;
    }

    @aa1
    public final BleIPCSupport getMIPCSupport() {
        return this.mIPCSupport;
    }

    @aa1
    public final String getMIsvName() {
        return this.mIsvName;
    }

    @aa1
    public final String getMWifiMac() {
        return this.mWifiMac;
    }

    public int hashCode() {
        return (((((((((this.mIPCICInfo.hashCode() * 31) + this.mIPCSupport.hashCode()) * 31) + this.mWifiMac.hashCode()) * 31) + this.mIsvName.hashCode()) * 31) + this.mDeviceModel.hashCode()) * 31) + this.mDeviceSN.hashCode();
    }

    public final void setMDeviceModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeviceModel = r2;
    }

    public final void setMDeviceSN(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeviceSN = r2;
    }

    public final void setMIPCICInfo(@aa1 BleIPCICInfo r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIPCICInfo = r2;
    }

    public final void setMIPCSupport(@aa1 BleIPCSupport r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIPCSupport = r2;
    }

    public final void setMIsvName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIsvName = r2;
    }

    public final void setMWifiMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiMac = r2;
    }

    @aa1
    public String toString() {
        return "BleIPCInfo(mIPCICInfo=" + this.mIPCICInfo + ", mIPCSupport=" + this.mIPCSupport + ", mWifiMac=" + this.mWifiMac + ", mIsvName=" + this.mIsvName + ", mDeviceModel=" + this.mDeviceModel + ", mDeviceSN=" + this.mDeviceSN + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCInfo(@aa1 BleIPCICInfo r2, @aa1 BleIPCSupport r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r2, "mIPCICInfo");
        Intrinsics.X0O(r3, "mIPCSupport");
        Intrinsics.X0O(r4, "mWifiMac");
        Intrinsics.X0O(r5, "mIsvName");
        Intrinsics.X0O(r6, "mDeviceModel");
        Intrinsics.X0O(r7, "mDeviceSN");
        this.mIPCICInfo = r2;
        this.mIPCSupport = r3;
        this.mWifiMac = r4;
        this.mIsvName = r5;
        this.mDeviceModel = r6;
        this.mDeviceSN = r7;
    }

    public /* synthetic */ BleIPCInfo(BleIPCICInfo r16, BleIPCSupport r17, String r18, String r19, String r20, String r21, int r22, DefaultConstructorMarker r23) {
        if ((r22 & 1) == 0) goto L5;
        BleIPCICInfo r1 = new BleIPCICInfo(0, 0, 0, 0, 0, 0, 0, 127, null);
    L7:
        if ((r22 & 2) == 0) goto L9;
        BleIPCSupport r2 = new BleIPCSupport(0, 0, null, 0, 0, 0, null, 0, 0, null, 1023, null);
    L11:
        if ((r22 & 4) == 0) goto L13;
        String r0 = "";
    L15:
        if ((r22 & 8) == 0) goto L17;
        String r4 = "";
    L19:
        if ((r22 & 16) == 0) goto L21;
        String r5 = "";
    L23:
        if ((r22 & 32) == 0) goto L26;
        String r24 = "";
    L27:
        this(r1, r2, r0, r4, r5, r24);
        return;
    L26:
        r24 = r21;
        goto L27
    L21:
        r5 = r20;
        goto L23
    L17:
        r4 = r19;
        goto L19
    L13:
        r0 = r18;
        goto L15
    L9:
        r2 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
