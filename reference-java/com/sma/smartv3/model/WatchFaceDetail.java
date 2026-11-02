package com.sma.smartv3.model;

import androidx.compose.p554ui.layout.LayoutKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceDetail extends JsonFieldContainer implements Serializable {
    private final float amount;
    private float amountDis;

    @aa1
    private final String binUrl;
    private final int dialType;

    @aa1
    private String discount;
    private final float dollar;

    @aa1
    private String dollarCodeDis;
    private float dollarDis;

    @aa1
    private final String fileSize;

    /* JADX INFO: renamed from: id */
    private final int f51330id;
    private boolean limitFreeFlag;

    @aa1
    private String memberAttr;
    private final boolean newFlag;

    @tb1
    private final String payStatus;

    @aa1
    private final String previewUrl;

    public WatchFaceDetail() {
        this(0, null, null, null, null, 0, 0.0f, 0.0f, false, null, false, null, 0.0f, 0.0f, null, LayoutKt.LargeDimension, null);
    }

    public final int component1() {
        return this.f51330id;
    }

    @aa1
    public final String component10() {
        return this.memberAttr;
    }

    public final boolean component11() {
        return this.newFlag;
    }

    @aa1
    public final String component12() {
        return this.discount;
    }

    public final float component13() {
        return this.amountDis;
    }

    public final float component14() {
        return this.dollarDis;
    }

    @aa1
    public final String component15() {
        return this.dollarCodeDis;
    }

    @aa1
    public final String component2() {
        return this.previewUrl;
    }

    @aa1
    public final String component3() {
        return this.binUrl;
    }

    @aa1
    public final String component4() {
        return this.fileSize;
    }

    @tb1
    public final String component5() {
        return this.payStatus;
    }

    public final int component6() {
        return this.dialType;
    }

    public final float component7() {
        return this.amount;
    }

    public final float component8() {
        return this.dollar;
    }

    public final boolean component9() {
        return this.limitFreeFlag;
    }

    @aa1
    public final WatchFaceDetail copy(int i, @aa1 String previewUrl, @aa1 String binUrl, @aa1 String fileSize, @tb1 String str, int i2, float f, float f2, boolean z, @aa1 String memberAttr, boolean z2, @aa1 String discount, float f3, float f4, @aa1 String dollarCodeDis) {
        Intrinsics.X0O(previewUrl, "previewUrl");
        Intrinsics.X0O(binUrl, "binUrl");
        Intrinsics.X0O(fileSize, "fileSize");
        Intrinsics.X0O(memberAttr, "memberAttr");
        Intrinsics.X0O(discount, "discount");
        Intrinsics.X0O(dollarCodeDis, "dollarCodeDis");
        return new WatchFaceDetail(i, previewUrl, binUrl, fileSize, str, i2, f, f2, z, memberAttr, z2, discount, f3, f4, dollarCodeDis);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceDetail)) {
            return false;
        }
        WatchFaceDetail watchFaceDetail = (WatchFaceDetail) obj;
        return this.f51330id == watchFaceDetail.f51330id && Intrinsics.XOO0ii0(this.previewUrl, watchFaceDetail.previewUrl) && Intrinsics.XOO0ii0(this.binUrl, watchFaceDetail.binUrl) && Intrinsics.XOO0ii0(this.fileSize, watchFaceDetail.fileSize) && Intrinsics.XOO0ii0(this.payStatus, watchFaceDetail.payStatus) && this.dialType == watchFaceDetail.dialType && Float.compare(this.amount, watchFaceDetail.amount) == 0 && Float.compare(this.dollar, watchFaceDetail.dollar) == 0 && this.limitFreeFlag == watchFaceDetail.limitFreeFlag && Intrinsics.XOO0ii0(this.memberAttr, watchFaceDetail.memberAttr) && this.newFlag == watchFaceDetail.newFlag && Intrinsics.XOO0ii0(this.discount, watchFaceDetail.discount) && Float.compare(this.amountDis, watchFaceDetail.amountDis) == 0 && Float.compare(this.dollarDis, watchFaceDetail.dollarDis) == 0 && Intrinsics.XOO0ii0(this.dollarCodeDis, watchFaceDetail.dollarCodeDis);
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

    public final int getDialType() {
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

    @aa1
    public final String getFileSize() {
        return this.fileSize;
    }

    public final int getId() {
        return this.f51330id;
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

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f51330id) * 31) + this.previewUrl.hashCode()) * 31) + this.binUrl.hashCode()) * 31) + this.fileSize.hashCode()) * 31;
        String str = this.payStatus;
        return ((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.dialType)) * 31) + Float.hashCode(this.amount)) * 31) + Float.hashCode(this.dollar)) * 31) + Boolean.hashCode(this.limitFreeFlag)) * 31) + this.memberAttr.hashCode()) * 31) + Boolean.hashCode(this.newFlag)) * 31) + this.discount.hashCode()) * 31) + Float.hashCode(this.amountDis)) * 31) + Float.hashCode(this.dollarDis)) * 31) + this.dollarCodeDis.hashCode();
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

    @aa1
    public String toString() {
        return "WatchFaceDetail(id=" + this.f51330id + ", previewUrl=" + this.previewUrl + ", binUrl=" + this.binUrl + ", fileSize=" + this.fileSize + ", payStatus=" + this.payStatus + ", dialType=" + this.dialType + ", amount=" + this.amount + ", dollar=" + this.dollar + ", limitFreeFlag=" + this.limitFreeFlag + ", memberAttr=" + this.memberAttr + ", newFlag=" + this.newFlag + ", discount=" + this.discount + ", amountDis=" + this.amountDis + ", dollarDis=" + this.dollarDis + ", dollarCodeDis=" + this.dollarCodeDis + I000IiI1O.C2156iO.f1007iO;
    }

    public WatchFaceDetail(int i, @aa1 String previewUrl, @aa1 String binUrl, @aa1 String fileSize, @tb1 String str, int i2, float f, float f2, boolean z, @aa1 String memberAttr, boolean z2, @aa1 String discount, float f3, float f4, @aa1 String dollarCodeDis) {
        Intrinsics.X0O(previewUrl, "previewUrl");
        Intrinsics.X0O(binUrl, "binUrl");
        Intrinsics.X0O(fileSize, "fileSize");
        Intrinsics.X0O(memberAttr, "memberAttr");
        Intrinsics.X0O(discount, "discount");
        Intrinsics.X0O(dollarCodeDis, "dollarCodeDis");
        this.f51330id = i;
        this.previewUrl = previewUrl;
        this.binUrl = binUrl;
        this.fileSize = fileSize;
        this.payStatus = str;
        this.dialType = i2;
        this.amount = f;
        this.dollar = f2;
        this.limitFreeFlag = z;
        this.memberAttr = memberAttr;
        this.newFlag = z2;
        this.discount = discount;
        this.amountDis = f3;
        this.dollarDis = f4;
        this.dollarCodeDis = dollarCodeDis;
    }

    public /* synthetic */ WatchFaceDetail(int i, String str, String str2, String str3, String str4, int i2, float f, float f2, boolean z, String str5, boolean z2, String str6, float f3, float f4, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? 0.0f : f, (i3 & 128) != 0 ? 0.0f : f2, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? "" : str5, (i3 & 1024) == 0 ? z2 : false, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? 0.0f : f3, (i3 & 8192) != 0 ? 0.0f : f4, (i3 & 16384) != 0 ? "" : str7);
    }
}
