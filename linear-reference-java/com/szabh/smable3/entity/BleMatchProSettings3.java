package com.szabh.smable3.entity;

import android.text.TextUtils;
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
@SourceDebugExtension({"SMAP\nBleMatchProSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchProSettings3.kt\ncom/szabh/smable3/entity/BleMatchProSettings3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1#2:110\n1869#3,2:111\n1869#3,2:113\n1869#3,2:115\n*S KotlinDebug\n*F\n+ 1 BleMatchProSettings3.kt\ncom/szabh/smable3/entity/BleMatchProSettings3\n*L\n68#1:111,2\n79#1:113,2\n90#1:115,2\n*E\n"})
public final class BleMatchProSettings3 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
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

    @aa1
    private List<String> mYellowCardTypes;
    private int mYellowCardTypesEnable;

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

    public BleMatchProSettings3() {
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
        List r11 = null;
        List r12 = null;
        List r13 = null;
        List r14 = null;
        List r15 = null;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, 8388607, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchProSettings3 copy$default(BleMatchProSettings3 r17, int r18, List r19, List r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, List r28, List r29, List r30, List r31, List r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, Object r42) {
        if ((r41 & 1) == 0) goto L5;
        int r2 = r17.mPeriods;
    L7:
        if ((r41 & 2) == 0) goto L9;
        List r3 = r17.mPeriodTime;
    L11:
        if ((r41 & 4) == 0) goto L13;
        List r4 = r17.mBreakTime;
    L15:
        if ((r41 & 8) == 0) goto L17;
        int r5 = r17.mVibration;
    L19:
        if ((r41 & 16) == 0) goto L21;
        int r6 = r17.mButtonType;
    L23:
        if ((r41 & 32) == 0) goto L25;
        int r7 = r17.mHomeTeamColor;
    L27:
        if ((r41 & 64) == 0) goto L29;
        int r8 = r17.mGuestTeamColor;
    L31:
        if ((r41 & 128) == 0) goto L33;
        int r9 = r17.mGps;
    L35:
        if ((r41 & 256) == 0) goto L37;
        int r10 = r17.mScreen;
    L39:
        if ((r41 & 512) == 0) goto L41;
        int r11 = r17.mMatchView;
    L43:
        if ((r41 & 1024) == 0) goto L45;
        List r12 = r17.mTeamNames;
    L47:
        if ((r41 & 2048) == 0) goto L49;
        List r13 = r17.mRefereeRole;
    L51:
        if ((r41 & 4096) == 0) goto L53;
        List r14 = r17.mGoalTypes;
    L55:
        if ((r41 & 8192) == 0) goto L57;
        List r15 = r17.mYellowCardTypes;
    L58:
        int r110 = r2;
        if ((r41 & 16384) == 0) goto L61;
        List r16 = r17.mRedCardTypes;
    L63:
        if ((r41 & 32768) == 0) goto L65;
        int r1 = r17.mGoalTypesEnable;
    L66:
        int r111 = r1;
        if ((r41 & 65536) == 0) goto L69;
        int r43 = r17.mYellowCardTypesEnable;
    L70:
        int r210 = r43;
        if ((r41 & 131072) == 0) goto L73;
        int r44 = r17.mRedCardTypesEnable;
    L74:
        int r211 = r44;
        if ((r41 & 262144) == 0) goto L77;
        int r45 = r17.mRingVolume;
    L78:
        int r212 = r45;
        if ((r41 & 524288) == 0) goto L81;
        int r46 = r17.mPeriodMode;
    L82:
        int r213 = r46;
        if ((r41 & 1048576) == 0) goto L85;
        int r47 = r17.mPeriodReminder;
    L86:
        int r214 = r47;
        if ((r41 & 2097152) == 0) goto L89;
        int r48 = r17.mPeriodReminderTime;
    L91:
        if ((r41 & 4194304) == 0) goto L94;
        int r215 = r48;
        int r49 = r215;
        int r410 = r17.mPlayerListEnable;
    L96:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r49, r410);
    L94:
        r410 = r40;
        r49 = r48;
        goto L96
    L89:
        r48 = r39;
        goto L91
    L85:
        r47 = r38;
        goto L86
    L81:
        r46 = r37;
        goto L82
    L77:
        r45 = r36;
        goto L78
    L73:
        r44 = r35;
        goto L74
    L69:
        r43 = r34;
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
    public final BleMatchProSettings3 copy(int r26, @aa1 List<Integer> r27, @aa1 List<Integer> r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, @aa1 List<String> r36, @aa1 List<String> r37, @aa1 List<String> r38, @aa1 List<String> r39, @aa1 List<String> r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48) {
        Intrinsics.X0O(r27, "mPeriodTime");
        Intrinsics.X0O(r28, "mBreakTime");
        Intrinsics.X0O(r36, "mTeamNames");
        Intrinsics.X0O(r37, "mRefereeRole");
        Intrinsics.X0O(r38, "mGoalTypes");
        Intrinsics.X0O(r39, "mYellowCardTypes");
        Intrinsics.X0O(r40, "mRedCardTypes");
        return new BleMatchProSettings3(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(8);
        writeInt8(this.mPeriods);
        int r7 = 0;
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
    L13:
        if (r5 >= 8) goto L21;
        List<Integer> r6 = this.mBreakTime;
        if (r5 >= 0) goto L17;
    L19:
        Integer r8 = 0;
    L20:
        BleWritable.writeInt16$default(this, r8.intValue(), null, 2, null);
        r5 = r5 + 1;
        goto L13
    L17:
        if (r5 >= r6.size()) goto L19;
        r8 = r6.get(r5);
        goto L20
    L21:
        writeInt8(this.mVibration);
        writeInt8(this.mButtonType);
        writeInt8(this.mHomeTeamColor);
        writeInt8(this.mGuestTeamColor);
        writeInt8(this.mGps);
        writeInt8(this.mScreen);
        writeInt8(this.mMatchView);
        int r10 = 0;
    L22:
        String r11 = "";
        if (r10 >= 2) goto L30;
        List<String> r1 = this.mTeamNames;
        if (r10 < 0) goto L29;
        if (r10 >= r1.size()) goto L29;
        r11 = r1.get(r10);
    L29:
        BleWritable.writeStringWithFix$default(this, r11, 25, null, 4, null);
        r10 = r10 + 1;
        goto L22
    L30:
        int r12 = 0;
    L32:
        if (r12 >= 4) goto L40;
        List<String> r9 = this.mRefereeRole;
        if (r12 >= 0) goto L36;
    L38:
        String r13 = "";
    L39:
        BleWritable.writeStringWithFix$default(this, r13, 25, null, 4, null);
        r12 = r12 + 1;
        goto L32
    L36:
        if (r12 >= r9.size()) goto L38;
        r13 = r9.get(r12);
        goto L39
    L40:
        Iterator<T> r14 = this.mGoalTypes.iterator();
        int r15 = 0;
    L42:
        if (r14.hasNext() == false) goto L47;
        if (TextUtils.isEmpty((String) r14.next()) == true) goto L42;
        r15 = r15 + 1;
        goto L42
    L47:
        if (this.mGoalTypesEnable != 0) goto L50;
        r15 = 0;
    L50:
        writeInt8(r15);
        int r16 = 0;
    L51:
        if (r16 >= 8) goto L59;
        List<String> r17 = this.mGoalTypes;
        if (r16 >= 0) goto L55;
    L57:
        String r18 = "";
    L58:
        BleWritable.writeStringWithFix$default(this, r18, 25, null, 4, null);
        r16 = r16 + 1;
        goto L51
    L55:
        if (r16 >= r17.size()) goto L57;
        r18 = r17.get(r16);
        goto L58
    L59:
        Iterator<T> r19 = this.mYellowCardTypes.iterator();
        int r20 = 0;
    L61:
        if (r19.hasNext() == false) goto L66;
        if (TextUtils.isEmpty((String) r19.next()) == true) goto L61;
        r20 = r20 + 1;
        goto L61
    L66:
        if (this.mYellowCardTypesEnable != 0) goto L69;
        r20 = 0;
    L69:
        writeInt8(r20);
        int r21 = 0;
    L71:
        if (r21 >= 6) goto L79;
        List<String> r22 = this.mYellowCardTypes;
        if (r21 >= 0) goto L75;
    L77:
        String r23 = "";
    L78:
        BleWritable.writeStringWithFix$default(this, r23, 25, null, 4, null);
        r21 = r21 + 1;
        goto L71
    L75:
        if (r21 >= r22.size()) goto L77;
        r23 = r22.get(r21);
        goto L78
    L79:
        Iterator<T> r24 = this.mRedCardTypes.iterator();
        int r25 = 0;
    L81:
        if (r24.hasNext() == false) goto L86;
        if (TextUtils.isEmpty((String) r24.next()) == true) goto L81;
        r25 = r25 + 1;
        goto L81
    L86:
        if (this.mRedCardTypesEnable != 0) goto L89;
        r25 = 0;
    L89:
        writeInt8(r25);
    L90:
        if (r7 >= 6) goto L98;
        List<String> r26 = this.mRedCardTypes;
        if (r7 >= 0) goto L94;
    L96:
        String r27 = "";
    L97:
        BleWritable.writeStringWithFix$default(this, r27, 25, null, 4, null);
        r7 = r7 + 1;
        goto L90
    L94:
        if (r7 >= r26.size()) goto L96;
        r27 = r26.get(r7);
        goto L97
    L98:
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
        writeInt8(this.mPlayerListEnable);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchProSettings3) == true) goto L8;
        return false;
    L8:
        BleMatchProSettings3 r6 = (BleMatchProSettings3) r5;
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
        if (this.mGps == r6.mGps) goto L33;
        return false;
    L33:
        if (this.mScreen == r6.mScreen) goto L36;
        return false;
    L36:
        if (this.mMatchView == r6.mMatchView) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mTeamNames, r6.mTeamNames) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mRefereeRole, r6.mRefereeRole) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mGoalTypes, r6.mGoalTypes) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mYellowCardTypes, r6.mYellowCardTypes) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mRedCardTypes, r6.mRedCardTypes) == true) goto L54;
        return false;
    L54:
        if (this.mGoalTypesEnable == r6.mGoalTypesEnable) goto L57;
        return false;
    L57:
        if (this.mYellowCardTypesEnable == r6.mYellowCardTypesEnable) goto L60;
        return false;
    L60:
        if (this.mRedCardTypesEnable == r6.mRedCardTypesEnable) goto L63;
        return false;
    L63:
        if (this.mRingVolume == r6.mRingVolume) goto L66;
        return false;
    L66:
        if (this.mPeriodMode == r6.mPeriodMode) goto L69;
        return false;
    L69:
        if (this.mPeriodReminder == r6.mPeriodReminder) goto L72;
        return false;
    L72:
        if (this.mPeriodReminderTime == r6.mPeriodReminderTime) goto L75;
        return false;
    L75:
        if (this.mPlayerListEnable == r6.mPlayerListEnable) goto L77;
        return false;
    L77:
        return true;
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
        return 702;
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

    @aa1
    public final List<String> getMYellowCardTypes() {
        return this.mYellowCardTypes;
    }

    public final int getMYellowCardTypesEnable() {
        return this.mYellowCardTypesEnable;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mPeriods) * 31) + this.mPeriodTime.hashCode()) * 31) + this.mBreakTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mButtonType)) * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + Integer.hashCode(this.mGps)) * 31) + Integer.hashCode(this.mScreen)) * 31) + Integer.hashCode(this.mMatchView)) * 31) + this.mTeamNames.hashCode()) * 31) + this.mRefereeRole.hashCode()) * 31) + this.mGoalTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode()) * 31) + Integer.hashCode(this.mGoalTypesEnable)) * 31) + Integer.hashCode(this.mYellowCardTypesEnable)) * 31) + Integer.hashCode(this.mRedCardTypesEnable)) * 31) + Integer.hashCode(this.mRingVolume)) * 31) + Integer.hashCode(this.mPeriodMode)) * 31) + Integer.hashCode(this.mPeriodReminder)) * 31) + Integer.hashCode(this.mPeriodReminderTime)) * 31) + Integer.hashCode(this.mPlayerListEnable);
    }

    public final void setMBreakTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBreakTime = r2;
    }

    public final void setMButtonType(int r1) {
        this.mButtonType = r1;
    }

    public final void setMGoalTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGoalTypes = r2;
    }

    public final void setMGoalTypesEnable(int r1) {
        this.mGoalTypesEnable = r1;
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

    public final void setMPlayerListEnable(int r1) {
        this.mPlayerListEnable = r1;
    }

    public final void setMRedCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRedCardTypes = r2;
    }

    public final void setMRedCardTypesEnable(int r1) {
        this.mRedCardTypesEnable = r1;
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

    public final void setMTeamNames(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTeamNames = r2;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    public final void setMYellowCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mYellowCardTypes = r2;
    }

    public final void setMYellowCardTypesEnable(int r1) {
        this.mYellowCardTypesEnable = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchProSettings3(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mGoalTypesEnable=" + this.mGoalTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mPlayerListEnable=" + this.mPlayerListEnable + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchProSettings3(int r7, @aa1 List<Integer> r8, @aa1 List<Integer> r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, @aa1 List<String> r17, @aa1 List<String> r18, @aa1 List<String> r19, @aa1 List<String> r20, @aa1 List<String> r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        Intrinsics.X0O(r8, "mPeriodTime");
        Intrinsics.X0O(r9, "mBreakTime");
        Intrinsics.X0O(r17, "mTeamNames");
        Intrinsics.X0O(r18, "mRefereeRole");
        Intrinsics.X0O(r19, "mGoalTypes");
        Intrinsics.X0O(r20, "mYellowCardTypes");
        Intrinsics.X0O(r21, "mRedCardTypes");
        this.mPeriods = r7;
        this.mPeriodTime = r8;
        this.mBreakTime = r9;
        this.mVibration = r10;
        this.mButtonType = r11;
        this.mHomeTeamColor = r12;
        this.mGuestTeamColor = r13;
        this.mGps = r14;
        this.mScreen = r15;
        this.mMatchView = r16;
        this.mTeamNames = r17;
        this.mRefereeRole = r18;
        this.mGoalTypes = r19;
        this.mYellowCardTypes = r20;
        this.mRedCardTypes = r21;
        this.mGoalTypesEnable = r22;
        this.mYellowCardTypesEnable = r23;
        this.mRedCardTypesEnable = r24;
        this.mRingVolume = r25;
        this.mPeriodMode = r26;
        this.mPeriodReminder = r27;
        this.mPeriodReminderTime = r28;
        this.mPlayerListEnable = r29;
    }

    public /* synthetic */ BleMatchProSettings3(int r25, List r26, List r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, List r35, List r36, List r37, List r38, List r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, DefaultConstructorMarker r49) {
        if ((r48 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r48 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r48 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r48 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r48 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r48 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r48 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r48 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r48 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r48 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r48 & 1024) == 0) goto L45;
        List r12 = new ArrayList();
    L47:
        if ((r48 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r48 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r48 & 8192) == 0) goto L57;
        List r15 = new ArrayList();
    L59:
        if ((r48 & 16384) == 0) goto L61;
        List r2 = new ArrayList();
    L63:
        if ((r48 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r48 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r48 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r48 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r48 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r48 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r48 & 2097152) == 0) goto L89;
        int r22 = 0;
    L91:
        if ((r48 & 4194304) == 0) goto L94;
        int r410 = 0;
    L95:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r410);
        return;
    L94:
        r410 = r47;
        goto L95
    L89:
        r22 = r46;
        goto L91
    L85:
        r21 = r45;
        goto L87
    L81:
        r20 = r44;
        goto L83
    L77:
        r19 = r43;
        goto L79
    L73:
        r18 = r42;
        goto L75
    L69:
        r17 = r41;
        goto L71
    L65:
        r16 = r40;
        goto L67
    L61:
        r2 = r39;
        goto L63
    L57:
        r15 = r38;
        goto L59
    L53:
        r14 = r37;
        goto L55
    L49:
        r13 = r36;
        goto L51
    L45:
        r12 = r35;
        goto L47
    L41:
        r11 = r34;
        goto L43
    L37:
        r10 = r33;
        goto L39
    L33:
        r9 = r32;
        goto L35
    L29:
        r8 = r31;
        goto L31
    L25:
        r7 = r30;
        goto L27
    L21:
        r6 = r29;
        goto L23
    L17:
        r5 = r28;
        goto L19
    L13:
        r4 = r27;
        goto L15
    L9:
        r3 = r26;
        goto L11
    L5:
        r1 = r25;
        goto L7
    }
}
