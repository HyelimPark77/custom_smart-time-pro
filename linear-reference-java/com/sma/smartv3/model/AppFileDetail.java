package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppFileDetail extends JsonFieldContainer implements Serializable {

    @aa1
    private final String appDetailImgs;

    @aa1
    private final String appGroupId;

    @aa1
    private final String appGroupName;

    @aa1
    private final String appModuleName;

    @aa1
    private final String appName;
    private final boolean appNewFlag;

    @tb1
    private final String appPack;

    @aa1
    private final String appPackName;

    @aa1
    private final String appPackVersion;

    @aa1
    private final String appPreImg;
    private final double appSize;

    @aa1
    private final String createdAt;
    private final long id;

    public AppFileDetail() {
        String r1 = null;
        String r2 = null;
        double r3 = 0.0d;
        long r5 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        boolean r15 = false;
        this(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, 8191, null);
    }

    public static /* synthetic */ AppFileDetail copy$default(AppFileDetail r16, String r17, String r18, double r19, long r21, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, boolean r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        String r2 = r16.appGroupId;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.appName;
    L11:
        if ((r32 & 4) == 0) goto L13;
        double r4 = r16.appSize;
    L15:
        if ((r32 & 8) == 0) goto L17;
        long r6 = r16.id;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r8 = r16.createdAt;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r9 = r16.appPreImg;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r10 = r16.appDetailImgs;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r11 = r16.appPack;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r12 = r16.appPackName;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r13 = r16.appGroupName;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r14 = r16.appModuleName;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r15 = r16.appPackVersion;
    L51:
        if ((r32 & 4096) == 0) goto L54;
        boolean r34 = r16.appNewFlag;
    L56:
        return r16.copy(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r34);
    L54:
        r34 = r31;
        goto L56
    L49:
        r15 = r30;
        goto L51
    L45:
        r14 = r29;
        goto L47
    L41:
        r13 = r28;
        goto L43
    L37:
        r12 = r27;
        goto L39
    L33:
        r11 = r26;
        goto L35
    L29:
        r10 = r25;
        goto L31
    L25:
        r9 = r24;
        goto L27
    L21:
        r8 = r23;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    @aa1
    public final String component1() {
        return this.appGroupId;
    }

    @aa1
    public final String component10() {
        return this.appGroupName;
    }

    @aa1
    public final String component11() {
        return this.appModuleName;
    }

    @aa1
    public final String component12() {
        return this.appPackVersion;
    }

    public final boolean component13() {
        return this.appNewFlag;
    }

    @aa1
    public final String component2() {
        return this.appName;
    }

    public final double component3() {
        return this.appSize;
    }

    public final long component4() {
        return this.id;
    }

    @aa1
    public final String component5() {
        return this.createdAt;
    }

    @aa1
    public final String component6() {
        return this.appPreImg;
    }

    @aa1
    public final String component7() {
        return this.appDetailImgs;
    }

    @tb1
    public final String component8() {
        return this.appPack;
    }

    @aa1
    public final String component9() {
        return this.appPackName;
    }

    @aa1
    public final AppFileDetail copy(@aa1 String r18, @aa1 String r19, double r20, long r22, @aa1 String r24, @aa1 String r25, @aa1 String r26, @tb1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, boolean r32) {
        Intrinsics.X0O(r18, "appGroupId");
        Intrinsics.X0O(r19, "appName");
        Intrinsics.X0O(r24, "createdAt");
        Intrinsics.X0O(r25, "appPreImg");
        Intrinsics.X0O(r26, "appDetailImgs");
        Intrinsics.X0O(r28, "appPackName");
        Intrinsics.X0O(r29, "appGroupName");
        Intrinsics.X0O(r30, "appModuleName");
        Intrinsics.X0O(r31, "appPackVersion");
        return new AppFileDetail(r18, r19, r20, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AppFileDetail) == true) goto L8;
        return false;
    L8:
        AppFileDetail r9 = (AppFileDetail) r8;
        if (Intrinsics.XOO0ii0(this.appGroupId, r9.appGroupId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.appName, r9.appName) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.appSize, r9.appSize) == 0) goto L18;
        return false;
    L18:
        if (this.id == r9.id) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.createdAt, r9.createdAt) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.appPreImg, r9.appPreImg) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.appDetailImgs, r9.appDetailImgs) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.appPack, r9.appPack) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.appPackName, r9.appPackName) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.appGroupName, r9.appGroupName) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.appModuleName, r9.appModuleName) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.appPackVersion, r9.appPackVersion) == true) goto L45;
        return false;
    L45:
        if (this.appNewFlag == r9.appNewFlag) goto L47;
        return false;
    L47:
        return true;
    }

    @aa1
    public final String getAppDetailImgs() {
        return this.appDetailImgs;
    }

    @aa1
    public final String getAppGroupId() {
        return this.appGroupId;
    }

    @aa1
    public final String getAppGroupName() {
        return this.appGroupName;
    }

    @aa1
    public final String getAppModuleName() {
        return this.appModuleName;
    }

    @aa1
    public final String getAppName() {
        return this.appName;
    }

    public final boolean getAppNewFlag() {
        return this.appNewFlag;
    }

    @tb1
    public final String getAppPack() {
        return this.appPack;
    }

    @aa1
    public final String getAppPackName() {
        return this.appPackName;
    }

    @aa1
    public final String getAppPackVersion() {
        return this.appPackVersion;
    }

    @aa1
    public final String getAppPreImg() {
        return this.appPreImg;
    }

    public final double getAppSize() {
        return this.appSize;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        int r0 = ((((((((((((this.appGroupId.hashCode() * 31) + this.appName.hashCode()) * 31) + Double.hashCode(this.appSize)) * 31) + Long.hashCode(this.id)) * 31) + this.createdAt.hashCode()) * 31) + this.appPreImg.hashCode()) * 31) + this.appDetailImgs.hashCode()) * 31;
        String r1 = this.appPack;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((((((((((r0 + r2) * 31) + this.appPackName.hashCode()) * 31) + this.appGroupName.hashCode()) * 31) + this.appModuleName.hashCode()) * 31) + this.appPackVersion.hashCode()) * 31) + Boolean.hashCode(this.appNewFlag);
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    @aa1
    public String toString() {
        return "AppFileDetail(appGroupId=" + this.appGroupId + ", appName=" + this.appName + ", appSize=" + this.appSize + ", id=" + this.id + ", createdAt=" + this.createdAt + ", appPreImg=" + this.appPreImg + ", appDetailImgs=" + this.appDetailImgs + ", appPack=" + this.appPack + ", appPackName=" + this.appPackName + ", appGroupName=" + this.appGroupName + ", appModuleName=" + this.appModuleName + ", appPackVersion=" + this.appPackVersion + ", appNewFlag=" + this.appNewFlag + I000IiI1O.iO.iO;
    }

    public AppFileDetail(@aa1 String r8, @aa1 String r9, double r10, long r12, @aa1 String r14, @aa1 String r15, @aa1 String r16, @tb1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, boolean r22) {
        Intrinsics.X0O(r8, "appGroupId");
        Intrinsics.X0O(r9, "appName");
        Intrinsics.X0O(r14, "createdAt");
        Intrinsics.X0O(r15, "appPreImg");
        Intrinsics.X0O(r16, "appDetailImgs");
        Intrinsics.X0O(r18, "appPackName");
        Intrinsics.X0O(r19, "appGroupName");
        Intrinsics.X0O(r20, "appModuleName");
        Intrinsics.X0O(r21, "appPackVersion");
        this.appGroupId = r8;
        this.appName = r9;
        this.appSize = r10;
        this.id = r12;
        this.createdAt = r14;
        this.appPreImg = r15;
        this.appDetailImgs = r16;
        this.appPack = r17;
        this.appPackName = r18;
        this.appGroupName = r19;
        this.appModuleName = r20;
        this.appPackVersion = r21;
        this.appNewFlag = r22;
    }

    public /* synthetic */ AppFileDetail(String r17, String r18, double r19, long r21, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, boolean r31, int r32, DefaultConstructorMarker r33) {
        String r2 = "";
        if ((r32 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r32 & 4) == 0) goto L13;
        double r4 = 0.0d;
    L15:
        if ((r32 & 8) == 0) goto L17;
        long r6 = 0;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r8 = "";
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r9 = "";
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r10 = "";
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r11 = "";
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r12 = "";
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r13 = "";
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r14 = "";
    L47:
        if ((r32 & 2048) != 0) goto L51;
        r2 = r30;
    L51:
        if ((r32 & 4096) == 0) goto L54;
        boolean r34 = false;
    L55:
        this(r1, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r2, r34);
        return;
    L54:
        r34 = r31;
        goto L55
    L45:
        r14 = r29;
        goto L47
    L41:
        r13 = r28;
        goto L43
    L37:
        r12 = r27;
        goto L39
    L33:
        r11 = r26;
        goto L35
    L29:
        r10 = r25;
        goto L31
    L25:
        r9 = r24;
        goto L27
    L21:
        r8 = r23;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
