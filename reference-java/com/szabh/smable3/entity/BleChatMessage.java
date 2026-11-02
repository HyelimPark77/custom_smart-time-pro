package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleChatMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleChatMessage.kt\ncom/szabh/smable3/entity/BleChatMessage\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,70:1\n222#2,4:71\n*S KotlinDebug\n*F\n+ 1 BleChatMessage.kt\ncom/szabh/smable3/entity/BleChatMessage\n*L\n46#1:71,4\n*E\n"})
public final class BleChatMessage extends BleWritable {
    public static final int CONTACT_TYPE_GROUP = 0;
    public static final int CONTACT_TYPE_OFFICIAL = 1;
    public static final int CONTACT_TYPE_USER = 0;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int MESSAGE_TYPE_TEXT = 0;
    public static final int MESSAGE_TYPE_VOICE = 1;
    public static final int TYPE_WECHAT = 15;
    public static final int TYPE_WHATSAPP = 6;
    private int mChatType;

    @aa1
    private String mContent;

    @aa1
    private String mFromUserId;

    @aa1
    private String mFromUserName;
    private int mMessageType;
    private long mTime;

    @aa1
    private String mToUserId;

    @aa1
    private String mToUserName;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleChatMessage() {
        this(0, 0, 0, null, null, null, null, 0L, null, 511, null);
    }

