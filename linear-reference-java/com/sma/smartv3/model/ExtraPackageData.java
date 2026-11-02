package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Y5;
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
    private int id;

    @aa1
    private String info;
    private int type;

    @aa1
    private String version;

    public ExtraPackageData() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        long r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ ExtraPackageData copy$default(ExtraPackageData r0, int r1, String r2, int r3, String r4, String r5, int r6, String r7, String r8, long r9, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.firmwareVersion;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.version;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.fileName;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.fileSize;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.fileUrl;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.info;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r9 = r0.createTime;
    L29:
        long r13 = r9;
        String r10 = r7;
        String r14 = r8;
        String r15 = r5;
        int r16 = r6;
        int r17 = r3;
        String r18 = r4;
        return r0.copy(r1, r2, r17, r18, r15, r16, r10, r14, r13);
    }

    public final int component1() {
        return this.id;
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
    public final ExtraPackageData copy(int r13, @aa1 String r14, int r15, @aa1 String r16, @aa1 String r17, int r18, @aa1 String r19, @aa1 String r20, long r21) {
        Intrinsics.X0O(r14, "firmwareVersion");
        Intrinsics.X0O(r16, "version");
        Intrinsics.X0O(r17, Y5.c.b);
        Intrinsics.X0O(r19, Y5.c.a);
        Intrinsics.X0O(r20, "info");
        return new ExtraPackageData(r13, r14, r15, r16, r17, r18, r19, r20, r21);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ExtraPackageData) == true) goto L8;
        return false;
    L8:
        ExtraPackageData r9 = (ExtraPackageData) r8;
        if (this.id == r9.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.firmwareVersion, r9.firmwareVersion) == true) goto L15;
        return false;
    L15:
        if (this.type == r9.type) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.version, r9.version) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.fileName, r9.fileName) == true) goto L24;
        return false;
    L24:
        if (this.fileSize == r9.fileSize) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.fileUrl, r9.fileUrl) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.info, r9.info) == true) goto L33;
        return false;
    L33:
        if (this.createTime == r9.createTime) goto L35;
        return false;
    L35:
        return true;
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
        return this.id;
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
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.firmwareVersion.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.version.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31) + this.fileUrl.hashCode()) * 31) + this.info.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public final void setCreateTime(long r1) {
        this.createTime = r1;
    }

    public final void setFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileName = r2;
    }

    public final void setFileSize(int r1) {
        this.fileSize = r1;
    }

    public final void setFileUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileUrl = r2;
    }

    public final void setFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.firmwareVersion = r2;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.info = r2;
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "ExtraPackageData(id=" + this.id + ", firmwareVersion=" + this.firmwareVersion + ", type=" + this.type + ", version=" + this.version + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileUrl=" + this.fileUrl + ", info=" + this.info + ", createTime=" + this.createTime + I000IiI1O.iO.iO;
    }

    public ExtraPackageData(int r2, @aa1 String r3, int r4, @aa1 String r5, @aa1 String r6, int r7, @aa1 String r8, @aa1 String r9, long r10) {
        Intrinsics.X0O(r3, "firmwareVersion");
        Intrinsics.X0O(r5, "version");
        Intrinsics.X0O(r6, Y5.c.b);
        Intrinsics.X0O(r8, Y5.c.a);
        Intrinsics.X0O(r9, "info");
        this.id = r2;
        this.firmwareVersion = r3;
        this.type = r4;
        this.version = r5;
        this.fileName = r6;
        this.fileSize = r7;
        this.fileUrl = r8;
        this.info = r9;
        this.createTime = r10;
    }

    public /* synthetic */ ExtraPackageData(int r3, String r4, int r5, String r6, String r7, int r8, String r9, String r10, long r11, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L29;
        r11 = 0;
    L29:
        long r12 = r11;
        String r15 = r10;
        String r16 = r9;
        int r17 = r8;
        String r18 = r7;
        String r19 = r6;
        int r20 = r5;
        this(r3, r4, r20, r19, r18, r17, r16, r15, r12);
    }
}
