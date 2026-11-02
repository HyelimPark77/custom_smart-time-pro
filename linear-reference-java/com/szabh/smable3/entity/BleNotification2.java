package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNotification2 extends BleWritable {
    private int mCategory;

    @aa1
    private String mContent;

    @aa1
    private String mPackage;

    @aa1
    private String mPhone;
    private long mTime;

    @aa1
    private String mTitle;

    public BleNotification2() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        this(r1, r2, r4, r5, r6, r7, 63, null);
    }

    public static /* synthetic */ BleNotification2 copy$default(BleNotification2 r0, int r1, long r2, String r4, String r5, String r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mCategory;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = r0.mPackage;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.mTitle;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = r0.mPhone;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.mContent;
    L20:
        String r10 = r6;
        String r11 = r7;
        long r12 = r2;
        int r3 = r1;
        return r0.copy(r3, r12, r4, r5, r10, r11);
    }

    public final int component1() {
        return this.mCategory;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mPackage;
    }

    @aa1
    public final String component4() {
        return this.mTitle;
    }

    @aa1
    public final String component5() {
        return this.mPhone;
    }

    @aa1
    public final String component6() {
        return this.mContent;
    }

    @aa1
    public final BleNotification2 copy(int r10, long r11, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16) {
        Intrinsics.X0O(r13, "mPackage");
        Intrinsics.X0O(r14, "mTitle");
        Intrinsics.X0O(r15, "mPhone");
        Intrinsics.X0O(r16, "mContent");
        return new BleNotification2(r10, r11, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCategory);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        BleWritable.writeStringWithFix$default(this, this.mPackage, 32, null, 4, null);
        BleWritable.writeStringWithMax$default(this, this.mTitle, 32, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mPhone, 32, null, 4, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, 250, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleNotification2) == true) goto L8;
        return false;
    L8:
        BleNotification2 r9 = (BleNotification2) r8;
        if (this.mCategory == r9.mCategory) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mPackage, r9.mPackage) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTitle, r9.mTitle) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mPhone, r9.mPhone) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMCategory() {
        return this.mCategory;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 250) + 103;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    @aa1
    public final String getMPhone() {
        return this.mPhone;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mCategory) * 31) + Long.hashCode(this.mTime)) * 31) + this.mPackage.hashCode()) * 31) + this.mTitle.hashCode()) * 31) + this.mPhone.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMCategory(int r1) {
        this.mCategory = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    public final void setMPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPhone = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    @aa1
    public String toString() {
        return "BleNotification(mCategory=" + this.mCategory + ", mTime=" + this.mTime + ", mPackage='" + this.mPackage + "', mTitle='" + this.mTitle + "',mPhone='" + this.mPhone + "', mContent='" + this.mContent + "')";
    }

    public BleNotification2(int r2, long r3, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r5, "mPackage");
        Intrinsics.X0O(r6, "mTitle");
        Intrinsics.X0O(r7, "mPhone");
        Intrinsics.X0O(r8, "mContent");
        this.mCategory = r2;
        this.mTime = r3;
        this.mPackage = r5;
        this.mTitle = r6;
        this.mPhone = r7;
        this.mContent = r8;
    }

    public /* synthetic */ BleNotification2(int r2, long r3, String r5, String r6, String r7, String r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        String r11 = "";
    L22:
        this(r2, r3, r5, r6, r7, r11);
        return;
    L21:
        r11 = r8;
        goto L22
    }
}
