package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class IntegralContentData extends JsonFieldContainer implements Serializable {

    @aa1
    private String accountId;
    private int changeFlag;

    @aa1
    private String createdAt;

    @aa1
    private String createdBy;

    @aa1
    private String id;

    @aa1
    private String pointsChange;

    @aa1
    private String recordItem;

    @aa1
    private String updateAt;

    @aa1
    private String updateBy;
    private float version;

    public IntegralContentData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        float r5 = 0.0f;
        String r6 = null;
        int r7 = 0;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ IntegralContentData copy$default(IntegralContentData r0, String r1, String r2, String r3, String r4, float r5, String r6, int r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.accountId;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.recordItem;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.pointsChange;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.id;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.version;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.createdBy;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.changeFlag;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.createdAt;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.updateBy;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.updateAt;
    L32:
        String r13 = r9;
        String r14 = r10;
        int r15 = r7;
        String r16 = r8;
        float r17 = r5;
        String r18 = r6;
        String r19 = r3;
        String r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @aa1
    public final String component1() {
        return this.accountId;
    }

    @aa1
    public final String component10() {
        return this.updateAt;
    }

    @aa1
    public final String component2() {
        return this.recordItem;
    }

    @aa1
    public final String component3() {
        return this.pointsChange;
    }

    @aa1
    public final String component4() {
        return this.id;
    }

    public final float component5() {
        return this.version;
    }

    @aa1
    public final String component6() {
        return this.createdBy;
    }

    public final int component7() {
        return this.changeFlag;
    }

    @aa1
    public final String component8() {
        return this.createdAt;
    }

    @aa1
    public final String component9() {
        return this.updateBy;
    }

    @aa1
    public final IntegralContentData copy(@aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, float r17, @aa1 String r18, int r19, @aa1 String r20, @aa1 String r21, @aa1 String r22) {
        Intrinsics.X0O(r13, "accountId");
        Intrinsics.X0O(r14, "recordItem");
        Intrinsics.X0O(r15, "pointsChange");
        Intrinsics.X0O(r16, "id");
        Intrinsics.X0O(r18, "createdBy");
        Intrinsics.X0O(r20, "createdAt");
        Intrinsics.X0O(r21, "updateBy");
        Intrinsics.X0O(r22, "updateAt");
        return new IntegralContentData(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IntegralContentData) == true) goto L8;
        return false;
    L8:
        IntegralContentData r6 = (IntegralContentData) r5;
        if (Intrinsics.XOO0ii0(this.accountId, r6.accountId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.recordItem, r6.recordItem) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.pointsChange, r6.pointsChange) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.version, r6.version) == 0) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.createdBy, r6.createdBy) == true) goto L27;
        return false;
    L27:
        if (this.changeFlag == r6.changeFlag) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.updateBy, r6.updateBy) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getAccountId() {
        return this.accountId;
    }

    public final int getChangeFlag() {
        return this.changeFlag;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @aa1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @aa1
    public final String getId() {
        return this.id;
    }

    @aa1
    public final String getPointsChange() {
        return this.pointsChange;
    }

    @aa1
    public final String getRecordItem() {
        return this.recordItem;
    }

    @aa1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @aa1
    public final String getUpdateBy() {
        return this.updateBy;
    }

    public final float getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((this.accountId.hashCode() * 31) + this.recordItem.hashCode()) * 31) + this.pointsChange.hashCode()) * 31) + this.id.hashCode()) * 31) + Float.hashCode(this.version)) * 31) + this.createdBy.hashCode()) * 31) + Integer.hashCode(this.changeFlag)) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAccountId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.accountId = r2;
    }

    public final void setChangeFlag(int r1) {
        this.changeFlag = r1;
    }

    public final void setCreatedAt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createdAt = r2;
    }

    public final void setCreatedBy(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createdBy = r2;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setPointsChange(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.pointsChange = r2;
    }

    public final void setRecordItem(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.recordItem = r2;
    }

    public final void setUpdateAt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateAt = r2;
    }

    public final void setUpdateBy(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateBy = r2;
    }

    public final void setVersion(float r1) {
        this.version = r1;
    }

    @aa1
    public String toString() {
        return "IntegralContentData(accountId=" + this.accountId + ", recordItem=" + this.recordItem + ", pointsChange=" + this.pointsChange + ", id=" + this.id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", changeFlag=" + this.changeFlag + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.iO.iO;
    }

    public IntegralContentData(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, float r6, @aa1 String r7, int r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r2, "accountId");
        Intrinsics.X0O(r3, "recordItem");
        Intrinsics.X0O(r4, "pointsChange");
        Intrinsics.X0O(r5, "id");
        Intrinsics.X0O(r7, "createdBy");
        Intrinsics.X0O(r9, "createdAt");
        Intrinsics.X0O(r10, "updateBy");
        Intrinsics.X0O(r11, "updateAt");
        this.accountId = r2;
        this.recordItem = r3;
        this.pointsChange = r4;
        this.id = r5;
        this.version = r6;
        this.createdBy = r7;
        this.changeFlag = r8;
        this.createdAt = r9;
        this.updateBy = r10;
        this.updateAt = r11;
    }

    public /* synthetic */ IntegralContentData(String r2, String r3, String r4, String r5, float r6, String r7, int r8, String r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = 0.0f;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r14 = "";
    L32:
        String r15 = r10;
        String r16 = r9;
        int r17 = r8;
        String r18 = r7;
        float r19 = r6;
        String r20 = r5;
        String r21 = r4;
        String r22 = r3;
        this(r2, r22, r21, r20, r19, r18, r17, r16, r15, r14);
        return;
    L33:
        r14 = r11;
        goto L32
    }
}
