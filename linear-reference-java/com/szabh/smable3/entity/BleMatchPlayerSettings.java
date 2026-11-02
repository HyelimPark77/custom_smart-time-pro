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
@SourceDebugExtension({"SMAP\nBleMatchPlayerSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchPlayerSettings.kt\ncom/szabh/smable3/entity/BleMatchPlayerSettings\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1869#2,2:26\n*S KotlinDebug\n*F\n+ 1 BleMatchPlayerSettings.kt\ncom/szabh/smable3/entity/BleMatchPlayerSettings\n*L\n20#1:26,2\n*E\n"})
public final class BleMatchPlayerSettings extends BleWritable {
    private int mMatchSetType;

    @aa1
    private List<BleMatchPlayer> mPlayerList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleMatchPlayerSettings() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchPlayerSettings copy$default(BleMatchPlayerSettings r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMatchSetType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mPlayerList;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mMatchSetType;
    }

    @aa1
    public final List<BleMatchPlayer> component2() {
        return this.mPlayerList;
    }

    @aa1
    public final BleMatchPlayerSettings copy(int r2, @aa1 List<BleMatchPlayer> r3) {
        Intrinsics.X0O(r3, "mPlayerList");
        return new BleMatchPlayerSettings(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMatchSetType);
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
        if ((r5 instanceof BleMatchPlayerSettings) == true) goto L8;
        return false;
    L8:
        BleMatchPlayerSettings r6 = (BleMatchPlayerSettings) r5;
        if (this.mMatchSetType == r6.mMatchSetType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPlayerList, r6.mPlayerList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mPlayerList.size() * 28) + 2;
    }

    public final int getMMatchSetType() {
        return this.mMatchSetType;
    }

    @aa1
    public final List<BleMatchPlayer> getMPlayerList() {
        return this.mPlayerList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mMatchSetType) * 31) + this.mPlayerList.hashCode();
    }

    public final void setMMatchSetType(int r1) {
        this.mMatchSetType = r1;
    }

    public final void setMPlayerList(@aa1 List<BleMatchPlayer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlayerList = r2;
    }

    @aa1
    public String toString() {
        return "BleMatchPlayerSettings(mMatchSetType=" + this.mMatchSetType + ", mPlayerList=" + this.mPlayerList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchPlayerSettings(int r2, @aa1 List<BleMatchPlayer> r3) {
        Intrinsics.X0O(r3, "mPlayerList");
        this.mMatchSetType = r2;
        this.mPlayerList = r3;
    }

    public /* synthetic */ BleMatchPlayerSettings(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 4;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
