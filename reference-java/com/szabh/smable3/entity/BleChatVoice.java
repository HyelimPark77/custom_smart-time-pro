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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleChatVoice() {
        this(0L, 0, 0, 0, 0, 0, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ BleChatVoice copy$default(BleChatVoice bleChatVoice, long j, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, byte[] bArr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j = bleChatVoice.mTime;
        }
        return bleChatVoice.copy(j, (i6 & 2) != 0 ? bleChatVoice.mLength : i, (i6 & 4) != 0 ? bleChatVoice.mStatus : i2, (i6 & 8) != 0 ? bleChatVoice.mMode : i3, (i6 & 16) != 0 ? bleChatVoice.mType : i4, (i6 & 32) != 0 ? bleChatVoice.mChatType : i5, (i6 & 64) != 0 ? bleChatVoice.mFromUserId : str, (i6 & 128) != 0 ? bleChatVoice.mFromUserName : str2, (i6 & 256) != 0 ? bleChatVoice.mToUserId : str3, (i6 & 512) != 0 ? bleChatVoice.mToUserName : str4, (i6 & 1024) != 0 ? bleChatVoice.mPacket : bArr);
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
    public final BleChatVoice copy(long j, int i, int i2, int i3, int i4, int i5, @aa1 String mFromUserId, @aa1 String mFromUserName, @aa1 String mToUserId, @aa1 String mToUserName, @aa1 byte[] mPacket) {
        Intrinsics.X0O(mFromUserId, "mFromUserId");
        Intrinsics.X0O(mFromUserName, "mFromUserName");
        Intrinsics.X0O(mToUserId, "mToUserId");
        Intrinsics.X0O(mToUserName, "mToUserName");
        Intrinsics.X0O(mPacket, "mPacket");
        return new BleChatVoice(j, i, i2, i3, i4, i5, mFromUserId, mFromUserName, mToUserId, mToUserName, mPacket);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleTime.Companion companion = BleTime.Companion;
        BleReadable bleReadable = (BleReadable) BleTime.class.newInstance();
        bleReadable.setMBytes(readBytes(6));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mTime = companion.timeInMillis((BleTime) bleReadable);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLength = readUInt16(LITTLE_ENDIAN);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleChatVoice)) {
            return false;
        }
        BleChatVoice bleChatVoice = (BleChatVoice) obj;
        return this.mTime == bleChatVoice.mTime && this.mLength == bleChatVoice.mLength && this.mStatus == bleChatVoice.mStatus && this.mMode == bleChatVoice.mMode && this.mType == bleChatVoice.mType && this.mChatType == bleChatVoice.mChatType && Intrinsics.XOO0ii0(this.mFromUserId, bleChatVoice.mFromUserId) && Intrinsics.XOO0ii0(this.mFromUserName, bleChatVoice.mFromUserName) && Intrinsics.XOO0ii0(this.mToUserId, bleChatVoice.mToUserId) && Intrinsics.XOO0ii0(this.mToUserName, bleChatVoice.mToUserName) && Intrinsics.XOO0ii0(this.mPacket, bleChatVoice.mPacket);
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

    public final void setMChatType(int i) {
        this.mChatType = i;
    }

    public final void setMFromUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFromUserId = str;
    }

    public final void setMFromUserName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFromUserName = str;
    }

    public final void setMLength(int i) {
        this.mLength = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPacket(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mPacket = bArr;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
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
        return "BleChatVoice(mTime=" + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(this.mTime)) + ", mLength=" + this.mLength + ", mStatus=" + this.mStatus + ", mMode=" + this.mMode + ", mType=" + this.mType + ", mChatType=" + this.mChatType + ", mFromUserId=" + this.mFromUserId + ", mFromUserName=" + this.mFromUserName + ", mToUserId=" + this.mToUserId + ", mToUserName=" + this.mToUserName + ", mPacket=" + this.mPacket.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleChatVoice(long j, int i, int i2, int i3, int i4, int i5, @aa1 String mFromUserId, @aa1 String mFromUserName, @aa1 String mToUserId, @aa1 String mToUserName, @aa1 byte[] mPacket) {
        Intrinsics.X0O(mFromUserId, "mFromUserId");
        Intrinsics.X0O(mFromUserName, "mFromUserName");
        Intrinsics.X0O(mToUserId, "mToUserId");
        Intrinsics.X0O(mToUserName, "mToUserName");
        Intrinsics.X0O(mPacket, "mPacket");
        this.mTime = j;
        this.mLength = i;
        this.mStatus = i2;
        this.mMode = i3;
        this.mType = i4;
        this.mChatType = i5;
        this.mFromUserId = mFromUserId;
        this.mFromUserName = mFromUserName;
        this.mToUserId = mToUserId;
        this.mToUserName = mToUserName;
        this.mPacket = mPacket;
    }

    public /* synthetic */ BleChatVoice(long j, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, byte[] bArr, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? "" : str, (i6 & 128) != 0 ? "" : str2, (i6 & 256) != 0 ? "" : str3, (i6 & 512) == 0 ? str4 : "", (i6 & 1024) != 0 ? new byte[0] : bArr);
    }
}
