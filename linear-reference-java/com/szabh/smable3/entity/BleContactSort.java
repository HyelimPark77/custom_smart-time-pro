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
@SourceDebugExtension({"SMAP\nBleContactSort.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleContactSort.kt\ncom/szabh/smable3/entity/BleContactSort\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1869#2,2:62\n*S KotlinDebug\n*F\n+ 1 BleContactSort.kt\ncom/szabh/smable3/entity/BleContactSort\n*L\n44#1:62,2\n*E\n"})
public final class BleContactSort extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int SORT_TYPE_0 = 0;
    public static final int SORT_TYPE_1 = 1;

    @aa1
    private List<BleContactSortItem> mSortItems;
    private int mSortType;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleContactSort() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleContactSort copy$default(BleContactSort r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mSortType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mSortItems;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mSortType;
    }

    @aa1
    public final List<BleContactSortItem> component2() {
        return this.mSortItems;
    }

    @aa1
    public final BleContactSort copy(int r2, @aa1 List<BleContactSortItem> r3) {
        Intrinsics.X0O(r3, "mSortItems");
        return new BleContactSort(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mSortType);
        BleWritable.writeBytes$default(this, new byte[7], null, 2, null);
        ArrayList r0 = new ArrayList();
        Iterator<T> r1 = this.mSortItems.iterator();
        int r2 = 0;
    L4:
        if (r1.hasNext() == false) goto L6;
        BleContactSortItem r3 = (BleContactSortItem) r1.next();
        r0.add(new BleContactSortItem(r3.getMCat(), r2));
        r2 = r2 + r3.getMSize();
        goto L4
    L6:
        writeList(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleContactSort) == true) goto L8;
        return false;
    L8:
        BleContactSort r6 = (BleContactSort) r5;
        if (this.mSortType == r6.mSortType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mSortItems, r6.mSortItems) == true) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMSortItems(@aa1 List<BleContactSortItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSortItems = r2;
    }

    public final void setMSortType(int r1) {
        this.mSortType = r1;
    }

    @aa1
    public String toString() {
        return "BleContactSort(mSortType=" + this.mSortType + ", mSortItems=" + this.mSortItems + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleContactSort(int r2, @aa1 List<BleContactSortItem> r3) {
        Intrinsics.X0O(r3, "mSortItems");
        this.mSortType = r2;
        this.mSortItems = r3;
    }

    public /* synthetic */ BleContactSort(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
