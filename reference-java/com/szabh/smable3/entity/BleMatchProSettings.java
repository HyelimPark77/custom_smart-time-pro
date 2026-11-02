package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2788p1;
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
@SourceDebugExtension({"SMAP\nBleMatchProSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchProSettings.kt\ncom/szabh/smable3/entity/BleMatchProSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1#2:100\n1869#3,2:101\n1869#3,2:103\n1869#3,2:105\n*S KotlinDebug\n*F\n+ 1 BleMatchProSettings.kt\ncom/szabh/smable3/entity/BleMatchProSettings\n*L\n63#1:101,2\n74#1:103,2\n85#1:105,2\n*E\n"})
public final class BleMatchProSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;

    @aa1
    private List<String> mGoalTypes;
    private int mGoalTypesEnable;
    private int mGps;
    private int mGuestTeamColor;
    private int mHomeTeamColor;
    private int mMatchView;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;

    @aa1
    private List<String> mRedCardTypes;
    private int mRedCardTypesEnable;

    @aa1
    private List<String> mRefereeRole;
    private int mScreen;

    @aa1
    private List<String> mTeamNames;
    private int mVibration;

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

    public BleMatchProSettings() {
        this(0, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, C2788p1.OXO1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchProSettings copy$default(BleMatchProSettings bleMatchProSettings, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, int i9, int i10, int i11, int i12, Object obj) {
        int i13;
        int i14;
        int i15 = (i12 & 1) != 0 ? bleMatchProSettings.mPeriods : i;
        List list8 = (i12 & 2) != 0 ? bleMatchProSettings.mPeriodTime : list;
        List list9 = (i12 & 4) != 0 ? bleMatchProSettings.mBreakTime : list2;
        int i16 = (i12 & 8) != 0 ? bleMatchProSettings.mVibration : i2;
        int i17 = (i12 & 16) != 0 ? bleMatchProSettings.mButtonType : i3;
        int i18 = (i12 & 32) != 0 ? bleMatchProSettings.mHomeTeamColor : i4;
        int i19 = (i12 & 64) != 0 ? bleMatchProSettings.mGuestTeamColor : i5;
        int i20 = (i12 & 128) != 0 ? bleMatchProSettings.mGps : i6;
        int i21 = (i12 & 256) != 0 ? bleMatchProSettings.mScreen : i7;
        int i22 = (i12 & 512) != 0 ? bleMatchProSettings.mMatchView : i8;
        List list10 = (i12 & 1024) != 0 ? bleMatchProSettings.mTeamNames : list3;
        List list11 = (i12 & 2048) != 0 ? bleMatchProSettings.mRefereeRole : list4;
        List list12 = (i12 & 4096) != 0 ? bleMatchProSettings.mGoalTypes : list5;
        List list13 = (i12 & 8192) != 0 ? bleMatchProSettings.mYellowCardTypes : list6;
        int i23 = i15;
        List list14 = (i12 & 16384) != 0 ? bleMatchProSettings.mRedCardTypes : list7;
        int i24 = (i12 & 32768) != 0 ? bleMatchProSettings.mGoalTypesEnable : i9;
        int i25 = (i12 & 65536) != 0 ? bleMatchProSettings.mYellowCardTypesEnable : i10;
        if ((i12 & 131072) != 0) {
            i14 = i25;
            i13 = bleMatchProSettings.mRedCardTypesEnable;
        } else {
            i13 = i11;
            i14 = i25;
        }
        return bleMatchProSettings.copy(i23, list8, list9, i16, i17, i18, i19, i20, i21, i22, list10, list11, list12, list13, list14, i24, i14, i13);
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

    @aa1
    public final List<Integer> component2() {
        return this.mPeriodTime;
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
    public final BleMatchProSettings copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, int i9, int i10, int i11) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        return new BleMatchProSettings(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, i7, i8, mTeamNames, mRefereeRole, mGoalTypes, mYellowCardTypes, mRedCardTypes, i9, i10, i11);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(2);
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
        while (i9 < 5) {
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
        while (i < 5) {
            List<String> list7 = this.mRedCardTypes;
            BleWritable.writeStringWithFix$default(this, (i < 0 || i >= list7.size()) ? "" : list7.get(i), 25, null, 4, null);
            i++;
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchProSettings)) {
            return false;
        }
        BleMatchProSettings bleMatchProSettings = (BleMatchProSettings) obj;
        return this.mPeriods == bleMatchProSettings.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchProSettings.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchProSettings.mBreakTime) && this.mVibration == bleMatchProSettings.mVibration && this.mButtonType == bleMatchProSettings.mButtonType && this.mHomeTeamColor == bleMatchProSettings.mHomeTeamColor && this.mGuestTeamColor == bleMatchProSettings.mGuestTeamColor && this.mGps == bleMatchProSettings.mGps && this.mScreen == bleMatchProSettings.mScreen && this.mMatchView == bleMatchProSettings.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchProSettings.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchProSettings.mRefereeRole) && Intrinsics.XOO0ii0(this.mGoalTypes, bleMatchProSettings.mGoalTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes, bleMatchProSettings.mYellowCardTypes) && Intrinsics.XOO0ii0(this.mRedCardTypes, bleMatchProSettings.mRedCardTypes) && this.mGoalTypesEnable == bleMatchProSettings.mGoalTypesEnable && this.mYellowCardTypesEnable == bleMatchProSettings.mYellowCardTypesEnable && this.mRedCardTypesEnable == bleMatchProSettings.mRedCardTypesEnable;
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

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 646;
    }

    public final int getMMatchView() {
        return this.mMatchView;
    }

    @aa1
    public final List<Integer> getMPeriodTime() {
        return this.mPeriodTime;
    }

    public final int getMPeriods() {
        return this.mPeriods;
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

    @aa1
    public final List<String> getMYellowCardTypes() {
        return this.mYellowCardTypes;
    }

    public final int getMYellowCardTypesEnable() {
        return this.mYellowCardTypesEnable;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + this.mGoalTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode()) * 31) + Integer.hashCode(this.mGoalTypesEnable)) * 31) + Integer.hashCode(this.mYellowCardTypesEnable)) * 31) + Integer.hashCode(this.mRedCardTypesEnable);
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

    public final void setMMatchView(int i) {
        this.mMatchView = i;
    }

    public final void setMPeriodTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodTime = list;
    }

    public final void setMPeriods(int i) {
        this.mPeriods = i;
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

    public final void setMYellowCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes = list;
    }

    public final void setMYellowCardTypesEnable(int i) {
        this.mYellowCardTypesEnable = i;
    }

    @aa1
    public String toString() {
        return "BleMatchProSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mGoalTypesEnable=" + this.mGoalTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchProSettings(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, int i9, int i10, int i11) {
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
    }

    public /* synthetic */ BleMatchProSettings(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list3, List list4, List list5, List list6, List list7, int i9, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? new ArrayList() : list, (i12 & 4) != 0 ? new ArrayList() : list2, (i12 & 8) != 0 ? 0 : i2, (i12 & 16) != 0 ? 0 : i3, (i12 & 32) != 0 ? 0 : i4, (i12 & 64) != 0 ? 0 : i5, (i12 & 128) != 0 ? 0 : i6, (i12 & 256) != 0 ? 0 : i7, (i12 & 512) != 0 ? 0 : i8, (i12 & 1024) != 0 ? new ArrayList() : list3, (i12 & 2048) != 0 ? new ArrayList() : list4, (i12 & 4096) != 0 ? new ArrayList() : list5, (i12 & 8192) != 0 ? new ArrayList() : list6, (i12 & 16384) != 0 ? new ArrayList() : list7, (i12 & 32768) != 0 ? 0 : i9, (i12 & 65536) != 0 ? 0 : i10, (i12 & 131072) != 0 ? 0 : i11);
    }
}
