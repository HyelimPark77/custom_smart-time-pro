package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICoachBeforePlan extends BleReadable {
    public static final int CHECKSUM_LENGTH = 128;

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private String mCurrentChecksum;
    private int mCurrentChecksumLength;
    private int mDayMET;

    @aa1
    private float[] mExerciseMET;
    private int mIsFirst;

    @aa1
    private String mLastChecksum;
    private int mLastChecksumLength;

    @aa1
    private float[] mRoutineMET;

    @aa1
    private float[] mWeekExerciseMET;

    @aa1
    private float[] mWeekRoutineMET;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAICoachBeforePlan() {
        this(null, 0, null, 0, null, null, 0, 0, null, null, 1023, null);
    }

    public static /* synthetic */ BleAICoachBeforePlan copy$default(BleAICoachBeforePlan bleAICoachBeforePlan, String str, int i, String str2, int i2, float[] fArr, float[] fArr2, int i3, int i4, float[] fArr3, float[] fArr4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = bleAICoachBeforePlan.mCurrentChecksum;
        }
        if ((i5 & 2) != 0) {
            i = bleAICoachBeforePlan.mCurrentChecksumLength;
        }
        if ((i5 & 4) != 0) {
            str2 = bleAICoachBeforePlan.mLastChecksum;
        }
        if ((i5 & 8) != 0) {
            i2 = bleAICoachBeforePlan.mLastChecksumLength;
        }
        if ((i5 & 16) != 0) {
            fArr = bleAICoachBeforePlan.mRoutineMET;
        }
        if ((i5 & 32) != 0) {
            fArr2 = bleAICoachBeforePlan.mExerciseMET;
        }
        if ((i5 & 64) != 0) {
            i3 = bleAICoachBeforePlan.mDayMET;
        }
        if ((i5 & 128) != 0) {
            i4 = bleAICoachBeforePlan.mIsFirst;
        }
        if ((i5 & 256) != 0) {
            fArr3 = bleAICoachBeforePlan.mWeekRoutineMET;
        }
        if ((i5 & 512) != 0) {
            fArr4 = bleAICoachBeforePlan.mWeekExerciseMET;
        }
        float[] fArr5 = fArr3;
        float[] fArr6 = fArr4;
        int i6 = i3;
        int i7 = i4;
        float[] fArr7 = fArr;
        float[] fArr8 = fArr2;
        return bleAICoachBeforePlan.copy(str, i, str2, i2, fArr7, fArr8, i6, i7, fArr5, fArr6);
    }

    @aa1
    public final String component1() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final float[] component10() {
        return this.mWeekExerciseMET;
    }

    public final int component2() {
        return this.mCurrentChecksumLength;
    }

    @aa1
    public final String component3() {
        return this.mLastChecksum;
    }

    public final int component4() {
        return this.mLastChecksumLength;
    }

    @aa1
    public final float[] component5() {
        return this.mRoutineMET;
    }

    @aa1
    public final float[] component6() {
        return this.mExerciseMET;
    }

    public final int component7() {
        return this.mDayMET;
    }

    public final int component8() {
        return this.mIsFirst;
    }

    @aa1
    public final float[] component9() {
        return this.mWeekRoutineMET;
    }

    @aa1
    public final BleAICoachBeforePlan copy(@aa1 String mCurrentChecksum, int i, @aa1 String mLastChecksum, int i2, @aa1 float[] mRoutineMET, @aa1 float[] mExerciseMET, int i3, int i4, @aa1 float[] mWeekRoutineMET, @aa1 float[] mWeekExerciseMET) {
        Intrinsics.X0O(mCurrentChecksum, "mCurrentChecksum");
        Intrinsics.X0O(mLastChecksum, "mLastChecksum");
        Intrinsics.X0O(mRoutineMET, "mRoutineMET");
        Intrinsics.X0O(mExerciseMET, "mExerciseMET");
        Intrinsics.X0O(mWeekRoutineMET, "mWeekRoutineMET");
        Intrinsics.X0O(mWeekExerciseMET, "mWeekExerciseMET");
        return new BleAICoachBeforePlan(mCurrentChecksum, i, mLastChecksum, i2, mRoutineMET, mExerciseMET, i3, i4, mWeekRoutineMET, mWeekExerciseMET);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCurrentChecksumLength = readInt32(LITTLE_ENDIAN);
        this.mLastChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mLastChecksumLength = readInt32(LITTLE_ENDIAN);
        int length = this.mRoutineMET.length;
        for (int i = 0; i < length; i++) {
            float[] fArr = this.mRoutineMET;
            ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
            fArr[i] = readFloat(LITTLE_ENDIAN2);
        }
        int length2 = this.mExerciseMET.length;
        for (int i2 = 0; i2 < length2; i2++) {
            float[] fArr2 = this.mExerciseMET;
            ByteOrder LITTLE_ENDIAN3 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            fArr2[i2] = readFloat(LITTLE_ENDIAN3);
        }
        ByteOrder LITTLE_ENDIAN4 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mDayMET = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mIsFirst = readInt32(LITTLE_ENDIAN4);
        int length3 = this.mWeekRoutineMET.length;
        for (int i3 = 0; i3 < length3; i3++) {
            float[] fArr3 = this.mWeekRoutineMET;
            ByteOrder LITTLE_ENDIAN5 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN5, "LITTLE_ENDIAN");
            fArr3[i3] = readFloat(LITTLE_ENDIAN5);
        }
        int length4 = this.mWeekExerciseMET.length;
        for (int i4 = 0; i4 < length4; i4++) {
            float[] fArr4 = this.mWeekExerciseMET;
            ByteOrder LITTLE_ENDIAN6 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN6, "LITTLE_ENDIAN");
            fArr4[i4] = readFloat(LITTLE_ENDIAN6);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachBeforePlan)) {
            return false;
        }
        BleAICoachBeforePlan bleAICoachBeforePlan = (BleAICoachBeforePlan) obj;
        return Intrinsics.XOO0ii0(this.mCurrentChecksum, bleAICoachBeforePlan.mCurrentChecksum) && this.mCurrentChecksumLength == bleAICoachBeforePlan.mCurrentChecksumLength && Intrinsics.XOO0ii0(this.mLastChecksum, bleAICoachBeforePlan.mLastChecksum) && this.mLastChecksumLength == bleAICoachBeforePlan.mLastChecksumLength && Intrinsics.XOO0ii0(this.mRoutineMET, bleAICoachBeforePlan.mRoutineMET) && Intrinsics.XOO0ii0(this.mExerciseMET, bleAICoachBeforePlan.mExerciseMET) && this.mDayMET == bleAICoachBeforePlan.mDayMET && this.mIsFirst == bleAICoachBeforePlan.mIsFirst && Intrinsics.XOO0ii0(this.mWeekRoutineMET, bleAICoachBeforePlan.mWeekRoutineMET) && Intrinsics.XOO0ii0(this.mWeekExerciseMET, bleAICoachBeforePlan.mWeekExerciseMET);
    }

    @aa1
    public final String getMCurrentChecksum() {
        return this.mCurrentChecksum;
    }

    public final int getMCurrentChecksumLength() {
        return this.mCurrentChecksumLength;
    }

    public final int getMDayMET() {
        return this.mDayMET;
    }

    @aa1
    public final float[] getMExerciseMET() {
        return this.mExerciseMET;
    }

    public final int getMIsFirst() {
        return this.mIsFirst;
    }

    @aa1
    public final String getMLastChecksum() {
        return this.mLastChecksum;
    }

    public final int getMLastChecksumLength() {
        return this.mLastChecksumLength;
    }

    @aa1
    public final float[] getMRoutineMET() {
        return this.mRoutineMET;
    }

    @aa1
    public final float[] getMWeekExerciseMET() {
        return this.mWeekExerciseMET;
    }

    @aa1
    public final float[] getMWeekRoutineMET() {
        return this.mWeekRoutineMET;
    }

    public int hashCode() {
        return (((((((((((((((((this.mCurrentChecksum.hashCode() * 31) + Integer.hashCode(this.mCurrentChecksumLength)) * 31) + this.mLastChecksum.hashCode()) * 31) + Integer.hashCode(this.mLastChecksumLength)) * 31) + Arrays.hashCode(this.mRoutineMET)) * 31) + Arrays.hashCode(this.mExerciseMET)) * 31) + Integer.hashCode(this.mDayMET)) * 31) + Integer.hashCode(this.mIsFirst)) * 31) + Arrays.hashCode(this.mWeekRoutineMET)) * 31) + Arrays.hashCode(this.mWeekExerciseMET);
    }

    public final void setMCurrentChecksum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCurrentChecksum = str;
    }

    public final void setMCurrentChecksumLength(int i) {
        this.mCurrentChecksumLength = i;
    }

    public final void setMDayMET(int i) {
        this.mDayMET = i;
    }

    public final void setMExerciseMET(@aa1 float[] fArr) {
        Intrinsics.X0O(fArr, "<set-?>");
        this.mExerciseMET = fArr;
    }

    public final void setMIsFirst(int i) {
        this.mIsFirst = i;
    }

    public final void setMLastChecksum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLastChecksum = str;
    }

    public final void setMLastChecksumLength(int i) {
        this.mLastChecksumLength = i;
    }

    public final void setMRoutineMET(@aa1 float[] fArr) {
        Intrinsics.X0O(fArr, "<set-?>");
        this.mRoutineMET = fArr;
    }

    public final void setMWeekExerciseMET(@aa1 float[] fArr) {
        Intrinsics.X0O(fArr, "<set-?>");
        this.mWeekExerciseMET = fArr;
    }

    public final void setMWeekRoutineMET(@aa1 float[] fArr) {
        Intrinsics.X0O(fArr, "<set-?>");
        this.mWeekRoutineMET = fArr;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleAICoachPlan(mCurrentChecksum=");
        sb.append(this.mCurrentChecksum);
        sb.append(", mCurrentChecksumLength=");
        sb.append(this.mCurrentChecksumLength);
        sb.append(", mLastChecksum=");
        sb.append(this.mLastChecksum);
        sb.append(", mLastChecksumLength=");
        sb.append(this.mLastChecksumLength);
        sb.append(", mRoutineMET=");
        String string = Arrays.toString(this.mRoutineMET);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        sb.append(string);
        sb.append(", mExerciseMET=");
        String string2 = Arrays.toString(this.mExerciseMET);
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        sb.append(string2);
        sb.append(", mDayMET=");
        sb.append(this.mDayMET);
        sb.append(", mIsFirst=");
        sb.append(this.mIsFirst);
        sb.append(", mWeekRoutineMET=");
        String string3 = Arrays.toString(this.mWeekRoutineMET);
        Intrinsics.O10IXXX0X(string3, "toString(...)");
        sb.append(string3);
        sb.append(", mWeekExerciseMET=");
        String string4 = Arrays.toString(this.mWeekExerciseMET);
        Intrinsics.O10IXXX0X(string4, "toString(...)");
        sb.append(string4);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleAICoachBeforePlan(@aa1 String mCurrentChecksum, int i, @aa1 String mLastChecksum, int i2, @aa1 float[] mRoutineMET, @aa1 float[] mExerciseMET, int i3, int i4, @aa1 float[] mWeekRoutineMET, @aa1 float[] mWeekExerciseMET) {
        Intrinsics.X0O(mCurrentChecksum, "mCurrentChecksum");
        Intrinsics.X0O(mLastChecksum, "mLastChecksum");
        Intrinsics.X0O(mRoutineMET, "mRoutineMET");
        Intrinsics.X0O(mExerciseMET, "mExerciseMET");
        Intrinsics.X0O(mWeekRoutineMET, "mWeekRoutineMET");
        Intrinsics.X0O(mWeekExerciseMET, "mWeekExerciseMET");
        this.mCurrentChecksum = mCurrentChecksum;
        this.mCurrentChecksumLength = i;
        this.mLastChecksum = mLastChecksum;
        this.mLastChecksumLength = i2;
        this.mRoutineMET = mRoutineMET;
        this.mExerciseMET = mExerciseMET;
        this.mDayMET = i3;
        this.mIsFirst = i4;
        this.mWeekRoutineMET = mWeekRoutineMET;
        this.mWeekExerciseMET = mWeekExerciseMET;
    }

    public /* synthetic */ BleAICoachBeforePlan(String str, int i, String str2, int i2, float[] fArr, float[] fArr2, int i3, int i4, float[] fArr3, float[] fArr4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? "-999" : str2, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr, (i5 & 32) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr2, (i5 & 64) != 0 ? 3 : i3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr3, (i5 & 512) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr4);
    }
}
