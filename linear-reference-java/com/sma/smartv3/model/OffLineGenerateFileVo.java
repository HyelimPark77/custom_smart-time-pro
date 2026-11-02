package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OffLineGenerateFileVo {

    @aa1
    private final String compressedSize;

    @aa1
    private final String downloadUrl;

    @aa1
    private final String md5;

    @aa1
    private final String uncompressedSize;

    public OffLineGenerateFileVo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ OffLineGenerateFileVo copy$default(OffLineGenerateFileVo r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.md5;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.downloadUrl;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.uncompressedSize;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.compressedSize;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.md5;
    }

    @aa1
    public final String component2() {
        return this.downloadUrl;
    }

    @aa1
    public final String component3() {
        return this.uncompressedSize;
    }

    @aa1
    public final String component4() {
        return this.compressedSize;
    }

    @aa1
    public final OffLineGenerateFileVo copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "md5");
        Intrinsics.X0O(r3, "downloadUrl");
        Intrinsics.X0O(r4, "uncompressedSize");
        Intrinsics.X0O(r5, "compressedSize");
        return new OffLineGenerateFileVo(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OffLineGenerateFileVo) == true) goto L8;
        return false;
    L8:
        OffLineGenerateFileVo r6 = (OffLineGenerateFileVo) r5;
        if (Intrinsics.XOO0ii0(this.md5, r6.md5) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.downloadUrl, r6.downloadUrl) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.uncompressedSize, r6.uncompressedSize) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.compressedSize, r6.compressedSize) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getCompressedSize() {
        return this.compressedSize;
    }

    @aa1
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @aa1
    public final String getMd5() {
        return this.md5;
    }

    @aa1
    public final String getUncompressedSize() {
        return this.uncompressedSize;
    }

    public int hashCode() {
        return (((((this.md5.hashCode() * 31) + this.downloadUrl.hashCode()) * 31) + this.uncompressedSize.hashCode()) * 31) + this.compressedSize.hashCode();
    }

    @aa1
    public String toString() {
        return "OffLineGenerateFileVo(md5=" + this.md5 + ", downloadUrl=" + this.downloadUrl + ", uncompressedSize=" + this.uncompressedSize + ", compressedSize=" + this.compressedSize + I000IiI1O.iO.iO;
    }

    public OffLineGenerateFileVo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "md5");
        Intrinsics.X0O(r3, "downloadUrl");
        Intrinsics.X0O(r4, "uncompressedSize");
        Intrinsics.X0O(r5, "compressedSize");
        this.md5 = r2;
        this.downloadUrl = r3;
        this.uncompressedSize = r4;
        this.compressedSize = r5;
    }

    public /* synthetic */ OffLineGenerateFileVo(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
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
