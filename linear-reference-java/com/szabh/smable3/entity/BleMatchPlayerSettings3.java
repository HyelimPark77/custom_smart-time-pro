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
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        List r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchPlayerSettings3 copy$default(BleMatchPlayerSettings3 r0, int r1, int r2, int r3, List r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mMatchSetType;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mTeamType;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mPlayerList;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleMatchPlayerSettings3 copy(int r2, int r3, int r4, @aa1 List<BleMatchPlayer> r5) {
        Intrinsics.X0O(r5, "mPlayerList");
        return new BleMatchPlayerSettings3(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMatchSetType);
        writeInt8(this.mType);
        writeInt8(this.mTeamType);
        writeInt8(this.mPlayerList.size());
        Iterator<T> r0 = this.mPlayerList.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        writeObject((BleMatchPlayer) r0.next());
        goto L4
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchPlayerSettings3) == true) goto L8;
        return false;
    L8:
        BleMatchPlayerSettings3 r6 = (BleMatchPlayerSettings3) r5;
        if (this.mMatchSetType == r6.mMatchSetType) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (this.mTeamType == r6.mTeamType) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mPlayerList, r6.mPlayerList) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMMatchSetType(int r1) {
        this.mMatchSetType = r1;
    }

    public final void setMPlayerList(@aa1 List<BleMatchPlayer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlayerList = r2;
    }

    public final void setMTeamType(int r1) {
        this.mTeamType = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchPlayerSettings3(mMatchSetType=" + this.mMatchSetType + ", mType=" + this.mType + ", mTeamType=" + this.mTeamType + ", mPlayerList=" + this.mPlayerList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPlayerSettings3(int r2, int r3, int r4, @aa1 List<BleMatchPlayer> r5) {
        Intrinsics.X0O(r5, "mPlayerList");
        this.mMatchSetType = r2;
        this.mType = r3;
        this.mTeamType = r4;
        this.mPlayerList = r5;
    }

    public /* synthetic */ BleMatchPlayerSettings3(int r2, int r3, int r4, List r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 255;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 8;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = new ArrayList();
    L14:
        this(r2, r3, r4, r5);
    }
}
