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
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ CustomConfigInfo copy$default(CustomConfigInfo r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.supHardwareAliPay;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.supFallDetection;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.supDirectAI;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.aiModelService;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.supOtherAds;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.supOpenScreenAds;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.supRideCode;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.transModel;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.supCourse;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.supOnlineSearch;
    L32:
        String r13 = r9;
        String r14 = r10;
        String r15 = r7;
        String r16 = r8;
        String r17 = r5;
        String r18 = r6;
        String r19 = r3;
        String r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
    public final CustomConfigInfo copy(@aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @tb1 String r21, @tb1 String r22) {
        Intrinsics.X0O(r13, "supHardwareAliPay");
        Intrinsics.X0O(r14, "supFallDetection");
        Intrinsics.X0O(r15, "supDirectAI");
        Intrinsics.X0O(r16, "aiModelService");
        Intrinsics.X0O(r17, "supOtherAds");
        Intrinsics.X0O(r18, "supOpenScreenAds");
        Intrinsics.X0O(r19, "supRideCode");
        Intrinsics.X0O(r20, "transModel");
        return new CustomConfigInfo(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CustomConfigInfo) == true) goto L8;
        return false;
    L8:
        CustomConfigInfo r6 = (CustomConfigInfo) r5;
        if (Intrinsics.XOO0ii0(this.supHardwareAliPay, r6.supHardwareAliPay) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.supFallDetection, r6.supFallDetection) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.supDirectAI, r6.supDirectAI) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.aiModelService, r6.aiModelService) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.supOtherAds, r6.supOtherAds) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.supOpenScreenAds, r6.supOpenScreenAds) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.supRideCode, r6.supRideCode) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.transModel, r6.transModel) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.supCourse, r6.supCourse) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.supOnlineSearch, r6.supOnlineSearch) == true) goto L38;
        return false;
    L38:
        return true;
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
        int r0 = ((((((((((((((this.supHardwareAliPay.hashCode() * 31) + this.supFallDetection.hashCode()) * 31) + this.supDirectAI.hashCode()) * 31) + this.aiModelService.hashCode()) * 31) + this.supOtherAds.hashCode()) * 31) + this.supOpenScreenAds.hashCode()) * 31) + this.supRideCode.hashCode()) * 31) + this.transModel.hashCode()) * 31;
        String r1 = this.supCourse;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.supOnlineSearch;
        if (r5 == null) goto L11;
        r2 = r5.hashCode();
    L11:
        return r4 + r2;
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setAiModelService(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.aiModelService = r2;
    }

    public final void setSupCourse(@tb1 String r1) {
        this.supCourse = r1;
    }

    public final void setSupDirectAI(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supDirectAI = r2;
    }

    public final void setSupFallDetection(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supFallDetection = r2;
    }

    public final void setSupHardwareAliPay(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supHardwareAliPay = r2;
    }

    public final void setSupOnlineSearch(@tb1 String r1) {
        this.supOnlineSearch = r1;
    }

    public final void setSupOpenScreenAds(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supOpenScreenAds = r2;
    }

    public final void setSupOtherAds(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supOtherAds = r2;
    }

    public final void setSupRideCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supRideCode = r2;
    }

    public final void setTransModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.transModel = r2;
    }

    @aa1
    public String toString() {
        return "CustomConfigInfo(supHardwareAliPay=" + this.supHardwareAliPay + ", supFallDetection=" + this.supFallDetection + ", supDirectAI=" + this.supDirectAI + ", aiModelService=" + this.aiModelService + ", supOtherAds=" + this.supOtherAds + ", supOpenScreenAds=" + this.supOpenScreenAds + ", supRideCode=" + this.supRideCode + ", transModel=" + this.transModel + ", supCourse=" + this.supCourse + ", supOnlineSearch=" + this.supOnlineSearch + I000IiI1O.iO.iO;
    }

    public CustomConfigInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @tb1 String r10, @tb1 String r11) {
        Intrinsics.X0O(r2, "supHardwareAliPay");
        Intrinsics.X0O(r3, "supFallDetection");
        Intrinsics.X0O(r4, "supDirectAI");
        Intrinsics.X0O(r5, "aiModelService");
        Intrinsics.X0O(r6, "supOtherAds");
        Intrinsics.X0O(r7, "supOpenScreenAds");
        Intrinsics.X0O(r8, "supRideCode");
        Intrinsics.X0O(r9, "transModel");
        this.supHardwareAliPay = r2;
        this.supFallDetection = r3;
        this.supDirectAI = r4;
        this.aiModelService = r5;
        this.supOtherAds = r6;
        this.supOpenScreenAds = r7;
        this.supRideCode = r8;
        this.transModel = r9;
        this.supCourse = r10;
        this.supOnlineSearch = r11;
    }

    public /* synthetic */ CustomConfigInfo(String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "0";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "0";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "0";
    L30:
        if ((r13 & 512) == 0) goto L33;
        String r15 = "0";
    L32:
        String r16 = r11;
        String r17 = r10;
        String r18 = r9;
        String r19 = r8;
        String r20 = r7;
        String r21 = r6;
        String r22 = r5;
        String r23 = r4;
        this(r3, r23, r22, r21, r20, r19, r18, r17, r16, r15);
        return;
    L33:
        r15 = r12;
        goto L32
    }
}
