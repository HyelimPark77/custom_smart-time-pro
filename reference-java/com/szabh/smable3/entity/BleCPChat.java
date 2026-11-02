package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPChat extends BleWritable {
    public static final int CONTENT_TYPE_AAC = 6;
    public static final int CONTENT_TYPE_DELETE = 7;
    public static final int CONTENT_TYPE_EMOJI = 3;
    public static final int CONTENT_TYPE_IMAGE = 1;
    public static final int CONTENT_TYPE_LOCATION = 4;
    public static final int CONTENT_TYPE_OPUS = 5;
    public static final int CONTENT_TYPE_TEXT = 0;
    public static final int CONTENT_TYPE_UNDO = 8;
    public static final int CONTENT_TYPE_VIDEO = 2;

    @aa1
    public static final Companion Companion = new Companion(null);
    private int mContentType;

    @aa1
    private byte[] mData;
    private long mTime;
    private int mUser;
    private int mVoiceDuration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPChat(int i, long j, int i2, int i3, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        this.mUser = i;
        this.mTime = j;
        this.mContentType = i2;
        this.mVoiceDuration = i3;
        this.mData = mData;
    }

    public static /* synthetic */ BleCPChat copy$default(BleCPChat bleCPChat, int i, long j, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleCPChat.mUser;
        }
        if ((i4 & 2) != 0) {
            j = bleCPChat.mTime;
        }
        if ((i4 & 4) != 0) {
            i2 = bleCPChat.mContentType;
        }
        if ((i4 & 8) != 0) {
            i3 = bleCPChat.mVoiceDuration;
        }
        if ((i4 & 16) != 0) {
            bArr = bleCPChat.mData;
        }
        byte[] bArr2 = bArr;
        int i5 = i2;
        return bleCPChat.copy(i, j, i5, i3, bArr2);
    }

    public final int component1() {
        return this.mUser;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mContentType;
    }

    public final int component4() {
        return this.mVoiceDuration;
    }

    @aa1
    public final byte[] component5() {
        return this.mData;
    }

    @aa1
    public final BleCPChat copy(int i, long j, int i2, int i3, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        return new BleCPChat(i, j, i2, i3, mData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        this.mContentType = readInt8();
        readBytes(5);
        this.mVoiceDuration = readUInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mData = readBytes(readInt32(LITTLE_ENDIAN));
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUser);
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        writeInt8(this.mContentType);
        BleWritable.writeBytes$default(this, new byte[5], null, 2, null);
        writeInt8(this.mVoiceDuration);
        int length = this.mData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPChat)) {
            return false;
        }
        BleCPChat bleCPChat = (BleCPChat) obj;
        return this.mUser == bleCPChat.mUser && this.mTime == bleCPChat.mTime && this.mContentType == bleCPChat.mContentType && this.mVoiceDuration == bleCPChat.mVoiceDuration && Intrinsics.XOO0ii0(this.mData, bleCPChat.mData);
    }

    public final int getMContentType() {
        return this.mContentType;
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mData.length + 20;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMUser() {
        return this.mUser;
    }

    public final int getMVoiceDuration() {
        return this.mVoiceDuration;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mUser) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mContentType)) * 31) + Integer.hashCode(this.mVoiceDuration)) * 31) + Arrays.hashCode(this.mData);
    }

    public final void setMContentType(int i) {
        this.mContentType = i;
    }

    public final void setMData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mData = bArr;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMUser(int i) {
        this.mUser = i;
    }

    public final void setMVoiceDuration(int i) {
        this.mVoiceDuration = i;
    }

    @aa1
    public String toString() {
        return "BleCPChat(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mContentType=" + this.mContentType + ", mVoiceDuration=" + this.mVoiceDuration + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleCPChat(int i, long j, int i2, int i3, byte[] bArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 0 : i2, i3, (i4 & 16) != 0 ? new byte[0] : bArr);
    }
}
