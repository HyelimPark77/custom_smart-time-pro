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
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OffLineGenerateFileVo copy$default(OffLineGenerateFileVo offLineGenerateFileVo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offLineGenerateFileVo.md5;
        }
        if ((i & 2) != 0) {
            str2 = offLineGenerateFileVo.downloadUrl;
        }
        if ((i & 4) != 0) {
            str3 = offLineGenerateFileVo.uncompressedSize;
        }
        if ((i & 8) != 0) {
            str4 = offLineGenerateFileVo.compressedSize;
        }
        return offLineGenerateFileVo.copy(str, str2, str3, str4);
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
    public final OffLineGenerateFileVo copy(@aa1 String md5, @aa1 String downloadUrl, @aa1 String uncompressedSize, @aa1 String compressedSize) {
        Intrinsics.X0O(md5, "md5");
        Intrinsics.X0O(downloadUrl, "downloadUrl");
        Intrinsics.X0O(uncompressedSize, "uncompressedSize");
        Intrinsics.X0O(compressedSize, "compressedSize");
        return new OffLineGenerateFileVo(md5, downloadUrl, uncompressedSize, compressedSize);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffLineGenerateFileVo)) {
            return false;
        }
        OffLineGenerateFileVo offLineGenerateFileVo = (OffLineGenerateFileVo) obj;
        return Intrinsics.XOO0ii0(this.md5, offLineGenerateFileVo.md5) && Intrinsics.XOO0ii0(this.downloadUrl, offLineGenerateFileVo.downloadUrl) && Intrinsics.XOO0ii0(this.uncompressedSize, offLineGenerateFileVo.uncompressedSize) && Intrinsics.XOO0ii0(this.compressedSize, offLineGenerateFileVo.compressedSize);
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
        return "OffLineGenerateFileVo(md5=" + this.md5 + ", downloadUrl=" + this.downloadUrl + ", uncompressedSize=" + this.uncompressedSize + ", compressedSize=" + this.compressedSize + I000IiI1O.C2156iO.f1007iO;
    }

    public OffLineGenerateFileVo(@aa1 String md5, @aa1 String downloadUrl, @aa1 String uncompressedSize, @aa1 String compressedSize) {
        Intrinsics.X0O(md5, "md5");
        Intrinsics.X0O(downloadUrl, "downloadUrl");
        Intrinsics.X0O(uncompressedSize, "uncompressedSize");
        Intrinsics.X0O(compressedSize, "compressedSize");
        this.md5 = md5;
        this.downloadUrl = downloadUrl;
        this.uncompressedSize = uncompressedSize;
        this.compressedSize = compressedSize;
    }

    public /* synthetic */ OffLineGenerateFileVo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
