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
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeviceExtra copy$default(DeviceExtra deviceExtra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceExtra.uiPackVersion;
        }
        if ((i & 2) != 0) {
            str2 = deviceExtra.languagePackVersion;
        }
        return deviceExtra.copy(str, str2);
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
    public final DeviceExtra copy(@aa1 String uiPackVersion, @aa1 String languagePackVersion) {
        Intrinsics.X0O(uiPackVersion, "uiPackVersion");
        Intrinsics.X0O(languagePackVersion, "languagePackVersion");
        return new DeviceExtra(uiPackVersion, languagePackVersion);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceExtra)) {
            return false;
        }
        DeviceExtra deviceExtra = (DeviceExtra) obj;
        return Intrinsics.XOO0ii0(this.uiPackVersion, deviceExtra.uiPackVersion) && Intrinsics.XOO0ii0(this.languagePackVersion, deviceExtra.languagePackVersion);
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

    public final void setLanguagePackVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.languagePackVersion = str;
    }

    public final void setUiPackVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.uiPackVersion = str;
    }

    @aa1
    public String toString() {
        return "DeviceExtra(uiPackVersion=" + this.uiPackVersion + ", languagePackVersion=" + this.languagePackVersion + I000IiI1O.C2156iO.f1007iO;
    }

    public DeviceExtra(@aa1 String uiPackVersion, @aa1 String languagePackVersion) {
        Intrinsics.X0O(uiPackVersion, "uiPackVersion");
        Intrinsics.X0O(languagePackVersion, "languagePackVersion");
        this.uiPackVersion = uiPackVersion;
        this.languagePackVersion = languagePackVersion;
    }

    public /* synthetic */ DeviceExtra(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
