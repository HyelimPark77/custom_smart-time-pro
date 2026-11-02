package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleQrcode2 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final byte[] getStream(@aa1 List<BleQrcode2> list) {
            Intrinsics.X0O(list, "list");
            if (list.isEmpty()) {
                return new byte[0];
            }
            byte[] bArr = new byte[list.size() * 512];
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                byte[] byteArray = ((BleQrcode2) obj).toByteArray();
                System.arraycopy(byteArray, 0, bArr, i * 512, byteArray.length);
                i = i2;
            }
            return bArr;
        }

        private Companion() {
        }
    }

    public BleQrcode2() {
        this(0, null, 0, null, 15, null);
    }

    public static /* synthetic */ BleQrcode2 copy$default(BleQrcode2 bleQrcode2, int i, String str, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleQrcode2.mId;
        }
        if ((i3 & 2) != 0) {
            str = bleQrcode2.mTitle;
        }
        if ((i3 & 4) != 0) {
            i2 = bleQrcode2.mWidth;
        }
        if ((i3 & 8) != 0) {
            bArr = bleQrcode2.mData;
        }
        return bleQrcode2.copy(i, str, i2, bArr);
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
    public final BleQrcode2 copy(int i, @aa1 String mTitle, int i2, @aa1 byte[] mData) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mData, "mData");
        return new BleQrcode2(i, mTitle, i2, mData);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mId);
        BleWritable.writeStringWithFix$default(this, this.mTitle, 30, null, 4, null);
        writeInt8(this.mWidth);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleQrcode2)) {
            return false;
        }
        BleQrcode2 bleQrcode2 = (BleQrcode2) obj;
        return this.mId == bleQrcode2.mId && Intrinsics.XOO0ii0(this.mTitle, bleQrcode2.mTitle) && this.mWidth == bleQrcode2.mWidth && Intrinsics.XOO0ii0(this.mData, bleQrcode2.mData);
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

    public final void setMData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mData = bArr;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTitle = str;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    @aa1
    public String toString() {
        return "BleQrcode2(mId=" + this.mId + ", mTitle='" + this.mTitle + "', mWidth=" + this.mWidth + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleQrcode2(int i, @aa1 String mTitle, int i2, @aa1 byte[] mData) {
        Intrinsics.X0O(mTitle, "mTitle");
        Intrinsics.X0O(mData, "mData");
        this.mId = i;
        this.mTitle = mTitle;
        this.mWidth = i2;
        this.mData = mData;
    }

    public /* synthetic */ BleQrcode2(int i, String str, int i2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new byte[0] : bArr);
    }
}
