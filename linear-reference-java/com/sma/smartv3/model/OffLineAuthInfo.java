package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.GetGomoreAuthKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class OffLineAuthInfo {

    @aa1
    private final String authCode;
    private final int authCount;
    private final int authIndex;

    @aa1
    private final String authType;

    @aa1
    private final String deviceId;

    public OffLineAuthInfo() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ OffLineAuthInfo copy$default(OffLineAuthInfo r0, String r1, String r2, int r3, int r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.deviceId;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.authCode;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.authIndex;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.authCount;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.authType;
    L17:
        int r8 = r4;
        String r9 = r5;
        int r10 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    @aa1
    public final String component1() {
        return this.deviceId;
    }

    @aa1
    public final String component2() {
        return this.authCode;
    }

    public final int component3() {
        return this.authIndex;
    }

    public final int component4() {
        return this.authCount;
    }

    @aa1
    public final String component5() {
        return this.authType;
    }

    @aa1
    public final OffLineAuthInfo copy(@aa1 String r8, @aa1 String r9, int r10, int r11, @aa1 String r12) {
        Intrinsics.X0O(r8, GetGomoreAuthKey.DEVICE_ID);
        Intrinsics.X0O(r9, "authCode");
        Intrinsics.X0O(r12, "authType");
        return new OffLineAuthInfo(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OffLineAuthInfo) == true) goto L8;
        return false;
    L8:
        OffLineAuthInfo r6 = (OffLineAuthInfo) r5;
        if (Intrinsics.XOO0ii0(this.deviceId, r6.deviceId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.authCode, r6.authCode) == true) goto L15;
        return false;
    L15:
        if (this.authIndex == r6.authIndex) goto L18;
        return false;
    L18:
        if (this.authCount == r6.authCount) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.authType, r6.authType) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getAuthCode() {
        return this.authCode;
    }

    public final int getAuthCount() {
        return this.authCount;
    }

    public final int getAuthIndex() {
        return this.authIndex;
    }

    @aa1
    public final String getAuthType() {
        return this.authType;
    }

    @aa1
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + this.authCode.hashCode()) * 31) + Integer.hashCode(this.authIndex)) * 31) + Integer.hashCode(this.authCount)) * 31) + this.authType.hashCode();
    }

    @aa1
    public String toString() {
        return "OffLineAuthInfo(deviceId=" + this.deviceId + ", authCode=" + this.authCode + ", authIndex=" + this.authIndex + ", authCount=" + this.authCount + ", authType=" + this.authType + I000IiI1O.iO.iO;
    }

    public OffLineAuthInfo(@aa1 String r2, @aa1 String r3, int r4, int r5, @aa1 String r6) {
        Intrinsics.X0O(r2, GetGomoreAuthKey.DEVICE_ID);
        Intrinsics.X0O(r3, "authCode");
        Intrinsics.X0O(r6, "authType");
        this.deviceId = r2;
        this.authCode = r3;
        this.authIndex = r4;
        this.authCount = r5;
        this.authType = r6;
    }

    public /* synthetic */ OffLineAuthInfo(String r3, String r4, int r5, int r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r10 = "";
    L17:
        int r11 = r6;
        int r12 = r5;
        this(r3, r4, r12, r11, r10);
        return;
    L18:
        r10 = r7;
        goto L17
    }
}
