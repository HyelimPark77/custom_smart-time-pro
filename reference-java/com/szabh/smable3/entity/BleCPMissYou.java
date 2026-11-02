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
    public static final Companion Companion = new Companion(null);

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPMissYou() {
        this(0, 0L, 0, 0, null, null, 0, null, null, 511, null);
    }

    public static /* synthetic */ BleCPMissYou copy$default(BleCPMissYou bleCPMissYou, int i, long j, int i2, int i3, String str, String str2, int i4, byte[] bArr, byte[] bArr2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleCPMissYou.mUser;
        }
        if ((i5 & 2) != 0) {
            j = bleCPMissYou.mTime;
        }
        if ((i5 & 4) != 0) {
            i2 = bleCPMissYou.mMissTime;
        }
        if ((i5 & 8) != 0) {
            i3 = bleCPMissYou.mCPMissTime;
        }
        if ((i5 & 16) != 0) {
            str = bleCPMissYou.mContent1;
        }
        if ((i5 & 32) != 0) {
            str2 = bleCPMissYou.mContent2;
        }
        if ((i5 & 64) != 0) {
            i4 = bleCPMissYou.mAudioType;
        }
        if ((i5 & 128) != 0) {
            bArr = bleCPMissYou.mImageData;
        }
        if ((i5 & 256) != 0) {
            bArr2 = bleCPMissYou.mAudioData;
        }
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i6 = i4;
        String str3 = str;
        int i7 = i2;
        return bleCPMissYou.copy(i, j, i7, i3, str3, str2, i6, bArr3, bArr4);
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
    public final BleCPMissYou copy(int i, long j, int i2, int i3, @aa1 String mContent1, @aa1 String mContent2, int i4, @aa1 byte[] mImageData, @aa1 byte[] mAudioData) {
        Intrinsics.X0O(mContent1, "mContent1");
        Intrinsics.X0O(mContent2, "mContent2");
        Intrinsics.X0O(mImageData, "mImageData");
        Intrinsics.X0O(mAudioData, "mAudioData");
        return new BleCPMissYou(i, j, i2, i3, mContent1, mContent2, i4, mImageData, mAudioData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMissTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCPMissTime = readInt32(LITTLE_ENDIAN);
        byte int8 = readInt8();
        byte int9 = readInt8();
        this.mContent1 = BleReadable.readString$default(this, int8, null, 2, null);
        this.mContent2 = BleReadable.readString$default(this, int9, null, 2, null);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        int int32 = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        int int33 = readInt32(LITTLE_ENDIAN);
        this.mAudioType = readInt8();
        this.mImageData = readBytes(int32);
        this.mAudioData = readBytes(int33);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        BleCPMissYou bleCPMissYou;
        super.encode();
        writeInt8(this.mUser);
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        int i = this.mMissTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
        int i2 = this.mCPMissTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i2, LITTLE_ENDIAN);
        String str = this.mContent1;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int iMin = Math.min(bytes.length, 60);
        writeInt8(iMin);
        byte[] bytes2 = this.mContent2.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        int iMin2 = Math.min(bytes2.length, 25);
        writeInt8(iMin2);
        if (iMin > 0) {
            bleCPMissYou = this;
            BleWritable.writeStringWithFix$default(bleCPMissYou, this.mContent1, iMin, null, 4, null);
        } else {
            bleCPMissYou = this;
        }
        if (iMin2 > 0) {
            BleWritable.writeStringWithFix$default(bleCPMissYou, bleCPMissYou.mContent2, iMin2, null, 4, null);
        }
        int length = bleCPMissYou.mImageData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        int length2 = bleCPMissYou.mAudioData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length2, LITTLE_ENDIAN);
        writeInt8(bleCPMissYou.mAudioType);
        if (length > 0) {
            BleWritable.writeBytes$default(this, bleCPMissYou.mImageData, null, 2, null);
        }
        if (length2 > 0) {
            BleWritable.writeBytes$default(this, bleCPMissYou.mAudioData, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPMissYou)) {
            return false;
        }
        BleCPMissYou bleCPMissYou = (BleCPMissYou) obj;
        return this.mUser == bleCPMissYou.mUser && this.mTime == bleCPMissYou.mTime && this.mMissTime == bleCPMissYou.mMissTime && this.mCPMissTime == bleCPMissYou.mCPMissTime && Intrinsics.XOO0ii0(this.mContent1, bleCPMissYou.mContent1) && Intrinsics.XOO0ii0(this.mContent2, bleCPMissYou.mContent2) && this.mAudioType == bleCPMissYou.mAudioType && Intrinsics.XOO0ii0(this.mImageData, bleCPMissYou.mImageData) && Intrinsics.XOO0ii0(this.mAudioData, bleCPMissYou.mAudioData);
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
        String str = this.mContent1;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int iMin = Math.min(bytes.length, 60) + 19;
        byte[] bytes2 = this.mContent2.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        return iMin + Math.min(bytes2.length, 25) + 4 + this.mImageData.length + 5 + this.mAudioData.length;
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

    public final void setMAudioData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mAudioData = bArr;
    }

    public final void setMAudioType(int i) {
        this.mAudioType = i;
    }

    public final void setMCPMissTime(int i) {
        this.mCPMissTime = i;
    }

    public final void setMContent1(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent1 = str;
    }

    public final void setMContent2(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent2 = str;
    }

    public final void setMImageData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageData = bArr;
    }

    public final void setMMissTime(int i) {
        this.mMissTime = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMUser(int i) {
        this.mUser = i;
    }

    @aa1
    public String toString() {
        return "BleCPMissYou(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mMissTime=" + this.mMissTime + ", mCPMissTime=" + this.mCPMissTime + ", mContent1='" + this.mContent1 + "', mContent2='" + this.mContent2 + "', mAudioType=" + this.mAudioType + ", mImageData=" + this.mImageData.length + ", mAudioData=" + this.mAudioData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPMissYou(int i, long j, int i2, int i3, @aa1 String mContent1, @aa1 String mContent2, int i4, @aa1 byte[] mImageData, @aa1 byte[] mAudioData) {
        Intrinsics.X0O(mContent1, "mContent1");
        Intrinsics.X0O(mContent2, "mContent2");
        Intrinsics.X0O(mImageData, "mImageData");
        Intrinsics.X0O(mAudioData, "mAudioData");
        this.mUser = i;
        this.mTime = j;
        this.mMissTime = i2;
        this.mCPMissTime = i3;
        this.mContent1 = mContent1;
        this.mContent2 = mContent2;
        this.mAudioType = i4;
        this.mImageData = mImageData;
        this.mAudioData = mAudioData;
    }

    public /* synthetic */ BleCPMissYou(int i, long j, int i2, int i3, String str, String str2, int i4, byte[] bArr, byte[] bArr2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0L : j, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? "" : str2, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? new byte[0] : bArr, (i5 & 256) != 0 ? new byte[0] : bArr2);
    }
}
