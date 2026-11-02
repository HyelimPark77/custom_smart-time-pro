package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(0, null, null, null, null, 0L, 0, 0, null, 511, null);
    }

    public static /* synthetic */ GooglePayOrderData copy$default(GooglePayOrderData googlePayOrderData, int i, String str, String str2, String str3, String str4, long j, int i2, int i3, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = googlePayOrderData.consumptionState;
        }
        if ((i4 & 2) != 0) {
            str = googlePayOrderData.developerPayload;
        }
        if ((i4 & 4) != 0) {
            str2 = googlePayOrderData.kind;
        }
        if ((i4 & 8) != 0) {
            str3 = googlePayOrderData.orderId;
        }
        if ((i4 & 16) != 0) {
            str4 = googlePayOrderData.purchaseState;
        }
        if ((i4 & 32) != 0) {
            j = googlePayOrderData.purchaseTimeMillis;
        }
        if ((i4 & 64) != 0) {
            i2 = googlePayOrderData.purchaseType;
        }
        if ((i4 & 128) != 0) {
            i3 = googlePayOrderData.acknowledgementState;
        }
        if ((i4 & 256) != 0) {
            str5 = googlePayOrderData.regionCode;
        }
        String str6 = str5;
        int i5 = i2;
        long j2 = j;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        return googlePayOrderData.copy(i, str, str9, str7, str8, j2, i5, i3, str6);
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
    public final GooglePayOrderData copy(int i, @aa1 String developerPayload, @aa1 String kind, @aa1 String orderId, @aa1 String purchaseState, long j, int i2, int i3, @aa1 String regionCode) {
        Intrinsics.X0O(developerPayload, "developerPayload");
        Intrinsics.X0O(kind, "kind");
        Intrinsics.X0O(orderId, "orderId");
        Intrinsics.X0O(purchaseState, "purchaseState");
        Intrinsics.X0O(regionCode, "regionCode");
        return new GooglePayOrderData(i, developerPayload, kind, orderId, purchaseState, j, i2, i3, regionCode);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayOrderData)) {
            return false;
        }
        GooglePayOrderData googlePayOrderData = (GooglePayOrderData) obj;
        return this.consumptionState == googlePayOrderData.consumptionState && Intrinsics.XOO0ii0(this.developerPayload, googlePayOrderData.developerPayload) && Intrinsics.XOO0ii0(this.kind, googlePayOrderData.kind) && Intrinsics.XOO0ii0(this.orderId, googlePayOrderData.orderId) && Intrinsics.XOO0ii0(this.purchaseState, googlePayOrderData.purchaseState) && this.purchaseTimeMillis == googlePayOrderData.purchaseTimeMillis && this.purchaseType == googlePayOrderData.purchaseType && this.acknowledgementState == googlePayOrderData.acknowledgementState && Intrinsics.XOO0ii0(this.regionCode, googlePayOrderData.regionCode);
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

    public final void setAcknowledgementState(int i) {
        this.acknowledgementState = i;
    }

    public final void setConsumptionState(int i) {
        this.consumptionState = i;
    }

    public final void setDeveloperPayload(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.developerPayload = str;
    }

    public final void setKind(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.kind = str;
    }

    public final void setOrderId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPurchaseState(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.purchaseState = str;
    }

    public final void setPurchaseTimeMillis(long j) {
        this.purchaseTimeMillis = j;
    }

    public final void setPurchaseType(int i) {
        this.purchaseType = i;
    }

    public final void setRegionCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.regionCode = str;
    }

    @aa1
    public String toString() {
        return "GooglePayOrderData(consumptionState=" + this.consumptionState + ", developerPayload=" + this.developerPayload + ", kind=" + this.kind + ", orderId=" + this.orderId + ", purchaseState=" + this.purchaseState + ", purchaseTimeMillis=" + this.purchaseTimeMillis + ", purchaseType=" + this.purchaseType + ", acknowledgementState=" + this.acknowledgementState + ", regionCode=" + this.regionCode + I000IiI1O.C2156iO.f1007iO;
    }

    public GooglePayOrderData(int i, @aa1 String developerPayload, @aa1 String kind, @aa1 String orderId, @aa1 String purchaseState, long j, int i2, int i3, @aa1 String regionCode) {
        Intrinsics.X0O(developerPayload, "developerPayload");
        Intrinsics.X0O(kind, "kind");
        Intrinsics.X0O(orderId, "orderId");
        Intrinsics.X0O(purchaseState, "purchaseState");
        Intrinsics.X0O(regionCode, "regionCode");
        this.consumptionState = i;
        this.developerPayload = developerPayload;
        this.kind = kind;
        this.orderId = orderId;
        this.purchaseState = purchaseState;
        this.purchaseTimeMillis = j;
        this.purchaseType = i2;
        this.acknowledgementState = i3;
        this.regionCode = regionCode;
    }

    public /* synthetic */ GooglePayOrderData(int i, String str, String str2, String str3, String str4, long j, int i2, int i3, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? "" : str5);
    }
}
