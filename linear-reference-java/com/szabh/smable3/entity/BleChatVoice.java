package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleChatVoice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleChatVoice.kt\ncom/szabh/smable3/entity/BleChatVoice\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,56:1\n222#2,4:57\n*S KotlinDebug\n*F\n+ 1 BleChatVoice.kt\ncom/szabh/smable3/entity/BleChatVoice\n*L\n22#1:57,4\n*E\n"})
public final class BleChatVoice extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_TO_TEXT = 1;
    public static final int TRANSFER_STATUS_END = 2;
    public static final int TRANSFER_STATUS_GO_ON = 1;
    public static final int TRANSFER_STATUS_START = 0;
    public static final int TRANSFER_STATUS_SUSPEND = 3;
    public static final int TYPE_WECHAT = 15;
    public static final int TYPE_WHATSAPP = 6;
    private int mChatType;

    @aa1
    private String mFromUserId;

    @aa1
    private String mFromUserName;
    private int mLength;
    private int mMode;

    @aa1
    private byte[] mPacket;
    private int mStatus;
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

    public BleChatVoice() {
        long r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        byte[] r12 = null;
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, 2047, null);
    }

    public static /* synthetic */ BleChatVoice copy$default(BleChatVoice r13, long r14, int r16, int r17, int r18, int r19, int r20, String r21, String r22, String r23, String r24, byte[] r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L5;
        r14 = r13.mTime;
    L5:
        long r1 = r14;
        if ((r26 & 2) == 0) goto L8;
        int r3 = r13.mLength;
    L10:
        if ((r26 & 4) == 0) goto L12;
        int r4 = r13.mStatus;
    L14:
        if ((r26 & 8) == 0) goto L16;
        int r5 = r13.mMode;
    L18:
        if ((r26 & 16) == 0) goto L20;
        int r6 = r13.mType;
    L22:
        if ((r26 & 32) == 0) goto L24;
        int r7 = r13.mChatType;
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r8 = r13.mFromUserId;
    L30:
        if ((r26 & 128) == 0) goto L32;
        String r9 = r13.mFromUserName;
    L34:
        if ((r26 & 256) == 0) goto L36;
        String r10 = r13.mToUserId;
    L38:
        if ((r26 & 512) == 0) goto L40;
        String r11 = r13.mToUserName;
    L42:
        if ((r26 & 1024) == 0) goto L45;
        byte[] r12 = r13.mPacket;
    L47:
        return r13.copy(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L45:
        r12 = r25;
        goto L47
    L40:
        r11 = r24;
        goto L42
    L36:
        r10 = r23;
        goto L38
    L32:
        r9 = r22;
        goto L34
    L28:
        r8 = r21;
        goto L30
    L24:
        r7 = r20;
        goto L26
    L20:
        r6 = r19;
        goto L22
    L16:
        r5 = r18;
        goto L18
    L12:
        r4 = r17;
        goto L14
    L8:
        r3 = r16;
        goto L10
    }

    public final long component1() {
        return this.mTime;
    }

    @aa1
    public final String component10() {
        return this.mToUserName;
    }

    @aa1
    public final byte[] component11() {
        return this.mPacket;
    }

    public final int component2() {
        return this.mLength;
    }

    public final int component3() {
        return this.mStatus;
    }

    public final int component4() {
        return this.mMode;
    }

    public final int component5() {
        return this.mType;
    }

    public final int component6() {
        return this.mChatType;
    }

    @aa1
    public final String component7() {
        return this.mFromUserId;
    }

    @aa1
    public final String component8() {
        return this.mFromUserName;
    }

    @aa1
    public final String component9() {
        return this.mToUserId;
    }

    @aa1
    public final BleChatVoice copy(long r15, int r17, int r18, int r19, int r20, int r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 byte[] r26) {
        Intrinsics.X0O(r22, "mFromUserId");
        Intrinsics.X0O(r23, "mFromUserName");
        Intrinsics.X0O(r24, "mToUserId");
        Intrinsics.X0O(r25, "mToUserName");
        Intrinsics.X0O(r26, "mPacket");
        return new BleChatVoice(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleTime.Companion r0 = BleTime.Companion;
        BleReadable r1 = (BleReadable) BleTime.class.newInstance();
        r1.setMBytes(readBytes(6));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mTime = r0.timeInMillis((BleTime) r1);
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        this.mLength = readUInt16(r2);
        this.mStatus = readUInt8();
        this.mMode = readUInt8();
        this.mType = readInt8();
        this.mChatType = readInt8();
        this.mFromUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mFromUserName = BleReadable.readString$default(this, 36, null, 2, null);
        this.mToUserId = BleReadable.readString$default(this, 24, null, 2, null);
        this.mToUserName = BleReadable.readString$default(this, 36, null, 2, null);
        readBytes(32);
        this.mPacket = readBytes(this.mLength);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleChatVoice) == true) goto L8;
        return false;
    L8:
        BleChatVoice r9 = (BleChatVoice) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mLength == r9.mLength) goto L15;
        return false;
    L15:
        if (this.mStatus == r9.mStatus) goto L18;
        return false;
    L18:
        if (this.mMode == r9.mMode) goto L21;
        return false;
    L21:
        if (this.mType == r9.mType) goto L24;
        return false;
    L24:
        if (this.mChatType == r9.mChatType) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mFromUserId, r9.mFromUserId) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mFromUserName, r9.mFromUserName) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mToUserId, r9.mToUserId) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mToUserName, r9.mToUserName) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mPacket, r9.mPacket) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMChatType() {
        return this.mChatType;
    }

    @aa1
    public final String getMFromUserId() {
        return this.mFromUserId;
    }

    @aa1
    public final String getMFromUserName() {
        return this.mFromUserName;
    }

    public final int getMLength() {
        return this.mLength;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final byte[] getMPacket() {
        return this.mPacket;
    }

    public final int getMStatus() {
        return this.mStatus;
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
        return (((((((((((((((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mLength)) * 31) + Integer.hashCode(this.mStatus)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mChatType)) * 31) + this.mFromUserId.hashCode()) * 31) + this.mFromUserName.hashCode()) * 31) + this.mToUserId.hashCode()) * 31) + this.mToUserName.hashCode()) * 31) + Arrays.hashCode(this.mPacket);
    }

    public final void setMChatType(int r1) {
        this.mChatType = r1;
    }

    public final void setMFromUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFromUserId = r2;
    }

    public final void setMFromUserName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFromUserName = r2;
    }

    public final void setMLength(int r1) {
        this.mLength = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPacket(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPacket = r2;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
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
        return "BleChatVoice(mTime=" + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(this.mTime)) + ", mLength=" + this.mLength + ", mStatus=" + this.mStatus + ", mMode=" + this.mMode + ", mType=" + this.mType + ", mChatType=" + this.mChatType + ", mFromUserId=" + this.mFromUserId + ", mFromUserName=" + this.mFromUserName + ", mToUserId=" + this.mToUserId + ", mToUserName=" + this.mToUserName + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleChatVoice(long r2, int r4, int r5, int r6, int r7, int r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 byte[] r13) {
        Intrinsics.X0O(r9, "mFromUserId");
        Intrinsics.X0O(r10, "mFromUserName");
        Intrinsics.X0O(r11, "mToUserId");
        Intrinsics.X0O(r12, "mToUserName");
        Intrinsics.X0O(r13, "mPacket");
        this.mTime = r2;
        this.mLength = r4;
        this.mStatus = r5;
        this.mMode = r6;
        this.mType = r7;
        this.mChatType = r8;
        this.mFromUserId = r9;
        this.mFromUserName = r10;
        this.mToUserId = r11;
        this.mToUserName = r12;
        this.mPacket = r13;
    }

    public /* synthetic */ BleChatVoice(long r15, int r17, int r18, int r19, int r20, int r21, String r22, String r23, String r24, String r25, byte[] r26, int r27, DefaultConstructorMarker r28) {
        if ((r27 & 1) == 0) goto L5;
        long r1 = 0;
    L7:
        if ((r27 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r27 & 4) == 0) goto L13;
        int r5 = 0;
    L15:
        if ((r27 & 8) == 0) goto L17;
        int r6 = 0;
    L19:
        if ((r27 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r27 & 32) == 0) goto L25;
        int r8 = 0;
    L26:
        String r10 = "";
        if ((r27 & 64) == 0) goto L29;
        String r9 = "";
    L31:
        if ((r27 & 128) == 0) goto L33;
        String r11 = "";
    L35:
        if ((r27 & 256) == 0) goto L37;
        String r12 = "";
    L39:
        if ((r27 & 512) != 0) goto L43;
        r10 = r25;
    L43:
        if ((r27 & 1024) == 0) goto L46;
        byte[] r29 = new byte[0];
    L47:
        this(r1, r3, r5, r6, r7, r8, r9, r11, r12, r10, r29);
        return;
    L46:
        r29 = r26;
        goto L47
    L37:
        r12 = r24;
        goto L39
    L33:
        r11 = r23;
        goto L35
    L29:
        r9 = r22;
        goto L31
    L25:
        r8 = r21;
        goto L26
    L21:
        r7 = r20;
        goto L23
    L17:
        r6 = r19;
        goto L19
    L13:
        r5 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }
}
