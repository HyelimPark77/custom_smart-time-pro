package com.sma.smartv3.ui.device.model;

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

    public static /* synthetic */ ThirdPartyDeviceFilterData copy$default(ThirdPartyDeviceFilterData r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.bleName;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final ThirdPartyDeviceFilterData copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "bleName");
        return new ThirdPartyDeviceFilterData(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ThirdPartyDeviceFilterData) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.bleName, ((ThirdPartyDeviceFilterData) r4).bleName) == true) goto L11;
        return false;
    L11:
        return true;
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
        return "ThirdPartyDeviceFilterData(bleName=" + this.bleName + I000IiI1O.iO.iO;
    }

    public ThirdPartyDeviceFilterData(@aa1 String r2) {
        Intrinsics.X0O(r2, "bleName");
        this.bleName = r2;
    }

    public /* synthetic */ ThirdPartyDeviceFilterData(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
