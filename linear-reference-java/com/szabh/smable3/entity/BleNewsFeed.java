package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleNewsFeed extends BleWritable {
    public static final int CONTENT_MAX_LENGTH = 470;

    @aa1
    public static final Companion Companion = null;
    public static final int TITLE_LENGTH = 32;
    private int mCategory;

    @aa1
    private String mContent;
    private long mTime;

    @aa1
    private String mTitle;
    private int mUid;

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

    public BleNewsFeed() {
        int r1 = 0;
        int r2 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r5, r6, 31, null);
    }

    public static /* synthetic */ BleNewsFeed copy$default(BleNewsFeed r0, int r1, int r2, long r3, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mCategory;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mUid;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.mTitle;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.mContent;
    L17:
        long r9 = r3;
        int r4 = r1;
        int r10 = r2;
        return r0.copy(r4, r10, r9, r5, r6);
    }

    public final int component1() {
        return this.mCategory;
    }

    public final int component2() {
        return this.mUid;
    }

    public final long component3() {
        return this.mTime;
    }

    @aa1
    public final String component4() {
        return this.mTitle;
    }

    @aa1
    public final String component5() {
        return this.mContent;
    }

    @aa1
    public final BleNewsFeed copy(int r9, int r10, long r11, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r13, "mTitle");
        Intrinsics.X0O(r14, "mContent");
        return new BleNewsFeed(r9, r10, r11, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCategory);
        int r0 = this.mUid;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt24(r0, r1);
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        BleWritable.writeStringWithFix$default(this, this.mTitle, 32, null, 4, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, CONTENT_MAX_LENGTH, null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleNewsFeed) == true) goto L8;
        return false;
    L8:
        BleNewsFeed r9 = (BleNewsFeed) r8;
        if (this.mCategory == r9.mCategory) goto L12;
        return false;
    L12:
        if (this.mUid == r9.mUid) goto L15;
        return false;
    L15:
        if (this.mTime == r9.mTime) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTitle, r9.mTitle) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L23;
        return false;
    L23:
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
        return Math.min(r0.length, CONTENT_MAX_LENGTH) + 42;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMUid() {
        return this.mUid;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mCategory) * 31) + Integer.hashCode(this.mUid)) * 31) + Long.hashCode(this.mTime)) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMCategory(int r1) {
        this.mCategory = r1;
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

    public final void setMUid(int r1) {
        this.mUid = r1;
    }

    @aa1
    public String toString() {
        return "BleNotification(mCategory=" + this.mCategory + ", mUid=" + this.mUid + ", mTime=" + this.mTime + ", mTitle='" + this.mTitle + "', mContent='" + this.mContent + "')";
    }

    public BleNewsFeed(int r2, int r3, long r4, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r6, "mTitle");
        Intrinsics.X0O(r7, "mContent");
        this.mCategory = r2;
        this.mUid = r3;
        this.mTime = r4;
        this.mTitle = r6;
        this.mContent = r7;
    }

    public /* synthetic */ BleNewsFeed(int r2, int r3, long r4, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r10 = "";
    L17:
        long r5 = r4;
        this(r2, r3, r5, r6, r10);
        return;
    L18:
        r10 = r7;
        goto L17
    }
}
