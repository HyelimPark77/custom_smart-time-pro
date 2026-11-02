package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.p1;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchProSettings() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, p1.OXO1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchProSettings copy$default(BleMatchProSettings r17, int r18, List r19, List r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, List r28, List r29, List r30, List r31, List r32, int r33, int r34, int r35, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        int r2 = r17.mPeriods;
    L7:
        if ((r36 & 2) == 0) goto L9;
        List r3 = r17.mPeriodTime;
    L11:
        if ((r36 & 4) == 0) goto L13;
        List r4 = r17.mBreakTime;
    L15:
        if ((r36 & 8) == 0) goto L17;
        int r5 = r17.mVibration;
    L19:
        if ((r36 & 16) == 0) goto L21;
        int r6 = r17.mButtonType;
    L23:
        if ((r36 & 32) == 0) goto L25;
        int r7 = r17.mHomeTeamColor;
    L27:
        if ((r36 & 64) == 0) goto L29;
        int r8 = r17.mGuestTeamColor;
    L31:
        if ((r36 & 128) == 0) goto L33;
        int r9 = r17.mGps;
    L35:
        if ((r36 & 256) == 0) goto L37;
        int r10 = r17.mScreen;
    L39:
        if ((r36 & 512) == 0) goto L41;
        int r11 = r17.mMatchView;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        List r12 = r17.mTeamNames;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        List r13 = r17.mRefereeRole;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        List r14 = r17.mGoalTypes;
    L55:
        if ((r36 & 8192) == 0) goto L57;
        List r15 = r17.mYellowCardTypes;
    L58:
        int r110 = r2;
        if ((r36 & 16384) == 0) goto L61;
        List r16 = r17.mRedCardTypes;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        int r1 = r17.mGoalTypesEnable;
    L66:
        int r111 = r1;
        if ((r36 & 65536) == 0) goto L69;
        int r38 = r17.mYellowCardTypesEnable;
    L71:
        if ((r36 & 131072) == 0) goto L74;
        int r210 = r38;
        int r39 = r210;
        int r310 = r17.mRedCardTypesEnable;
    L76:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r39, r310);
    L74:
        r310 = r35;
        r39 = r38;
        goto L76
    L69:
        r38 = r34;
        goto L71
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
    public final BleMatchProSettings copy(int r21, @aa1 List<Integer> r22, @aa1 List<Integer> r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, @aa1 List<String> r31, @aa1 List<String> r32, @aa1 List<String> r33, @aa1 List<String> r34, @aa1 List<String> r35, int r36, int r37, int r38) {
        Intrinsics.X0O(r22, "mPeriodTime");
        Intrinsics.X0O(r23, "mBreakTime");
        Intrinsics.X0O(r31, "mTeamNames");
        Intrinsics.X0O(r32, "mRefereeRole");
        Intrinsics.X0O(r33, "mGoalTypes");
        Intrinsics.X0O(r34, "mYellowCardTypes");
        Intrinsics.X0O(r35, "mRedCardTypes");
        return new BleMatchProSettings(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(2);
        writeInt8(this.mPeriods);
        int r7 = 0;
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
        List<Integer> r6 = this.mBreakTime;
        if (r3 >= 0) goto L18;
    L20:
        Integer r8 = 0;
    L21:
        BleWritable.writeInt16$default(this, r8.intValue(), null, 2, null);
        r3 = r3 + 1;
        goto L14
    L18:
        if (r3 >= r6.size()) goto L20;
        r8 = r6.get(r3);
        goto L21
    L22:
        writeInt8(this.mVibration);
        writeInt8(this.mButtonType);
        writeInt8(this.mHomeTeamColor);
        writeInt8(this.mGuestTeamColor);
        writeInt8(this.mGps);
        writeInt8(this.mScreen);
        writeInt8(this.mMatchView);
        int r9 = 0;
    L23:
        String r10 = "";
        if (r9 >= 2) goto L31;
        List<String> r1 = this.mTeamNames;
        if (r9 < 0) goto L30;
        if (r9 >= r1.size()) goto L30;
        r10 = r1.get(r9);
    L30:
        BleWritable.writeStringWithFix$default(this, r10, 25, null, 4, null);
        r9 = r9 + 1;
        goto L23
    L31:
        int r11 = 0;
    L33:
        if (r11 >= 4) goto L41;
        List<String> r12 = this.mRefereeRole;
        if (r11 >= 0) goto L37;
    L39:
        String r13 = "";
    L40:
        BleWritable.writeStringWithFix$default(this, r13, 25, null, 4, null);
        r11 = r11 + 1;
        goto L33
    L37:
        if (r11 >= r12.size()) goto L39;
        r13 = r12.get(r11);
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
        if (r21 >= 5) goto L80;
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
        if (r7 >= 5) goto L99;
        List<String> r26 = this.mRedCardTypes;
        if (r7 >= 0) goto L95;
    L97:
        String r27 = "";
    L98:
        BleWritable.writeStringWithFix$default(this, r27, 25, null, 4, null);
        r7 = r7 + 1;
        goto L91
    L95:
        if (r7 >= r26.size()) goto L97;
        r27 = r26.get(r7);
        goto L98
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchProSettings) == true) goto L8;
        return false;
    L8:
        BleMatchProSettings r6 = (BleMatchProSettings) r5;
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
        if (this.mRedCardTypesEnable == r6.mRedCardTypesEnable) goto L62;
        return false;
    L62:
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

    public final void setMPeriodTime(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodTime = r2;
    }

    public final void setMPeriods(int r1) {
        this.mPeriods = r1;
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
        return "BleMatchProSettings(mPeriods=" + this.mPeriods + ", mPeriodTime=" + this.mPeriodTime + ", mBreakTime=" + this.mBreakTime + ", mVibration=" + this.mVibration + ", mButtonType=" + this.mButtonType + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mGps=" + this.mGps + ", mScreen=" + this.mScreen + ", mMatchView=" + this.mMatchView + ", mTeamNames=" + this.mTeamNames + ", mRefereeRole=" + this.mRefereeRole + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mGoalTypesEnable=" + this.mGoalTypesEnable + ", mYellowCardTypesEnable=" + this.mYellowCardTypesEnable + ", mRedCardTypesEnable=" + this.mRedCardTypesEnable + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchProSettings(int r7, @aa1 List<Integer> r8, @aa1 List<Integer> r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, @aa1 List<String> r17, @aa1 List<String> r18, @aa1 List<String> r19, @aa1 List<String> r20, @aa1 List<String> r21, int r22, int r23, int r24) {
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
    }

    public /* synthetic */ BleMatchProSettings(int r20, List r21, List r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, List r30, List r31, List r32, List r33, List r34, int r35, int r36, int r37, int r38, DefaultConstructorMarker r39) {
        if ((r38 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r38 & 2) == 0) goto L9;
        List r3 = new ArrayList();
    L11:
        if ((r38 & 4) == 0) goto L13;
        List r4 = new ArrayList();
    L15:
        if ((r38 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r38 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r38 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r38 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r38 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r38 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r38 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        List r12 = new ArrayList();
    L47:
        if ((r38 & 2048) == 0) goto L49;
        List r13 = new ArrayList();
    L51:
        if ((r38 & 4096) == 0) goto L53;
        List r14 = new ArrayList();
    L55:
        if ((r38 & 8192) == 0) goto L57;
        List r15 = new ArrayList();
    L59:
        if ((r38 & 16384) == 0) goto L61;
        List r2 = new ArrayList();
    L63:
        if ((r38 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r38 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r38 & 131072) == 0) goto L74;
        int r310 = 0;
    L75:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r310);
        return;
    L74:
        r310 = r37;
        goto L75
    L69:
        r17 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r2 = r34;
        goto L63
    L57:
        r15 = r33;
        goto L59
    L53:
        r14 = r32;
        goto L55
    L49:
        r13 = r31;
        goto L51
    L45:
        r12 = r30;
        goto L47
    L41:
        r11 = r29;
        goto L43
    L37:
        r10 = r28;
        goto L39
    L33:
        r9 = r27;
        goto L35
    L29:
        r8 = r26;
        goto L31
    L25:
        r7 = r25;
        goto L27
    L21:
        r6 = r24;
        goto L23
    L17:
        r5 = r23;
        goto L19
    L13:
        r4 = r22;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }
}
