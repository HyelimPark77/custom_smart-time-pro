package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMedicationReminder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,117:1\n222#2,4:118\n222#2,4:122\n222#2,4:126\n222#2,4:130\n222#2,4:134\n222#2,4:138\n*S KotlinDebug\n*F\n+ 1 BleMedicationReminder.kt\ncom/szabh/smable3/entity/BleMedicationReminder\n*L\n61#1:118,4\n62#1:122,4\n63#1:126,4\n64#1:130,4\n65#1:134,4\n66#1:138,4\n*E\n"})
public final class BleMedicationReminder extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 72;
    private static final int LABLE_LENGTH = 21;
    private static final int NAME_LENGTH = 24;
    public static final int TYPE_CAPSULE = 1;
    public static final int TYPE_CREAM = 3;
    public static final int TYPE_DROPS = 2;
    public static final int TYPE_INJECTABLE = 6;
    public static final int TYPE_SOLUTION = 5;
    public static final int TYPE_SPRAY = 4;
    public static final int TYPE_TABLET = 0;
    public static final int UNIT_GRAM = 2;
    public static final int UNIT_INTERNATIONAL = 6;
    public static final int UNIT_MICROGRAM = 1;
    public static final int UNIT_MILLICURIE = 7;
    public static final int UNIT_MILLIEQUIVALENT = 8;
    public static final int UNIT_MILLIGRAM = 0;
    public static final int UNIT_MILLILITER = 3;
    public static final int UNIT_PERCENTAGE = 4;
    public static final int UNIT_PIECE = 5;
    private int mDosage;
    private int mEndDay;
    private int mEndMonth;
    private int mEndYear;

    @aa1
    private String mLabel;

    @aa1
    private String mName;

    @aa1
    private BleHmTime mRemindTime1;

    @aa1
    private BleHmTime mRemindTime2;

    @aa1
    private BleHmTime mRemindTime3;

    @aa1
    private BleHmTime mRemindTime4;

    @aa1
    private BleHmTime mRemindTime5;

    @aa1
    private BleHmTime mRemindTime6;
    private int mRemindTimes;
    private int mRepeat;
    private int mStartDay;
    private int mStartMonth;
    private int mStartYear;
    private int mType;
    private int mUnit;

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

    public BleMedicationReminder() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        BleHmTime r6 = null;
        BleHmTime r7 = null;
        BleHmTime r8 = null;
        BleHmTime r9 = null;
        BleHmTime r10 = null;
        BleHmTime r11 = null;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        String r18 = null;
        String r19 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, 524287, null);
    }

    public static /* synthetic */ BleMedicationReminder copy$default(BleMedicationReminder r17, int r18, int r19, int r20, int r21, int r22, BleHmTime r23, BleHmTime r24, BleHmTime r25, BleHmTime r26, BleHmTime r27, BleHmTime r28, int r29, int r30, int r31, int r32, int r33, int r34, String r35, String r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        int r2 = r17.mType;
    L7:
        if ((r37 & 2) == 0) goto L9;
        int r3 = r17.mUnit;
    L11:
        if ((r37 & 4) == 0) goto L13;
        int r4 = r17.mDosage;
    L15:
        if ((r37 & 8) == 0) goto L17;
        int r5 = r17.mRepeat;
    L19:
        if ((r37 & 16) == 0) goto L21;
        int r6 = r17.mRemindTimes;
    L23:
        if ((r37 & 32) == 0) goto L25;
        BleHmTime r7 = r17.mRemindTime1;
    L27:
        if ((r37 & 64) == 0) goto L29;
        BleHmTime r8 = r17.mRemindTime2;
    L31:
        if ((r37 & 128) == 0) goto L33;
        BleHmTime r9 = r17.mRemindTime3;
    L35:
        if ((r37 & 256) == 0) goto L37;
        BleHmTime r10 = r17.mRemindTime4;
    L39:
        if ((r37 & 512) == 0) goto L41;
        BleHmTime r11 = r17.mRemindTime5;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        BleHmTime r12 = r17.mRemindTime6;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        int r13 = r17.mStartYear;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        int r14 = r17.mStartMonth;
    L55:
        if ((r37 & 8192) == 0) goto L57;
        int r15 = r17.mStartDay;
    L58:
        int r110 = r2;
        if ((r37 & 16384) == 0) goto L61;
        int r16 = r17.mEndYear;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        int r1 = r17.mEndMonth;
    L66:
        int r111 = r1;
        if ((r37 & 65536) == 0) goto L69;
        int r39 = r17.mEndDay;
    L70:
        int r210 = r39;
        if ((r37 & 131072) == 0) goto L73;
        String r40 = r17.mName;
    L75:
        if ((r37 & 262144) == 0) goto L78;
        String r211 = r40;
        String r310 = r211;
        String r311 = r17.mLabel;
    L80:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r310, r311);
    L78:
        r311 = r36;
        r310 = r40;
        goto L80
    L73:
        r40 = r35;
        goto L75
    L69:
        r39 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleHmTime component10() {
        return this.mRemindTime5;
    }

    @aa1
    public final BleHmTime component11() {
        return this.mRemindTime6;
    }

    public final int component12() {
        return this.mStartYear;
    }

    public final int component13() {
        return this.mStartMonth;
    }

    public final int component14() {
        return this.mStartDay;
    }

    public final int component15() {
        return this.mEndYear;
    }

    public final int component16() {
        return this.mEndMonth;
    }

    public final int component17() {
        return this.mEndDay;
    }

    @aa1
    public final String component18() {
        return this.mName;
    }

    @aa1
    public final String component19() {
        return this.mLabel;
    }

    public final int component2() {
        return this.mUnit;
    }

    public final int component3() {
        return this.mDosage;
    }

    public final int component4() {
        return this.mRepeat;
    }

    public final int component5() {
        return this.mRemindTimes;
    }

    @aa1
    public final BleHmTime component6() {
        return this.mRemindTime1;
    }

    @aa1
    public final BleHmTime component7() {
        return this.mRemindTime2;
    }

    @aa1
    public final BleHmTime component8() {
        return this.mRemindTime3;
    }

    @aa1
    public final BleHmTime component9() {
        return this.mRemindTime4;
    }

    @aa1
    public final BleMedicationReminder copy(int r22, int r23, int r24, int r25, int r26, @aa1 BleHmTime r27, @aa1 BleHmTime r28, @aa1 BleHmTime r29, @aa1 BleHmTime r30, @aa1 BleHmTime r31, @aa1 BleHmTime r32, int r33, int r34, int r35, int r36, int r37, int r38, @aa1 String r39, @aa1 String r40) {
        Intrinsics.X0O(r27, "mRemindTime1");
        Intrinsics.X0O(r28, "mRemindTime2");
        Intrinsics.X0O(r29, "mRemindTime3");
        Intrinsics.X0O(r30, "mRemindTime4");
        Intrinsics.X0O(r31, "mRemindTime5");
        Intrinsics.X0O(r32, "mRemindTime6");
        Intrinsics.X0O(r39, "mName");
        Intrinsics.X0O(r40, "mLabel");
        return new BleMedicationReminder(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        this.mType = readUInt8();
        this.mUnit = readUInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mDosage = (int) readUInt32(r0);
        this.mRepeat = readUInt8();
        this.mRemindTimes = readUInt8();
        BleReadable r1 = (BleReadable) BleHmTime.class.newInstance();
        r1.setMBytes(readBytes(2));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mRemindTime1 = (BleHmTime) r1;
        BleReadable r2 = (BleReadable) BleHmTime.class.newInstance();
        r2.setMBytes(readBytes(2));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mRemindTime2 = (BleHmTime) r2;
        BleReadable r3 = (BleReadable) BleHmTime.class.newInstance();
        r3.setMBytes(readBytes(2));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mRemindTime3 = (BleHmTime) r3;
        BleReadable r4 = (BleReadable) BleHmTime.class.newInstance();
        r4.setMBytes(readBytes(2));
        r4.decode();
        Intrinsics.XXI(r4);
        this.mRemindTime4 = (BleHmTime) r4;
        BleReadable r5 = (BleReadable) BleHmTime.class.newInstance();
        r5.setMBytes(readBytes(2));
        r5.decode();
        Intrinsics.XXI(r5);
        this.mRemindTime5 = (BleHmTime) r5;
        BleReadable r6 = (BleReadable) BleHmTime.class.newInstance();
        r6.setMBytes(readBytes(2));
        r6.decode();
        Intrinsics.XXI(r6);
        this.mRemindTime6 = (BleHmTime) r6;
        this.mStartYear = readUInt8() + 2000;
        this.mStartMonth = readUInt8();
        this.mStartDay = readUInt8();
        this.mEndYear = readUInt8() + 2000;
        this.mEndMonth = readUInt8();
        this.mEndDay = readUInt8();
        this.mName = BleReadable.readString$default(this, 24, null, 2, null);
        this.mLabel = BleReadable.readString$default(this, 21, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        writeInt8(this.mType);
        writeInt8(this.mUnit);
        int r0 = this.mDosage;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        writeInt8(this.mRepeat);
        writeInt8(this.mRemindTimes);
        writeObject(this.mRemindTime1);
        writeObject(this.mRemindTime2);
        writeObject(this.mRemindTime3);
        writeObject(this.mRemindTime4);
        writeObject(this.mRemindTime5);
        writeObject(this.mRemindTime6);
        writeInt8(this.mStartYear - 2000);
        writeInt8(this.mStartMonth);
        writeInt8(this.mStartDay);
        writeInt8(this.mEndYear - 2000);
        writeInt8(this.mEndMonth);
        writeInt8(this.mEndDay);
        BleWritable.writeStringWithFix$default(this, this.mName, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mLabel, 21, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMedicationReminder) == true) goto L8;
        return false;
    L8:
        BleMedicationReminder r6 = (BleMedicationReminder) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mUnit == r6.mUnit) goto L15;
        return false;
    L15:
        if (this.mDosage == r6.mDosage) goto L18;
        return false;
    L18:
        if (this.mRepeat == r6.mRepeat) goto L21;
        return false;
    L21:
        if (this.mRemindTimes == r6.mRemindTimes) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mRemindTime1, r6.mRemindTime1) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mRemindTime2, r6.mRemindTime2) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mRemindTime3, r6.mRemindTime3) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mRemindTime4, r6.mRemindTime4) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mRemindTime5, r6.mRemindTime5) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mRemindTime6, r6.mRemindTime6) == true) goto L42;
        return false;
    L42:
        if (this.mStartYear == r6.mStartYear) goto L45;
        return false;
    L45:
        if (this.mStartMonth == r6.mStartMonth) goto L48;
        return false;
    L48:
        if (this.mStartDay == r6.mStartDay) goto L51;
        return false;
    L51:
        if (this.mEndYear == r6.mEndYear) goto L54;
        return false;
    L54:
        if (this.mEndMonth == r6.mEndMonth) goto L57;
        return false;
    L57:
        if (this.mEndDay == r6.mEndDay) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.mLabel, r6.mLabel) == true) goto L65;
        return false;
    L65:
        return true;
    }

    public final int getMDosage() {
        return this.mDosage;
    }

    public final int getMEndDay() {
        return this.mEndDay;
    }

    public final int getMEndMonth() {
        return this.mEndMonth;
    }

    public final int getMEndYear() {
        return this.mEndYear;
    }

    @aa1
    public final String getMLabel() {
        return this.mLabel;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 72;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    @aa1
    public final BleHmTime getMRemindTime1() {
        return this.mRemindTime1;
    }

    @aa1
    public final BleHmTime getMRemindTime2() {
        return this.mRemindTime2;
    }

    @aa1
    public final BleHmTime getMRemindTime3() {
        return this.mRemindTime3;
    }

    @aa1
    public final BleHmTime getMRemindTime4() {
        return this.mRemindTime4;
    }

    @aa1
    public final BleHmTime getMRemindTime5() {
        return this.mRemindTime5;
    }

    @aa1
    public final BleHmTime getMRemindTime6() {
        return this.mRemindTime6;
    }

    public final int getMRemindTimes() {
        return this.mRemindTimes;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    public final int getMStartDay() {
        return this.mStartDay;
    }

    public final int getMStartMonth() {
        return this.mStartMonth;
    }

    public final int getMStartYear() {
        return this.mStartYear;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMUnit() {
        return this.mUnit;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mUnit)) * 31) + Integer.hashCode(this.mDosage)) * 31) + Integer.hashCode(this.mRepeat)) * 31) + Integer.hashCode(this.mRemindTimes)) * 31) + this.mRemindTime1.hashCode()) * 31) + this.mRemindTime2.hashCode()) * 31) + this.mRemindTime3.hashCode()) * 31) + this.mRemindTime4.hashCode()) * 31) + this.mRemindTime5.hashCode()) * 31) + this.mRemindTime6.hashCode()) * 31) + Integer.hashCode(this.mStartYear)) * 31) + Integer.hashCode(this.mStartMonth)) * 31) + Integer.hashCode(this.mStartDay)) * 31) + Integer.hashCode(this.mEndYear)) * 31) + Integer.hashCode(this.mEndMonth)) * 31) + Integer.hashCode(this.mEndDay)) * 31) + this.mName.hashCode()) * 31) + this.mLabel.hashCode();
    }

    public final void setMDosage(int r1) {
        this.mDosage = r1;
    }

    public final void setMEndDay(int r1) {
        this.mEndDay = r1;
    }

    public final void setMEndMonth(int r1) {
        this.mEndMonth = r1;
    }

    public final void setMEndYear(int r1) {
        this.mEndYear = r1;
    }

    public final void setMLabel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLabel = r2;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMRemindTime1(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime1 = r2;
    }

    public final void setMRemindTime2(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime2 = r2;
    }

    public final void setMRemindTime3(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime3 = r2;
    }

    public final void setMRemindTime4(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime4 = r2;
    }

    public final void setMRemindTime5(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime5 = r2;
    }

    public final void setMRemindTime6(@aa1 BleHmTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemindTime6 = r2;
    }

    public final void setMRemindTimes(int r1) {
        this.mRemindTimes = r1;
    }

    public final void setMRepeat(int r1) {
        this.mRepeat = r1;
    }

    public final void setMStartDay(int r1) {
        this.mStartDay = r1;
    }

    public final void setMStartMonth(int r1) {
        this.mStartMonth = r1;
    }

    public final void setMStartYear(int r1) {
        this.mStartYear = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUnit(int r1) {
        this.mUnit = r1;
    }

    @aa1
    public String toString() {
        return "BleMedicationReminder(mId=" + getMId() + ", mType=" + this.mType + ", mUnit=" + this.mUnit + ", mDosage=" + this.mDosage + ", mRepeat=" + this.mRepeat + ", mRemindTimes=" + this.mRemindTimes + ", mRemindTime1=" + this.mRemindTime1 + ", mRemindTime2=" + this.mRemindTime2 + ", mRemindTime3=" + this.mRemindTime3 + ", mRemindTime4=" + this.mRemindTime4 + ", mRemindTime5=" + this.mRemindTime5 + ", mRemindTime6=" + this.mRemindTime6 + ", mStartYear=" + this.mStartYear + ", mStartMonth=" + this.mStartMonth + ", mStartDay=" + this.mStartDay + ", mEndYear=" + this.mEndYear + ", mEndMonth=" + this.mEndMonth + ", mEndDay=" + this.mEndDay + ", mName='" + this.mName + "', mLabel='" + this.mLabel + "')";
    }

    public BleMedicationReminder(int r8, int r9, int r10, int r11, int r12, @aa1 BleHmTime r13, @aa1 BleHmTime r14, @aa1 BleHmTime r15, @aa1 BleHmTime r16, @aa1 BleHmTime r17, @aa1 BleHmTime r18, int r19, int r20, int r21, int r22, int r23, int r24, @aa1 String r25, @aa1 String r26) {
        Intrinsics.X0O(r13, "mRemindTime1");
        Intrinsics.X0O(r14, "mRemindTime2");
        Intrinsics.X0O(r15, "mRemindTime3");
        Intrinsics.X0O(r16, "mRemindTime4");
        Intrinsics.X0O(r17, "mRemindTime5");
        Intrinsics.X0O(r18, "mRemindTime6");
        Intrinsics.X0O(r25, "mName");
        Intrinsics.X0O(r26, "mLabel");
        this.mType = r8;
        this.mUnit = r9;
        this.mDosage = r10;
        this.mRepeat = r11;
        this.mRemindTimes = r12;
        this.mRemindTime1 = r13;
        this.mRemindTime2 = r14;
        this.mRemindTime3 = r15;
        this.mRemindTime4 = r16;
        this.mRemindTime5 = r17;
        this.mRemindTime6 = r18;
        this.mStartYear = r19;
        this.mStartMonth = r20;
        this.mStartDay = r21;
        this.mEndYear = r22;
        this.mEndMonth = r23;
        this.mEndDay = r24;
        this.mName = r25;
        this.mLabel = r26;
    }

    public /* synthetic */ BleMedicationReminder(int r22, int r23, int r24, int r25, int r26, BleHmTime r27, BleHmTime r28, BleHmTime r29, BleHmTime r30, BleHmTime r31, BleHmTime r32, int r33, int r34, int r35, int r36, int r37, int r38, String r39, String r40, int r41, DefaultConstructorMarker r42) {
        if ((r41 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r41 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r41 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r41 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r41 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r41 & 32) == 0) goto L25;
        BleHmTime r7 = new BleHmTime(0, 0, 3, null);
    L27:
        if ((r41 & 64) == 0) goto L29;
        BleHmTime r10 = new BleHmTime(0, 0, 3, null);
    L31:
        if ((r41 & 128) == 0) goto L33;
        BleHmTime r11 = new BleHmTime(0, 0, 3, null);
    L35:
        if ((r41 & 256) == 0) goto L37;
        BleHmTime r12 = new BleHmTime(0, 0, 3, null);
    L39:
        if ((r41 & 512) == 0) goto L41;
        BleHmTime r13 = new BleHmTime(0, 0, 3, null);
    L43:
        if ((r41 & 1024) == 0) goto L45;
        BleHmTime r14 = new BleHmTime(0, 0, 3, null);
    L47:
        if ((r41 & 2048) == 0) goto L49;
        int r8 = 0;
    L51:
        if ((r41 & 4096) == 0) goto L53;
        int r9 = 0;
    L55:
        if ((r41 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r41 & 16384) == 0) goto L61;
        int r2 = 0;
    L63:
        if ((r41 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r41 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r41 & 131072) == 0) goto L73;
        String r18 = "";
    L75:
        if ((r41 & 262144) == 0) goto L78;
        String r43 = "";
    L79:
        this(r1, r3, r4, r5, r6, r7, r10, r11, r12, r13, r14, r8, r9, r15, r2, r16, r17, r18, r43);
        return;
    L78:
        r43 = r40;
        goto L79
    L73:
        r18 = r39;
        goto L75
    L69:
        r17 = r38;
        goto L71
    L65:
        r16 = r37;
        goto L67
    L61:
        r2 = r36;
        goto L63
    L57:
        r15 = r35;
        goto L59
    L53:
        r9 = r34;
        goto L55
    L49:
        r8 = r33;
        goto L51
    L45:
        r14 = r32;
        goto L47
    L41:
        r13 = r31;
        goto L43
    L37:
        r12 = r30;
        goto L39
    L33:
        r11 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L31
    L25:
        r7 = r27;
        goto L27
    L21:
        r6 = r26;
        goto L23
    L17:
        r5 = r25;
        goto L19
    L13:
        r4 = r24;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }
}
