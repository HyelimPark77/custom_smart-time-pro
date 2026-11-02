package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TranslateOrderItemEntity {

    @tb1
    private final Double amount;

    @tb1
    private final String buyerId;

    @tb1
    private final String createdAt;

    @tb1
    private final String createdBy;

    @tb1
    private final Object eleExtraId;

    @tb1
    private final Long eleId;

    @tb1
    private final Object elePath;

    /* JADX INFO: renamed from: id */
    @tb1
    private final Integer f54945id;

    @tb1
    private final String orderNum;

    @tb1
    private final String orderType;

    @tb1
    private final String orderTypeName;

    @tb1
    private final String payStatus;

    @aa1
    private final String payStatusName;

    @tb1
    private final String payTime;

    @tb1
    private final String payType;

    @tb1
    private final String payTypeName;

    @tb1
    private final String priceUnit;

    @tb1
    private final Integer projectId;

    @tb1
    private final String projectName;

    @tb1
    private final Object refundedTime;

    @tb1
    private final String remark;

    @tb1
    private final Boolean sandboxFlag;

    @tb1
    private final Boolean sendProductFlag;

    @tb1
    private final String subject;

    @tb1
    private final String thirdUserId;

    @tb1
    private final String tradeNo;

    @tb1
    private final Double transAmount;

    @tb1
    private final String updateAt;

    @tb1
    private final Object updateBy;

    @tb1
    private final Integer userId;

    @tb1
    private final String userNickName;

    @tb1
    private final Integer valid;

    @tb1
    private final Integer version;

    public TranslateOrderItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }

    public static /* synthetic */ TranslateOrderItemEntity copy$default(TranslateOrderItemEntity translateOrderItemEntity, Double d, String str, String str2, String str3, Object obj, Long l, Object obj2, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, String str13, Object obj3, String str14, Boolean bool, Boolean bool2, String str15, String str16, String str17, Double d2, String str18, Object obj4, Integer num3, String str19, Integer num4, Integer num5, int i, int i2, Object obj5) {
        Integer num6;
        Integer num7;
        Double d3 = (i & 1) != 0 ? translateOrderItemEntity.amount : d;
        String str20 = (i & 2) != 0 ? translateOrderItemEntity.buyerId : str;
        String str21 = (i & 4) != 0 ? translateOrderItemEntity.createdAt : str2;
        String str22 = (i & 8) != 0 ? translateOrderItemEntity.createdBy : str3;
        Object obj6 = (i & 16) != 0 ? translateOrderItemEntity.eleExtraId : obj;
        Long l2 = (i & 32) != 0 ? translateOrderItemEntity.eleId : l;
        Object obj7 = (i & 64) != 0 ? translateOrderItemEntity.elePath : obj2;
        Integer num8 = (i & 128) != 0 ? translateOrderItemEntity.f54945id : num;
        String str23 = (i & 256) != 0 ? translateOrderItemEntity.orderNum : str4;
        String str24 = (i & 512) != 0 ? translateOrderItemEntity.orderType : str5;
        String str25 = (i & 1024) != 0 ? translateOrderItemEntity.orderTypeName : str6;
        String str26 = (i & 2048) != 0 ? translateOrderItemEntity.payStatus : str7;
        String str27 = (i & 4096) != 0 ? translateOrderItemEntity.payStatusName : str8;
        String str28 = (i & 8192) != 0 ? translateOrderItemEntity.payTime : str9;
        Double d4 = d3;
        String str29 = (i & 16384) != 0 ? translateOrderItemEntity.payType : str10;
        String str30 = (i & 32768) != 0 ? translateOrderItemEntity.payTypeName : str11;
        String str31 = (i & 65536) != 0 ? translateOrderItemEntity.priceUnit : str12;
        Integer num9 = (i & 131072) != 0 ? translateOrderItemEntity.projectId : num2;
        String str32 = (i & 262144) != 0 ? translateOrderItemEntity.projectName : str13;
        Object obj8 = (i & 524288) != 0 ? translateOrderItemEntity.refundedTime : obj3;
        String str33 = (i & 1048576) != 0 ? translateOrderItemEntity.remark : str14;
        Boolean bool3 = (i & 2097152) != 0 ? translateOrderItemEntity.sandboxFlag : bool;
        Boolean bool4 = (i & 4194304) != 0 ? translateOrderItemEntity.sendProductFlag : bool2;
        String str34 = (i & 8388608) != 0 ? translateOrderItemEntity.subject : str15;
        String str35 = (i & 16777216) != 0 ? translateOrderItemEntity.thirdUserId : str16;
        String str36 = (i & 33554432) != 0 ? translateOrderItemEntity.tradeNo : str17;
        Double d5 = (i & 67108864) != 0 ? translateOrderItemEntity.transAmount : d2;
        String str37 = (i & 134217728) != 0 ? translateOrderItemEntity.updateAt : str18;
        Object obj9 = (i & 268435456) != 0 ? translateOrderItemEntity.updateBy : obj4;
        Integer num10 = (i & 536870912) != 0 ? translateOrderItemEntity.userId : num3;
        String str38 = (i & 1073741824) != 0 ? translateOrderItemEntity.userNickName : str19;
        Integer num11 = (i & Integer.MIN_VALUE) != 0 ? translateOrderItemEntity.valid : num4;
        if ((i2 & 1) != 0) {
            num7 = num11;
            num6 = translateOrderItemEntity.version;
        } else {
            num6 = num5;
            num7 = num11;
        }
        return translateOrderItemEntity.copy(d4, str20, str21, str22, obj6, l2, obj7, num8, str23, str24, str25, str26, str27, str28, str29, str30, str31, num9, str32, obj8, str33, bool3, bool4, str34, str35, str36, d5, str37, obj9, num10, str38, num7, num6);
    }

    @tb1
    public final Double component1() {
        return this.amount;
    }

    @tb1
    public final String component10() {
        return this.orderType;
    }

    @tb1
    public final String component11() {
        return this.orderTypeName;
    }

    @tb1
    public final String component12() {
        return this.payStatus;
    }

    @aa1
    public final String component13() {
        return this.payStatusName;
    }

    @tb1
    public final String component14() {
        return this.payTime;
    }

    @tb1
    public final String component15() {
        return this.payType;
    }

    @tb1
    public final String component16() {
        return this.payTypeName;
    }

    @tb1
    public final String component17() {
        return this.priceUnit;
    }

    @tb1
    public final Integer component18() {
        return this.projectId;
    }

    @tb1
    public final String component19() {
        return this.projectName;
    }

    @tb1
    public final String component2() {
        return this.buyerId;
    }

    @tb1
    public final Object component20() {
        return this.refundedTime;
    }

    @tb1
    public final String component21() {
        return this.remark;
    }

    @tb1
    public final Boolean component22() {
        return this.sandboxFlag;
    }

    @tb1
    public final Boolean component23() {
        return this.sendProductFlag;
    }

    @tb1
    public final String component24() {
        return this.subject;
    }

    @tb1
    public final String component25() {
        return this.thirdUserId;
    }

    @tb1
    public final String component26() {
        return this.tradeNo;
    }

    @tb1
    public final Double component27() {
        return this.transAmount;
    }

    @tb1
    public final String component28() {
        return this.updateAt;
    }

    @tb1
    public final Object component29() {
        return this.updateBy;
    }

    @tb1
    public final String component3() {
        return this.createdAt;
    }

    @tb1
    public final Integer component30() {
        return this.userId;
    }

    @tb1
    public final String component31() {
        return this.userNickName;
    }

    @tb1
    public final Integer component32() {
        return this.valid;
    }

    @tb1
    public final Integer component33() {
        return this.version;
    }

    @tb1
    public final String component4() {
        return this.createdBy;
    }

    @tb1
    public final Object component5() {
        return this.eleExtraId;
    }

    @tb1
    public final Long component6() {
        return this.eleId;
    }

    @tb1
    public final Object component7() {
        return this.elePath;
    }

    @tb1
    public final Integer component8() {
        return this.f54945id;
    }

    @tb1
    public final String component9() {
        return this.orderNum;
    }

    @aa1
    public final TranslateOrderItemEntity copy(@tb1 Double d, @tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 Object obj, @tb1 Long l, @tb1 Object obj2, @tb1 Integer num, @tb1 String str4, @tb1 String str5, @tb1 String str6, @tb1 String str7, @aa1 String payStatusName, @tb1 String str8, @tb1 String str9, @tb1 String str10, @tb1 String str11, @tb1 Integer num2, @tb1 String str12, @tb1 Object obj3, @tb1 String str13, @tb1 Boolean bool, @tb1 Boolean bool2, @tb1 String str14, @tb1 String str15, @tb1 String str16, @tb1 Double d2, @tb1 String str17, @tb1 Object obj4, @tb1 Integer num3, @tb1 String str18, @tb1 Integer num4, @tb1 Integer num5) {
        Intrinsics.X0O(payStatusName, "payStatusName");
        return new TranslateOrderItemEntity(d, str, str2, str3, obj, l, obj2, num, str4, str5, str6, str7, payStatusName, str8, str9, str10, str11, num2, str12, obj3, str13, bool, bool2, str14, str15, str16, d2, str17, obj4, num3, str18, num4, num5);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateOrderItemEntity)) {
            return false;
        }
        TranslateOrderItemEntity translateOrderItemEntity = (TranslateOrderItemEntity) obj;
        return Intrinsics.XOO0ii0(this.amount, translateOrderItemEntity.amount) && Intrinsics.XOO0ii0(this.buyerId, translateOrderItemEntity.buyerId) && Intrinsics.XOO0ii0(this.createdAt, translateOrderItemEntity.createdAt) && Intrinsics.XOO0ii0(this.createdBy, translateOrderItemEntity.createdBy) && Intrinsics.XOO0ii0(this.eleExtraId, translateOrderItemEntity.eleExtraId) && Intrinsics.XOO0ii0(this.eleId, translateOrderItemEntity.eleId) && Intrinsics.XOO0ii0(this.elePath, translateOrderItemEntity.elePath) && Intrinsics.XOO0ii0(this.f54945id, translateOrderItemEntity.f54945id) && Intrinsics.XOO0ii0(this.orderNum, translateOrderItemEntity.orderNum) && Intrinsics.XOO0ii0(this.orderType, translateOrderItemEntity.orderType) && Intrinsics.XOO0ii0(this.orderTypeName, translateOrderItemEntity.orderTypeName) && Intrinsics.XOO0ii0(this.payStatus, translateOrderItemEntity.payStatus) && Intrinsics.XOO0ii0(this.payStatusName, translateOrderItemEntity.payStatusName) && Intrinsics.XOO0ii0(this.payTime, translateOrderItemEntity.payTime) && Intrinsics.XOO0ii0(this.payType, translateOrderItemEntity.payType) && Intrinsics.XOO0ii0(this.payTypeName, translateOrderItemEntity.payTypeName) && Intrinsics.XOO0ii0(this.priceUnit, translateOrderItemEntity.priceUnit) && Intrinsics.XOO0ii0(this.projectId, translateOrderItemEntity.projectId) && Intrinsics.XOO0ii0(this.projectName, translateOrderItemEntity.projectName) && Intrinsics.XOO0ii0(this.refundedTime, translateOrderItemEntity.refundedTime) && Intrinsics.XOO0ii0(this.remark, translateOrderItemEntity.remark) && Intrinsics.XOO0ii0(this.sandboxFlag, translateOrderItemEntity.sandboxFlag) && Intrinsics.XOO0ii0(this.sendProductFlag, translateOrderItemEntity.sendProductFlag) && Intrinsics.XOO0ii0(this.subject, translateOrderItemEntity.subject) && Intrinsics.XOO0ii0(this.thirdUserId, translateOrderItemEntity.thirdUserId) && Intrinsics.XOO0ii0(this.tradeNo, translateOrderItemEntity.tradeNo) && Intrinsics.XOO0ii0(this.transAmount, translateOrderItemEntity.transAmount) && Intrinsics.XOO0ii0(this.updateAt, translateOrderItemEntity.updateAt) && Intrinsics.XOO0ii0(this.updateBy, translateOrderItemEntity.updateBy) && Intrinsics.XOO0ii0(this.userId, translateOrderItemEntity.userId) && Intrinsics.XOO0ii0(this.userNickName, translateOrderItemEntity.userNickName) && Intrinsics.XOO0ii0(this.valid, translateOrderItemEntity.valid) && Intrinsics.XOO0ii0(this.version, translateOrderItemEntity.version);
    }

    @tb1
    public final Double getAmount() {
        return this.amount;
    }

    @tb1
    public final String getBuyerId() {
        return this.buyerId;
    }

    @tb1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @tb1
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @tb1
    public final Object getEleExtraId() {
        return this.eleExtraId;
    }

    @tb1
    public final Long getEleId() {
        return this.eleId;
    }

    @tb1
    public final Object getElePath() {
        return this.elePath;
    }

    @tb1
    public final Integer getId() {
        return this.f54945id;
    }

    @tb1
    public final String getOrderNum() {
        return this.orderNum;
    }

    @tb1
    public final String getOrderType() {
        return this.orderType;
    }

    @tb1
    public final String getOrderTypeName() {
        return this.orderTypeName;
    }

    @tb1
    public final String getPayStatus() {
        return this.payStatus;
    }

    @aa1
    public final String getPayStatusName() {
        return this.payStatusName;
    }

    @tb1
    public final String getPayTime() {
        return this.payTime;
    }

    @tb1
    public final String getPayType() {
        return this.payType;
    }

    @tb1
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @tb1
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    @tb1
    public final Integer getProjectId() {
        return this.projectId;
    }

    @tb1
    public final String getProjectName() {
        return this.projectName;
    }

    @tb1
    public final Object getRefundedTime() {
        return this.refundedTime;
    }

    @tb1
    public final String getRemark() {
        return this.remark;
    }

    @tb1
    public final Boolean getSandboxFlag() {
        return this.sandboxFlag;
    }

    @tb1
    public final Boolean getSendProductFlag() {
        return this.sendProductFlag;
    }

    @tb1
    public final String getSubject() {
        return this.subject;
    }

    @tb1
    public final String getThirdUserId() {
        return this.thirdUserId;
    }

    @tb1
    public final String getTradeNo() {
        return this.tradeNo;
    }

    @tb1
    public final Double getTransAmount() {
        return this.transAmount;
    }

    @tb1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @tb1
    public final Object getUpdateBy() {
        return this.updateBy;
    }

    @tb1
    public final Integer getUserId() {
        return this.userId;
    }

    @tb1
    public final String getUserNickName() {
        return this.userNickName;
    }

    @tb1
    public final Integer getValid() {
        return this.valid;
    }

    @tb1
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Double d = this.amount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.buyerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdBy;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.eleExtraId;
        int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.eleId;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Object obj2 = this.elePath;
        int iHashCode7 = (iHashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.f54945id;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.orderNum;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderType;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderTypeName;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payStatus;
        int iHashCode12 = (((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.payStatusName.hashCode()) * 31;
        String str8 = this.payTime;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.payType;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.payTypeName;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.priceUnit;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.projectId;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.projectName;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Object obj3 = this.refundedTime;
        int iHashCode19 = (iHashCode18 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str13 = this.remark;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.sandboxFlag;
        int iHashCode21 = (iHashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.sendProductFlag;
        int iHashCode22 = (iHashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.subject;
        int iHashCode23 = (iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.thirdUserId;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.tradeNo;
        int iHashCode25 = (iHashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Double d2 = this.transAmount;
        int iHashCode26 = (iHashCode25 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str17 = this.updateAt;
        int iHashCode27 = (iHashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Object obj4 = this.updateBy;
        int iHashCode28 = (iHashCode27 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Integer num3 = this.userId;
        int iHashCode29 = (iHashCode28 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str18 = this.userNickName;
        int iHashCode30 = (iHashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num4 = this.valid;
        int iHashCode31 = (iHashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.version;
        return iHashCode31 + (num5 != null ? num5.hashCode() : 0);
    }

    @aa1
    public String toString() {
        return "TranslateOrderItemEntity(amount=" + this.amount + ", buyerId=" + this.buyerId + ", createdAt=" + this.createdAt + ", createdBy=" + this.createdBy + ", eleExtraId=" + this.eleExtraId + ", eleId=" + this.eleId + ", elePath=" + this.elePath + ", id=" + this.f54945id + ", orderNum=" + this.orderNum + ", orderType=" + this.orderType + ", orderTypeName=" + this.orderTypeName + ", payStatus=" + this.payStatus + ", payStatusName=" + this.payStatusName + ", payTime=" + this.payTime + ", payType=" + this.payType + ", payTypeName=" + this.payTypeName + ", priceUnit=" + this.priceUnit + ", projectId=" + this.projectId + ", projectName=" + this.projectName + ", refundedTime=" + this.refundedTime + ", remark=" + this.remark + ", sandboxFlag=" + this.sandboxFlag + ", sendProductFlag=" + this.sendProductFlag + ", subject=" + this.subject + ", thirdUserId=" + this.thirdUserId + ", tradeNo=" + this.tradeNo + ", transAmount=" + this.transAmount + ", updateAt=" + this.updateAt + ", updateBy=" + this.updateBy + ", userId=" + this.userId + ", userNickName=" + this.userNickName + ", valid=" + this.valid + ", version=" + this.version + I000IiI1O.C2156iO.f1007iO;
    }

    public TranslateOrderItemEntity(@tb1 Double d, @tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 Object obj, @tb1 Long l, @tb1 Object obj2, @tb1 Integer num, @tb1 String str4, @tb1 String str5, @tb1 String str6, @tb1 String str7, @aa1 String payStatusName, @tb1 String str8, @tb1 String str9, @tb1 String str10, @tb1 String str11, @tb1 Integer num2, @tb1 String str12, @tb1 Object obj3, @tb1 String str13, @tb1 Boolean bool, @tb1 Boolean bool2, @tb1 String str14, @tb1 String str15, @tb1 String str16, @tb1 Double d2, @tb1 String str17, @tb1 Object obj4, @tb1 Integer num3, @tb1 String str18, @tb1 Integer num4, @tb1 Integer num5) {
        Intrinsics.X0O(payStatusName, "payStatusName");
        this.amount = d;
        this.buyerId = str;
        this.createdAt = str2;
        this.createdBy = str3;
        this.eleExtraId = obj;
        this.eleId = l;
        this.elePath = obj2;
        this.f54945id = num;
        this.orderNum = str4;
        this.orderType = str5;
        this.orderTypeName = str6;
        this.payStatus = str7;
        this.payStatusName = payStatusName;
        this.payTime = str8;
        this.payType = str9;
        this.payTypeName = str10;
        this.priceUnit = str11;
        this.projectId = num2;
        this.projectName = str12;
        this.refundedTime = obj3;
        this.remark = str13;
        this.sandboxFlag = bool;
        this.sendProductFlag = bool2;
        this.subject = str14;
        this.thirdUserId = str15;
        this.tradeNo = str16;
        this.transAmount = d2;
        this.updateAt = str17;
        this.updateBy = obj4;
        this.userId = num3;
        this.userNickName = str18;
        this.valid = num4;
        this.version = num5;
    }

    public /* synthetic */ TranslateOrderItemEntity(Double d, String str, String str2, String str3, Object obj, Long l, Object obj2, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num2, String str13, Object obj3, String str14, Boolean bool, Boolean bool2, String str15, String str16, String str17, Double d2, String str18, Object obj4, Integer num3, String str19, Integer num4, Integer num5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : obj2, (i & 128) != 0 ? null : num, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? "" : str12, (i & 131072) != 0 ? null : num2, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : obj3, (i & 1048576) != 0 ? null : str14, (i & 2097152) != 0 ? null : bool, (i & 4194304) != 0 ? null : bool2, (i & 8388608) == 0 ? str15 : "", (i & 16777216) != 0 ? null : str16, (i & 33554432) != 0 ? null : str17, (i & 67108864) != 0 ? null : d2, (i & 134217728) != 0 ? null : str18, (i & 268435456) != 0 ? null : obj4, (i & 536870912) != 0 ? null : num3, (i & 1073741824) != 0 ? null : str19, (i & Integer.MIN_VALUE) != 0 ? null : num4, (i2 & 1) != 0 ? null : num5);
    }
}
