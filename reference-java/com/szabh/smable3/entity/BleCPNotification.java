package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPNotification extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_GALLERY = 1;

    @aa1
    private String mContent;
    private long mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPNotification() {
        this(0, 0L, null, 7, null);
    }

    public static /* synthetic */ BleCPNotification copy$default(BleCPNotification bleCPNotification, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleCPNotification.mType;
        }
        if ((i2 & 2) != 0) {
            j = bleCPNotification.mTime;
        }
        if ((i2 & 4) != 0) {
            str = bleCPNotification.mContent;
        }
        return bleCPNotification.copy(i, j, str);
    }

    public final int component1() {
        return this.mType;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mContent;
    }

    @aa1
    public final BleCPNotification copy(int i, long j, @aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        return new BleCPNotification(i, j, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[8], null, 2, null);
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = bytes.length;
        writeInt8(length);
        BleWritable.writeStringWithFix$default(this, this.mContent, length, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPNotification)) {
            return false;
        }
        BleCPNotification bleCPNotification = (BleCPNotification) obj;
        return this.mType == bleCPNotification.mType && this.mTime == bleCPNotification.mTime && Intrinsics.XOO0ii0(this.mContent, bleCPNotification.mContent);
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return bytes.length + 18;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mType) * 31) + Long.hashCode(this.mTime)) * 31) + this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleCPNotification(mType=" + this.mType + ", mTime=" + this.mTime + ", mContent='" + this.mContent + "')";
    }

    public BleCPNotification(int i, long j, @aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        this.mType = i;
        this.mTime = j;
        this.mContent = mContent;
    }

    public /* synthetic */ BleCPNotification(int i, long j, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str);
    }
}
