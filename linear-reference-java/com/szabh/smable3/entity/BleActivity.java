package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleActivity extends BleReadable {
    public static final int ACTIVITY_SPORT = 225;
    public static final int AEROBICS = 51;
    public static final int AEROBIC_EXERCISE = 22;
    public static final int AMERICAN_FOOTBALL = 195;
    public static final int AMERICAN_SQUASH = 197;
    public static final int AQUATIC_SPORTS = 211;
    public static final int AQUA_FITNESS = 210;
    public static final int ARCHERY = 62;
    public static final int AUTO_NONE = 1;
    public static final int AUTO_RUN = 3;
    public static final int AUTO_WALK = 2;
    public static final int BACK_TRAINING = 107;
    public static final int BADMINTON = 18;
    public static final int BALLET = 76;
    public static final int BALLROOM_DANCE = 162;
    public static final int BARBELL = 117;
    public static final int BARRE = 190;
    public static final int BASEBALL = 34;
    public static final int BASKETBALL = 16;
    public static final int BATTLE_GAME = 213;
    public static final int BATTLE_ROPES = 124;
    public static final int BEACH_SOCCER = 152;
    public static final int BEACH_VOLLEYBALL = 153;
    public static final int BEGIN = 0;
    public static final int BELLY_DANCE = 212;
    public static final int BIATHLON = 170;
    public static final int BILLIARDS = 83;
    public static final int BMX = 220;
    public static final int BOARD_GAMES = 145;
    public static final int BOATING = 147;
    public static final int BOBSLEIGH = 133;
    public static final int BOCCE_BALL = 155;
    public static final int BODY_BALANCE = 113;
    public static final int BODY_COMBAT = 112;
    public static final int BODY_EXERCISE = 56;
    public static final int BOWLING = 64;
    public static final int BOXING = 25;
    public static final int BREAK_DANCE = 161;
    public static final int BRIDGE = 144;
    public static final int BUNGEE_JUMPING = 173;
    public static final int CHESS = 141;
    public static final int CIRCUIT_TRAINING = 186;
    public static final int CLIMBING = 13;
    public static final int CLIMB_STAIRS = 27;
    public static final int COMPETITIVE_AEROBICS = 187;
    public static final int CORE_TRAINING = 127;
    public static final int CRICHKET = 49;
    public static final int CROQUET = 102;
    public static final int CROSSFIT = 99;
    public static final int CROSS_COUNTRY_RACE = 165;
    public static final int CROSS_COUNTRY_RIDING = 166;
    public static final int CROSS_TRAINING = 130;
    public static final int CURLING = 168;
    public static final int CYCLING = 10;

    @aa1
    public static final Companion Companion = null;
    public static final int DANCE = 35;
    public static final int DANCE_STREET = 41;
    public static final int DARTS = 44;
    public static final int DISCO = 77;
    public static final int DISCUS = 85;
    public static final int DIVING = 204;
    public static final int DODGEBALL = 157;
    public static final int DOUBLE_ROD = 123;
    public static final int DRAGON_BOAT = 200;
    public static final int DRAUGHTS = 142;
    public static final int DRIFTING = 209;
    public static final int DUM_BLE = 55;
    public static final int ELLIPIICAL = 47;
    public static final int END = 4;
    public static final int EQUESTRIAN = 219;
    public static final int FENCING = 58;
    public static final int FIGHTING = 119;
    public static final int FISHING = 72;
    public static final int FITNESS = 180;
    public static final int FITNESS_VIDEO_GAMES = 218;
    public static final int FLOOR_BALL = 103;
    public static final int FLYING_KITES = 139;
    public static final int FOLK_DANCE = 158;
    public static final int FOOTBALL = 17;
    public static final int FREE_EXERCISE = 21;
    public static final int FREE_SPARRING = 184;
    public static final int FRISBEE = 61;
    public static final int FUNCTIONAL_TRAINING = 182;
    public static final int GAME = 116;
    public static final int GATEBALL = 156;
    public static final int GO = 143;
    public static final int GOLF = 33;
    public static final int GROUP_CALLISTHENICS = 181;
    public static final int GYMNASTICS = 45;
    public static final int HAMMER = 93;
    public static final int HANDBALL = 40;
    public static final int HANDWHEEL = 125;
    public static final int HIGH_JUMP = 88;
    public static final int HIIT = 111;
    public static final int HIKE = 222;
    public static final int HIPHOP_DANCE = 160;
    public static final int HOCKEY = 37;
    public static final int HORSE_RIDING = 63;
    public static final int HULA_HOOP = 32;
    public static final int HUNT = 137;
    public static final int ICE_HOCKEY = 132;
    public static final int INDOOR = 8;
    public static final int INDOOR_WALKING = 20;
    public static final int ITEM_LENGTH = 16;
    public static final int JAI_BALL = 105;
    public static final int JAVELIN = 92;
    public static final int JAZZ_DANCE = 75;
    public static final int JUMP_ROPE = 26;
    public static final int KARATE = 57;
    public static final int KAYAK = 101;
    public static final int KAYAK_RAFTING = 136;
    public static final int KENDO = 185;
    public static final int KETTLEBELL = 118;
    public static final int KITE_KICKING = 140;
    public static final int LACROSSE = 199;
    public static final int LATIN_DANCE = 159;
    public static final int LEG_PRESS = 95;
    public static final int LIGHT_BOAT = 201;
    public static final int LONG_JUMP = 91;
    public static final int LOWER_LIMBS = 121;
    public static final int MARATHON = 19;
    public static final int MARTIAL_ARTS = 59;
    public static final int MIND_BODY = 192;
    public static final int MIXED_AEROBICS = 129;
    public static final int MODERN_DANCE = 79;
    public static final int MOTOCROSS = 97;
    public static final int MOTORBOAT = 148;
    public static final int MOUNTAIN_CLIMBER = 110;
    public static final int MYODYNAMIA_TRAINING = 178;
    public static final int NAVIGATION_RECORDS = 223;
    public static final int OFF_ROAD_BIKE = 96;
    public static final int ONGOING = 1;
    public static final int ORIENTEERING = 175;
    public static final int OUTDOOR = 9;
    public static final int P90X = 188;
    public static final int PADDLE_BOARD = 135;
    public static final int PARACHUTE = 89;
    public static final int PARAGLIDER = 216;
    public static final int PARAGLIDING_SURFING = 206;
    public static final int PARKOUR = 174;
    public static final int PAUSE = 2;
    public static final int PHYSICAL_TRAINING = 183;
    public static final int PICKLEBALL = 198;
    public static final int PILATES = 38;
    public static final int PING_PONG = 36;
    public static final int PLANK = 82;
    public static final int PLATFORM_DIVING = 205;
    public static final int PLAYING = 146;
    public static final int POLE_DANCING = 73;
    public static final int POLO = 149;
    public static final int PULL_UP = 69;
    public static final int PUSH_UPS = 80;
    public static final int RACE_RIDING = 86;
    public static final int RACING = 177;
    public static final int RESUME = 3;
    public static final int ROCK_CLIMBING = 84;
    public static final int ROCK_CLIMBING_INDOOR = 221;
    public static final int ROCK_CLIMBING_OUTDOOR = 164;
    public static final int ROLLER_SKATING = 30;
    public static final int ROWING = 98;
    public static final int ROWING_MACHINE = 52;
    public static final int RUGBY = 53;
    public static final int RUNNING = 7;
    public static final int SAILBOAT = 68;
    public static final int SANDBAG_BALL = 154;
    public static final int SCOOTER = 81;
    public static final int SEPAKTAKRAW = 196;
    public static final int SHOT_PUT = 90;
    public static final int SHUTTLECOCK = 151;
    public static final int SINGLE_POLE = 122;
    public static final int SIT_UP = 54;
    public static final int SKATE = 29;
    public static final int SKATEBOARD = 70;
    public static final int SKI = 28;
    public static final int SLED = 134;
    public static final int SNOWMOBILE = 169;
    public static final int SNOWSHOEING = 171;
    public static final int SNOW_SPORTS = 172;
    public static final int SOFTBALL = 66;
    public static final int SOFTNESS_EXERCISE = 193;
    public static final int SPACEWALKING = 179;
    public static final int SPINNING = 15;
    public static final int SQUARE_DANCE = 74;
    public static final int SQUASH = 67;
    public static final int SQUAT = 94;
    public static final int STAIR_CLIMBING_CART = 189;
    public static final int STAND_UP_PADDLEBOARDING = 203;
    public static final int STEEPLECHASE = 215;
    public static final int STEPPING = 46;
    public static final int STEP_TRAINING = 131;
    public static final int STRETCH = 128;
    public static final int SURF = 65;
    public static final int SURFING_PADDLING = 207;
    public static final int SWIMMING = 11;
    public static final int SWIMMING_OUTDOOR = 163;
    public static final int SWING = 214;
    public static final int TAEKWONDO = 39;
    public static final int TAE_BO = 115;
    public static final int TAI_CHI = 60;
    public static final int TAP_DANCE = 78;
    public static final int TEAM_COMPETITION = 217;
    public static final int TENNIS = 43;
    public static final int TENNIS_DOUBLES = 106;
    public static final int THAI = 104;
    public static final int TRACK_AND_FIELD = 126;
    public static final int TRADITIONAL_MUSCLE_TRAINING = 194;
    public static final int TRAMPOLINE = 71;
    public static final int TREKKING = 50;
    public static final int TRIATHLON = 167;
    public static final int TRX = 114;
    public static final int TUG_OF_WAR = 138;
    public static final int UPPER_LIMBS = 120;
    public static final int VOLLEYBALL = 42;
    public static final int WALKING = 12;
    public static final int WATER_BIKE = 100;
    public static final int WATER_POLO = 150;
    public static final int WATER_SCOOTER = 202;
    public static final int WATER_SKIING = 109;
    public static final int WATER_VOLLEYBALL = 108;
    public static final int WEIGHTLIFTING = 24;
    public static final int WEIGHTTRANNING = 23;
    public static final int WINDSURF = 208;
    public static final int WRESTLE = 191;
    public static final int WRESTLING = 87;
    public static final int YOGA = 14;
    public static final int ZUMBA = 48;
    private int mCalorie;
    private int mDistance;
    private int mMode;
    private int mState;
    private int mStep;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleActivity() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleActivity copy$default(BleActivity r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mMode;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mState;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mStep;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mCalorie;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mDistance;
    L20:
        int r9 = r5;
        int r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMode;
    }

    public final int component3() {
        return this.mState;
    }

    public final int component4() {
        return this.mStep;
    }

    public final int component5() {
        return this.mCalorie;
    }

    public final int component6() {
        return this.mDistance;
    }

    @aa1
    public final BleActivity copy(int r8, int r9, int r10, int r11, int r12, int r13) {
        return new BleActivity(r8, r9, r10, r11, r12, r13);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMode = readIntN(5);
        this.mState = readIntN(3);
        this.mStep = BleReadable.readInt24$default(this, null, 1, null);
        this.mCalorie = BleReadable.readInt32$default(this, null, 1, null);
        this.mDistance = BleReadable.readInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleActivity) == true) goto L8;
        return false;
    L8:
        BleActivity r6 = (BleActivity) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mMode == r6.mMode) goto L15;
        return false;
    L15:
        if (this.mState == r6.mState) goto L18;
        return false;
    L18:
        if (this.mStep == r6.mStep) goto L21;
        return false;
    L21:
        if (this.mCalorie == r6.mCalorie) goto L24;
        return false;
    L24:
        if (this.mDistance == r6.mDistance) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMState() {
        return this.mState;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mState)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDistance);
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMState(int r1) {
        this.mState = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleActivity(mTime=" + this.mTime + ", mMode=" + this.mMode + ", mState=" + this.mState + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleActivity(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.mTime = r1;
        this.mMode = r2;
        this.mState = r3;
        this.mStep = r4;
        this.mCalorie = r5;
        this.mDistance = r6;
    }

    public /* synthetic */ BleActivity(int r2, int r3, int r4, int r5, int r6, int r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r10 = 0;
    L20:
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
