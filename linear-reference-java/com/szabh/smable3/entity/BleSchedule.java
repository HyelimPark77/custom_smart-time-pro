package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSchedule extends BleIdObject {
    public static final int CONTENT_MAX_LENGTH = 250;

    @aa1
    public static final Companion Companion = null;
    public static final int TITLE_LENGTH = 32;
    private int mAdvance;

    @aa1
    private String mContent;
    private int mDay;
    private int mHour;
    private int mMinute;
    private int mMonth;

    @aa1
    private String mTitle;
    private int mYear;

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

    public BleSchedule() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleSchedule copy$default(BleSchedule r0, int r1, int r2, int r3, int r4, int r5, int r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mYear;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mMonth;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mDay;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mHour;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mMinute;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mAdvance;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mTitle;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mContent;
    L26:
        String r11 = r7;
        String r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mYear;
    }

    public final int component2() {
        return this.mMonth;
    }

    public final int component3() {
        return this.mDay;
    }

    public final int component4() {
        return this.mHour;
    }

    public final int component5() {
        return this.mMinute;
    }

    public final int component6() {
        return this.mAdvance;
    }

    @aa1
    public final String component7() {
        return this.mTitle;
    }

    @aa1
    public final String component8() {
        return this.mContent;
    }

    @aa1
    public final BleSchedule copy(int r11, int r12, int r13, int r14, int r15, int r16, @aa1 String r17, @aa1 String r18) {
        Intrinsics.X0O(r17, "mTitle");
        Intrinsics.X0O(r18, "mContent");
        return new BleSchedule(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        writeInt8(this.mYear - 2000);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        BleWritable.writeInt16$default(this, this.mAdvance, null, 2, null);
        BleWritable.writeStringWithFix$default(this, this.mTitle, 32, null, 4, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, 250, null, false, 12, null);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSchedule) == true) goto L8;
        return false;
    L8:
        BleSchedule r6 = (BleSchedule) r5;
        if (this.mYear == r6.mYear) goto L12;
        return false;
    L12:
        if (this.mMonth == r6.mMonth) goto L15;
        return false;
    L15:
        if (this.mDay == r6.mDay) goto L18;
        return false;
    L18:
        if (this.mHour == r6.mHour) goto L21;
        return false;
    L21:
        if (this.mMinute == r6.mMinute) goto L24;
        return false;
    L24:
        if (this.mAdvance == r6.mAdvance) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mTitle, r6.mTitle) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mContent, r6.mContent) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMAdvance() {
        return this.mAdvance;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMHour() {
        return this.mHour;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, 250) + 40;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mYear) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mAdvance)) * 31) + this.mTitle.hashCode()) * 31) + this.mContent.hashCode();
    }

    public final void setMAdvance(int r1) {
        this.mAdvance = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMMonth(int r1) {
        this.mMonth = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleSchedule(mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mAdvance=" + this.mAdvance + ", mTitle=" + this.mTitle + ", mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSchedule(int r2, int r3, int r4, int r5, int r6, int r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r8, "mTitle");
        Intrinsics.X0O(r9, "mContent");
        this.mYear = r2;
        this.mMonth = r3;
        this.mDay = r4;
        this.mHour = r5;
        this.mMinute = r6;
        this.mAdvance = r7;
        this.mTitle = r8;
        this.mContent = r9;
    }

    public /* synthetic */ BleSchedule(int r2, int r3, int r4, int r5, int r6, int r7, String r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r12 = "";
    L26:
        String r13 = r8;
        int r14 = r7;
        int r15 = r6;
        int r16 = r5;
        int r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
