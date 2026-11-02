package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.entity.BleIPCInfo;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleIPCInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCInfo\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,281:1\n222#2,4:282\n222#2,4:286\n*S KotlinDebug\n*F\n+ 1 BleIPCInfo.kt\ncom/szabh/smable3/entity/BleIPCInfo\n*L\n27#1:282,4\n30#1:286,4\n*E\n"})
public final class BleIPCInfo extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BleIPCInfo copy$default(BleIPCInfo bleIPCInfo, BleIPCICInfo bleIPCICInfo, BleIPCSupport bleIPCSupport, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bleIPCICInfo = bleIPCInfo.mIPCICInfo;
        }
        if ((i & 2) != 0) {
            bleIPCSupport = bleIPCInfo.mIPCSupport;
        }
        if ((i & 4) != 0) {
            str = bleIPCInfo.mWifiMac;
        }
        if ((i & 8) != 0) {
            str2 = bleIPCInfo.mIsvName;
        }
        if ((i & 16) != 0) {
            str3 = bleIPCInfo.mDeviceModel;
        }
        if ((i & 32) != 0) {
            str4 = bleIPCInfo.mDeviceSN;
        }
        String str5 = str3;
        String str6 = str4;
        return bleIPCInfo.copy(bleIPCICInfo, bleIPCSupport, str, str2, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence decode$lambda$0(byte b) {
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
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
    public final BleIPCInfo copy(@aa1 BleIPCICInfo mIPCICInfo, @aa1 BleIPCSupport mIPCSupport, @aa1 String mWifiMac, @aa1 String mIsvName, @aa1 String mDeviceModel, @aa1 String mDeviceSN) {
        Intrinsics.X0O(mIPCICInfo, "mIPCICInfo");
        Intrinsics.X0O(mIPCSupport, "mIPCSupport");
        Intrinsics.X0O(mWifiMac, "mWifiMac");
        Intrinsics.X0O(mIsvName, "mIsvName");
        Intrinsics.X0O(mDeviceModel, "mDeviceModel");
        Intrinsics.X0O(mDeviceSN, "mDeviceSN");
        return new BleIPCInfo(mIPCICInfo, mIPCSupport, mWifiMac, mIsvName, mDeviceModel, mDeviceSN);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        do {
            char uInt9 = readUInt8();
            switch (uInt8) {
                case 1:
                    BleReadable bleReadable = (BleReadable) BleIPCICInfo.class.newInstance();
                    bleReadable.setMBytes(readBytes(uInt9));
                    bleReadable.decode();
                    Intrinsics.XXI(bleReadable);
                    this.mIPCICInfo = (BleIPCICInfo) bleReadable;
                    break;
                case 2:
                    BleReadable bleReadable2 = (BleReadable) BleIPCSupport.class.newInstance();
                    bleReadable2.setMBytes(readBytes(uInt9));
                    bleReadable2.decode();
                    Intrinsics.XXI(bleReadable2);
                    this.mIPCSupport = (BleIPCSupport) bleReadable2;
                    break;
                case 3:
                    this.mWifiMac = ArraysKt___ArraysKt.i0I(readBytes(uInt9), CertificateUtil.DELIMITER, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOIX1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return BleIPCInfo.decode$lambda$0(((Byte) obj).byteValue());
                        }
                    }, 30, null);
                    break;
                case 4:
                    this.mIsvName = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 5:
                    this.mDeviceModel = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 6:
                    this.mDeviceSN = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                default:
                    readBytes(uInt9);
                    break;
            }
            uInt8 = readUInt8();
        } while (uInt8 > 0);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCInfo)) {
            return false;
        }
        BleIPCInfo bleIPCInfo = (BleIPCInfo) obj;
        return Intrinsics.XOO0ii0(this.mIPCICInfo, bleIPCInfo.mIPCICInfo) && Intrinsics.XOO0ii0(this.mIPCSupport, bleIPCInfo.mIPCSupport) && Intrinsics.XOO0ii0(this.mWifiMac, bleIPCInfo.mWifiMac) && Intrinsics.XOO0ii0(this.mIsvName, bleIPCInfo.mIsvName) && Intrinsics.XOO0ii0(this.mDeviceModel, bleIPCInfo.mDeviceModel) && Intrinsics.XOO0ii0(this.mDeviceSN, bleIPCInfo.mDeviceSN);
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

    public final void setMDeviceModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDeviceModel = str;
    }

    public final void setMDeviceSN(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDeviceSN = str;
    }

    public final void setMIPCICInfo(@aa1 BleIPCICInfo bleIPCICInfo) {
        Intrinsics.X0O(bleIPCICInfo, "<set-?>");
        this.mIPCICInfo = bleIPCICInfo;
    }

    public final void setMIPCSupport(@aa1 BleIPCSupport bleIPCSupport) {
        Intrinsics.X0O(bleIPCSupport, "<set-?>");
        this.mIPCSupport = bleIPCSupport;
    }

    public final void setMIsvName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mIsvName = str;
    }

    public final void setMWifiMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiMac = str;
    }

    @aa1
    public String toString() {
        return "BleIPCInfo(mIPCICInfo=" + this.mIPCICInfo + ", mIPCSupport=" + this.mIPCSupport + ", mWifiMac=" + this.mWifiMac + ", mIsvName=" + this.mIsvName + ", mDeviceModel=" + this.mDeviceModel + ", mDeviceSN=" + this.mDeviceSN + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCInfo(@aa1 BleIPCICInfo mIPCICInfo, @aa1 BleIPCSupport mIPCSupport, @aa1 String mWifiMac, @aa1 String mIsvName, @aa1 String mDeviceModel, @aa1 String mDeviceSN) {
        Intrinsics.X0O(mIPCICInfo, "mIPCICInfo");
        Intrinsics.X0O(mIPCSupport, "mIPCSupport");
        Intrinsics.X0O(mWifiMac, "mWifiMac");
        Intrinsics.X0O(mIsvName, "mIsvName");
        Intrinsics.X0O(mDeviceModel, "mDeviceModel");
        Intrinsics.X0O(mDeviceSN, "mDeviceSN");
        this.mIPCICInfo = mIPCICInfo;
        this.mIPCSupport = mIPCSupport;
        this.mWifiMac = mWifiMac;
        this.mIsvName = mIsvName;
        this.mDeviceModel = mDeviceModel;
        this.mDeviceSN = mDeviceSN;
    }

    public /* synthetic */ BleIPCInfo(BleIPCICInfo bleIPCICInfo, BleIPCSupport bleIPCSupport, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BleIPCICInfo(0, 0, 0, 0, 0, 0, 0, 127, null) : bleIPCICInfo, (i & 2) != 0 ? new BleIPCSupport(0, 0, null, 0, 0, 0, null, 0, 0, null, 1023, null) : bleIPCSupport, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}
