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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchClassicSettings() {
        int r1 = 0;
        List r2 = null;
        List r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        List r9 = null;
        List r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchClassicSettings copy$default(BleMatchClassicSettings r0, int r1, List r2, List r3, int r4, int r5, int r6, int r7, int r8, List r9, List r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mPeriods;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mPeriodTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mBreakTime;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mVibration;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mButtonType;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mGps;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mScreen;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mMatchView;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mTeamNames;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mRefereeRole;
    L32:
        List r13 = r9;
        List r14 = r10;
        int r15 = r7;
        int r16 = r8;
        int r17 = r5;
        int r18 = r6;
        List r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
    public final BleMatchClassicSettings copy(int r13, @aa1 List<Integer> r14, @aa1 List<Integer> r15, int r16, int r17, int r18, int r19, int r20, @aa1 List<String> r21, @aa1 List<String> r22) {
        Intrinsics.X0O(r14, "mPeriodTime");
        Intrinsics.X0O(r15, "mBreakTime");
        Intrinsics.X0O(r21, "mTeamNames");
        Intrinsics.X0O(r22, "mRefereeRole");
        return new BleMatchClassicSettings(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(1);
        writeInt8(this.mPeriods);
        int r6 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 9) goto L12;
        List<Integer> r4 = this.mPeriodTime;
        if (r2 >= 0) goto L8;
    L10:
        Integer r5 = 0;
    L11:
        BleWritable.writeInt16$default(this, r5.intValue(), null, 2, null);
        r2 = r2 + 1;
        goto L4
    L8:
        if (r2 >= r4.size()) goto L10;
        r5 = r4.get(r2);
        goto L11
    L12:
        int r3 = 0;
    L14:
        if (r3 >= 8) goto L22;
        List<Integer> r7 = this.mBreakTime;
        if (r3 >= 0) goto L18;
    L20:
        Integer r8 = 0;
    L21:
        BleWritable.writeInt16$default(this, r8.intValue(), null, 2, null);
        r3 = r3 + 1;
        goto L14
    L18:
        if (r3 >= r7.size()) goto L20;
        r8 = r7.get(r3);
        goto L21
    L22:
        writeInt8(this.mVibration);
        writeInt8(this.mButtonType);
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
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchClassicSettings) == true) goto L8;
        return false;
    L8:
        BleMatchClassicSettings r6 = (BleMatchClassicSettings) r5;
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
        if (this.mGps == r6.mGps) goto L27;
        return false;
    L27:
        if (this.mScreen == r6.mScreen) goto L30;
        return false;
    L30:
        if (this.mMatchView == r6.mMatchView) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mTeamNames, r6.mTeamNames) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mRefereeRole, r6.mRefereeRole) == true) goto L38;
        return false;
    L38:
        return true;
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

    public final void setMBreakTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBreakTime = r2;
    }

    public final void setMButtonType(int r1) {
        this.mButtonType = r1;
    }

    public final void setMGps(int r1) {
        this.mGps = r1;
    }

    public final void setMMatchView(int r1) {
        this.mMatchView = r1;
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

    public final void setMScreen(int r1) {
        this.mScreen = r1;
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
        return "BleMatchClassicSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchClassicSettings(int r2, @aa1 List<Integer> r3, @aa1 List<Integer> r4, int r5, int r6, int r7, int r8, int r9, @aa1 List<String> r10, @aa1 List<String> r11) {
        Intrinsics.X0O(r3, "mPeriodTime");
        Intrinsics.X0O(r4, "mBreakTime");
        Intrinsics.X0O(r10, "mTeamNames");
        Intrinsics.X0O(r11, "mRefereeRole");
        this.mPeriods = r2;
        this.mPeriodTime = r3;
        this.mBreakTime = r4;
        this.mVibration = r5;
        this.mButtonType = r6;
        this.mGps = r7;
        this.mScreen = r8;
        this.mMatchView = r9;
        this.mTeamNames = r10;
        this.mRefereeRole = r11;
    }

    public /* synthetic */ BleMatchClassicSettings(int r2, List r3, List r4, int r5, int r6, int r7, int r8, int r9, List r10, List r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = new ArrayList();
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = new ArrayList();
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = new ArrayList();
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = new ArrayList();
    L32:
        List r14 = r11;
        List r15 = r10;
        int r16 = r9;
        int r17 = r8;
        int r18 = r7;
        int r19 = r6;
        int r20 = r5;
        List r21 = r4;
        this(r2, r3, r21, r20, r19, r18, r17, r16, r15, r14);
    }
}
