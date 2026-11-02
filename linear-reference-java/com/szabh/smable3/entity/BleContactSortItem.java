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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;

    @aa1
    private String mCat;
    private int mSize;

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
    public BleContactSortItem() {
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleContactSortItem copy$default(BleContactSortItem r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mCat;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mSize;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.mCat;
    }

    public final int component2() {
        return this.mSize;
    }

    @aa1
    public final BleContactSortItem copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mCat");
        return new BleContactSortItem(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeStringWithFix(this.mCat, 2, Charsets.O00);
        int r0 = this.mSize;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleContactSortItem) == true) goto L8;
        return false;
    L8:
        BleContactSortItem r6 = (BleContactSortItem) r5;
        if (Intrinsics.XOO0ii0(this.mCat, r6.mCat) == true) goto L12;
        return false;
    L12:
        if (this.mSize == r6.mSize) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMCat(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCat = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    @aa1
    public String toString() {
        return "BleContactSortItem(mCat=" + this.mCat + ", mSize=" + this.mSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleContactSortItem(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mCat");
        this.mCat = r2;
        this.mSize = r3;
    }

    public /* synthetic */ BleContactSortItem(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
