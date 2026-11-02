package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CustomConfigInfo extends JsonFieldContainer {

    @aa1
    private String aiModelService;

    @tb1
    private String supCourse;

    @aa1
    private String supDirectAI;

    @aa1
    private String supFallDetection;

    @aa1
    private String supHardwareAliPay;

    @tb1
    private String supOnlineSearch;

    @aa1
    private String supOpenScreenAds;

    @aa1
    private String supOtherAds;

    @aa1
    private String supRideCode;

    @aa1
    private String transModel;

    public CustomConfigInfo() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CustomConfigInfo copy$default(CustomConfigInfo customConfigInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConfigInfo.supHardwareAliPay;
        }
        if ((i & 2) != 0) {
            str2 = customConfigInfo.supFallDetection;
        }
        if ((i & 4) != 0) {
            str3 = customConfigInfo.supDirectAI;
        }
        if ((i & 8) != 0) {
            str4 = customConfigInfo.aiModelService;
        }
        if ((i & 16) != 0) {
            str5 = customConfigInfo.supOtherAds;
        }
        if ((i & 32) != 0) {
            str6 = customConfigInfo.supOpenScreenAds;
        }
        if ((i & 64) != 0) {
            str7 = customConfigInfo.supRideCode;
        }
        if ((i & 128) != 0) {
            str8 = customConfigInfo.transModel;
        }
        if ((i & 256) != 0) {
            str9 = customConfigInfo.supCourse;
        }
        if ((i & 512) != 0) {
            str10 = customConfigInfo.supOnlineSearch;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return customConfigInfo.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @aa1
    public final String component1() {
        return this.supHardwareAliPay;
    }

    @tb1
    public final String component10() {
        return this.supOnlineSearch;
    }

    @aa1
    public final String component2() {
        return this.supFallDetection;
    }

    @aa1
    public final String component3() {
        return this.supDirectAI;
    }

    @aa1
    public final String component4() {
        return this.aiModelService;
    }

    @aa1
    public final String component5() {
        return this.supOtherAds;
    }

    @aa1
    public final String component6() {
        return this.supOpenScreenAds;
    }

    @aa1
    public final String component7() {
        return this.supRideCode;
    }

    @aa1
    public final String component8() {
        return this.transModel;
    }

    @tb1
    public final String component9() {
        return this.supCourse;
    }

    @aa1
    public final CustomConfigInfo copy(@aa1 String supHardwareAliPay, @aa1 String supFallDetection, @aa1 String supDirectAI, @aa1 String aiModelService, @aa1 String supOtherAds, @aa1 String supOpenScreenAds, @aa1 String supRideCode, @aa1 String transModel, @tb1 String str, @tb1 String str2) {
        Intrinsics.X0O(supHardwareAliPay, "supHardwareAliPay");
        Intrinsics.X0O(supFallDetection, "supFallDetection");
        Intrinsics.X0O(supDirectAI, "supDirectAI");
        Intrinsics.X0O(aiModelService, "aiModelService");
        Intrinsics.X0O(supOtherAds, "supOtherAds");
        Intrinsics.X0O(supOpenScreenAds, "supOpenScreenAds");
        Intrinsics.X0O(supRideCode, "supRideCode");
        Intrinsics.X0O(transModel, "transModel");
        return new CustomConfigInfo(supHardwareAliPay, supFallDetection, supDirectAI, aiModelService, supOtherAds, supOpenScreenAds, supRideCode, transModel, str, str2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomConfigInfo)) {
            return false;
        }
        CustomConfigInfo customConfigInfo = (CustomConfigInfo) obj;
        return Intrinsics.XOO0ii0(this.supHardwareAliPay, customConfigInfo.supHardwareAliPay) && Intrinsics.XOO0ii0(this.supFallDetection, customConfigInfo.supFallDetection) && Intrinsics.XOO0ii0(this.supDirectAI, customConfigInfo.supDirectAI) && Intrinsics.XOO0ii0(this.aiModelService, customConfigInfo.aiModelService) && Intrinsics.XOO0ii0(this.supOtherAds, customConfigInfo.supOtherAds) && Intrinsics.XOO0ii0(this.supOpenScreenAds, customConfigInfo.supOpenScreenAds) && Intrinsics.XOO0ii0(this.supRideCode, customConfigInfo.supRideCode) && Intrinsics.XOO0ii0(this.transModel, customConfigInfo.transModel) && Intrinsics.XOO0ii0(this.supCourse, customConfigInfo.supCourse) && Intrinsics.XOO0ii0(this.supOnlineSearch, customConfigInfo.supOnlineSearch);
    }

    @aa1
    public final String getAiModelService() {
        return this.aiModelService;
    }

    @tb1
    public final String getSupCourse() {
        return this.supCourse;
    }

    @aa1
    public final String getSupDirectAI() {
        return this.supDirectAI;
    }

    @aa1
    public final String getSupFallDetection() {
        return this.supFallDetection;
    }

    @aa1
    public final String getSupHardwareAliPay() {
        return this.supHardwareAliPay;
    }

    @tb1
    public final String getSupOnlineSearch() {
        return this.supOnlineSearch;
    }

    @aa1
    public final String getSupOpenScreenAds() {
        return this.supOpenScreenAds;
    }

    @aa1
    public final String getSupOtherAds() {
        return this.supOtherAds;
    }

    @aa1
    public final String getSupRideCode() {
        return this.supRideCode;
    }

    @aa1
    public final String getTransModel() {
        return this.transModel;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.supHardwareAliPay.hashCode() * 31) + this.supFallDetection.hashCode()) * 31) + this.supDirectAI.hashCode()) * 31) + this.aiModelService.hashCode()) * 31) + this.supOtherAds.hashCode()) * 31) + this.supOpenScreenAds.hashCode()) * 31) + this.supRideCode.hashCode()) * 31) + this.transModel.hashCode()) * 31;
        String str = this.supCourse;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.supOnlineSearch;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAiModelService(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.aiModelService = str;
    }

    public final void setSupCourse(@tb1 String str) {
        this.supCourse = str;
    }

    public final void setSupDirectAI(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supDirectAI = str;
    }

    public final void setSupFallDetection(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supFallDetection = str;
    }

    public final void setSupHardwareAliPay(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supHardwareAliPay = str;
    }

    public final void setSupOnlineSearch(@tb1 String str) {
        this.supOnlineSearch = str;
    }

    public final void setSupOpenScreenAds(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supOpenScreenAds = str;
    }

    public final void setSupOtherAds(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supOtherAds = str;
    }

    public final void setSupRideCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supRideCode = str;
    }

    public final void setTransModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.transModel = str;
    }

    @aa1
    public String toString() {
        return "CustomConfigInfo(supHardwareAliPay=" + this.supHardwareAliPay + ", supFallDetection=" + this.supFallDetection + ", supDirectAI=" + this.supDirectAI + ", aiModelService=" + this.aiModelService + ", supOtherAds=" + this.supOtherAds + ", supOpenScreenAds=" + this.supOpenScreenAds + ", supRideCode=" + this.supRideCode + ", transModel=" + this.transModel + ", supCourse=" + this.supCourse + ", supOnlineSearch=" + this.supOnlineSearch + I000IiI1O.C2156iO.f1007iO;
    }

    public CustomConfigInfo(@aa1 String supHardwareAliPay, @aa1 String supFallDetection, @aa1 String supDirectAI, @aa1 String aiModelService, @aa1 String supOtherAds, @aa1 String supOpenScreenAds, @aa1 String supRideCode, @aa1 String transModel, @tb1 String str, @tb1 String str2) {
        Intrinsics.X0O(supHardwareAliPay, "supHardwareAliPay");
        Intrinsics.X0O(supFallDetection, "supFallDetection");
        Intrinsics.X0O(supDirectAI, "supDirectAI");
        Intrinsics.X0O(aiModelService, "aiModelService");
        Intrinsics.X0O(supOtherAds, "supOtherAds");
        Intrinsics.X0O(supOpenScreenAds, "supOpenScreenAds");
        Intrinsics.X0O(supRideCode, "supRideCode");
        Intrinsics.X0O(transModel, "transModel");
        this.supHardwareAliPay = supHardwareAliPay;
        this.supFallDetection = supFallDetection;
        this.supDirectAI = supDirectAI;
        this.aiModelService = aiModelService;
        this.supOtherAds = supOtherAds;
        this.supOpenScreenAds = supOpenScreenAds;
        this.supRideCode = supRideCode;
        this.transModel = transModel;
        this.supCourse = str;
        this.supOnlineSearch = str2;
    }

    public /* synthetic */ CustomConfigInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "0" : str9, (i & 512) != 0 ? "0" : str10);
    }
}
