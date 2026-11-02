package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FirmwareVersion extends JsonFieldContainer implements Serializable {

    @aa1
    private String fileName;

    @aa1
    private String fileName2;
    private int fileSize;

    @aa1
    private String fileUrl;

    @aa1
    private String fileUrl2;
    private int flag;

    @aa1
    private String info;

    @aa1
    private String updateDesc;

    @aa1
    private String version;

    @aa1
    private String version2;

    public FirmwareVersion() {
        this(null, 0, null, null, null, 0, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ FirmwareVersion copy$default(FirmwareVersion firmwareVersion, String str, int i, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = firmwareVersion.fileName;
        }
        if ((i3 & 2) != 0) {
            i = firmwareVersion.fileSize;
        }
        if ((i3 & 4) != 0) {
            str2 = firmwareVersion.fileUrl;
        }
        if ((i3 & 8) != 0) {
            str3 = firmwareVersion.version;
        }
        if ((i3 & 16) != 0) {
            str4 = firmwareVersion.info;
        }
        if ((i3 & 32) != 0) {
            i2 = firmwareVersion.flag;
        }
        if ((i3 & 64) != 0) {
            str5 = firmwareVersion.fileName2;
        }
        if ((i3 & 128) != 0) {
            str6 = firmwareVersion.fileUrl2;
        }
        if ((i3 & 256) != 0) {
            str7 = firmwareVersion.version2;
        }
        if ((i3 & 512) != 0) {
            str8 = firmwareVersion.updateDesc;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        int i4 = i2;
        return firmwareVersion.copy(str, i, str2, str3, str13, i4, str11, str12, str9, str10);
    }

    @aa1
    public final String component1() {
        return this.fileName;
    }

    @aa1
    public final String component10() {
        return this.updateDesc;
    }

    public final int component2() {
        return this.fileSize;
    }

    @aa1
    public final String component3() {
        return this.fileUrl;
    }

    @aa1
    public final String component4() {
        return this.version;
    }

    @aa1
    public final String component5() {
        return this.info;
    }

    public final int component6() {
        return this.flag;
    }

    @aa1
    public final String component7() {
        return this.fileName2;
    }

    @aa1
    public final String component8() {
        return this.fileUrl2;
    }

    @aa1
    public final String component9() {
        return this.version2;
    }

    @aa1
    public final FirmwareVersion copy(@aa1 String fileName, int i, @aa1 String fileUrl, @aa1 String version, @aa1 String info, int i2, @aa1 String fileName2, @aa1 String fileUrl2, @aa1 String version2, @aa1 String updateDesc) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(fileName2, "fileName2");
        Intrinsics.X0O(fileUrl2, "fileUrl2");
        Intrinsics.X0O(version2, "version2");
        Intrinsics.X0O(updateDesc, "updateDesc");
        return new FirmwareVersion(fileName, i, fileUrl, version, info, i2, fileName2, fileUrl2, version2, updateDesc);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirmwareVersion)) {
            return false;
        }
        FirmwareVersion firmwareVersion = (FirmwareVersion) obj;
        return Intrinsics.XOO0ii0(this.fileName, firmwareVersion.fileName) && this.fileSize == firmwareVersion.fileSize && Intrinsics.XOO0ii0(this.fileUrl, firmwareVersion.fileUrl) && Intrinsics.XOO0ii0(this.version, firmwareVersion.version) && Intrinsics.XOO0ii0(this.info, firmwareVersion.info) && this.flag == firmwareVersion.flag && Intrinsics.XOO0ii0(this.fileName2, firmwareVersion.fileName2) && Intrinsics.XOO0ii0(this.fileUrl2, firmwareVersion.fileUrl2) && Intrinsics.XOO0ii0(this.version2, firmwareVersion.version2) && Intrinsics.XOO0ii0(this.updateDesc, firmwareVersion.updateDesc);
    }

    @aa1
    public final String getFileName() {
        return this.fileName;
    }

    @aa1
    public final String getFileName2() {
        return this.fileName2;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @aa1
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @aa1
    public final String getFileUrl2() {
        return this.fileUrl2;
    }

    public final int getFlag() {
        return this.flag;
    }

    @aa1
    public final String getInfo() {
        return this.info;
    }

    @aa1
    public final String getUpdateDesc() {
        return this.updateDesc;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    @aa1
    public final String getVersion2() {
        return this.version2;
    }

    public int hashCode() {
        return (((((((((((((((((this.fileName.hashCode() * 31) + Integer.hashCode(this.fileSize)) * 31) + this.fileUrl.hashCode()) * 31) + this.version.hashCode()) * 31) + this.info.hashCode()) * 31) + Integer.hashCode(this.flag)) * 31) + this.fileName2.hashCode()) * 31) + this.fileUrl2.hashCode()) * 31) + this.version2.hashCode()) * 31) + this.updateDesc.hashCode();
    }

    public final void setFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileName = str;
    }

    public final void setFileName2(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileName2 = str;
    }

    public final void setFileSize(int i) {
        this.fileSize = i;
    }

    public final void setFileUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setFileUrl2(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.fileUrl2 = str;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }

    public final void setInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.info = str;
    }

    public final void setUpdateDesc(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateDesc = str;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    public final void setVersion2(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version2 = str;
    }

    @aa1
    public String toString() {
        return "FirmwareVersion(fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileUrl=" + this.fileUrl + ", version=" + this.version + ", info=" + this.info + ", flag=" + this.flag + ", fileName2=" + this.fileName2 + ", fileUrl2=" + this.fileUrl2 + ", version2=" + this.version2 + ", updateDesc=" + this.updateDesc + I000IiI1O.C2156iO.f1007iO;
    }

    public FirmwareVersion(@aa1 String fileName, int i, @aa1 String fileUrl, @aa1 String version, @aa1 String info, int i2, @aa1 String fileName2, @aa1 String fileUrl2, @aa1 String version2, @aa1 String updateDesc) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(fileName2, "fileName2");
        Intrinsics.X0O(fileUrl2, "fileUrl2");
        Intrinsics.X0O(version2, "version2");
        Intrinsics.X0O(updateDesc, "updateDesc");
        this.fileName = fileName;
        this.fileSize = i;
        this.fileUrl = fileUrl;
        this.version = version;
        this.info = info;
        this.flag = i2;
        this.fileName2 = fileName2;
        this.fileUrl2 = fileUrl2;
        this.version2 = version2;
        this.updateDesc = updateDesc;
    }

    public /* synthetic */ FirmwareVersion(String str, int i, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8);
    }
}
