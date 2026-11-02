package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPAnniversary extends BleWritable {
    public static final int CONTENT_MAX_LENGTH = 300;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TITLE_MAX_LENGTH = 40;
    public static final int TYPE_CREATE = 0;
    public static final int TYPE_DELETE = 2;
    public static final int TYPE_UPDATE = 1;
    private long mAnniversaryTime;

    @aa1
    private String mContent;
    private long mTime;

    @aa1
    private String mTitle;
    private int mType;
    private int mUser;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPAnniversary() {
        this(0, 0L, 0L, 0, null, null, 63, null);
    }

    public static /* synthetic */ BleCPAnniversary copy$default(BleCPAnniversary bleCPAnniversary, int i, long j, long j2, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleCPAnniversary.mUser;
        }
        if ((i3 & 2) != 0) {
            j = bleCPAnniversary.mTime;
        }
        if ((i3 & 4) != 0) {
            j2 = bleCPAnniversary.mAnniversaryTime;
        }
        if ((i3 & 8) != 0) {
            i2 = bleCPAnniversary.mType;
        }
        if ((i3 & 16) != 0) {
            str = bleCPAnniversary.mTitle;
        }
        if ((i3 & 32) != 0) {
            str2 = bleCPAnniversary.mContent;
        }
        String str3 = str2;
        int i4 = i2;
        long j3 = j2;
        return bleCPAnniversary.copy(i, j, j3, i4, str, str3);
    }

    public final int component1() {
        return this.mUser;
    }

    public final long component2() {
        return this.mTime;
    }

    public final long component3() {
        return this.mAnniversaryTime;
    }

    public final int component4() {
        return this.mType;
    }

    @aa1
    public final String component5() {
        return this.mTitle;
    }

    @aa1
    public final String component6() {
        return this.mContent;
    }

    @aa1
    public final BleCPAnniversary copy(int i, long j, long j2, int i2, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        return new BleCPAnniversary(i, j, j2, i2, mTitle, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAnniversaryTime = readInt64(LITTLE_ENDIAN);
        this.mType = readInt8();
        readBytes(7);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        readInt16(LITTLE_ENDIAN);
        this.mTitle = BleReadable.readString$default(this, 40, null, 2, null);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        readInt16(LITTLE_ENDIAN);
        this.mContent = BleReadable.readString$default(this, 300, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUser);
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        long j2 = this.mAnniversaryTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j2, LITTLE_ENDIAN);
        writeInt8(this.mType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        String str = this.mTitle;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = bytes.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(length, LITTLE_ENDIAN);
        BleWritable.writeStringWithMax$default(this, this.mTitle, 40, null, 4, null);
        byte[] bytes2 = this.mContent.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        int length2 = bytes2.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(length2, LITTLE_ENDIAN);
        BleWritable.writeStringWithMax$default(this, this.mContent, 300, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPAnniversary)) {
            return false;
        }
        BleCPAnniversary bleCPAnniversary = (BleCPAnniversary) obj;
        return this.mUser == bleCPAnniversary.mUser && this.mTime == bleCPAnniversary.mTime && this.mAnniversaryTime == bleCPAnniversary.mAnniversaryTime && this.mType == bleCPAnniversary.mType && Intrinsics.XOO0ii0(this.mTitle, bleCPAnniversary.mTitle) && Intrinsics.XOO0ii0(this.mContent, bleCPAnniversary.mContent);
    }

    public final long getMAnniversaryTime() {
        return this.mAnniversaryTime;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 369;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMUser() {
        return this.mUser;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mUser) * 31) + Long.hashCode(this.mTime)) * 31) + Long.hashCode(this.mAnniversaryTime)) * 31) + Integer.hashCode(this.mType)) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMAnniversaryTime(long j) {
        this.mAnniversaryTime = j;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUser(int i) {
        this.mUser = i;
    }

    @aa1
    public String toString() {
        return "BleCPAnniversary(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mAnniversaryTime=" + this.mAnniversaryTime + ", mType=" + this.mType + ", mTitle='" + this.mTitle + "', mContent='" + this.mContent + "')";
    }

    public BleCPAnniversary(int i, long j, long j2, int i2, @aa1 String mTitle, @aa1 String mContent) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mContent, "mContent");
        this.mUser = i;
        this.mTime = j;
        this.mAnniversaryTime = j2;
        this.mType = i2;
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public /* synthetic */ BleCPAnniversary(int i, long j, long j2, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2);
    }
}
