package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleDeviceLanguages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDeviceLanguages.kt\ncom/szabh/smable3/entity/BleDeviceLanguages\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n11571#2:27\n11906#2,3:28\n1563#3:31\n1634#3,3:32\n*S KotlinDebug\n*F\n+ 1 BleDeviceLanguages.kt\ncom/szabh/smable3/entity/BleDeviceLanguages\n*L\n19#1:27\n19#1:28,3\n23#1:31\n23#1:32,3\n*E\n"})
public final class BleDeviceLanguages extends BleReadable {
    private int mCode;

    @aa1
    private List<Integer> mList;
    private int mSize;

    public BleDeviceLanguages() {
        int r1 = 0;
        int r2 = 0;
        List r3 = null;
        this(r1, r2, r3, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceLanguages copy$default(BleDeviceLanguages r0, int r1, int r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mCode;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mSize;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mList;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mCode;
    }

    public final int component2() {
        return this.mSize;
    }

    @aa1
    public final List<Integer> component3() {
        return this.mList;
    }

    @aa1
    public final BleDeviceLanguages copy(int r2, int r3, @aa1 List<Integer> r4) {
        Intrinsics.X0O(r4, "mList");
        return new BleDeviceLanguages(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCode = readInt8();
        readBytes(4);
        byte r0 = readInt8();
        this.mSize = r0;
        byte[] r1 = readBytes(r0);
        ArrayList r2 = new ArrayList(r1.length);
        int r3 = r1.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        r2.add(Integer.valueOf(r1[r4]));
        r4 = r4 + 1;
        goto L3
    L5:
        this.mList = r2;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceLanguages) == true) goto L8;
        return false;
    L8:
        BleDeviceLanguages r6 = (BleDeviceLanguages) r5;
        if (this.mCode == r6.mCode) goto L12;
        return false;
    L12:
        if (this.mSize == r6.mSize) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMCode() {
        return this.mCode;
    }

    @aa1
    public final List<Integer> getMList() {
        return this.mList;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mCode) * 31) + Integer.hashCode(this.mSize)) * 31) + this.mList.hashCode();
    }

    public final void setMCode(int r1) {
        this.mCode = r1;
    }

    public final void setMList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleDeviceLanguages(mCode=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mSize=");
        r0.append(this.mSize);
        r0.append(", mList=");
        List<Integer> r3 = this.mList;
        ArrayList r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        int r6 = ((Number) r4.next()).intValue();
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r8 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(r6)}, 1));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        r5.add(r8);
        goto L4
    L6:
        r0.append(r5);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleDeviceLanguages(int r2, int r3, @aa1 List<Integer> r4) {
        Intrinsics.X0O(r4, "mList");
        this.mCode = r2;
        this.mSize = r3;
        this.mList = r4;
    }

    public /* synthetic */ BleDeviceLanguages(int r2, int r3, List r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = CollectionsKt__CollectionsKt.iI();
    L11:
        this(r2, r3, r4);
    }
}
