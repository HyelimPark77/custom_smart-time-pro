package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVitality extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;
    private int mAllVitality;
    private int mHighIntensityTime;
    private int mHighIntensityValue;
    private int mLowIntensityTime;
    private int mLowIntensityValue;
    private int mMediumIntensityTime;
    private int mMediumIntensityValue;
    private long mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleVitality() {
        this(0L, 0, 0, 0, 0, 0, 0, 0, 255, null);
    }

    public static /* synthetic */ BleVitality copy$default(BleVitality bleVitality, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j = bleVitality.mTime;
        }
        long j2 = j;
        if ((i8 & 2) != 0) {
            i = bleVitality.mAllVitality;
        }
        int i9 = i;
        if ((i8 & 4) != 0) {
            i2 = bleVitality.mLowIntensityTime;
        }
        int i10 = i2;
        if ((i8 & 8) != 0) {
            i3 = bleVitality.mLowIntensityValue;
        }
        return bleVitality.copy(j2, i9, i10, i3, (i8 & 16) != 0 ? bleVitality.mMediumIntensityTime : i4, (i8 & 32) != 0 ? bleVitality.mMediumIntensityValue : i5, (i8 & 64) != 0 ? bleVitality.mHighIntensityTime : i6, (i8 & 128) != 0 ? bleVitality.mHighIntensityValue : i7);
    }

    public final long component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mAllVitality;
    }

    public final int component3() {
        return this.mLowIntensityTime;
    }

    public final int component4() {
        return this.mLowIntensityValue;
    }

    public final int component5() {
        return this.mMediumIntensityTime;
    }

    public final int component6() {
        return this.mMediumIntensityValue;
    }

    public final int component7() {
        return this.mHighIntensityTime;
    }

    public final int component8() {
        return this.mHighIntensityValue;
    }

    @aa1
    public final BleVitality copy(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleVitality(j, i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = getStartOfDayCalendar(BleReadable.Companion.timeToMillis(BleReadable.readInt32$default(this, null, 1, null))).getTimeInMillis();
        this.mLowIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        this.mLowIntensityValue = BleReadable.readInt16$default(this, null, 1, null);
        this.mMediumIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        this.mMediumIntensityValue = BleReadable.readInt16$default(this, null, 1, null);
        this.mHighIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        short int16$default = BleReadable.readInt16$default(this, null, 1, null);
        this.mHighIntensityValue = int16$default;
        this.mAllVitality = this.mLowIntensityValue + this.mMediumIntensityValue + int16$default;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleVitality)) {
            return false;
        }
        BleVitality bleVitality = (BleVitality) obj;
        return this.mTime == bleVitality.mTime && this.mAllVitality == bleVitality.mAllVitality && this.mLowIntensityTime == bleVitality.mLowIntensityTime && this.mLowIntensityValue == bleVitality.mLowIntensityValue && this.mMediumIntensityTime == bleVitality.mMediumIntensityTime && this.mMediumIntensityValue == bleVitality.mMediumIntensityValue && this.mHighIntensityTime == bleVitality.mHighIntensityTime && this.mHighIntensityValue == bleVitality.mHighIntensityValue;
    }

    public final int getMAllVitality() {
        return this.mAllVitality;
    }

    public final int getMHighIntensityTime() {
        return this.mHighIntensityTime;
    }

    public final int getMHighIntensityValue() {
        return this.mHighIntensityValue;
    }

    public final int getMLowIntensityTime() {
        return this.mLowIntensityTime;
    }

    public final int getMLowIntensityValue() {
        return this.mLowIntensityValue;
    }

    public final int getMMediumIntensityTime() {
        return this.mMediumIntensityTime;
    }

    public final int getMMediumIntensityValue() {
        return this.mMediumIntensityValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final Calendar getStartOfDayCalendar(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.XXI(calendar);
        return calendar;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mAllVitality)) * 31) + Integer.hashCode(this.mLowIntensityTime)) * 31) + Integer.hashCode(this.mLowIntensityValue)) * 31) + Integer.hashCode(this.mMediumIntensityTime)) * 31) + Integer.hashCode(this.mMediumIntensityValue)) * 31) + Integer.hashCode(this.mHighIntensityTime)) * 31) + Integer.hashCode(this.mHighIntensityValue);
    }

    public final void setMAllVitality(int i) {
        this.mAllVitality = i;
    }

    public final void setMHighIntensityTime(int i) {
        this.mHighIntensityTime = i;
    }

    public final void setMHighIntensityValue(int i) {
        this.mHighIntensityValue = i;
    }

    public final void setMLowIntensityTime(int i) {
        this.mLowIntensityTime = i;
    }

    public final void setMLowIntensityValue(int i) {
        this.mLowIntensityValue = i;
    }

    public final void setMMediumIntensityTime(int i) {
        this.mMediumIntensityTime = i;
    }

    public final void setMMediumIntensityValue(int i) {
        this.mMediumIntensityValue = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BleVitality(mTime=" + this.mTime + ", mAllVitality=" + this.mAllVitality + ", mLowIntensityTime=" + this.mLowIntensityTime + ", mLowIntensityValue=" + this.mLowIntensityValue + ", mMediumIntensityTime=" + this.mMediumIntensityTime + ", mMediumIntensityValue=" + this.mMediumIntensityValue + ", mHighIntensityTime=" + this.mHighIntensityTime + ", mHighIntensityValue=" + this.mHighIntensityValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVitality(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mTime = j;
        this.mAllVitality = i;
        this.mLowIntensityTime = i2;
        this.mLowIntensityValue = i3;
        this.mMediumIntensityTime = i4;
        this.mMediumIntensityValue = i5;
        this.mHighIntensityTime = i6;
        this.mHighIntensityValue = i7;
    }

    public /* synthetic */ BleVitality(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? 0 : i3, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) != 0 ? 0 : i7);
    }
}
