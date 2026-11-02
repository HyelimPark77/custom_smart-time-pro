package com.sma.smartv3.p610ui.device.model;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class ThirdPartyDeviceFilterData {

    @aa1
    private final String bleName;

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyDeviceFilterData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ThirdPartyDeviceFilterData copy$default(ThirdPartyDeviceFilterData thirdPartyDeviceFilterData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyDeviceFilterData.bleName;
        }
        return thirdPartyDeviceFilterData.copy(str);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final ThirdPartyDeviceFilterData copy(@aa1 String bleName) {
        Intrinsics.X0O(bleName, "bleName");
        return new ThirdPartyDeviceFilterData(bleName);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThirdPartyDeviceFilterData) && Intrinsics.XOO0ii0(this.bleName, ((ThirdPartyDeviceFilterData) obj).bleName);
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    public int hashCode() {
        return this.bleName.hashCode();
    }

    @aa1
    public String toString() {
        return "ThirdPartyDeviceFilterData(bleName=" + this.bleName + I000IiI1O.C2156iO.f1007iO;
    }

    public ThirdPartyDeviceFilterData(@aa1 String bleName) {
        Intrinsics.X0O(bleName, "bleName");
        this.bleName = bleName;
    }

    public /* synthetic */ ThirdPartyDeviceFilterData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
