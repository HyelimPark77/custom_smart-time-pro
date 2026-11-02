package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchYouthSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchYouthSettings.kt\ncom/szabh/smable3/entity/BleMatchYouthSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class BleMatchYouthSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<Integer> mBreakTime;
    private int mButtonType;
    private int mEventTime;
    private int mGps;
    private int mGuestTeamColor;
    private int mHomeTeamColor;
    private int mMatchView;
    private int mPenaltyTime;

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

    public BleMatchYouthSettings() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, bm.OXO1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchYouthSettings copy$default(BleMatchYouthSettings r14, int r15, List r16, List r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, List r26, List r27, int r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        int r1 = r14.mPeriods;
    L7:
        if ((r29 & 2) == 0) goto L9;
        List r2 = r14.mPeriodTime;
    L11:
        if ((r29 & 4) == 0) goto L13;
        List r3 = r14.mBreakTime;
    L15:
        if ((r29 & 8) == 0) goto L17;
        int r4 = r14.mVibration;
    L19:
        if ((r29 & 16) == 0) goto L21;
        int r5 = r14.mButtonType;
    L23:
        if ((r29 & 32) == 0) goto L25;
        int r6 = r14.mHomeTeamColor;
    L27:
        if ((r29 & 64) == 0) goto L29;
        int r7 = r14.mGuestTeamColor;
    L31:
        if ((r29 & 128) == 0) goto L33;
        int r8 = r14.mPenaltyTime;
    L35:
        if ((r29 & 256) == 0) goto L37;
        int r9 = r14.mGps;
    L39:
        if ((r29 & 512) == 0) goto L41;
        int r10 = r14.mScreen;
    L43:
        if ((r29 & 1024) == 0) goto L45;
        int r11 = r14.mMatchView;
    L47:
        if ((r29 & 2048) == 0) goto L49;
        List r12 = r14.mTeamNames;
    L51:
        if ((r29 & 4096) == 0) goto L53;
        List r13 = r14.mRefereeRole;
    L55:
        if ((r29 & 8192) == 0) goto L58;
        int r210 = r14.mEventTime;
    L60:
        return r14.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r210);
    L58:
        r210 = r28;
        goto L60
    L53:
        r13 = r27;
        goto L55
    L49:
        r12 = r26;
        goto L51
    L45:
        r11 = r25;
        goto L47
    L41:
        r10 = r24;
        goto L43
    L37:
        r9 = r23;
        goto L39
    L33:
        r8 = r22;
        goto L35
    L29:
        r7 = r21;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
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
        return this.mPenaltyTime;
    }

    public final int component9() {
        return this.mGps;
    }

    @aa1
    public final BleMatchYouthSettings copy(int r17, @aa1 List<Integer> r18, @aa1 List<Integer> r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, @aa1 List<String> r28, @aa1 List<String> r29, int r30) {
        Intrinsics.X0O(r18, "mPeriodTime");
        Intrinsics.X0O(r19, "mBreakTime");
        Intrinsics.X0O(r28, "mTeamNames");
        Intrinsics.X0O(r29, "mRefereeRole");
        return new BleMatchYouthSettings(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r6 = 0;
        writeInt8(0);
        writeInt8(this.mPeriods);
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
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchYouthSettings) == true) goto L8;
        return false;
    L8:
        BleMatchYouthSettings r6 = (BleMatchYouthSettings) r5;
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
        if (this.mEventTime == r6.mEventTime) goto L50;
        return false;
    L50:
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
        return 196;
    }

    public final int getMMatchView() {
        return this.mMatchView;
    }

    public final int getMPenaltyTime() {
        return this.mPenaltyTime;
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
        return (((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mPenaltyTime)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + Integer.hashCode(this.mEventTime);
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

    public final void setMPenaltyTime(int r1) {
        this.mPenaltyTime = r1;
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
        return "BleMatchYouthSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mPenaltyTime=" + this.mPenaltyTime + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mEventTime=" + this.mEventTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchYouthSettings(int r2, @aa1 List<Integer> r3, @aa1 List<Integer> r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, @aa1 List<String> r13, @aa1 List<String> r14, int r15) {
        Intrinsics.X0O(r3, "mPeriodTime");
        Intrinsics.X0O(r4, "mBreakTime");
        Intrinsics.X0O(r13, "mTeamNames");
        Intrinsics.X0O(r14, "mRefereeRole");
        this.mPeriods = r2;
        this.mPeriodTime = r3;
        this.mBreakTime = r4;
        this.mVibration = r5;
        this.mButtonType = r6;
        this.mHomeTeamColor = r7;
        this.mGuestTeamColor = r8;
        this.mPenaltyTime = r9;
        this.mGps = r10;
        this.mScreen = r11;
        this.mMatchView = r12;
        this.mTeamNames = r13;
        this.mRefereeRole = r14;
        this.mEventTime = r15;
    }

    public /* synthetic */ BleMatchYouthSettings(int r16, List r17, List r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, List r27, List r28, int r29, int r30, DefaultConstructorMarker r31) {
        if ((r30 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r30 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r30 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r30 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r30 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r30 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r30 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r30 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r30 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r30 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r30 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r30 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r30 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r30 & 8192) == 0) goto L58;
        int r32 = 0;
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32);
        return;
    L58:
        r32 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
