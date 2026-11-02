package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchRugbySettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRugbySettings.kt\ncom/szabh/smable3/entity/BleMatchRugbySettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1#2:132\n1869#3,2:133\n1869#3,2:135\n1869#3,2:137\n*S KotlinDebug\n*F\n+ 1 BleMatchRugbySettings.kt\ncom/szabh/smable3/entity/BleMatchRugbySettings\n*L\n79#1:133,2\n90#1:135,2\n101#1:137,2\n*E\n"})
public final class BleMatchRugbySettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_LENGTH = 25;
    private int mAdditionalShotScore;
    private int mAdditionalShotTime;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;

    @aa1
    private List<String> mGoalTypes;
    private int mGoalTypesEnable;
    private int mGps;
    private int mGuestTeamColor;
    private int mHomeTeamColor;
    private int mInjuryTime;
    private int mMatchView;
    private int mPenaltyKickScore;
    private int mPenaltyKickTouchdownScore;
    private int mPenaltyTime;
    private int mPeriodMode;
    private int mPeriodReminder;
    private int mPeriodReminderTime;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;
    private int mPlayerListEnable;
    private int mRedCardTime;
    private int mRedCardTimer;

    @aa1
    private List<String> mRedCardTypes;
    private int mRedCardTypesEnable;

    @aa1
    private List<String> mRefereeRole;
    private int mRingVolume;
    private int mScreen;

    @aa1
    private List<String> mTeamNames;
    private int mThrowKickballScore;
    private int mTouchdownScore;
    private int mVibration;
    private int mYellowCardTime;

    @aa1
    private List<String> mYellowCardTypes;
    private int mYellowCardTypesEnable;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRugbySettings() {
        this(0, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRugbySettings copy$default(BleMatchRugbySettings bleMatchRugbySettings, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, Object obj) {
        int i30;
        int i31;
        int i32 = (i28 & 1) != 0 ? bleMatchRugbySettings.mPeriods : i;
        List list8 = (i28 & 2) != 0 ? bleMatchRugbySettings.mPeriodTime : list;
        List list9 = (i28 & 4) != 0 ? bleMatchRugbySettings.mBreakTime : list2;
        int i33 = (i28 & 8) != 0 ? bleMatchRugbySettings.mVibration : i2;
        int i34 = (i28 & 16) != 0 ? bleMatchRugbySettings.mButtonType : i3;
        int i35 = (i28 & 32) != 0 ? bleMatchRugbySettings.mHomeTeamColor : i4;
        int i36 = (i28 & 64) != 0 ? bleMatchRugbySettings.mGuestTeamColor : i5;
        int i37 = (i28 & 128) != 0 ? bleMatchRugbySettings.mGps : i6;
        int i38 = (i28 & 256) != 0 ? bleMatchRugbySettings.mScreen : i7;
        int i39 = (i28 & 512) != 0 ? bleMatchRugbySettings.mMatchView : i8;
        List list10 = (i28 & 1024) != 0 ? bleMatchRugbySettings.mTeamNames : list3;
        List list11 = (i28 & 2048) != 0 ? bleMatchRugbySettings.mRefereeRole : list4;
        List list12 = (i28 & 4096) != 0 ? bleMatchRugbySettings.mGoalTypes : list5;
        List list13 = (i28 & 8192) != 0 ? bleMatchRugbySettings.mYellowCardTypes : list6;
        int i40 = i32;
        List list14 = (i28 & 16384) != 0 ? bleMatchRugbySettings.mRedCardTypes : list7;
        int i41 = (i28 & 32768) != 0 ? bleMatchRugbySettings.mGoalTypesEnable : i9;
        int i42 = (i28 & 65536) != 0 ? bleMatchRugbySettings.mYellowCardTypesEnable : i10;
        int i43 = (i28 & 131072) != 0 ? bleMatchRugbySettings.mRedCardTypesEnable : i11;
        int i44 = (i28 & 262144) != 0 ? bleMatchRugbySettings.mRingVolume : i12;
        int i45 = (i28 & 524288) != 0 ? bleMatchRugbySettings.mPeriodMode : i13;
        int i46 = (i28 & 1048576) != 0 ? bleMatchRugbySettings.mPeriodReminder : i14;
        int i47 = (i28 & 2097152) != 0 ? bleMatchRugbySettings.mPeriodReminderTime : i15;
        int i48 = (i28 & 4194304) != 0 ? bleMatchRugbySettings.mPlayerListEnable : i16;
        int i49 = (i28 & 8388608) != 0 ? bleMatchRugbySettings.mRedCardTimer : i17;
        int i50 = (i28 & 16777216) != 0 ? bleMatchRugbySettings.mRedCardTime : i18;
        int i51 = (i28 & 33554432) != 0 ? bleMatchRugbySettings.mYellowCardTime : i19;
        int i52 = (i28 & 67108864) != 0 ? bleMatchRugbySettings.mInjuryTime : i20;
        int i53 = (i28 & 134217728) != 0 ? bleMatchRugbySettings.mAdditionalShotTime : i21;
        int i54 = (i28 & 268435456) != 0 ? bleMatchRugbySettings.mPenaltyTime : i22;
        int i55 = (i28 & 536870912) != 0 ? bleMatchRugbySettings.mTouchdownScore : i23;
        int i56 = (i28 & 1073741824) != 0 ? bleMatchRugbySettings.mAdditionalShotScore : i24;
        int i57 = (i28 & Integer.MIN_VALUE) != 0 ? bleMatchRugbySettings.mPenaltyKickScore : i25;
        int i58 = (i29 & 1) != 0 ? bleMatchRugbySettings.mThrowKickballScore : i26;
        if ((i29 & 2) != 0) {
            i31 = i58;
            i30 = bleMatchRugbySettings.mPenaltyKickTouchdownScore;
        } else {
            i30 = i27;
            i31 = i58;
        }
        return bleMatchRugbySettings.copy(i40, list8, list9, i33, i34, i35, i36, i37, i38, i39, list10, list11, list12, list13, list14, i41, i42, i43, i44, i45, i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57, i31, i30);
    }

    public final int component1() {
        return this.mPeriods;
    }

    public final int component10() {
        return this.mMatchView;
    }

    @aa1
    public final List<String> component11() {
        return this.mTeamNames;
    }

    @aa1
    public final List<String> component12() {
        return this.mRefereeRole;
    }

    @aa1
    public final List<String> component13() {
        return this.mGoalTypes;
    }

    @aa1
    public final List<String> component14() {
        return this.mYellowCardTypes;
    }

    @aa1
    public final List<String> component15() {
        return this.mRedCardTypes;
    }

    public final int component16() {
        return this.mGoalTypesEnable;
    }

    public final int component17() {
        return this.mYellowCardTypesEnable;
    }

    public final int component18() {
        return this.mRedCardTypesEnable;
    }

    public final int component19() {
        return this.mRingVolume;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mPeriodTime;
    }

    public final int component20() {
        return this.mPeriodMode;
    }

    public final int component21() {
        return this.mPeriodReminder;
    }

    public final int component22() {
        return this.mPeriodReminderTime;
    }

    public final int component23() {
        return this.mPlayerListEnable;
    }

    public final int component24() {
        return this.mRedCardTimer;
    }

    public final int component25() {
        return this.mRedCardTime;
    }

    public final int component26() {
        return this.mYellowCardTime;
    }

    public final int component27() {
        return this.mInjuryTime;
    }

    public final int component28() {
        return this.mAdditionalShotTime;
    }

    public final int component29() {
        return this.mPenaltyTime;
    }

    @aa1
    public final List<Integer> component3() {
        return this.mBreakTime;
    }

    public final int component30() {
        return this.mTouchdownScore;
    }

    public final int component31() {
        return this.mAdditionalShotScore;
    }

    public final int component32() {
        return this.mPenaltyKickScore;
    }

    public final int component33() {
        return this.mThrowKickballScore;
    }

    public final int component34() {
        return this.mPenaltyKickTouchdownScore;
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
        return this.mGps;
    }

    public final int component9() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchRugbySettings copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        return new BleMatchRugbySettings(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, i7, i8, mTeamNames, mRefereeRole, mGoalTypes, mYellowCardTypes, mRedCardTypes, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(12);
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
        int i5 = 0;
        while (i5 < 4) {
            List<String> list4 = this.mRefereeRole;
            BleWritable.writeStringWithFix$default(this, (i5 < 0 || i5 >= list4.size()) ? "" : list4.get(i5), 25, null, 4, null);
            i5++;
        }
        Iterator<T> it = this.mGoalTypes.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (!TextUtils.isEmpty((String) it.next())) {
                i6++;
            }
        }
        if (this.mGoalTypesEnable == 0) {
            i6 = 0;
        }
        writeInt8(i6);
        int i7 = 0;
        while (i7 < 8) {
            List<String> list5 = this.mGoalTypes;
            BleWritable.writeStringWithFix$default(this, (i7 < 0 || i7 >= list5.size()) ? "" : list5.get(i7), 25, null, 4, null);
            i7++;
        }
        Iterator<T> it2 = this.mYellowCardTypes.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            if (!TextUtils.isEmpty((String) it2.next())) {
                i8++;
            }
        }
        if (this.mYellowCardTypesEnable == 0) {
            i8 = 0;
        }
        writeInt8(i8);
        int i9 = 0;
        while (i9 < 6) {
            List<String> list6 = this.mYellowCardTypes;
            BleWritable.writeStringWithFix$default(this, (i9 < 0 || i9 >= list6.size()) ? "" : list6.get(i9), 25, null, 4, null);
            i9++;
        }
        Iterator<T> it3 = this.mRedCardTypes.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            if (!TextUtils.isEmpty((String) it3.next())) {
                i10++;
            }
        }
        if (this.mRedCardTypesEnable == 0) {
            i10 = 0;
        }
        writeInt8(i10);
        while (i < 6) {
            List<String> list7 = this.mRedCardTypes;
            BleWritable.writeStringWithFix$default(this, (i < 0 || i >= list7.size()) ? "" : list7.get(i), 25, null, 4, null);
            i++;
        }
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
        writeInt8(this.mPlayerListEnable);
        writeInt8(this.mRedCardTimer);
        BleWritable.writeInt16$default(this, this.mRedCardTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mYellowCardTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mInjuryTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mAdditionalShotTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mPenaltyTime, null, 2, null);
        writeInt8(this.mTouchdownScore);
        writeInt8(this.mAdditionalShotScore);
        writeInt8(this.mPenaltyKickScore);
        writeInt8(this.mThrowKickballScore);
        writeInt8(this.mPenaltyKickTouchdownScore);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRugbySettings)) {
            return false;
        }
        BleMatchRugbySettings bleMatchRugbySettings = (BleMatchRugbySettings) obj;
        return this.mPeriods == bleMatchRugbySettings.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchRugbySettings.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchRugbySettings.mBreakTime) && this.mVibration == bleMatchRugbySettings.mVibration && this.mButtonType == bleMatchRugbySettings.mButtonType && this.mHomeTeamColor == bleMatchRugbySettings.mHomeTeamColor && this.mGuestTeamColor == bleMatchRugbySettings.mGuestTeamColor && this.mGps == bleMatchRugbySettings.mGps && this.mScreen == bleMatchRugbySettings.mScreen && this.mMatchView == bleMatchRugbySettings.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchRugbySettings.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchRugbySettings.mRefereeRole) && Intrinsics.XOO0ii0(this.mGoalTypes, bleMatchRugbySettings.mGoalTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes, bleMatchRugbySettings.mYellowCardTypes) && Intrinsics.XOO0ii0(this.mRedCardTypes, bleMatchRugbySettings.mRedCardTypes) && this.mGoalTypesEnable == bleMatchRugbySettings.mGoalTypesEnable && this.mYellowCardTypesEnable == bleMatchRugbySettings.mYellowCardTypesEnable && this.mRedCardTypesEnable == bleMatchRugbySettings.mRedCardTypesEnable && this.mRingVolume == bleMatchRugbySettings.mRingVolume && this.mPeriodMode == bleMatchRugbySettings.mPeriodMode && this.mPeriodReminder == bleMatchRugbySettings.mPeriodReminder && this.mPeriodReminderTime == bleMatchRugbySettings.mPeriodReminderTime && this.mPlayerListEnable == bleMatchRugbySettings.mPlayerListEnable && this.mRedCardTimer == bleMatchRugbySettings.mRedCardTimer && this.mRedCardTime == bleMatchRugbySettings.mRedCardTime && this.mYellowCardTime == bleMatchRugbySettings.mYellowCardTime && this.mInjuryTime == bleMatchRugbySettings.mInjuryTime && this.mAdditionalShotTime == bleMatchRugbySettings.mAdditionalShotTime && this.mPenaltyTime == bleMatchRugbySettings.mPenaltyTime && this.mTouchdownScore == bleMatchRugbySettings.mTouchdownScore && this.mAdditionalShotScore == bleMatchRugbySettings.mAdditionalShotScore && this.mPenaltyKickScore == bleMatchRugbySettings.mPenaltyKickScore && this.mThrowKickballScore == bleMatchRugbySettings.mThrowKickballScore && this.mPenaltyKickTouchdownScore == bleMatchRugbySettings.mPenaltyKickTouchdownScore;
    }

    public final int getMAdditionalShotScore() {
        return this.mAdditionalShotScore;
    }

    public final int getMAdditionalShotTime() {
        return this.mAdditionalShotTime;
    }

    @aa1
    public final List<Integer> getMBreakTime() {
        return this.mBreakTime;
    }

    public final int getMButtonType() {
        return this.mButtonType;
    }

    @aa1
    public final List<String> getMGoalTypes() {
        return this.mGoalTypes;
    }

    public final int getMGoalTypesEnable() {
        return this.mGoalTypesEnable;
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

    public final int getMInjuryTime() {
        return this.mInjuryTime;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA;
    }

    public final int getMMatchView() {
        return this.mMatchView;
    }

    public final int getMPenaltyKickScore() {
        return this.mPenaltyKickScore;
    }

    public final int getMPenaltyKickTouchdownScore() {
        return this.mPenaltyKickTouchdownScore;
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

    public final int getMPlayerListEnable() {
        return this.mPlayerListEnable;
    }

    public final int getMRedCardTime() {
        return this.mRedCardTime;
    }

    public final int getMRedCardTimer() {
        return this.mRedCardTimer;
    }

    @aa1
    public final List<String> getMRedCardTypes() {
        return this.mRedCardTypes;
    }

    public final int getMRedCardTypesEnable() {
        return this.mRedCardTypesEnable;
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

    @aa1
    public final List<String> getMTeamNames() {
        return this.mTeamNames;
    }

    public final int getMThrowKickballScore() {
        return this.mThrowKickballScore;
    }

    public final int getMTouchdownScore() {
        return this.mTouchdownScore;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public final int getMYellowCardTime() {
        return this.mYellowCardTime;
    }

    @aa1
    public final List<String> getMYellowCardTypes() {
        return this.mYellowCardTypes;
    }

    public final int getMYellowCardTypesEnable() {
        return this.mYellowCardTypesEnable;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + this.mGoalTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode()) * 31) + Integer.hashCode(this.mGoalTypesEnable)) * 31) + Integer.hashCode(this.mYellowCardTypesEnable)) * 31) + Integer.hashCode(this.mRedCardTypesEnable)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mPeriodMode)) * 31) + Integer.hashCode(this.mPeriodReminder)) * 31) + Integer.hashCode(this.mPeriodReminderTime)) * 31) + Integer.hashCode(this.mPlayerListEnable)) * 31) + Integer.hashCode(this.mRedCardTimer)) * 31) + Integer.hashCode(this.mRedCardTime)) * 31) + Integer.hashCode(this.mYellowCardTime)) * 31) + Integer.hashCode(this.mInjuryTime)) * 31) + Integer.hashCode(this.mAdditionalShotTime)) * 31) + Integer.hashCode(this.mPenaltyTime)) * 31) + Integer.hashCode(this.mTouchdownScore)) * 31) + Integer.hashCode(this.mAdditionalShotScore)) * 31) + Integer.hashCode(this.mPenaltyKickScore)) * 31) + Integer.hashCode(this.mThrowKickballScore)) * 31) + Integer.hashCode(this.mPenaltyKickTouchdownScore);
    }

    public final void setMAdditionalShotScore(int i) {
        this.mAdditionalShotScore = i;
    }

    public final void setMAdditionalShotTime(int i) {
        this.mAdditionalShotTime = i;
    }

    public final void setMBreakTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBreakTime = list;
    }

    public final void setMButtonType(int i) {
        this.mButtonType = i;
    }

    public final void setMGoalTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mGoalTypes = list;
    }

    public final void setMGoalTypesEnable(int i) {
        this.mGoalTypesEnable = i;
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

    public final void setMInjuryTime(int i) {
        this.mInjuryTime = i;
    }

    public final void setMMatchView(int i) {
        this.mMatchView = i;
    }

    public final void setMPenaltyKickScore(int i) {
        this.mPenaltyKickScore = i;
    }

    public final void setMPenaltyKickTouchdownScore(int i) {
        this.mPenaltyKickTouchdownScore = i;
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

    public final void setMPlayerListEnable(int i) {
        this.mPlayerListEnable = i;
    }

    public final void setMRedCardTime(int i) {
        this.mRedCardTime = i;
    }

    public final void setMRedCardTimer(int i) {
        this.mRedCardTimer = i;
    }

    public final void setMRedCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRedCardTypes = list;
    }

    public final void setMRedCardTypesEnable(int i) {
        this.mRedCardTypesEnable = i;
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

    public final void setMTeamNames(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mTeamNames = list;
    }

    public final void setMThrowKickballScore(int i) {
        this.mThrowKickballScore = i;
    }

    public final void setMTouchdownScore(int i) {
        this.mTouchdownScore = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    public final void setMYellowCardTime(int i) {
        this.mYellowCardTime = i;
    }

    public final void setMYellowCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes = list;
    }

    public final void setMYellowCardTypesEnable(int i) {
        this.mYellowCardTypesEnable = i;
    }

    @aa1
    public String toString() {
        return "BleMatchRugbySettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mGoalTypesEnable=" + this.mGoalTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mPlayerListEnable=" + this.mPlayerListEnable + ", mRedCardTimer=" + this.mRedCardTimer + ", mRedCardTime=" + this.mRedCardTime + ", mYellowCardTime=" + this.mYellowCardTime + ", mInjuryTime=" + this.mInjuryTime + ", mAdditionalShotTime=" + this.mAdditionalShotTime + ", mPenaltyTime=" + this.mPenaltyTime + ", mTouchdownScore=" + this.mTouchdownScore + ", mAdditionalShotScore=" + this.mAdditionalShotScore + ", mPenaltyKickScore=" + this.mPenaltyKickScore + ", mThrowKickballScore=" + this.mThrowKickballScore + ", mPenaltyKickTouchdownScore=" + this.mPenaltyKickTouchdownScore + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRugbySettings(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        this.mPeriods = i;
        this.mPeriodTime = mPeriodTime;
        this.mBreakTime = mBreakTime;
        this.mVibration = i2;
        this.mButtonType = i3;
        this.mHomeTeamColor = i4;
        this.mGuestTeamColor = i5;
        this.mGps = i6;
        this.mScreen = i7;
        this.mMatchView = i8;
        this.mTeamNames = mTeamNames;
        this.mRefereeRole = mRefereeRole;
        this.mGoalTypes = mGoalTypes;
        this.mYellowCardTypes = mYellowCardTypes;
        this.mRedCardTypes = mRedCardTypes;
        this.mGoalTypesEnable = i9;
        this.mYellowCardTypesEnable = i10;
        this.mRedCardTypesEnable = i11;
        this.mRingVolume = i12;
        this.mPeriodMode = i13;
        this.mPeriodReminder = i14;
        this.mPeriodReminderTime = i15;
        this.mPlayerListEnable = i16;
        this.mRedCardTimer = i17;
        this.mRedCardTime = i18;
        this.mYellowCardTime = i19;
        this.mInjuryTime = i20;
        this.mAdditionalShotTime = i21;
        this.mPenaltyTime = i22;
        this.mTouchdownScore = i23;
        this.mAdditionalShotScore = i24;
        this.mPenaltyKickScore = i25;
        this.mThrowKickballScore = i26;
        this.mPenaltyKickTouchdownScore = i27;
    }

    public /* synthetic */ BleMatchRugbySettings(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, DefaultConstructorMarker defaultConstructorMarker) {
        this((i28 & 1) != 0 ? 0 : i, (i28 & 2) != 0 ? new ArrayList() : list, (i28 & 4) != 0 ? new ArrayList() : list2, (i28 & 8) != 0 ? 0 : i2, (i28 & 16) != 0 ? 0 : i3, (i28 & 32) != 0 ? 0 : i4, (i28 & 64) != 0 ? 0 : i5, (i28 & 128) != 0 ? 0 : i6, (i28 & 256) != 0 ? 0 : i7, (i28 & 512) != 0 ? 0 : i8, (i28 & 1024) != 0 ? new ArrayList() : list3, (i28 & 2048) != 0 ? new ArrayList() : list4, (i28 & 4096) != 0 ? new ArrayList() : list5, (i28 & 8192) != 0 ? new ArrayList() : list6, (i28 & 16384) != 0 ? new ArrayList() : list7, (i28 & 32768) != 0 ? 0 : i9, (i28 & 65536) != 0 ? 0 : i10, (i28 & 131072) != 0 ? 0 : i11, (i28 & 262144) != 0 ? 0 : i12, (i28 & 524288) != 0 ? 0 : i13, (i28 & 1048576) != 0 ? 0 : i14, (i28 & 2097152) != 0 ? 0 : i15, (i28 & 4194304) != 0 ? 0 : i16, (i28 & 8388608) != 0 ? 0 : i17, (i28 & 16777216) != 0 ? 0 : i18, (i28 & 33554432) != 0 ? 0 : i19, (i28 & 67108864) != 0 ? 0 : i20, (i28 & 134217728) != 0 ? 0 : i21, (i28 & 268435456) != 0 ? 0 : i22, (i28 & 536870912) != 0 ? 0 : i23, (i28 & 1073741824) != 0 ? 0 : i24, (i28 & Integer.MIN_VALUE) != 0 ? 0 : i25, (i29 & 1) != 0 ? 0 : i26, (i29 & 2) != 0 ? 0 : i27);
    }
}
