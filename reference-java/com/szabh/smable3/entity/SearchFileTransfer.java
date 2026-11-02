package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteBuffer;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchFileTransfer {

    @aa1
    private String mFilePath;
    private int mRetain;

    @aa1
    private String mSearchType;
    private int mType;

    public SearchFileTransfer() {
        this(0, 0, null, null, 15, null);
    }

    public static /* synthetic */ SearchFileTransfer copy$default(SearchFileTransfer searchFileTransfer, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = searchFileTransfer.mRetain;
        }
        if ((i3 & 2) != 0) {
            i2 = searchFileTransfer.mType;
        }
        if ((i3 & 4) != 0) {
            str = searchFileTransfer.mSearchType;
        }
        if ((i3 & 8) != 0) {
            str2 = searchFileTransfer.mFilePath;
        }
        return searchFileTransfer.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.mRetain;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final String component3() {
        return this.mSearchType;
    }

    @aa1
    public final String component4() {
        return this.mFilePath;
    }

    @aa1
    public final SearchFileTransfer copy(int i, int i2, @aa1 String mSearchType, @aa1 String mFilePath) {
        Intrinsics.X0O(mSearchType, "mSearchType");
        Intrinsics.X0O(mFilePath, "mFilePath");
        return new SearchFileTransfer(i, i2, mSearchType, mFilePath);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFileTransfer)) {
            return false;
        }
        SearchFileTransfer searchFileTransfer = (SearchFileTransfer) obj;
        return this.mRetain == searchFileTransfer.mRetain && this.mType == searchFileTransfer.mType && Intrinsics.XOO0ii0(this.mSearchType, searchFileTransfer.mSearchType) && Intrinsics.XOO0ii0(this.mFilePath, searchFileTransfer.mFilePath);
    }

    @aa1
    public final String getMFilePath() {
        return this.mFilePath;
    }

    public final int getMRetain() {
        return this.mRetain;
    }

    @aa1
    public final String getMSearchType() {
        return this.mSearchType;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mRetain) * 31) + Integer.hashCode(this.mType)) * 31) + this.mSearchType.hashCode()) * 31) + this.mFilePath.hashCode();
    }

    public final void setMFilePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFilePath = str;
    }

    public final void setMRetain(int i) {
        this.mRetain = i;
    }

    public final void setMSearchType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSearchType = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] bytes = this.mFilePath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 10);
        for (int i = 0; i < 4; i++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.put((byte) this.mType);
        byte[] bytes2 = StringsKt__StringsKt.iX1X1(this.mSearchType).toString().getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        byteBufferAllocate.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(ArraysKt___ArraysJvmKt.iO0iiOi(bytes2, (byte) 0), 4)));
        byteBufferAllocate.put((byte) bytes.length);
        byteBufferAllocate.put(bytes);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.O10IXXX0X(bArrArray, "array(...)");
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "SearchFileTransfer(mSearchType = " + this.mSearchType + ", mType = " + this.mType + " , mFilePath = " + this.mFilePath + HexStringBuilder.COMMENT_END_CHAR;
    }

    public SearchFileTransfer(int i, int i2, @aa1 String mSearchType, @aa1 String mFilePath) {
        Intrinsics.X0O(mSearchType, "mSearchType");
        Intrinsics.X0O(mFilePath, "mFilePath");
        this.mRetain = i;
        this.mType = i2;
        this.mSearchType = mSearchType;
        this.mFilePath = mFilePath;
    }

    public /* synthetic */ SearchFileTransfer(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2);
    }
}
