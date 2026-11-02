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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleChatMessage() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        long r8 = 0;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r10, 511, null);
    }

    public static /* synthetic */ BleChatMessage copy$default(BleChatMessage r0, int r1, int r2, int r3, String r4, String r5, String r6, String r7, long r8, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mMessageType;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mChatType;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mFromUserId;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mFromUserName;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mToUserId;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mToUserName;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mTime;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.mContent;
    L29:
        String r13 = r10;
        long r14 = r8;
        String r9 = r6;
        String r15 = r7;
        String r16 = r4;
        String r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r9, r15, r14, r13);
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
    public final BleChatMessage copy(int r13, int r14, int r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, long r20, @aa1 String r22) {
        Intrinsics.X0O(r16, "mFromUserId");
        Intrinsics.X0O(r17, "mFromUserName");
        Intrinsics.X0O(r18, "mToUserId");
        Intrinsics.X0O(r19, "mToUserName");
        Intrinsics.X0O(r22, "mContent");
        return new BleChatMessage(r13, r14, r15, r16, r17, r18, r19, r20, r22);
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
        BleTime.Companion r0 = BleTime.Companion;
        BleReadable r3 = (BleReadable) BleTime.class.newInstance();
        r3.setMBytes(readBytes(6));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mTime = r0.timeInMillis((BleTime) r3);
        readBytes(9);
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        this.mContent = BleReadable.readString$default(this, readInt16(r1), null, 2, null);
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
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r9 = r0.length;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r9, r1);
        BleWritable.writeStringWithFix$default(this, this.mContent, r9, null, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleChatMessage) == true) goto L8;
        return false;
    L8:
        BleChatMessage r9 = (BleChatMessage) r8;
        if (this.mType == r9.mType) goto L12;
        return false;
    L12:
        if (this.mMessageType == r9.mMessageType) goto L15;
        return false;
    L15:
        if (this.mChatType == r9.mChatType) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFromUserId, r9.mFromUserId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mFromUserName, r9.mFromUserName) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mToUserId, r9.mToUserId) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mToUserName, r9.mToUserName) == true) goto L30;
        return false;
    L30:
        if (this.mTime == r9.mTime) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L35;
        return false;
    L35:
        return true;
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
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return r0.length + 140;
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

    public final void setMChatType(int r1) {
        this.mChatType = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMFromUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFromUserId = r2;
    }

    public final void setMFromUserName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFromUserName = r2;
    }

    public final void setMMessageType(int r1) {
        this.mMessageType = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMToUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mToUserId = r2;
    }

    public final void setMToUserName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mToUserName = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleChatMessage(mType=" + this.mType + ", mMessageType=" + this.mMessageType + ", mChatType=" + this.mChatType + ", mFromUserId=" + this.mFromUserId + ", mFromUserName=" + this.mFromUserName + ", mToUserId=" + this.mToUserId + ", mToUserName=" + this.mToUserName + ", mTime=" + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(this.mTime)) + ", mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleChatMessage(int r2, int r3, int r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, long r9, @aa1 String r11) {
        Intrinsics.X0O(r5, "mFromUserId");
        Intrinsics.X0O(r6, "mFromUserName");
        Intrinsics.X0O(r7, "mToUserId");
        Intrinsics.X0O(r8, "mToUserName");
        Intrinsics.X0O(r11, "mContent");
        this.mType = r2;
        this.mMessageType = r3;
        this.mChatType = r4;
        this.mFromUserId = r5;
        this.mFromUserName = r6;
        this.mToUserId = r7;
        this.mToUserName = r8;
        this.mTime = r9;
        this.mContent = r11;
    }

    public /* synthetic */ BleChatMessage(int r2, int r3, int r4, String r5, String r6, String r7, String r8, long r9, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r12 & 256) == 0) goto L30;
        String r14 = "";
    L29:
        long r10 = r9;
        String r15 = r8;
        String r16 = r7;
        String r17 = r6;
        String r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r10, r14);
        return;
    L30:
        r14 = r11;
        goto L29
    }
}
