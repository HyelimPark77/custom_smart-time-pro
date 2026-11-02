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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchFutsalSettings() {
        this(0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchFutsalSettings copy$default(BleMatchFutsalSettings bleMatchFutsalSettings, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List list3, List list4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
        int i20;
        int i21;
        int i22 = (i19 & 1) != 0 ? bleMatchFutsalSettings.mPeriods : i;
        List list5 = (i19 & 2) != 0 ? bleMatchFutsalSettings.mPeriodTime : list;
        List list6 = (i19 & 4) != 0 ? bleMatchFutsalSettings.mBreakTime : list2;
        int i23 = (i19 & 8) != 0 ? bleMatchFutsalSettings.mVibration : i2;
        int i24 = (i19 & 16) != 0 ? bleMatchFutsalSettings.mButtonType : i3;
        int i25 = (i19 & 32) != 0 ? bleMatchFutsalSettings.mHomeTeamColor : i4;
        int i26 = (i19 & 64) != 0 ? bleMatchFutsalSettings.mGuestTeamColor : i5;
        int i27 = (i19 & 128) != 0 ? bleMatchFutsalSettings.mPenaltyTime : i6;
        int i28 = (i19 & 256) != 0 ? bleMatchFutsalSettings.mGps : i7;
        int i29 = (i19 & 512) != 0 ? bleMatchFutsalSettings.mScreen : i8;
        int i30 = (i19 & 1024) != 0 ? bleMatchFutsalSettings.mMatchView : i9;
        List list7 = (i19 & 2048) != 0 ? bleMatchFutsalSettings.mTeamNames : list3;
        List list8 = (i19 & 4096) != 0 ? bleMatchFutsalSettings.mRefereeRole : list4;
        int i31 = (i19 & 8192) != 0 ? bleMatchFutsalSettings.mEventTime : i10;
        int i32 = i22;
        int i33 = (i19 & 16384) != 0 ? bleMatchFutsalSettings.mRingVolume : i11;
        int i34 = (i19 & 32768) != 0 ? bleMatchFutsalSettings.mPeriodMode : i12;
        int i35 = (i19 & 65536) != 0 ? bleMatchFutsalSettings.mPeriodReminder : i13;
        int i36 = (i19 & 131072) != 0 ? bleMatchFutsalSettings.mPeriodReminderTime : i14;
        int i37 = (i19 & 262144) != 0 ? bleMatchFutsalSettings.mGoalAutoStop : i15;
        int i38 = (i19 & 524288) != 0 ? bleMatchFutsalSettings.mPenaltyAutoStop : i16;
        int i39 = (i19 & 1048576) != 0 ? bleMatchFutsalSettings.mFoulAutoStop : i17;
        if ((i19 & 2097152) != 0) {
            i21 = i39;
            i20 = bleMatchFutsalSettings.mStopTime;
        } else {
            i20 = i18;
            i21 = i39;
        }
        return bleMatchFutsalSettings.copy(i32, list5, list6, i23, i24, i25, i26, i27, i28, i29, i30, list7, list8, i31, i33, i34, i35, i36, i37, i38, i21, i20);
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
    public final BleMatchFutsalSettings copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        return new BleMatchFutsalSettings(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, i7, i8, i9, mTeamNames, mRefereeRole, i10, i11, i12, i13, i14, i15, i16, i17, i18);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(10);
        writeInt8(this.mPeriods);
        int i = 0;
        int i2 = 0;
        while (i2 < 9) {
            List<Integer> list = this.mPeriodTime;
            BleWritable.writeInt16$default(this, ((i2 < 0 || i2 >= list.size()) ? 0 : list.get(i2)).intValue(), null, 2, null);
            i2++;
        }
        int i3 = 0;
        while (i3 < 8) {
            List<Integer> list2 = this.mBreakTime;
            BleWritable.writeInt16$default(this, ((i3 < 0 || i3 >= list2.size()) ? 0 : list2.get(i3)).intValue(), null, 2, null);
            i3++;
        }
        writeInt8(this.mVibration);
        writeInt8(this.mButtonType);
        writeInt8(this.mHomeTeamColor);
        writeInt8(this.mGuestTeamColor);
        BleWritable.writeInt16$default(this, this.mPenaltyTime, null, 2, null);
        writeInt8(this.mGps);
        writeInt8(this.mScreen);
        writeInt8(this.mMatchView);
        int i4 = 0;
        while (true) {
            String str = "";
            if (i4 >= 2) {
                break;
            }
            List<String> list3 = this.mTeamNames;
            if (i4 >= 0 && i4 < list3.size()) {
                str = list3.get(i4);
            }
            BleWritable.writeStringWithFix$default(this, str, 25, null, 4, null);
            i4++;
        }
        while (i < 4) {
            List<String> list4 = this.mRefereeRole;
            BleWritable.writeStringWithFix$default(this, (i < 0 || i >= list4.size()) ? "" : list4.get(i), 25, null, 4, null);
            i++;
        }
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchFutsalSettings)) {
            return false;
        }
        BleMatchFutsalSettings bleMatchFutsalSettings = (BleMatchFutsalSettings) obj;
        return this.mPeriods == bleMatchFutsalSettings.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchFutsalSettings.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchFutsalSettings.mBreakTime) && this.mVibration == bleMatchFutsalSettings.mVibration && this.mButtonType == bleMatchFutsalSettings.mButtonType && this.mHomeTeamColor == bleMatchFutsalSettings.mHomeTeamColor && this.mGuestTeamColor == bleMatchFutsalSettings.mGuestTeamColor && this.mPenaltyTime == bleMatchFutsalSettings.mPenaltyTime && this.mGps == bleMatchFutsalSettings.mGps && this.mScreen == bleMatchFutsalSettings.mScreen && this.mMatchView == bleMatchFutsalSettings.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchFutsalSettings.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchFutsalSettings.mRefereeRole) && this.mEventTime == bleMatchFutsalSettings.mEventTime && this.mRingVolume == bleMatchFutsalSettings.mRingVolume && this.mPeriodMode == bleMatchFutsalSettings.mPeriodMode && this.mPeriodReminder == bleMatchFutsalSettings.mPeriodReminder && this.mPeriodReminderTime == bleMatchFutsalSettings.mPeriodReminderTime && this.mGoalAutoStop == bleMatchFutsalSettings.mGoalAutoStop && this.mPenaltyAutoStop == bleMatchFutsalSettings.mPenaltyAutoStop && this.mFoulAutoStop == bleMatchFutsalSettings.mFoulAutoStop && this.mStopTime == bleMatchFutsalSettings.mStopTime;
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

    public final void setMBreakTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBreakTime = list;
    }

    public final void setMButtonType(int i) {
        this.mButtonType = i;
    }

    public final void setMEventTime(int i) {
        this.mEventTime = i;
    }

    public final void setMFoulAutoStop(int i) {
        this.mFoulAutoStop = i;
    }

    public final void setMGoalAutoStop(int i) {
        this.mGoalAutoStop = i;
    }

    public final void setMGps(int i) {
        this.mGps = i;
    }

    public final void setMGuestTeamColor(int i) {
        this.mGuestTeamColor = i;
    }

    public final void setMHomeTeamColor(int i) {
        this.mHomeTeamColor = i;
    }

    public final void setMMatchView(int i) {
        this.mMatchView = i;
    }

    public final void setMPenaltyAutoStop(int i) {
        this.mPenaltyAutoStop = i;
    }

    public final void setMPenaltyTime(int i) {
        this.mPenaltyTime = i;
    }

    public final void setMPeriodMode(int i) {
        this.mPeriodMode = i;
    }

    public final void setMPeriodReminder(int i) {
        this.mPeriodReminder = i;
    }

    public final void setMPeriodReminderTime(int i) {
        this.mPeriodReminderTime = i;
    }

    public final void setMPeriodTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodTime = list;
    }

    public final void setMPeriods(int i) {
        this.mPeriods = i;
    }

    public final void setMRefereeRole(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRefereeRole = list;
    }

    public final void setMRingVolume(int i) {
        this.mRingVolume = i;
    }

    public final void setMScreen(int i) {
        this.mScreen = i;
    }

    public final void setMStopTime(int i) {
        this.mStopTime = i;
    }

    public final void setMTeamNames(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mTeamNames = list;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleMatchFutsalSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mPenaltyTime=" + this.mPenaltyTime + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mEventTime=" + this.mEventTime + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mGoalAutoStop=" + this.mGoalAutoStop + ", mPenaltyAutoStop=" + this.mPenaltyAutoStop + ", mFoulAutoStop=" + this.mFoulAutoStop + ", mStopTime=" + this.mStopTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchFutsalSettings(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        this.mPeriods = i;
        this.mPeriodTime = mPeriodTime;
        this.mBreakTime = mBreakTime;
        this.mVibration = i2;
        this.mButtonType = i3;
        this.mHomeTeamColor = i4;
        this.mGuestTeamColor = i5;
        this.mPenaltyTime = i6;
        this.mGps = i7;
        this.mScreen = i8;
        this.mMatchView = i9;
        this.mTeamNames = mTeamNames;
        this.mRefereeRole = mRefereeRole;
        this.mEventTime = i10;
        this.mRingVolume = i11;
        this.mPeriodMode = i12;
        this.mPeriodReminder = i13;
        this.mPeriodReminderTime = i14;
        this.mGoalAutoStop = i15;
        this.mPenaltyAutoStop = i16;
        this.mFoulAutoStop = i17;
        this.mStopTime = i18;
    }

    public /* synthetic */ BleMatchFutsalSettings(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List list3, List list4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 0 : i, (i19 & 2) != 0 ? new ArrayList() : list, (i19 & 4) != 0 ? new ArrayList() : list2, (i19 & 8) != 0 ? 0 : i2, (i19 & 16) != 0 ? 0 : i3, (i19 & 32) != 0 ? 0 : i4, (i19 & 64) != 0 ? 0 : i5, (i19 & 128) != 0 ? 0 : i6, (i19 & 256) != 0 ? 0 : i7, (i19 & 512) != 0 ? 0 : i8, (i19 & 1024) != 0 ? 0 : i9, (i19 & 2048) != 0 ? new ArrayList() : list3, (i19 & 4096) != 0 ? new ArrayList() : list4, (i19 & 8192) != 0 ? 0 : i10, (i19 & 16384) != 0 ? 0 : i11, (i19 & 32768) != 0 ? 0 : i12, (i19 & 65536) != 0 ? 0 : i13, (i19 & 131072) != 0 ? 0 : i14, (i19 & 262144) != 0 ? 0 : i15, (i19 & 524288) != 0 ? 0 : i16, (i19 & 1048576) != 0 ? 0 : i17, (i19 & 2097152) != 0 ? 0 : i18);
    }
}
