package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleContactSortItem extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;

    @aa1
    private String mCat;
    private int mSize;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleContactSortItem() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleContactSortItem copy$default(BleContactSortItem bleContactSortItem, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleContactSortItem.mCat;
        }
        if ((i2 & 2) != 0) {
            i = bleContactSortItem.mSize;
        }
        return bleContactSortItem.copy(str, i);
    }

    @aa1
    public final String component1() {
        return this.mCat;
    }

    public final int component2() {
        return this.mSize;
    }

    @aa1
    public final BleContactSortItem copy(@aa1 String mCat, int i) {
        Intrinsics.X0O(mCat, "mCat");
        return new BleContactSortItem(mCat, i);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeStringWithFix(this.mCat, 2, Charsets.O00);
        int i = this.mSize;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleContactSortItem)) {
            return false;
        }
        BleContactSortItem bleContactSortItem = (BleContactSortItem) obj;
        return Intrinsics.XOO0ii0(this.mCat, bleContactSortItem.mCat) && this.mSize == bleContactSortItem.mSize;
    }

    @aa1
    public final String getMCat() {
        return this.mCat;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public int hashCode() {
        return (this.mCat.hashCode() * 31) + Integer.hashCode(this.mSize);
    }

    public final void setMCat(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCat = str;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    @aa1
    public String toString() {
        return "BleContactSortItem(mCat=" + this.mCat + ", mSize=" + this.mSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleContactSortItem(@aa1 String mCat, int i) {
        Intrinsics.X0O(mCat, "mCat");
        this.mCat = mCat;
        this.mSize = i;
    }

    public /* synthetic */ BleContactSortItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
