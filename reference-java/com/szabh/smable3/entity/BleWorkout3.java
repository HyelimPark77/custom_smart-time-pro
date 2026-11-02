package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.C2733ni;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleWorkout3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1563#2:229\n1634#2,3:230\n*S KotlinDebug\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n*L\n217#1:229\n217#1:230,3\n*E\n"})
public final class BleWorkout3 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 2048;
    public static final int WORKOUT_MAX_POINT = 32;
    private float mAerobic;
    private int mAirPressure;
    private int mAlgorithmMarking;
    private int mAltitude;
    private int mAltitudePathCount;

    @aa1
    private List<Integer> mAltitudePathPoints;
    private int mAltitudePathSampleInterval;
    private float mAnaerobic;
    private int mAvgBpm;
    private float mAvgSpeed;
    private int mAvgStress;

    @aa1
    private int[] mBpmZoneCount;
    private int mCadence;
    private int mCadencePathCount;

    @aa1
    private List<Integer> mCadencePathPoints;
    private int mCadencePathSampleInterval;
    private int mCalorie;
    private int mCnt;
    private int mDistance;
    private int mDuration;
    private int mEnd;
    private int mHrPathCount;

    @aa1
    private List<Integer> mHrPathPoints;
    private int mHrPathSampleInterval;
    private int mLactateThresholdHr;
    private int mLactateThresholdPace;
    private int mMaxAltitude;
    private int mMaxBpm;
    private int mMaxCadence;
    private int mMaxPace;
    private int mMaxSpeed;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMaxVO2;
    private int mMetTotal;
    private int mMinAltitude;
    private int mMinBpm;
    private int mMinPace;
    private int mMinSpeed;
    private int mMinSpm;
    private int mMinStress;
    private int mMode;
    private int mPace;
    private int mPacePathCount;

    @aa1
    private List<Integer> mPacePathPoints;
    private int mPacePathSampleInterval;
    private int mPathCount;

    @aa1
    private List<float[]> mPathPoints;
    private int mPathSampleInterval;

    @aa1
    private int[] mPersonalZone;
    private int mRecoveryTime;
    private int mSpeed;
    private int mSpeedPathCount;

    @aa1
    private List<Integer> mSpeedPathPoints;
    private int mSpeedPathSampleInterval;
    private int mSpm;
    private int mStamina;
    private int mStart;
    private int mStep;
    private int mTrainingLoad;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWorkout3() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, -1, C2733ni.iOOX010X, null);
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component10() {
        return this.mCalorie;
    }

    public final int component11() {
        return this.mSpeed;
    }

    public final int component12() {
        return this.mPace;
    }

    public final int component13() {
        return this.mAvgBpm;
    }

    public final int component14() {
        return this.mMaxBpm;
    }

    public final int component15() {
        return this.mMinBpm;
    }

    public final int component16() {
        return this.mMaxSpm;
    }

    public final int component17() {
        return this.mMinSpm;
    }

    public final int component18() {
        return this.mMaxPace;
    }

    public final int component19() {
        return this.mMinPace;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component20() {
        return this.mMaxAltitude;
    }

    public final int component21() {
        return this.mMinAltitude;
    }

    public final int component22() {
        return this.mMinStress;
    }

    public final int component23() {
        return this.mMaxStress;
    }

    public final int component24() {
        return this.mAvgStress;
    }

    public final int component25() {
        return this.mMaxSpeed;
    }

    public final int component26() {
        return this.mMinSpeed;
    }

    public final int component27() {
        return this.mMetTotal;
    }

    public final float component28() {
        return this.mAerobic;
    }

    public final float component29() {
        return this.mAnaerobic;
    }

    public final int component3() {
        return this.mDuration;
    }

    public final int component30() {
        return this.mStamina;
    }

    public final float component31() {
        return this.mAvgSpeed;
    }

    public final int component32() {
        return this.mCadence;
    }

    public final int component33() {
        return this.mMaxCadence;
    }

    public final int component34() {
        return this.mCnt;
    }

    @aa1
    public final int[] component35() {
        return this.mBpmZoneCount;
    }

    @aa1
    public final int[] component36() {
        return this.mPersonalZone;
    }

    public final int component37() {
        return this.mLactateThresholdPace;
    }

    public final int component38() {
        return this.mRecoveryTime;
    }

    public final int component39() {
        return this.mTrainingLoad;
    }

    public final int component4() {
        return this.mAltitude;
    }

    public final int component40() {
        return this.mMaxVO2;
    }

    public final int component41() {
        return this.mLactateThresholdHr;
    }

    public final int component42() {
        return this.mAlgorithmMarking;
    }

    public final int component43() {
        return this.mPathCount;
    }

    public final int component44() {
        return this.mPathSampleInterval;
    }

    @aa1
    public final List<float[]> component45() {
        return this.mPathPoints;
    }

    public final int component46() {
        return this.mHrPathCount;
    }

    public final int component47() {
        return this.mHrPathSampleInterval;
    }

    @aa1
    public final List<Integer> component48() {
        return this.mHrPathPoints;
    }

    public final int component49() {
        return this.mPacePathCount;
    }

    public final int component5() {
        return this.mAirPressure;
    }

    public final int component50() {
        return this.mPacePathSampleInterval;
    }

    @aa1
    public final List<Integer> component51() {
        return this.mPacePathPoints;
    }

    public final int component52() {
        return this.mSpeedPathCount;
    }

    public final int component53() {
        return this.mSpeedPathSampleInterval;
    }

    @aa1
    public final List<Integer> component54() {
        return this.mSpeedPathPoints;
    }

    public final int component55() {
        return this.mCadencePathCount;
    }

    public final int component56() {
        return this.mCadencePathSampleInterval;
    }

    @aa1
    public final List<Integer> component57() {
        return this.mCadencePathPoints;
    }

    public final int component58() {
        return this.mAltitudePathCount;
    }

    public final int component59() {
        return this.mAltitudePathSampleInterval;
    }

    public final int component6() {
        return this.mSpm;
    }

    @aa1
    public final List<Integer> component60() {
        return this.mAltitudePathPoints;
    }

    public final int component7() {
        return this.mMode;
    }

    public final int component8() {
        return this.mStep;
    }

    public final int component9() {
        return this.mDistance;
    }

    @aa1
    public final BleWorkout3 copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, float f, float f2, int i28, float f3, int i29, int i30, int i31, @aa1 int[] mBpmZoneCount, @aa1 int[] mPersonalZone, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, @aa1 List<float[]> mPathPoints, int i40, int i41, @aa1 List<Integer> mHrPathPoints, int i42, int i43, @aa1 List<Integer> mPacePathPoints, int i44, int i45, @aa1 List<Integer> mSpeedPathPoints, int i46, int i47, @aa1 List<Integer> mCadencePathPoints, int i48, int i49, @aa1 List<Integer> mAltitudePathPoints) {
        Intrinsics.X0O(mBpmZoneCount, "mBpmZoneCount");
        Intrinsics.X0O(mPersonalZone, "mPersonalZone");
        Intrinsics.X0O(mPathPoints, "mPathPoints");
        Intrinsics.X0O(mHrPathPoints, "mHrPathPoints");
        Intrinsics.X0O(mPacePathPoints, "mPacePathPoints");
        Intrinsics.X0O(mSpeedPathPoints, "mSpeedPathPoints");
        Intrinsics.X0O(mCadencePathPoints, "mCadencePathPoints");
        Intrinsics.X0O(mAltitudePathPoints, "mAltitudePathPoints");
        return new BleWorkout3(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, f, f2, i28, f3, i29, i30, i31, mBpmZoneCount, mPersonalZone, i32, i33, i34, i35, i36, i37, i38, i39, mPathPoints, i40, i41, mHrPathPoints, i42, i43, mPacePathPoints, i44, i45, mSpeedPathPoints, i46, i47, mCadencePathPoints, i48, i49, mAltitudePathPoints);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = BleReadable.readInt32$default(this, null, 1, null);
        this.mEnd = BleReadable.readInt32$default(this, null, 1, null);
        this.mDuration = BleReadable.readUInt16$default(this, null, 1, null);
        this.mAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mAirPressure = BleReadable.readUInt16$default(this, null, 1, null);
        this.mSpm = readUInt8();
        this.mMode = readUInt8();
        this.mStep = BleReadable.readInt32$default(this, null, 1, null);
        this.mDistance = BleReadable.readInt32$default(this, null, 1, null);
        this.mCalorie = BleReadable.readInt32$default(this, null, 1, null);
        this.mSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mAvgBpm = readUInt8();
        this.mMaxBpm = readUInt8();
        this.mMinBpm = readUInt8();
        readInt8();
        this.mMaxSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMaxPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMaxAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinStress = readUInt8();
        this.mMaxStress = readUInt8();
        this.mAvgStress = readUInt8();
        this.mMaxSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinSpeed = BleReadable.readInt32$default(this, null, 1, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMetTotal = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAerobic = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAnaerobic = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStamina = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAvgSpeed = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCadence = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMaxCadence = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCnt = readInt32(LITTLE_ENDIAN);
        for (int i = 0; i < 5; i++) {
            int[] iArr = this.mBpmZoneCount;
            ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
            iArr[i] = readUInt16(LITTLE_ENDIAN2);
        }
        for (int i2 = 0; i2 < 5; i2++) {
            int[] iArr2 = this.mPersonalZone;
            ByteOrder LITTLE_ENDIAN3 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN3, "LITTLE_ENDIAN");
            iArr2[i2] = readUInt16(LITTLE_ENDIAN3);
        }
        ByteOrder LITTLE_ENDIAN4 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mLactateThresholdPace = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mRecoveryTime = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mTrainingLoad = readUInt16(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mMaxVO2 = readUInt16(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mLactateThresholdHr = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mAlgorithmMarking = readUInt16(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mPathCount = readInt32(LITTLE_ENDIAN4);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN4, "LITTLE_ENDIAN");
        this.mPathSampleInterval = readInt32(LITTLE_ENDIAN4);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 32; i3++) {
            ByteOrder LITTLE_ENDIAN5 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN5, "LITTLE_ENDIAN");
            float f = readFloat(LITTLE_ENDIAN5);
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN5, "LITTLE_ENDIAN");
            arrayList.add(new float[]{f, readFloat(LITTLE_ENDIAN5)});
        }
        this.mPathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList, this.mPathCount);
        ByteOrder LITTLE_ENDIAN6 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN6, "LITTLE_ENDIAN");
        this.mHrPathCount = readInt32(LITTLE_ENDIAN6);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN6, "LITTLE_ENDIAN");
        this.mHrPathSampleInterval = readInt32(LITTLE_ENDIAN6);
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < 32; i4++) {
            ByteOrder LITTLE_ENDIAN7 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN7, "LITTLE_ENDIAN");
            arrayList2.add(Integer.valueOf(readInt32(LITTLE_ENDIAN7)));
        }
        this.mHrPathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList2, this.mHrPathCount);
        ByteOrder LITTLE_ENDIAN8 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN8, "LITTLE_ENDIAN");
        this.mPacePathCount = readInt32(LITTLE_ENDIAN8);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN8, "LITTLE_ENDIAN");
        this.mPacePathSampleInterval = readInt32(LITTLE_ENDIAN8);
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < 32; i5++) {
            ByteOrder LITTLE_ENDIAN9 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN9, "LITTLE_ENDIAN");
            arrayList3.add(Integer.valueOf(readInt32(LITTLE_ENDIAN9)));
        }
        this.mPacePathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, this.mPacePathCount);
        ByteOrder LITTLE_ENDIAN10 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN10, "LITTLE_ENDIAN");
        this.mSpeedPathCount = readInt32(LITTLE_ENDIAN10);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN10, "LITTLE_ENDIAN");
        this.mSpeedPathSampleInterval = readInt32(LITTLE_ENDIAN10);
        ArrayList arrayList4 = new ArrayList();
        for (int i6 = 0; i6 < 32; i6++) {
            ByteOrder LITTLE_ENDIAN11 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN11, "LITTLE_ENDIAN");
            arrayList4.add(Integer.valueOf(readInt32(LITTLE_ENDIAN11)));
        }
        this.mSpeedPathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList4, this.mSpeedPathCount);
        ByteOrder LITTLE_ENDIAN12 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN12, "LITTLE_ENDIAN");
        this.mCadencePathCount = readInt32(LITTLE_ENDIAN12);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN12, "LITTLE_ENDIAN");
        this.mCadencePathSampleInterval = readInt32(LITTLE_ENDIAN12);
        ArrayList arrayList5 = new ArrayList();
        for (int i7 = 0; i7 < 32; i7++) {
            ByteOrder LITTLE_ENDIAN13 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN13, "LITTLE_ENDIAN");
            arrayList5.add(Integer.valueOf(readInt32(LITTLE_ENDIAN13)));
        }
        this.mCadencePathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList5, this.mCadencePathCount);
        ByteOrder LITTLE_ENDIAN14 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN14, "LITTLE_ENDIAN");
        this.mAltitudePathCount = readInt32(LITTLE_ENDIAN14);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN14, "LITTLE_ENDIAN");
        this.mAltitudePathSampleInterval = readInt32(LITTLE_ENDIAN14);
        ArrayList arrayList6 = new ArrayList();
        for (int i8 = 0; i8 < 32; i8++) {
            ByteOrder LITTLE_ENDIAN15 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN15, "LITTLE_ENDIAN");
            arrayList6.add(Integer.valueOf(readInt32(LITTLE_ENDIAN15)));
        }
        this.mAltitudePathPoints = CollectionsKt___CollectionsKt.IO0OOi(arrayList6, this.mAltitudePathCount);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWorkout3)) {
            return false;
        }
        BleWorkout3 bleWorkout3 = (BleWorkout3) obj;
        return this.mStart == bleWorkout3.mStart && this.mEnd == bleWorkout3.mEnd && this.mDuration == bleWorkout3.mDuration && this.mAltitude == bleWorkout3.mAltitude && this.mAirPressure == bleWorkout3.mAirPressure && this.mSpm == bleWorkout3.mSpm && this.mMode == bleWorkout3.mMode && this.mStep == bleWorkout3.mStep && this.mDistance == bleWorkout3.mDistance && this.mCalorie == bleWorkout3.mCalorie && this.mSpeed == bleWorkout3.mSpeed && this.mPace == bleWorkout3.mPace && this.mAvgBpm == bleWorkout3.mAvgBpm && this.mMaxBpm == bleWorkout3.mMaxBpm && this.mMinBpm == bleWorkout3.mMinBpm && this.mMaxSpm == bleWorkout3.mMaxSpm && this.mMinSpm == bleWorkout3.mMinSpm && this.mMaxPace == bleWorkout3.mMaxPace && this.mMinPace == bleWorkout3.mMinPace && this.mMaxAltitude == bleWorkout3.mMaxAltitude && this.mMinAltitude == bleWorkout3.mMinAltitude && this.mMinStress == bleWorkout3.mMinStress && this.mMaxStress == bleWorkout3.mMaxStress && this.mAvgStress == bleWorkout3.mAvgStress && this.mMaxSpeed == bleWorkout3.mMaxSpeed && this.mMinSpeed == bleWorkout3.mMinSpeed && this.mMetTotal == bleWorkout3.mMetTotal && Float.compare(this.mAerobic, bleWorkout3.mAerobic) == 0 && Float.compare(this.mAnaerobic, bleWorkout3.mAnaerobic) == 0 && this.mStamina == bleWorkout3.mStamina && Float.compare(this.mAvgSpeed, bleWorkout3.mAvgSpeed) == 0 && this.mCadence == bleWorkout3.mCadence && this.mMaxCadence == bleWorkout3.mMaxCadence && this.mCnt == bleWorkout3.mCnt && Intrinsics.XOO0ii0(this.mBpmZoneCount, bleWorkout3.mBpmZoneCount) && Intrinsics.XOO0ii0(this.mPersonalZone, bleWorkout3.mPersonalZone) && this.mLactateThresholdPace == bleWorkout3.mLactateThresholdPace && this.mRecoveryTime == bleWorkout3.mRecoveryTime && this.mTrainingLoad == bleWorkout3.mTrainingLoad && this.mMaxVO2 == bleWorkout3.mMaxVO2 && this.mLactateThresholdHr == bleWorkout3.mLactateThresholdHr && this.mAlgorithmMarking == bleWorkout3.mAlgorithmMarking && this.mPathCount == bleWorkout3.mPathCount && this.mPathSampleInterval == bleWorkout3.mPathSampleInterval && Intrinsics.XOO0ii0(this.mPathPoints, bleWorkout3.mPathPoints) && this.mHrPathCount == bleWorkout3.mHrPathCount && this.mHrPathSampleInterval == bleWorkout3.mHrPathSampleInterval && Intrinsics.XOO0ii0(this.mHrPathPoints, bleWorkout3.mHrPathPoints) && this.mPacePathCount == bleWorkout3.mPacePathCount && this.mPacePathSampleInterval == bleWorkout3.mPacePathSampleInterval && Intrinsics.XOO0ii0(this.mPacePathPoints, bleWorkout3.mPacePathPoints) && this.mSpeedPathCount == bleWorkout3.mSpeedPathCount && this.mSpeedPathSampleInterval == bleWorkout3.mSpeedPathSampleInterval && Intrinsics.XOO0ii0(this.mSpeedPathPoints, bleWorkout3.mSpeedPathPoints) && this.mCadencePathCount == bleWorkout3.mCadencePathCount && this.mCadencePathSampleInterval == bleWorkout3.mCadencePathSampleInterval && Intrinsics.XOO0ii0(this.mCadencePathPoints, bleWorkout3.mCadencePathPoints) && this.mAltitudePathCount == bleWorkout3.mAltitudePathCount && this.mAltitudePathSampleInterval == bleWorkout3.mAltitudePathSampleInterval && Intrinsics.XOO0ii0(this.mAltitudePathPoints, bleWorkout3.mAltitudePathPoints);
    }

    @aa1
    public final String floatArrayListToString(@aa1 List<float[]> list) {
        Intrinsics.X0O(list, "list");
        List<float[]> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        String string = "";
        for (float[] fArr : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String string2 = Arrays.toString(fArr);
            Intrinsics.O10IXXX0X(string2, "toString(...)");
            sb.append(string2);
            string = sb.toString();
            arrayList.add(Unit.OXO1);
        }
        return string;
    }

    public final float getMAerobic() {
        return this.mAerobic;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAlgorithmMarking() {
        return this.mAlgorithmMarking;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAltitudePathCount() {
        return this.mAltitudePathCount;
    }

    @aa1
    public final List<Integer> getMAltitudePathPoints() {
        return this.mAltitudePathPoints;
    }

    public final int getMAltitudePathSampleInterval() {
        return this.mAltitudePathSampleInterval;
    }

    public final float getMAnaerobic() {
        return this.mAnaerobic;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    @aa1
    public final int[] getMBpmZoneCount() {
        return this.mBpmZoneCount;
    }

    public final int getMCadence() {
        return this.mCadence;
    }

    public final int getMCadencePathCount() {
        return this.mCadencePathCount;
    }

    @aa1
    public final List<Integer> getMCadencePathPoints() {
        return this.mCadencePathPoints;
    }

    public final int getMCadencePathSampleInterval() {
        return this.mCadencePathSampleInterval;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMCnt() {
        return this.mCnt;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMEnd() {
        return this.mEnd;
    }

    public final int getMHrPathCount() {
        return this.mHrPathCount;
    }

    @aa1
    public final List<Integer> getMHrPathPoints() {
        return this.mHrPathPoints;
    }

    public final int getMHrPathSampleInterval() {
        return this.mHrPathSampleInterval;
    }

    public final int getMLactateThresholdHr() {
        return this.mLactateThresholdHr;
    }

    public final int getMLactateThresholdPace() {
        return this.mLactateThresholdPace;
    }

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxCadence() {
        return this.mMaxCadence;
    }

    public final int getMMaxPace() {
        return this.mMaxPace;
    }

    public final int getMMaxSpeed() {
        return this.mMaxSpeed;
    }

    public final int getMMaxSpm() {
        return this.mMaxSpm;
    }

    public final int getMMaxStress() {
        return this.mMaxStress;
    }

    public final int getMMaxVO2() {
        return this.mMaxVO2;
    }

    public final int getMMetTotal() {
        return this.mMetTotal;
    }

    public final int getMMinAltitude() {
        return this.mMinAltitude;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
    }

    public final int getMMinPace() {
        return this.mMinPace;
    }

    public final int getMMinSpeed() {
        return this.mMinSpeed;
    }

    public final int getMMinSpm() {
        return this.mMinSpm;
    }

    public final int getMMinStress() {
        return this.mMinStress;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMPacePathCount() {
        return this.mPacePathCount;
    }

    @aa1
    public final List<Integer> getMPacePathPoints() {
        return this.mPacePathPoints;
    }

    public final int getMPacePathSampleInterval() {
        return this.mPacePathSampleInterval;
    }

    public final int getMPathCount() {
        return this.mPathCount;
    }

    @aa1
    public final List<float[]> getMPathPoints() {
        return this.mPathPoints;
    }

    public final int getMPathSampleInterval() {
        return this.mPathSampleInterval;
    }

    @aa1
    public final int[] getMPersonalZone() {
        return this.mPersonalZone;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpeedPathCount() {
        return this.mSpeedPathCount;
    }

    @aa1
    public final List<Integer> getMSpeedPathPoints() {
        return this.mSpeedPathPoints;
    }

    public final int getMSpeedPathSampleInterval() {
        return this.mSpeedPathSampleInterval;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStamina() {
        return this.mStamina;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mMinSpeed)) * 31) + Integer.hashCode(this.mMetTotal)) * 31) + Float.hashCode(this.mAerobic)) * 31) + Float.hashCode(this.mAnaerobic)) * 31) + Integer.hashCode(this.mStamina)) * 31) + Float.hashCode(this.mAvgSpeed)) * 31) + Integer.hashCode(this.mCadence)) * 31) + Integer.hashCode(this.mMaxCadence)) * 31) + Integer.hashCode(this.mCnt)) * 31) + Arrays.hashCode(this.mBpmZoneCount)) * 31) + Arrays.hashCode(this.mPersonalZone)) * 31) + Integer.hashCode(this.mLactateThresholdPace)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mMaxVO2)) * 31) + Integer.hashCode(this.mLactateThresholdHr)) * 31) + Integer.hashCode(this.mAlgorithmMarking)) * 31) + Integer.hashCode(this.mPathCount)) * 31) + Integer.hashCode(this.mPathSampleInterval)) * 31) + this.mPathPoints.hashCode()) * 31) + Integer.hashCode(this.mHrPathCount)) * 31) + Integer.hashCode(this.mHrPathSampleInterval)) * 31) + this.mHrPathPoints.hashCode()) * 31) + Integer.hashCode(this.mPacePathCount)) * 31) + Integer.hashCode(this.mPacePathSampleInterval)) * 31) + this.mPacePathPoints.hashCode()) * 31) + Integer.hashCode(this.mSpeedPathCount)) * 31) + Integer.hashCode(this.mSpeedPathSampleInterval)) * 31) + this.mSpeedPathPoints.hashCode()) * 31) + Integer.hashCode(this.mCadencePathCount)) * 31) + Integer.hashCode(this.mCadencePathSampleInterval)) * 31) + this.mCadencePathPoints.hashCode()) * 31) + Integer.hashCode(this.mAltitudePathCount)) * 31) + Integer.hashCode(this.mAltitudePathSampleInterval)) * 31) + this.mAltitudePathPoints.hashCode();
    }

    public final void setMAerobic(float f) {
        this.mAerobic = f;
    }

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAlgorithmMarking(int i) {
        this.mAlgorithmMarking = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMAltitudePathCount(int i) {
        this.mAltitudePathCount = i;
    }

    public final void setMAltitudePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAltitudePathPoints = list;
    }

    public final void setMAltitudePathSampleInterval(int i) {
        this.mAltitudePathSampleInterval = i;
    }

    public final void setMAnaerobic(float f) {
        this.mAnaerobic = f;
    }

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public final void setMAvgStress(int i) {
        this.mAvgStress = i;
    }

    public final void setMBpmZoneCount(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mBpmZoneCount = iArr;
    }

    public final void setMCadence(int i) {
        this.mCadence = i;
    }

    public final void setMCadencePathCount(int i) {
        this.mCadencePathCount = i;
    }

    public final void setMCadencePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mCadencePathPoints = list;
    }

    public final void setMCadencePathSampleInterval(int i) {
        this.mCadencePathSampleInterval = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMCnt(int i) {
        this.mCnt = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMEnd(int i) {
        this.mEnd = i;
    }

    public final void setMHrPathCount(int i) {
        this.mHrPathCount = i;
    }

    public final void setMHrPathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHrPathPoints = list;
    }

    public final void setMHrPathSampleInterval(int i) {
        this.mHrPathSampleInterval = i;
    }

    public final void setMLactateThresholdHr(int i) {
        this.mLactateThresholdHr = i;
    }

    public final void setMLactateThresholdPace(int i) {
        this.mLactateThresholdPace = i;
    }

    public final void setMMaxAltitude(int i) {
        this.mMaxAltitude = i;
    }

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMMaxCadence(int i) {
        this.mMaxCadence = i;
    }

    public final void setMMaxPace(int i) {
        this.mMaxPace = i;
    }

    public final void setMMaxSpeed(int i) {
        this.mMaxSpeed = i;
    }

    public final void setMMaxSpm(int i) {
        this.mMaxSpm = i;
    }

    public final void setMMaxStress(int i) {
        this.mMaxStress = i;
    }

    public final void setMMaxVO2(int i) {
        this.mMaxVO2 = i;
    }

    public final void setMMetTotal(int i) {
        this.mMetTotal = i;
    }

    public final void setMMinAltitude(int i) {
        this.mMinAltitude = i;
    }

    public final void setMMinBpm(int i) {
        this.mMinBpm = i;
    }

    public final void setMMinPace(int i) {
        this.mMinPace = i;
    }

    public final void setMMinSpeed(int i) {
        this.mMinSpeed = i;
    }

    public final void setMMinSpm(int i) {
        this.mMinSpm = i;
    }

    public final void setMMinStress(int i) {
        this.mMinStress = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPacePathCount(int i) {
        this.mPacePathCount = i;
    }

    public final void setMPacePathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPacePathPoints = list;
    }

    public final void setMPacePathSampleInterval(int i) {
        this.mPacePathSampleInterval = i;
    }

    public final void setMPathCount(int i) {
        this.mPathCount = i;
    }

    public final void setMPathPoints(@aa1 List<float[]> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPathPoints = list;
    }

    public final void setMPathSampleInterval(int i) {
        this.mPathSampleInterval = i;
    }

    public final void setMPersonalZone(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mPersonalZone = iArr;
    }

    public final void setMRecoveryTime(int i) {
        this.mRecoveryTime = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMSpeedPathCount(int i) {
        this.mSpeedPathCount = i;
    }

    public final void setMSpeedPathPoints(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSpeedPathPoints = list;
    }

    public final void setMSpeedPathSampleInterval(int i) {
        this.mSpeedPathSampleInterval = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMStamina(int i) {
        this.mStamina = i;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMTrainingLoad(int i) {
        this.mTrainingLoad = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleWorkout3(mStart=");
        sb.append(this.mStart);
        sb.append(", mEnd=");
        sb.append(this.mEnd);
        sb.append(", mDuration=");
        sb.append(this.mDuration);
        sb.append(", mAltitude=");
        sb.append(this.mAltitude);
        sb.append(", mAirPressure=");
        sb.append(this.mAirPressure);
        sb.append(", mSpm=");
        sb.append(this.mSpm);
        sb.append(", mMode=");
        sb.append(this.mMode);
        sb.append(", mStep=");
        sb.append(this.mStep);
        sb.append(",mDistance=");
        sb.append(this.mDuration);
        sb.append(", mCalorie=");
        sb.append(this.mCalorie);
        sb.append(", mSpeed=");
        sb.append(this.mSpeed);
        sb.append(", mPace=");
        sb.append(this.mPace);
        sb.append(", mAvgBpm=");
        sb.append(this.mAvgBpm);
        sb.append(", mMaxBpm=");
        sb.append(this.mMaxBpm);
        sb.append(", mMinBpm=");
        sb.append(this.mMinBpm);
        sb.append(", mMaxSpm=");
        sb.append(this.mMaxSpm);
        sb.append(", mMinSpm=");
        sb.append(this.mMinSpm);
        sb.append(", mMaxPace=");
        sb.append(this.mMaxPace);
        sb.append("  mMinPace=");
        sb.append(this.mMinPace);
        sb.append(", mMaxAltitude=");
        sb.append(this.mMaxAltitude);
        sb.append(", mMinAltitude=");
        sb.append(this.mMinAltitude);
        sb.append(", mMinStress=");
        sb.append(this.mMinStress);
        sb.append(", mMaxStress=");
        sb.append(this.mMaxStress);
        sb.append(", mAvgStress=");
        sb.append(this.mAvgStress);
        sb.append(", mMaxSpeed=");
        sb.append(this.mMaxSpeed);
        sb.append(", mMinSpeed=");
        sb.append(this.mMinSpeed);
        sb.append(" , mMetTotal=");
        sb.append(this.mMetTotal);
        sb.append(", mAerobic=");
        sb.append(this.mAerobic);
        sb.append(", mAnaerobic=");
        sb.append(this.mAnaerobic);
        sb.append(", mStamina=");
        sb.append(this.mStamina);
        sb.append(", mAvgSpeed=");
        sb.append(this.mAvgSpeed);
        sb.append(", mCadence=");
        sb.append(this.mCadence);
        sb.append(", mMaxCadence=");
        sb.append(this.mMaxCadence);
        sb.append(", mCnt=");
        sb.append(this.mCnt);
        sb.append(" mBpmZoneCount=");
        String string = Arrays.toString(this.mBpmZoneCount);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        sb.append(string);
        sb.append(", mPersonalZone=");
        String string2 = Arrays.toString(this.mPersonalZone);
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        sb.append(string2);
        sb.append(", mLactateThresholdPace=");
        sb.append(this.mLactateThresholdPace);
        sb.append(", mRecoveryTime=");
        sb.append(this.mRecoveryTime);
        sb.append(", mTrainingLoad=");
        sb.append(this.mTrainingLoad);
        sb.append(", mMaxVO2=");
        sb.append(this.mMaxVO2);
        sb.append(", mLactateThresholdHr=");
        sb.append(this.mLactateThresholdHr);
        sb.append(", mAlgorithmMarking=");
        sb.append(this.mAlgorithmMarking);
        sb.append(",mPathCount=");
        sb.append(this.mPathCount);
        sb.append(", mPathSampleInterval=");
        sb.append(this.mPathSampleInterval);
        sb.append(", mPathPoints=");
        sb.append(floatArrayListToString(this.mPathPoints));
        sb.append(", mHrPathCount=");
        sb.append(this.mHrPathCount);
        sb.append(", mHrPathSampleInterval=");
        sb.append(this.mHrPathSampleInterval);
        sb.append(", mHrPathPoints=");
        sb.append(this.mHrPathPoints);
        sb.append(" mPacePathCount=");
        sb.append(this.mPacePathCount);
        sb.append(", mPacePathSampleInterval=");
        sb.append(this.mPacePathSampleInterval);
        sb.append(", mPacePathPoints=");
        sb.append(this.mPacePathPoints);
        sb.append(" mSpeedPathCount=");
        sb.append(this.mSpeedPathCount);
        sb.append(", mSpeedPathSampleInterval=");
        sb.append(this.mSpeedPathSampleInterval);
        sb.append(", mSpeedPathPoints=");
        sb.append(this.mSpeedPathPoints);
        sb.append("  mCadencePathCount=");
        sb.append(this.mCadencePathCount);
        sb.append(", mCadencePathSampleInterval=");
        sb.append(this.mCadencePathSampleInterval);
        sb.append(",mCadencePathPoints=");
        sb.append(this.mCadencePathPoints);
        sb.append(", mAltitudePathCount=");
        sb.append(this.mAltitudePathCount);
        sb.append(", mAltitudePathSampleInterval=");
        sb.append(this.mAltitudePathSampleInterval);
        sb.append(",mAltitudePathPoints=");
        sb.append(this.mAltitudePathPoints);
        return sb.toString();
    }

    public BleWorkout3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, float f, float f2, int i28, float f3, int i29, int i30, int i31, @aa1 int[] mBpmZoneCount, @aa1 int[] mPersonalZone, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, @aa1 List<float[]> mPathPoints, int i40, int i41, @aa1 List<Integer> mHrPathPoints, int i42, int i43, @aa1 List<Integer> mPacePathPoints, int i44, int i45, @aa1 List<Integer> mSpeedPathPoints, int i46, int i47, @aa1 List<Integer> mCadencePathPoints, int i48, int i49, @aa1 List<Integer> mAltitudePathPoints) {
        Intrinsics.X0O(mBpmZoneCount, "mBpmZoneCount");
        Intrinsics.X0O(mPersonalZone, "mPersonalZone");
        Intrinsics.X0O(mPathPoints, "mPathPoints");
        Intrinsics.X0O(mHrPathPoints, "mHrPathPoints");
        Intrinsics.X0O(mPacePathPoints, "mPacePathPoints");
        Intrinsics.X0O(mSpeedPathPoints, "mSpeedPathPoints");
        Intrinsics.X0O(mCadencePathPoints, "mCadencePathPoints");
        Intrinsics.X0O(mAltitudePathPoints, "mAltitudePathPoints");
        this.mStart = i;
        this.mEnd = i2;
        this.mDuration = i3;
        this.mAltitude = i4;
        this.mAirPressure = i5;
        this.mSpm = i6;
        this.mMode = i7;
        this.mStep = i8;
        this.mDistance = i9;
        this.mCalorie = i10;
        this.mSpeed = i11;
        this.mPace = i12;
        this.mAvgBpm = i13;
        this.mMaxBpm = i14;
        this.mMinBpm = i15;
        this.mMaxSpm = i16;
        this.mMinSpm = i17;
        this.mMaxPace = i18;
        this.mMinPace = i19;
        this.mMaxAltitude = i20;
        this.mMinAltitude = i21;
        this.mMinStress = i22;
        this.mMaxStress = i23;
        this.mAvgStress = i24;
        this.mMaxSpeed = i25;
        this.mMinSpeed = i26;
        this.mMetTotal = i27;
        this.mAerobic = f;
        this.mAnaerobic = f2;
        this.mStamina = i28;
        this.mAvgSpeed = f3;
        this.mCadence = i29;
        this.mMaxCadence = i30;
        this.mCnt = i31;
        this.mBpmZoneCount = mBpmZoneCount;
        this.mPersonalZone = mPersonalZone;
        this.mLactateThresholdPace = i32;
        this.mRecoveryTime = i33;
        this.mTrainingLoad = i34;
        this.mMaxVO2 = i35;
        this.mLactateThresholdHr = i36;
        this.mAlgorithmMarking = i37;
        this.mPathCount = i38;
        this.mPathSampleInterval = i39;
        this.mPathPoints = mPathPoints;
        this.mHrPathCount = i40;
        this.mHrPathSampleInterval = i41;
        this.mHrPathPoints = mHrPathPoints;
        this.mPacePathCount = i42;
        this.mPacePathSampleInterval = i43;
        this.mPacePathPoints = mPacePathPoints;
        this.mSpeedPathCount = i44;
        this.mSpeedPathSampleInterval = i45;
        this.mSpeedPathPoints = mSpeedPathPoints;
        this.mCadencePathCount = i46;
        this.mCadencePathSampleInterval = i47;
        this.mCadencePathPoints = mCadencePathPoints;
        this.mAltitudePathCount = i48;
        this.mAltitudePathSampleInterval = i49;
        this.mAltitudePathPoints = mAltitudePathPoints;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleWorkout3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, float f, float f2, int i28, float f3, int i29, int i30, int i31, int[] iArr, int[] iArr2, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, List list, int i40, int i41, List list2, int i42, int i43, List list3, int i44, int i45, List list4, int i46, int i47, List list5, int i48, int i49, List list6, int i50, int i51, DefaultConstructorMarker defaultConstructorMarker) {
        int i52 = (i50 & 1) != 0 ? 0 : i;
        int i53 = (i50 & 2) != 0 ? 0 : i2;
        int i54 = (i50 & 4) != 0 ? 0 : i3;
        int i55 = (i50 & 8) != 0 ? 0 : i4;
        int i56 = (i50 & 16) != 0 ? 0 : i5;
        int i57 = (i50 & 32) != 0 ? 0 : i6;
        int i58 = (i50 & 64) != 0 ? 0 : i7;
        int i59 = (i50 & 128) != 0 ? 0 : i8;
        int i60 = (i50 & 256) != 0 ? 0 : i9;
        int i61 = (i50 & 512) != 0 ? 0 : i10;
        int i62 = (i50 & 1024) != 0 ? 0 : i11;
        int i63 = (i50 & 2048) != 0 ? 0 : i12;
        int i64 = (i50 & 4096) != 0 ? 0 : i13;
        int i65 = (i50 & 8192) != 0 ? 0 : i14;
        int i66 = i52;
        int i67 = (i50 & 16384) != 0 ? 0 : i15;
        int i68 = (i50 & 32768) != 0 ? 0 : i16;
        int i69 = (i50 & 65536) != 0 ? 0 : i17;
        int i70 = (i50 & 131072) != 0 ? 0 : i18;
        int i71 = (i50 & 262144) != 0 ? 0 : i19;
        int i72 = (i50 & 524288) != 0 ? 0 : i20;
        int i73 = (i50 & 1048576) != 0 ? 0 : i21;
        int i74 = (i50 & 2097152) != 0 ? 0 : i22;
        int i75 = (i50 & 4194304) != 0 ? 0 : i23;
        int i76 = (i50 & 8388608) != 0 ? 0 : i24;
        int i77 = (i50 & 16777216) != 0 ? 0 : i25;
        int i78 = (i50 & 33554432) != 0 ? 0 : i26;
        int i79 = (i50 & 67108864) != 0 ? 0 : i27;
        float f4 = (i50 & 134217728) != 0 ? 0.0f : f;
        float f5 = (i50 & 268435456) != 0 ? 0.0f : f2;
        int i80 = (i50 & 536870912) != 0 ? 0 : i28;
        float f6 = (i50 & 1073741824) == 0 ? f3 : 0.0f;
        int i81 = (i50 & Integer.MIN_VALUE) != 0 ? 0 : i29;
        this(i66, i53, i54, i55, i56, i57, i58, i59, i60, i61, i62, i63, i64, i65, i67, i68, i69, i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, f4, f5, i80, f6, i81, (i51 & 1) != 0 ? 0 : i30, (i51 & 2) != 0 ? 0 : i31, (i51 & 4) != 0 ? new int[5] : iArr, (i51 & 8) != 0 ? new int[5] : iArr2, (i51 & 16) != 0 ? 0 : i32, (i51 & 32) != 0 ? 0 : i33, (i51 & 64) != 0 ? 0 : i34, (i51 & 128) != 0 ? 0 : i35, (i51 & 256) != 0 ? 0 : i36, (i51 & 512) != 0 ? 0 : i37, (i51 & 1024) != 0 ? 0 : i38, (i51 & 2048) != 0 ? 0 : i39, (i51 & 4096) != 0 ? new ArrayList() : list, (i51 & 8192) != 0 ? 0 : i40, (i51 & 16384) != 0 ? 0 : i41, (i51 & 32768) != 0 ? new ArrayList() : list2, (i51 & 65536) != 0 ? 0 : i42, (i51 & 131072) != 0 ? 0 : i43, (i51 & 262144) != 0 ? new ArrayList() : list3, (i51 & 524288) != 0 ? 0 : i44, (i51 & 1048576) != 0 ? 0 : i45, (i51 & 2097152) != 0 ? new ArrayList() : list4, (i51 & 4194304) != 0 ? 0 : i46, (i51 & 8388608) != 0 ? 0 : i47, (i51 & 16777216) != 0 ? new ArrayList() : list5, (i51 & 33554432) != 0 ? 0 : i48, (i51 & 67108864) != 0 ? 0 : i49, (i51 & 134217728) != 0 ? new ArrayList() : list6);
    }
}
