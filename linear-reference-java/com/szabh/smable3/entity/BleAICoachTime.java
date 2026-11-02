package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachTime extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mDay;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mSecond;
    private int mYear;

    @SourceDebugExtension({"SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final TimeZone getUtcTimeZone() {
            TimeZone r0 = TimeZone.getTimeZone("GMT+0");
            Intrinsics.O10IXXX0X(r0, "getTimeZone(...)");
            return r0;
        }

        @aa1
        public final BleAICoachTime local() {
            Calendar r0 = Calendar.getInstance();
            Intrinsics.XXI(r0);
            return new BleAICoachTime(r0, null);
        }

        @aa1
        public final BleAICoachTime ofLocal(long r2) {
            Calendar r0 = Calendar.getInstance();
            r0.setTimeInMillis(r2);
            Intrinsics.XXI(r0);
            return new BleAICoachTime(r0, null);
        }

        @aa1
        public final BleAICoachTime utc() {
            Calendar r0 = Calendar.getInstance();
            r0.setTimeZone(BleAICoachTime.Companion.getUtcTimeZone());
            Intrinsics.XXI(r0);
            return new BleAICoachTime(r0, null);
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleAICoachTime() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleAICoachTime copy$default(BleAICoachTime r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mYear;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mMonth;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mDay;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mHour;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mMinute;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mSecond;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
        return this.mSecond;
    }

    @aa1
    public final BleAICoachTime copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleAICoachTime(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mYear = readUInt16(r0);
        this.mMonth = readUInt8();
        this.mDay = readUInt8();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
        this.mSecond = readUInt8();
        readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mYear;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        writeInt8(this.mSecond);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICoachTime) == true) goto L8;
        return false;
    L8:
        BleAICoachTime r6 = (BleAICoachTime) r5;
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
        if (this.mSecond == r6.mSecond) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMDay() {
        return this.mDay;
    }

    public final int getMHour() {
        return this.mHour;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMMonth() {
        return this.mMonth;
    }

    public final int getMSecond() {
        return this.mSecond;
    }

    public final int getMYear() {
        return this.mYear;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mYear) * 31) + Integer.hashCode(this.mMonth)) * 31) + Integer.hashCode(this.mDay)) * 31) + Integer.hashCode(this.mHour)) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mSecond);
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

    public final void setMSecond(int r1) {
        this.mSecond = r1;
    }

    public final void setMYear(int r1) {
        this.mYear = r1;
    }

    @aa1
    public String toString() {
        return "BleAICoachTime(mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleAICoachTime(Calendar r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public BleAICoachTime(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mYear = r1;
        this.mMonth = r2;
        this.mDay = r3;
        this.mHour = r4;
        this.mMinute = r5;
        this.mSecond = r6;
    }

    public /* synthetic */ BleAICoachTime(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
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
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }

    private BleAICoachTime(Calendar r9) {
        this(r9.get(1), r9.get(2) + 1, r9.get(5), r9.get(11), r9.get(12), r9.get(13));
    }
}
