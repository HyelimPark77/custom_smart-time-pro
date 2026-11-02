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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleCPAnniversary() {
        int r1 = 0;
        long r2 = 0;
        long r4 = 0;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r4, r6, r7, r8, 63, null);
    }

    public static /* synthetic */ BleCPAnniversary copy$default(BleCPAnniversary r0, int r1, long r2, long r4, int r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mUser;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r0.mAnniversaryTime;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = r0.mType;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = r0.mTitle;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r8 = r0.mContent;
    L20:
        String r11 = r8;
        int r12 = r6;
        long r13 = r4;
        long r5 = r2;
        int r3 = r1;
        return r0.copy(r3, r5, r13, r12, r7, r11);
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
    public final BleCPAnniversary copy(int r11, long r12, long r14, int r16, @aa1 String r17, @aa1 String r18) {
        Intrinsics.X0O(r17, "mTitle");
        Intrinsics.X0O(r18, "mContent");
        return new BleCPAnniversary(r11, r12, r14, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mUser = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAnniversaryTime = readInt64(r0);
        this.mType = readInt8();
        readBytes(7);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        readInt16(r0);
        this.mTitle = BleReadable.readString$default(this, 40, null, 2, null);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        readInt16(r0);
        this.mContent = BleReadable.readString$default(this, 300, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUser);
        long r1 = this.mTime;
        ByteOrder r6 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r6, "LITTLE_ENDIAN");
        writeLong(r1, r6);
        long r2 = this.mAnniversaryTime;
        Intrinsics.O10IXXX0X(r6, "LITTLE_ENDIAN");
        writeLong(r2, r6);
        writeInt8(this.mType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        String r3 = this.mTitle;
        Charset r8 = Charsets.XIi00iiXO;
        byte[] r4 = r3.getBytes(r8);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        int r5 = r4.length;
        Intrinsics.O10IXXX0X(r6, "LITTLE_ENDIAN");
        writeInt16(r5, r6);
        BleWritable.writeStringWithMax$default(this, this.mTitle, 40, null, 4, null);
        byte[] r7 = this.mContent.getBytes(r8);
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");
        int r9 = r7.length;
        Intrinsics.O10IXXX0X(r6, "LITTLE_ENDIAN");
        writeInt16(r9, r6);
        BleWritable.writeStringWithMax$default(this, this.mContent, 300, null, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPAnniversary) == true) goto L8;
        return false;
    L8:
        BleCPAnniversary r9 = (BleCPAnniversary) r8;
        if (this.mUser == r9.mUser) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (this.mAnniversaryTime == r9.mAnniversaryTime) goto L18;
        return false;
    L18:
        if (this.mType == r9.mType) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mTitle, r9.mTitle) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L26;
        return false;
    L26:
        return true;
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

    public final void setMAnniversaryTime(long r1) {
        this.mAnniversaryTime = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUser(int r1) {
        this.mUser = r1;
    }

    @aa1
    public String toString() {
        return "BleCPAnniversary(mUser=" + this.mUser + ", mTime=" + this.mTime + ", mAnniversaryTime=" + this.mAnniversaryTime + ", mType=" + this.mType + ", mTitle='" + this.mTitle + "', mContent='" + this.mContent + "')";
    }

    public BleCPAnniversary(int r2, long r3, long r5, int r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r8, "mTitle");
        Intrinsics.X0O(r9, "mContent");
        this.mUser = r2;
        this.mTime = r3;
        this.mAnniversaryTime = r5;
        this.mType = r7;
        this.mTitle = r8;
        this.mContent = r9;
    }

    public /* synthetic */ BleCPAnniversary(int r4, long r5, long r7, int r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r9 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r10 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        String r14 = "";
    L22:
        this(r4, r5, r7, r9, r10, r14);
        return;
    L21:
        r14 = r11;
        goto L22
    }
}
