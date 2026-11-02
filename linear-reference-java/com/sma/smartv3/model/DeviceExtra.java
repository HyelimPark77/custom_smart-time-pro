package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceExtra extends JsonField {

    @aa1
    private String languagePackVersion;

    @aa1
    private String uiPackVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceExtra() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeviceExtra copy$default(DeviceExtra r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.uiPackVersion;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.languagePackVersion;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.uiPackVersion;
    }

    @aa1
    public final String component2() {
        return this.languagePackVersion;
    }

    @aa1
    public final DeviceExtra copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "uiPackVersion");
        Intrinsics.X0O(r3, "languagePackVersion");
        return new DeviceExtra(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeviceExtra) == true) goto L8;
        return false;
    L8:
        DeviceExtra r6 = (DeviceExtra) r5;
        if (Intrinsics.XOO0ii0(this.uiPackVersion, r6.uiPackVersion) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.languagePackVersion, r6.languagePackVersion) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getLanguagePackVersion() {
        return this.languagePackVersion;
    }

    @aa1
    public final String getUiPackVersion() {
        return this.uiPackVersion;
    }

    public int hashCode() {
        return (this.uiPackVersion.hashCode() * 31) + this.languagePackVersion.hashCode();
    }

    public final void setLanguagePackVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.languagePackVersion = r2;
    }

    public final void setUiPackVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.uiPackVersion = r2;
    }

    @aa1
    public String toString() {
        return "DeviceExtra(uiPackVersion=" + this.uiPackVersion + ", languagePackVersion=" + this.languagePackVersion + I000IiI1O.iO.iO;
    }

    public DeviceExtra(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "uiPackVersion");
        Intrinsics.X0O(r3, "languagePackVersion");
        this.uiPackVersion = r2;
        this.languagePackVersion = r3;
    }

    public /* synthetic */ DeviceExtra(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
