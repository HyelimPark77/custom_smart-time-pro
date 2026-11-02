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
public final class BleCPGiftsInfo extends BleWritable {
    public static final int CONTENT_MAX_LENGTH = 96;

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private String mContent;
    private int mGiftsId;
    private long mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPGiftsInfo() {
        this(0, 0, 0L, null, 15, null);
    }

    public static /* synthetic */ BleCPGiftsInfo copy$default(BleCPGiftsInfo bleCPGiftsInfo, int i, int i2, long j, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleCPGiftsInfo.mType;
        }
        if ((i3 & 2) != 0) {
            i2 = bleCPGiftsInfo.mGiftsId;
        }
        if ((i3 & 4) != 0) {
            j = bleCPGiftsInfo.mTime;
        }
        if ((i3 & 8) != 0) {
            str = bleCPGiftsInfo.mContent;
        }
        String str2 = str;
        return bleCPGiftsInfo.copy(i, i2, j, str2);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mGiftsId;
    }

    public final long component3() {
        return this.mTime;
    }

    @aa1
    public final String component4() {
        return this.mContent;
    }

    @aa1
    public final BleCPGiftsInfo copy(int i, int i2, long j, @aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        return new BleCPGiftsInfo(i, i2, j, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mGiftsId = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        readInt8();
        this.mContent = BleReadable.readString$default(this, 96, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        int i = this.mGiftsId;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        long j = this.mTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        writeInt8(bytes.length);
        BleWritable.writeStringWithMax$default(this, this.mContent, 96, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPGiftsInfo)) {
            return false;
        }
        BleCPGiftsInfo bleCPGiftsInfo = (BleCPGiftsInfo) obj;
        return this.mType == bleCPGiftsInfo.mType && this.mGiftsId == bleCPGiftsInfo.mGiftsId && this.mTime == bleCPGiftsInfo.mTime && Intrinsics.XOO0ii0(this.mContent, bleCPGiftsInfo.mContent);
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public final int getMGiftsId() {
        return this.mGiftsId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 116;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mGiftsId)) * 31) + Long.hashCode(this.mTime)) * 31) + this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMGiftsId(int i) {
        this.mGiftsId = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleCPGiftsInfo(mType=" + this.mType + ", mGiftsId=" + this.mGiftsId + ", mTime=" + this.mTime + ", mContent='" + this.mContent + "')";
    }

    public BleCPGiftsInfo(int i, int i2, long j, @aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        this.mType = i;
        this.mGiftsId = i2;
        this.mTime = j;
        this.mContent = mContent;
    }

    public /* synthetic */ BleCPGiftsInfo(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? "" : str);
    }
}
