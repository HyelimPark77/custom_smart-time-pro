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
    public static final Companion Companion = null;
    private int mContentType;

    @aa1
    private byte[] mData;
    private long mTime;
    private int mUser;
    private int mVoiceDuration;

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

    public BleCPChat(int r2, long r3, int r5, int r6, @aa1 byte[] r7) {
        Intrinsics.X0O(r7, "mData");
        this.mUser = r2;
        this.mTime = r3;
        this.mContentType = r5;
        this.mVoiceDuration = r6;
        this.mData = r7;
    }

    public static /* synthetic */ BleCPChat copy$default(BleCPChat r0, int r1, long r2, int r4, int r5, byte[] r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mUser;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r0.mContentType;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.mVoiceDuration;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.mData;
    L17:
        byte[] r9 = r6;
        int r10 = r4;
        long r11 = r2;
        int r3 = r1;
        return r0.copy(r3, r11, r10, r5, r9);
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
    public final BleCPChat copy(int r9, long r10, int r12, int r13, @aa1 byte[] r14) {
        Intrinsics.X0O(r14, "mData");
        return new BleCPChat(r9, r10, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        this.mContentType = readInt8();
        readBytes(5);
        this.mVoiceDuration = readUInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mData = readBytes(readInt32(r0));
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUser);
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        writeInt8(this.mContentType);
        BleWritable.writeBytes$default(this, new byte[5], null, 2, null);
        writeInt8(this.mVoiceDuration);
        int r1 = this.mData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r1, r2);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPChat) == true) goto L8;
        return false;
    L8:
        BleCPChat r9 = (BleCPChat) r8;
        if (this.mUser == r9.mUser) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mContentType == r9.mContentType) goto L18;
        return false;
    L18:
        if (this.mVoiceDuration == r9.mVoiceDuration) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mData, r9.mData) == true) goto L23;
        return false;
    L23:
        return true;
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

    public final void setMContentType(int r1) {
        this.mContentType = r1;
    }

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMUser(int r1) {
        this.mUser = r1;
    }

    public final void setMVoiceDuration(int r1) {
        this.mVoiceDuration = r1;
    }

    @aa1
    public String toString() {
        return "BleCPChat(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mContentType=" + this.mContentType + ", mVoiceDuration=" + this.mVoiceDuration + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleCPChat(int r2, long r3, int r5, int r6, byte[] r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 16) == 0) goto L14;
        r7 = new byte[0];
    L14:
        long r4 = r3;
        int r10 = r2;
        this(r10, r4, r5, r6, r7);
    }
}
