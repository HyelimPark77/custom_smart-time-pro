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
    public static final Companion Companion = null;
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_GALLERY = 1;

    @aa1
    private String mContent;
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

    public BleCPNotification() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        this(r1, r2, r4, 7, null);
    }

    public static /* synthetic */ BleCPNotification copy$default(BleCPNotification r0, int r1, long r2, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.mContent;
    L12:
        return r0.copy(r1, r2, r4);
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
    public final BleCPNotification copy(int r2, long r3, @aa1 String r5) {
        Intrinsics.X0O(r5, "mContent");
        return new BleCPNotification(r2, r3, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        BleWritable.writeBytes$default(this, new byte[8], null, 2, null);
        byte[] r1 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        int r4 = r1.length;
        writeInt8(r4);
        BleWritable.writeStringWithFix$default(this, this.mContent, r4, null, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPNotification) == true) goto L8;
        return false;
    L8:
        BleCPNotification r9 = (BleCPNotification) r8;
        if (this.mType == r9.mType) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return r0.length + 18;
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

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleCPNotification(mType=" + this.mType + ", mTime=" + this.mTime + ", mContent='" + this.mContent + "')";
    }

    public BleCPNotification(int r2, long r3, @aa1 String r5) {
        Intrinsics.X0O(r5, "mContent");
        this.mType = r2;
        this.mTime = r3;
        this.mContent = r5;
    }

    public /* synthetic */ BleCPNotification(int r1, long r2, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r1, r2, r4);
    }
}
