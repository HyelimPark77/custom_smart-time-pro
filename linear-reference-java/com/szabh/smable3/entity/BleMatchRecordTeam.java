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
@SourceDebugExtension({"SMAP\nBleMatchRecordTeam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,93:1\n232#2,3:94\n222#2,15:97\n232#2,3:112\n222#2,15:115\n*S KotlinDebug\n*F\n+ 1 BleMatchRecordTeam.kt\ncom/szabh/smable3/entity/BleMatchRecordTeam\n*L\n60#1:94,3\n60#1:97,15\n62#1:112,3\n62#1:115,15\n*E\n"})
public final class BleMatchRecordTeam extends BleReadable implements Serializable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 1908;
    public static final int NAME_LENGTH = 25;

    @aa1
    private List<String> mGoalTypes;

    @aa1
    private List<BleMatchRecordPlayer> mGuestPlayers;
    private int mGuestTeamColor;

    @aa1
    private List<BleMatchRecordPlayer> mHomePlayers;
    private int mHomeTeamColor;

    @aa1
    private List<String> mRedCardTypes;

    @aa1
    private List<String> mRefereeRoles;

    @aa1
    private List<String> mTeamNames;

    @aa1
    private List<String> mYellowCardTypes;

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

    public BleMatchRecordTeam() {
        List r1 = null;
        int r2 = 0;
        int r3 = 0;
        List r4 = null;
        List r5 = null;
        List r6 = null;
        List r7 = null;
        List r8 = null;
        List r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecordTeam copy$default(BleMatchRecordTeam r0, List r1, int r2, int r3, List r4, List r5, List r6, List r7, List r8, List r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mTeamNames;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mHomeTeamColor;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mGuestTeamColor;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mRefereeRoles;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mHomePlayers;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mGuestPlayers;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mGoalTypes;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mYellowCardTypes;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mRedCardTypes;
    L29:
        List r12 = r8;
        List r13 = r9;
        List r14 = r6;
        List r15 = r7;
        List r16 = r4;
        List r17 = r5;
        int r18 = r3;
        List r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    @aa1
    public final List<String> component1() {
        return this.mTeamNames;
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
    public final BleMatchRecordTeam copy(@aa1 List<String> r12, int r13, int r14, @aa1 List<String> r15, @aa1 List<BleMatchRecordPlayer> r16, @aa1 List<BleMatchRecordPlayer> r17, @aa1 List<String> r18, @aa1 List<String> r19, @aa1 List<String> r20) {
        Intrinsics.X0O(r12, "mTeamNames");
        Intrinsics.X0O(r15, "mRefereeRoles");
        Intrinsics.X0O(r16, "mHomePlayers");
        Intrinsics.X0O(r17, "mGuestPlayers");
        Intrinsics.X0O(r18, "mGoalTypes");
        Intrinsics.X0O(r19, "mYellowCardTypes");
        Intrinsics.X0O(r20, "mRedCardTypes");
        return new BleMatchRecordTeam(r12, r13, r14, r15, r16, r17, r18, r19, r20);
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
        if (r16 >= 5) goto L31;
        r15.add(BleReadable.readString$default(this, 25, null, 2, null));
        r16 = r16 + 1;
        goto L29
    L31:
        ArrayList r17 = new ArrayList();
    L32:
        if (r1 >= 5) goto L34;
        r17.add(BleReadable.readString$default(this, 25, null, 2, null));
        r1 = r1 + 1;
        goto L32
    L34:
        this.mHomePlayers = CollectionsKt___CollectionsKt.IO0OOi(r7, readInt8());
        this.mGuestPlayers = CollectionsKt___CollectionsKt.IO0OOi(r10, readInt8());
        this.mGoalTypes = CollectionsKt___CollectionsKt.IO0OOi(r13, readInt8());
        this.mYellowCardTypes = CollectionsKt___CollectionsKt.IO0OOi(r15, readInt8());
        this.mRedCardTypes = CollectionsKt___CollectionsKt.IO0OOi(r17, readInt8());
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRecordTeam) == true) goto L8;
        return false;
    L8:
        BleMatchRecordTeam r6 = (BleMatchRecordTeam) r5;
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
        if (Intrinsics.XOO0ii0(this.mRedCardTypes, r6.mRedCardTypes) == true) goto L35;
        return false;
    L35:
        return true;
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

    @aa1
    public final List<BleMatchRecordPlayer> getMHomePlayers() {
        return this.mHomePlayers;
    }

    public final int getMHomeTeamColor() {
        return this.mHomeTeamColor;
    }

    @aa1
    public final List<String> getMRedCardTypes() {
        return this.mRedCardTypes;
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

    public int hashCode() {
        return (((((((((((((((this.mTeamNames.hashCode() * 31) + Integer.hashCode(this.mHomeTeamColor)) * 31) + Integer.hashCode(this.mGuestTeamColor)) * 31) + this.mRefereeRoles.hashCode()) * 31) + this.mHomePlayers.hashCode()) * 31) + this.mGuestPlayers.hashCode()) * 31) + this.mGoalTypes.hashCode()) * 31) + this.mYellowCardTypes.hashCode()) * 31) + this.mRedCardTypes.hashCode();
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

    public final void setMHomePlayers(@aa1 List<BleMatchRecordPlayer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHomePlayers = r2;
    }

    public final void setMHomeTeamColor(int r1) {
        this.mHomeTeamColor = r1;
    }

    public final void setMRedCardTypes(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRedCardTypes = r2;
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

    @aa1
    public String toString() {
        return "BleMatchRecordTeam(mTeamNames=" + this.mTeamNames + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mRefereeRoles=" + this.mRefereeRoles + ", mHomePlayers=" + this.mHomePlayers + ", mGuestPlayers=" + this.mGuestPlayers + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordTeam(@aa1 List<String> r2, int r3, int r4, @aa1 List<String> r5, @aa1 List<BleMatchRecordPlayer> r6, @aa1 List<BleMatchRecordPlayer> r7, @aa1 List<String> r8, @aa1 List<String> r9, @aa1 List<String> r10) {
        Intrinsics.X0O(r2, "mTeamNames");
        Intrinsics.X0O(r5, "mRefereeRoles");
        Intrinsics.X0O(r6, "mHomePlayers");
        Intrinsics.X0O(r7, "mGuestPlayers");
        Intrinsics.X0O(r8, "mGoalTypes");
        Intrinsics.X0O(r9, "mYellowCardTypes");
        Intrinsics.X0O(r10, "mRedCardTypes");
        this.mTeamNames = r2;
        this.mHomeTeamColor = r3;
        this.mGuestTeamColor = r4;
        this.mRefereeRoles = r5;
        this.mHomePlayers = r6;
        this.mGuestPlayers = r7;
        this.mGoalTypes = r8;
        this.mYellowCardTypes = r9;
        this.mRedCardTypes = r10;
    }

    public /* synthetic */ BleMatchRecordTeam(List r2, int r3, int r4, List r5, List r6, List r7, List r8, List r9, List r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = new ArrayList();
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = new ArrayList();
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = new ArrayList();
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = new ArrayList();
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = new ArrayList();
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = new ArrayList();
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = new ArrayList();
    L29:
        List r13 = r9;
        List r14 = r10;
        List r15 = r7;
        List r16 = r8;
        List r17 = r6;
        int r18 = r4;
        List r19 = r2;
        this(r19, r3, r18, r5, r17, r15, r16, r13, r14);
    }

    public BleMatchRecordTeam(@aa1 BleMatchRecordTeam3 r12) {
        Intrinsics.X0O(r12, "bleMatchRecordTeam");
        this(r12.getMTeamNames(), r12.getMHomeTeamColor(), r12.getMGuestTeamColor(), r12.getMRefereeRoles(), r12.getMHomePlayers(), r12.getMGuestPlayers(), r12.getMGoalTypes(), r12.getMYellowCardTypes(), r12.getMRedCardTypes());
    }
}
