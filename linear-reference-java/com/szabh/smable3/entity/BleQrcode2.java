package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleQrcode2 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 512;
    public static final int TITLE_LENGTH = 30;

    @aa1
    private byte[] mData;
    private int mId;

    @aa1
    private String mTitle;
    private int mWidth;

    @SourceDebugExtension({"SMAP\nBleQrcode2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1878#2,3:50\n*S KotlinDebug\n*F\n+ 1 BleQrcode2.kt\ncom/szabh/smable3/entity/BleQrcode2$Companion\n*L\n40#1:50,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final byte[] getStream(@aa1 List<BleQrcode2> r7) {
            Intrinsics.X0O(r7, "list");
            if (r7.isEmpty() == true) goto L5;
            byte[] r0 = new byte[r7.size() * 512];
            Iterator<T> r8 = r7.iterator();
            int r2 = 0;
        L8:
            if (r8.hasNext() == false) goto L13;
            Object r3 = r8.next();
            int r4 = r2 + 1;
            if (r2 >= 0) goto L12;
            CollectionsKt__CollectionsKt.XOX0O0();
        L12:
            byte[] r5 = ((BleQrcode2) r3).toByteArray();
            System.arraycopy(r5, 0, r0, r2 * 512, r5.length);
            r2 = r4;
            goto L8
        L13:
            return r0;
        L5:
            return new byte[0];
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleQrcode2() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        byte[] r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleQrcode2 copy$default(BleQrcode2 r0, int r1, String r2, int r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mTitle;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mWidth;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mData;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component2() {
        return this.mTitle;
    }

    public final int component3() {
        return this.mWidth;
    }

    @aa1
    public final byte[] component4() {
        return this.mData;
    }

    @aa1
    public final BleQrcode2 copy(int r2, @aa1 String r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r3, "mTitle");
        Intrinsics.X0O(r5, "mData");
        return new BleQrcode2(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mId);
        BleWritable.writeStringWithFix$default(this, this.mTitle, 30, null, 4, null);
        writeInt8(this.mWidth);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleQrcode2) == true) goto L8;
        return false;
    L8:
        BleQrcode2 r6 = (BleQrcode2) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mTitle, r6.mTitle) == true) goto L15;
        return false;
    L15:
        if (this.mWidth == r6.mWidth) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mData, r6.mData) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    public final int getMId() {
        return this.mId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 512;
    }

    @aa1
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mId) * 31) + this.mTitle.hashCode()) * 31) + Integer.hashCode(this.mWidth)) * 31) + Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTitle = r2;
    }

    public final void setMWidth(int r1) {
        this.mWidth = r1;
    }

    @aa1
    public String toString() {
        return "BleQrcode2(mId=" + this.mId + ", mTitle='" + this.mTitle + "', mWidth=" + this.mWidth + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleQrcode2(int r2, @aa1 String r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r3, "mTitle");
        Intrinsics.X0O(r5, "mData");
        this.mId = r2;
        this.mTitle = r3;
        this.mWidth = r4;
        this.mData = r5;
    }

    public /* synthetic */ BleQrcode2(int r2, String r3, int r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = new byte[0];
    L14:
        this(r2, r3, r4, r5);
    }
}
