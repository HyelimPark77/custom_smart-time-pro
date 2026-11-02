package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPMissYou extends BleWritable {
    public static final int CONTENT_2_MAX_LENGTH = 25;
    public static final int CONTENT_MAX_LENGTH = 60;

    @aa1
    public static final Companion Companion = null;

    @aa1
    private byte[] mAudioData;
    private int mAudioType;
    private int mCPMissTime;

    @aa1
    private String mContent1;

    @aa1
    private String mContent2;

    @aa1
    private byte[] mImageData;
    private int mMissTime;
    private long mTime;
    private int mUser;

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

    public BleCPMissYou() {
        int r1 = 0;
        long r2 = 0;
        int r4 = 0;
        int r5 = 0;
        String r6 = null;
        String r7 = null;
        int r8 = 0;
        byte[] r9 = null;
        byte[] r10 = null;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, 511, null);
    }

    public static /* synthetic */ BleCPMissYou copy$default(BleCPMissYou r0, int r1, long r2, int r4, int r5, String r6, String r7, int r8, byte[] r9, byte[] r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mUser;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = r0.mMissTime;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.mCPMissTime;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.mContent1;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.mContent2;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.mAudioType;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.mImageData;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.mAudioData;
    L29:
        byte[] r13 = r9;
        byte[] r14 = r10;
        String r15 = r7;
        int r16 = r8;
        String r17 = r6;
        int r18 = r4;
        long r19 = r2;
        int r3 = r1;
        return r0.copy(r3, r19, r18, r5, r17, r15, r16, r13, r14);
    }

    public final int component1() {
        return this.mUser;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mMissTime;
    }

    public final int component4() {
        return this.mCPMissTime;
    }

    @aa1
    public final String component5() {
        return this.mContent1;
    }

    @aa1
    public final String component6() {
        return this.mContent2;
    }

    public final int component7() {
        return this.mAudioType;
    }

    @aa1
    public final byte[] component8() {
        return this.mImageData;
    }

    @aa1
    public final byte[] component9() {
        return this.mAudioData;
    }

    @aa1
    public final BleCPMissYou copy(int r13, long r14, int r16, int r17, @aa1 String r18, @aa1 String r19, int r20, @aa1 byte[] r21, @aa1 byte[] r22) {
        Intrinsics.X0O(r18, "mContent1");
        Intrinsics.X0O(r19, "mContent2");
        Intrinsics.X0O(r21, "mImageData");
        Intrinsics.X0O(r22, "mAudioData");
        return new BleCPMissYou(r13, r14, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMissTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCPMissTime = readInt32(r0);
        byte r2 = readInt8();
        byte r3 = readInt8();
        this.mContent1 = BleReadable.readString$default(this, r2, null, 2, null);
        this.mContent2 = BleReadable.readString$default(this, r3, null, 2, null);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        int r4 = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        int r1 = readInt32(r0);
        this.mAudioType = readInt8();
        this.mImageData = readBytes(r4);
        this.mAudioData = readBytes(r1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUser);
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        int r1 = this.mMissTime;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r1, r2);
        int r3 = this.mCPMissTime;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r3, r2);
        String r4 = this.mContent1;
        Charset r5 = Charsets.XIi00iiXO;
        byte[] r6 = r4.getBytes(r5);
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");
        int r8 = Math.min(r6.length, 60);
        writeInt8(r8);
        byte[] r7 = this.mContent2.getBytes(r5);
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");
        int r9 = Math.min(r7.length, 25);
        writeInt8(r9);
        if (r8 <= 0) goto L5;
        BleCPMissYou r10 = this;
        BleWritable.writeStringWithFix$default(r10, this.mContent1, r8, null, 4, null);
    L6:
        if (r9 <= 0) goto L8;
        BleCPMissYou r11 = r10;
        BleWritable.writeStringWithFix$default(r11, r10.mContent2, r9, null, 4, null);
    L8:
        int r12 = r10.mImageData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r12, r2);
        int r13 = r10.mAudioData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r13, r2);
        writeInt8(r10.mAudioType);
        if (r12 <= 0) goto L11;
        BleWritable.writeBytes$default(this, r10.mImageData, null, 2, null);
    L11:
        if (r13 <= 0) goto L14;
        BleWritable.writeBytes$default(this, r10.mAudioData, null, 2, null);
        return;
    L14:
        return;
    L5:
        r10 = this;
        goto L6
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPMissYou) == true) goto L8;
        return false;
    L8:
        BleCPMissYou r9 = (BleCPMissYou) r8;
        if (this.mUser == r9.mUser) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mMissTime == r9.mMissTime) goto L18;
        return false;
    L18:
        if (this.mCPMissTime == r9.mCPMissTime) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mContent1, r9.mContent1) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent2, r9.mContent2) == true) goto L27;
        return false;
    L27:
        if (this.mAudioType == r9.mAudioType) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mImageData, r9.mImageData) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mAudioData, r9.mAudioData) == true) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final byte[] getMAudioData() {
        return this.mAudioData;
    }

    public final int getMAudioType() {
        return this.mAudioType;
    }

    public final int getMCPMissTime() {
        return this.mCPMissTime;
    }

    @aa1
    public final String getMContent1() {
        return this.mContent1;
    }

    @aa1
    public final String getMContent2() {
        return this.mContent2;
    }

    @aa1
    public final byte[] getMImageData() {
        return this.mImageData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        String r0 = this.mContent1;
        Charset r1 = Charsets.XIi00iiXO;
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        int r3 = Math.min(r2.length, 60) + 19;
        byte[] r4 = this.mContent2.getBytes(r1);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        return ((((r3 + Math.min(r4.length, 25)) + 4) + this.mImageData.length) + 5) + this.mAudioData.length;
    }

    public final int getMMissTime() {
        return this.mMissTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMUser() {
        return this.mUser;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mUser) * 31) + Long.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mMissTime)) * 31) + Integer.hashCode(this.mCPMissTime)) * 31) + this.mContent1.hashCode()) * 31) + this.mContent2.hashCode()) * 31) + Integer.hashCode(this.mAudioType)) * 31) + Arrays.hashCode(this.mImageData)) * 31) + Arrays.hashCode(this.mAudioData);
    }

    public final void setMAudioData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAudioData = r2;
    }

    public final void setMAudioType(int r1) {
        this.mAudioType = r1;
    }

    public final void setMCPMissTime(int r1) {
        this.mCPMissTime = r1;
    }

    public final void setMContent1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent1 = r2;
    }

    public final void setMContent2(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent2 = r2;
    }

    public final void setMImageData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageData = r2;
    }

    public final void setMMissTime(int r1) {
        this.mMissTime = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMUser(int r1) {
        this.mUser = r1;
    }

    @aa1
    public String toString() {
        return "BleCPMissYou(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mMissTime=" + this.mMissTime + ", mCPMissTime=" + this.mCPMissTime + ", mContent1='" + this.mContent1 + "', mContent2='" + this.mContent2 + "', mAudioType=" + this.mAudioType + ", mImageData=" + this.mImageData.length + ", mAudioData=" + this.mAudioData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPMissYou(int r2, long r3, int r5, int r6, @aa1 String r7, @aa1 String r8, int r9, @aa1 byte[] r10, @aa1 byte[] r11) {
        Intrinsics.X0O(r7, "mContent1");
        Intrinsics.X0O(r8, "mContent2");
        Intrinsics.X0O(r10, "mImageData");
        Intrinsics.X0O(r11, "mAudioData");
        this.mUser = r2;
        this.mTime = r3;
        this.mMissTime = r5;
        this.mCPMissTime = r6;
        this.mContent1 = r7;
        this.mContent2 = r8;
        this.mAudioType = r9;
        this.mImageData = r10;
        this.mAudioData = r11;
    }

    public /* synthetic */ BleCPMissYou(int r3, long r4, int r6, int r7, String r8, String r9, int r10, byte[] r11, byte[] r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r6 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r7 = 0;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r8 = "";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r9 = "";
    L21:
        if ((r13 & 64) == 0) goto L24;
        r10 = 0;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r11 = new byte[0];
    L27:
        if ((r13 & 256) == 0) goto L29;
        r12 = new byte[0];
    L29:
        byte[] r15 = r12;
        byte[] r16 = r11;
        int r17 = r10;
        String r18 = r9;
        String r19 = r8;
        long r5 = r4;
        int r20 = r3;
        this(r20, r5, r6, r7, r19, r18, r17, r16, r15);
    }
}
