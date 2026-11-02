package com.sma.smartv3.biz.fitness_site.strava;

import androidx.compose.ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.garmin.fit.Sport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StravaWorkout {

    @aa1
    private static final String ALPINE_SKI = "AlpineSki";

    @aa1
    private static final String BACKCOUNTRY_SKI = "BackcountrySki";

    @aa1
    private static final String CANOEING = "Canoeing";

    @aa1
    private static final String CROSSFIT = "Crossfit";

    @aa1
    public static final Companion Companion = null;

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
    private int mAvgBpm;
    private int mCalorie;
    private int mCommute;

    @aa1
    private String mDescription;
    private int mDistance;
    private long mElapsedTime;
    private long mEnd;
    private int mMaxBpm;
    private int mMinBpm;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String getTypeByActivityMode(int r2) {
            if (r2 != 7) goto L5;
            return StravaWorkout.RUN;
        L5:
            if (r2 == 14) goto L15;
            switch(r2) {
                case 10: goto L13;
                case 11: goto L11;
                case 12: goto L9;
                default: goto L7;
            };
        L7:
            return StravaWorkout.WORKOUT;
        L9:
            return StravaWorkout.WALK;
        L11:
            return StravaWorkout.SWIM;
        L13:
            return StravaWorkout.RIDE;
        L15:
            return StravaWorkout.YOGA;
        }

        @aa1
        public final Sport getTypeByActivityModeType(int r2) {
            if (r2 == 7) goto L14;
            switch(r2) {
                case 10: goto L12;
                case 11: goto L10;
                case 12: goto L8;
                default: goto L6;
            };
        L6:
            return Sport.GENERIC;
        L8:
            return Sport.WALKING;
        L10:
            return Sport.SWIMMING;
        L12:
            return Sport.CYCLING;
        L14:
            return Sport.RUNNING;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public StravaWorkout() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        long r4 = 0;
        String r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        long r10 = 0;
        long r12 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        this(r1, r2, r3, r4, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, LayoutKt.LargeDimension, null);
    }

    public static /* synthetic */ StravaWorkout copy$default(StravaWorkout r16, String r17, String r18, String r19, long r20, String r22, int r23, int r24, int r25, long r26, long r28, int r30, int r31, int r32, int r33, int r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        String r2 = r16.mName;
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = r16.mType;
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = r16.mStartTime;
    L15:
        if ((r35 & 8) == 0) goto L17;
        long r5 = r16.mElapsedTime;
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r7 = r16.mDescription;
    L23:
        if ((r35 & 32) == 0) goto L25;
        int r8 = r16.mDistance;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r9 = r16.mTrainer;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r10 = r16.mCommute;
    L35:
        if ((r35 & 256) == 0) goto L37;
        long r11 = r16.mStart;
    L39:
        if ((r35 & 512) == 0) goto L41;
        long r13 = r16.mEnd;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        int r15 = r16.mMode;
    L46:
        String r110 = r2;
        if ((r35 & 2048) == 0) goto L49;
        int r6 = r16.mCalorie;
    L50:
        int r111 = r6;
        if ((r35 & 4096) == 0) goto L53;
        int r12 = r16.mAvgBpm;
    L54:
        int r112 = r12;
        if ((r35 & 8192) == 0) goto L57;
        int r14 = r16.mMaxBpm;
    L59:
        if ((r35 & 16384) == 0) goto L62;
        int r37 = r16.mMinBpm;
    L64:
        return r16.copy(r110, r3, r4, r5, r7, r8, r9, r10, r11, r13, r15, r111, r112, r14, r37);
    L62:
        r37 = r34;
        goto L64
    L57:
        r14 = r33;
        goto L59
    L53:
        r12 = r32;
        goto L54
    L49:
        r6 = r31;
        goto L50
    L45:
        r15 = r30;
        goto L46
    L41:
        r13 = r28;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r8 = r23;
        goto L27
    L21:
        r7 = r22;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
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

    public final int component12() {
        return this.mCalorie;
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
    public final StravaWorkout copy(@aa1 String r21, @aa1 String r22, @aa1 String r23, long r24, @aa1 String r26, int r27, int r28, int r29, long r30, long r32, int r34, int r35, int r36, int r37, int r38) {
        Intrinsics.X0O(r21, "mName");
        Intrinsics.X0O(r22, "mType");
        Intrinsics.X0O(r23, "mStartTime");
        Intrinsics.X0O(r26, "mDescription");
        return new StravaWorkout(r21, r22, r23, r24, r26, r27, r28, r29, r30, r32, r34, r35, r36, r37, r38);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof StravaWorkout) == true) goto L8;
        return false;
    L8:
        StravaWorkout r9 = (StravaWorkout) r8;
        if (Intrinsics.XOO0ii0(this.mName, r9.mName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mType, r9.mType) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mStartTime, r9.mStartTime) == true) goto L18;
        return false;
    L18:
        if (this.mElapsedTime == r9.mElapsedTime) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mDescription, r9.mDescription) == true) goto L24;
        return false;
    L24:
        if (this.mDistance == r9.mDistance) goto L27;
        return false;
    L27:
        if (this.mTrainer == r9.mTrainer) goto L30;
        return false;
    L30:
        if (this.mCommute == r9.mCommute) goto L33;
        return false;
    L33:
        if (this.mStart == r9.mStart) goto L36;
        return false;
    L36:
        if (this.mEnd == r9.mEnd) goto L39;
        return false;
    L39:
        if (this.mMode == r9.mMode) goto L42;
        return false;
    L42:
        if (this.mCalorie == r9.mCalorie) goto L45;
        return false;
    L45:
        if (this.mAvgBpm == r9.mAvgBpm) goto L48;
        return false;
    L48:
        if (this.mMaxBpm == r9.mMaxBpm) goto L51;
        return false;
    L51:
        if (this.mMinBpm == r9.mMinBpm) goto L53;
        return false;
    L53:
        return true;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMCommute() {
        return this.mCommute;
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

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
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
        return (((((((((((((((((((((((((((this.mName.hashCode() * 31) + this.mType.hashCode()) * 31) + this.mStartTime.hashCode()) * 31) + Long.hashCode(this.mElapsedTime)) * 31) + this.mDescription.hashCode()) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mTrainer)) * 31) + Integer.hashCode(this.mCommute)) * 31) + Long.hashCode(this.mStart)) * 31) + Long.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm);
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMCommute(int r1) {
        this.mCommute = r1;
    }

    public final void setMDescription(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDescription = r2;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMElapsedTime(long r1) {
        this.mElapsedTime = r1;
    }

    public final void setMEnd(long r1) {
        this.mEnd = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMinBpm(int r1) {
        this.mMinBpm = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMStart(long r1) {
        this.mStart = r1;
    }

    public final void setMStartTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStartTime = r2;
    }

    public final void setMTrainer(int r1) {
        this.mTrainer = r1;
    }

    public final void setMType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mType = r2;
    }

    @aa1
    public String toString() {
        return "StravaWorkout(mName=" + this.mName + ", mType=" + this.mType + ", mStartTime=" + this.mStartTime + ", mElapsedTime=" + this.mElapsedTime + ", mDescription=" + this.mDescription + ", mDistance=" + this.mDistance + ", mTrainer=" + this.mTrainer + ", mCommute=" + this.mCommute + ", mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mMode=" + this.mMode + ", mCalorie=" + this.mCalorie + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMinBpm=" + this.mMinBpm + I000IiI1O.iO.iO;
    }

    public StravaWorkout(@aa1 String r2, @aa1 String r3, @aa1 String r4, long r5, @aa1 String r7, int r8, int r9, int r10, long r11, long r13, int r15, int r16, int r17, int r18, int r19) {
        Intrinsics.X0O(r2, "mName");
        Intrinsics.X0O(r3, "mType");
        Intrinsics.X0O(r4, "mStartTime");
        Intrinsics.X0O(r7, "mDescription");
        this.mName = r2;
        this.mType = r3;
        this.mStartTime = r4;
        this.mElapsedTime = r5;
        this.mDescription = r7;
        this.mDistance = r8;
        this.mTrainer = r9;
        this.mCommute = r10;
        this.mStart = r11;
        this.mEnd = r13;
        this.mMode = r15;
        this.mCalorie = r16;
        this.mAvgBpm = r17;
        this.mMaxBpm = r18;
        this.mMinBpm = r19;
    }

    public /* synthetic */ StravaWorkout(String r17, String r18, String r19, long r20, String r22, int r23, int r24, int r25, long r26, long r28, int r30, int r31, int r32, int r33, int r34, int r35, DefaultConstructorMarker r36) {
        String r2 = "";
        if ((r35 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = "";
    L14:
        long r6 = 0;
        if ((r35 & 8) == 0) goto L17;
        long r8 = 0;
    L19:
        if ((r35 & 16) != 0) goto L23;
        r2 = r22;
    L23:
        if ((r35 & 32) == 0) goto L25;
        int r5 = 0;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r11 = 0;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r12 = 0;
    L35:
        if ((r35 & 256) == 0) goto L37;
        long r13 = 0;
    L39:
        if ((r35 & 512) != 0) goto L43;
        r6 = r28;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        int r15 = 0;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        int r10 = 0;
    L50:
        String r37 = r1;
        if ((r35 & 4096) == 0) goto L53;
        int r7 = 0;
    L54:
        int r110 = r7;
        if ((r35 & 8192) == 0) goto L57;
        int r9 = 0;
    L59:
        if ((r35 & 16384) == 0) goto L62;
        int r38 = 0;
    L63:
        this(r37, r3, r4, r8, r2, r5, r11, r12, r13, r6, r15, r10, r110, r9, r38);
        return;
    L62:
        r38 = r34;
        goto L63
    L57:
        r9 = r33;
        goto L59
    L53:
        r7 = r32;
        goto L54
    L49:
        r10 = r31;
        goto L50
    L45:
        r15 = r30;
        goto L47
    L37:
        r13 = r26;
        goto L39
    L33:
        r12 = r25;
        goto L35
    L29:
        r11 = r24;
        goto L31
    L25:
        r5 = r23;
        goto L27
    L17:
        r8 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L14
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
