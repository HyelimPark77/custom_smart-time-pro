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
        this(0, 0L, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BleNotification2 copy$default(BleNotification2 bleNotification2, int i, long j, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleNotification2.mCategory;
        }
        if ((i2 & 2) != 0) {
            j = bleNotification2.mTime;
        }
        if ((i2 & 4) != 0) {
            str = bleNotification2.mPackage;
        }
        if ((i2 & 8) != 0) {
            str2 = bleNotification2.mTitle;
        }
        if ((i2 & 16) != 0) {
            str3 = bleNotification2.mPhone;
        }
        if ((i2 & 32) != 0) {
            str4 = bleNotification2.mContent;
        }
        return bleNotification2.copy(i, j, str, str2, str3, str4);
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
    public final BleNotification2 copy(int i, long j, @aa1 String mPackage, @aa1 String mTitle, @aa1 String mPhone, @aa1 String mContent) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mPhone, "mPhone");
        Intrinsics.X0O(mContent, "mContent");
        return new BleNotification2(i, j, mPackage, mTitle, mPhone, mContent);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleNotification2)) {
            return false;
        }
        BleNotification2 bleNotification2 = (BleNotification2) obj;
        return this.mCategory == bleNotification2.mCategory && this.mTime == bleNotification2.mTime && Intrinsics.XOO0ii0(this.mPackage, bleNotification2.mPackage) && Intrinsics.XOO0ii0(this.mTitle, bleNotification2.mTitle) && Intrinsics.XOO0ii0(this.mPhone, bleNotification2.mPhone) && Intrinsics.XOO0ii0(this.mContent, bleNotification2.mContent);
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
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, 250) + 103;
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

    public final void setMCategory(int i) {
        this.mCategory = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMPackage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPackage = str;
    }

    public final void setMPhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPhone = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    @aa1
    public String toString() {
        return "BleNotification(mCategory=" + this.mCategory + ", mTime=" + this.mTime + ", mPackage='" + this.mPackage + "', mTitle='" + this.mTitle + "',mPhone='" + this.mPhone + "', mContent='" + this.mContent + "')";
    }

    public BleNotification2(int i, long j, @aa1 String mPackage, @aa1 String mTitle, @aa1 String mPhone, @aa1 String mContent) {
        Intrinsics.X0O(mPackage, "mPackage");
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mPhone, "mPhone");
        Intrinsics.X0O(mContent, "mContent");
        this.mCategory = i;
        this.mTime = j;
        this.mPackage = mPackage;
        this.mTitle = mTitle;
        this.mPhone = mPhone;
        this.mContent = mContent;
    }

    public /* synthetic */ BleNotification2(int i, long j, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
