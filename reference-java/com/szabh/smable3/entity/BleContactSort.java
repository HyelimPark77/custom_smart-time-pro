package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleContactSort.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleContactSort.kt\ncom/szabh/smable3/entity/BleContactSort\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1869#2,2:62\n*S KotlinDebug\n*F\n+ 1 BleContactSort.kt\ncom/szabh/smable3/entity/BleContactSort\n*L\n44#1:62,2\n*E\n"})
public final class BleContactSort extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int SORT_TYPE_0 = 0;
    public static final int SORT_TYPE_1 = 1;

    @aa1
    private List<BleContactSortItem> mSortItems;
    private int mSortType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleContactSort() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleContactSort copy$default(BleContactSort bleContactSort, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleContactSort.mSortType;
        }
        if ((i2 & 2) != 0) {
            list = bleContactSort.mSortItems;
        }
        return bleContactSort.copy(i, list);
    }

    public final int component1() {
        return this.mSortType;
    }

    @aa1
    public final List<BleContactSortItem> component2() {
        return this.mSortItems;
    }

    @aa1
    public final BleContactSort copy(int i, @aa1 List<BleContactSortItem> mSortItems) {
        Intrinsics.X0O(mSortItems, "mSortItems");
        return new BleContactSort(i, mSortItems);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mSortType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        ArrayList arrayList = new ArrayList();
        int mSize = 0;
        for (BleContactSortItem bleContactSortItem : this.mSortItems) {
            arrayList.add(new BleContactSortItem(bleContactSortItem.getMCat(), mSize));
            mSize += bleContactSortItem.getMSize();
        }
        writeList(arrayList);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleContactSort)) {
            return false;
        }
        BleContactSort bleContactSort = (BleContactSort) obj;
        return this.mSortType == bleContactSort.mSortType && Intrinsics.XOO0ii0(this.mSortItems, bleContactSort.mSortItems);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mSortItems.size() * 4) + 8;
    }

    @aa1
    public final List<BleContactSortItem> getMSortItems() {
        return this.mSortItems;
    }

    public final int getMSortType() {
        return this.mSortType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mSortType) * 31) + this.mSortItems.hashCode();
    }

    public final void setMSortItems(@aa1 List<BleContactSortItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mSortItems = list;
    }

    public final void setMSortType(int i) {
        this.mSortType = i;
    }

    @aa1
    public String toString() {
        return "BleContactSort(mSortType=" + this.mSortType + ", mSortItems=" + this.mSortItems + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleContactSort(int i, @aa1 List<BleContactSortItem> mSortItems) {
        Intrinsics.X0O(mSortItems, "mSortItems");
        this.mSortType = i;
        this.mSortItems = mSortItems;
    }

    public /* synthetic */ BleContactSort(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
