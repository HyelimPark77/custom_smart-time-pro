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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRecordTeam3() {
        this(null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 65535, null);
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
    public final BleMatchRecordTeam3 copy(@aa1 List<String> mTeamNames, int i, int i2, @aa1 List<String> mRefereeRoles, @aa1 List<BleMatchRecordPlayer> mHomePlayers, @aa1 List<BleMatchRecordPlayer> mGuestPlayers, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, @aa1 List<String> mYellowCardTypes2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRoles, "mRefereeRoles");
        Intrinsics.X0O(mHomePlayers, "mHomePlayers");
        Intrinsics.X0O(mGuestPlayers, "mGuestPlayers");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        Intrinsics.X0O(mYellowCardTypes2, "mYellowCardTypes2");
        return new BleMatchRecordTeam3(mTeamNames, i, i2, mRefereeRoles, mHomePlayers, mGuestPlayers, mGoalTypes, mYellowCardTypes, mRedCardTypes, mYellowCardTypes2, i3, i4, i5, i6, i7, i8);
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
        for (int i6 = 0; i6 < 6; i6++) {
            arrayList6.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        ArrayList arrayList7 = new ArrayList();
        for (int i7 = 0; i7 < 6; i7++) {
            arrayList7.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        ArrayList arrayList8 = new ArrayList();
        for (int i8 = 0; i8 < 6; i8++) {
            arrayList8.add(BleReadable.readString$default(this, 25, null, 2, null));
        }
        this.mHomePlayers = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, readInt8());
        this.mGuestPlayers = CollectionsKt___CollectionsKt.IO0OOi(arrayList4, readInt8());
        this.mGoalTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList5, readInt8());
        this.mYellowCardTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList6, readInt8());
        this.mRedCardTypes = CollectionsKt___CollectionsKt.IO0OOi(arrayList7, readInt8());
        this.mYellowCardTypes2 = CollectionsKt___CollectionsKt.IO0OOi(arrayList8, readInt8());
        this.mHomeTeamNumber = readInt8();
        this.mGuestTeamNumber = readInt8();
        this.mGoalTypeNumber = readInt8();
        this.mYellowTypeNumber = readInt8();
        this.mRedTypeNumber = readInt8();
        this.mYellowTypeNumber2 = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecordTeam3)) {
            return false;
        }
        BleMatchRecordTeam3 bleMatchRecordTeam3 = (BleMatchRecordTeam3) obj;
        return Intrinsics.XOO0ii0(this.mTeamNames, bleMatchRecordTeam3.mTeamNames) && this.mHomeTeamColor == bleMatchRecordTeam3.mHomeTeamColor && this.mGuestTeamColor == bleMatchRecordTeam3.mGuestTeamColor && Intrinsics.XOO0ii0(this.mRefereeRoles, bleMatchRecordTeam3.mRefereeRoles) && Intrinsics.XOO0ii0(this.mHomePlayers, bleMatchRecordTeam3.mHomePlayers) && Intrinsics.XOO0ii0(this.mGuestPlayers, bleMatchRecordTeam3.mGuestPlayers) && Intrinsics.XOO0ii0(this.mGoalTypes, bleMatchRecordTeam3.mGoalTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes, bleMatchRecordTeam3.mYellowCardTypes) && Intrinsics.XOO0ii0(this.mRedCardTypes, bleMatchRecordTeam3.mRedCardTypes) && Intrinsics.XOO0ii0(this.mYellowCardTypes2, bleMatchRecordTeam3.mYellowCardTypes2) && this.mHomeTeamNumber == bleMatchRecordTeam3.mHomeTeamNumber && this.mGuestTeamNumber == bleMatchRecordTeam3.mGuestTeamNumber && this.mGoalTypeNumber == bleMatchRecordTeam3.mGoalTypeNumber && this.mYellowTypeNumber == bleMatchRecordTeam3.mYellowTypeNumber && this.mRedTypeNumber == bleMatchRecordTeam3.mRedTypeNumber && this.mYellowTypeNumber2 == bleMatchRecordTeam3.mYellowTypeNumber2;
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

    public final void setMGoalTypeNumber(int i) {
        this.mGoalTypeNumber = i;
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

    public final void setMGuestTeamNumber(int i) {
        this.mGuestTeamNumber = i;
    }

    public final void setMHomePlayers(@aa1 List<BleMatchRecordPlayer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHomePlayers = list;
    }

    public final void setMHomeTeamColor(int i) {
        this.mHomeTeamColor = i;
    }

    public final void setMHomeTeamNumber(int i) {
        this.mHomeTeamNumber = i;
    }

    public final void setMRedCardTypes(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRedCardTypes = list;
    }

    public final void setMRedTypeNumber(int i) {
        this.mRedTypeNumber = i;
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

    public final void setMYellowCardTypes2(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mYellowCardTypes2 = list;
    }

    public final void setMYellowTypeNumber(int i) {
        this.mYellowTypeNumber = i;
    }

    public final void setMYellowTypeNumber2(int i) {
        this.mYellowTypeNumber2 = i;
    }

    @aa1
    public String toString() {
        return "BleMatchRecordTeam3(mTeamNames=" + this.mTeamNames + ", mHomeTeamColor=" + this.mHomeTeamColor + ", mGuestTeamColor=" + this.mGuestTeamColor + ", mRefereeRoles=" + this.mRefereeRoles + ", mHomePlayers=" + this.mHomePlayers + ", mGuestPlayers=" + this.mGuestPlayers + ", mGoalTypes=" + this.mGoalTypes + ", mYellowCardTypes=" + this.mYellowCardTypes + ", mRedCardTypes=" + this.mRedCardTypes + ", mYellowCardTypes2=" + this.mYellowCardTypes2 + ", mHomeTeamNumber=" + this.mHomeTeamNumber + ", mGuestTeamNumber=" + this.mGuestTeamNumber + ", mGoalTypeNumber=" + this.mGoalTypeNumber + ", mYellowTypeNumber=" + this.mYellowTypeNumber + ", mRedTypeNumber=" + this.mRedTypeNumber + ", mYellowTypeNumber2=" + this.mYellowTypeNumber2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordTeam3(@aa1 List<String> mTeamNames, int i, int i2, @aa1 List<String> mRefereeRoles, @aa1 List<BleMatchRecordPlayer> mHomePlayers, @aa1 List<BleMatchRecordPlayer> mGuestPlayers, @aa1 List<String> mGoalTypes, @aa1 List<String> mYellowCardTypes, @aa1 List<String> mRedCardTypes, @aa1 List<String> mYellowCardTypes2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.X0O(mTeamNames, "mTeamNames");
        Intrinsics.X0O(mRefereeRoles, "mRefereeRoles");
        Intrinsics.X0O(mHomePlayers, "mHomePlayers");
        Intrinsics.X0O(mGuestPlayers, "mGuestPlayers");
        Intrinsics.X0O(mGoalTypes, "mGoalTypes");
        Intrinsics.X0O(mYellowCardTypes, "mYellowCardTypes");
        Intrinsics.X0O(mRedCardTypes, "mRedCardTypes");
        Intrinsics.X0O(mYellowCardTypes2, "mYellowCardTypes2");
        this.mTeamNames = mTeamNames;
        this.mHomeTeamColor = i;
        this.mGuestTeamColor = i2;
        this.mRefereeRoles = mRefereeRoles;
        this.mHomePlayers = mHomePlayers;
        this.mGuestPlayers = mGuestPlayers;
        this.mGoalTypes = mGoalTypes;
        this.mYellowCardTypes = mYellowCardTypes;
        this.mRedCardTypes = mRedCardTypes;
        this.mYellowCardTypes2 = mYellowCardTypes2;
        this.mHomeTeamNumber = i3;
        this.mGuestTeamNumber = i4;
        this.mGoalTypeNumber = i5;
        this.mYellowTypeNumber = i6;
        this.mRedTypeNumber = i7;
        this.mYellowTypeNumber2 = i8;
    }

    public /* synthetic */ BleMatchRecordTeam3(List list, int i, int i2, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? new ArrayList() : list, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? new ArrayList() : list2, (i9 & 16) != 0 ? new ArrayList() : list3, (i9 & 32) != 0 ? new ArrayList() : list4, (i9 & 64) != 0 ? new ArrayList() : list5, (i9 & 128) != 0 ? new ArrayList() : list6, (i9 & 256) != 0 ? new ArrayList() : list7, (i9 & 512) != 0 ? new ArrayList() : list8, (i9 & 1024) != 0 ? 0 : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (i9 & 32768) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleMatchRecordTeam3(@aa1 BleMatchRecordTeam bleMatchRecordTeam) {
        this(bleMatchRecordTeam.getMTeamNames(), bleMatchRecordTeam.getMHomeTeamColor(), bleMatchRecordTeam.getMGuestTeamColor(), bleMatchRecordTeam.getMRefereeRoles(), bleMatchRecordTeam.getMHomePlayers(), bleMatchRecordTeam.getMGuestPlayers(), bleMatchRecordTeam.getMGoalTypes(), bleMatchRecordTeam.getMYellowCardTypes(), bleMatchRecordTeam.getMRedCardTypes(), null, 0, 0, 0, 0, 0, 0, 65024, null);
        Intrinsics.X0O(bleMatchRecordTeam, "bleMatchRecordTeam");
    }
}
