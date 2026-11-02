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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRecordTeam() {
        this(null, 0, 0, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecordTeam copy$default(BleMatchRecordTeam bleMatchRecordTeam, List list, int i, int i2, List list2, List list3, List list4, List list5, List list6, List list7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = bleMatchRecordTeam.mTeamNames;
        }
        if ((i3 & 2) != 0) {
            i = bleMatchRecordTeam.mHomeTeamColor;
        }
        if ((i3 & 4) != 0) {
            i2 = bleMatchRecordTeam.mGuestTeamColor;
        }
        if ((i3 & 8) != 0) {
            list2 = bleMatchRecordTeam.mRefereeRoles;
        }
        if ((i3 & 16) != 0) {
            list3 = bleMatchRecordTeam.mHomePlayers;
        }
        if ((i3 & 32) != 0) {
            list4 = bleMatchRecordTeam.mGuestPlayers;
        }
        if ((i3 & 64) != 0) {
            list5 = bleMatchRecordTeam.mGoalTypes;
        }
        if ((i3 & 128) != 0) {
            list6 = bleMatchRecordTeam.mYellowCardTypes;
        }
        if ((i3 & 256) != 0) {
            list7 = bleMatchRecordTeam.mRedCardTypes;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list4;
        List list11 = list5;
        List list12 = list3;
        int i4 = i2;
        return bleMatchRecordTeam.copy(list, i, i4, list2, list12, list10, list11, list8, list9);
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
    public final BleMatchRecordTeam copy(@aa1 List<String> mTeamNames, int i, int i2, @aa1 List<String> mRefereeRoles, @aa1 List<BleMatchRecordPlayer> mHomePlayers, @aa1 List<BleMatchRecordPlayer> mGuestPlayers, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes) {
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRoles, "mRefereeRoles");
        Intrinsics.X0O(mHomePlayers, "mHomePlayers");
        Intrinsics.X0O(mGuestPlayers, "mGuestPlayers");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        return new BleMatchRecordTeam(mTeamNames, i, i2, mRefereeRoles, mHomePlayers, mGuestPlayers, mGoalTypes, mYellowCardTypes, mRedCardTypes);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String string$default = BleReadable.readString$default(this, 25, null, 2, null);
            if (!TextUtils.isEmpty(string$default)) {
                arrayList.add(string$default);
            }
        }
        this.mTeamNames = arrayList;
        this.mHomeTeamColor = readInt8();
        this.mGuestTeamColor = readInt8();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            String string$default2 = BleReadable.readString$default(this, 25, null, 2, null);
            if (!TextUtils.isEmpty(string$default2)) {
                arrayList2.add(string$default2);
            }
        }
        this.mRefereeRoles = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < 25; i3++) {
            BleReadable bleReadable = (BleReadable) BleMatchRecordPlayer.class.newInstance();
            bleReadable.setMBytes(readBytes(26));
            bleReadable.decode();
            Intrinsics.XXI(bleReadable);
            arrayList3.add(bleReadable);
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < 25; i4++) {
            BleReadable bleReadable2 = (BleReadable) BleMatchRecordPlayer.class.newInstance();
            bleReadable2.setMBytes(readBytes(26));
            bleReadable2.decode();
            Intrinsics.XXI(bleReadable2);
            arrayList4.add(bleReadable2);
        }
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < 8; i5++) {
            arrayList5.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i6 = 0; i6 < 5; i6++) {
            arrayList6.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        ArrayList arrayList7 = new ArrayList();
        for (int i7 = 0; i7 < 5; i7++) {
            arrayList7.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        this.mHomePlayers = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, readInt8());
        this.mGuestPlayers = CollectionsKt___CollectionsKt.IO0OOi(arrayList4, readInt8());
        this.mGoalTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList5, readInt8());
        this.mYellowCardTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList6, readInt8());
        this.mRedCardTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList7, readInt8());
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecordTeam)) {
            return false;
        }
        BleMatchRecordTeam bleMatchRecordTeam = (BleMatchRecordTeam) obj;
        return Intrinsics.XOO0ii0(this.mTeamNames, bleMatchRecordTeam.mTeamNames) && this.mHomeTeamColor == bleMatchRecordTeam.mHomeTeamColor && this.mGuestTeamColor == bleMatchRecordTeam.mGuestTeamColor && Intrinsics.XOO0ii0(this.mRefereeRoles, bleMatchRecordTeam.mRefereeRoles) && Intrinsics.XOO0ii0(this.mHomePlayers, bleMatchRecordTeam.mHomePlayers) && Intrinsics.XOO0ii0(this.mGuestPlayers, bleMatchRecordTeam.mGuestPlayers) && Intrinsics.XOO0ii0(this.mGoalTypes, bleMatchRecordTeam.mGoalTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes, bleMatchRecordTeam.mYellowCardTypes) && Intrinsics.XOO0ii0(this.mRedCardTypes, bleMatchRecordTeam.mRedCardTypes);
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

    public final void setMGoalTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mGoalTypes = list;
    }

    public final void setMGuestPlayers(@aa1 List<BleMatchRecordPlayer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mGuestPlayers = list;
    }

    public final void setMGuestTeamColor(int i) {
        this.mGuestTeamColor = i;
    }

    public final void setMHomePlayers(@aa1 List<BleMatchRecordPlayer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHomePlayers = list;
    }

    public final void setMHomeTeamColor(int i) {
        this.mHomeTeamColor = i;
    }

    public final void setMRedCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRedCardTypes = list;
    }

    public final void setMRefereeRoles(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRefereeRoles = list;
    }

    public final void setMTeamNames(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mTeamNames = list;
    }

    public final void setMYellowCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes = list;
    }

    @aa1
    public String toString() {
        return "BleMatchRecordTeam(mTeamNames=" + this.mTeamNames + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mRefereeRoles=" + this.mRefereeRoles + ", mHomePlayers=" + this.mHomePlayers + ", mGuestPlayers=" + this.mGuestPlayers + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordTeam(@aa1 List<String> mTeamNames, int i, int i2, @aa1 List<String> mRefereeRoles, @aa1 List<BleMatchRecordPlayer> mHomePlayers, @aa1 List<BleMatchRecordPlayer> mGuestPlayers, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes) {
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRoles, "mRefereeRoles");
        Intrinsics.X0O(mHomePlayers, "mHomePlayers");
        Intrinsics.X0O(mGuestPlayers, "mGuestPlayers");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        this.mTeamNames = mTeamNames;
        this.mHomeTeamColor = i;
        this.mGuestTeamColor = i2;
        this.mRefereeRoles = mRefereeRoles;
        this.mHomePlayers = mHomePlayers;
        this.mGuestPlayers = mGuestPlayers;
        this.mGoalTypes = mGoalTypes;
        this.mYellowCardTypes = mYellowCardTypes;
        this.mRedCardTypes = mRedCardTypes;
    }

    public /* synthetic */ BleMatchRecordTeam(List list, int i, int i2, List list2, List list3, List list4, List list5, List list6, List list7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new ArrayList() : list2, (i3 & 16) != 0 ? new ArrayList() : list3, (i3 & 32) != 0 ? new ArrayList() : list4, (i3 & 64) != 0 ? new ArrayList() : list5, (i3 & 128) != 0 ? new ArrayList() : list6, (i3 & 256) != 0 ? new ArrayList() : list7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleMatchRecordTeam(@aa1 BleMatchRecordTeam3 bleMatchRecordTeam) {
        this(bleMatchRecordTeam.getMTeamNames(), bleMatchRecordTeam.getMHomeTeamColor(), bleMatchRecordTeam.getMGuestTeamColor(), bleMatchRecordTeam.getMRefereeRoles(), bleMatchRecordTeam.getMHomePlayers(), bleMatchRecordTeam.getMGuestPlayers(), bleMatchRecordTeam.getMGoalTypes(), bleMatchRecordTeam.getMYellowCardTypes(), bleMatchRecordTeam.getMRedCardTypes());
        Intrinsics.X0O(bleMatchRecordTeam, "bleMatchRecordTeam");
    }
}
