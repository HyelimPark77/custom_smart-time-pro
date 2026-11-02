package com.szabh.smable3.entity;

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
@SourceDebugExtension({"SMAP\nBleMatchPlayerSettings3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchPlayerSettings3.kt\ncom/szabh/smable3/entity/BleMatchPlayerSettings3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1869#2,2:32\n*S KotlinDebug\n*F\n+ 1 BleMatchPlayerSettings3.kt\ncom/szabh/smable3/entity/BleMatchPlayerSettings3\n*L\n26#1:32,2\n*E\n"})
public final class BleMatchPlayerSettings3 extends BleWritable {
    private int mMatchSetType;

    @aa1
    private List<BleMatchPlayer> mPlayerList;
    private int mTeamType;
    private int mType;

    public BleMatchPlayerSettings3() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchPlayerSettings3 copy$default(BleMatchPlayerSettings3 bleMatchPlayerSettings3, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleMatchPlayerSettings3.mMatchSetType;
        }
        if ((i4 & 2) != 0) {
            i2 = bleMatchPlayerSettings3.mType;
        }
        if ((i4 & 4) != 0) {
            i3 = bleMatchPlayerSettings3.mTeamType;
        }
        if ((i4 & 8) != 0) {
            list = bleMatchPlayerSettings3.mPlayerList;
        }
        return bleMatchPlayerSettings3.copy(i, i2, i3, list);
    }

    public final int component1() {
        return this.mMatchSetType;
    }

    public final int component2() {
        return this.mType;
    }

    public final int component3() {
        return this.mTeamType;
    }

    @aa1
    public final List<BleMatchPlayer> component4() {
        return this.mPlayerList;
    }

    @aa1
    public final BleMatchPlayerSettings3 copy(int i, int i2, int i3, @aa1 List<BleMatchPlayer> mPlayerList) {
        Intrinsics.X0O(mPlayerList, "mPlayerList");
        return new BleMatchPlayerSettings3(i, i2, i3, mPlayerList);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMatchSetType);
        writeInt8(this.mType);
        writeInt8(this.mTeamType);
        writeInt8(this.mPlayerList.size());
        Iterator<T> it = this.mPlayerList.iterator();
        while (it.hasNext()) {
            writeObject((BleMatchPlayer) it.next());
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchPlayerSettings3)) {
            return false;
        }
        BleMatchPlayerSettings3 bleMatchPlayerSettings3 = (BleMatchPlayerSettings3) obj;
        return this.mMatchSetType == bleMatchPlayerSettings3.mMatchSetType && this.mType == bleMatchPlayerSettings3.mType && this.mTeamType == bleMatchPlayerSettings3.mTeamType && Intrinsics.XOO0ii0(this.mPlayerList, bleMatchPlayerSettings3.mPlayerList);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mPlayerList.size() * 28) + 4;
    }

    public final int getMMatchSetType() {
        return this.mMatchSetType;
    }

    @aa1
    public final List<BleMatchPlayer> getMPlayerList() {
        return this.mPlayerList;
    }

    public final int getMTeamType() {
        return this.mTeamType;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mMatchSetType) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mTeamType)) * 31) + this.mPlayerList.hashCode();
    }

    public final void setMMatchSetType(int i) {
        this.mMatchSetType = i;
    }

    public final void setMPlayerList(@aa1 List<BleMatchPlayer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPlayerList = list;
    }

    public final void setMTeamType(int i) {
        this.mTeamType = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleMatchPlayerSettings3(mMatchSetType=" + this.mMatchSetType + ", mType=" + this.mType + ", mTeamType=" + this.mTeamType + ", mPlayerList=" + this.mPlayerList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPlayerSettings3(int i, int i2, int i3, @aa1 List<BleMatchPlayer> mPlayerList) {
        Intrinsics.X0O(mPlayerList, "mPlayerList");
        this.mMatchSetType = i;
        this.mType = i2;
        this.mTeamType = i3;
        this.mPlayerList = mPlayerList;
    }

    public /* synthetic */ BleMatchPlayerSettings3(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 255 : i, (i4 & 2) != 0 ? 8 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list);
    }
}
