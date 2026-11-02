package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleECGRealtime extends BleReadable {
    private int mCount;
    private int mDeviceState;

    @aa1
    private List<Double> mECGData;
    private int mECGType;
    private int mHeartRate;
    private int mState;
    private int mTime;

    public BleECGRealtime() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleECGRealtime copy$default(BleECGRealtime bleECGRealtime, int i, int i2, int i3, int i4, int i5, int i6, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleECGRealtime.mTime;
        }
        if ((i7 & 2) != 0) {
            i2 = bleECGRealtime.mState;
        }
        if ((i7 & 4) != 0) {
            i3 = bleECGRealtime.mCount;
        }
        if ((i7 & 8) != 0) {
            i4 = bleECGRealtime.mHeartRate;
        }
        if ((i7 & 16) != 0) {
            i5 = bleECGRealtime.mECGType;
        }
        if ((i7 & 32) != 0) {
            i6 = bleECGRealtime.mDeviceState;
        }
        if ((i7 & 64) != 0) {
            list = bleECGRealtime.mECGData;
        }
        int i8 = i6;
        List list2 = list;
        int i9 = i5;
        int i10 = i3;
        return bleECGRealtime.copy(i, i2, i10, i4, i9, i8, list2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mState;
    }

    public final int component3() {
        return this.mCount;
    }

    public final int component4() {
        return this.mHeartRate;
    }

    public final int component5() {
        return this.mECGType;
    }

    public final int component6() {
        return this.mDeviceState;
    }

    @aa1
    public final List<Double> component7() {
        return this.mECGData;
    }

    @aa1
    public final BleECGRealtime copy(int i, int i2, int i3, int i4, int i5, int i6, @aa1 List<Double> mECGData) {
        Intrinsics.X0O(mECGData, "mECGData");
        return new BleECGRealtime(i, i2, i3, i4, i5, i6, mECGData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mCount = BleReadable.readUInt16$default(this, null, 1, null);
        this.mHeartRate = readUInt8();
        this.mECGType = readUInt8();
        this.mDeviceState = readUInt8();
        int i = this.mCount;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.mECGData.add(Double.valueOf(BleReadable.readDouble$default(this, null, 1, null)));
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleECGRealtime)) {
            return false;
        }
        BleECGRealtime bleECGRealtime = (BleECGRealtime) obj;
        return this.mTime == bleECGRealtime.mTime && this.mState == bleECGRealtime.mState && this.mCount == bleECGRealtime.mCount && this.mHeartRate == bleECGRealtime.mHeartRate && this.mECGType == bleECGRealtime.mECGType && this.mDeviceState == bleECGRealtime.mDeviceState && Intrinsics.XOO0ii0(this.mECGData, bleECGRealtime.mECGData);
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final int getMDeviceState() {
        return this.mDeviceState;
    }

    @aa1
    public final List<Double> getMECGData() {
        return this.mECGData;
    }

    public final int getMECGType() {
        return this.mECGType;
    }

    public final int getMHeartRate() {
        return this.mHeartRate;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mHeartRate)) * 31) + Integer.hashCode(this.mECGType)) * 31) + Integer.hashCode(this.mDeviceState)) * 31) + this.mECGData.hashCode();
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMDeviceState(int i) {
        this.mDeviceState = i;
    }

    public final void setMECGData(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mECGData = list;
    }

    public final void setMECGType(int i) {
        this.mECGType = i;
    }

    public final void setMHeartRate(int i) {
        this.mHeartRate = i;
    }

    public final void setMState(int i) {
        this.mState = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleECGRealtime(mTime=" + this.mTime + ", mState=" + this.mState + ", mCount=" + this.mCount + ", mHeartRate=" + this.mHeartRate + ", mECGType=" + this.mECGType + ", mDeviceState=" + this.mDeviceState + ", mECGData=" + this.mECGData + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleECGRealtime(int i, int i2, int i3, int i4, int i5, int i6, @aa1 List<Double> mECGData) {
        Intrinsics.X0O(mECGData, "mECGData");
        this.mTime = i;
        this.mState = i2;
        this.mCount = i3;
        this.mHeartRate = i4;
        this.mECGType = i5;
        this.mDeviceState = i6;
        this.mECGData = mECGData;
    }

    public /* synthetic */ BleECGRealtime(int i, int i2, int i3, int i4, int i5, int i6, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? new ArrayList() : list);
    }
}
