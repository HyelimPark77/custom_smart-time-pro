package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceOnlineInfo extends JsonFieldContainer {

    @aa1
    private String bleName;
    private int supportAutoBinding;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceOnlineInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeviceOnlineInfo copy$default(DeviceOnlineInfo deviceOnlineInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceOnlineInfo.bleName;
        }
        if ((i2 & 2) != 0) {
            i = deviceOnlineInfo.supportAutoBinding;
        }
        return deviceOnlineInfo.copy(str, i);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    public final int component2() {
        return this.supportAutoBinding;
    }

    @aa1
    public final DeviceOnlineInfo copy(@aa1 String bleName, int i) {
        Intrinsics.X0O(bleName, "bleName");
        return new DeviceOnlineInfo(bleName, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOnlineInfo)) {
            return false;
        }
        DeviceOnlineInfo deviceOnlineInfo = (DeviceOnlineInfo) obj;
        return Intrinsics.XOO0ii0(this.bleName, deviceOnlineInfo.bleName) && this.supportAutoBinding == deviceOnlineInfo.supportAutoBinding;
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    public final int getSupportAutoBinding() {
        return this.supportAutoBinding;
    }

    public int hashCode() {
        return (this.bleName.hashCode() * 31) + Integer.hashCode(this.supportAutoBinding);
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setSupportAutoBinding(int i) {
        this.supportAutoBinding = i;
    }

    @aa1
    public String toString() {
        return "DeviceOnlineInfo(bleName=" + this.bleName + ", supportAutoBinding=" + this.supportAutoBinding + I000IiI1O.C2156iO.f1007iO;
    }

    public DeviceOnlineInfo(@aa1 String bleName, int i) {
        Intrinsics.X0O(bleName, "bleName");
        this.bleName = bleName;
        this.supportAutoBinding = i;
    }

    public /* synthetic */ DeviceOnlineInfo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
