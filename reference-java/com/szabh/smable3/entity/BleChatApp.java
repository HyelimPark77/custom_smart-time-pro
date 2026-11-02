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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleChatApp() {
        this(0, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ BleChatApp copy$default(BleChatApp bleChatApp, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleChatApp.mType;
        }
        if ((i3 & 2) != 0) {
            i2 = bleChatApp.mCommand;
        }
        if ((i3 & 4) != 0) {
            str = bleChatApp.mUserId;
        }
        if ((i3 & 8) != 0) {
            str2 = bleChatApp.mUserName;
        }
        if ((i3 & 16) != 0) {
            str3 = bleChatApp.mContent;
        }
        String str4 = str3;
        String str5 = str;
        return bleChatApp.copy(i, i2, str5, str2, str4);
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
    public final BleChatApp copy(int i, int i2, @aa1 String mUserId, @aa1 String mUserName, @aa1 String mContent) {
        Intrinsics.X0O(mUserId, "mUserId");
        Intrinsics.X0O(mUserName, "mUserName");
        Intrinsics.X0O(mContent, "mContent");
        return new BleChatApp(i, i2, mUserId, mUserName, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mCommand = readInt8();
        this.mUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mUserName = BleReadable.readString$default(this, 36, null, 2, null);
        readBytes(32);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mContent = BleReadable.readString$default(this, readInt16(LITTLE_ENDIAN), null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mCommand);
        BleWritable.writeStringWithFix$default(this, this.mUserId, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mUserName, 36, null, 4, null);
        BleWritable.writeBytes$default(this, new byte[32], null, 2, null);
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = bytes.length;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(length, LITTLE_ENDIAN);
        BleWritable.writeStringWithFix$default(this, this.mContent, length, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleChatApp)) {
            return false;
        }
        BleChatApp bleChatApp = (BleChatApp) obj;
        return this.mType == bleChatApp.mType && this.mCommand == bleChatApp.mCommand && Intrinsics.XOO0ii0(this.mUserId, bleChatApp.mUserId) && Intrinsics.XOO0ii0(this.mUserName, bleChatApp.mUserName) && Intrinsics.XOO0ii0(this.mContent, bleChatApp.mContent);
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
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return bytes.length + 96;
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

    public final void setMCommand(int i) {
        this.mCommand = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUserId = str;
    }

    public final void setMUserName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUserName = str;
    }

    @aa1
    public String toString() {
        return "BleChatApp(mType=" + this.mType + ", mCommand=" + this.mCommand + ", mUserId='" + this.mUserId + "', mUserName='" + this.mUserName + "', mContent='" + this.mContent + "')";
    }

    public BleChatApp(int i, int i2, @aa1 String mUserId, @aa1 String mUserName, @aa1 String mContent) {
        Intrinsics.X0O(mUserId, "mUserId");
        Intrinsics.X0O(mUserName, "mUserName");
        Intrinsics.X0O(mContent, "mContent");
        this.mType = i;
        this.mCommand = i2;
        this.mUserId = mUserId;
        this.mUserName = mUserName;
        this.mContent = mContent;
    }

    public /* synthetic */ BleChatApp(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3);
    }
}