    public static /* synthetic */ BleChatMessage copy$default(BleChatMessage bleChatMessage, int i, int i2, int i3, String str, String str2, String str3, String str4, long j, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleChatMessage.mType;
        }
        if ((i4 & 2) != 0) {
            i2 = bleChatMessage.mMessageType;
        }
        if ((i4 & 4) != 0) {
            i3 = bleChatMessage.mChatType;
        }
        if ((i4 & 8) != 0) {
            str = bleChatMessage.mFromUserId;
        }
        if ((i4 & 16) != 0) {
            str2 = bleChatMessage.mFromUserName;
        }
        if ((i4 & 32) != 0) {
            str3 = bleChatMessage.mToUserId;
        }
        if ((i4 & 64) != 0) {
            str4 = bleChatMessage.mToUserName;
        }
        if ((i4 & 128) != 0) {
            j = bleChatMessage.mTime;
        }
        if ((i4 & 256) != 0) {
            str5 = bleChatMessage.mContent;
        }
        String str6 = str5;
        long j2 = j;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        int i5 = i3;
        return bleChatMessage.copy(i, i2, i5, str, str9, str7, str8, j2, str6);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mMessageType;
    }

    public final int component3() {
        return this.mChatType;
    }

    @aa1
    public final String component4() {
        return this.mFromUserId;
    }

    @aa1
    public final String component5() {
        return this.mFromUserName;
    }

    @aa1
    public final String component6() {
        return this.mToUserId;
    }

    @aa1
    public final String component7() {
        return this.mToUserName;
    }

    public final long component8() {
        return this.mTime;
    }

    @aa1
    public final String component9() {
        return this.mContent;
    }

    @aa1
    public final BleChatMessage copy(int i, int i2, int i3, @aa1 String mFromUserId, @aa1 String mFromUserName, @aa1 String mToUserId, @aa1 String mToUserName, long j, @aa1 String mContent) {
        Intrinsics.X0O(mFromUserId, "mFromUserId");
        Intrinsics.X0O(mFromUserName, "mFromUserName");
        Intrinsics.X0O(mToUserId, "mToUserId");
        Intrinsics.X0O(mToUserName, "mToUserName");
        Intrinsics.X0O(mContent, "mContent");
        return new BleChatMessage(i, i2, i3, mFromUserId, mFromUserName, mToUserId, mToUserName, j, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mMessageType = readInt8();
        this.mChatType = readInt8();
        this.mFromUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mFromUserName = BleReadable.readString$default(this, 36, null, 2, null);
        this.mToUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mToUserName = BleReadable.readString$default(this, 36, null, 2, null);
        BleTime.Companion companion = BleTime.Companion;
        BleReadable bleReadable = (BleReadable) BleTime.class.newInstance();
        bleReadable.setMBytes(readBytes(6));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mTime = companion.timeInMillis((BleTime) bleReadable);
        readBytes(9);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mContent = BleReadable.readString$default(this, readInt16(LITTLE_ENDIAN), null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeInt8(this.mMessageType);
        writeInt8(this.mChatType);
        BleWritable.writeStringWithFix$default(this, this.mFromUserId, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mFromUserName, 36, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mToUserId, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mToUserName, 36, null, 4, null);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        BleWritable.writeBytes$default(this, new byte[9], null, 2, null);
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
        if (!(obj instanceof BleChatMessage)) {
            return false;
        }
        BleChatMessage bleChatMessage = (BleChatMessage) obj;
        return this.mType == bleChatMessage.mType && this.mMessageType == bleChatMessage.mMessageType && this.mChatType == bleChatMessage.mChatType && Intrinsics.XOO0ii0(this.mFromUserId, bleChatMessage.mFromUserId) && Intrinsics.XOO0ii0(this.mFromUserName, bleChatMessage.mFromUserName) && Intrinsics.XOO0ii0(this.mToUserId, bleChatMessage.mToUserId) && Intrinsics.XOO0ii0(this.mToUserName, bleChatMessage.mToUserName) && this.mTime == bleChatMessage.mTime && Intrinsics.XOO0ii0(this.mContent, bleChatMessage.mContent);
    }

    public final int getMChatType() {
        return this.mChatType;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final String getMFromUserId() {
        return this.mFromUserId;
    }

    @aa1
    public final String getMFromUserName() {
        return this.mFromUserName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return bytes.length + 140;
    }

    public final int getMMessageType() {
        return this.mMessageType;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMToUserId() {
        return this.mToUserId;
    }

    @aa1
    public final String getMToUserName() {
        return this.mToUserName;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mMessageType)) * 31) + Integer.hashCode(this.mChatType)) * 31) + this.mFromUserId.hashCode()) * 31) + this.mFromUserName.hashCode()) * 31) + this.mToUserId.hashCode()) * 31) + this.mToUserName.hashCode()) * 31) + Long.hashCode(this.mTime)) * 31) + this.mContent.hashCode();
    }

    public final void setMChatType(int i) {
        this.mChatType = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMFromUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFromUserId = str;
    }

    public final void setMFromUserName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFromUserName = str;
    }

    public final void setMMessageType(int i) {
        this.mMessageType = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMToUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mToUserId = str;
    }

    public final void setMToUserName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mToUserName = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleChatMessage(mType=" + this.mType + ", mMessageType=" + this.mMessageType + ", mChatType=" + this.mChatType + ", mFromUserId=" + this.mFromUserId + ", mFromUserName=" + this.mFromUserName + ", mToUserId=" + this.mToUserId + ", mToUserName=" + this.mToUserName + ", mTime=" + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(this.mTime)) + ", mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleChatMessage(int i, int i2, int i3, @aa1 String mFromUserId, @aa1 String mFromUserName, @aa1 String mToUserId, @aa1 String mToUserName, long j, @aa1 String mContent) {
        Intrinsics.X0O(mFromUserId, "mFromUserId");
        Intrinsics.X0O(mFromUserName, "mFromUserName");
        Intrinsics.X0O(mToUserId, "mToUserId");
        Intrinsics.X0O(mToUserName, "mToUserName");
        Intrinsics.X0O(mContent, "mContent");
        this.mType = i;
        this.mMessageType = i2;
        this.mChatType = i3;
        this.mFromUserId = mFromUserId;
        this.mFromUserName = mFromUserName;
        this.mToUserId = mToUserId;
        this.mToUserName = mToUserName;
        this.mTime = j;
        this.mContent = mContent;
    }

    public /* synthetic */ BleChatMessage(int i, int i2, int i3, String str, String str2, String str3, String str4, long j, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? 0L : j, (i4 & 256) != 0 ? "" : str5);
    }
}
