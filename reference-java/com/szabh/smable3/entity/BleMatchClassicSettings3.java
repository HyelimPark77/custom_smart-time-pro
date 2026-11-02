package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.C2263bm;
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
@SourceDebugExtension({"SMAP\nBleMatchClassicSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchClassicSettings3.kt\ncom/szabh/smable3/entity/BleMatchClassicSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class BleMatchClassicSettings3 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;
    private int mGps;
    private int mMatchView;
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

    public BleMatchClassicSettings3() {
        this(0, null, null, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, C2263bm.OXO1, null);
    }

    public final int component1() {
        return this.mPeriods;
    }

    @aa1
    public final List<String> component10() {
        return this.mRefereeRole;
    }

    public final int component11() {
        return this.mRingVolume;
    }

    public final int component12() {
        return this.mPeriodMode;
    }

    public final int component13() {
        return this.mPeriodReminder;
    }

    public final int component14() {
        return this.mPeriodReminderTime;
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
        return this.mGps;
    }

    public final int component7() {
        return this.mScreen;
    }

    public final int component8() {
        return this.mMatchView;
    }

    @aa1
    public final List<String> component9() {
        return this.mTeamNames;
    }

    @aa1
    public final BleMatchClassicSettings3 copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, int i7, int i8, int i9, int i10) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        return new BleMatchClassicSettings3(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, mTeamNames, mRefereeRole, i7, i8, i9, i10);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(7);
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
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchClassicSettings3)) {
            return false;
        }
        BleMatchClassicSettings3 bleMatchClassicSettings3 = (BleMatchClassicSettings3) obj;
        return this.mPeriods == bleMatchClassicSettings3.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchClassicSettings3.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchClassicSettings3.mBreakTime) && this.mVibration == bleMatchClassicSettings3.mVibration && this.mButtonType == bleMatchClassicSettings3.mButtonType && this.mGps == bleMatchClassicSettings3.mGps && this.mScreen == bleMatchClassicSettings3.mScreen && this.mMatchView == bleMatchClassicSettings3.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchClassicSettings3.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchClassicSettings3.mRefereeRole) && this.mRingVolume == bleMatchClassicSettings3.mRingVolume && this.mPeriodMode == bleMatchClassicSettings3.mPeriodMode && this.mPeriodReminder == bleMatchClassicSettings3.mPeriodReminder && this.mPeriodReminderTime == bleMatchClassicSettings3.mPeriodReminderTime;
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

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 197;
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

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mPeriodMode)) * 31) + Integer.hashCode(this.mPeriodReminder)) * 31) + Integer.hashCode(this.mPeriodReminderTime);
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

    @aa1
    public String toString() {
        return "BleMatchClassicSettings3(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchClassicSettings3(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole, int i7, int i8, int i9, int i10) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        this.mPeriods = i;
        this.mPeriodTime = mPeriodTime;
        this.mBreakTime = mBreakTime;
        this.mVibration = i2;
        this.mButtonType = i3;
        this.mGps = i4;
        this.mScreen = i5;
        this.mMatchView = i6;
        this.mTeamNames = mTeamNames;
        this.mRefereeRole = mRefereeRole;
        this.mRingVolume = i7;
        this.mPeriodMode = i8;
        this.mPeriodReminder = i9;
        this.mPeriodReminderTime = i10;
    }

    public /* synthetic */ BleMatchClassicSettings3(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, List list3, List list4, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? new ArrayList() : list, (i11 & 4) != 0 ? new ArrayList() : list2, (i11 & 8) != 0 ? 0 : i2, (i11 & 16) != 0 ? 0 : i3, (i11 & 32) != 0 ? 0 : i4, (i11 & 64) != 0 ? 0 : i5, (i11 & 128) != 0 ? 0 : i6, (i11 & 256) != 0 ? new ArrayList() : list3, (i11 & 512) != 0 ? new ArrayList() : list4, (i11 & 1024) != 0 ? 0 : i7, (i11 & 2048) != 0 ? 0 : i8, (i11 & 4096) != 0 ? 0 : i9, (i11 & 8192) != 0 ? 0 : i10);
    }
}
