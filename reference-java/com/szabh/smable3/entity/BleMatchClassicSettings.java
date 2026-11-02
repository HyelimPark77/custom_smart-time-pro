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
@SourceDebugExtension({"SMAP\nBleMatchClassicSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchClassicSettings.kt\ncom/szabh/smable3/entity/BleMatchClassicSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class BleMatchClassicSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;
    private int mGps;
    private int mMatchView;

    @aa1
    private List<Integer> mPeriodTime;
    private int mPeriods;

    @aa1
    private List<String> mRefereeRole;
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

    public BleMatchClassicSettings() {
        this(0, null, null, 0, 0, 0, 0, 0, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchClassicSettings copy$default(BleMatchClassicSettings bleMatchClassicSettings, int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, List list3, List list4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleMatchClassicSettings.mPeriods;
        }
        if ((i7 & 2) != 0) {
            list = bleMatchClassicSettings.mPeriodTime;
        }
        if ((i7 & 4) != 0) {
            list2 = bleMatchClassicSettings.mBreakTime;
        }
        if ((i7 & 8) != 0) {
            i2 = bleMatchClassicSettings.mVibration;
        }
        if ((i7 & 16) != 0) {
            i3 = bleMatchClassicSettings.mButtonType;
        }
        if ((i7 & 32) != 0) {
            i4 = bleMatchClassicSettings.mGps;
        }
        if ((i7 & 64) != 0) {
            i5 = bleMatchClassicSettings.mScreen;
        }
        if ((i7 & 128) != 0) {
            i6 = bleMatchClassicSettings.mMatchView;
        }
        if ((i7 & 256) != 0) {
            list3 = bleMatchClassicSettings.mTeamNames;
        }
        if ((i7 & 512) != 0) {
            list4 = bleMatchClassicSettings.mRefereeRole;
        }
        List list5 = list3;
        List list6 = list4;
        int i8 = i5;
        int i9 = i6;
        int i10 = i3;
        int i11 = i4;
        return bleMatchClassicSettings.copy(i, list, list2, i2, i10, i11, i8, i9, list5, list6);
    }

    public final int component1() {
        return this.mPeriods;
    }

    @aa1
    public final List<String> component10() {
        return this.mRefereeRole;
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
    public final BleMatchClassicSettings copy(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole) {
        Intrinsics.X0O(mPeriodTime, "mPeriodTime");
        Intrinsics.X0O(mBreakTime, "mBreakTime");
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRole, "mRefereeRole");
        return new BleMatchClassicSettings(i, mPeriodTime, mBreakTime, i2, i3, i4, i5, i6, mTeamNames, mRefereeRole);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(1);
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
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchClassicSettings)) {
            return false;
        }
        BleMatchClassicSettings bleMatchClassicSettings = (BleMatchClassicSettings) obj;
        return this.mPeriods == bleMatchClassicSettings.mPeriods && Intrinsics.XOO0ii0(this.mPeriodTime, bleMatchClassicSettings.mPeriodTime) && Intrinsics.XOO0ii0(this.mBreakTime, bleMatchClassicSettings.mBreakTime) && this.mVibration == bleMatchClassicSettings.mVibration && this.mButtonType == bleMatchClassicSettings.mButtonType && this.mGps == bleMatchClassicSettings.mGps && this.mScreen == bleMatchClassicSettings.mScreen && this.mMatchView == bleMatchClassicSettings.mMatchView && Intrinsics.XOO0ii0(this.mTeamNames, bleMatchClassicSettings.mTeamNames) && Intrinsics.XOO0ii0(this.mRefereeRole, bleMatchClassicSettings.mRefereeRole);
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
        return 192;
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

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode();
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
        return "BleMatchClassicSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchClassicSettings(int i, @aa1 List<Integer> mPeriodTime, @aa1 List<Integer> mBreakTime, int i2, int i3, int i4, int i5, int i6, @aa1 List<String> mTeamNames, @aa1 List<String> mRefereeRole) {
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
    }

    public /* synthetic */ BleMatchClassicSettings(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, List list3, List list4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? new ArrayList() : list, (i7 & 4) != 0 ? new ArrayList() : list2, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) != 0 ? new ArrayList() : list3, (i7 & 512) != 0 ? new ArrayList() : list4);
    }
}
