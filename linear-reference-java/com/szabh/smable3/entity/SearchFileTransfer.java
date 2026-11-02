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
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ SearchFileTransfer copy$default(SearchFileTransfer r0, int r1, int r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mRetain;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mSearchType;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mFilePath;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final SearchFileTransfer copy(int r2, int r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "mSearchType");
        Intrinsics.X0O(r5, "mFilePath");
        return new SearchFileTransfer(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchFileTransfer) == true) goto L8;
        return false;
    L8:
        SearchFileTransfer r6 = (SearchFileTransfer) r5;
        if (this.mRetain == r6.mRetain) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mSearchType, r6.mSearchType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFilePath, r6.mFilePath) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMFilePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFilePath = r2;
    }

    public final void setMRetain(int r1) {
        this.mRetain = r1;
    }

    public final void setMSearchType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSearchType = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        byte[] r0 = this.mFilePath.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        ByteBuffer r2 = ByteBuffer.allocate(r0.length + 10);
        int r4 = 0;
    L4:
        if (r4 >= 4) goto L6;
        r2.put((byte) 0);
        r4 = r4 + 1;
        goto L4
    L6:
        r2.put((byte) this.mType);
        byte[] r5 = StringsKt__StringsKt.iX1X1(this.mSearchType).toString().getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        r2.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(ArraysKt___ArraysJvmKt.iO0iiOi(r5, (byte) 0), 4)));
        r2.put((byte) r0.length);
        r2.put(r0);
        byte[] r1 = r2.array();
        Intrinsics.O10IXXX0X(r1, "array(...)");
        return r1;
    }

    @aa1
    public String toString() {
        return "SearchFileTransfer(mSearchType = " + this.mSearchType + ", mType = " + this.mType + " , mFilePath = " + this.mFilePath + HexStringBuilder.COMMENT_END_CHAR;
    }

    public SearchFileTransfer(int r2, int r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "mSearchType");
        Intrinsics.X0O(r5, "mFilePath");
        this.mRetain = r2;
        this.mType = r3;
        this.mSearchType = r4;
        this.mFilePath = r5;
    }

    public /* synthetic */ SearchFileTransfer(int r2, int r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
