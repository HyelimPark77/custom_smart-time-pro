package com.sma.smartv3.biz.fitness_site.fitbit;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FitbitWorkout {

    @aa1
    private static final String ALPINE_SKI = "AlpineSki";

    @aa1
    private static final String BACKCOUNTRY_SKI = "BackcountrySki";

    @aa1
    private static final String CANOEING = "Canoeing";

    @aa1
    private static final String CROSSFIT = "Crossfit";

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private static final String ELLIPTICAL = "Elliptical";

    @aa1
    private static final String E_BIKE_RIDE = "EBikeRide";

    @aa1
    private static final String GOLF = "Golf";

    @aa1
    private static final String HANDCYCLE = "Handcycle";

    @aa1
    private static final String HIKE = "Hike";

    @aa1
    private static final String ICE_SKATE = "IceSkate";

    @aa1
    private static final String INLINE_SKATE = "InlineSkate";

    @aa1
    private static final String KAYAKING = "Kayaking";

    @aa1
    private static final String KITESURF = "Kitesurf";

    @aa1
    private static final String NORDIC_SKI = "NordicSki";

    @aa1
    private static final String RIDE = "Ride";

    @aa1
    private static final String ROCK_CLIMBING = "RockClimbing";

    @aa1
    private static final String ROLLER_SKI = "RollerSki";

    @aa1
    private static final String ROWING = "Rowing";

    @aa1
    private static final String RUN = "Run";

    @aa1
    private static final String SAIL = "Sail";

    @aa1
    private static final String SKATEBOARD = "Skateboard";

    @aa1
    private static final String SNOWBOARD = "Snowboard";

    @aa1
    private static final String SNOWSHOE = "Snowshoe";

    @aa1
    private static final String SOCCER = "Soccer";

    @aa1
    private static final String STAIR_STEPPER = "StairStepper";

    @aa1
    private static final String STAND_UP_PADDLING = "StandUpPaddling";

    @aa1
    private static final String SURFING = "Surfing";

    @aa1
    private static final String SWIM = "Swim";

    @aa1
    private static final String VELOMOBILE = "Velomobile";

    @aa1
    private static final String VIRTUAL_RIDE = "VirtualRide";

    @aa1
    private static final String VIRTUAL_RUN = "VirtualRun";

    @aa1
    private static final String WALK = "Walk";

    @aa1
    private static final String WEIGHT_TRAINING = "WeightTraining";

    @aa1
    private static final String WHEELCHAIR = "Wheelchair";

    @aa1
    private static final String WINDSURF = "Windsurf";

    @aa1
    private static final String WORKOUT = "Workout";

    @aa1
    private static final String YOGA = "Yoga";
    private int mCalorie;
    private int mCommute;

    @aa1
    private String mDate;

    @aa1
    private String mDescription;
    private int mDistance;
    private long mElapsedTime;
    private long mEnd;
    private int mMode;

    @aa1
    private String mName;
    private long mStart;

    @aa1
    private String mStartTime;
    private int mTrainer;

    @aa1
    private String mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String getTypeByActivityMode(int i) {
            if (i == 7) {
                return FitbitWorkout.RUN;
            }
            if (i == 14) {
                return FitbitWorkout.YOGA;
            }
            switch (i) {
                case 10:
                    return FitbitWorkout.RIDE;
                case 11:
                    return FitbitWorkout.SWIM;
                case 12:
                    return FitbitWorkout.WALK;
                default:
                    return FitbitWorkout.WORKOUT;
            }
        }

        private Companion() {
        }
    }

    public FitbitWorkout() {
        this(null, null, null, 0L, null, 0, 0, 0, 0L, 0L, 0, null, 0, 8191, null);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    public final long component10() {
        return this.mEnd;
    }

    public final int component11() {
        return this.mMode;
    }

    @aa1
    public final String component12() {
        return this.mDate;
    }

    public final int component13() {
        return this.mCalorie;
    }

    @aa1
    public final String component2() {
        return this.mType;
    }

    @aa1
    public final String component3() {
        return this.mStartTime;
    }

    public final long component4() {
        return this.mElapsedTime;
    }

    @aa1
    public final String component5() {
        return this.mDescription;
    }

    public final int component6() {
        return this.mDistance;
    }

    public final int component7() {
        return this.mTrainer;
    }

    public final int component8() {
        return this.mCommute;
    }

    public final long component9() {
        return this.mStart;
    }

    @aa1
    public final FitbitWorkout copy(@aa1 String mName, @aa1 String mType, @aa1 String mStartTime, long j, @aa1 String mDescription, int i, int i2, int i3, long j2, long j3, int i4, @aa1 String mDate, int i5) {
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mType, "mType");
        Intrinsics.X0O(mStartTime, "mStartTime");
        Intrinsics.X0O(mDescription, "mDescription");
        Intrinsics.X0O(mDate, "mDate");
        return new FitbitWorkout(mName, mType, mStartTime, j, mDescription, i, i2, i3, j2, j3, i4, mDate, i5);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitbitWorkout)) {
            return false;
        }
        FitbitWorkout fitbitWorkout = (FitbitWorkout) obj;
        return Intrinsics.XOO0ii0(this.mName, fitbitWorkout.mName) && Intrinsics.XOO0ii0(this.mType, fitbitWorkout.mType) && Intrinsics.XOO0ii0(this.mStartTime, fitbitWorkout.mStartTime) && this.mElapsedTime == fitbitWorkout.mElapsedTime && Intrinsics.XOO0ii0(this.mDescription, fitbitWorkout.mDescription) && this.mDistance == fitbitWorkout.mDistance && this.mTrainer == fitbitWorkout.mTrainer && this.mCommute == fitbitWorkout.mCommute && this.mStart == fitbitWorkout.mStart && this.mEnd == fitbitWorkout.mEnd && this.mMode == fitbitWorkout.mMode && Intrinsics.XOO0ii0(this.mDate, fitbitWorkout.mDate) && this.mCalorie == fitbitWorkout.mCalorie;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMCommute() {
        return this.mCommute;
    }

    @aa1
    public final String getMDate() {
        return this.mDate;
    }

    @aa1
    public final String getMDescription() {
        return this.mDescription;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final long getMElapsedTime() {
        return this.mElapsedTime;
    }

    public final long getMEnd() {
        return this.mEnd;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final long getMStart() {
        return this.mStart;
    }

    @aa1
    public final String getMStartTime() {
        return this.mStartTime;
    }

    public final int getMTrainer() {
        return this.mTrainer;
    }

    @aa1
    public final String getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.mName.hashCode() * 31) + this.mType.hashCode()) * 31) + this.mStartTime.hashCode()) * 31) + Long.hashCode(this.mElapsedTime)) * 31) + this.mDescription.hashCode()) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mTrainer)) * 31) + Integer.hashCode(this.mCommute)) * 31) + Long.hashCode(this.mStart)) * 31) + Long.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mMode)) * 31) + this.mDate.hashCode()) * 31) + Integer.hashCode(this.mCalorie);
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMCommute(int i) {
        this.mCommute = i;
    }

    public final void setMDate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDate = str;
    }

    public final void setMDescription(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDescription = str;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMElapsedTime(long j) {
        this.mElapsedTime = j;
    }

    public final void setMEnd(long j) {
        this.mEnd = j;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMStart(long j) {
        this.mStart = j;
    }

    public final void setMStartTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mStartTime = str;
    }

    public final void setMTrainer(int i) {
        this.mTrainer = i;
    }

    public final void setMType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mType = str;
    }

    @aa1
    public String toString() {
        return "FitbitWorkout(mName=" + this.mName + ", mType=" + this.mType + ", mStartTime=" + this.mStartTime + ", mElapsedTime=" + this.mElapsedTime + ", mDescription=" + this.mDescription + ", mDistance=" + this.mDistance + ", mTrainer=" + this.mTrainer + ", mCommute=" + this.mCommute + ", mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mMode=" + this.mMode + ", mDate=" + this.mDate + ", mCalorie=" + this.mCalorie + I000IiI1O.C2156iO.f1007iO;
    }

    public FitbitWorkout(@aa1 String mName, @aa1 String mType, @aa1 String mStartTime, long j, @aa1 String mDescription, int i, int i2, int i3, long j2, long j3, int i4, @aa1 String mDate, int i5) {
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mType, "mType");
        Intrinsics.X0O(mStartTime, "mStartTime");
        Intrinsics.X0O(mDescription, "mDescription");
        Intrinsics.X0O(mDate, "mDate");
        this.mName = mName;
        this.mType = mType;
        this.mStartTime = mStartTime;
        this.mElapsedTime = j;
        this.mDescription = mDescription;
        this.mDistance = i;
        this.mTrainer = i2;
        this.mCommute = i3;
        this.mStart = j2;
        this.mEnd = j3;
        this.mMode = i4;
        this.mDate = mDate;
        this.mCalorie = i5;
    }

    public /* synthetic */ FitbitWorkout(String str, String str2, String str3, long j, String str4, int i, int i2, int i3, long j2, long j3, int i4, String str5, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0L : j2, (i6 & 512) != 0 ? 0L : j3, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) == 0 ? str5 : "", (i6 & 4096) != 0 ? 0 : i5);
    }
}
