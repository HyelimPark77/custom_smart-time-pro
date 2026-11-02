package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ni;
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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchFieldHockeySettings() {
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
        List r16 = null;
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, ni.iOOX010X, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchFieldHockeySettings copy$default(BleMatchFieldHockeySettings r17, int r18, List r19, List r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, List r28, List r29, List r30, List r31, List r32, List r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, Object r47) {
        if ((r46 & 1) == 0) goto L5;
        int r2 = r17.mPeriods;
    L7:
        if ((r46 & 2) == 0) goto L9;
        List r3 = r17.mPeriodTime;
    L11:
        if ((r46 & 4) == 0) goto L13;
        List r4 = r17.mBreakTime;
    L15:
        if ((r46 & 8) == 0) goto L17;
        int r5 = r17.mVibration;
    L19:
        if ((r46 & 16) == 0) goto L21;
        int r6 = r17.mButtonType;
    L23:
        if ((r46 & 32) == 0) goto L25;
        int r7 = r17.mHomeTeamColor;
    L27:
        if ((r46 & 64) == 0) goto L29;
        int r8 = r17.mGuestTeamColor;
    L31:
        if ((r46 & 128) == 0) goto L33;
        int r9 = r17.mGps;
    L35:
        if ((r46 & 256) == 0) goto L37;
        int r10 = r17.mScreen;
    L39:
        if ((r46 & 512) == 0) goto L41;
        int r11 = r17.mMatchView;
    L43:
        if ((r46 & 1024) == 0) goto L45;
        List r12 = r17.mTeamNames;
    L47:
        if ((r46 & 2048) == 0) goto L49;
        List r13 = r17.mRefereeRole;
    L51:
        if ((r46 & 4096) == 0) goto L53;
        List r14 = r17.mGreenCardTypes;
    L55:
        if ((r46 & 8192) == 0) goto L57;
        List r15 = r17.mYellowCardTypes;
    L58:
        int r110 = r2;
        if ((r46 & 16384) == 0) goto L61;
        List r16 = r17.mRedCardTypes;
    L63:
        if ((r46 & 32768) == 0) goto L65;
        List r1 = r17.mYellowCardTypes2;
    L66:
        List r111 = r1;
        if ((r46 & 65536) == 0) goto L69;
        int r48 = r17.mGreenCardTypesEnable;
    L70:
        int r210 = r48;
        if ((r46 & 131072) == 0) goto L73;
        int r49 = r17.mYellowCardTypesEnable;
    L74:
        int r211 = r49;
        if ((r46 & 262144) == 0) goto L77;
        int r50 = r17.mYellowCardTypesEnable2;
    L78:
        int r212 = r50;
        if ((r46 & 524288) == 0) goto L81;
        int r51 = r17.mRedCardTypesEnable;
    L82:
        int r213 = r51;
        if ((r46 & 1048576) == 0) goto L85;
        int r52 = r17.mRingVolume;
    L86:
        int r214 = r52;
        if ((r46 & 2097152) == 0) goto L89;
        int r53 = r17.mPeriodMode;
    L90:
        int r215 = r53;
        if ((r46 & 4194304) == 0) goto L93;
        int r54 = r17.mPeriodReminder;
    L94:
        int r216 = r54;
        if ((r46 & 8388608) == 0) goto L97;
        int r55 = r17.mPeriodReminderTime;
    L98:
        int r217 = r55;
        if ((r46 & 16777216) == 0) goto L101;
        int r56 = r17.mPlayerListEnable;
    L102:
        int r218 = r56;
        if ((r46 & 33554432) == 0) goto L105;
        int r57 = r17.mGreenCardTime;
    L106:
        int r219 = r57;
        if ((r46 & 67108864) == 0) goto L109;
        int r58 = r17.mYellowCard1Time;
    L111:
        if ((r46 & 134217728) == 0) goto L114;
        int r310 = r58;
        int r410 = r310;
        int r411 = r17.mYellowCard2Time;
    L116:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r410, r411);
    L114:
        r411 = r45;
        r410 = r58;
        goto L116
    L109:
        r58 = r44;
        goto L111
    L105:
        r57 = r43;
        goto L106
    L101:
        r56 = r42;
        goto L102
    L97:
        r55 = r41;
        goto L98
    L93:
        r54 = r40;
        goto L94
    L89:
        r53 = r39;
        goto L90
    L85:
        r52 = r38;
        goto L86
    L81:
        r51 = r37;
        goto L82
    L77:
        r50 = r36;
        goto L78
    L73:
        r49 = r35;
        goto L74
    L69:
        r48 = r34;
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
    public final BleMatchFieldHockeySettings copy(int r31, @aa1 List<Integer> r32, @aa1 List<Integer> r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, @aa1 List<String> r41, @aa1 List<String> r42, @aa1 List<String> r43, @aa1 List<String> r44, @aa1 List<String> r45, @aa1 List<String> r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58) {
        Intrinsics.X0O(r32, "mPeriodTime");
        Intrinsics.X0O(r33, "mBreakTime");
        Intrinsics.X0O(r41, "mTeamNames");
        Intrinsics.X0O(r42, "mRefereeRole");
        Intrinsics.X0O(r43, "mGreenCardTypes");
        Intrinsics.X0O(r44, "mYellowCardTypes");
        Intrinsics.X0O(r45, "mRedCardTypes");
        Intrinsics.X0O(r46, "mYellowCardTypes2");
        return new BleMatchFieldHockeySettings(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(11);
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
        Iterator<T> r14 = this.mGreenCardTypes.iterator();
        int r15 = 0;
    L43:
        if (r14.hasNext() == false) goto L48;
        if (TextUtils.isEmpty((String) r14.next()) == true) goto L43;
        r15 = r15 + 1;
        goto L43
    L48:
        if (this.mGreenCardTypesEnable != 0) goto L51;
        r15 = 0;
    L51:
        writeInt8(r15);
        int r16 = 0;
    L52:
        if (r16 >= 8) goto L60;
        List<String> r17 = this.mGreenCardTypes;
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
        int r26 = 0;
    L91:
        if (r26 >= 6) goto L99;
        List<String> r27 = this.mRedCardTypes;
        if (r26 >= 0) goto L95;
    L97:
        String r28 = "";
    L98:
        BleWritable.writeStringWithFix$default(this, r28, 25, null, 4, null);
        r26 = r26 + 1;
        goto L91
    L95:
        if (r26 >= r27.size()) goto L97;
        r28 = r27.get(r26);
        goto L98
    L99:
        Iterator<T> r29 = this.mYellowCardTypes2.iterator();
        int r30 = 0;
    L101:
        if (r29.hasNext() == false) goto L106;
        if (TextUtils.isEmpty((String) r29.next()) == true) goto L101;
        r30 = r30 + 1;
        goto L101
    L106:
        if (this.mYellowCardTypesEnable2 != 0) goto L109;
        r30 = 0;
    L109:
        writeInt8(r30);
    L110:
        if (r6 >= 6) goto L118;
        List<String> r31 = this.mYellowCardTypes2;
        if (r6 >= 0) goto L114;
    L116:
        String r32 = "";
    L117:
        BleWritable.writeStringWithFix$default(this, r32, 25, null, 4, null);
        r6 = r6 + 1;
        goto L110
    L114:
        if (r6 >= r31.size()) goto L116;
        r32 = r31.get(r6);
        goto L117
    L118:
        writeInt8(this.mRingVolume);
        writeInt8(this.mPeriodMode);
        writeInt8(this.mPeriodReminder);
        BleWritable.writeInt16$default(this, this.mPeriodReminderTime, null, 2, null);
        writeInt8(this.mPlayerListEnable);
        BleWritable.writeInt16$default(this, this.mGreenCardTime, null, 2, null);
        BleWritable.writeInt16$default(this, this.mYellowCard1Time, null, 2, null);
        BleWritable.writeInt16$default(this, this.mYellowCard2Time, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchFieldHockeySettings) == true) goto L8;
        return false;
    L8:
        BleMatchFieldHockeySettings r6 = (BleMatchFieldHockeySettings) r5;
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
        if (Intrinsics.XOO0ii0(this.mGreenCardTypes, r6.mGreenCardTypes) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mYellowCardTypes, r6.mYellowCardTypes) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mRedCardTypes, r6.mRedCardTypes) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.mYellowCardTypes2, r6.mYellowCardTypes2) == true) goto L57;
        return false;
    L57:
        if (this.mGreenCardTypesEnable == r6.mGreenCardTypesEnable) goto L60;
        return false;
    L60:
        if (this.mYellowCardTypesEnable == r6.mYellowCardTypesEnable) goto L63;
        return false;
    L63:
        if (this.mYellowCardTypesEnable2 == r6.mYellowCardTypesEnable2) goto L66;
        return false;
    L66:
        if (this.mRedCardTypesEnable == r6.mRedCardTypesEnable) goto L69;
        return false;
    L69:
        if (this.mRingVolume == r6.mRingVolume) goto L72;
        return false;
    L72:
        if (this.mPeriodMode == r6.mPeriodMode) goto L75;
        return false;
    L75:
        if (this.mPeriodReminder == r6.mPeriodReminder) goto L78;
        return false;
    L78:
        if (this.mPeriodReminderTime == r6.mPeriodReminderTime) goto L81;
        return false;
    L81:
        if (this.mPlayerListEnable == r6.mPlayerListEnable) goto L84;
        return false;
    L84:
        if (this.mGreenCardTime == r6.mGreenCardTime) goto L87;
        return false;
    L87:
        if (this.mYellowCard1Time == r6.mYellowCard1Time) goto L90;
        return false;
    L90:
        if (this.mYellowCard2Time == r6.mYellowCard2Time) goto L92;
        return false;
    L92:
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

    public final void setMGreenCardTime(int r1) {
        this.mGreenCardTime = r1;
    }

    public final void setMGreenCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGreenCardTypes = r2;
    }

    public final void setMGreenCardTypesEnable(int r1) {
        this.mGreenCardTypesEnable = r1;
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

    public final void setMYellowCard1Time(int r1) {
        this.mYellowCard1Time = r1;
    }

    public final void setMYellowCard2Time(int r1) {
        this.mYellowCard2Time = r1;
    }

    public final void setMYellowCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mYellowCardTypes = r2;
    }

    public final void setMYellowCardTypes2(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mYellowCardTypes2 = r2;
    }

    public final void setMYellowCardTypesEnable(int r1) {
        this.mYellowCardTypesEnable = r1;
    }

    public final void setMYellowCardTypesEnable2(int r1) {
        this.mYellowCardTypesEnable2 = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchFieldHockeySettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGreenCardTypes=" + this.mGreenCardTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mYellowCardTypes2=" + this.mYellowCardTypes2 + ", mGreenCardTypesEnable=" + this.mGreenCardTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mYellowCardTypesEnable2=" + this.mYellowCardTypesEnable2 + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + ", mRingVolume=" + this.mRingVolume + ", mPeriodMode=" + this.mPeriodMode + ", mPeriodReminder=" + this.mPeriodReminder + ", mPeriodReminderTime=" + this.mPeriodReminderTime + ", mPlayerListEnable=" + this.mPlayerListEnable + ", mGreenCardTime=" + this.mGreenCardTime + ", mYellowCard1Time=" + this.mYellowCard1Time + ", mYellowCard2Time=" + this.mYellowCard2Time + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchFieldHockeySettings(int r8, @aa1 List<Integer> r9, @aa1 List<Integer> r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, @aa1 List<String> r18, @aa1 List<String> r19, @aa1 List<String> r20, @aa1 List<String> r21, @aa1 List<String> r22, @aa1 List<String> r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35) {
        Intrinsics.X0O(r9, "mPeriodTime");
        Intrinsics.X0O(r10, "mBreakTime");
        Intrinsics.X0O(r18, "mTeamNames");
        Intrinsics.X0O(r19, "mRefereeRole");
        Intrinsics.X0O(r20, "mGreenCardTypes");
        Intrinsics.X0O(r21, "mYellowCardTypes");
        Intrinsics.X0O(r22, "mRedCardTypes");
        Intrinsics.X0O(r23, "mYellowCardTypes2");
        this.mPeriods = r8;
        this.mPeriodTime = r9;
        this.mBreakTime = r10;
        this.mVibration = r11;
        this.mButtonType = r12;
        this.mHomeTeamColor = r13;
        this.mGuestTeamColor = r14;
        this.mGps = r15;
        this.mScreen = r16;
        this.mMatchView = r17;
        this.mTeamNames = r18;
        this.mRefereeRole = r19;
        this.mGreenCardTypes = r20;
        this.mYellowCardTypes = r21;
        this.mRedCardTypes = r22;
        this.mYellowCardTypes2 = r23;
        this.mGreenCardTypesEnable = r24;
        this.mYellowCardTypesEnable = r25;
        this.mYellowCardTypesEnable2 = r26;
        this.mRedCardTypesEnable = r27;
        this.mRingVolume = r28;
        this.mPeriodMode = r29;
        this.mPeriodReminder = r30;
        this.mPeriodReminderTime = r31;
        this.mPlayerListEnable = r32;
        this.mGreenCardTime = r33;
        this.mYellowCard1Time = r34;
        this.mYellowCard2Time = r35;
    }

    public /* synthetic */ BleMatchFieldHockeySettings(int r30, List r31, List r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, List r40, List r41, List r42, List r43, List r44, List r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, DefaultConstructorMarker r59) {
        if ((r58 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r58 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r58 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r58 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r58 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r58 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r58 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r58 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r58 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r58 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r58 & 1024) == 0) goto L45;
        List r12 = new ArrayList();
    L47:
        if ((r58 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r58 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r58 & 8192) == 0) goto L57;
        List r15 = new ArrayList();
    L59:
        if ((r58 & 16384) == 0) goto L61;
        List r2 = new ArrayList();
    L63:
        if ((r58 & 32768) == 0) goto L65;
        List r16 = new ArrayList();
    L67:
        if ((r58 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r58 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r58 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r58 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r58 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r58 & 2097152) == 0) goto L89;
        int r22 = 0;
    L91:
        if ((r58 & 4194304) == 0) goto L93;
        int r23 = 0;
    L95:
        if ((r58 & 8388608) == 0) goto L97;
        int r24 = 0;
    L99:
        if ((r58 & 16777216) == 0) goto L101;
        int r25 = 0;
    L103:
        if ((r58 & 33554432) == 0) goto L105;
        int r26 = 0;
    L107:
        if ((r58 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r58 & 134217728) == 0) goto L114;
        int r510 = 0;
    L115:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r510);
        return;
    L114:
        r510 = r57;
        goto L115
    L109:
        r27 = r56;
        goto L111
    L105:
        r26 = r55;
        goto L107
    L101:
        r25 = r54;
        goto L103
    L97:
        r24 = r53;
        goto L99
    L93:
        r23 = r52;
        goto L95
    L89:
        r22 = r51;
        goto L91
    L85:
        r21 = r50;
        goto L87
    L81:
        r20 = r49;
        goto L83
    L77:
        r19 = r48;
        goto L79
    L73:
        r18 = r47;
        goto L75
    L69:
        r17 = r46;
        goto L71
    L65:
        r16 = r45;
        goto L67
    L61:
        r2 = r44;
        goto L63
    L57:
        r15 = r43;
        goto L59
    L53:
        r14 = r42;
        goto L55
    L49:
        r13 = r41;
        goto L51
    L45:
        r12 = r40;
        goto L47
    L41:
        r11 = r39;
        goto L43
    L37:
        r10 = r38;
        goto L39
    L33:
        r9 = r37;
        goto L35
    L29:
        r8 = r36;
        goto L31
    L25:
        r7 = r35;
        goto L27
    L21:
        r6 = r34;
        goto L23
    L17:
        r5 = r33;
        goto L19
    L13:
        r4 = r32;
        goto L15
    L9:
        r3 = r31;
        goto L11
    L5:
        r1 = r30;
        goto L7
    }
}
