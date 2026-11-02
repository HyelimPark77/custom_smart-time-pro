package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX INFO: renamed from: id */
    @aa1
    private String f51316id;

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
        this(null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ OrderContentData copy$default(OrderContentData orderContentData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, Object obj) {
        String str17;
        String str18;
        String str19 = (i & 1) != 0 ? orderContentData.orderNum : str;
        String str20 = (i & 2) != 0 ? orderContentData.userId : str2;
        String str21 = (i & 4) != 0 ? orderContentData.orderType : str3;
        String str22 = (i & 8) != 0 ? orderContentData.eleId : str4;
        String str23 = (i & 16) != 0 ? orderContentData.elePath : str5;
        String str24 = (i & 32) != 0 ? orderContentData.subject : str6;
        String str25 = (i & 64) != 0 ? orderContentData.payType : str7;
        String str26 = (i & 128) != 0 ? orderContentData.payStatus : str8;
        float f2 = (i & 256) != 0 ? orderContentData.amount : f;
        String str27 = (i & 512) != 0 ? orderContentData.priceUnit : str9;
        String str28 = (i & 1024) != 0 ? orderContentData.remark : str10;
        String str29 = (i & 2048) != 0 ? orderContentData.f51316id : str11;
        String str30 = (i & 4096) != 0 ? orderContentData.version : str12;
        String str31 = (i & 8192) != 0 ? orderContentData.createdBy : str13;
        String str32 = str19;
        String str33 = (i & 16384) != 0 ? orderContentData.createdAt : str14;
        String str34 = (i & 32768) != 0 ? orderContentData.updateBy : str15;
        if ((i & 65536) != 0) {
            str18 = str34;
            str17 = orderContentData.updateAt;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return orderContentData.copy(str32, str20, str21, str22, str23, str24, str25, str26, f2, str27, str28, str29, str30, str31, str33, str18, str17);
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
        return this.f51316id;
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
    public final OrderContentData copy(@aa1 String orderNum, @aa1 String userId, @aa1 String orderType, @aa1 String eleId, @aa1 String elePath, @aa1 String subject, @aa1 String payType, @aa1 String payStatus, float f, @aa1 String priceUnit, @aa1 String remark, @aa1 String id, @aa1 String version, @aa1 String createdBy, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(elePath, "elePath");
        Intrinsics.X0O(subject, "subject");
        Intrinsics.X0O(payType, "payType");
        Intrinsics.X0O(payStatus, "payStatus");
        Intrinsics.X0O(priceUnit, "priceUnit");
        Intrinsics.X0O(remark, "remark");
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(createdBy, "createdBy");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateBy, "updateBy");
        Intrinsics.X0O(updateAt, "updateAt");
        return new OrderContentData(orderNum, userId, orderType, eleId, elePath, subject, payType, payStatus, f, priceUnit, remark, id, version, createdBy, createdAt, updateBy, updateAt);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderContentData)) {
            return false;
        }
        OrderContentData orderContentData = (OrderContentData) obj;
        return Intrinsics.XOO0ii0(this.orderNum, orderContentData.orderNum) && Intrinsics.XOO0ii0(this.userId, orderContentData.userId) && Intrinsics.XOO0ii0(this.orderType, orderContentData.orderType) && Intrinsics.XOO0ii0(this.eleId, orderContentData.eleId) && Intrinsics.XOO0ii0(this.elePath, orderContentData.elePath) && Intrinsics.XOO0ii0(this.subject, orderContentData.subject) && Intrinsics.XOO0ii0(this.payType, orderContentData.payType) && Intrinsics.XOO0ii0(this.payStatus, orderContentData.payStatus) && Float.compare(this.amount, orderContentData.amount) == 0 && Intrinsics.XOO0ii0(this.priceUnit, orderContentData.priceUnit) && Intrinsics.XOO0ii0(this.remark, orderContentData.remark) && Intrinsics.XOO0ii0(this.f51316id, orderContentData.f51316id) && Intrinsics.XOO0ii0(this.version, orderContentData.version) && Intrinsics.XOO0ii0(this.createdBy, orderContentData.createdBy) && Intrinsics.XOO0ii0(this.createdAt, orderContentData.createdAt) && Intrinsics.XOO0ii0(this.updateBy, orderContentData.updateBy) && Intrinsics.XOO0ii0(this.updateAt, orderContentData.updateAt);
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
        return this.f51316id;
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
        return (((((((((((((((((((((((((((((((this.orderNum.hashCode() * 31) + this.userId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.eleId.hashCode()) * 31) + this.elePath.hashCode()) * 31) + this.subject.hashCode()) * 31) + this.payType.hashCode()) * 31) + this.payStatus.hashCode()) * 31) + Float.hashCode(this.amount)) * 31) + this.priceUnit.hashCode()) * 31) + this.remark.hashCode()) * 31) + this.f51316id.hashCode()) * 31) + this.version.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateBy.hashCode()) * 31) + this.updateAt.hashCode();
    }

    public final void setAmount(float f) {
        this.amount = f;
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

    public final void setElePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.elePath = str;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f51316id = str;
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

    public final void setPriceUnit(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.priceUnit = str;
    }

    public final void setRemark(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.remark = str;
    }

    public final void setSubject(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.subject = str;
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

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "OrderContentData(orderNum=" + this.orderNum + ", userId=" + this.userId + ", orderType=" + this.orderType + ", eleId=" + this.eleId + ", elePath=" + this.elePath + ", subject=" + this.subject + ", payType=" + this.payType + ", payStatus=" + this.payStatus + ", amount=" + this.amount + ", priceUnit=" + this.priceUnit + ", remark=" + this.remark + ", id=" + this.f51316id + ", version=" + this.version + ", createdBy=" + this.createdBy + ", createdAt=" + this.createdAt + ", updateBy=" + this.updateBy + ", updateAt=" + this.updateAt + I000IiI1O.C2156iO.f1007iO;
    }

    public OrderContentData(@aa1 String orderNum, @aa1 String userId, @aa1 String orderType, @aa1 String eleId, @aa1 String elePath, @aa1 String subject, @aa1 String payType, @aa1 String payStatus, float f, @aa1 String priceUnit, @aa1 String remark, @aa1 String id, @aa1 String version, @aa1 String createdBy, @aa1 String createdAt, @aa1 String updateBy, @aa1 String updateAt) {
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(elePath, "elePath");
        Intrinsics.X0O(subject, "subject");
        Intrinsics.X0O(payType, "payType");
        Intrinsics.X0O(payStatus, "payStatus");
        Intrinsics.X0O(priceUnit, "priceUnit");
        Intrinsics.X0O(remark, "remark");
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
        this.elePath = elePath;
        this.subject = subject;
        this.payType = payType;
        this.payStatus = payStatus;
        this.amount = f;
        this.priceUnit = priceUnit;
        this.remark = remark;
        this.f51316id = id;
        this.version = version;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public /* synthetic */ OrderContentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "0" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? 0.0f : f, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16);
    }
}
