package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleVideoCallInfo() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, bm.OXO1, null);
    }

    public static /* synthetic */ BleVideoCallInfo copy$default(BleVideoCallInfo r14, int r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        int r1 = r14.mCommand;
    L7:
        if ((r29 & 2) == 0) goto L9;
        String r2 = r14.mWifiName;
    L11:
        if ((r29 & 4) == 0) goto L13;
        String r3 = r14.mWifiPassword;
    L15:
        if ((r29 & 8) == 0) goto L17;
        String r4 = r14.mSWAppId;
    L19:
        if ((r29 & 16) == 0) goto L21;
        String r5 = r14.mSWChannelName;
    L23:
        if ((r29 & 32) == 0) goto L25;
        String r6 = r14.mSWToken;
    L27:
        if ((r29 & 64) == 0) goto L29;
        String r7 = r14.mLanguage;
    L31:
        if ((r29 & 128) == 0) goto L33;
        String r8 = r14.mTargetLanguage;
    L35:
        if ((r29 & 256) == 0) goto L37;
        String r9 = r14.mWxProductId;
    L39:
        if ((r29 & 512) == 0) goto L41;
        String r10 = r14.mWxDeviceName;
    L43:
        if ((r29 & 1024) == 0) goto L45;
        String r11 = r14.mWxDeviceSecret;
    L47:
        if ((r29 & 2048) == 0) goto L49;
        String r12 = r14.mWxModelId;
    L51:
        if ((r29 & 4096) == 0) goto L53;
        String r13 = r14.mWxAppId;
    L55:
        if ((r29 & 8192) == 0) goto L58;
        String r210 = r14.mWxTargetOpenId;
    L60:
        return r14.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r210);
    L58:
        r210 = r28;
        goto L60
    L53:
        r13 = r27;
        goto L55
    L49:
        r12 = r26;
        goto L51
    L45:
        r11 = r25;
        goto L47
    L41:
        r10 = r24;
        goto L43
    L37:
        r9 = r23;
        goto L39
    L33:
        r8 = r22;
        goto L35
    L29:
        r7 = r21;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
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
    public final BleVideoCallInfo copy(int r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30) {
        Intrinsics.X0O(r18, "mWifiName");
        Intrinsics.X0O(r19, "mWifiPassword");
        Intrinsics.X0O(r20, "mSWAppId");
        Intrinsics.X0O(r21, "mSWChannelName");
        Intrinsics.X0O(r22, "mSWToken");
        Intrinsics.X0O(r23, "mLanguage");
        Intrinsics.X0O(r24, "mTargetLanguage");
        Intrinsics.X0O(r25, "mWxProductId");
        Intrinsics.X0O(r26, "mWxDeviceName");
        Intrinsics.X0O(r27, "mWxDeviceSecret");
        Intrinsics.X0O(r28, "mWxModelId");
        Intrinsics.X0O(r29, "mWxAppId");
        Intrinsics.X0O(r30, "mWxTargetOpenId");
        return new BleVideoCallInfo(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
    L3:
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        short r2 = readInt16(r1);
        switch(r0) {
            case 1: goto L19;
            case 2: goto L18;
            case 3: goto L17;
            case 4: goto L16;
            case 5: goto L15;
            case 6: goto L14;
            case 7: goto L13;
            case 8: goto L12;
            case 9: goto L11;
            case 10: goto L10;
            case 11: goto L9;
            case 12: goto L8;
            case 13: goto L7;
            case 14: goto L6;
            default: goto L20;
        };
    L6:
        this.mWxTargetOpenId = readString(r2, Charsets.IiI10X);
        goto L20
    L7:
        this.mWxAppId = readString(r2, Charsets.IiI10X);
        goto L20
    L8:
        this.mWxModelId = readString(r2, Charsets.IiI10X);
        goto L20
    L9:
        this.mWxDeviceSecret = readString(r2, Charsets.IiI10X);
        goto L20
    L10:
        this.mWxDeviceName = readString(r2, Charsets.IiI10X);
        goto L20
    L11:
        this.mWxProductId = readString(r2, Charsets.IiI10X);
        goto L20
    L12:
        this.mCommand = readUInt8();
        goto L20
    L13:
        this.mTargetLanguage = readString(r2, Charsets.IiI10X);
        goto L20
    L14:
        this.mLanguage = readString(r2, Charsets.IiI10X);
        goto L20
    L15:
        this.mSWToken = readString(r2, Charsets.IiI10X);
        goto L20
    L16:
        this.mSWChannelName = readString(r2, Charsets.IiI10X);
        goto L20
    L17:
        this.mSWAppId = readString(r2, Charsets.IiI10X);
        goto L20
    L18:
        this.mWifiPassword = readString(r2, Charsets.IiI10X);
        goto L20
    L19:
        this.mWifiName = readString(r2, Charsets.IiI10X);
    L20:
        r0 = readUInt8();
        if (r0 > 0) goto L3;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(8);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(1, r0);
        writeInt8(this.mCommand);
        if (this.mWifiName.length() <= 0) goto L6;
        writeInt8(1);
        byte[] r2 = this.mWifiName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        int r3 = r2.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r3, r0);
        writeString(this.mWifiName, Charsets.IiI10X);
    L6:
        if (this.mWifiPassword.length() <= 0) goto L9;
        writeInt8(2);
        byte[] r4 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        int r5 = r4.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r5, r0);
        writeString(this.mWifiPassword, Charsets.IiI10X);
    L9:
        if (this.mSWAppId.length() <= 0) goto L12;
        writeInt8(3);
        byte[] r6 = this.mSWAppId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");
        int r7 = r6.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r7, r0);
        writeString(this.mSWAppId, Charsets.IiI10X);
    L12:
        if (this.mSWChannelName.length() <= 0) goto L15;
        writeInt8(4);
        byte[] r8 = this.mSWChannelName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r8, "getBytes(...)");
        int r9 = r8.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r9, r0);
        writeString(this.mSWChannelName, Charsets.IiI10X);
    L15:
        if (this.mSWToken.length() <= 0) goto L18;
        writeInt8(5);
        byte[] r10 = this.mSWToken.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r10, "getBytes(...)");
        int r11 = r10.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r11, r0);
        writeString(this.mSWToken, Charsets.IiI10X);
    L18:
        if (this.mLanguage.length() <= 0) goto L21;
        writeInt8(6);
        byte[] r12 = this.mLanguage.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r12, "getBytes(...)");
        int r13 = r12.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r13, r0);
        writeString(this.mLanguage, Charsets.IiI10X);
    L21:
        if (this.mTargetLanguage.length() <= 0) goto L24;
        writeInt8(7);
        byte[] r14 = this.mTargetLanguage.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r14, "getBytes(...)");
        int r15 = r14.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r15, r0);
        writeString(this.mTargetLanguage, Charsets.IiI10X);
    L24:
        if (this.mWxProductId.length() <= 0) goto L27;
        writeInt8(9);
        byte[] r16 = this.mWxProductId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r16, "getBytes(...)");
        int r17 = r16.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r17, r0);
        writeString(this.mWxProductId, Charsets.IiI10X);
    L27:
        if (this.mWxDeviceName.length() <= 0) goto L30;
        writeInt8(10);
        byte[] r18 = this.mWxDeviceName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r18, "getBytes(...)");
        int r19 = r18.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r19, r0);
        writeString(this.mWxDeviceName, Charsets.IiI10X);
    L30:
        if (this.mWxDeviceSecret.length() <= 0) goto L33;
        writeInt8(11);
        byte[] r20 = this.mWxDeviceSecret.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r20, "getBytes(...)");
        int r21 = r20.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r21, r0);
        writeString(this.mWxDeviceSecret, Charsets.IiI10X);
    L33:
        if (this.mWxModelId.length() <= 0) goto L36;
        writeInt8(12);
        byte[] r22 = this.mWxModelId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r22, "getBytes(...)");
        int r23 = r22.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r23, r0);
        writeString(this.mWxModelId, Charsets.IiI10X);
    L36:
        if (this.mWxAppId.length() <= 0) goto L39;
        writeInt8(13);
        byte[] r24 = this.mWxAppId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r24, "getBytes(...)");
        int r25 = r24.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r25, r0);
        writeString(this.mWxAppId, Charsets.IiI10X);
    L39:
        if (this.mWxTargetOpenId.length() <= 0) goto L42;
        writeInt8(14);
        byte[] r26 = this.mWxTargetOpenId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r26, "getBytes(...)");
        int r27 = r26.length;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeInt16(r27, r0);
        writeString(this.mWxTargetOpenId, Charsets.IiI10X);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleVideoCallInfo) == true) goto L8;
        return false;
    L8:
        BleVideoCallInfo r6 = (BleVideoCallInfo) r5;
        if (this.mCommand == r6.mCommand) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWifiName, r6.mWifiName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWifiPassword, r6.mWifiPassword) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mSWAppId, r6.mSWAppId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mSWChannelName, r6.mSWChannelName) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mSWToken, r6.mSWToken) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mLanguage, r6.mLanguage) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mTargetLanguage, r6.mTargetLanguage) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mWxProductId, r6.mWxProductId) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mWxDeviceName, r6.mWxDeviceName) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mWxDeviceSecret, r6.mWxDeviceSecret) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mWxModelId, r6.mWxModelId) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mWxAppId, r6.mWxAppId) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mWxTargetOpenId, r6.mWxTargetOpenId) == true) goto L50;
        return false;
    L50:
        return true;
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
        if (this.mWifiName.length() <= 0) goto L5;
        byte[] r0 = this.mWifiName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r2 = 7 + r0.length;
    L7:
        if (this.mWifiPassword.length() <= 0) goto L10;
        byte[] r1 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        r2 = (r2 + 3) + r1.length;
    L10:
        if (this.mSWAppId.length() <= 0) goto L13;
        byte[] r3 = this.mSWAppId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        r2 = (r2 + 3) + r3.length;
    L13:
        if (this.mSWChannelName.length() <= 0) goto L16;
        byte[] r4 = this.mSWChannelName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        r2 = (r2 + 3) + r4.length;
    L16:
        if (this.mSWToken.length() <= 0) goto L19;
        byte[] r5 = this.mSWToken.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        r2 = (r2 + 3) + r5.length;
    L19:
        if (this.mLanguage.length() <= 0) goto L22;
        byte[] r6 = this.mLanguage.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");
        r2 = (r2 + 3) + r6.length;
    L22:
        if (this.mTargetLanguage.length() <= 0) goto L25;
        byte[] r7 = this.mTargetLanguage.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");
        r2 = (r2 + 3) + r7.length;
    L25:
        if (this.mWxProductId.length() <= 0) goto L28;
        byte[] r8 = this.mWxProductId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r8, "getBytes(...)");
        r2 = (r2 + 3) + r8.length;
    L28:
        if (this.mWxDeviceName.length() <= 0) goto L31;
        byte[] r9 = this.mWxDeviceName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r9, "getBytes(...)");
        r2 = (r2 + 3) + r9.length;
    L31:
        if (this.mWxDeviceSecret.length() <= 0) goto L34;
        byte[] r10 = this.mWxDeviceSecret.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r10, "getBytes(...)");
        r2 = (r2 + 3) + r10.length;
    L34:
        if (this.mWxModelId.length() <= 0) goto L37;
        byte[] r11 = this.mWxModelId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r11, "getBytes(...)");
        r2 = (r2 + 3) + r11.length;
    L37:
        if (this.mWxAppId.length() <= 0) goto L40;
        byte[] r12 = this.mWxAppId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r12, "getBytes(...)");
        r2 = (r2 + 3) + r12.length;
    L40:
        if (this.mWxTargetOpenId.length() <= 0) goto L43;
        byte[] r13 = this.mWxTargetOpenId.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r13, "getBytes(...)");
        return (r2 + 3) + r13.length;
    L43:
        return r2;
    L5:
        r2 = 4;
        goto L7
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

    public final void setMCommand(int r1) {
        this.mCommand = r1;
    }

    public final void setMLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguage = r2;
    }

    public final void setMSWAppId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSWAppId = r2;
    }

    public final void setMSWChannelName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSWChannelName = r2;
    }

    public final void setMSWToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSWToken = r2;
    }

    public final void setMTargetLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTargetLanguage = r2;
    }

    public final void setMWifiName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiName = r2;
    }

    public final void setMWifiPassword(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiPassword = r2;
    }

    public final void setMWxAppId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxAppId = r2;
    }

    public final void setMWxDeviceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxDeviceName = r2;
    }

    public final void setMWxDeviceSecret(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxDeviceSecret = r2;
    }

    public final void setMWxModelId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxModelId = r2;
    }

    public final void setMWxProductId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxProductId = r2;
    }

    public final void setMWxTargetOpenId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWxTargetOpenId = r2;
    }

    @aa1
    public String toString() {
        return "BleVideoCallInfo(mCommand=" + this.mCommand + ", mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mSWAppId=" + this.mSWAppId + ", mSWChannelName=" + this.mSWChannelName + ", mSWToken=" + this.mSWToken + ", mLanguage=" + this.mLanguage + ", mTargetLanguage=" + this.mTargetLanguage + ", mWxProductId=" + this.mWxProductId + ", mWxDeviceName=" + this.mWxDeviceName + ", mWxDeviceSecret=" + this.mWxDeviceSecret + ", mWxModelId=" + this.mWxModelId + ", mWxAppId=" + this.mWxAppId + ", mWxTargetOpenId=" + this.mWxTargetOpenId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVideoCallInfo(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15) {
        Intrinsics.X0O(r3, "mWifiName");
        Intrinsics.X0O(r4, "mWifiPassword");
        Intrinsics.X0O(r5, "mSWAppId");
        Intrinsics.X0O(r6, "mSWChannelName");
        Intrinsics.X0O(r7, "mSWToken");
        Intrinsics.X0O(r8, "mLanguage");
        Intrinsics.X0O(r9, "mTargetLanguage");
        Intrinsics.X0O(r10, "mWxProductId");
        Intrinsics.X0O(r11, "mWxDeviceName");
        Intrinsics.X0O(r12, "mWxDeviceSecret");
        Intrinsics.X0O(r13, "mWxModelId");
        Intrinsics.X0O(r14, "mWxAppId");
        Intrinsics.X0O(r15, "mWxTargetOpenId");
        this.mCommand = r2;
        this.mWifiName = r3;
        this.mWifiPassword = r4;
        this.mSWAppId = r5;
        this.mSWChannelName = r6;
        this.mSWToken = r7;
        this.mLanguage = r8;
        this.mTargetLanguage = r9;
        this.mWxProductId = r10;
        this.mWxDeviceName = r11;
        this.mWxDeviceSecret = r12;
        this.mWxModelId = r13;
        this.mWxAppId = r14;
        this.mWxTargetOpenId = r15;
    }

    public /* synthetic */ BleVideoCallInfo(int r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, int r30, DefaultConstructorMarker r31) {
        if ((r30 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r2 = "";
    L11:
        if ((r30 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r30 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r30 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r30 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r30 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r30 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r30 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r30 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r30 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r30 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r30 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r30 & 8192) == 0) goto L58;
        String r32 = "";
    L59:
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32);
        return;
    L58:
        r32 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r2 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
