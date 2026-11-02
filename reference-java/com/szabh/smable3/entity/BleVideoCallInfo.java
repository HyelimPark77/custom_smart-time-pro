package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.C2263bm;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVideoCallInfo extends BleWritable {
    public static final int COMMAND_SW = 0;
    public static final int COMMAND_WX = 1;
    public static final int COMMAND_WX_CALL = 2;
    public static final int COMMAND_WX_CALL_END = 3;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_COMMAND = 8;
    public static final int TYPE_LANGUAGE = 6;
    public static final int TYPE_SW_APP_ID = 3;
    public static final int TYPE_SW_CHANNEL = 4;
    public static final int TYPE_SW_TOKEN = 5;
    public static final int TYPE_TARGET_LANGUAGE = 7;
    public static final int TYPE_WIFI_NAME = 1;
    public static final int TYPE_WIFI_PASSWORD = 2;
    public static final int TYPE_WX_APP_ID = 13;
    public static final int TYPE_WX_DEVICE_NAME = 10;
    public static final int TYPE_WX_DEVICE_SECRET = 11;
    public static final int TYPE_WX_MODEL_ID = 12;
    public static final int TYPE_WX_PRODUCT_ID = 9;
    public static final int TYPE_WX_TARGET_OPEN_ID = 14;
    private int mCommand;

    @aa1
    private String mLanguage;

    @aa1
    private String mSWAppId;

    @aa1
    private String mSWChannelName;

    @aa1
    private String mSWToken;

    @aa1
    private String mTargetLanguage;

    @aa1
    private String mWifiName;

    @aa1
    private String mWifiPassword;

    @aa1
    private String mWxAppId;

    @aa1
    private String mWxDeviceName;

    @aa1
    private String mWxDeviceSecret;

    @aa1
    private String mWxModelId;

    @aa1
    private String mWxProductId;

    @aa1
    private String mWxTargetOpenId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleVideoCallInfo() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, C2263bm.OXO1, null);
    }

    public final int component1() {
        return this.mCommand;
    }

    @aa1
    public final String component10() {
        return this.mWxDeviceName;
    }

    @aa1
    public final String component11() {
        return this.mWxDeviceSecret;
    }

    @aa1
    public final String component12() {
        return this.mWxModelId;
    }

    @aa1
    public final String component13() {
        return this.mWxAppId;
    }

    @aa1
    public final String component14() {
        return this.mWxTargetOpenId;
    }

    @aa1
    public final String component2() {
        return this.mWifiName;
    }

    @aa1
    public final String component3() {
        return this.mWifiPassword;
    }

    @aa1
    public final String component4() {
        return this.mSWAppId;
    }

    @aa1
    public final String component5() {
        return this.mSWChannelName;
    }

    @aa1
    public final String component6() {
        return this.mSWToken;
    }

    @aa1
    public final String component7() {
        return this.mLanguage;
    }

    @aa1
    public final String component8() {
        return this.mTargetLanguage;
    }

    @aa1
    public final String component9() {
        return this.mWxProductId;
    }

    @aa1
    public final BleVideoCallInfo copy(int i, @aa1 String mWifiName, @aa1 String mWifiPassword, @aa1 String mSWAppId, @aa1 String mSWChannelName, @aa1 String mSWToken, @aa1 String mLanguage, @aa1 String mTargetLanguage, @aa1 String mWxProductId, @aa1 String mWxDeviceName, @aa1 String mWxDeviceSecret, @aa1 String mWxModelId, @aa1 String mWxAppId, @aa1 String mWxTargetOpenId) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        Intrinsics.X0O(mSWAppId, "mSWAppId");
        Intrinsics.X0O(mSWChannelName, "mSWChannelName");
        Intrinsics.X0O(mSWToken, "mSWToken");
        Intrinsics.X0O(mLanguage, "mLanguage");
        Intrinsics.X0O(mTargetLanguage, "mTargetLanguage");
        Intrinsics.X0O(mWxProductId, "mWxProductId");
        Intrinsics.X0O(mWxDeviceName, "mWxDeviceName");
        Intrinsics.X0O(mWxDeviceSecret, "mWxDeviceSecret");
        Intrinsics.X0O(mWxModelId, "mWxModelId");
        Intrinsics.X0O(mWxAppId, "mWxAppId");
        Intrinsics.X0O(mWxTargetOpenId, "mWxTargetOpenId");
        return new BleVideoCallInfo(i, mWifiName, mWifiPassword, mSWAppId, mSWChannelName, mSWToken, mLanguage, mTargetLanguage, mWxProductId, mWxDeviceName, mWxDeviceSecret, mWxModelId, mWxAppId, mWxTargetOpenId);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        do {
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            short int16 = readInt16(LITTLE_ENDIAN);
            switch (uInt8) {
                case 1:
                    this.mWifiName = readString(int16, Charsets.IiI10X);
                    break;
                case 2:
                    this.mWifiPassword = readString(int16, Charsets.IiI10X);
                    break;
                case 3:
                    this.mSWAppId = readString(int16, Charsets.IiI10X);
                    break;
                case 4:
                    this.mSWChannelName = readString(int16, Charsets.IiI10X);
                    break;
                case 5:
                    this.mSWToken = readString(int16, Charsets.IiI10X);
                    break;
                case 6:
                    this.mLanguage = readString(int16, Charsets.IiI10X);
                    break;
                case 7:
                    this.mTargetLanguage = readString(int16, Charsets.IiI10X);
                    break;
                case '\b':
                    this.mCommand = readUInt8();
                    break;
                case '\t':
                    this.mWxProductId = readString(int16, Charsets.IiI10X);
                    break;
                case '\n':
                    this.mWxDeviceName = readString(int16, Charsets.IiI10X);
                    break;
                case 11:
                    this.mWxDeviceSecret = readString(int16, Charsets.IiI10X);
                    break;
                case '\f':
                    this.mWxModelId = readString(int16, Charsets.IiI10X);
                    break;
                case '\r':
                    this.mWxAppId = readString(int16, Charsets.IiI10X);
                    break;
                case 14:
                    this.mWxTargetOpenId = readString(int16, Charsets.IiI10X);
                    break;
            }
            uInt8 = readUInt8();
        } while (uInt8 > 0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(8);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(1, LITTLE_ENDIAN);
        writeInt8(this.mCommand);
        if (this.mWifiName.length() > 0) {
            writeInt8(1);
            byte[] bytes = this.mWifiName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            int length = bytes.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length, LITTLE_ENDIAN);
            writeString(this.mWifiName, Charsets.IiI10X);
        }
        if (this.mWifiPassword.length() > 0) {
            writeInt8(2);
            byte[] bytes2 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            int length2 = bytes2.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length2, LITTLE_ENDIAN);
            writeString(this.mWifiPassword, Charsets.IiI10X);
        }
        if (this.mSWAppId.length() > 0) {
            writeInt8(3);
            byte[] bytes3 = this.mSWAppId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes3, "getBytes(...)");
            int length3 = bytes3.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length3, LITTLE_ENDIAN);
            writeString(this.mSWAppId, Charsets.IiI10X);
        }
        if (this.mSWChannelName.length() > 0) {
            writeInt8(4);
            byte[] bytes4 = this.mSWChannelName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes4, "getBytes(...)");
            int length4 = bytes4.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length4, LITTLE_ENDIAN);
            writeString(this.mSWChannelName, Charsets.IiI10X);
        }
        if (this.mSWToken.length() > 0) {
            writeInt8(5);
            byte[] bytes5 = this.mSWToken.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes5, "getBytes(...)");
            int length5 = bytes5.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length5, LITTLE_ENDIAN);
            writeString(this.mSWToken, Charsets.IiI10X);
        }
        if (this.mLanguage.length() > 0) {
            writeInt8(6);
            byte[] bytes6 = this.mLanguage.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes6, "getBytes(...)");
            int length6 = bytes6.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length6, LITTLE_ENDIAN);
            writeString(this.mLanguage, Charsets.IiI10X);
        }
        if (this.mTargetLanguage.length() > 0) {
            writeInt8(7);
            byte[] bytes7 = this.mTargetLanguage.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes7, "getBytes(...)");
            int length7 = bytes7.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length7, LITTLE_ENDIAN);
            writeString(this.mTargetLanguage, Charsets.IiI10X);
        }
        if (this.mWxProductId.length() > 0) {
            writeInt8(9);
            byte[] bytes8 = this.mWxProductId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes8, "getBytes(...)");
            int length8 = bytes8.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length8, LITTLE_ENDIAN);
            writeString(this.mWxProductId, Charsets.IiI10X);
        }
        if (this.mWxDeviceName.length() > 0) {
            writeInt8(10);
            byte[] bytes9 = this.mWxDeviceName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes9, "getBytes(...)");
            int length9 = bytes9.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length9, LITTLE_ENDIAN);
            writeString(this.mWxDeviceName, Charsets.IiI10X);
        }
        if (this.mWxDeviceSecret.length() > 0) {
            writeInt8(11);
            byte[] bytes10 = this.mWxDeviceSecret.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes10, "getBytes(...)");
            int length10 = bytes10.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length10, LITTLE_ENDIAN);
            writeString(this.mWxDeviceSecret, Charsets.IiI10X);
        }
        if (this.mWxModelId.length() > 0) {
            writeInt8(12);
            byte[] bytes11 = this.mWxModelId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes11, "getBytes(...)");
            int length11 = bytes11.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length11, LITTLE_ENDIAN);
            writeString(this.mWxModelId, Charsets.IiI10X);
        }
        if (this.mWxAppId.length() > 0) {
            writeInt8(13);
            byte[] bytes12 = this.mWxAppId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes12, "getBytes(...)");
            int length12 = bytes12.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length12, LITTLE_ENDIAN);
            writeString(this.mWxAppId, Charsets.IiI10X);
        }
        if (this.mWxTargetOpenId.length() > 0) {
            writeInt8(14);
            byte[] bytes13 = this.mWxTargetOpenId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes13, "getBytes(...)");
            int length13 = bytes13.length;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(length13, LITTLE_ENDIAN);
            writeString(this.mWxTargetOpenId, Charsets.IiI10X);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleVideoCallInfo)) {
            return false;
        }
        BleVideoCallInfo bleVideoCallInfo = (BleVideoCallInfo) obj;
        return this.mCommand == bleVideoCallInfo.mCommand && Intrinsics.XOO0ii0(this.mWifiName, bleVideoCallInfo.mWifiName) && Intrinsics.XOO0ii0(this.mWifiPassword, bleVideoCallInfo.mWifiPassword) && Intrinsics.XOO0ii0(this.mSWAppId, bleVideoCallInfo.mSWAppId) && Intrinsics.XOO0ii0(this.mSWChannelName, bleVideoCallInfo.mSWChannelName) && Intrinsics.XOO0ii0(this.mSWToken, bleVideoCallInfo.mSWToken) && Intrinsics.XOO0ii0(this.mLanguage, bleVideoCallInfo.mLanguage) && Intrinsics.XOO0ii0(this.mTargetLanguage, bleVideoCallInfo.mTargetLanguage) && Intrinsics.XOO0ii0(this.mWxProductId, bleVideoCallInfo.mWxProductId) && Intrinsics.XOO0ii0(this.mWxDeviceName, bleVideoCallInfo.mWxDeviceName) && Intrinsics.XOO0ii0(this.mWxDeviceSecret, bleVideoCallInfo.mWxDeviceSecret) && Intrinsics.XOO0ii0(this.mWxModelId, bleVideoCallInfo.mWxModelId) && Intrinsics.XOO0ii0(this.mWxAppId, bleVideoCallInfo.mWxAppId) && Intrinsics.XOO0ii0(this.mWxTargetOpenId, bleVideoCallInfo.mWxTargetOpenId);
    }

    public final int getMCommand() {
        return this.mCommand;
    }

    @aa1
    public final String getMLanguage() {
        return this.mLanguage;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        int length;
        if (this.mWifiName.length() > 0) {
            byte[] bytes = this.mWifiName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            length = 7 + bytes.length;
        } else {
            length = 4;
        }
        if (this.mWifiPassword.length() > 0) {
            byte[] bytes2 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            length = length + 3 + bytes2.length;
        }
        if (this.mSWAppId.length() > 0) {
            byte[] bytes3 = this.mSWAppId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes3, "getBytes(...)");
            length = length + 3 + bytes3.length;
        }
        if (this.mSWChannelName.length() > 0) {
            byte[] bytes4 = this.mSWChannelName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes4, "getBytes(...)");
            length = length + 3 + bytes4.length;
        }
        if (this.mSWToken.length() > 0) {
            byte[] bytes5 = this.mSWToken.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes5, "getBytes(...)");
            length = length + 3 + bytes5.length;
        }
        if (this.mLanguage.length() > 0) {
            byte[] bytes6 = this.mLanguage.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes6, "getBytes(...)");
            length = length + 3 + bytes6.length;
        }
        if (this.mTargetLanguage.length() > 0) {
            byte[] bytes7 = this.mTargetLanguage.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes7, "getBytes(...)");
            length = length + 3 + bytes7.length;
        }
        if (this.mWxProductId.length() > 0) {
            byte[] bytes8 = this.mWxProductId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes8, "getBytes(...)");
            length = length + 3 + bytes8.length;
        }
        if (this.mWxDeviceName.length() > 0) {
            byte[] bytes9 = this.mWxDeviceName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes9, "getBytes(...)");
            length = length + 3 + bytes9.length;
        }
        if (this.mWxDeviceSecret.length() > 0) {
            byte[] bytes10 = this.mWxDeviceSecret.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes10, "getBytes(...)");
            length = length + 3 + bytes10.length;
        }
        if (this.mWxModelId.length() > 0) {
            byte[] bytes11 = this.mWxModelId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes11, "getBytes(...)");
            length = length + 3 + bytes11.length;
        }
        if (this.mWxAppId.length() > 0) {
            byte[] bytes12 = this.mWxAppId.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes12, "getBytes(...)");
            length = length + 3 + bytes12.length;
        }
        if (this.mWxTargetOpenId.length() <= 0) {
            return length;
        }
        byte[] bytes13 = this.mWxTargetOpenId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes13, "getBytes(...)");
        return length + 3 + bytes13.length;
    }

    @aa1
    public final String getMSWAppId() {
        return this.mSWAppId;
    }

    @aa1
    public final String getMSWChannelName() {
        return this.mSWChannelName;
    }

    @aa1
    public final String getMSWToken() {
        return this.mSWToken;
    }

    @aa1
    public final String getMTargetLanguage() {
        return this.mTargetLanguage;
    }

    @aa1
    public final String getMWifiName() {
        return this.mWifiName;
    }

    @aa1
    public final String getMWifiPassword() {
        return this.mWifiPassword;
    }

    @aa1
    public final String getMWxAppId() {
        return this.mWxAppId;
    }

    @aa1
    public final String getMWxDeviceName() {
        return this.mWxDeviceName;
    }

    @aa1
    public final String getMWxDeviceSecret() {
        return this.mWxDeviceSecret;
    }

    @aa1
    public final String getMWxModelId() {
        return this.mWxModelId;
    }

    @aa1
    public final String getMWxProductId() {
        return this.mWxProductId;
    }

    @aa1
    public final String getMWxTargetOpenId() {
        return this.mWxTargetOpenId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.mCommand) * 31) + this.mWifiName.hashCode()) * 31) + this.mWifiPassword.hashCode()) * 31) + this.mSWAppId.hashCode()) * 31) + this.mSWChannelName.hashCode()) * 31) + this.mSWToken.hashCode()) * 31) + this.mLanguage.hashCode()) * 31) + this.mTargetLanguage.hashCode()) * 31) + this.mWxProductId.hashCode()) * 31) + this.mWxDeviceName.hashCode()) * 31) + this.mWxDeviceSecret.hashCode()) * 31) + this.mWxModelId.hashCode()) * 31) + this.mWxAppId.hashCode()) * 31) + this.mWxTargetOpenId.hashCode();
    }

    public final void setMCommand(int i) {
        this.mCommand = i;
    }

    public final void setMLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLanguage = str;
    }

    public final void setMSWAppId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSWAppId = str;
    }

    public final void setMSWChannelName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSWChannelName = str;
    }

    public final void setMSWToken(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSWToken = str;
    }

    public final void setMTargetLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTargetLanguage = str;
    }

    public final void setMWifiName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiName = str;
    }

    public final void setMWifiPassword(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiPassword = str;
    }

    public final void setMWxAppId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxAppId = str;
    }

    public final void setMWxDeviceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxDeviceName = str;
    }

    public final void setMWxDeviceSecret(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxDeviceSecret = str;
    }

    public final void setMWxModelId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxModelId = str;
    }

    public final void setMWxProductId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxProductId = str;
    }

    public final void setMWxTargetOpenId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWxTargetOpenId = str;
    }

    @aa1
    public String toString() {
        return "BleVideoCallInfo(mCommand=" + this.mCommand + ", mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mSWAppId=" + this.mSWAppId + ", mSWChannelName=" + this.mSWChannelName + ", mSWToken=" + this.mSWToken + ", mLanguage=" + this.mLanguage + ", mTargetLanguage=" + this.mTargetLanguage + ", mWxProductId=" + this.mWxProductId + ", mWxDeviceName=" + this.mWxDeviceName + ", mWxDeviceSecret=" + this.mWxDeviceSecret + ", mWxModelId=" + this.mWxModelId + ", mWxAppId=" + this.mWxAppId + ", mWxTargetOpenId=" + this.mWxTargetOpenId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVideoCallInfo(int i, @aa1 String mWifiName, @aa1 String mWifiPassword, @aa1 String mSWAppId, @aa1 String mSWChannelName, @aa1 String mSWToken, @aa1 String mLanguage, @aa1 String mTargetLanguage, @aa1 String mWxProductId, @aa1 String mWxDeviceName, @aa1 String mWxDeviceSecret, @aa1 String mWxModelId, @aa1 String mWxAppId, @aa1 String mWxTargetOpenId) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        Intrinsics.X0O(mSWAppId, "mSWAppId");
        Intrinsics.X0O(mSWChannelName, "mSWChannelName");
        Intrinsics.X0O(mSWToken, "mSWToken");
        Intrinsics.X0O(mLanguage, "mLanguage");
        Intrinsics.X0O(mTargetLanguage, "mTargetLanguage");
        Intrinsics.X0O(mWxProductId, "mWxProductId");
        Intrinsics.X0O(mWxDeviceName, "mWxDeviceName");
        Intrinsics.X0O(mWxDeviceSecret, "mWxDeviceSecret");
        Intrinsics.X0O(mWxModelId, "mWxModelId");
        Intrinsics.X0O(mWxAppId, "mWxAppId");
        Intrinsics.X0O(mWxTargetOpenId, "mWxTargetOpenId");
        this.mCommand = i;
        this.mWifiName = mWifiName;
        this.mWifiPassword = mWifiPassword;
        this.mSWAppId = mSWAppId;
        this.mSWChannelName = mSWChannelName;
        this.mSWToken = mSWToken;
        this.mLanguage = mLanguage;
        this.mTargetLanguage = mTargetLanguage;
        this.mWxProductId = mWxProductId;
        this.mWxDeviceName = mWxDeviceName;
        this.mWxDeviceSecret = mWxDeviceSecret;
        this.mWxModelId = mWxModelId;
        this.mWxAppId = mWxAppId;
        this.mWxTargetOpenId = mWxTargetOpenId;
    }

    public /* synthetic */ BleVideoCallInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13);
    }
}
