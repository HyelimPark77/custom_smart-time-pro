package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Y5;
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
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ FirmwareVersion copy$default(FirmwareVersion r0, String r1, int r2, String r3, String r4, String r5, int r6, String r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.fileName;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.fileSize;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.fileUrl;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.version;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.info;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.flag;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.fileName2;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.fileUrl2;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.version2;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.updateDesc;
    L32:
        String r13 = r9;
        String r14 = r10;
        String r15 = r7;
        String r16 = r8;
        String r17 = r5;
        int r18 = r6;
        String r19 = r3;
        String r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
    public final FirmwareVersion copy(@aa1 String r13, int r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, int r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r13, Y5.c.b);
        Intrinsics.X0O(r15, Y5.c.a);
        Intrinsics.X0O(r16, "version");
        Intrinsics.X0O(r17, "info");
        Intrinsics.X0O(r19, "fileName2");
        Intrinsics.X0O(r20, "fileUrl2");
        Intrinsics.X0O(r21, "version2");
        Intrinsics.X0O(r22, "updateDesc");
        return new FirmwareVersion(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FirmwareVersion) == true) goto L8;
        return false;
    L8:
        FirmwareVersion r6 = (FirmwareVersion) r5;
        if (Intrinsics.XOO0ii0(this.fileName, r6.fileName) == true) goto L12;
        return false;
    L12:
        if (this.fileSize == r6.fileSize) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.fileUrl, r6.fileUrl) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.info, r6.info) == true) goto L24;
        return false;
    L24:
        if (this.flag == r6.flag) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.fileName2, r6.fileName2) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.fileUrl2, r6.fileUrl2) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.version2, r6.version2) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.updateDesc, r6.updateDesc) == true) goto L38;
        return false;
    L38:
        return true;
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

    public final void setFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileName = r2;
    }

    public final void setFileName2(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileName2 = r2;
    }

    public final void setFileSize(int r1) {
        this.fileSize = r1;
    }

    public final void setFileUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileUrl = r2;
    }

    public final void setFileUrl2(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileUrl2 = r2;
    }

    public final void setFlag(int r1) {
        this.flag = r1;
    }

    public final void setInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.info = r2;
    }

    public final void setUpdateDesc(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateDesc = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    public final void setVersion2(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version2 = r2;
    }

    @aa1
    public String toString() {
        return "FirmwareVersion(fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileUrl=" + this.fileUrl + ", version=" + this.version + ", info=" + this.info + ", flag=" + this.flag + ", fileName2=" + this.fileName2 + ", fileUrl2=" + this.fileUrl2 + ", version2=" + this.version2 + ", updateDesc=" + this.updateDesc + I000IiI1O.iO.iO;
    }

    public FirmwareVersion(@aa1 String r2, int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, int r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r2, Y5.c.b);
        Intrinsics.X0O(r4, Y5.c.a);
        Intrinsics.X0O(r5, "version");
        Intrinsics.X0O(r6, "info");
        Intrinsics.X0O(r8, "fileName2");
        Intrinsics.X0O(r9, "fileUrl2");
        Intrinsics.X0O(r10, "version2");
        Intrinsics.X0O(r11, "updateDesc");
        this.fileName = r2;
        this.fileSize = r3;
        this.fileUrl = r4;
        this.version = r5;
        this.info = r6;
        this.flag = r7;
        this.fileName2 = r8;
        this.fileUrl2 = r9;
        this.version2 = r10;
        this.updateDesc = r11;
    }

    public /* synthetic */ FirmwareVersion(String r3, int r4, String r5, String r6, String r7, int r8, String r9, String r10, String r11, String r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = "";
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
        if ((r13 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r13 & 512) == 0) goto L33;
        String r15 = "";
    L32:
        String r16 = r11;
        String r17 = r10;
        String r18 = r9;
        int r19 = r8;
        String r20 = r7;
        String r21 = r6;
        String r22 = r5;
        this(r3, r4, r22, r21, r20, r19, r18, r17, r16, r15);
        return;
    L33:
        r15 = r12;
        goto L32
    }
}
