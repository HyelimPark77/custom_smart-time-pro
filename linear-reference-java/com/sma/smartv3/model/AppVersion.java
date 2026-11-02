package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Y5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppVersion {

    @aa1
    private String appName;

    @aa1
    private String fileUrl;
    private int flag;
    private int id;

    @aa1
    private String info;

    @aa1
    private String platform;

    @aa1
    private String version;

    public AppVersion() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ AppVersion copy$default(AppVersion r0, int r1, String r2, String r3, String r4, String r5, String r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.appName;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.platform;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.version;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.fileUrl;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.info;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.flag;
    L23:
        String r10 = r6;
        int r11 = r7;
        String r12 = r4;
        String r13 = r5;
        String r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.appName;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    @aa1
    public final String component4() {
        return this.version;
    }

    @aa1
    public final String component5() {
        return this.fileUrl;
    }

    @aa1
    public final String component6() {
        return this.info;
    }

    public final int component7() {
        return this.flag;
    }

    @aa1
    public final AppVersion copy(int r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, int r16) {
        Intrinsics.X0O(r11, "appName");
        Intrinsics.X0O(r12, "platform");
        Intrinsics.X0O(r13, "version");
        Intrinsics.X0O(r14, Y5.c.a);
        Intrinsics.X0O(r15, "info");
        return new AppVersion(r10, r11, r12, r13, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppVersion) == true) goto L8;
        return false;
    L8:
        AppVersion r6 = (AppVersion) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.appName, r6.appName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.platform, r6.platform) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.fileUrl, r6.fileUrl) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.info, r6.info) == true) goto L27;
        return false;
    L27:
        if (this.flag == r6.flag) goto L29;
        return false;
    L29:
        return true;
    }

    @aa1
    public final String getAppName() {
        return this.appName;
    }

    @aa1
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getInfo() {
        return this.info;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.appName.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.version.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + this.info.hashCode()) * 31) + Integer.hashCode(this.flag);
    }

    public final void setAppName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.appName = r2;
    }

    public final void setFileUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fileUrl = r2;
    }

    public final void setFlag(int r1) {
        this.flag = r1;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.info = r2;
    }

    public final void setPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.platform = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "AppVersion(id=" + this.id + ", appName=" + this.appName + ", platform=" + this.platform + ", version=" + this.version + ", fileUrl=" + this.fileUrl + ", info=" + this.info + ", flag=" + this.flag + I000IiI1O.iO.iO;
    }

    public AppVersion(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, int r8) {
        Intrinsics.X0O(r3, "appName");
        Intrinsics.X0O(r4, "platform");
        Intrinsics.X0O(r5, "version");
        Intrinsics.X0O(r6, Y5.c.a);
        Intrinsics.X0O(r7, "info");
        this.id = r2;
        this.appName = r3;
        this.platform = r4;
        this.version = r5;
        this.fileUrl = r6;
        this.info = r7;
        this.flag = r8;
    }

    public /* synthetic */ AppVersion(int r3, String r4, String r5, String r6, String r7, String r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        int r12 = 0;
    L23:
        String r13 = r8;
        String r14 = r7;
        String r15 = r6;
        String r16 = r5;
        this(r3, r4, r16, r15, r14, r13, r12);
        return;
    L24:
        r12 = r9;
        goto L23
    }
}
