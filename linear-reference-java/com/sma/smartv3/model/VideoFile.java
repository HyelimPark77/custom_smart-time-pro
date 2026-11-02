package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Y5;
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

    @aa1
    private final String id;

    @aa1
    private final String version;

    public VideoFile() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ VideoFile copy$default(VideoFile r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.fileName;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.fileSize;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.fileType;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.filePath;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.businessId;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.businessType;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.id;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.version;
    L26:
        String r11 = r7;
        String r12 = r8;
        String r13 = r5;
        String r14 = r6;
        String r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
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
        return this.id;
    }

    @aa1
    public final String component8() {
        return this.version;
    }

    @aa1
    public final VideoFile copy(@aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18) {
        Intrinsics.X0O(r11, Y5.c.b);
        Intrinsics.X0O(r12, "fileSize");
        Intrinsics.X0O(r13, "fileType");
        Intrinsics.X0O(r14, Y5.c.c);
        Intrinsics.X0O(r15, "businessId");
        Intrinsics.X0O(r16, "businessType");
        Intrinsics.X0O(r17, "id");
        Intrinsics.X0O(r18, "version");
        return new VideoFile(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VideoFile) == true) goto L8;
        return false;
    L8:
        VideoFile r6 = (VideoFile) r5;
        if (Intrinsics.XOO0ii0(this.fileName, r6.fileName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.fileSize, r6.fileSize) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.fileType, r6.fileType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.filePath, r6.filePath) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.businessId, r6.businessId) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.businessType, r6.businessType) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L32;
        return false;
    L32:
        return true;
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
        return this.id;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((this.fileName.hashCode() * 31) + this.fileSize.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.businessId.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.id.hashCode()) * 31) + this.version.hashCode();
    }

    @aa1
    public String toString() {
        return "VideoFile(fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileType=" + this.fileType + ", filePath=" + this.filePath + ", businessId=" + this.businessId + ", businessType=" + this.businessType + ", id=" + this.id + ", version=" + this.version + I000IiI1O.iO.iO;
    }

    public VideoFile(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r2, Y5.c.b);
        Intrinsics.X0O(r3, "fileSize");
        Intrinsics.X0O(r4, "fileType");
        Intrinsics.X0O(r5, Y5.c.c);
        Intrinsics.X0O(r6, "businessId");
        Intrinsics.X0O(r7, "businessType");
        Intrinsics.X0O(r8, "id");
        Intrinsics.X0O(r9, "version");
        this.fileName = r2;
        this.fileSize = r3;
        this.fileType = r4;
        this.filePath = r5;
        this.businessId = r6;
        this.businessType = r7;
        this.id = r8;
        this.version = r9;
    }

    public /* synthetic */ VideoFile(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r12 = "";
    L26:
        String r13 = r8;
        String r14 = r7;
        String r15 = r6;
        String r16 = r5;
        String r17 = r4;
        String r18 = r3;
        this(r2, r18, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
