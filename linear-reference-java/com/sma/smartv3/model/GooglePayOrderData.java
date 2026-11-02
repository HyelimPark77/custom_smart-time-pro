package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GooglePayOrderData extends JsonFieldContainer implements Serializable {
    private int acknowledgementState;
    private int consumptionState;

    @aa1
    private String developerPayload;

    @aa1
    private String kind;

    @aa1
    private String orderId;

    @aa1
    private String purchaseState;
    private long purchaseTimeMillis;
    private int purchaseType;

    @aa1
    private String regionCode;

    public GooglePayOrderData() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        long r6 = 0;
        int r8 = 0;
        int r9 = 0;
        String r10 = null;
        this(r1, r2, r3, r4, r5, r6, r8, r9, r10, 511, null);
    }

    public static /* synthetic */ GooglePayOrderData copy$default(GooglePayOrderData r0, int r1, String r2, String r3, String r4, String r5, long r6, int r8, int r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.consumptionState;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.developerPayload;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.kind;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.orderId;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.purchaseState;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.purchaseTimeMillis;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.purchaseType;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.acknowledgementState;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.regionCode;
    L29:
        String r13 = r10;
        int r14 = r8;
        long r15 = r6;
        String r7 = r4;
        String r16 = r5;
        String r17 = r2;
        String r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r17, r18, r7, r16, r15, r14, r9, r13);
    }

    public final int component1() {
        return this.consumptionState;
    }

    @aa1
    public final String component2() {
        return this.developerPayload;
    }

    @aa1
    public final String component3() {
        return this.kind;
    }

    @aa1
    public final String component4() {
        return this.orderId;
    }

    @aa1
    public final String component5() {
        return this.purchaseState;
    }

    public final long component6() {
        return this.purchaseTimeMillis;
    }

    public final int component7() {
        return this.purchaseType;
    }

    public final int component8() {
        return this.acknowledgementState;
    }

    @aa1
    public final String component9() {
        return this.regionCode;
    }

    @aa1
    public final GooglePayOrderData copy(int r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, long r18, int r20, int r21, @aa1 String r22) {
        Intrinsics.X0O(r14, SDKConstants.PARAM_DEVELOPER_PAYLOAD);
        Intrinsics.X0O(r15, "kind");
        Intrinsics.X0O(r16, "orderId");
        Intrinsics.X0O(r17, "purchaseState");
        Intrinsics.X0O(r22, "regionCode");
        return new GooglePayOrderData(r13, r14, r15, r16, r17, r18, r20, r21, r22);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof GooglePayOrderData) == true) goto L8;
        return false;
    L8:
        GooglePayOrderData r9 = (GooglePayOrderData) r8;
        if (this.consumptionState == r9.consumptionState) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.developerPayload, r9.developerPayload) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.kind, r9.kind) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.orderId, r9.orderId) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.purchaseState, r9.purchaseState) == true) goto L24;
        return false;
    L24:
        if (this.purchaseTimeMillis == r9.purchaseTimeMillis) goto L27;
        return false;
    L27:
        if (this.purchaseType == r9.purchaseType) goto L30;
        return false;
    L30:
        if (this.acknowledgementState == r9.acknowledgementState) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.regionCode, r9.regionCode) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    @aa1
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    @aa1
    public final String getKind() {
        return this.kind;
    }

    @aa1
    public final String getOrderId() {
        return this.orderId;
    }

    @aa1
    public final String getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    public final int getPurchaseType() {
        return this.purchaseType;
    }

    @aa1
    public final String getRegionCode() {
        return this.regionCode;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.consumptionState) * 31) + this.developerPayload.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.purchaseState.hashCode()) * 31) + Long.hashCode(this.purchaseTimeMillis)) * 31) + Integer.hashCode(this.purchaseType)) * 31) + Integer.hashCode(this.acknowledgementState)) * 31) + this.regionCode.hashCode();
    }

    public final void setAcknowledgementState(int r1) {
        this.acknowledgementState = r1;
    }

    public final void setConsumptionState(int r1) {
        this.consumptionState = r1;
    }

    public final void setDeveloperPayload(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.developerPayload = r2;
    }

    public final void setKind(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.kind = r2;
    }

    public final void setOrderId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderId = r2;
    }

    public final void setPurchaseState(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.purchaseState = r2;
    }

    public final void setPurchaseTimeMillis(long r1) {
        this.purchaseTimeMillis = r1;
    }

    public final void setPurchaseType(int r1) {
        this.purchaseType = r1;
    }

    public final void setRegionCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.regionCode = r2;
    }

    @aa1
    public String toString() {
        return "GooglePayOrderData(consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", kind=" + this.kind + ", orderId=" + this.orderId + ", purchaseState=" + this.purchaseState + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", regionCode=" + this.regionCode + I000IiI1O.iO.iO;
    }

    public GooglePayOrderData(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, long r7, int r9, int r10, @aa1 String r11) {
        Intrinsics.X0O(r3, SDKConstants.PARAM_DEVELOPER_PAYLOAD);
        Intrinsics.X0O(r4, "kind");
        Intrinsics.X0O(r5, "orderId");
        Intrinsics.X0O(r6, "purchaseState");
        Intrinsics.X0O(r11, "regionCode");
        this.consumptionState = r2;
        this.developerPayload = r3;
        this.kind = r4;
        this.orderId = r5;
        this.purchaseState = r6;
        this.purchaseTimeMillis = r7;
        this.purchaseType = r9;
        this.acknowledgementState = r10;
        this.regionCode = r11;
    }

    public /* synthetic */ GooglePayOrderData(int r3, String r4, String r5, String r6, String r7, long r8, int r10, int r11, String r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "";
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
        r8 = 0;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r10 = 0;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r11 = 0;
    L27:
        if ((r13 & 256) == 0) goto L30;
        String r15 = "";
    L29:
        long r9 = r8;
        String r16 = r7;
        String r17 = r6;
        String r18 = r5;
        this(r3, r4, r18, r17, r16, r9, r10, r11, r15);
        return;
    L30:
        r15 = r12;
        goto L29
    }
}
