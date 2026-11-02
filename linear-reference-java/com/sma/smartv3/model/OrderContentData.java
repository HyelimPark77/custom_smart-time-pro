package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.UploadOtaRecord;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OrderContentData extends JsonFieldContainer implements Serializable {
    private float amount;

    @aa1
    private String createdAt;

    @aa1
    private String createdBy;

    @aa1
    private String eleId;

    @aa1
    private String elePath;

    @aa1
    private String id;

    @aa1
    private String orderNum;

    @aa1
    private String orderType;

    @aa1
    private String payStatus;

    @aa1
    private String payType;

    @aa1
    private String priceUnit;

    @aa1
    private String remark;

    @aa1
    private String subject;

    @aa1
    private String updateAt;

    @aa1
    private String updateBy;

    @aa1
    private String userId;

    @aa1
    private String version;

    public OrderContentData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        float r9 = 0.0f;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, 131071, null);
    }

    public static /* synthetic */ OrderContentData copy$default(OrderContentData r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, float r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        String r2 = r17.orderNum;
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = r17.userId;
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = r17.orderType;
    L15:
        if ((r35 & 8) == 0) goto L17;
        String r5 = r17.eleId;
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r6 = r17.elePath;
    L23:
        if ((r35 & 32) == 0) goto L25;
        String r7 = r17.subject;
    L27:
        if ((r35 & 64) == 0) goto L29;
        String r8 = r17.payType;
    L31:
        if ((r35 & 128) == 0) goto L33;
        String r9 = r17.payStatus;
    L35:
        if ((r35 & 256) == 0) goto L37;
        float r10 = r17.amount;
    L39:
        if ((r35 & 512) == 0) goto L41;
        String r11 = r17.priceUnit;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        String r12 = r17.remark;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        String r13 = r17.id;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        String r14 = r17.version;
    L55:
        if ((r35 & 8192) == 0) goto L57;
        String r15 = r17.createdBy;
    L58:
        String r110 = r2;
        if ((r35 & 16384) == 0) goto L61;
        String r16 = r17.createdAt;
    L63:
        if ((r35 & 32768) == 0) goto L65;
        String r1 = r17.updateBy;
    L67:
        if ((r35 & 65536) == 0) goto L69;
        String r111 = r1;
        String r37 = r111;
        String r38 = r17.updateAt;
    L71:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r37, r38);
    L69:
        r38 = r34;
        r37 = r1;
        goto L71
    L65:
        r1 = r33;
        goto L67
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @aa1
    public final String component1() {
        return this.orderNum;
    }

    @aa1
    public final String component10() {
        return this.priceUnit;
    }

    @aa1
    public final String component11() {
        return this.remark;
    }

    @aa1
    public final String component12() {
        return this.id;
    }

    @aa1
    public final String component13() {
        return this.version;
    }

    @aa1
    public final String component14() {
        return this.createdBy;
    }

    @aa1
    public final String component15() {
        return this.createdAt;
    }

    @aa1
    public final String component16() {
        return this.updateBy;
    }

    @aa1
    public final String component17() {
        return this.updateAt;
    }

    @aa1
    public final String component2() {
        return this.userId;
    }

    @aa1
    public final String component3() {
        return this.orderType;
    }

    @aa1
    public final String component4() {
        return this.eleId;
    }

    @aa1
    public final String component5() {
        return this.elePath;
    }

    @aa1
    public final String component6() {
        return this.subject;
    }

    @aa1
    public final String component7() {
        return this.payType;
    }

    @aa1
    public final String component8() {
        return this.payStatus;
    }

    public final float component9() {
        return this.amount;
    }

    @aa1
    public final OrderContentData copy(@aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, float r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36) {
        Intrinsics.X0O(r20, "orderNum");
        Intrinsics.X0O(r21, "userId");
        Intrinsics.X0O(r22, "orderType");
        Intrinsics.X0O(r23, "eleId");
        Intrinsics.X0O(r24, "elePath");
        Intrinsics.X0O(r25, "subject");
        Intrinsics.X0O(r26, "payType");
        Intrinsics.X0O(r27, "payStatus");
        Intrinsics.X0O(r29, "priceUnit");
        Intrinsics.X0O(r30, UploadOtaRecord.REMARK);
        Intrinsics.X0O(r31, "id");
        Intrinsics.X0O(r32, "version");
        Intrinsics.X0O(r33, "createdBy");
        Intrinsics.X0O(r34, "createdAt");
        Intrinsics.X0O(r35, "updateBy");
        Intrinsics.X0O(r36, "updateAt");
        return new OrderContentData(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderContentData) == true) goto L8;
        return false;
    L8:
        OrderContentData r6 = (OrderContentData) r5;
        if (Intrinsics.XOO0ii0(this.orderNum, r6.orderNum) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.userId, r6.userId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.orderType, r6.orderType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.eleId, r6.eleId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.elePath, r6.elePath) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.subject, r6.subject) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.payType, r6.payType) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.payStatus, r6.payStatus) == true) goto L33;
        return false;
    L33:
        if (Float.compare(this.amount, r6.amount) == 0) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.priceUnit, r6.priceUnit) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.remark, r6.remark) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.createdBy, r6.createdBy) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.updateBy, r6.updateBy) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final float getAmount() {
        return this.amount;
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
    public final String getEleId() {
        return this.eleId;
    }

    @aa1
    public final String getElePath() {
        return this.elePath;
    }

    @aa1
    public final String getId() {
        return this.id;
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    @aa1
    public final String getOrderType() {
        return this.orderType;
    }

    @aa1
    public final String getPayStatus() {
        return this.payStatus;
    }

    @aa1
    public final String getPayType() {
        return this.payType;
    }

    @aa1
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    @aa1
    public final String getRemark() {
        return this.remark;
    }

    @aa1
    public final String getSubject() {
        return this.subject;
    }

    @aa1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @aa1
    public final String getUpdateBy() {
        return this.updateBy;
    }

    @aa1
    public final String getUserId() {
        return this.userId;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.orderNum.hashCode() * 31) + this.userId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.eleId.hashCode()) * 31) + this.elePath.hashCode()) * 31) + this.subject.hashCode()) * 31) + this.payType.hashCode()) * 31) + this.payStatus.hashCode()) * 31) + Float.hashCode(this.amount)) * 31) + this.priceUnit.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.id.hashCode()) * 31) + this.version.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAmount(float r1) {
        this.amount = r1;
    }

    public final void setCreatedAt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createdAt = r2;
    }

    public final void setCreatedBy(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.createdBy = r2;
    }

    public final void setEleId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.eleId = r2;
    }

    public final void setElePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.elePath = r2;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderNum = r2;
    }

    public final void setOrderType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderType = r2;
    }

    public final void setPayStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.payStatus = r2;
    }

    public final void setPayType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.payType = r2;
    }

    public final void setPriceUnit(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.priceUnit = r2;
    }

    public final void setRemark(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.remark = r2;
    }

    public final void setSubject(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.subject = r2;
    }

    public final void setUpdateAt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateAt = r2;
    }

    public final void setUpdateBy(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.updateBy = r2;
    }

    public final void setUserId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.userId = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "OrderContentData(orderNum=" + this.orderNum + ", userId=" + this.userId + ", orderType=" + this.orderType + ", eleId=" + this.eleId + ", elePath=" + this.elePath + ", subject=" + this.subject + ", payType=" + this.payType + ", payStatus=" + this.payStatus + ", amount=" + this.amount + ", priceUnit=" + this.priceUnit + ", remark=" + this.remark + ", id=" + this.id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.iO.iO;
    }

    public OrderContentData(@aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, float r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33) {
        Intrinsics.X0O(r17, "orderNum");
        Intrinsics.X0O(r18, "userId");
        Intrinsics.X0O(r19, "orderType");
        Intrinsics.X0O(r20, "eleId");
        Intrinsics.X0O(r21, "elePath");
        Intrinsics.X0O(r22, "subject");
        Intrinsics.X0O(r23, "payType");
        Intrinsics.X0O(r24, "payStatus");
        Intrinsics.X0O(r26, "priceUnit");
        Intrinsics.X0O(r27, UploadOtaRecord.REMARK);
        Intrinsics.X0O(r28, "id");
        Intrinsics.X0O(r29, "version");
        Intrinsics.X0O(r30, "createdBy");
        Intrinsics.X0O(r31, "createdAt");
        Intrinsics.X0O(r32, "updateBy");
        Intrinsics.X0O(r33, "updateAt");
        this.orderNum = r17;
        this.userId = r18;
        this.orderType = r19;
        this.eleId = r20;
        this.elePath = r21;
        this.subject = r22;
        this.payType = r23;
        this.payStatus = r24;
        this.amount = r25;
        this.priceUnit = r26;
        this.remark = r27;
        this.id = r28;
        this.version = r29;
        this.createdBy = r30;
        this.createdAt = r31;
        this.updateBy = r32;
        this.updateAt = r33;
    }

    public /* synthetic */ OrderContentData(String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, float r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, DefaultConstructorMarker r37) {
        if ((r36 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r36 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r36 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = "0";
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r36 & 256) == 0) goto L37;
        float r10 = 0.0f;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r36 & 8192) == 0) goto L57;
        String r15 = "";
    L58:
        String r110 = r1;
        if ((r36 & 16384) == 0) goto L61;
        String r2 = "";
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r16 = "";
    L67:
        if ((r36 & 65536) == 0) goto L70;
        String r38 = "";
    L71:
        this(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r38);
        return;
    L70:
        r38 = r35;
        goto L71
    L65:
        r16 = r34;
        goto L67
    L61:
        r2 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L58
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
