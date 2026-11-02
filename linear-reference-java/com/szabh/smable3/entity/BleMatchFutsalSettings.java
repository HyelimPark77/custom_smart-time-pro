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
@SourceDebugExtension({"SMAP\nBleMatchFutsalSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchFutsalSettings.kt\ncom/szabh/smable3/entity/BleMatchFutsalSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class BleMatchFutsalSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;
    private int mEventTime;
    private int mFoulAutoStop;
    private int mGoalAutoStop;
    private int mGps;
    private int mGuestTeamColor;
    private int mHomeTeamColor;
    private int mMatchView;
    private int mPenaltyAutoStop;
    private int mPenaltyTime;
    private int mPeriodMode;
    private int mPeriodReminder;
    private int mPeriodReminderTime;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;

    @aa1
    private List<String> mRefereeRole;
    private int mRingVolume;
    private int mScreen;
    private int mStopTime;

    @aa1
    private List<String> mTeamNames;
    private int mVibration;

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

    public BleMatchFutsalSettings() {
        int r1 = 0;
        List r2 = null;
        List r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        List r12 = null;
        List r13 = null;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchFutsalSettings copy$default(BleMatchFutsalSettings r17, int r18, List r19, List r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, List r29, List r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, Object r41) {
        if ((r40 & 1) == 0) goto L5;
        int r2 = r17.mPeriods;
    L7:
        if ((r40 & 2) == 0) goto L9;
        List r3 = r17.mPeriodTime;
    L11:
        if ((r40 & 4) == 0) goto L13;
        List r4 = r17.mBreakTime;
    L15:
        if ((r40 & 8) == 0) goto L17;
        int r5 = r17.mVibration;
    L19:
        if ((r40 & 16) == 0) goto L21;
        int r6 = r17.mButtonType;
    L23:
        if ((r40 & 32) == 0) goto L25;
        int r7 = r17.mHomeTeamColor;
    L27:
        if ((r40 & 64) == 0) goto L29;
        int r8 = r17.mGuestTeamColor;
    L31:
        if ((r40 & 128) == 0) goto L33;
        int r9 = r17.mPenaltyTime;
    L35:
        if ((r40 & 256) == 0) goto L37;
        int r10 = r17.mGps;
    L39:
        if ((r40 & 512) == 0) goto L41;
        int r11 = r17.mScreen;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        int r12 = r17.mMatchView;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        List r13 = r17.mTeamNames;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        List r14 = r17.mRefereeRole;
    L55:
        if ((r40 & 8192) == 0) goto L57;
        int r15 = r17.mEventTime;
    L58:
        int r110 = r2;
        if ((r40 & 16384) == 0) goto L61;
        int r16 = r17.mRingVolume;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        int r1 = r17.mPeriodMode;
    L66:
        int r111 = r1;
        if ((r40 & 65536) == 0) goto L69;
        int r42 = r17.mPeriodReminder;
    L70:
        int r210 = r42;
        if ((r40 & 131072) == 0) goto L73;
        int r43 = r17.mPeriodReminderTime;
    L74:
        int r211 = r43;
        if ((r40 & 262144) == 0) goto L77;
        int r44 = r17.mGoalAutoStop;
    L78:
        int r212 = r44;
        if ((r40 & 524288) == 0) goto L81;
        int r45 = r17.mPenaltyAutoStop;
    L82:
        int r213 = r45;
        if ((r40 & 1048576) == 0) goto L85;
        int r46 = r17.mFoulAutoStop;
    L87:
        if ((r40 & 2097152) == 0) goto L90;
        int r214 = r46;
        int r310 = r214;
        int r47 = r17.mStopTime;
    L92:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r310, r47);
    L90:
        r47 = r39;
        r310 = r46;
        goto L92
    L85:
        r46 = r38;
        goto L87
    L81:
        r45 = r37;
        goto L82
    L77:
        r44 = r36;
        goto L78
    L73:
        r43 = r35;
        goto L74
    L69:
        r42 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.mPeriods;
    }

    public final int component10() {
        return this.mScreen;
    }

    public final int component11() {
        return this.mMatchView;
    }

    @aa1
    public final List<String> component12() {
        return this.mTeamNames;
    }

    @aa1
    public final List<String> component13() {
        return this.mRefereeRole;
    }

    public final int component14() {
        return this.mEventTime;
    }

    public final int component15() {
        return this.mRingVolume;
    }

    public final int component16() {
        return this.mPeriodMode;
    }

    public final int component17() {
        return this.mPeriodReminder;
    }

    public final int component18() {
        return this.mPeriodReminderTime;
    }

    public final int component19() {
        return this.mGoalAutoStop;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mPeriodTime;
    }

    public final int component20() {
        return this.mPenaltyAutoStop;
    }

    public final int component21() {
        return this.mFoulAutoStop;
    }

    public final int component22() {
        return this.mStopTime;
    }

    @aa1
    public final List<Integer> component3() {
        return this.mBreakTime;
    }

    public final int component4() {
        return this.mVibration;
    }

    public final int component5() {
        return this.mButtonType;
    }

    public final int component6() {
        return this.mHomeTeamColor;
    }

    public final int component7() {
        return this.mGuestTeamColor;
    }

    public final int component8() {
        return this.mPenaltyTime;
    }

    public final int component9() {
        return this.mGps;
    }

    @aa1
    public final BleMatchFutsalSettings copy(int r25, @aa1 List<Integer> r26, @aa1 List<Integer> r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, @aa1 List<String> r36, @aa1 List<String> r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46) {
        Intrinsics.X0O(r26, "mPeriodTime");
        Intrinsics.X0O(r27, "mBreakTime");
        Intrinsics.X0O(r36, "mTeamNames");
        Intrinsics.X0O(r37, "mRefereeRole");
        return new BleMatchFutsalSettings(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(10);
        writeInt8(this.mPeriods);
        int r6 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 9) goto L12;
        List<Integer> r3 = this.mPeriodTime;
        if (r2 >= 0) goto L8;
    L10:
        Integer r4 = 0;
    L11:
        BleWritable.writeInt16$default(this, r4.intValue(), null, 2, null);
        r2 = r2 + 1;
        goto L4
    L8:
        if (r2 >= r3.size()) goto L10;
        r4 = r3.get(r2);
        goto L11
    L12:
        int r5 = 0;
    L14:
        if (r5 >= 8) goto L22;
        List<Integer> r7 = this.mBreakTime;
        if (r5 >= 0) goto L18;
    L20:
        Integer r8 = 0;
    L21:
        BleWritable.writeInt16$default(this, r8.intValue(), null, 2, null);
        r5 = r5 + 1;
        goto L14
    L18:
        if (r5 >= r7.size()) goto L20;
        r8 = r7.get(r5);
        goto L21
    L22:
        writeInt8(this.mVibration);
        writeInt8(this.mButtonType);
        writeInt8(this.mHomeTeamColor);
        writeInt8(this.mGuestTeamColor);
        BleWritable.writeInt16$default(this, this.mPenaltyTime, null, 2, null);
        writeInt8(this.mGps);
        writeInt8(this.mScreen);
        writeInt8(this.mMatchView);
        int r9 = 0;
    L23:
        String r10 = "";
        if (r9 >= 2) goto L32;
        List<String> r1 = this.mTeamNames;
        if (r9 < 0) goto L30;
        if (r9 >= r1.size()) goto L30;
        r10 = r1.get(r9);
    L30:
        BleWritable.writeStringWithFix$default(this, r10, 25, null, 4, null);
        r9 = r9 + 1;
    L32:
        if (r6 >= 4) goto L40;
        List<String> r11 = this.mRefereeRole;
        if (r6 >= 0) goto L36;
    L38:
        String r12 = "";
    L39:
        BleWritable.writeStringWithFix$default(this, r12, 25, null, 4, null);
        r6 = r6 + 1;
        goto L32
    L36:
        if (r6 >= r11.size()) goto L38;
        r12 = r11.get(r6);
        goto L39
    L40:
        writeInt8(this.mEventTime);
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
        writeInt8(this.mGoalAutoStop);
        writeInt8(this.mPenaltyAutoStop);
        writeInt8(this.mFoulAutoStop);
        BleWritable.writeInt16$default(this, this.mStopTime, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchFutsalSettings) == true) goto L8;
        return false;
    L8:
        BleMatchFutsalSettings r6 = (BleMatchFutsalSettings) r5;
        if (this.mPeriods == r6.mPeriods) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPeriodTime, r6.mPeriodTime) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mBreakTime, r6.mBreakTime) == true) goto L18;
        return false;
    L18:
        if (this.mVibration == r6.mVibration) goto L21;
        return false;
    L21:
        if (this.mButtonType == r6.mButtonType) goto L24;
        return false;
    L24:
        if (this.mHomeTeamColor == r6.mHomeTeamColor) goto L27;
        return false;
    L27:
        if (this.mGuestTeamColor == r6.mGuestTeamColor) goto L30;
        return false;
    L30:
        if (this.mPenaltyTime == r6.mPenaltyTime) goto L33;
        return false;
    L33:
        if (this.mGps == r6.mGps) goto L36;
        return false;
    L36:
        if (this.mScreen == r6.mScreen) goto L39;
        return false;
    L39:
        if (this.mMatchView == r6.mMatchView) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mTeamNames, r6.mTeamNames) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mRefereeRole, r6.mRefereeRole) == true) goto L48;
        return false;
    L48:
        if (this.mEventTime == r6.mEventTime) goto L51;
        return false;
    L51:
        if (this.mRingVolume == r6.mRingVolume) goto L54;
        return false;
    L54:
        if (this.mPeriodMode == r6.mPeriodMode) goto L57;
        return false;
    L57:
        if (this.mPeriodReminder == r6.mPeriodReminder) goto L60;
        return false;
    L60:
        if (this.mPeriodReminderTime == r6.mPeriodReminderTime) goto L63;
        return false;
    L63:
        if (this.mGoalAutoStop == r6.mGoalAutoStop) goto L66;
        return false;
    L66:
        if (this.mPenaltyAutoStop == r6.mPenaltyAutoStop) goto L69;
        return false;
    L69:
        if (this.mFoulAutoStop == r6.mFoulAutoStop) goto L72;
        return false;
    L72:
        if (this.mStopTime == r6.mStopTime) goto L74;
        return false;
    L74:
        return true;
    }

    @aa1
    public final List<Integer> getMBreakTime() {
        return this.mBreakTime;
    }

    public final int getMButtonType() {
        return this.mButtonType;
    }

    public final int getMEventTime() {
        return this.mEventTime;
    }

    public final int getMFoulAutoStop() {
        return this.mFoulAutoStop;
    }

    public final int getMGoalAutoStop() {
        return this.mGoalAutoStop;
    }

    public final int getMGps() {
        return this.mGps;
    }

    public final int getMGuestTeamColor() {
        return this.mGuestTeamColor;
    }

    public final int getMHomeTeamColor() {
        return this.mHomeTeamColor;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 206;
    }

    public final int getMMatchView() {
        return this.mMatchView;
    }

    public final int getMPenaltyAutoStop() {
        return this.mPenaltyAutoStop;
    }

    public final int getMPenaltyTime() {
        return this.mPenaltyTime;
    }

    public final int getMPeriodMode() {
        return this.mPeriodMode;
    }

    public final int getMPeriodReminder() {
        return this.mPeriodReminder;
    }

    public final int getMPeriodReminderTime() {
        return this.mPeriodReminderTime;
    }

    @aa1
    public final List<Integer> getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMPeriods() {
        return this.mPeriods;
    }

    @aa1
    public final List<String> getMRefereeRole() {
        return this.mRefereeRole;
    }

    public final int getMRingVolume() {
        return this.mRingVolume;
    }

    public final int getMScreen() {
        return this.mScreen;
    }

    public final int getMStopTime() {
        return this.mStopTime;
    }

    @aa1
    public final List<String> getMTeamNames() {
        return this.mTeamNames;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mPenaltyTime)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + Integer.hashCode(this.mEventTime)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mPeriodMode)) * 31) + Integer.hashCode(this.mPeriodReminder)) * 31) + Integer.hashCode(this.mPeriodReminderTime)) * 31) + Integer.hashCode(this.mGoalAutoStop)) * 31) + Integer.hashCode(this.mPenaltyAutoStop)) * 31) + Integer.hashCode(this.mFoulAutoStop)) * 31) + Integer.hashCode(this.mStopTime);
    }

    public final void setMBreakTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBreakTime = r2;
    }

    public final void setMButtonType(int r1) {
        this.mButtonType = r1;
    }

    public final void setMEventTime(int r1) {
        this.mEventTime = r1;
    }

    public final void setMFoulAutoStop(int r1) {
        this.mFoulAutoStop = r1;
    }

    public final void setMGoalAutoStop(int r1) {
        this.mGoalAutoStop = r1;
    }

    public final void setMGps(int r1) {
        this.mGps = r1;
    }

    public final void setMGuestTeamColor(int r1) {
        this.mGuestTeamColor = r1;
    }

    public final void setMHomeTeamColor(int r1) {
        this.mHomeTeamColor = r1;
    }

    public final void setMMatchView(int r1) {
        this.mMatchView = r1;
    }

    public final void setMPenaltyAutoStop(int r1) {
        this.mPenaltyAutoStop = r1;
    }

    public final void setMPenaltyTime(int r1) {
        this.mPenaltyTime = r1;
    }

    public final void setMPeriodMode(int r1) {
        this.mPeriodMode = r1;
    }

    public final void setMPeriodReminder(int r1) {
        this.mPeriodReminder = r1;
    }

    public final void setMPeriodReminderTime(int r1) {
        this.mPeriodReminderTime = r1;
    }

    public final void setMPeriodTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodTime = r2;
    }

    public final void setMPeriods(int r1) {
        this.mPeriods = r1;
    }

    public final void setMRefereeRole(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRefereeRole = r2;
    }

    public final void setMRingVolume(int r1) {
        this.mRingVolume = r1;
    }

    public final void setMScreen(int r1) {
        this.mScreen = r1;
    }

    public final void setMStopTime(int r1) {
        this.mStopTime = r1;
    }

    public final void setMTeamNames(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTeamNames = r2;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchFutsalSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mPenaltyTime=" + this.mPenaltyTime + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mEventTime=" + this.mEventTime + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mGoalAutoStop=" + this.mGoalAutoStop + ", mPenaltyAutoStop=" + this.mPenaltyAutoStop + ", mFoulAutoStop=" + this.mFoulAutoStop + ", mStopTime=" + this.mStopTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchFutsalSettings(int r3, @aa1 List<Integer> r4, @aa1 List<Integer> r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, @aa1 List<String> r14, @aa1 List<String> r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        Intrinsics.X0O(r4, "mPeriodTime");
        Intrinsics.X0O(r5, "mBreakTime");
        Intrinsics.X0O(r14, "mTeamNames");
        Intrinsics.X0O(r15, "mRefereeRole");
        this.mPeriods = r3;
        this.mPeriodTime = r4;
        this.mBreakTime = r5;
        this.mVibration = r6;
        this.mButtonType = r7;
        this.mHomeTeamColor = r8;
        this.mGuestTeamColor = r9;
        this.mPenaltyTime = r10;
        this.mGps = r11;
        this.mScreen = r12;
        this.mMatchView = r13;
        this.mTeamNames = r14;
        this.mRefereeRole = r15;
        this.mEventTime = r16;
        this.mRingVolume = r17;
        this.mPeriodMode = r18;
        this.mPeriodReminder = r19;
        this.mPeriodReminderTime = r20;
        this.mGoalAutoStop = r21;
        this.mPenaltyAutoStop = r22;
        this.mFoulAutoStop = r23;
        this.mStopTime = r24;
    }

    public /* synthetic */ BleMatchFutsalSettings(int r24, List r25, List r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, List r35, List r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, DefaultConstructorMarker r47) {
        if ((r46 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r46 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r46 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r46 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r46 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r46 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r46 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r46 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r46 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r46 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r46 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r46 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r46 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r46 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r46 & 16384) == 0) goto L61;
        int r2 = 0;
    L63:
        if ((r46 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r46 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r46 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r46 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r46 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r46 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r46 & 2097152) == 0) goto L90;
        int r48 = 0;
    L91:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r48);
        return;
    L90:
        r48 = r45;
        goto L91
    L85:
        r21 = r44;
        goto L87
    L81:
        r20 = r43;
        goto L83
    L77:
        r19 = r42;
        goto L79
    L73:
        r18 = r41;
        goto L75
    L69:
        r17 = r40;
        goto L71
    L65:
        r16 = r39;
        goto L67
    L61:
        r2 = r38;
        goto L63
    L57:
        r15 = r37;
        goto L59
    L53:
        r14 = r36;
        goto L55
    L49:
        r13 = r35;
        goto L51
    L45:
        r12 = r34;
        goto L47
    L41:
        r11 = r33;
        goto L43
    L37:
        r10 = r32;
        goto L39
    L33:
        r9 = r31;
        goto L35
    L29:
        r8 = r30;
        goto L31
    L25:
        r7 = r29;
        goto L27
    L21:
        r6 = r28;
        goto L23
    L17:
        r5 = r27;
        goto L19
    L13:
        r4 = r26;
        goto L15
    L9:
        r3 = r25;
        goto L11
    L5:
        r1 = r24;
        goto L7
    }
}
