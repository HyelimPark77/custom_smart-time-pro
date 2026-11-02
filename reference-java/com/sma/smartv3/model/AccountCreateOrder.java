package com.sma.smartv3.model;

import androidx.compose.p554ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX INFO: renamed from: id */
    @aa1
    private String f51295id;

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
        this(null, null, null, null, null, null, 0.0d, null, null, null, null, null, null, null, null, LayoutKt.LargeDimension, null);
    }

    @aa1
    public final String component1() {
        return this.orderNum;
    }

    @aa1
    public final String component10() {
        return this.f51295id;
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
    public final AccountCreateOrder copy(@aa1 String orderNum, @aa1 String userId, @aa1 String orderType, @aa1 String eleId, @aa1 String payType, @aa1 String payStatus, double d, @aa1 String remark, @aa1 String valid, @aa1 String id, @aa1 String version, @aa1 String createdBy, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(payType, "payType");
        Intrinsics.X0O(payStatus, "payStatus");
        Intrinsics.X0O(remark, "remark");
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(updateAt, "updateAt");
        return new AccountCreateOrder(orderNum, userId, orderType, eleId, payType, payStatus, d, remark, valid, id, version, createdBy, createdAt, updateBy, updateAt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCreateOrder)) {
            return false;
        }
        AccountCreateOrder accountCreateOrder = (AccountCreateOrder) obj;
        return Intrinsics.XOO0ii0(this.orderNum, accountCreateOrder.orderNum) && Intrinsics.XOO0ii0(this.userId, accountCreateOrder.userId) && Intrinsics.XOO0ii0(this.orderType, accountCreateOrder.orderType) && Intrinsics.XOO0ii0(this.eleId, accountCreateOrder.eleId) && Intrinsics.XOO0ii0(this.payType, accountCreateOrder.payType) && Intrinsics.XOO0ii0(this.payStatus, accountCreateOrder.payStatus) && Double.compare(this.amount, accountCreateOrder.amount) == 0 && Intrinsics.XOO0ii0(this.remark, accountCreateOrder.remark) && Intrinsics.XOO0ii0(this.valid, accountCreateOrder.valid) && Intrinsics.XOO0ii0(this.f51295id, accountCreateOrder.f51295id) && Intrinsics.XOO0ii0(this.version, accountCreateOrder.version) && Intrinsics.XOO0ii0(this.createdBy, accountCreateOrder.createdBy) && Intrinsics.XOO0ii0(this.createdAt, accountCreateOrder.createdAt) && Intrinsics.XOO0ii0(this.updateBy, accountCreateOrder.updateBy) && Intrinsics.XOO0ii0(this.updateAt, accountCreateOrder.updateAt);
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
        return this.f51295id;
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
        return (((((((((((((((((((((((((((this.orderNum.hashCode() * 31) + this.userId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.eleId.hashCode()) * 31) + this.payType.hashCode()) * 31) + this.payStatus.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.remark.hashCode()) * 31) + this.valid.hashCode()) * 31) + this.f51295id.hashCode()) * 31) + this.version.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setCreatedAt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setCreatedBy(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.createdBy = str;
    }

    public final void setEleId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.eleId = str;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f51295id = str;
    }

    public final void setOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderNum = str;
    }

    public final void setOrderType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderType = str;
    }

    public final void setPayStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.payStatus = str;
    }

    public final void setPayType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.payType = str;
    }

    public final void setRemark(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.remark = str;
    }

    public final void setUpdateAt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateAt = str;
    }

    public final void setUpdateBy(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.updateBy = str;
    }

    public final void setUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.userId = str;
    }

    public final void setValid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.valid = str;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "AccountCreateOrder(orderNum=" + this.orderNum + ", userId=" + this.userId + ", orderType=" + this.orderType + ", eleId=" + this.eleId + ", payType=" + this.payType + ", payStatus=" + this.payStatus + ", amount=" + this.amount + ", remark=" + this.remark + ", valid=" + this.valid + ", id=" + this.f51295id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.C2156iO.f1007iO;
    }

    public AccountCreateOrder(@aa1 String orderNum, @aa1 String userId, @aa1 String orderType, @aa1 String eleId, @aa1 String payType, @aa1 String payStatus, double d, @aa1 String remark, @aa1 String valid, @aa1 String id, @aa1 String version, @aa1 String createdBy, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(payType, "payType");
        Intrinsics.X0O(payStatus, "payStatus");
        Intrinsics.X0O(remark, "remark");
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(updateAt, "updateAt");
        this.orderNum = orderNum;
        this.userId = userId;
        this.orderType = orderType;
        this.eleId = eleId;
        this.payType = payType;
        this.payStatus = payStatus;
        this.amount = d;
        this.remark = remark;
        this.valid = valid;
        this.f51295id = id;
        this.version = version;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public /* synthetic */ AccountCreateOrder(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14);
    }
}
