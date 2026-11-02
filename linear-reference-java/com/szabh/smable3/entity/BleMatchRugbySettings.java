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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchRugbySettings() {
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
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRugbySettings copy$default(BleMatchRugbySettings r17, int r18, List r19, List r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, List r28, List r29, List r30, List r31, List r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, Object r54) {
        if ((r52 & 1) == 0) goto L5;
        int r2 = r17.mPeriods;
    L7:
        if ((r52 & 2) == 0) goto L9;
        List r3 = r17.mPeriodTime;
    L11:
        if ((r52 & 4) == 0) goto L13;
        List r4 = r17.mBreakTime;
    L15:
        if ((r52 & 8) == 0) goto L17;
        int r5 = r17.mVibration;
    L19:
        if ((r52 & 16) == 0) goto L21;
        int r6 = r17.mButtonType;
    L23:
        if ((r52 & 32) == 0) goto L25;
        int r7 = r17.mHomeTeamColor;
    L27:
        if ((r52 & 64) == 0) goto L29;
        int r8 = r17.mGuestTeamColor;
    L31:
        if ((r52 & 128) == 0) goto L33;
        int r9 = r17.mGps;
    L35:
        if ((r52 & 256) == 0) goto L37;
        int r10 = r17.mScreen;
    L39:
        if ((r52 & 512) == 0) goto L41;
        int r11 = r17.mMatchView;
    L43:
        if ((r52 & 1024) == 0) goto L45;
        List r12 = r17.mTeamNames;
    L47:
        if ((r52 & 2048) == 0) goto L49;
        List r13 = r17.mRefereeRole;
    L51:
        if ((r52 & 4096) == 0) goto L53;
        List r14 = r17.mGoalTypes;
    L55:
        if ((r52 & 8192) == 0) goto L57;
        List r15 = r17.mYellowCardTypes;
    L58:
        int r110 = r2;
        if ((r52 & 16384) == 0) goto L61;
        List r16 = r17.mRedCardTypes;
    L63:
        if ((r52 & 32768) == 0) goto L65;
        int r1 = r17.mGoalTypesEnable;
    L66:
        int r111 = r1;
        if ((r52 & 65536) == 0) goto L69;
        int r55 = r17.mYellowCardTypesEnable;
    L70:
        int r210 = r55;
        if ((r52 & 131072) == 0) goto L73;
        int r56 = r17.mRedCardTypesEnable;
    L74:
        int r211 = r56;
        if ((r52 & 262144) == 0) goto L77;
        int r57 = r17.mRingVolume;
    L78:
        int r212 = r57;
        if ((r52 & 524288) == 0) goto L81;
        int r58 = r17.mPeriodMode;
    L82:
        int r213 = r58;
        if ((r52 & 1048576) == 0) goto L85;
        int r59 = r17.mPeriodReminder;
    L86:
        int r214 = r59;
        if ((r52 & 2097152) == 0) goto L89;
        int r60 = r17.mPeriodReminderTime;
    L90:
        int r215 = r60;
        if ((r52 & 4194304) == 0) goto L93;
        int r61 = r17.mPlayerListEnable;
    L94:
        int r216 = r61;
        if ((r52 & 8388608) == 0) goto L97;
        int r62 = r17.mRedCardTimer;
    L98:
        int r217 = r62;
        if ((r52 & 16777216) == 0) goto L101;
        int r63 = r17.mRedCardTime;
    L102:
        int r218 = r63;
        if ((r52 & 33554432) == 0) goto L105;
        int r64 = r17.mYellowCardTime;
    L106:
        int r219 = r64;
        if ((r52 & 67108864) == 0) goto L109;
        int r65 = r17.mInjuryTime;
    L110:
        int r310 = r65;
        if ((r52 & 134217728) == 0) goto L113;
        int r66 = r17.mAdditionalShotTime;
    L114:
        int r311 = r66;
        if ((r52 & 268435456) == 0) goto L117;
        int r67 = r17.mPenaltyTime;
    L118:
        int r312 = r67;
        if ((r52 & 536870912) == 0) goto L121;
        int r68 = r17.mTouchdownScore;
    L122:
        int r313 = r68;
        if ((r52 & 1073741824) == 0) goto L125;
        int r69 = r17.mAdditionalShotScore;
    L126:
        int r314 = r69;
        if ((r52 & Integer.MIN_VALUE) == 0) goto L129;
        int r70 = r17.mPenaltyKickScore;
    L130:
        int r315 = r70;
        if ((r53 & 1) == 0) goto L133;
        int r71 = r17.mThrowKickballScore;
    L135:
        if ((r53 & 2) == 0) goto L138;
        int r316 = r71;
        int r510 = r316;
        int r511 = r17.mPenaltyKickTouchdownScore;
    L140:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r310, r311, r312, r313, r314, r315, r510, r511);
    L138:
        r511 = r51;
        r510 = r71;
        goto L140
    L133:
        r71 = r50;
        goto L135
    L129:
        r70 = r49;
        goto L130
    L125:
        r69 = r48;
        goto L126
    L121:
        r68 = r47;
        goto L122
    L117:
        r67 = r46;
        goto L118
    L113:
        r66 = r45;
        goto L114
    L109:
        r65 = r44;
        goto L110
    L105:
        r64 = r43;
        goto L106
    L101:
        r63 = r42;
        goto L102
    L97:
        r62 = r41;
        goto L98
    L93:
        r61 = r40;
        goto L94
    L89:
        r60 = r39;
        goto L90
    L85:
        r59 = r38;
        goto L86
    L81:
        r58 = r37;
        goto L82
    L77:
        r57 = r36;
        goto L78
    L73:
        r56 = r35;
        goto L74
    L69:
        r55 = r34;
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
    public final BleMatchRugbySettings copy(int r37, @aa1 List<Integer> r38, @aa1 List<Integer> r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, @aa1 List<String> r47, @aa1 List<String> r48, @aa1 List<String> r49, @aa1 List<String> r50, @aa1 List<String> r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70) {
        Intrinsics.X0O(r38, "mPeriodTime");
        Intrinsics.X0O(r39, "mBreakTime");
        Intrinsics.X0O(r47, "mTeamNames");
        Intrinsics.X0O(r48, "mRefereeRole");
        Intrinsics.X0O(r49, "mGoalTypes");
        Intrinsics.X0O(r50, "mYellowCardTypes");
        Intrinsics.X0O(r51, "mRedCardTypes");
        return new BleMatchRugbySettings(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(12);
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
        writeInt8(this.mGps);
        writeInt8(this.mScreen);
        writeInt8(this.mMatchView);
        int r10 = 0;
    L23:
        String r11 = "";
        if (r10 >= 2) goto L31;
        List<String> r1 = this.mTeamNames;
        if (r10 < 0) goto L30;
        if (r10 >= r1.size()) goto L30;
        r11 = r1.get(r10);
    L30:
        BleWritable.writeStringWithFix$default(this, r11, 25, null, 4, null);
        r10 = r10 + 1;
        goto L23
    L31:
        int r12 = 0;
    L33:
        if (r12 >= 4) goto L41;
        List<String> r9 = this.mRefereeRole;
        if (r12 >= 0) goto L37;
    L39:
        String r13 = "";
    L40:
        BleWritable.writeStringWithFix$default(this, r13, 25, null, 4, null);
        r12 = r12 + 1;
        goto L33
    L37:
        if (r12 >= r9.size()) goto L39;
        r13 = r9.get(r12);
        goto L40
    L41:
        Iterator<T> r14 = this.mGoalTypes.iterator();
        int r15 = 0;
    L43:
        if (r14.hasNext() == false) goto L48;
        if (TextUtils.isEmpty((String) r14.next()) == true) goto L43;
        r15 = r15 + 1;
        goto L43
    L48:
        if (this.mGoalTypesEnable != 0) goto L51;
        r15 = 0;
    L51:
        writeInt8(r15);
        int r16 = 0;
    L52:
        if (r16 >= 8) goto L60;
        List<String> r17 = this.mGoalTypes;
        if (r16 >= 0) goto L56;
    L58:
        String r18 = "";
    L59:
        BleWritable.writeStringWithFix$default(this, r18, 25, null, 4, null);
        r16 = r16 + 1;
        goto L52
    L56:
        if (r16 >= r17.size()) goto L58;
        r18 = r17.get(r16);
        goto L59
    L60:
        Iterator<T> r19 = this.mYellowCardTypes.iterator();
        int r20 = 0;
    L62:
        if (r19.hasNext() == false) goto L67;
        if (TextUtils.isEmpty((String) r19.next()) == true) goto L62;
        r20 = r20 + 1;
        goto L62
    L67:
        if (this.mYellowCardTypesEnable != 0) goto L70;
        r20 = 0;
    L70:
        writeInt8(r20);
        int r21 = 0;
    L72:
        if (r21 >= 6) goto L80;
        List<String> r22 = this.mYellowCardTypes;
        if (r21 >= 0) goto L76;
    L78:
        String r23 = "";
    L79:
        BleWritable.writeStringWithFix$default(this, r23, 25, null, 4, null);
        r21 = r21 + 1;
        goto L72
    L76:
        if (r21 >= r22.size()) goto L78;
        r23 = r22.get(r21);
        goto L79
    L80:
        Iterator<T> r24 = this.mRedCardTypes.iterator();
        int r25 = 0;
    L82:
        if (r24.hasNext() == false) goto L87;
        if (TextUtils.isEmpty((String) r24.next()) == true) goto L82;
        r25 = r25 + 1;
        goto L82
    L87:
        if (this.mRedCardTypesEnable != 0) goto L90;
        r25 = 0;
    L90:
        writeInt8(r25);
    L91:
        if (r6 >= 6) goto L99;
        List<String> r26 = this.mRedCardTypes;
        if (r6 >= 0) goto L95;
    L97:
        String r27 = "";
    L98:
        BleWritable.writeStringWithFix$default(this, r27, 25, null, 4, null);
        r6 = r6 + 1;
        goto L91
    L95:
        if (r6 >= r26.size()) goto L97;
        r27 = r26.get(r6);
        goto L98
    L99:
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRugbySettings) == true) goto L8;
        return false;
    L8:
        BleMatchRugbySettings r6 = (BleMatchRugbySettings) r5;
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
        if (this.mPlayerListEnable == r6.mPlayerListEnable) goto L78;
        return false;
    L78:
        if (this.mRedCardTimer == r6.mRedCardTimer) goto L81;
        return false;
    L81:
        if (this.mRedCardTime == r6.mRedCardTime) goto L84;
        return false;
    L84:
        if (this.mYellowCardTime == r6.mYellowCardTime) goto L87;
        return false;
    L87:
        if (this.mInjuryTime == r6.mInjuryTime) goto L90;
        return false;
    L90:
        if (this.mAdditionalShotTime == r6.mAdditionalShotTime) goto L93;
        return false;
    L93:
        if (this.mPenaltyTime == r6.mPenaltyTime) goto L96;
        return false;
    L96:
        if (this.mTouchdownScore == r6.mTouchdownScore) goto L99;
        return false;
    L99:
        if (this.mAdditionalShotScore == r6.mAdditionalShotScore) goto L102;
        return false;
    L102:
        if (this.mPenaltyKickScore == r6.mPenaltyKickScore) goto L105;
        return false;
    L105:
        if (this.mThrowKickballScore == r6.mThrowKickballScore) goto L108;
        return false;
    L108:
        if (this.mPenaltyKickTouchdownScore == r6.mPenaltyKickTouchdownScore) goto L110;
        return false;
    L110:
        return true;
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

    public final void setMAdditionalShotScore(int r1) {
        this.mAdditionalShotScore = r1;
    }

    public final void setMAdditionalShotTime(int r1) {
        this.mAdditionalShotTime = r1;
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

    public final void setMInjuryTime(int r1) {
        this.mInjuryTime = r1;
    }

    public final void setMMatchView(int r1) {
        this.mMatchView = r1;
    }

    public final void setMPenaltyKickScore(int r1) {
        this.mPenaltyKickScore = r1;
    }

    public final void setMPenaltyKickTouchdownScore(int r1) {
        this.mPenaltyKickTouchdownScore = r1;
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

    public final void setMPlayerListEnable(int r1) {
        this.mPlayerListEnable = r1;
    }

    public final void setMRedCardTime(int r1) {
        this.mRedCardTime = r1;
    }

    public final void setMRedCardTimer(int r1) {
        this.mRedCardTimer = r1;
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

    public final void setMThrowKickballScore(int r1) {
        this.mThrowKickballScore = r1;
    }

    public final void setMTouchdownScore(int r1) {
        this.mTouchdownScore = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    public final void setMYellowCardTime(int r1) {
        this.mYellowCardTime = r1;
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
        return "BleMatchRugbySettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mGoalTypesEnable=" + this.mGoalTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mPlayerListEnable=" + this.mPlayerListEnable + ", mRedCardTimer=" + this.mRedCardTimer + ", mRedCardTime=" + this.mRedCardTime + ", mYellowCardTime=" + this.mYellowCardTime + ", mInjuryTime=" + this.mInjuryTime + ", mAdditionalShotTime=" + this.mAdditionalShotTime + ", mPenaltyTime=" + this.mPenaltyTime + ", mTouchdownScore=" + this.mTouchdownScore + ", mAdditionalShotScore=" + this.mAdditionalShotScore + ", mPenaltyKickScore=" + this.mPenaltyKickScore + ", mThrowKickballScore=" + this.mThrowKickballScore + ", mPenaltyKickTouchdownScore=" + this.mPenaltyKickTouchdownScore + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRugbySettings(int r7, @aa1 List<Integer> r8, @aa1 List<Integer> r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, @aa1 List<String> r17, @aa1 List<String> r18, @aa1 List<String> r19, @aa1 List<String> r20, @aa1 List<String> r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40) {
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
        this.mRedCardTimer = r30;
        this.mRedCardTime = r31;
        this.mYellowCardTime = r32;
        this.mInjuryTime = r33;
        this.mAdditionalShotTime = r34;
        this.mPenaltyTime = r35;
        this.mTouchdownScore = r36;
        this.mAdditionalShotScore = r37;
        this.mPenaltyKickScore = r38;
        this.mThrowKickballScore = r39;
        this.mPenaltyKickTouchdownScore = r40;
    }

    public /* synthetic */ BleMatchRugbySettings(int r35, List r36, List r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, List r45, List r46, List r47, List r48, List r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, DefaultConstructorMarker r71) {
        if ((r69 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r69 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r69 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r69 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r69 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r69 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r69 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r69 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r69 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r69 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r69 & 1024) == 0) goto L45;
        List r12 = new ArrayList();
    L47:
        if ((r69 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r69 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r69 & 8192) == 0) goto L57;
        List r15 = new ArrayList();
    L59:
        if ((r69 & 16384) == 0) goto L61;
        List r2 = new ArrayList();
    L63:
        if ((r69 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r69 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r69 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r69 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r69 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r69 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r69 & 2097152) == 0) goto L89;
        int r22 = 0;
    L91:
        if ((r69 & 4194304) == 0) goto L93;
        int r23 = 0;
    L95:
        if ((r69 & 8388608) == 0) goto L97;
        int r24 = 0;
    L99:
        if ((r69 & 16777216) == 0) goto L101;
        int r25 = 0;
    L103:
        if ((r69 & 33554432) == 0) goto L105;
        int r26 = 0;
    L107:
        if ((r69 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r69 & 134217728) == 0) goto L113;
        int r28 = 0;
    L115:
        if ((r69 & 268435456) == 0) goto L117;
        int r29 = 0;
    L119:
        if ((r69 & 536870912) == 0) goto L121;
        int r30 = 0;
    L123:
        if ((r69 & 1073741824) == 0) goto L125;
        int r31 = 0;
    L127:
        if ((r69 & Integer.MIN_VALUE) == 0) goto L129;
        int r0 = 0;
    L131:
        if ((r70 & 1) == 0) goto L133;
        int r32 = 0;
    L135:
        if ((r70 & 2) == 0) goto L138;
        int r610 = 0;
    L139:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r0, r32, r610);
        return;
    L138:
        r610 = r68;
        goto L139
    L133:
        r32 = r67;
        goto L135
    L129:
        r0 = r66;
        goto L131
    L125:
        r31 = r65;
        goto L127
    L121:
        r30 = r64;
        goto L123
    L117:
        r29 = r63;
        goto L119
    L113:
        r28 = r62;
        goto L115
    L109:
        r27 = r61;
        goto L111
    L105:
        r26 = r60;
        goto L107
    L101:
        r25 = r59;
        goto L103
    L97:
        r24 = r58;
        goto L99
    L93:
        r23 = r57;
        goto L95
    L89:
        r22 = r56;
        goto L91
    L85:
        r21 = r55;
        goto L87
    L81:
        r20 = r54;
        goto L83
    L77:
        r19 = r53;
        goto L79
    L73:
        r18 = r52;
        goto L75
    L69:
        r17 = r51;
        goto L71
    L65:
        r16 = r50;
        goto L67
    L61:
        r2 = r49;
        goto L63
    L57:
        r15 = r48;
        goto L59
    L53:
        r14 = r47;
        goto L55
    L49:
        r13 = r46;
        goto L51
    L45:
        r12 = r45;
        goto L47
    L41:
        r11 = r44;
        goto L43
    L37:
        r10 = r43;
        goto L39
    L33:
        r9 = r42;
        goto L35
    L29:
        r8 = r41;
        goto L31
    L25:
        r7 = r40;
        goto L27
    L21:
        r6 = r39;
        goto L23
    L17:
        r5 = r38;
        goto L19
    L13:
        r4 = r37;
        goto L15
    L9:
        r3 = r36;
        goto L11
    L5:
        r1 = r35;
        goto L7
    }
}
