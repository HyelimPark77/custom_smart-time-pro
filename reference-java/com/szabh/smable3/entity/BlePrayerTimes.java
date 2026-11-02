package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BlePrayerTimes extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 14;
    private int mAsrHour;
    private int mAsrMinite;
    private int mDhuhrHour;
    private int mDhuhrMinite;
    private int mFajrHour;
    private int mFajrMinite;
    private int mIshaHour;
    private int mIshaMinite;
    private int mMaghribHour;
    private int mMaghribMinite;
    private int mSunriseHour;
    private int mSunriseMinite;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BlePrayerTimes() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.f5772iO, null);
    }

    public static /* synthetic */ BlePrayerTimes copy$default(BlePrayerTimes blePrayerTimes, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i = blePrayerTimes.mFajrHour;
        }
        if ((i13 & 2) != 0) {
            i2 = blePrayerTimes.mFajrMinite;
        }
        if ((i13 & 4) != 0) {
            i3 = blePrayerTimes.mSunriseHour;
        }
        if ((i13 & 8) != 0) {
            i4 = blePrayerTimes.mSunriseMinite;
        }
        if ((i13 & 16) != 0) {
            i5 = blePrayerTimes.mDhuhrHour;
        }
        if ((i13 & 32) != 0) {
            i6 = blePrayerTimes.mDhuhrMinite;
        }
        if ((i13 & 64) != 0) {
            i7 = blePrayerTimes.mAsrHour;
        }
        if ((i13 & 128) != 0) {
            i8 = blePrayerTimes.mAsrMinite;
        }
        if ((i13 & 256) != 0) {
            i9 = blePrayerTimes.mMaghribHour;
        }
        if ((i13 & 512) != 0) {
            i10 = blePrayerTimes.mMaghribMinite;
        }
        if ((i13 & 1024) != 0) {
            i11 = blePrayerTimes.mIshaHour;
        }
        if ((i13 & 2048) != 0) {
            i12 = blePrayerTimes.mIshaMinite;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i9;
        int i17 = i10;
        int i18 = i7;
        int i19 = i8;
        int i20 = i5;
        int i21 = i6;
        return blePrayerTimes.copy(i, i2, i3, i4, i20, i21, i18, i19, i16, i17, i14, i15);
    }

    public final int component1() {
        return this.mFajrHour;
    }

    public final int component10() {
        return this.mMaghribMinite;
    }

    public final int component11() {
        return this.mIshaHour;
    }

    public final int component12() {
        return this.mIshaMinite;
    }

    public final int component2() {
        return this.mFajrMinite;
    }

    public final int component3() {
        return this.mSunriseHour;
    }

    public final int component4() {
        return this.mSunriseMinite;
    }

    public final int component5() {
        return this.mDhuhrHour;
    }

    public final int component6() {
        return this.mDhuhrMinite;
    }

    public final int component7() {
        return this.mAsrHour;
    }

    public final int component8() {
        return this.mAsrMinite;
    }

    public final int component9() {
        return this.mMaghribHour;
    }

    @aa1
    public final BlePrayerTimes copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        return new BlePrayerTimes(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFajrHour = readInt8();
        this.mFajrMinite = readInt8();
        this.mSunriseHour = readInt8();
        this.mSunriseMinite = readInt8();
        this.mDhuhrHour = readInt8();
        this.mDhuhrMinite = readInt8();
        this.mAsrHour = readInt8();
        this.mAsrMinite = readInt8();
        this.mMaghribHour = readInt8();
        this.mMaghribMinite = readInt8();
        this.mIshaHour = readInt8();
        this.mIshaMinite = readInt8();
        BleReadable.readInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mFajrHour);
        writeInt8(this.mFajrMinite);
        writeInt8(this.mSunriseHour);
        writeInt8(this.mSunriseMinite);
        writeInt8(this.mDhuhrHour);
        writeInt8(this.mDhuhrMinite);
        writeInt8(this.mAsrHour);
        writeInt8(this.mAsrMinite);
        writeInt8(this.mMaghribHour);
        writeInt8(this.mMaghribMinite);
        writeInt8(this.mIshaHour);
        writeInt8(this.mIshaMinite);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlePrayerTimes)) {
            return false;
        }
        BlePrayerTimes blePrayerTimes = (BlePrayerTimes) obj;
        return this.mFajrHour == blePrayerTimes.mFajrHour && this.mFajrMinite == blePrayerTimes.mFajrMinite && this.mSunriseHour == blePrayerTimes.mSunriseHour && this.mSunriseMinite == blePrayerTimes.mSunriseMinite && this.mDhuhrHour == blePrayerTimes.mDhuhrHour && this.mDhuhrMinite == blePrayerTimes.mDhuhrMinite && this.mAsrHour == blePrayerTimes.mAsrHour && this.mAsrMinite == blePrayerTimes.mAsrMinite && this.mMaghribHour == blePrayerTimes.mMaghribHour && this.mMaghribMinite == blePrayerTimes.mMaghribMinite && this.mIshaHour == blePrayerTimes.mIshaHour && this.mIshaMinite == blePrayerTimes.mIshaMinite;
    }

    public final int getMAsrHour() {
        return this.mAsrHour;
    }

    public final int getMAsrMinite() {
        return this.mAsrMinite;
    }

    public final int getMDhuhrHour() {
        return this.mDhuhrHour;
    }

    public final int getMDhuhrMinite() {
        return this.mDhuhrMinite;
    }

    public final int getMFajrHour() {
        return this.mFajrHour;
    }

    public final int getMFajrMinite() {
        return this.mFajrMinite;
    }

    public final int getMIshaHour() {
        return this.mIshaHour;
    }

    public final int getMIshaMinite() {
        return this.mIshaMinite;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 14;
    }

    public final int getMMaghribHour() {
        return this.mMaghribHour;
    }

    public final int getMMaghribMinite() {
        return this.mMaghribMinite;
    }

    public final int getMSunriseHour() {
        return this.mSunriseHour;
    }

    public final int getMSunriseMinite() {
        return this.mSunriseMinite;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.mFajrHour) * 31) + Integer.hashCode(this.mFajrMinite)) * 31) + Integer.hashCode(this.mSunriseHour)) * 31) + Integer.hashCode(this.mSunriseMinite)) * 31) + Integer.hashCode(this.mDhuhrHour)) * 31) + Integer.hashCode(this.mDhuhrMinite)) * 31) + Integer.hashCode(this.mAsrHour)) * 31) + Integer.hashCode(this.mAsrMinite)) * 31) + Integer.hashCode(this.mMaghribHour)) * 31) + Integer.hashCode(this.mMaghribMinite)) * 31) + Integer.hashCode(this.mIshaHour)) * 31) + Integer.hashCode(this.mIshaMinite);
    }

    public final void setMAsrHour(int i) {
        this.mAsrHour = i;
    }

    public final void setMAsrMinite(int i) {
        this.mAsrMinite = i;
    }

    public final void setMDhuhrHour(int i) {
        this.mDhuhrHour = i;
    }

    public final void setMDhuhrMinite(int i) {
        this.mDhuhrMinite = i;
    }

    public final void setMFajrHour(int i) {
        this.mFajrHour = i;
    }

    public final void setMFajrMinite(int i) {
        this.mFajrMinite = i;
    }

    public final void setMIshaHour(int i) {
        this.mIshaHour = i;
    }

    public final void setMIshaMinite(int i) {
        this.mIshaMinite = i;
    }

    public final void setMMaghribHour(int i) {
        this.mMaghribHour = i;
    }

    public final void setMMaghribMinite(int i) {
        this.mMaghribMinite = i;
    }

    public final void setMSunriseHour(int i) {
        this.mSunriseHour = i;
    }

    public final void setMSunriseMinite(int i) {
        this.mSunriseMinite = i;
    }

    @aa1
    public String toString() {
        return "BlePrayerTimes(mFajrHour=" + this.mFajrHour + ", mFajrMinite=" + this.mFajrMinite + ", mSunriseHour=" + this.mSunriseHour + ", mSunriseMinite=" + this.mSunriseMinite + ", mDhuhrHour=" + this.mDhuhrHour + ", mDhuhrMinite=" + this.mDhuhrMinite + ", mAsrHour=" + this.mAsrHour + ", mAsrMinite=" + this.mAsrMinite + ", mMaghribHour=" + this.mMaghribHour + ", mMaghribMinite=" + this.mMaghribMinite + ", mIshaHour=" + this.mIshaHour + ", mIshaMinite=" + this.mIshaMinite + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePrayerTimes(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.mFajrHour = i;
        this.mFajrMinite = i2;
        this.mSunriseHour = i3;
        this.mSunriseMinite = i4;
        this.mDhuhrHour = i5;
        this.mDhuhrMinite = i6;
        this.mAsrHour = i7;
        this.mAsrMinite = i8;
        this.mMaghribHour = i9;
        this.mMaghribMinite = i10;
        this.mIshaHour = i11;
        this.mIshaMinite = i12;
    }

    public /* synthetic */ BlePrayerTimes(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? 0 : i3, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? 0 : i5, (i13 & 32) != 0 ? 0 : i6, (i13 & 64) != 0 ? 0 : i7, (i13 & 128) != 0 ? 0 : i8, (i13 & 256) != 0 ? 0 : i9, (i13 & 512) != 0 ? 0 : i10, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) != 0 ? 0 : i12);
    }
}
