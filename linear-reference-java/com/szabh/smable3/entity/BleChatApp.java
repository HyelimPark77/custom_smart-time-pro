package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleChatApp extends BleWritable {
    public static final int COMMAND_LOGGING = 4;
    public static final int COMMAND_LOGIN_CANCEL = 2;
    public static final int COMMAND_LOGIN_CHECK = 7;
    public static final int COMMAND_LOGIN_FAILED = 6;
    public static final int COMMAND_LOGIN_NOT_RECEIVED_CODE = 10;
    public static final int COMMAND_LOGIN_QRCODE = 1;
    public static final int COMMAND_LOGIN_RECEIVED_CODE = 9;
    public static final int COMMAND_LOGIN_SUCCESS = 5;
    public static final int COMMAND_LOGIN_VERIFICATION_STATUS = 8;
    public static final int COMMAND_LOGOUT = 3;
    public static final int COMMAND_NONE = 0;

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_WECHAT = 15;
    public static final int TYPE_WHATSAPP = 6;
    private int mCommand;

    @aa1
    private String mContent;
    private int mType;

    @aa1
    private String mUserId;

    @aa1
    private String mUserName;

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

    public BleChatApp() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleChatApp copy$default(BleChatApp r0, int r1, int r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mCommand;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mUserId;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mUserName;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mContent;
    L17:
        String r8 = r4;
        String r9 = r5;
        String r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mCommand;
    }

    @aa1
    public final String component3() {
        return this.mUserId;
    }

    @aa1
    public final String component4() {
        return this.mUserName;
    }

    @aa1
    public final String component5() {
        return this.mContent;
    }

    @aa1
    public final BleChatApp copy(int r8, int r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r10, "mUserId");
        Intrinsics.X0O(r11, "mUserName");
        Intrinsics.X0O(r12, "mContent");
        return new BleChatApp(r8, r9, r10, r11, r12);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mCommand = readInt8();
        this.mUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mUserName = BleReadable.readString$default(this, 36, null, 2, null);
        readBytes(32);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mContent = BleReadable.readString$default(this, readInt16(r0), null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mCommand);
        BleWritable.writeStringWithFix$default(this, this.mUserId, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mUserName, 36, null, 4, null);
        BleWritable.writeBytes$default(this, new byte[32], null, 2, null);
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r9 = r0.length;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r9, r1);
        BleWritable.writeStringWithFix$default(this, this.mContent, r9, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleChatApp) == true) goto L8;
        return false;
    L8:
        BleChatApp r6 = (BleChatApp) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mCommand == r6.mCommand) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mUserId, r6.mUserId) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mUserName, r6.mUserName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mContent, r6.mContent) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMCommand() {
        return this.mCommand;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return r0.length + 96;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final String getMUserId() {
        return this.mUserId;
    }

    @aa1
    public final String getMUserName() {
        return this.mUserName;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mCommand)) * 31) + this.mUserId.hashCode()) * 31) + this.mUserName.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMCommand(int r1) {
        this.mCommand = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUserId = r2;
    }

    public final void setMUserName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUserName = r2;
    }

    @aa1
    public String toString() {
        return "BleChatApp(mType=" + this.mType + ", mCommand=" + this.mCommand + ", mUserId='" + this.mUserId + "', mUserName='" + this.mUserName + "', mContent='" + this.mContent + "')";
    }

    public BleChatApp(int r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "mUserId");
        Intrinsics.X0O(r5, "mUserName");
        Intrinsics.X0O(r6, "mContent");
        this.mType = r2;
        this.mCommand = r3;
        this.mUserId = r4;
        this.mUserName = r5;
        this.mContent = r6;
    }

    public /* synthetic */ BleChatApp(int r2, int r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r9 = "";
    L17:
        String r10 = r5;
        String r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
