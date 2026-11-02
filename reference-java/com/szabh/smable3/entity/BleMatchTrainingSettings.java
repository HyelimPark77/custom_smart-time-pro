package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchTrainingSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 10;
    private int mFinshRestingTime;
    private int mPeriods;
    private int mRestingTime;
    private int mScreen;
    private int mTrainingTime;
    private int mVibration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchTrainingSettings() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ BleMatchTrainingSettings copy$default(BleMatchTrainingSettings bleMatchTrainingSettings, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleMatchTrainingSettings.mPeriods;
        }
        if ((i7 & 2) != 0) {
            i2 = bleMatchTrainingSettings.mTrainingTime;
        }
        if ((i7 & 4) != 0) {
            i3 = bleMatchTrainingSettings.mRestingTime;
        }
        if ((i7 & 8) != 0) {
            i4 = bleMatchTrainingSettings.mFinshRestingTime;
        }
        if ((i7 & 16) != 0) {
            i5 = bleMatchTrainingSettings.mVibration;
        }
        if ((i7 & 32) != 0) {
            i6 = bleMatchTrainingSettings.mScreen;
        }
        int i8 = i5;
        int i9 = i6;
        return bleMatchTrainingSettings.copy(i, i2, i3, i4, i8, i9);
    }

    public final int component1() {
        return this.mPeriods;
    }

    public final int component2() {
        return this.mTrainingTime;
    }

    public final int component3() {
        return this.mRestingTime;
    }

    public final int component4() {
        return this.mFinshRestingTime;
    }

    public final int component5() {
        return this.mVibration;
    }

    public final int component6() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchTrainingSettings copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new BleMatchTrainingSettings(i, i2, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(3);
        writeInt8(this.mPeriods);
        BleWritable.writeInt16$default(this, this.mTrainingTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mRestingTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mFinshRestingTime, null, 2, null);
        writeInt8(this.mVibration);
        writeInt8(this.mScreen);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchTrainingSettings)) {
            return false;
        }
        BleMatchTrainingSettings bleMatchTrainingSettings = (BleMatchTrainingSettings) obj;
        return this.mPeriods == bleMatchTrainingSettings.mPeriods && this.mTrainingTime == bleMatchTrainingSettings.mTrainingTime && this.mRestingTime == bleMatchTrainingSettings.mRestingTime && this.mFinshRestingTime == bleMatchTrainingSettings.mFinshRestingTime && this.mVibration == bleMatchTrainingSettings.mVibration && this.mScreen == bleMatchTrainingSettings.mScreen;
    }

    public final int getMFinshRestingTime() {
        return this.mFinshRestingTime;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final int getMPeriods() {
        return this.mPeriods;
    }

    public final int getMRestingTime() {
        return this.mRestingTime;
    }

    public final int getMScreen() {
        return this.mScreen;
    }

    public final int getMTrainingTime() {
        return this.mTrainingTime;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mPeriods) * 31) + Integer.hashCode(this.mTrainingTime)) * 31) + Integer.hashCode(this.mRestingTime)) * 31) + Integer.hashCode(this.mFinshRestingTime)) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mScreen);
    }

    public final void setMFinshRestingTime(int i) {
        this.mFinshRestingTime = i;
    }

    public final void setMPeriods(int i) {
        this.mPeriods = i;
    }

    public final void setMRestingTime(int i) {
        this.mRestingTime = i;
    }

    public final void setMScreen(int i) {
        this.mScreen = i;
    }

    public final void setMTrainingTime(int i) {
        this.mTrainingTime = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleMatchTrainingSettings(mPeriods=" + this.mPeriods + ", mTrainingTime=" + this.mTrainingTime + ", mRestingTime=" + this.mRestingTime + ", mFinshRestingTime=" + this.mFinshRestingTime + ", mVibration=" + this.mVibration + ", mScreen=" + this.mScreen + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchTrainingSettings(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mPeriods = i;
        this.mTrainingTime = i2;
        this.mRestingTime = i3;
        this.mFinshRestingTime = i4;
        this.mVibration = i5;
        this.mScreen = i6;
    }

    public /* synthetic */ BleMatchTrainingSettings(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
