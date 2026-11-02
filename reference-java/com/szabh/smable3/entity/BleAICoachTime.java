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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    private int mDay;
    private int mHour;
    private int mMinute;
    private int mMonth;
    private int mSecond;
    private int mYear;

    @SourceDebugExtension({"SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachTime$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final TimeZone getUtcTimeZone() {
            TimeZone timeZone = TimeZone.getTimeZone("GMT+0");
            Intrinsics.O10IXXX0X(timeZone, "getTimeZone(...)");
            return timeZone;
        }

        @aa1
        public final BleAICoachTime local() {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.XXI(calendar);
            return new BleAICoachTime(calendar, null);
        }

        @aa1
        public final BleAICoachTime ofLocal(long j) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Intrinsics.XXI(calendar);
            return new BleAICoachTime(calendar, null);
        }

        @aa1
        public final BleAICoachTime utc() {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(BleAICoachTime.Companion.getUtcTimeZone());
            Intrinsics.XXI(calendar);
            return new BleAICoachTime(calendar, null);
        }

        private Companion() {
        }
    }

    public BleAICoachTime() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BleAICoachTime copy$default(BleAICoachTime bleAICoachTime, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleAICoachTime.mYear;
        }
        if ((i7 & 2) != 0) {
            i2 = bleAICoachTime.mMonth;
        }
        if ((i7 & 4) != 0) {
            i3 = bleAICoachTime.mDay;
        }
        if ((i7 & 8) != 0) {
            i4 = bleAICoachTime.mHour;
        }
        if ((i7 & 16) != 0) {
            i5 = bleAICoachTime.mMinute;
        }
        if ((i7 & 32) != 0) {
            i6 = bleAICoachTime.mSecond;
        }
        int i8 = i5;
        int i9 = i6;
        return bleAICoachTime.copy(i, i2, i3, i4, i8, i9);
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
    public final BleAICoachTime copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new BleAICoachTime(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mYear = readUInt16(LITTLE_ENDIAN);
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
        int i = this.mYear;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        writeInt8(this.mMonth);
        writeInt8(this.mDay);
        writeInt8(this.mHour);
        writeInt8(this.mMinute);
        writeInt8(this.mSecond);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachTime)) {
            return false;
        }
        BleAICoachTime bleAICoachTime = (BleAICoachTime) obj;
        return this.mYear == bleAICoachTime.mYear && this.mMonth == bleAICoachTime.mMonth && this.mDay == bleAICoachTime.mDay && this.mHour == bleAICoachTime.mHour && this.mMinute == bleAICoachTime.mMinute && this.mSecond == bleAICoachTime.mSecond;
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

    public final void setMDay(int i) {
        this.mDay = i;
    }

    public final void setMHour(int i) {
        this.mHour = i;
    }

    public final void setMMinute(int i) {
        this.mMinute = i;
    }

    public final void setMMonth(int i) {
        this.mMonth = i;
    }

    public final void setMSecond(int i) {
        this.mSecond = i;
    }

    public final void setMYear(int i) {
        this.mYear = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachTime(mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ BleAICoachTime(Calendar calendar, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendar);
    }

    public BleAICoachTime(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mYear = i;
        this.mMonth = i2;
        this.mDay = i3;
        this.mHour = i4;
        this.mMinute = i5;
        this.mSecond = i6;
    }

    public /* synthetic */ BleAICoachTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    private BleAICoachTime(Calendar calendar) {
        this(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13));
    }
}
