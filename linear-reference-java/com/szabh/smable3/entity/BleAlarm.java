package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAlarm extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 28;
    public static final int TAG_LENGTH = 21;
    private int mDay;
    private int mEnabled;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mRepeat;

    @aa1
    private String mTag;
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

    public BleAlarm() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ BleAlarm copy$default(BleAlarm r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mRepeat;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mYear;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mMonth;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mDay;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mHour;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mMinute;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mTag;
    L26:
        int r11 = r7;
        String r12 = r8;
        int r13 = r5;
        int r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mRepeat;
    }

    public final int component3() {
        return this.mYear;
    }

    public final int component4() {
        return this.mMonth;
    }

    public final int component5() {
        return this.mDay;
    }

    public final int component6() {
        return this.mHour;
    }

    public final int component7() {
        return this.mMinute;
    }

    @aa1
    public final String component8() {
        return this.mTag;
    }

    @aa1
    public final BleAlarm copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, @aa1 String r18) {
        Intrinsics.X0O(r18, "mTag");
        return new BleAlarm(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        this.mEnabled = readIntN(1);
        this.mRepeat = readIntN(7);
        this.mYear = readUInt8() + 2000;
        this.mMonth = readUInt8();
        this.mDay = readUInt8();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
        this.mTag = BleReadable.readString$default(this, 21, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        writeIntN(this.mEnabled, 1);
        writeIntN(this.mRepeat, 7);
        writeInt8(this.mYear - 2000);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        BleWritable.writeStringWithFix$default(this, this.mTag, 21, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAlarm) == true) goto L8;
        return false;
    L8:
        BleAlarm r6 = (BleAlarm) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mRepeat == r6.mRepeat) goto L15;
        return false;
    L15:
        if (this.mYear == r6.mYear) goto L18;
        return false;
    L18:
        if (this.mMonth == r6.mMonth) goto L21;
        return false;
    L21:
        if (this.mDay == r6.mDay) goto L24;
        return false;
    L24:
        if (this.mHour == r6.mHour) goto L27;
        return false;
    L27:
        if (this.mMinute == r6.mMinute) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mTag, r6.mTag) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMHour() {
        return this.mHour;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 28;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    @aa1
    public final String getMTag() {
        return this.mTag;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mRepeat)) * 31) + Integer.hashCode(this.mYear)) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + this.mTag.hashCode();
    }

    public final void setMDay(int r1) {
        this.mDay = r1;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
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

    public final void setMRepeat(int r1) {
        this.mRepeat = r1;
    }

    public final void setMTag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTag = r2;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleAlarm(mAlarmId=" + getMId() + ", mEnabled=" + this.mEnabled + ", mRepeat=" + this.mRepeat + ", mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mTag='" + this.mTag + "')";
    }

    public BleAlarm(int r2, int r3, int r4, int r5, int r6, int r7, int r8, @aa1 String r9) {
        Intrinsics.X0O(r9, "mTag");
        this.mEnabled = r2;
        this.mRepeat = r3;
        this.mYear = r4;
        this.mMonth = r5;
        this.mDay = r6;
        this.mHour = r7;
        this.mMinute = r8;
        this.mTag = r9;
    }

    public /* synthetic */ BleAlarm(int r2, int r3, int r4, int r5, int r6, int r7, int r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 1;
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
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = "";
    L26:
        int r12 = r8;
        String r13 = r9;
        int r14 = r6;
        int r15 = r7;
        this(r2, r3, r4, r5, r14, r15, r12, r13);
    }
}
