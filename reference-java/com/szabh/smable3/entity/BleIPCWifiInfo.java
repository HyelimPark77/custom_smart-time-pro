package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.entity.BleIPCWifiInfo;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCWifiInfo extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int MODE_AP = 0;
    public static final int MODE_P2P = 1;
    public static final int MODE_STA = 2;
    public static final int STATE_IPC_ALIPAY_INIT_FAILED = 14;
    public static final int STATE_IPC_ALIPAY_INIT_SUCCESSFULLY = 13;
    public static final int STATE_IPC_CLOSE = 0;
    public static final int STATE_IPC_HTTP_READY = 18;
    public static final int STATE_IPC_OPENING = 1;
    public static final int STATE_IPC_OPEN_SUCCESSFULLY = 2;
    public static final int STATE_IPC_P2P_CONNECTED = 9;
    public static final int STATE_IPC_RECORD_START = 19;
    public static final int STATE_IPC_VIDEO_CALL_CREATE_CONFIG_FAILED = 8;
    public static final int STATE_IPC_VIDEO_CALL_CREATE_PARAM_FAILED = 7;
    public static final int STATE_IPC_VIDEO_CALL_CREATE_SUCCESSFULLY = 6;
    public static final int STATE_IPC_VIDEO_CALL_END = 11;
    public static final int STATE_IPC_VIDEO_CALL_GOING = 12;
    public static final int STATE_IPC_VIDEO_CALL_START = 10;
    public static final int STATE_IPC_WIFI_OPENING = 3;
    public static final int STATE_IPC_WIFI_OPEN_SUCCESSFULLY = 4;
    public static final int STATE_IPC_WIFI_STA_FAILED = 5;
    public static final int STATE_WIFI_OPEN_FAILED = 128;
    public static final int TYPE_IP = 3;
    public static final int TYPE_IPC_IC_INFO = 6;
    public static final int TYPE_PROTOCOL = 11;
    public static final int TYPE_SUPPORT = 7;
    public static final int TYPE_VIDEO_CALL_CONNECTED_COUNT = 8;
    public static final int TYPE_WIFI_DELETE_PATH = 13;
    public static final int TYPE_WIFI_MAC = 12;
    public static final int TYPE_WIFI_MODE = 5;
    public static final int TYPE_WIFI_NAME = 1;
    public static final int TYPE_WIFI_PASSWORD = 2;
    public static final int TYPE_WIFI_PATH = 10;
    public static final int TYPE_WIFI_PORT = 9;
    public static final int TYPE_WIFI_STATE = 4;

    @aa1
    private String mDeletePath;

    @aa1
    private String mIP;

    @aa1
    private String mMAC;
    private int mMode;

    @aa1
    private String mPath;
    private int mPort;
    private int mProtocol;
    private int mState;
    private int mVideoCallConnectedCount;

    @aa1
    private String mWifiName;

    @aa1
    private String mWifiPassword;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCWifiInfo() {
        this(null, null, null, 0, 0, 0, 0, null, 0, null, null, 2047, null);
    }

    public static /* synthetic */ BleIPCWifiInfo copy$default(BleIPCWifiInfo bleIPCWifiInfo, String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, int i5, String str5, String str6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = bleIPCWifiInfo.mWifiName;
        }
        if ((i6 & 2) != 0) {
            str2 = bleIPCWifiInfo.mWifiPassword;
        }
        if ((i6 & 4) != 0) {
            str3 = bleIPCWifiInfo.mIP;
        }
        if ((i6 & 8) != 0) {
            i = bleIPCWifiInfo.mState;
        }
        if ((i6 & 16) != 0) {
            i2 = bleIPCWifiInfo.mMode;
        }
        if ((i6 & 32) != 0) {
            i3 = bleIPCWifiInfo.mVideoCallConnectedCount;
        }
        if ((i6 & 64) != 0) {
            i4 = bleIPCWifiInfo.mPort;
        }
        if ((i6 & 128) != 0) {
            str4 = bleIPCWifiInfo.mPath;
        }
        if ((i6 & 256) != 0) {
            i5 = bleIPCWifiInfo.mProtocol;
        }
        if ((i6 & 512) != 0) {
            str5 = bleIPCWifiInfo.mMAC;
        }
        if ((i6 & 1024) != 0) {
            str6 = bleIPCWifiInfo.mDeletePath;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        int i7 = i5;
        int i8 = i3;
        int i9 = i4;
        int i10 = i2;
        String str10 = str3;
        return bleIPCWifiInfo.copy(str, str2, str10, i, i10, i8, i9, str9, i7, str7, str8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence decode$lambda$0(byte b) {
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @aa1
    public final String component1() {
        return this.mWifiName;
    }

    @aa1
    public final String component10() {
        return this.mMAC;
    }

    @aa1
    public final String component11() {
        return this.mDeletePath;
    }

    @aa1
    public final String component2() {
        return this.mWifiPassword;
    }

    @aa1
    public final String component3() {
        return this.mIP;
    }

    public final int component4() {
        return this.mState;
    }

    public final int component5() {
        return this.mMode;
    }

    public final int component6() {
        return this.mVideoCallConnectedCount;
    }

    public final int component7() {
        return this.mPort;
    }

    @aa1
    public final String component8() {
        return this.mPath;
    }

    public final int component9() {
        return this.mProtocol;
    }

    @aa1
    public final BleIPCWifiInfo copy(@aa1 String mWifiName, @aa1 String mWifiPassword, @aa1 String mIP, int i, int i2, int i3, int i4, @aa1 String mPath, int i5, @aa1 String mMAC, @aa1 String mDeletePath) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        Intrinsics.X0O(mIP, "mIP");
        Intrinsics.X0O(mPath, "mPath");
        Intrinsics.X0O(mMAC, "mMAC");
        Intrinsics.X0O(mDeletePath, "mDeletePath");
        return new BleIPCWifiInfo(mWifiName, mWifiPassword, mIP, i, i2, i3, i4, mPath, i5, mMAC, mDeletePath);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        do {
            char uInt9 = readUInt8();
            switch (uInt8) {
                case 1:
                    this.mWifiName = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 2:
                    this.mWifiPassword = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 3:
                    this.mIP = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 4:
                    this.mState = readUInt8();
                    break;
                case 5:
                    this.mMode = readUInt8();
                    break;
                case 6:
                case 7:
                default:
                    readBytes(uInt9);
                    break;
                case '\b':
                    this.mVideoCallConnectedCount = readUInt8();
                    break;
                case '\t':
                    ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
                    Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
                    this.mPort = readInt32(LITTLE_ENDIAN);
                    break;
                case '\n':
                    this.mPath = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
                case 11:
                    this.mProtocol = readUInt8();
                    break;
                case '\f':
                    this.mMAC = ArraysKt___ArraysKt.i0I(readBytes(uInt9), CertificateUtil.DELIMITER, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IO0I11I1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return BleIPCWifiInfo.decode$lambda$0(((Byte) obj).byteValue());
                        }
                    }, 30, null);
                    break;
                case '\r':
                    this.mDeletePath = BleReadable.readString$default(this, uInt9, null, 2, null);
                    break;
            }
            uInt8 = readUInt8();
        } while (uInt8 > 0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        if (this.mPath.length() > 0) {
            writeInt8(10);
            byte[] bytes = this.mPath.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            writeInt8(bytes.length);
            writeString(this.mPath, Charsets.IiI10X);
        }
        if (this.mDeletePath.length() > 0) {
            writeInt8(13);
            byte[] bytes2 = this.mDeletePath.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            writeInt8(bytes2.length);
            writeString(this.mDeletePath, Charsets.IiI10X);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCWifiInfo)) {
            return false;
        }
        BleIPCWifiInfo bleIPCWifiInfo = (BleIPCWifiInfo) obj;
        return Intrinsics.XOO0ii0(this.mWifiName, bleIPCWifiInfo.mWifiName) && Intrinsics.XOO0ii0(this.mWifiPassword, bleIPCWifiInfo.mWifiPassword) && Intrinsics.XOO0ii0(this.mIP, bleIPCWifiInfo.mIP) && this.mState == bleIPCWifiInfo.mState && this.mMode == bleIPCWifiInfo.mMode && this.mVideoCallConnectedCount == bleIPCWifiInfo.mVideoCallConnectedCount && this.mPort == bleIPCWifiInfo.mPort && Intrinsics.XOO0ii0(this.mPath, bleIPCWifiInfo.mPath) && this.mProtocol == bleIPCWifiInfo.mProtocol && Intrinsics.XOO0ii0(this.mMAC, bleIPCWifiInfo.mMAC) && Intrinsics.XOO0ii0(this.mDeletePath, bleIPCWifiInfo.mDeletePath);
    }

    @aa1
    public final String getMDeletePath() {
        return this.mDeletePath;
    }

    @aa1
    public final String getMIP() {
        return this.mIP;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        int length;
        if (this.mPath.length() > 0) {
            byte[] bytes = this.mPath.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            length = bytes.length + 2;
        } else {
            length = 0;
        }
        if (this.mDeletePath.length() <= 0) {
            return length;
        }
        byte[] bytes2 = this.mDeletePath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        return length + 2 + bytes2.length;
    }

    @aa1
    public final String getMMAC() {
        return this.mMAC;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final String getMPath() {
        return this.mPath;
    }

    public final int getMPort() {
        return this.mPort;
    }

    public final int getMProtocol() {
        return this.mProtocol;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMVideoCallConnectedCount() {
        return this.mVideoCallConnectedCount;
    }

    @aa1
    public final String getMWifiName() {
        return this.mWifiName;
    }

    @aa1
    public final String getMWifiPassword() {
        return this.mWifiPassword;
    }

    public int hashCode() {
        return (((((((((((((((((((this.mWifiName.hashCode() * 31) + this.mWifiPassword.hashCode()) * 31) + this.mIP.hashCode()) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mVideoCallConnectedCount)) * 31) + Integer.hashCode(this.mPort)) * 31) + this.mPath.hashCode()) * 31) + Integer.hashCode(this.mProtocol)) * 31) + this.mMAC.hashCode()) * 31) + this.mDeletePath.hashCode();
    }

    public final void setMDeletePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDeletePath = str;
    }

    public final void setMIP(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mIP = str;
    }

    public final void setMMAC(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMAC = str;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPath = str;
    }

    public final void setMPort(int i) {
        this.mPort = i;
    }

    public final void setMProtocol(int i) {
        this.mProtocol = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMVideoCallConnectedCount(int i) {
        this.mVideoCallConnectedCount = i;
    }

    public final void setMWifiName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiName = str;
    }

    public final void setMWifiPassword(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiPassword = str;
    }

    @aa1
    public String toString() {
        return "BleIPCWifiInfo(mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mIP=" + this.mIP + ", mState=" + this.mState + ", mMode=" + this.mMode + ", mVideoCallConnectedCount=" + this.mVideoCallConnectedCount + ", mPort=" + this.mPort + ", mPath=" + this.mPath + ", mProtocol=" + this.mProtocol + ", mMAC=" + this.mMAC + ", mDeletePath=" + this.mDeletePath + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCWifiInfo(@aa1 String mWifiName, @aa1 String mWifiPassword, @aa1 String mIP, int i, int i2, int i3, int i4, @aa1 String mPath, int i5, @aa1 String mMAC, @aa1 String mDeletePath) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        Intrinsics.X0O(mIP, "mIP");
        Intrinsics.X0O(mPath, "mPath");
        Intrinsics.X0O(mMAC, "mMAC");
        Intrinsics.X0O(mDeletePath, "mDeletePath");
        this.mWifiName = mWifiName;
        this.mWifiPassword = mWifiPassword;
        this.mIP = mIP;
        this.mState = i;
        this.mMode = i2;
        this.mVideoCallConnectedCount = i3;
        this.mPort = i4;
        this.mPath = mPath;
        this.mProtocol = i5;
        this.mMAC = mMAC;
        this.mDeletePath = mDeletePath;
    }

    public /* synthetic */ BleIPCWifiInfo(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, int i5, String str5, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? "" : str4, (i6 & 256) != 0 ? 0 : i5, (i6 & 512) != 0 ? "" : str5, (i6 & 1024) != 0 ? "" : str6);
    }
}
