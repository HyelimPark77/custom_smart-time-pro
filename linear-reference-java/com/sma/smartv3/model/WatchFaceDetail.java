package com.sma.smartv3.model;

import androidx.compose.ui.layout.LayoutKt;
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
    private final int id;
    private boolean limitFreeFlag;

    @aa1
    private String memberAttr;
    private final boolean newFlag;

    @tb1
    private final String payStatus;

    @aa1
    private final String previewUrl;

    public WatchFaceDetail() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        float r7 = 0.0f;
        float r8 = 0.0f;
        boolean r9 = false;
        String r10 = null;
        boolean r11 = false;
        String r12 = null;
        float r13 = 0.0f;
        float r14 = 0.0f;
        String r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, LayoutKt.LargeDimension, null);
    }

    public static /* synthetic */ WatchFaceDetail copy$default(WatchFaceDetail r16, int r17, String r18, String r19, String r20, String r21, int r22, float r23, float r24, boolean r25, String r26, boolean r27, String r28, float r29, float r30, String r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        int r2 = r16.id;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.previewUrl;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = r16.binUrl;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.fileSize;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = r16.payStatus;
    L23:
        if ((r32 & 32) == 0) goto L25;
        int r7 = r16.dialType;
    L27:
        if ((r32 & 64) == 0) goto L29;
        float r8 = r16.amount;
    L31:
        if ((r32 & 128) == 0) goto L33;
        float r9 = r16.dollar;
    L35:
        if ((r32 & 256) == 0) goto L37;
        boolean r10 = r16.limitFreeFlag;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = r16.memberAttr;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        boolean r12 = r16.newFlag;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = r16.discount;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        float r14 = r16.amountDis;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        float r15 = r16.dollarDis;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r34 = r16.dollarCodeDis;
    L64:
        return r16.copy(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r34);
    L62:
        r34 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
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

    public final int component1() {
        return this.id;
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
    public final WatchFaceDetail copy(int r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @tb1 String r22, int r23, float r24, float r25, boolean r26, @aa1 String r27, boolean r28, @aa1 String r29, float r30, float r31, @aa1 String r32) {
        Intrinsics.X0O(r19, "previewUrl");
        Intrinsics.X0O(r20, "binUrl");
        Intrinsics.X0O(r21, "fileSize");
        Intrinsics.X0O(r27, "memberAttr");
        Intrinsics.X0O(r29, "discount");
        Intrinsics.X0O(r32, "dollarCodeDis");
        return new WatchFaceDetail(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceDetail) == true) goto L8;
        return false;
    L8:
        WatchFaceDetail r6 = (WatchFaceDetail) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.previewUrl, r6.previewUrl) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.binUrl, r6.binUrl) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.fileSize, r6.fileSize) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.payStatus, r6.payStatus) == true) goto L24;
        return false;
    L24:
        if (this.dialType == r6.dialType) goto L27;
        return false;
    L27:
        if (Float.compare(this.amount, r6.amount) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.dollar, r6.dollar) == 0) goto L33;
        return false;
    L33:
        if (this.limitFreeFlag == r6.limitFreeFlag) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.memberAttr, r6.memberAttr) == true) goto L39;
        return false;
    L39:
        if (this.newFlag == r6.newFlag) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.discount, r6.discount) == true) goto L45;
        return false;
    L45:
        if (Float.compare(this.amountDis, r6.amountDis) == 0) goto L48;
        return false;
    L48:
        if (Float.compare(this.dollarDis, r6.dollarDis) == 0) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.dollarCodeDis, r6.dollarCodeDis) == true) goto L53;
        return false;
    L53:
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

    public int hashCode() {
        int r0 = ((((((Integer.hashCode(this.id) * 31) + this.previewUrl.hashCode()) * 31) + this.binUrl.hashCode()) * 31) + this.fileSize.hashCode()) * 31;
        String r1 = this.payStatus;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((((((((((((((((((((r0 + r2) * 31) + Integer.hashCode(this.dialType)) * 31) + Float.hashCode(this.amount)) * 31) + Float.hashCode(this.dollar)) * 31) + Boolean.hashCode(this.limitFreeFlag)) * 31) + this.memberAttr.hashCode()) * 31) + Boolean.hashCode(this.newFlag)) * 31) + this.discount.hashCode()) * 31) + Float.hashCode(this.amountDis)) * 31) + Float.hashCode(this.dollarDis)) * 31) + this.dollarCodeDis.hashCode();
    L5:
        r2 = r1.hashCode();
        goto L7
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

    @aa1
    public String toString() {
        return "WatchFaceDetail(id=" + this.id + ", previewUrl=" + this.previewUrl + ", binUrl=" + this.binUrl + ", fileSize=" + this.fileSize + ", payStatus=" + this.payStatus + ", dialType=" + this.dialType + ", amount=" + this.amount + ", dollar=" + this.dollar + ", limitFreeFlag=" + this.limitFreeFlag + ", memberAttr=" + this.memberAttr + ", newFlag=" + this.newFlag + ", discount=" + this.discount + ", amountDis=" + this.amountDis + ", dollarDis=" + this.dollarDis + ", dollarCodeDis=" + this.dollarCodeDis + I000IiI1O.iO.iO;
    }

    public WatchFaceDetail(int r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @tb1 String r7, int r8, float r9, float r10, boolean r11, @aa1 String r12, boolean r13, @aa1 String r14, float r15, float r16, @aa1 String r17) {
        Intrinsics.X0O(r4, "previewUrl");
        Intrinsics.X0O(r5, "binUrl");
        Intrinsics.X0O(r6, "fileSize");
        Intrinsics.X0O(r12, "memberAttr");
        Intrinsics.X0O(r14, "discount");
        Intrinsics.X0O(r17, "dollarCodeDis");
        this.id = r3;
        this.previewUrl = r4;
        this.binUrl = r5;
        this.fileSize = r6;
        this.payStatus = r7;
        this.dialType = r8;
        this.amount = r9;
        this.dollar = r10;
        this.limitFreeFlag = r11;
        this.memberAttr = r12;
        this.newFlag = r13;
        this.discount = r14;
        this.amountDis = r15;
        this.dollarDis = r16;
        this.dollarCodeDis = r17;
    }

    public /* synthetic */ WatchFaceDetail(int r17, String r18, String r19, String r20, String r21, int r22, float r23, float r24, boolean r25, String r26, boolean r27, String r28, float r29, float r30, String r31, int r32, DefaultConstructorMarker r33) {
        boolean r2 = false;
        if ((r32 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r32 & 32) == 0) goto L25;
        int r8 = 0;
    L27:
        if ((r32 & 64) == 0) goto L29;
        float r9 = 0.0f;
    L31:
        if ((r32 & 128) == 0) goto L33;
        float r11 = 0.0f;
    L35:
        if ((r32 & 256) == 0) goto L37;
        boolean r12 = false;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r13 = "";
    L43:
        if ((r32 & 1024) != 0) goto L47;
        r2 = r27;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r14 = "";
    L51:
        if ((r32 & 4096) == 0) goto L53;
        float r15 = 0.0f;
    L55:
        if ((r32 & 8192) == 0) goto L57;
        float r10 = 0.0f;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r34 = "";
    L63:
        this(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13, r2, r14, r15, r10, r34);
        return;
    L62:
        r34 = r31;
        goto L63
    L57:
        r10 = r30;
        goto L59
    L53:
        r15 = r29;
        goto L55
    L49:
        r14 = r28;
        goto L51
    L41:
        r13 = r26;
        goto L43
    L37:
        r12 = r25;
        goto L39
    L33:
        r11 = r24;
        goto L35
    L29:
        r9 = r23;
        goto L31
    L25:
        r8 = r22;
        goto L27
    L21:
        r7 = r21;
        goto L23
    L17:
        r6 = r20;
        goto L19
    L13:
        r5 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
