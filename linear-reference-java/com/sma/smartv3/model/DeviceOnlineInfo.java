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
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeviceOnlineInfo copy$default(DeviceOnlineInfo r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.bleName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.supportAutoBinding;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    public final int component2() {
        return this.supportAutoBinding;
    }

    @aa1
    public final DeviceOnlineInfo copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "bleName");
        return new DeviceOnlineInfo(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeviceOnlineInfo) == true) goto L8;
        return false;
    L8:
        DeviceOnlineInfo r6 = (DeviceOnlineInfo) r5;
        if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L12;
        return false;
    L12:
        if (this.supportAutoBinding == r6.supportAutoBinding) goto L14;
        return false;
    L14:
        return true;
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

    public final void setBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bleName = r2;
    }

    public final void setSupportAutoBinding(int r1) {
        this.supportAutoBinding = r1;
    }

    @aa1
    public String toString() {
        return "DeviceOnlineInfo(bleName=" + this.bleName + ", supportAutoBinding=" + this.supportAutoBinding + I000IiI1O.iO.iO;
    }

    public DeviceOnlineInfo(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "bleName");
        this.bleName = r2;
        this.supportAutoBinding = r3;
    }

    public /* synthetic */ DeviceOnlineInfo(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
