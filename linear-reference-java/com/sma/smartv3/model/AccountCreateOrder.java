package com.sma.smartv3.model;

import androidx.compose.ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.UploadOtaRecord;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountCreateOrder extends JsonFieldContainer implements Serializable {
    private double amount;

    @aa1
    private String createdAt;

    @aa1
    private String createdBy;

    @aa1
    private String eleId;

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
    private String remark;

    @aa1
    private String updateAt;

    @aa1
    private String updateBy;

    @aa1
    private String userId;

    @aa1
    private String valid;

    @aa1
    private String version;

    public AccountCreateOrder() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        double r7 = 0.0d;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, LayoutKt.LargeDimension, null);
    }

    public static /* synthetic */ AccountCreateOrder copy$default(AccountCreateOrder r16, String r17, String r18, String r19, String r20, String r21, String r22, double r23, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, int r33, Object r34) {
        if ((r33 & 1) == 0) goto L5;
        String r2 = r16.orderNum;
    L7:
        if ((r33 & 2) == 0) goto L9;
        String r3 = r16.userId;
    L11:
        if ((r33 & 4) == 0) goto L13;
        String r4 = r16.orderType;
    L15:
        if ((r33 & 8) == 0) goto L17;
        String r5 = r16.eleId;
    L19:
        if ((r33 & 16) == 0) goto L21;
        String r6 = r16.payType;
    L23:
        if ((r33 & 32) == 0) goto L25;
        String r7 = r16.payStatus;
    L27:
        if ((r33 & 64) == 0) goto L29;
        double r8 = r16.amount;
    L31:
        if ((r33 & 128) == 0) goto L33;
        String r10 = r16.remark;
    L35:
        if ((r33 & 256) == 0) goto L37;
        String r11 = r16.valid;
    L39:
        if ((r33 & 512) == 0) goto L41;
        String r12 = r16.id;
    L43:
        if ((r33 & 1024) == 0) goto L45;
        String r13 = r16.version;
    L47:
        if ((r33 & 2048) == 0) goto L49;
        String r14 = r16.createdBy;
    L51:
        if ((r33 & 4096) == 0) goto L53;
        String r15 = r16.createdAt;
    L54:
        String r110 = r2;
        if ((r33 & 8192) == 0) goto L57;
        String r9 = r16.updateBy;
    L59:
        if ((r33 & 16384) == 0) goto L62;
        String r35 = r16.updateAt;
    L64:
        return r16.copy(r110, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r9, r35);
    L62:
        r35 = r32;
        goto L64
    L57:
        r9 = r31;
        goto L59
    L53:
        r15 = r30;
        goto L54
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
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
        return this.orderNum;
    }

    @aa1
    public final String component10() {
        return this.id;
    }

    @aa1
    public final String component11() {
        return this.version;
    }

    @aa1
    public final String component12() {
        return this.createdBy;
    }

    @aa1
    public final String component13() {
        return this.createdAt;
    }

    @aa1
    public final String component14() {
        return this.updateBy;
    }

    @aa1
    public final String component15() {
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
        return this.payType;
    }

    @aa1
    public final String component6() {
        return this.payStatus;
    }

    public final double component7() {
        return this.amount;
    }

    @aa1
    public final String component8() {
        return this.remark;
    }

    @aa1
    public final String component9() {
        return this.valid;
    }

    @aa1
    public final AccountCreateOrder copy(@aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, double r25, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34) {
        Intrinsics.X0O(r19, "orderNum");
        Intrinsics.X0O(r20, "userId");
        Intrinsics.X0O(r21, "orderType");
        Intrinsics.X0O(r22, "eleId");
        Intrinsics.X0O(r23, "payType");
        Intrinsics.X0O(r24, "payStatus");
        Intrinsics.X0O(r27, UploadOtaRecord.REMARK);
        Intrinsics.X0O(r28, "valid");
        Intrinsics.X0O(r29, "id");
        Intrinsics.X0O(r30, "version");
        Intrinsics.X0O(r31, "createdBy");
        Intrinsics.X0O(r32, "createdAt");
        Intrinsics.X0O(r33, "updateBy");
        Intrinsics.X0O(r34, "updateAt");
        return new AccountCreateOrder(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AccountCreateOrder) == true) goto L8;
        return false;
    L8:
        AccountCreateOrder r9 = (AccountCreateOrder) r8;
        if (Intrinsics.XOO0ii0(this.orderNum, r9.orderNum) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.userId, r9.userId) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.orderType, r9.orderType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.eleId, r9.eleId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.payType, r9.payType) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.payStatus, r9.payStatus) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.amount, r9.amount) == 0) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.remark, r9.remark) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.valid, r9.valid) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.id, r9.id) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.version, r9.version) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.createdBy, r9.createdBy) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.createdAt, r9.createdAt) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.updateBy, r9.updateBy) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.updateAt, r9.updateAt) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final double getAmount() {
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
    public final String getRemark() {
        return this.remark;
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
    public final String getValid() {
        return this.valid;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.orderNum.hashCode() * 31) + this.userId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.eleId.hashCode()) * 31) + this.payType.hashCode()) * 31) + this.payStatus.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.remark.hashCode()) * 31) + this.valid.hashCode()) * 31) + this.id.hashCode()) * 31) + this.version.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAmount(double r1) {
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

    public final void setRemark(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.remark = r2;
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

    public final void setValid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.valid = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "AccountCreateOrder(orderNum=" + this.orderNum + ", userId=" + this.userId + ", orderType=" + this.orderType + ", eleId=" + this.eleId + ", payType=" + this.payType + ", payStatus=" + this.payStatus + ", amount=" + this.amount + ", remark=" + this.remark + ", valid=" + this.valid + ", id=" + this.id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.iO.iO;
    }

    public AccountCreateOrder(@aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, double r23, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32) {
        Intrinsics.X0O(r17, "orderNum");
        Intrinsics.X0O(r18, "userId");
        Intrinsics.X0O(r19, "orderType");
        Intrinsics.X0O(r20, "eleId");
        Intrinsics.X0O(r21, "payType");
        Intrinsics.X0O(r22, "payStatus");
        Intrinsics.X0O(r25, UploadOtaRecord.REMARK);
        Intrinsics.X0O(r26, "valid");
        Intrinsics.X0O(r27, "id");
        Intrinsics.X0O(r28, "version");
        Intrinsics.X0O(r29, "createdBy");
        Intrinsics.X0O(r30, "createdAt");
        Intrinsics.X0O(r31, "updateBy");
        Intrinsics.X0O(r32, "updateAt");
        this.orderNum = r17;
        this.userId = r18;
        this.orderType = r19;
        this.eleId = r20;
        this.payType = r21;
        this.payStatus = r22;
        this.amount = r23;
        this.remark = r25;
        this.valid = r26;
        this.id = r27;
        this.version = r28;
        this.createdBy = r29;
        this.createdAt = r30;
        this.updateBy = r31;
        this.updateAt = r32;
    }

    public /* synthetic */ AccountCreateOrder(String r17, String r18, String r19, String r20, String r21, String r22, double r23, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, int r33, DefaultConstructorMarker r34) {
        if ((r33 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r33 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r33 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r33 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r33 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r33 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r33 & 64) == 0) goto L29;
        double r8 = 0.0d;
    L31:
        if ((r33 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r33 & 256) == 0) goto L37;
        String r11 = "";
    L39:
        if ((r33 & 512) == 0) goto L41;
        String r12 = "";
    L43:
        if ((r33 & 1024) == 0) goto L45;
        String r13 = "";
    L47:
        if ((r33 & 2048) == 0) goto L49;
        String r14 = "";
    L51:
        if ((r33 & 4096) == 0) goto L53;
        String r15 = "";
    L54:
        String r110 = r1;
        if ((r33 & 8192) == 0) goto L57;
        String r2 = "";
    L59:
        if ((r33 & 16384) == 0) goto L62;
        String r35 = "";
    L63:
        this(r110, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r2, r35);
        return;
    L62:
        r35 = r32;
        goto L63
    L57:
        r2 = r31;
        goto L59
    L53:
        r15 = r30;
        goto L54
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
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
