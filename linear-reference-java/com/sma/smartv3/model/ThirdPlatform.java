package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ThirdPlatform {

    @aa1
    private String accessToken;
    private long createTime;

    @aa1
    private String extInfo;

    @aa1
    private String id;

    @aa1
    private String openId;

    @aa1
    private String platform;
    private int projectId;
    private int replaced;

    @aa1
    private String unionId;
    private long updateTime;

    public ThirdPlatform() {
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        long r9 = 0;
        long r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, 1023, null);
    }

    public static /* synthetic */ ThirdPlatform copy$default(ThirdPlatform r0, String r1, int r2, String r3, int r4, String r5, String r6, String r7, String r8, long r9, long r11, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.projectId;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.platform;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.replaced;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.openId;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.accessToken;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.extInfo;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.unionId;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.createTime;
    L30:
        if ((r13 & 512) == 0) goto L32;
        r11 = r0.updateTime;
    L32:
        long r15 = r11;
        long r12 = r9;
        String r10 = r7;
        String r16 = r8;
        String r17 = r5;
        String r18 = r6;
        String r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r10, r16, r12, r15);
    }

    @aa1
    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.updateTime;
    }

    public final int component2() {
        return this.projectId;
    }

    @aa1
    public final String component3() {
        return this.platform;
    }

    public final int component4() {
        return this.replaced;
    }

    @aa1
    public final String component5() {
        return this.openId;
    }

    @aa1
    public final String component6() {
        return this.accessToken;
    }

    @aa1
    public final String component7() {
        return this.extInfo;
    }

    @aa1
    public final String component8() {
        return this.unionId;
    }

    public final long component9() {
        return this.createTime;
    }

    @aa1
    public final ThirdPlatform copy(@aa1 String r15, int r16, @aa1 String r17, int r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, long r23, long r25) {
        Intrinsics.X0O(r15, "id");
        Intrinsics.X0O(r17, "platform");
        Intrinsics.X0O(r19, "openId");
        Intrinsics.X0O(r20, "accessToken");
        Intrinsics.X0O(r21, "extInfo");
        Intrinsics.X0O(r22, "unionId");
        return new ThirdPlatform(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ThirdPlatform) == true) goto L8;
        return false;
    L8:
        ThirdPlatform r9 = (ThirdPlatform) r8;
        if (Intrinsics.XOO0ii0(this.id, r9.id) == true) goto L12;
        return false;
    L12:
        if (this.projectId == r9.projectId) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.platform, r9.platform) == true) goto L18;
        return false;
    L18:
        if (this.replaced == r9.replaced) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.openId, r9.openId) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.accessToken, r9.accessToken) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.extInfo, r9.extInfo) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.unionId, r9.unionId) == true) goto L33;
        return false;
    L33:
        if (this.createTime == r9.createTime) goto L36;
        return false;
    L36:
        if (this.updateTime == r9.updateTime) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @aa1
    public final String getExtInfo() {
        return this.extInfo;
    }

    @aa1
    public final String getId() {
        return this.id;
    }

    @aa1
    public final String getOpenId() {
        return this.openId;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final int getReplaced() {
        return this.replaced;
    }

    @aa1
    public final String getUnionId() {
        return this.unionId;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.projectId)) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.replaced)) * 31) + this.openId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.extInfo.hashCode()) * 31) + this.unionId.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime);
    }

    public final void setAccessToken(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.accessToken = r2;
    }

    public final void setCreateTime(long r1) {
        this.createTime = r1;
    }

    public final void setExtInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extInfo = r2;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setOpenId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.openId = r2;
    }

    public final void setPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.platform = r2;
    }

    public final void setProjectId(int r1) {
        this.projectId = r1;
    }

    public final void setReplaced(int r1) {
        this.replaced = r1;
    }

    public final void setUnionId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.unionId = r2;
    }

    public final void setUpdateTime(long r1) {
        this.updateTime = r1;
    }

    @aa1
    public String toString() {
        return "ThirdPlatform(id=" + this.id + ", projectId=" + this.projectId + ", platform=" + this.platform + ", replaced=" + this.replaced + ", openId=" + this.openId + ", accessToken=" + this.accessToken + ", extInfo=" + this.extInfo + ", unionId=" + this.unionId + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + I000IiI1O.iO.iO;
    }

    public ThirdPlatform(@aa1 String r2, int r3, @aa1 String r4, int r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, long r10, long r12) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r4, "platform");
        Intrinsics.X0O(r6, "openId");
        Intrinsics.X0O(r7, "accessToken");
        Intrinsics.X0O(r8, "extInfo");
        Intrinsics.X0O(r9, "unionId");
        this.id = r2;
        this.projectId = r3;
        this.platform = r4;
        this.replaced = r5;
        this.openId = r6;
        this.accessToken = r7;
        this.extInfo = r8;
        this.unionId = r9;
        this.createTime = r10;
        this.updateTime = r12;
    }

    public /* synthetic */ ThirdPlatform(String r14, int r15, String r16, int r17, String r18, String r19, String r20, String r21, long r22, long r24, int r26, DefaultConstructorMarker r27) {
        String r2 = "";
        if ((r26 & 1) == 0) goto L5;
        r14 = "";
    L5:
        int r3 = 0;
        if ((r26 & 2) == 0) goto L8;
        int r1 = 0;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r26 & 8) != 0) goto L18;
        r3 = r17;
    L18:
        if ((r26 & 16) == 0) goto L20;
        String r5 = "";
    L22:
        if ((r26 & 32) == 0) goto L24;
        String r6 = "";
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r7 = "";
    L30:
        if ((r26 & 128) != 0) goto L34;
        r2 = r21;
    L34:
        if ((r26 & 256) == 0) goto L36;
        long r11 = 0;
    L38:
        if ((r26 & 512) == 0) goto L41;
        long r25 = 0;
    L42:
        this(r14, r1, r4, r3, r5, r6, r7, r2, r11, r25);
        return;
    L41:
        r25 = r24;
        goto L42
    L36:
        r11 = r22;
        goto L38
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L12:
        r4 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
