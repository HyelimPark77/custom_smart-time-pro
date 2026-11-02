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
    private final int id;
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
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        String r4 = null;
        boolean r5 = false;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        int r11 = 0;
        float r12 = 0.0f;
        float r13 = 0.0f;
        String r14 = null;
        boolean r15 = false;
        String r16 = null;
        float r17 = 0.0f;
        float r18 = 0.0f;
        String r19 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, 524287, null);
    }

    public static /* synthetic */ WatchFaceCategoryV2 copy$default(WatchFaceCategoryV2 r17, String r18, int r19, String r20, String r21, boolean r22, String r23, String r24, String r25, String r26, String r27, int r28, float r29, float r30, String r31, boolean r32, String r33, float r34, float r35, String r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        String r2 = r17.screenType;
    L7:
        if ((r37 & 2) == 0) goto L9;
        int r3 = r17.id;
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r4 = r17.dialType;
    L15:
        if ((r37 & 8) == 0) goto L17;
        String r5 = r17.resolutionType;
    L19:
        if ((r37 & 16) == 0) goto L21;
        boolean r6 = r17.limitFreeFlag;
    L23:
        if ((r37 & 32) == 0) goto L25;
        String r7 = r17.memberAttr;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r8 = r17.binUrl;
    L31:
        if ((r37 & 128) == 0) goto L33;
        String r9 = r17.previewUrl;
    L35:
        if ((r37 & 256) == 0) goto L37;
        String r10 = r17.createdAt;
    L39:
        if ((r37 & 512) == 0) goto L41;
        String r11 = r17.updateAt;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        int r12 = r17.version;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        float r13 = r17.amount;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        float r14 = r17.dollar;
    L55:
        if ((r37 & 8192) == 0) goto L57;
        String r15 = r17.payStatus;
    L58:
        String r110 = r2;
        if ((r37 & 16384) == 0) goto L61;
        boolean r16 = r17.newFlag;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        String r1 = r17.discount;
    L66:
        String r111 = r1;
        if ((r37 & 65536) == 0) goto L69;
        float r39 = r17.amountDis;
    L70:
        float r210 = r39;
        if ((r37 & 131072) == 0) goto L73;
        float r40 = r17.dollarDis;
    L75:
        if ((r37 & 262144) == 0) goto L78;
        float r211 = r40;
        float r310 = r211;
        String r311 = r17.dollarCodeDis;
    L80:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r310, r311);
    L78:
        r311 = r36;
        r310 = r40;
        goto L80
    L73:
        r40 = r35;
        goto L75
    L69:
        r39 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
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
        return this.id;
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
    public final WatchFaceCategoryV2 copy(@aa1 String r22, int r23, @tb1 String r24, @aa1 String r25, boolean r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, int r32, float r33, float r34, @tb1 String r35, boolean r36, @aa1 String r37, float r38, float r39, @aa1 String r40) {
        Intrinsics.X0O(r22, "screenType");
        Intrinsics.X0O(r25, "resolutionType");
        Intrinsics.X0O(r27, "memberAttr");
        Intrinsics.X0O(r28, "binUrl");
        Intrinsics.X0O(r29, "previewUrl");
        Intrinsics.X0O(r30, "createdAt");
        Intrinsics.X0O(r31, "updateAt");
        Intrinsics.X0O(r37, "discount");
        Intrinsics.X0O(r40, "dollarCodeDis");
        return new WatchFaceCategoryV2(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceCategoryV2) == true) goto L8;
        return false;
    L8:
        WatchFaceCategoryV2 r6 = (WatchFaceCategoryV2) r5;
        if (Intrinsics.XOO0ii0(this.screenType, r6.screenType) == true) goto L12;
        return false;
    L12:
        if (this.id == r6.id) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.dialType, r6.dialType) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.resolutionType, r6.resolutionType) == true) goto L21;
        return false;
    L21:
        if (this.limitFreeFlag == r6.limitFreeFlag) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.memberAttr, r6.memberAttr) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.binUrl, r6.binUrl) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.previewUrl, r6.previewUrl) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.createdAt, r6.createdAt) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.updateAt, r6.updateAt) == true) goto L39;
        return false;
    L39:
        if (this.version == r6.version) goto L42;
        return false;
    L42:
        if (Float.compare(this.amount, r6.amount) == 0) goto L45;
        return false;
    L45:
        if (Float.compare(this.dollar, r6.dollar) == 0) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.payStatus, r6.payStatus) == true) goto L51;
        return false;
    L51:
        if (this.newFlag == r6.newFlag) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.discount, r6.discount) == true) goto L57;
        return false;
    L57:
        if (Float.compare(this.amountDis, r6.amountDis) == 0) goto L60;
        return false;
    L60:
        if (Float.compare(this.dollarDis, r6.dollarDis) == 0) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.dollarCodeDis, r6.dollarCodeDis) == true) goto L65;
        return false;
    L65:
        return true;
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
        return this.id;
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
        int r0 = ((this.screenType.hashCode() * 31) + Integer.hashCode(this.id)) * 31;
        String r1 = this.dialType;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (((((((((((((((((((((r0 + r3) * 31) + this.resolutionType.hashCode()) * 31) + Boolean.hashCode(this.limitFreeFlag)) * 31) + this.memberAttr.hashCode()) * 31) + this.binUrl.hashCode()) * 31) + this.previewUrl.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updateAt.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Float.hashCode(this.amount)) * 31) + Float.hashCode(this.dollar)) * 31;
        String r5 = this.payStatus;
        if (r5 == null) goto L11;
        r2 = r5.hashCode();
    L11:
        return ((((((((((r4 + r2) * 31) + Boolean.hashCode(this.newFlag)) * 31) + this.discount.hashCode()) * 31) + Float.hashCode(this.amountDis)) * 31) + Float.hashCode(this.dollarDis)) * 31) + this.dollarCodeDis.hashCode();
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setAmountDis(float r1) {
        this.amountDis = r1;
    }

    public final void setDiscount(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.discount = r2;
    }

    public final void setDollarCodeDis(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dollarCodeDis = r2;
    }

    public final void setDollarDis(float r1) {
        this.dollarDis = r1;
    }

    public final void setLimitFreeFlag(boolean r1) {
        this.limitFreeFlag = r1;
    }

    public final void setMemberAttr(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.memberAttr = r2;
    }

    public final void setNewFlag(boolean r1) {
        this.newFlag = r1;
    }

    public final void setPayStatus(@tb1 String r1) {
        this.payStatus = r1;
    }

    @aa1
    public String toString() {
        return "WatchFaceCategoryV2(screenType=" + this.screenType + ", id=" + this.id + ", dialType=" + this.dialType + ", resolutionType=" + this.resolutionType + ", limitFreeFlag=" + this.limitFreeFlag + ", memberAttr=" + this.memberAttr + ", binUrl=" + this.binUrl + ", previewUrl=" + this.previewUrl + ", createdAt=" + this.createdAt + ", updateAt=" + this.updateAt + ", version=" + this.version + ", amount=" + this.amount + ", dollar=" + this.dollar + ", payStatus=" + this.payStatus + ", newFlag=" + this.newFlag + ", discount=" + this.discount + ", amountDis=" + this.amountDis + ", dollarDis=" + this.dollarDis + ", dollarCodeDis=" + this.dollarCodeDis + I000IiI1O.iO.iO;
    }

    public WatchFaceCategoryV2(@aa1 String r6, int r7, @tb1 String r8, @aa1 String r9, boolean r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, int r16, float r17, float r18, @tb1 String r19, boolean r20, @aa1 String r21, float r22, float r23, @aa1 String r24) {
        Intrinsics.X0O(r6, "screenType");
        Intrinsics.X0O(r9, "resolutionType");
        Intrinsics.X0O(r11, "memberAttr");
        Intrinsics.X0O(r12, "binUrl");
        Intrinsics.X0O(r13, "previewUrl");
        Intrinsics.X0O(r14, "createdAt");
        Intrinsics.X0O(r15, "updateAt");
        Intrinsics.X0O(r21, "discount");
        Intrinsics.X0O(r24, "dollarCodeDis");
        this.screenType = r6;
        this.id = r7;
        this.dialType = r8;
        this.resolutionType = r9;
        this.limitFreeFlag = r10;
        this.memberAttr = r11;
        this.binUrl = r12;
        this.previewUrl = r13;
        this.createdAt = r14;
        this.updateAt = r15;
        this.version = r16;
        this.amount = r17;
        this.dollar = r18;
        this.payStatus = r19;
        this.newFlag = r20;
        this.discount = r21;
        this.amountDis = r22;
        this.dollarDis = r23;
        this.dollarCodeDis = r24;
    }

    public /* synthetic */ WatchFaceCategoryV2(String r21, int r22, String r23, String r24, boolean r25, String r26, String r27, String r28, String r29, String r30, int r31, float r32, float r33, String r34, boolean r35, String r36, float r37, float r38, String r39, int r40, DefaultConstructorMarker r41) {
        if ((r40 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r40 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r40 & 4) == 0) goto L13;
        String r5 = "0";
    L15:
        if ((r40 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r40 & 16) == 0) goto L21;
        boolean r7 = false;
    L23:
        if ((r40 & 32) == 0) goto L25;
        String r8 = "";
    L27:
        if ((r40 & 64) == 0) goto L29;
        String r9 = "";
    L31:
        if ((r40 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r40 & 256) == 0) goto L37;
        String r11 = "";
    L39:
        if ((r40 & 512) == 0) goto L41;
        String r12 = "";
    L43:
        if ((r40 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        float r14 = 0.0f;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        float r4 = 0.0f;
    L55:
        if ((r40 & 8192) == 0) goto L57;
        String r15 = "";
    L58:
        String r42 = r1;
        if ((r40 & 16384) == 0) goto L61;
        boolean r2 = false;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        String r16 = "";
    L67:
        if ((r40 & 65536) == 0) goto L69;
        float r17 = 0.0f;
    L71:
        if ((r40 & 131072) == 0) goto L73;
        float r18 = 0.0f;
    L75:
        if ((r40 & 262144) == 0) goto L78;
        String r43 = "";
    L79:
        this(r42, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, r15, r2, r16, r17, r18, r43);
        return;
    L78:
        r43 = r39;
        goto L79
    L73:
        r18 = r38;
        goto L75
    L69:
        r17 = r37;
        goto L71
    L65:
        r16 = r36;
        goto L67
    L61:
        r2 = r35;
        goto L63
    L57:
        r15 = r34;
        goto L58
    L53:
        r4 = r33;
        goto L55
    L49:
        r14 = r32;
        goto L51
    L45:
        r13 = r31;
        goto L47
    L41:
        r12 = r30;
        goto L43
    L37:
        r11 = r29;
        goto L39
    L33:
        r10 = r28;
        goto L35
    L29:
        r9 = r27;
        goto L31
    L25:
        r8 = r26;
        goto L27
    L21:
        r7 = r25;
        goto L23
    L17:
        r6 = r24;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }
}
