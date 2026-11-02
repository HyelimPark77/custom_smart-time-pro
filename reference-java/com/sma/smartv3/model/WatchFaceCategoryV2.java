package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceCategoryV2 extends JsonFieldContainer implements Serializable {
    private final float amount;
    private float amountDis;

    @aa1
    private final String binUrl;

    @aa1
    private final String createdAt;

    @tb1
    private final String dialType;

    @aa1
    private String discount;
    private final float dollar;

    @aa1
    private String dollarCodeDis;
    private float dollarDis;

    /* JADX INFO: renamed from: id */
    private final int f51329id;
    private boolean limitFreeFlag;

    @aa1
    private String memberAttr;
    private boolean newFlag;

    @tb1
    private String payStatus;

    @aa1
    private final String previewUrl;

    @aa1
    private final String resolutionType;

    @aa1
    private final String screenType;

    @aa1
    private final String updateAt;
    private final int version;

    public WatchFaceCategoryV2() {
        this(null, 0, null, null, false, null, null, null, null, null, 0, 0.0f, 0.0f, null, false, null, 0.0f, 0.0f, null, 524287, null);
    }

    public static /* synthetic */ WatchFaceCategoryV2 copy$default(WatchFaceCategoryV2 watchFaceCategoryV2, String str, int i, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, int i2, float f, float f2, String str9, boolean z2, String str10, float f3, float f4, String str11, int i3, Object obj) {
        String str12;
        float f5;
        String str13 = (i3 & 1) != 0 ? watchFaceCategoryV2.screenType : str;
        int i4 = (i3 & 2) != 0 ? watchFaceCategoryV2.f51329id : i;
        String str14 = (i3 & 4) != 0 ? watchFaceCategoryV2.dialType : str2;
        String str15 = (i3 & 8) != 0 ? watchFaceCategoryV2.resolutionType : str3;
        boolean z3 = (i3 & 16) != 0 ? watchFaceCategoryV2.limitFreeFlag : z;
        String str16 = (i3 & 32) != 0 ? watchFaceCategoryV2.memberAttr : str4;
        String str17 = (i3 & 64) != 0 ? watchFaceCategoryV2.binUrl : str5;
        String str18 = (i3 & 128) != 0 ? watchFaceCategoryV2.previewUrl : str6;
        String str19 = (i3 & 256) != 0 ? watchFaceCategoryV2.createdAt : str7;
        String str20 = (i3 & 512) != 0 ? watchFaceCategoryV2.updateAt : str8;
        int i5 = (i3 & 1024) != 0 ? watchFaceCategoryV2.version : i2;
        float f6 = (i3 & 2048) != 0 ? watchFaceCategoryV2.amount : f;
        float f7 = (i3 & 4096) != 0 ? watchFaceCategoryV2.dollar : f2;
        String str21 = (i3 & 8192) != 0 ? watchFaceCategoryV2.payStatus : str9;
        String str22 = str13;
        boolean z4 = (i3 & 16384) != 0 ? watchFaceCategoryV2.newFlag : z2;
        String str23 = (i3 & 32768) != 0 ? watchFaceCategoryV2.discount : str10;
        float f8 = (i3 & 65536) != 0 ? watchFaceCategoryV2.amountDis : f3;
        float f9 = (i3 & 131072) != 0 ? watchFaceCategoryV2.dollarDis : f4;
        if ((i3 & 262144) != 0) {
            f5 = f9;
            str12 = watchFaceCategoryV2.dollarCodeDis;
        } else {
            str12 = str11;
            f5 = f9;
        }
        return watchFaceCategoryV2.copy(str22, i4, str14, str15, z3, str16, str17, str18, str19, str20, i5, f6, f7, str21, z4, str23, f8, f5, str12);
    }

    @aa1
    public final String component1() {
        return this.screenType;
    }

    @aa1
    public final String component10() {
        return this.updateAt;
    }

    public final int component11() {
        return this.version;
    }

    public final float component12() {
        return this.amount;
    }

    public final float component13() {
        return this.dollar;
    }

    @tb1
    public final String component14() {
        return this.payStatus;
    }

    public final boolean component15() {
        return this.newFlag;
    }

    @aa1
    public final String component16() {
        return this.discount;
    }

    public final float component17() {
        return this.amountDis;
    }

    public final float component18() {
        return this.dollarDis;
    }

    @aa1
    public final String component19() {
        return this.dollarCodeDis;
    }

    public final int component2() {
        return this.f51329id;
    }

    @tb1
    public final String component3() {
        return this.dialType;
    }

    @aa1
    public final String component4() {
        return this.resolutionType;
    }

    public final boolean component5() {
        return this.limitFreeFlag;
    }

    @aa1
    public final String component6() {
        return this.memberAttr;
    }

    @aa1
    public final String component7() {
        return this.binUrl;
    }

    @aa1
    public final String component8() {
        return this.previewUrl;
    }

    @aa1
    public final String component9() {
        return this.createdAt;
    }

    @aa1
    public final WatchFaceCategoryV2 copy(@aa1 String screenType, int i, @tb1 String str, @aa1 String resolutionType, boolean z, @aa1 String memberAttr, @aa1 String binUrl, @aa1 String previewUrl, @aa1 String createdAt, @aa1 String updateAt, int i2, float f, float f2, @tb1 String str2, boolean z2, @aa1 String discount, float f3, float f4, @aa1 String dollarCodeDis) {
        Intrinsics.X0O(screenType, "screenType");
        Intrinsics.X0O(resolutionType, "resolutionType");
        Intrinsics.X0O(memberAttr, "memberAttr");
        Intrinsics.X0O(binUrl, "binUrl");
        Intrinsics.X0O(previewUrl, "previewUrl");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(discount, "discount");
        Intrinsics.X0O(dollarCodeDis, "dollarCodeDis");
        return new WatchFaceCategoryV2(screenType, i, str, resolutionType, z, memberAttr, binUrl, previewUrl, createdAt, updateAt, i2, f, f2, str2, z2, discount, f3, f4, dollarCodeDis);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceCategoryV2)) {
            return false;
        }
        WatchFaceCategoryV2 watchFaceCategoryV2 = (WatchFaceCategoryV2) obj;
        return Intrinsics.XOO0ii0(this.screenType, watchFaceCategoryV2.screenType) && this.f51329id == watchFaceCategoryV2.f51329id && Intrinsics.XOO0ii0(this.dialType, watchFaceCategoryV2.dialType) && Intrinsics.XOO0ii0(this.resolutionType, watchFaceCategoryV2.resolutionType) && this.limitFreeFlag == watchFaceCategoryV2.limitFreeFlag && Intrinsics.XOO0ii0(this.memberAttr, watchFaceCategoryV2.memberAttr) && Intrinsics.XOO0ii0(this.binUrl, watchFaceCategoryV2.binUrl) && Intrinsics.XOO0ii0(this.previewUrl, watchFaceCategoryV2.previewUrl) && Intrinsics.XOO0ii0(this.createdAt, watchFaceCategoryV2.createdAt) && Intrinsics.XOO0ii0(this.updateAt, watchFaceCategoryV2.updateAt) && this.version == watchFaceCategoryV2.version && Float.compare(this.amount, watchFaceCategoryV2.amount) == 0 && Float.compare(this.dollar, watchFaceCategoryV2.dollar) == 0 && Intrinsics.XOO0ii0(this.payStatus, watchFaceCategoryV2.payStatus) && this.newFlag == watchFaceCategoryV2.newFlag && Intrinsics.XOO0ii0(this.discount, watchFaceCategoryV2.discount) && Float.compare(this.amountDis, watchFaceCategoryV2.amountDis) == 0 && Float.compare(this.dollarDis, watchFaceCategoryV2.dollarDis) == 0 && Intrinsics.XOO0ii0(this.dollarCodeDis, watchFaceCategoryV2.dollarCodeDis);
    }

    public final float getAmount() {
        return this.amount;
    }

    public final float getAmountDis() {
        return this.amountDis;
    }

    @aa1
    public final String getBinUrl() {
        return this.binUrl;
    }

    @aa1
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @tb1
    public final String getDialType() {
        return this.dialType;
    }

    @aa1
    public final String getDiscount() {
        return this.discount;
    }

    public final float getDollar() {
        return this.dollar;
    }

    @aa1
    public final String getDollarCodeDis() {
        return this.dollarCodeDis;
    }

    public final float getDollarDis() {
        return this.dollarDis;
    }

    public final int getId() {
        return this.f51329id;
    }

    public final boolean getLimitFreeFlag() {
        return this.limitFreeFlag;
    }

    @aa1
    public final String getMemberAttr() {
        return this.memberAttr;
    }

    public final boolean getNewFlag() {
        return this.newFlag;
    }

    @tb1
    public final String getPayStatus() {
        return this.payStatus;
    }

    @aa1
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    @aa1
    public final String getResolutionType() {
        return this.resolutionType;
    }

    @aa1
    public final String getScreenType() {
        return this.screenType;
    }

    @aa1
    public final String getUpdateAt() {
        return this.updateAt;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((this.screenType.hashCode() * 31) + Integer.hashCode(this.f51329id)) * 31;
        String str = this.dialType;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.resolutionType.hashCode()) * 31) + Boolean.hashCode(this.limitFreeFlag)) * 31) + this.memberAttr.hashCode()) * 31) + this.binUrl.hashCode()) * 31) + this.previewUrl.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateAt.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Float.hashCode(this.amount)) * 31) + Float.hashCode(this.dollar)) * 31;
        String str2 = this.payStatus;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.newFlag)) * 31) + this.discount.hashCode()) * 31) + Float.hashCode(this.amountDis)) * 31) + Float.hashCode(this.dollarDis)) * 31) + this.dollarCodeDis.hashCode();
    }

    public final void setAmountDis(float f) {
        this.amountDis = f;
    }

    public final void setDiscount(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.discount = str;
    }

    public final void setDollarCodeDis(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dollarCodeDis = str;
    }

    public final void setDollarDis(float f) {
        this.dollarDis = f;
    }

    public final void setLimitFreeFlag(boolean z) {
        this.limitFreeFlag = z;
    }

    public final void setMemberAttr(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.memberAttr = str;
    }

    public final void setNewFlag(boolean z) {
        this.newFlag = z;
    }

    public final void setPayStatus(@tb1 String str) {
        this.payStatus = str;
    }

    @aa1
    public String toString() {
        return "WatchFaceCategoryV2(screenType=" + this.screenType + ", id=" + this.f51329id + ", dialType=" + this.dialType + ", resolutionType=" + this.resolutionType + ", limitFreeFlag=" + this.limitFreeFlag + ", memberAttr=" + this.memberAttr + ", binUrl=" + this.binUrl + ", previewUrl=" + this.previewUrl + ", createdAt=" + this.createdAt + ", updateAt=" + this.updateAt + ", version=" + this.version + ", amount=" + this.amount + ", dollar=" + this.dollar + ", payStatus=" + this.payStatus + ", newFlag=" + this.newFlag + ", discount=" + this.discount + ", amountDis=" + this.amountDis + ", dollarDis=" + this.dollarDis + ", dollarCodeDis=" + this.dollarCodeDis + I000IiI1O.C2156iO.f1007iO;
    }

    public WatchFaceCategoryV2(@aa1 String screenType, int i, @tb1 String str, @aa1 String resolutionType, boolean z, @aa1 String memberAttr, @aa1 String binUrl, @aa1 String previewUrl, @aa1 String createdAt, @aa1 String updateAt, int i2, float f, float f2, @tb1 String str2, boolean z2, @aa1 String discount, float f3, float f4, @aa1 String dollarCodeDis) {
        Intrinsics.X0O(screenType, "screenType");
        Intrinsics.X0O(resolutionType, "resolutionType");
        Intrinsics.X0O(memberAttr, "memberAttr");
        Intrinsics.X0O(binUrl, "binUrl");
        Intrinsics.X0O(previewUrl, "previewUrl");
        Intrinsics.X0O(createdAt, "createdAt");
        Intrinsics.X0O(updateAt, "updateAt");
        Intrinsics.X0O(discount, "discount");
        Intrinsics.X0O(dollarCodeDis, "dollarCodeDis");
        this.screenType = screenType;
        this.f51329id = i;
        this.dialType = str;
        this.resolutionType = resolutionType;
        this.limitFreeFlag = z;
        this.memberAttr = memberAttr;
        this.binUrl = binUrl;
        this.previewUrl = previewUrl;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.version = i2;
        this.amount = f;
        this.dollar = f2;
        this.payStatus = str2;
        this.newFlag = z2;
        this.discount = discount;
        this.amountDis = f3;
        this.dollarDis = f4;
        this.dollarCodeDis = dollarCodeDis;
    }

    public /* synthetic */ WatchFaceCategoryV2(String str, int i, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, int i2, float f, float f2, String str9, boolean z2, String str10, float f3, float f4, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "0" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? 0 : i2, (i3 & 2048) != 0 ? 0.0f : f, (i3 & 4096) != 0 ? 0.0f : f2, (i3 & 8192) != 0 ? "" : str9, (i3 & 16384) != 0 ? false : z2, (i3 & 32768) != 0 ? "" : str10, (i3 & 65536) != 0 ? 0.0f : f3, (i3 & 131072) != 0 ? 0.0f : f4, (i3 & 262144) != 0 ? "" : str11);
    }
}
