package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.IO0I11I1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.facebook.internal.security.CertificateUtil;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCWifiInfo extends BleWritable {

    @aa1
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCWifiInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        String r8 = null;
        int r9 = 0;
        String r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return decode$lambda$0(r0);
    }

    public static /* synthetic */ BleIPCWifiInfo copy$default(BleIPCWifiInfo r0, String r1, String r2, String r3, int r4, int r5, int r6, int r7, String r8, int r9, String r10, String r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mWifiName;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mWifiPassword;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mIP;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mState;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mMode;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mVideoCallConnectedCount;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mPort;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mPath;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mProtocol;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mMAC;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mDeletePath;
    L35:
        String r14 = r10;
        String r15 = r11;
        String r16 = r8;
        int r17 = r9;
        int r18 = r6;
        int r19 = r7;
        int r20 = r4;
        int r21 = r5;
        String r22 = r3;
        String r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    private static final CharSequence decode$lambda$0(byte r1) {
        String r2 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
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
    public final BleIPCWifiInfo copy(@aa1 String r14, @aa1 String r15, @aa1 String r16, int r17, int r18, int r19, int r20, @aa1 String r21, int r22, @aa1 String r23, @aa1 String r24) {
        Intrinsics.X0O(r14, "mWifiName");
        Intrinsics.X0O(r15, "mWifiPassword");
        Intrinsics.X0O(r16, "mIP");
        Intrinsics.X0O(r21, "mPath");
        Intrinsics.X0O(r23, "mMAC");
        Intrinsics.X0O(r24, "mDeletePath");
        return new BleIPCWifiInfo(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
    L3:
        char r1 = readUInt8();
        switch(r0) {
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L14;
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L5;
            case 7: goto L5;
            case 8: goto L11;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L8;
            case 12: goto L7;
            case 13: goto L6;
            default: goto L5;
        };
    L5:
        readBytes(r1);
    L17:
        r0 = readUInt8();
        if (r0 > 0) goto L3;
        return;
    L6:
        this.mDeletePath = BleReadable.readString$default(this, r1, null, 2, null);
        goto L17
    L7:
        this.mMAC = ArraysKt___ArraysKt.i0I(readBytes(r1), CertificateUtil.DELIMITER, null, null, 0, null, new IO0I11I1(), 30, null);
        goto L17
    L8:
        this.mProtocol = readUInt8();
        goto L17
    L9:
        this.mPath = BleReadable.readString$default(this, r1, null, 2, null);
        goto L17
    L10:
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        this.mPort = readInt32(r2);
        goto L17
    L11:
        this.mVideoCallConnectedCount = readUInt8();
        goto L17
    L12:
        this.mMode = readUInt8();
        goto L17
    L13:
        this.mState = readUInt8();
        goto L17
    L14:
        this.mIP = BleReadable.readString$default(this, r1, null, 2, null);
        goto L17
    L15:
        this.mWifiPassword = BleReadable.readString$default(this, r1, null, 2, null);
        goto L17
    L16:
        this.mWifiName = BleReadable.readString$default(this, r1, null, 2, null);
        goto L17
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        if (this.mPath.length() <= 0) goto L6;
        writeInt8(10);
        byte[] r0 = this.mPath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        writeInt8(r0.length);
        writeString(this.mPath, Charsets.IiI10X);
    L6:
        if (this.mDeletePath.length() <= 0) goto L9;
        writeInt8(13);
        byte[] r1 = this.mDeletePath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        writeInt8(r1.length);
        writeString(this.mDeletePath, Charsets.IiI10X);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCWifiInfo) == true) goto L8;
        return false;
    L8:
        BleIPCWifiInfo r6 = (BleIPCWifiInfo) r5;
        if (Intrinsics.XOO0ii0(this.mWifiName, r6.mWifiName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWifiPassword, r6.mWifiPassword) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mIP, r6.mIP) == true) goto L18;
        return false;
    L18:
        if (this.mState == r6.mState) goto L21;
        return false;
    L21:
        if (this.mMode == r6.mMode) goto L24;
        return false;
    L24:
        if (this.mVideoCallConnectedCount == r6.mVideoCallConnectedCount) goto L27;
        return false;
    L27:
        if (this.mPort == r6.mPort) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mPath, r6.mPath) == true) goto L33;
        return false;
    L33:
        if (this.mProtocol == r6.mProtocol) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mMAC, r6.mMAC) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mDeletePath, r6.mDeletePath) == true) goto L41;
        return false;
    L41:
        return true;
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
        if (this.mPath.length() <= 0) goto L5;
        byte[] r0 = this.mPath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r1 = r0.length + 2;
    L7:
        if (this.mDeletePath.length() <= 0) goto L10;
        byte[] r2 = this.mDeletePath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        return (r1 + 2) + r2.length;
    L10:
        return r1;
    L5:
        r1 = 0;
        goto L7
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

    public final void setMDeletePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeletePath = r2;
    }

    public final void setMIP(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIP = r2;
    }

    public final void setMMAC(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMAC = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPath = r2;
    }

    public final void setMPort(int r1) {
        this.mPort = r1;
    }

    public final void setMProtocol(int r1) {
        this.mProtocol = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMVideoCallConnectedCount(int r1) {
        this.mVideoCallConnectedCount = r1;
    }

    public final void setMWifiName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiName = r2;
    }

    public final void setMWifiPassword(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiPassword = r2;
    }

    @aa1
    public String toString() {
        return "BleIPCWifiInfo(mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mIP=" + this.mIP + ", mState=" + this.mState + ", mMode=" + this.mMode + ", mVideoCallConnectedCount=" + this.mVideoCallConnectedCount + ", mPort=" + this.mPort + ", mPath=" + this.mPath + ", mProtocol=" + this.mProtocol + ", mMAC=" + this.mMAC + ", mDeletePath=" + this.mDeletePath + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCWifiInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, int r5, int r6, int r7, int r8, @aa1 String r9, int r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r2, "mWifiName");
        Intrinsics.X0O(r3, "mWifiPassword");
        Intrinsics.X0O(r4, "mIP");
        Intrinsics.X0O(r9, "mPath");
        Intrinsics.X0O(r11, "mMAC");
        Intrinsics.X0O(r12, "mDeletePath");
        this.mWifiName = r2;
        this.mWifiPassword = r3;
        this.mIP = r4;
        this.mState = r5;
        this.mMode = r6;
        this.mVideoCallConnectedCount = r7;
        this.mPort = r8;
        this.mPath = r9;
        this.mProtocol = r10;
        this.mMAC = r11;
        this.mDeletePath = r12;
    }

    public /* synthetic */ BleIPCWifiInfo(String r3, String r4, String r5, int r6, int r7, int r8, int r9, String r10, int r11, String r12, String r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r12 = "";
    L33:
        if ((r14 & 1024) == 0) goto L36;
        String r16 = "";
    L35:
        String r17 = r12;
        int r18 = r11;
        String r19 = r10;
        int r110 = r9;
        int r20 = r8;
        int r21 = r7;
        int r22 = r6;
        String r23 = r5;
        this(r3, r4, r23, r22, r21, r20, r110, r19, r18, r17, r16);
        return;
    L36:
        r16 = r13;
        goto L35
    }
}
