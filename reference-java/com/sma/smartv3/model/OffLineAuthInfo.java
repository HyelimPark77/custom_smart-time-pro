package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(null, null, 0, 0, null, 31, null);
    }

    public static /* synthetic */ OffLineAuthInfo copy$default(OffLineAuthInfo offLineAuthInfo, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = offLineAuthInfo.deviceId;
        }
        if ((i3 & 2) != 0) {
            str2 = offLineAuthInfo.authCode;
        }
        if ((i3 & 4) != 0) {
            i = offLineAuthInfo.authIndex;
        }
        if ((i3 & 8) != 0) {
            i2 = offLineAuthInfo.authCount;
        }
        if ((i3 & 16) != 0) {
            str3 = offLineAuthInfo.authType;
        }
        String str4 = str3;
        int i4 = i;
        return offLineAuthInfo.copy(str, str2, i4, i2, str4);
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
    public final OffLineAuthInfo copy(@aa1 String deviceId, @aa1 String authCode, int i, int i2, @aa1 String authType) {
        Intrinsics.X0O(deviceId, "deviceId");
        Intrinsics.X0O(authCode, "authCode");
        Intrinsics.X0O(authType, "authType");
        return new OffLineAuthInfo(deviceId, authCode, i, i2, authType);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffLineAuthInfo)) {
            return false;
        }
        OffLineAuthInfo offLineAuthInfo = (OffLineAuthInfo) obj;
        return Intrinsics.XOO0ii0(this.deviceId, offLineAuthInfo.deviceId) && Intrinsics.XOO0ii0(this.authCode, offLineAuthInfo.authCode) && this.authIndex == offLineAuthInfo.authIndex && this.authCount == offLineAuthInfo.authCount && Intrinsics.XOO0ii0(this.authType, offLineAuthInfo.authType);
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
        return "OffLineAuthInfo(deviceId=" + this.deviceId + ", authCode=" + this.authCode + ", authIndex=" + this.authIndex + ", authCount=" + this.authCount + ", authType=" + this.authType + I000IiI1O.C2156iO.f1007iO;
    }

    public OffLineAuthInfo(@aa1 String deviceId, @aa1 String authCode, int i, int i2, @aa1 String authType) {
        Intrinsics.X0O(deviceId, "deviceId");
        Intrinsics.X0O(authCode, "authCode");
        Intrinsics.X0O(authType, "authType");
        this.deviceId = deviceId;
        this.authCode = authCode;
        this.authIndex = i;
        this.authCount = i2;
        this.authType = authType;
    }

    public /* synthetic */ OffLineAuthInfo(String str, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3);
    }
}
