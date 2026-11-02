package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchRecordTeam3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecordTeam3.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam3\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,113:1\n232#2,3:114\n222#2,15:117\n232#2,3:132\n222#2,15:135\n*S KotlinDebug\n*F\n+ 1 BleMatchRecordTeam3.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam3\n*L\n66#1:114,3\n66#1:117,15\n68#1:132,3\n68#1:135,15\n*E\n"})
public final class BleMatchRecordTeam3 extends BleReadable implements Serializable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2108;
    public static final int NAME_LENGTH = 25;
    private int mGoalTypeNumber;

    @aa1
    private List<String> mGoalTypes;

    @aa1
    private List<BleMatchRecordPlayer> mGuestPlayers;
    private int mGuestTeamColor;
    private int mGuestTeamNumber;

    @aa1
    private List<BleMatchRecordPlayer> mHomePlayers;
    private int mHomeTeamColor;
    private int mHomeTeamNumber;

    @aa1
    private List<String> mRedCardTypes;
    private int mRedTypeNumber;

    @aa1
    private List<String> mRefereeRoles;

    @aa1
    private List<String> mTeamNames;

    @aa1
    private List<String> mYellowCardTypes;

    @aa1
    private List<String> mYellowCardTypes2;
    private int mYellowTypeNumber;
    private int mYellowTypeNumber2;

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

    public BleMatchRecordTeam3() {
        List r1 = null;
        int r2 = 0;
        int r3 = 0;
        List r4 = null;
        List r5 = null;
        List r6 = null;
        List r7 = null;
        List r8 = null;
        List r9 = null;
        List r10 = null;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, 65535, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecordTeam3 copy$default(BleMatchRecordTeam3 r17, List r18, int r19, int r20, List r21, List r22, List r23, List r24, List r25, List r26, List r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, Object r35) {
        if ((r34 & 1) == 0) goto L5;
        List r2 = r17.mTeamNames;
    L7:
        if ((r34 & 2) == 0) goto L9;
        int r3 = r17.mHomeTeamColor;
    L11:
        if ((r34 & 4) == 0) goto L13;
        int r4 = r17.mGuestTeamColor;
    L15:
        if ((r34 & 8) == 0) goto L17;
        List r5 = r17.mRefereeRoles;
    L19:
        if ((r34 & 16) == 0) goto L21;
        List r6 = r17.mHomePlayers;
    L23:
        if ((r34 & 32) == 0) goto L25;
        List r7 = r17.mGuestPlayers;
    L27:
        if ((r34 & 64) == 0) goto L29;
        List r8 = r17.mGoalTypes;
    L31:
        if ((r34 & 128) == 0) goto L33;
        List r9 = r17.mYellowCardTypes;
    L35:
        if ((r34 & 256) == 0) goto L37;
        List r10 = r17.mRedCardTypes;
    L39:
        if ((r34 & 512) == 0) goto L41;
        List r11 = r17.mYellowCardTypes2;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        int r12 = r17.mHomeTeamNumber;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        int r13 = r17.mGuestTeamNumber;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        int r14 = r17.mGoalTypeNumber;
    L55:
        if ((r34 & 8192) == 0) goto L57;
        int r15 = r17.mYellowTypeNumber;
    L58:
        List r110 = r2;
        if ((r34 & 16384) == 0) goto L61;
        int r16 = r17.mRedTypeNumber;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        int r36 = r17.mYellowTypeNumber2;
    L68:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r36);
    L66:
        r36 = r33;
        goto L68
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

    @aa1
    public final List<String> component1() {
        return this.mTeamNames;
    }

    @aa1
    public final List<String> component10() {
        return this.mYellowCardTypes2;
    }

    public final int component11() {
        return this.mHomeTeamNumber;
    }

    public final int component12() {
        return this.mGuestTeamNumber;
    }

    public final int component13() {
        return this.mGoalTypeNumber;
    }

    public final int component14() {
        return this.mYellowTypeNumber;
    }

    public final int component15() {
        return this.mRedTypeNumber;
    }

    public final int component16() {
        return this.mYellowTypeNumber2;
    }

    public final int component2() {
        return this.mHomeTeamColor;
    }

    public final int component3() {
        return this.mGuestTeamColor;
    }

    @aa1
    public final List<String> component4() {
        return this.mRefereeRoles;
    }

    @aa1
    public final List<BleMatchRecordPlayer> component5() {
        return this.mHomePlayers;
    }

    @aa1
    public final List<BleMatchRecordPlayer> component6() {
        return this.mGuestPlayers;
    }

    @aa1
    public final List<String> component7() {
        return this.mGoalTypes;
    }

    @aa1
    public final List<String> component8() {
        return this.mYellowCardTypes;
    }

    @aa1
    public final List<String> component9() {
        return this.mRedCardTypes;
    }

    @aa1
    public final BleMatchRecordTeam3 copy(@aa1 List<String> r19, int r20, int r21, @aa1 List<String> r22, @aa1 List<BleMatchRecordPlayer> r23, @aa1 List<BleMatchRecordPlayer> r24, @aa1 List<String> r25, @aa1 List<String> r26, @aa1 List<String> r27, @aa1 List<String> r28, int r29, int r30, int r31, int r32, int r33, int r34) {
        Intrinsics.X0O(r19, "mTeamNames");
        Intrinsics.X0O(r22, "mRefereeRoles");
        Intrinsics.X0O(r23, "mHomePlayers");
        Intrinsics.X0O(r24, "mGuestPlayers");
        Intrinsics.X0O(r25, "mGoalTypes");
        Intrinsics.X0O(r26, "mYellowCardTypes");
        Intrinsics.X0O(r27, "mRedCardTypes");
        Intrinsics.X0O(r28, "mYellowCardTypes2");
        return new BleMatchRecordTeam3(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 2) goto L9;
        String r3 = BleReadable.readString$default(this, 25, null, 2, null);
        if (TextUtils.isEmpty(r3) == true) goto L8;
        r0.add(r3);
    L8:
        r2 = r2 + 1;
        goto L4
    L9:
        this.mTeamNames = r0;
        this.mHomeTeamColor = readInt8();
        this.mGuestTeamColor = readInt8();
        ArrayList r4 = new ArrayList();
        int r5 = 0;
    L11:
        if (r5 >= 4) goto L16;
        String r6 = BleReadable.readString$default(this, 25, null, 2, null);
        if (TextUtils.isEmpty(r6) == true) goto L15;
        r4.add(r6);
    L15:
        r5 = r5 + 1;
        goto L11
    L16:
        this.mRefereeRoles = r4;
        ArrayList r7 = new ArrayList();
        int r8 = 0;
    L18:
        if (r8 >= 25) goto L20;
        BleReadable r9 = (BleReadable) BleMatchRecordPlayer.class.newInstance();
        r9.setMBytes(readBytes(26));
        r9.decode();
        Intrinsics.XXI(r9);
        r7.add(r9);
        r8 = r8 + 1;
        goto L18
    L20:
        ArrayList r10 = new ArrayList();
        int r11 = 0;
    L21:
        if (r11 >= 25) goto L23;
        BleReadable r12 = (BleReadable) BleMatchRecordPlayer.class.newInstance();
        r12.setMBytes(readBytes(26));
        r12.decode();
        Intrinsics.XXI(r12);
        r10.add(r12);
        r11 = r11 + 1;
        goto L21
    L23:
        ArrayList r13 = new ArrayList();
        int r14 = 0;
    L25:
        if (r14 >= 8) goto L27;
        r13.add(BleReadable.readString$default(this, 25, null, 2, null));
        r14 = r14 + 1;
        goto L25
    L27:
        ArrayList r15 = new ArrayList();
        int r16 = 0;
    L29:
        if (r16 >= 6) goto L31;
        r15.add(BleReadable.readString$default(this, 25, null, 2, null));
        r16 = r16 + 1;
        goto L29
    L31:
        ArrayList r17 = new ArrayList();
        int r18 = 0;
    L32:
        if (r18 >= 6) goto L34;
        r17.add(BleReadable.readString$default(this, 25, null, 2, null));
        r18 = r18 + 1;
        goto L32
    L34:
        ArrayList r19 = new ArrayList();
    L35:
        if (r1 >= 6) goto L37;
        r19.add(BleReadable.readString$default(this, 25, null, 2, null));
        r1 = r1 + 1;
        goto L35
    L37:
        this.mHomePlayers = CollectionsKt___CollectionsKt.IO0OOi(r7, readInt8());
        this.mGuestPlayers = CollectionsKt___CollectionsKt.IO0OOi(r10, readInt8());
        this.mGoalTypes = CollectionsKt___CollectionsKt.IO0OOi(r13, readInt8());
        this.mYellowCardTypes = CollectionsKt___CollectionsKt.IO0OOi(r15, readInt8());
        this.mRedCardTypes = CollectionsKt___CollectionsKt.IO0OOi(r17, readInt8());
        this.mYellowCardTypes2 = CollectionsKt___CollectionsKt.IO0OOi(r19, readInt8());
        this.mHomeTeamNumber = readInt8();
        this.mGuestTeamNumber = readInt8();
        this.mGoalTypeNumber = readInt8();
        this.mYellowTypeNumber = readInt8();
        this.mRedTypeNumber = readInt8();
        this.mYellowTypeNumber2 = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRecordTeam3) == true) goto L8;
        return false;
    L8:
        BleMatchRecordTeam3 r6 = (BleMatchRecordTeam3) r5;
        if (Intrinsics.XOO0ii0(this.mTeamNames, r6.mTeamNames) == true) goto L12;
        return false;
    L12:
        if (this.mHomeTeamColor == r6.mHomeTeamColor) goto L15;
        return false;
    L15:
        if (this.mGuestTeamColor == r6.mGuestTeamColor) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mRefereeRoles, r6.mRefereeRoles) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mHomePlayers, r6.mHomePlayers) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mGuestPlayers, r6.mGuestPlayers) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mGoalTypes, r6.mGoalTypes) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mYellowCardTypes, r6.mYellowCardTypes) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mRedCardTypes, r6.mRedCardTypes) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mYellowCardTypes2, r6.mYellowCardTypes2) == true) goto L39;
        return false;
    L39:
        if (this.mHomeTeamNumber == r6.mHomeTeamNumber) goto L42;
        return false;
    L42:
        if (this.mGuestTeamNumber == r6.mGuestTeamNumber) goto L45;
        return false;
    L45:
        if (this.mGoalTypeNumber == r6.mGoalTypeNumber) goto L48;
        return false;
    L48:
        if (this.mYellowTypeNumber == r6.mYellowTypeNumber) goto L51;
        return false;
    L51:
        if (this.mRedTypeNumber == r6.mRedTypeNumber) goto L54;
        return false;
    L54:
        if (this.mYellowTypeNumber2 == r6.mYellowTypeNumber2) goto L56;
        return false;
    L56:
        return true;
    }

    public final int getMGoalTypeNumber() {
        return this.mGoalTypeNumber;
    }

    @aa1
    public final List<String> getMGoalTypes() {
        return this.mGoalTypes;
    }

    @aa1
    public final List<BleMatchRecordPlayer> getMGuestPlayers() {
        return this.mGuestPlayers;
    }

    public final int getMGuestTeamColor() {
        return this.mGuestTeamColor;
    }

    public final int getMGuestTeamNumber() {
        return this.mGuestTeamNumber;
    }

    @aa1
    public final List<BleMatchRecordPlayer> getMHomePlayers() {
        return this.mHomePlayers;
    }

    public final int getMHomeTeamColor() {
        return this.mHomeTeamColor;
    }

    public final int getMHomeTeamNumber() {
        return this.mHomeTeamNumber;
    }

    @aa1
    public final List<String> getMRedCardTypes() {
        return this.mRedCardTypes;
    }

    public final int getMRedTypeNumber() {
        return this.mRedTypeNumber;
    }

    @aa1
    public final List<String> getMRefereeRoles() {
        return this.mRefereeRoles;
    }

    @aa1
    public final List<String> getMTeamNames() {
        return this.mTeamNames;
    }

    @aa1
    public final List<String> getMYellowCardTypes() {
        return this.mYellowCardTypes;
    }

    @aa1
    public final List<String> getMYellowCardTypes2() {
        return this.mYellowCardTypes2;
    }

    public final int getMYellowTypeNumber() {
        return this.mYellowTypeNumber;
    }

    public final int getMYellowTypeNumber2() {
        return this.mYellowTypeNumber2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.mTeamNames.hashCode() * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + this.mRefereeRoles.hashCode()) * 31) + this.mHomePlayers.hashCode()) * 31) + this.mGuestPlayers.hashCode()) * 31) + this.mGoalTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode()) * 31) + this.mYellowCardTypes2.hashCode()) * 31) + Integer.hashCode(this.mHomeTeamNumber)) * 31) + Integer.hashCode(this.mGuestTeamNumber)) * 31) + Integer.hashCode(this.mGoalTypeNumber)) * 31) + Integer.hashCode(this.mYellowTypeNumber)) * 31) + Integer.hashCode(this.mRedTypeNumber)) * 31) + Integer.hashCode(this.mYellowTypeNumber2);
    }

    public final void setMGoalTypeNumber(int r1) {
        this.mGoalTypeNumber = r1;
    }

    public final void setMGoalTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGoalTypes = r2;
    }

    public final void setMGuestPlayers(@aa1 List<BleMatchRecordPlayer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGuestPlayers = r2;
    }

    public final void setMGuestTeamColor(int r1) {
        this.mGuestTeamColor = r1;
    }

    public final void setMGuestTeamNumber(int r1) {
        this.mGuestTeamNumber = r1;
    }

    public final void setMHomePlayers(@aa1 List<BleMatchRecordPlayer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHomePlayers = r2;
    }

    public final void setMHomeTeamColor(int r1) {
        this.mHomeTeamColor = r1;
    }

    public final void setMHomeTeamNumber(int r1) {
        this.mHomeTeamNumber = r1;
    }

    public final void setMRedCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRedCardTypes = r2;
    }

    public final void setMRedTypeNumber(int r1) {
        this.mRedTypeNumber = r1;
    }

    public final void setMRefereeRoles(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRefereeRoles = r2;
    }

    public final void setMTeamNames(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTeamNames = r2;
    }

    public final void setMYellowCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mYellowCardTypes = r2;
    }

    public final void setMYellowCardTypes2(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mYellowCardTypes2 = r2;
    }

    public final void setMYellowTypeNumber(int r1) {
        this.mYellowTypeNumber = r1;
    }

    public final void setMYellowTypeNumber2(int r1) {
        this.mYellowTypeNumber2 = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchRecordTeam3(mTeamNames=" + this.mTeamNames + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mRefereeRoles=" + this.mRefereeRoles + ", mHomePlayers=" + this.mHomePlayers + ", mGuestPlayers=" + this.mGuestPlayers + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mYellowCardTypes2=" + this.mYellowCardTypes2 + ", mHomeTeamNumber=" + this.mHomeTeamNumber + ", mGuestTeamNumber=" + this.mGuestTeamNumber + ", mGoalTypeNumber=" + this.mGoalTypeNumber + ", mYellowTypeNumber=" + this.mYellowTypeNumber + ", mRedTypeNumber=" + this.mRedTypeNumber + ", mYellowTypeNumber2=" + this.mYellowTypeNumber2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordTeam3(@aa1 List<String> r2, int r3, int r4, @aa1 List<String> r5, @aa1 List<BleMatchRecordPlayer> r6, @aa1 List<BleMatchRecordPlayer> r7, @aa1 List<String> r8, @aa1 List<String> r9, @aa1 List<String> r10, @aa1 List<String> r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        Intrinsics.X0O(r2, "mTeamNames");
        Intrinsics.X0O(r5, "mRefereeRoles");
        Intrinsics.X0O(r6, "mHomePlayers");
        Intrinsics.X0O(r7, "mGuestPlayers");
        Intrinsics.X0O(r8, "mGoalTypes");
        Intrinsics.X0O(r9, "mYellowCardTypes");
        Intrinsics.X0O(r10, "mRedCardTypes");
        Intrinsics.X0O(r11, "mYellowCardTypes2");
        this.mTeamNames = r2;
        this.mHomeTeamColor = r3;
        this.mGuestTeamColor = r4;
        this.mRefereeRoles = r5;
        this.mHomePlayers = r6;
        this.mGuestPlayers = r7;
        this.mGoalTypes = r8;
        this.mYellowCardTypes = r9;
        this.mRedCardTypes = r10;
        this.mYellowCardTypes2 = r11;
        this.mHomeTeamNumber = r12;
        this.mGuestTeamNumber = r13;
        this.mGoalTypeNumber = r14;
        this.mYellowTypeNumber = r15;
        this.mRedTypeNumber = r16;
        this.mYellowTypeNumber2 = r17;
    }

    public /* synthetic */ BleMatchRecordTeam3(List r18, int r19, int r20, List r21, List r22, List r23, List r24, List r25, List r26, List r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, DefaultConstructorMarker r35) {
        if ((r34 & 1) == 0) goto L5;
        List r1 = new ArrayList();
    L7:
        if ((r34 & 2) == 0) goto L9;
        int r2 = 0;
    L11:
        if ((r34 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r34 & 8) == 0) goto L17;
        List r5 = new ArrayList();
    L19:
        if ((r34 & 16) == 0) goto L21;
        List r6 = new ArrayList();
    L23:
        if ((r34 & 32) == 0) goto L25;
        List r7 = new ArrayList();
    L27:
        if ((r34 & 64) == 0) goto L29;
        List r8 = new ArrayList();
    L31:
        if ((r34 & 128) == 0) goto L33;
        List r9 = new ArrayList();
    L35:
        if ((r34 & 256) == 0) goto L37;
        List r10 = new ArrayList();
    L39:
        if ((r34 & 512) == 0) goto L41;
        List r11 = new ArrayList();
    L43:
        if ((r34 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r34 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r34 & 16384) == 0) goto L61;
        int r3 = 0;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        int r36 = 0;
    L67:
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r3, r36);
        return;
    L66:
        r36 = r33;
        goto L67
    L61:
        r3 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L59
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
        r2 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }

    public BleMatchRecordTeam3(@aa1 BleMatchRecordTeam r21) {
        Intrinsics.X0O(r21, "bleMatchRecordTeam");
        List r11 = null;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        this(r21.getMTeamNames(), r21.getMHomeTeamColor(), r21.getMGuestTeamColor(), r21.getMRefereeRoles(), r21.getMHomePlayers(), r21.getMGuestPlayers(), r21.getMGoalTypes(), r21.getMYellowCardTypes(), r21.getMRedCardTypes(), r11, r12, r13, r14, r15, r16, r17, 65024, null);
    }
}
