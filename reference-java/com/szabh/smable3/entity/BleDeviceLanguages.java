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
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceLanguages copy$default(BleDeviceLanguages bleDeviceLanguages, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleDeviceLanguages.mCode;
        }
        if ((i3 & 2) != 0) {
            i2 = bleDeviceLanguages.mSize;
        }
        if ((i3 & 4) != 0) {
            list = bleDeviceLanguages.mList;
        }
        return bleDeviceLanguages.copy(i, i2, list);
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
    public final BleDeviceLanguages copy(int i, int i2, @aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleDeviceLanguages(i, i2, mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCode = readInt8();
        readBytes(4);
        byte int8 = readInt8();
        this.mSize = int8;
        byte[] bytes = readBytes(int8);
        ArrayList arrayList = new ArrayList(bytes.length);
        for (byte b : bytes) {
            arrayList.add(Integer.valueOf(b));
        }
        this.mList = arrayList;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceLanguages)) {
            return false;
        }
        BleDeviceLanguages bleDeviceLanguages = (BleDeviceLanguages) obj;
        return this.mCode == bleDeviceLanguages.mCode && this.mSize == bleDeviceLanguages.mSize && Intrinsics.XOO0ii0(this.mList, bleDeviceLanguages.mList);
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

    public final void setMCode(int i) {
        this.mCode = i;
    }

    public final void setMList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleDeviceLanguages(mCode=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mSize=");
        sb.append(this.mSize);
        sb.append(", mList=");
        List<Integer> list = this.mList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            String str2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            arrayList.add(str2);
        }
        sb.append(arrayList);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleDeviceLanguages(int i, int i2, @aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mCode = i;
        this.mSize = i2;
        this.mList = mList;
    }

    public /* synthetic */ BleDeviceLanguages(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list);
    }
}
