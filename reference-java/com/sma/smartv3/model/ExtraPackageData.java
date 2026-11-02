package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtraPackageData extends JsonFieldContainer {
    private long createTime;

    @aa1
    private String fileName;
    private int fileSize;

    @aa1
    private String fileUrl;

    @aa1
    private String firmwareVersion;

    /* JADX INFO: renamed from: id */
    private int f51309id;

    @aa1
    private String info;
    private int type;

    @aa1
    private String version;

    public ExtraPackageData() {
        this(0, null, 0, null, null, 0, null, null, 0L, 511, null);
    }

    public static /* synthetic */ ExtraPackageData copy$default(ExtraPackageData extraPackageData, int i, String str, int i2, String str2, String str3, int i3, String str4, String str5, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = extraPackageData.f51309id;
        }
        if ((i4 & 2) != 0) {
            str = extraPackageData.firmwareVersion;
        }
        if ((i4 & 4) != 0) {
            i2 = extraPackageData.type;
        }
        if ((i4 & 8) != 0) {
            str2 = extraPackageData.version;
        }
        if ((i4 & 16) != 0) {
            str3 = extraPackageData.fileName;
        }
        if ((i4 & 32) != 0) {
            i3 = extraPackageData.fileSize;
        }
        if ((i4 & 64) != 0) {
            str4 = extraPackageData.fileUrl;
        }
        if ((i4 & 128) != 0) {
            str5 = extraPackageData.info;
        }
        if ((i4 & 256) != 0) {
            j = extraPackageData.createTime;
        }
        long j2 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i5 = i3;
        return extraPackageData.copy(i, str, i2, str2, str8, i5, str6, str7, j2);
    }

    public final int component1() {
        return this.f51309id;
    }

    @aa1
    public final String component2() {
        return this.firmwareVersion;
    }

    public final int component3() {
        return this.type;
    }

    @aa1
    public final String component4() {
        return this.version;
    }

    @aa1
    public final String component5() {
        return this.fileName;
    }

    public final int component6() {
        return this.fileSize;
    }

    @aa1
    public final String component7() {
        return this.fileUrl;
    }

    @aa1
    public final String component8() {
        return this.info;
    }

    public final long component9() {
        return this.createTime;
    }

    @aa1
    public final ExtraPackageData copy(int i, @aa1 String firmwareVersion, int i2, @aa1 String version, @aa1 String fileName, int i3, @aa1 String fileUrl, @aa1 String info, long j) {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(info, "info");
        return new ExtraPackageData(i, firmwareVersion, i2, version, fileName, i3, fileUrl, info, j);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraPackageData)) {
            return false;
        }
        ExtraPackageData extraPackageData = (ExtraPackageData) obj;
        return this.f51309id == extraPackageData.f51309id && Intrinsics.XOO0ii0(this.firmwareVersion, extraPackageData.firmwareVersion) && this.type == extraPackageData.type && Intrinsics.XOO0ii0(this.version, extraPackageData.version) && Intrinsics.XOO0ii0(this.fileName, extraPackageData.fileName) && this.fileSize == extraPackageData.fileSize && Intrinsics.XOO0ii0(this.fileUrl, extraPackageData.fileUrl) && Intrinsics.XOO0ii0(this.info, extraPackageData.info) && this.createTime == extraPackageData.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @aa1
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @aa1
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @aa1
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final int getId() {
        return this.f51309id;
    }

    @aa1
    public final String getInfo() {
        return this.info;
    }

    public final int getType() {
        return this.type;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f51309id) * 31) + this.firmwareVersion.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.version.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31) + this.fileUrl.hashCode()) * 31) + this.info.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFileSize(int i) {
        this.fileSize = i;
    }

    public final void setFileUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setFirmwareVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.firmwareVersion = str;
    }

    public final void setId(int i) {
        this.f51309id = i;
    }

    public final void setInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.info = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "ExtraPackageData(id=" + this.f51309id + ", firmwareVersion=" + this.firmwareVersion + ", type=" + this.type + ", version=" + this.version + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileUrl=" + this.fileUrl + ", info=" + this.info + ", createTime=" + this.createTime + I000IiI1O.C2156iO.f1007iO;
    }

    public ExtraPackageData(int i, @aa1 String firmwareVersion, int i2, @aa1 String version, @aa1 String fileName, int i3, @aa1 String fileUrl, @aa1 String info, long j) {
        Intrinsics.X0O(firmwareVersion, "firmwareVersion");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(info, "info");
        this.f51309id = i;
        this.firmwareVersion = firmwareVersion;
        this.type = i2;
        this.version = version;
        this.fileName = fileName;
        this.fileSize = i3;
        this.fileUrl = fileUrl;
        this.info = info;
        this.createTime = j;
    }

    public /* synthetic */ ExtraPackageData(int i, String str, int i2, String str2, String str3, int i3, String str4, String str5, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? 0L : j);
    }
}
