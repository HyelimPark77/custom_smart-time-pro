package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRealTimeMeasurement extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 1;
    public static final int STATE_DONE = 0;
    public static final int STATE_PAUSE = 1;
    public static final int STATE_START = 2;
    public static final int STATE_STOP_TIP = 3;
    private int mBOSwitch;
    private int mBPSwitch;
    private int mHRSwitch;
    private int mHrvSwitch;
    private int mState;
    private int mStressSwitch;
    private int mTemperature;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleRealTimeMeasurement() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ BleRealTimeMeasurement copy$default(BleRealTimeMeasurement bleRealTimeMeasurement, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = bleRealTimeMeasurement.mHRSwitch;
        }
        if ((i8 & 2) != 0) {
            i2 = bleRealTimeMeasurement.mBOSwitch;
        }
        if ((i8 & 4) != 0) {
            i3 = bleRealTimeMeasurement.mBPSwitch;
        }
        if ((i8 & 8) != 0) {
            i4 = bleRealTimeMeasurement.mStressSwitch;
        }
        if ((i8 & 16) != 0) {
            i5 = bleRealTimeMeasurement.mTemperature;
        }
        if ((i8 & 32) != 0) {
            i6 = bleRealTimeMeasurement.mHrvSwitch;
        }
        if ((i8 & 64) != 0) {
            i7 = bleRealTimeMeasurement.mState;
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return bleRealTimeMeasurement.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final int component1() {
        return this.mHRSwitch;
    }

    public final int component2() {
        return this.mBOSwitch;
    }

    public final int component3() {
        return this.mBPSwitch;
    }

    public final int component4() {
        return this.mStressSwitch;
    }

    public final int component5() {
        return this.mTemperature;
    }

    public final int component6() {
        return this.mHrvSwitch;
    }

    public final int component7() {
        return this.mState;
    }

    @aa1
    public final BleRealTimeMeasurement copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new BleRealTimeMeasurement(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mState = readIntN(2);
        this.mHrvSwitch = readIntN(1);
        this.mTemperature = readIntN(1);
        this.mStressSwitch = readIntN(1);
        this.mBPSwitch = readIntN(1);
        this.mBOSwitch = readIntN(1);
        this.mHRSwitch = readIntN(1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.mState, 2);
        writeIntN(this.mHrvSwitch, 1);
        writeIntN(this.mTemperature, 1);
        writeIntN(this.mStressSwitch, 1);
        writeIntN(this.mBPSwitch, 1);
        writeIntN(this.mBOSwitch, 1);
        writeIntN(this.mHRSwitch, 1);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleRealTimeMeasurement)) {
            return false;
        }
        BleRealTimeMeasurement bleRealTimeMeasurement = (BleRealTimeMeasurement) obj;
        return this.mHRSwitch == bleRealTimeMeasurement.mHRSwitch && this.mBOSwitch == bleRealTimeMeasurement.mBOSwitch && this.mBPSwitch == bleRealTimeMeasurement.mBPSwitch && this.mStressSwitch == bleRealTimeMeasurement.mStressSwitch && this.mTemperature == bleRealTimeMeasurement.mTemperature && this.mHrvSwitch == bleRealTimeMeasurement.mHrvSwitch && this.mState == bleRealTimeMeasurement.mState;
    }

    public final int getMBOSwitch() {
        return this.mBOSwitch;
    }

    public final int getMBPSwitch() {
        return this.mBPSwitch;
    }

    public final int getMHRSwitch() {
        return this.mHRSwitch;
    }

    public final int getMHrvSwitch() {
        return this.mHrvSwitch;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 1;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMStressSwitch() {
        return this.mStressSwitch;
    }

    public final int getMTemperature() {
        return this.mTemperature;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mHRSwitch) * 31) + Integer.hashCode(this.mBOSwitch)) * 31) + Integer.hashCode(this.mBPSwitch)) * 31) + Integer.hashCode(this.mStressSwitch)) * 31) + Integer.hashCode(this.mTemperature)) * 31) + Integer.hashCode(this.mHrvSwitch)) * 31) + Integer.hashCode(this.mState);
    }

    public final void setMBOSwitch(int i) {
        this.mBOSwitch = i;
    }

    public final void setMBPSwitch(int i) {
        this.mBPSwitch = i;
    }

    public final void setMHRSwitch(int i) {
        this.mHRSwitch = i;
    }

    public final void setMHrvSwitch(int i) {
        this.mHrvSwitch = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMStressSwitch(int i) {
        this.mStressSwitch = i;
    }

    public final void setMTemperature(int i) {
        this.mTemperature = i;
    }

    @aa1
    public String toString() {
        return "BleRealTimeMeasurement(mState=" + this.mState + ", mHRSwitch=" + this.mHRSwitch + ", mBOSwitch=" + this.mBOSwitch + ", mBPSwitch=" + this.mBPSwitch + ", mStressSwitch=" + this.mStressSwitch + ", mTemperature=" + this.mTemperature + ", mHrvSwitch=" + this.mHrvSwitch + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRealTimeMeasurement(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mHRSwitch = i;
        this.mBOSwitch = i2;
        this.mBPSwitch = i3;
        this.mStressSwitch = i4;
        this.mTemperature = i5;
        this.mHrvSwitch = i6;
        this.mState = i7;
    }

    public /* synthetic */ BleRealTimeMeasurement(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }
}
