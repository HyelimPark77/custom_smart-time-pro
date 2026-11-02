package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchTrainingSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchTrainingSettings3.kt\ncom/szabh/smable3/entity/BleMatchTrainingSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class BleMatchTrainingSettings3 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 25;
    private int mFinshRestingTime;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;

    @aa1
    private List<Integer> mRestingTime;
    private int mRingVolume;
    private int mScreen;
    private int mTrainings;
    private int mVibration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchTrainingSettings3() {
        this(0, 0, null, null, 0, 0, 0, 0, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchTrainingSettings3 copy$default(BleMatchTrainingSettings3 bleMatchTrainingSettings3, int i, int i2, List list, List list2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleMatchTrainingSettings3.mTrainings;
        }
        if ((i7 & 2) != 0) {
            i2 = bleMatchTrainingSettings3.mPeriods;
        }
        if ((i7 & 4) != 0) {
            list = bleMatchTrainingSettings3.mPeriodTime;
        }
        if ((i7 & 8) != 0) {
            list2 = bleMatchTrainingSettings3.mRestingTime;
        }
        if ((i7 & 16) != 0) {
            i3 = bleMatchTrainingSettings3.mFinshRestingTime;
        }
        if ((i7 & 32) != 0) {
            i4 = bleMatchTrainingSettings3.mVibration;
        }
        if ((i7 & 64) != 0) {
            i5 = bleMatchTrainingSettings3.mRingVolume;
        }
        if ((i7 & 128) != 0) {
            i6 = bleMatchTrainingSettings3.mScreen;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i3;
        int i11 = i4;
        return bleMatchTrainingSettings3.copy(i, i2, list, list2, i10, i11, i8, i9);
    }

    public final int component1() {
        return this.mTrainings;
    }

    public final int component2() {
        return this.mPeriods;
    }

    @aa1
    public final List<Integer> component3() {
        return this.mPeriodTime;
    }

    @aa1
    public final List<Integer> component4() {
        return this.mRestingTime;
    }

    public final int component5() {
        return this.mFinshRestingTime;
    }

    public final int component6() {
        return this.mVibration;
    }

    public final int component7() {
        return this.mRingVolume;
    }

    public final int component8() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchTrainingSettings3 copy(int i, int i2, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mRestingTime, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mRestingTime, "mRestingTime");
        return new BleMatchTrainingSettings3(i, i2, mPeriodTime, mRestingTime, i3, i4, i5, i6);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(9);
        writeInt8(this.mTrainings);
        writeInt8(this.mPeriods);
        int i = 0;
        int i2 = 0;
        while (i2 < 9) {
            List<Integer> list = this.mPeriodTime;
            BleWritable.writeInt16$default(this, ((i2 < 0 || i2 >= list.size()) ? 0 : list.get(i2)).intValue(), null, 2, null);
            i2++;
        }
        while (i < 8) {
            List<Integer> list2 = this.mRestingTime;
            BleWritable.writeInt16$default(this, ((i < 0 || i >= list2.size()) ? 0 : list2.get(i)).intValue(), null, 2, null);
            i++;
        }
        BleWritable.writeInt16$default(this, this.mFinshRestingTime, null, 2, null);
        writeInt8(this.mVibration);
        writeInt8(this.mRingVolume);
        writeInt8(this.mScreen);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchTrainingSettings3)) {
            return false;
        }
        BleMatchTrainingSettings3 bleMatchTrainingSettings3 = (BleMatchTrainingSettings3) obj;
        return this.mTrainings == bleMatchTrainingSettings3.mTrainings && this.mPeriods == bleMatchTrainingSettings3.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchTrainingSettings3.mPeriodTime) && Intrinsics.XOO0ii0(this.mRestingTime, bleMatchTrainingSettings3.mRestingTime) && this.mFinshRestingTime == bleMatchTrainingSettings3.mFinshRestingTime && this.mVibration == bleMatchTrainingSettings3.mVibration && this.mRingVolume == bleMatchTrainingSettings3.mRingVolume && this.mScreen == bleMatchTrainingSettings3.mScreen;
    }

    public final int getMFinshRestingTime() {
        return this.mFinshRestingTime;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 42;
    }

    @aa1
    public final List<Integer> getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMPeriods() {
        return this.mPeriods;
    }

    @aa1
    public final List<Integer> getMRestingTime() {
        return this.mRestingTime;
    }

    public final int getMRingVolume() {
        return this.mRingVolume;
    }

    public final int getMScreen() {
        return this.mScreen;
    }

    public final int getMTrainings() {
        return this.mTrainings;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mTrainings) * 31) + Integer.hashCode(this.mPeriods)) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mRestingTime.hashCode()) * 31) + Integer.hashCode(this.mFinshRestingTime)) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mScreen);
    }

    public final void setMFinshRestingTime(int i) {
        this.mFinshRestingTime = i;
    }

    public final void setMPeriodTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodTime = list;
    }

    public final void setMPeriods(int i) {
        this.mPeriods = i;
    }

    public final void setMRestingTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRestingTime = list;
    }

    public final void setMRingVolume(int i) {
        this.mRingVolume = i;
    }

    public final void setMScreen(int i) {
        this.mScreen = i;
    }

    public final void setMTrainings(int i) {
        this.mTrainings = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleMatchTrainingSettings3(mTrainings=" + this.mTrainings + ", mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mRestingTime=" + this.mRestingTime + ", mFinshRestingTime=" + this.mFinshRestingTime + ", mVibration=" + this.mVibration + ", mRingVolume=" + this.mRingVolume + ", mScreen=" + this.mScreen + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchTrainingSettings3(int i, int i2, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mRestingTime, int i3, int i4, int i5, int i6) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mRestingTime, "mRestingTime");
        this.mTrainings = i;
        this.mPeriods = i2;
        this.mPeriodTime = mPeriodTime;
        this.mRestingTime = mRestingTime;
        this.mFinshRestingTime = i3;
        this.mVibration = i4;
        this.mRingVolume = i5;
        this.mScreen = i6;
    }

    public /* synthetic */ BleMatchTrainingSettings3(int i, int i2, List list, List list2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? new ArrayList() : list, (i7 & 8) != 0 ? new ArrayList() : list2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6);
    }
}
