package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoFile extends JsonFieldContainer implements Serializable {

    @aa1
    private final String businessId;

    @aa1
    private final String businessType;

    @aa1
    private final String fileName;

    @aa1
    private final String filePath;

    @aa1
    private final String fileSize;

    @aa1
    private final String fileType;

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f51326id;

    @aa1
    private final String version;

    public VideoFile() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ VideoFile copy$default(VideoFile videoFile, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoFile.fileName;
        }
        if ((i & 2) != 0) {
            str2 = videoFile.fileSize;
        }
        if ((i & 4) != 0) {
            str3 = videoFile.fileType;
        }
        if ((i & 8) != 0) {
            str4 = videoFile.filePath;
        }
        if ((i & 16) != 0) {
            str5 = videoFile.businessId;
        }
        if ((i & 32) != 0) {
            str6 = videoFile.businessType;
        }
        if ((i & 64) != 0) {
            str7 = videoFile.f51326id;
        }
        if ((i & 128) != 0) {
            str8 = videoFile.version;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return videoFile.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @aa1
    public final String component1() {
        return this.fileName;
    }

    @aa1
    public final String component2() {
        return this.fileSize;
    }

    @aa1
    public final String component3() {
        return this.fileType;
    }

    @aa1
    public final String component4() {
        return this.filePath;
    }

    @aa1
    public final String component5() {
        return this.businessId;
    }

    @aa1
    public final String component6() {
        return this.businessType;
    }

    @aa1
    public final String component7() {
        return this.f51326id;
    }

    @aa1
    public final String component8() {
        return this.version;
    }

    @aa1
    public final VideoFile copy(@aa1 String fileName, @aa1 String fileSize, @aa1 String fileType, @aa1 String filePath, @aa1 String businessId, @aa1 String businessType, @aa1 String id, @aa1 String version) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileSize, "fileSize");
        Intrinsics.X0O(fileType, "fileType");
        Intrinsics.X0O(filePath, "filePath");
        Intrinsics.X0O(businessId, "businessId");
        Intrinsics.X0O(businessType, "businessType");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(version, "version");
        return new VideoFile(fileName, fileSize, fileType, filePath, businessId, businessType, id, version);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFile)) {
            return false;
        }
        VideoFile videoFile = (VideoFile) obj;
        return Intrinsics.XOO0ii0(this.fileName, videoFile.fileName) && Intrinsics.XOO0ii0(this.fileSize, videoFile.fileSize) && Intrinsics.XOO0ii0(this.fileType, videoFile.fileType) && Intrinsics.XOO0ii0(this.filePath, videoFile.filePath) && Intrinsics.XOO0ii0(this.businessId, videoFile.businessId) && Intrinsics.XOO0ii0(this.businessType, videoFile.businessType) && Intrinsics.XOO0ii0(this.f51326id, videoFile.f51326id) && Intrinsics.XOO0ii0(this.version, videoFile.version);
    }

    @aa1
    public final String getBusinessId() {
        return this.businessId;
    }

    @aa1
    public final String getBusinessType() {
        return this.businessType;
    }

    @aa1
    public final String getFileName() {
        return this.fileName;
    }

    @aa1
    public final String getFilePath() {
        return this.filePath;
    }

    @aa1
    public final String getFileSize() {
        return this.fileSize;
    }

    @aa1
    public final String getFileType() {
        return this.fileType;
    }

    @aa1
    public final String getId() {
        return this.f51326id;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((this.fileName.hashCode() * 31) + this.fileSize.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.businessId.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.f51326id.hashCode()) * 31) + this.version.hashCode();
    }

    @aa1
    public String toString() {
        return "VideoFile(fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileType=" + this.fileType + ", filePath=" + this.filePath + ", businessId=" + this.businessId + ", businessType=" + this.businessType + ", id=" + this.f51326id + ", version=" + this.version + I000IiI1O.C2156iO.f1007iO;
    }

    public VideoFile(@aa1 String fileName, @aa1 String fileSize, @aa1 String fileType, @aa1 String filePath, @aa1 String businessId, @aa1 String businessType, @aa1 String id, @aa1 String version) {
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(fileSize, "fileSize");
        Intrinsics.X0O(fileType, "fileType");
        Intrinsics.X0O(filePath, "filePath");
        Intrinsics.X0O(businessId, "businessId");
        Intrinsics.X0O(businessType, "businessType");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(version, "version");
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.filePath = filePath;
        this.businessId = businessId;
        this.businessType = businessType;
        this.f51326id = id;
        this.version = version;
    }

    public /* synthetic */ VideoFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
    }
}
