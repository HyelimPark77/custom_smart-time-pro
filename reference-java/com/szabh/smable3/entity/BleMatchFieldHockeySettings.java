package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2733ni;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchFieldHockeySettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchFieldHockeySettings.kt\ncom/szabh/smable3/entity/BleMatchFieldHockeySettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1#2:131\n1869#3,2:132\n1869#3,2:134\n1869#3,2:136\n1869#3,2:138\n*S KotlinDebug\n*F\n+ 1 BleMatchFieldHockeySettings.kt\ncom/szabh/smable3/entity/BleMatchFieldHockeySettings\n*L\n73#1:132,2\n84#1:134,2\n95#1:136,2\n107#1:138,2\n*E\n"})
public final class BleMatchFieldHockeySettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;
    private int mGps;
    private int mGreenCardTime;

    @aa1
    private List<String> mGreenCardTypes;
    private int mGreenCardTypesEnable;
    private int mGuestTeamColor;
    private int mHomeTeamColor;
    private int mMatchView;
    private int mPeriodMode;
    private int mPeriodReminder;
    private int mPeriodReminderTime;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;
    private int mPlayerListEnable;

    @aa1
    private List<String> mRedCardTypes;
    private int mRedCardTypesEnable;

    @aa1
    private List<String> mRefereeRole;
    private int mRingVolume;
    private int mScreen;

    @aa1
    private List<String> mTeamNames;
    private int mVibration;
    private int mYellowCard1Time;
    private int mYellowCard2Time;

    @aa1
    private List<String> mYellowCardTypes;

    @aa1
    private List<String> mYellowCardTypes2;
    private int mYellowCardTypesEnable;
    private int mYellowCardTypesEnable2;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchFieldHockeySettings() {
        this(0, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, C2733ni.iOOX010X, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchFieldHockeySettings copy$default(BleMatchFieldHockeySettings bleMatchFieldHockeySettings, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, List list8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, Object obj) {
        int i22;
        int i23;
        int i24 = (i21 & 1) != 0 ? bleMatchFieldHockeySettings.mPeriods : i;
        List list9 = (i21 & 2) != 0 ? bleMatchFieldHockeySettings.mPeriodTime : list;
        List list10 = (i21 & 4) != 0 ? bleMatchFieldHockeySettings.mBreakTime : list2;
        int i25 = (i21 & 8) != 0 ? bleMatchFieldHockeySettings.mVibration : i2;
        int i26 = (i21 & 16) != 0 ? bleMatchFieldHockeySettings.mButtonType : i3;
        int i27 = (i21 & 32) != 0 ? bleMatchFieldHockeySettings.mHomeTeamColor : i4;
        int i28 = (i21 & 64) != 0 ? bleMatchFieldHockeySettings.mGuestTeamColor : i5;
        int i29 = (i21 & 128) != 0 ? bleMatchFieldHockeySettings.mGps : i6;
        int i30 = (i21 & 256) != 0 ? bleMatchFieldHockeySettings.mScreen : i7;
        int i31 = (i21 & 512) != 0 ? bleMatchFieldHockeySettings.mMatchView : i8;
        List list11 = (i21 & 1024) != 0 ? bleMatchFieldHockeySettings.mTeamNames : list3;
        List list12 = (i21 & 2048) != 0 ? bleMatchFieldHockeySettings.mRefereeRole : list4;
        List list13 = (i21 & 4096) != 0 ? bleMatchFieldHockeySettings.mGreenCardTypes : list5;
        List list14 = (i21 & 8192) != 0 ? bleMatchFieldHockeySettings.mYellowCardTypes : list6;
        int i32 = i24;
        List list15 = (i21 & 16384) != 0 ? bleMatchFieldHockeySettings.mRedCardTypes : list7;
        List list16 = (i21 & 32768) != 0 ? bleMatchFieldHockeySettings.mYellowCardTypes2 : list8;
        int i33 = (i21 & 65536) != 0 ? bleMatchFieldHockeySettings.mGreenCardTypesEnable : i9;
        int i34 = (i21 & 131072) != 0 ? bleMatchFieldHockeySettings.mYellowCardTypesEnable : i10;
        int i35 = (i21 & 262144) != 0 ? bleMatchFieldHockeySettings.mYellowCardTypesEnable2 : i11;
        int i36 = (i21 & 524288) != 0 ? bleMatchFieldHockeySettings.mRedCardTypesEnable : i12;
        int i37 = (i21 & 1048576) != 0 ? bleMatchFieldHockeySettings.mRingVolume : i13;
        int i38 = (i21 & 2097152) != 0 ? bleMatchFieldHockeySettings.mPeriodMode : i14;
        int i39 = (i21 & 4194304) != 0 ? bleMatchFieldHockeySettings.mPeriodReminder : i15;
        int i40 = (i21 & 8388608) != 0 ? bleMatchFieldHockeySettings.mPeriodReminderTime : i16;
        int i41 = (i21 & 16777216) != 0 ? bleMatchFieldHockeySettings.mPlayerListEnable : i17;
        int i42 = (i21 & 33554432) != 0 ? bleMatchFieldHockeySettings.mGreenCardTime : i18;
        int i43 = (i21 & 67108864) != 0 ? bleMatchFieldHockeySettings.mYellowCard1Time : i19;
        if ((i21 & 134217728) != 0) {
            i23 = i43;
            i22 = bleMatchFieldHockeySettings.mYellowCard2Time;
        } else {
            i22 = i20;
            i23 = i43;
        }
        return bleMatchFieldHockeySettings.copy(i32, list9, list10, i25, i26, i27, i28, i29, i30, i31, list11, list12, list13, list14, list15, list16, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i23, i22);
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
        return this.mGreenCardTypes;
    }

    @aa1
    public final List<String> component14() {
        return this.mYellowCardTypes;
    }

    @aa1
    public final List<String> component15() {
        return this.mRedCardTypes;
    }

    @aa1
    public final List<String> component16() {
        return this.mYellowCardTypes2;
    }

    public final int component17() {
        return this.mGreenCardTypesEnable;
    }

    public final int component18() {
        return this.mYellowCardTypesEnable;
    }

    public final int component19() {
        return this.mYellowCardTypesEnable2;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mPeriodTime;
    }

    public final int component20() {
        return this.mRedCardTypesEnable;
    }

    public final int component21() {
        return this.mRingVolume;
    }

    public final int component22() {
        return this.mPeriodMode;
    }

    public final int component23() {
        return this.mPeriodReminder;
    }

    public final int component24() {
        return this.mPeriodReminderTime;
    }

    public final int component25() {
        return this.mPlayerListEnable;
    }

    public final int component26() {
        return this.mGreenCardTime;
    }

    public final int component27() {
        return this.mYellowCard1Time;
    }

    public final int component28() {
        return this.mYellowCard2Time;
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
        return this.mGps;
    }

    public final int component9() {
        return this.mScreen;
    }

    @aa1
    public final BleMatchFieldHockeySettings copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGreenCardTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, @aa1 List<String> mYellowCardTypes2, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        Intrinsics.X0O(mGreenCardTypes, "mGreenCardTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        Intrinsics.X0O(mYellowCardTypes2, "mYellowCardTypes2");
        return new BleMatchFieldHockeySettings(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, i7, i8, mTeamNames, mRefereeRole, mGreenCardTypes, mYellowCardTypes, mRedCardTypes, mYellowCardTypes2, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(11);
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
        Iterator<T> it = this.mGreenCardTypes.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (!TextUtils.isEmpty((String) it.next())) {
                i6++;
            }
        }
        if (this.mGreenCardTypesEnable == 0) {
            i6 = 0;
        }
        writeInt8(i6);
        int i7 = 0;
        while (i7 < 8) {
            List<String> list5 = this.mGreenCardTypes;
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
        int i11 = 0;
        while (i11 < 6) {
            List<String> list7 = this.mRedCardTypes;
            BleWritable.writeStringWithFix$default(this, (i11 < 0 || i11 >= list7.size()) ? "" : list7.get(i11), 25, null, 4, null);
            i11++;
        }
        Iterator<T> it4 = this.mYellowCardTypes2.iterator();
        int i12 = 0;
        while (it4.hasNext()) {
            if (!TextUtils.isEmpty((String) it4.next())) {
                i12++;
            }
        }
        if (this.mYellowCardTypesEnable2 == 0) {
            i12 = 0;
        }
        writeInt8(i12);
        while (i < 6) {
            List<String> list8 = this.mYellowCardTypes2;
            BleWritable.writeStringWithFix$default(this, (i < 0 || i >= list8.size()) ? "" : list8.get(i), 25, null, 4, null);
            i++;
        }
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
        writeInt8(this.mPlayerListEnable);
        BleWritable.writeInt16$default(this, this.mGreenCardTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mYellowCard1Time, null, 2, null);
        BleWritable.writeInt16$default(this, this.mYellowCard2Time, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchFieldHockeySettings)) {
            return false;
        }
        BleMatchFieldHockeySettings bleMatchFieldHockeySettings = (BleMatchFieldHockeySettings) obj;
        return this.mPeriods == bleMatchFieldHockeySettings.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchFieldHockeySettings.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchFieldHockeySettings.mBreakTime) && this.mVibration == bleMatchFieldHockeySettings.mVibration && this.mButtonType == bleMatchFieldHockeySettings.mButtonType && this.mHomeTeamColor == bleMatchFieldHockeySettings.mHomeTeamColor && this.mGuestTeamColor == bleMatchFieldHockeySettings.mGuestTeamColor && this.mGps == bleMatchFieldHockeySettings.mGps && this.mScreen == bleMatchFieldHockeySettings.mScreen && this.mMatchView == bleMatchFieldHockeySettings.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchFieldHockeySettings.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchFieldHockeySettings.mRefereeRole) && Intrinsics.XOO0ii0(this.mGreenCardTypes, bleMatchFieldHockeySettings.mGreenCardTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes, bleMatchFieldHockeySettings.mYellowCardTypes) && Intrinsics.XOO0ii0(this.mRedCardTypes, bleMatchFieldHockeySettings.mRedCardTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes2, bleMatchFieldHockeySettings.mYellowCardTypes2) && this.mGreenCardTypesEnable == bleMatchFieldHockeySettings.mGreenCardTypesEnable && this.mYellowCardTypesEnable == bleMatchFieldHockeySettings.mYellowCardTypesEnable && this.mYellowCardTypesEnable2 == bleMatchFieldHockeySettings.mYellowCardTypesEnable2 && this.mRedCardTypesEnable == bleMatchFieldHockeySettings.mRedCardTypesEnable && this.mRingVolume == bleMatchFieldHockeySettings.mRingVolume && this.mPeriodMode == bleMatchFieldHockeySettings.mPeriodMode && this.mPeriodReminder == bleMatchFieldHockeySettings.mPeriodReminder && this.mPeriodReminderTime == bleMatchFieldHockeySettings.mPeriodReminderTime && this.mPlayerListEnable == bleMatchFieldHockeySettings.mPlayerListEnable && this.mGreenCardTime == bleMatchFieldHockeySettings.mGreenCardTime && this.mYellowCard1Time == bleMatchFieldHockeySettings.mYellowCard1Time && this.mYellowCard2Time == bleMatchFieldHockeySettings.mYellowCard2Time;
    }

    @aa1
    public final List<Integer> getMBreakTime() {
        return this.mBreakTime;
    }

    public final int getMButtonType() {
        return this.mButtonType;
    }

    public final int getMGps() {
        return this.mGps;
    }

    public final int getMGreenCardTime() {
        return this.mGreenCardTime;
    }

    @aa1
    public final List<String> getMGreenCardTypes() {
        return this.mGreenCardTypes;
    }

    public final int getMGreenCardTypesEnable() {
        return this.mGreenCardTypesEnable;
    }

    public final int getMGuestTeamColor() {
        return this.mGuestTeamColor;
    }

    public final int getMHomeTeamColor() {
        return this.mHomeTeamColor;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 859;
    }

    public final int getMMatchView() {
        return this.mMatchView;
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

    public final int getMVibration() {
        return this.mVibration;
    }

    public final int getMYellowCard1Time() {
        return this.mYellowCard1Time;
    }

    public final int getMYellowCard2Time() {
        return this.mYellowCard2Time;
    }

    @aa1
    public final List<String> getMYellowCardTypes() {
        return this.mYellowCardTypes;
    }

    @aa1
    public final List<String> getMYellowCardTypes2() {
        return this.mYellowCardTypes2;
    }

    public final int getMYellowCardTypesEnable() {
        return this.mYellowCardTypesEnable;
    }

    public final int getMYellowCardTypesEnable2() {
        return this.mYellowCardTypesEnable2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + this.mGreenCardTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode()) * 31) + this.mYellowCardTypes2.hashCode()) * 31) + Integer.hashCode(this.mGreenCardTypesEnable)) * 31) + Integer.hashCode(this.mYellowCardTypesEnable)) * 31) + Integer.hashCode(this.mYellowCardTypesEnable2)) * 31) + Integer.hashCode(this.mRedCardTypesEnable)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mPeriodMode)) * 31) + Integer.hashCode(this.mPeriodReminder)) * 31) + Integer.hashCode(this.mPeriodReminderTime)) * 31) + Integer.hashCode(this.mPlayerListEnable)) * 31) + Integer.hashCode(this.mGreenCardTime)) * 31) + Integer.hashCode(this.mYellowCard1Time)) * 31) + Integer.hashCode(this.mYellowCard2Time);
    }

    public final void setMBreakTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBreakTime = list;
    }

    public final void setMButtonType(int i) {
        this.mButtonType = i;
    }

    public final void setMGps(int i) {
        this.mGps = i;
    }

    public final void setMGreenCardTime(int i) {
        this.mGreenCardTime = i;
    }

    public final void setMGreenCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mGreenCardTypes = list;
    }

    public final void setMGreenCardTypesEnable(int i) {
        this.mGreenCardTypesEnable = i;
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

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    public final void setMYellowCard1Time(int i) {
        this.mYellowCard1Time = i;
    }

    public final void setMYellowCard2Time(int i) {
        this.mYellowCard2Time = i;
    }

    public final void setMYellowCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes = list;
    }

    public final void setMYellowCardTypes2(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes2 = list;
    }

    public final void setMYellowCardTypesEnable(int i) {
        this.mYellowCardTypesEnable = i;
    }

    public final void setMYellowCardTypesEnable2(int i) {
        this.mYellowCardTypesEnable2 = i;
    }

    @aa1
    public String toString() {
        return "BleMatchFieldHockeySettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGreenCardTypes=" + this.mGreenCardTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mYellowCardTypes2=" + this.mYellowCardTypes2 + ", mGreenCardTypesEnable=" + this.mGreenCardTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mYellowCardTypesEnable2=" + this.mYellowCardTypesEnable2 + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mPlayerListEnable=" + this.mPlayerListEnable + ", mGreenCardTime=" + this.mGreenCardTime + ", mYellowCard1Time=" + this.mYellowCard1Time + ", mYellowCard2Time=" + this.mYellowCard2Time + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchFieldHockeySettings(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGreenCardTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, @aa1 List<String> mYellowCardTypes2, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        Intrinsics.X0O(mGreenCardTypes, "mGreenCardTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        Intrinsics.X0O(mYellowCardTypes2, "mYellowCardTypes2");
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
        this.mGreenCardTypes = mGreenCardTypes;
        this.mYellowCardTypes = mYellowCardTypes;
        this.mRedCardTypes = mRedCardTypes;
        this.mYellowCardTypes2 = mYellowCardTypes2;
        this.mGreenCardTypesEnable = i9;
        this.mYellowCardTypesEnable = i10;
        this.mYellowCardTypesEnable2 = i11;
        this.mRedCardTypesEnable = i12;
        this.mRingVolume = i13;
        this.mPeriodMode = i14;
        this.mPeriodReminder = i15;
        this.mPeriodReminderTime = i16;
        this.mPlayerListEnable = i17;
        this.mGreenCardTime = i18;
        this.mYellowCard1Time = i19;
        this.mYellowCard2Time = i20;
    }

    public /* synthetic */ BleMatchFieldHockeySettings(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, List list8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? 0 : i, (i21 & 2) != 0 ? new ArrayList() : list, (i21 & 4) != 0 ? new ArrayList() : list2, (i21 & 8) != 0 ? 0 : i2, (i21 & 16) != 0 ? 0 : i3, (i21 & 32) != 0 ? 0 : i4, (i21 & 64) != 0 ? 0 : i5, (i21 & 128) != 0 ? 0 : i6, (i21 & 256) != 0 ? 0 : i7, (i21 & 512) != 0 ? 0 : i8, (i21 & 1024) != 0 ? new ArrayList() : list3, (i21 & 2048) != 0 ? new ArrayList() : list4, (i21 & 4096) != 0 ? new ArrayList() : list5, (i21 & 8192) != 0 ? new ArrayList() : list6, (i21 & 16384) != 0 ? new ArrayList() : list7, (i21 & 32768) != 0 ? new ArrayList() : list8, (i21 & 65536) != 0 ? 0 : i9, (i21 & 131072) != 0 ? 0 : i10, (i21 & 262144) != 0 ? 0 : i11, (i21 & 524288) != 0 ? 0 : i12, (i21 & 1048576) != 0 ? 0 : i13, (i21 & 2097152) != 0 ? 0 : i14, (i21 & 4194304) != 0 ? 0 : i15, (i21 & 8388608) != 0 ? 0 : i16, (i21 & 16777216) != 0 ? 0 : i17, (i21 & 33554432) != 0 ? 0 : i18, (i21 & 67108864) != 0 ? 0 : i19, (i21 & 134217728) != 0 ? 0 : i20);
    }
}
