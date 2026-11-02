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
    public static final Companion Companion = null;

    @aa1
    private String mContent;
    private int mGiftsId;
    private long mTime;
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

    public BleCPGiftsInfo() {
        int r1 = 0;
        int r2 = 0;
        long r3 = 0;
        String r5 = null;
        this(r1, r2, r3, r5, 15, null);
    }

    public static /* synthetic */ BleCPGiftsInfo copy$default(BleCPGiftsInfo r0, int r1, int r2, long r3, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mGiftsId;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mTime;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r0.mContent;
    L14:
        String r8 = r5;
        long r9 = r3;
        return r0.copy(r1, r2, r9, r8);
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
    public final BleCPGiftsInfo copy(int r8, int r9, long r10, @aa1 String r12) {
        Intrinsics.X0O(r12, "mContent");
        return new BleCPGiftsInfo(r8, r9, r10, r12);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mGiftsId = readInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        readInt8();
        this.mContent = BleReadable.readString$default(this, 96, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        int r0 = this.mGiftsId;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        long r3 = this.mTime;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeLong(r3, r1);
        byte[] r2 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        writeInt8(r2.length);
        BleWritable.writeStringWithMax$default(this, this.mContent, 96, null, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPGiftsInfo) == true) goto L8;
        return false;
    L8:
        BleCPGiftsInfo r9 = (BleCPGiftsInfo) r8;
        if (this.mType == r9.mType) goto L12;
        return false;
    L12:
        if (this.mGiftsId == r9.mGiftsId) goto L15;
        return false;
    L15:
        if (this.mTime == r9.mTime) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMGiftsId(int r1) {
        this.mGiftsId = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleCPGiftsInfo(mType=" + this.mType + ", mGiftsId=" + this.mGiftsId + ", mTime=" + this.mTime + ", mContent='" + this.mContent + "')";
    }

    public BleCPGiftsInfo(int r2, int r3, long r4, @aa1 String r6) {
        Intrinsics.X0O(r6, "mContent");
        this.mType = r2;
        this.mGiftsId = r3;
        this.mTime = r4;
        this.mContent = r6;
    }

    public /* synthetic */ BleCPGiftsInfo(int r2, int r3, long r4, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = "";
    L14:
        long r5 = r4;
        int r9 = r3;
        this(r2, r9, r5, r6);
    }
}
