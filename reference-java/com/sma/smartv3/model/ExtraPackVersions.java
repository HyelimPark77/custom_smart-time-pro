package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtraPackVersions extends JsonFieldContainer implements Serializable {

    @tb1
    private FirmwareVersion brandPackVersion;

    @tb1
    private FirmwareVersion dialPackVersion;

    @tb1
    private FirmwareVersion fontPackVersion;

    @tb1
    private FirmwareVersion gpsFirmwareVersion;

    @tb1
    private FirmwareVersion languagePackVersion;

    @tb1
    private FirmwareVersion networkFirmwareVersion;

    @tb1
    private FirmwareVersion uiPackVersion;

    public ExtraPackVersions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ExtraPackVersions copy$default(ExtraPackVersions extraPackVersions, FirmwareVersion firmwareVersion, FirmwareVersion firmwareVersion2, FirmwareVersion firmwareVersion3, FirmwareVersion firmwareVersion4, FirmwareVersion firmwareVersion5, FirmwareVersion firmwareVersion6, FirmwareVersion firmwareVersion7, int i, Object obj) {
        if ((i & 1) != 0) {
            firmwareVersion = extraPackVersions.uiPackVersion;
        }
        if ((i & 2) != 0) {
            firmwareVersion2 = extraPackVersions.languagePackVersion;
        }
        if ((i & 4) != 0) {
            firmwareVersion3 = extraPackVersions.brandPackVersion;
        }
        if ((i & 8) != 0) {
            firmwareVersion4 = extraPackVersions.fontPackVersion;
        }
        if ((i & 16) != 0) {
            firmwareVersion5 = extraPackVersions.gpsFirmwareVersion;
        }
        if ((i & 32) != 0) {
            firmwareVersion6 = extraPackVersions.networkFirmwareVersion;
        }
        if ((i & 64) != 0) {
            firmwareVersion7 = extraPackVersions.dialPackVersion;
        }
        FirmwareVersion firmwareVersion8 = firmwareVersion6;
        FirmwareVersion firmwareVersion9 = firmwareVersion7;
        FirmwareVersion firmwareVersion10 = firmwareVersion5;
        FirmwareVersion firmwareVersion11 = firmwareVersion3;
        return extraPackVersions.copy(firmwareVersion, firmwareVersion2, firmwareVersion11, firmwareVersion4, firmwareVersion10, firmwareVersion8, firmwareVersion9);
    }

    @tb1
    public final FirmwareVersion component1() {
        return this.uiPackVersion;
    }

    @tb1
    public final FirmwareVersion component2() {
        return this.languagePackVersion;
    }

    @tb1
    public final FirmwareVersion component3() {
        return this.brandPackVersion;
    }

    @tb1
    public final FirmwareVersion component4() {
        return this.fontPackVersion;
    }

    @tb1
    public final FirmwareVersion component5() {
        return this.gpsFirmwareVersion;
    }

    @tb1
    public final FirmwareVersion component6() {
        return this.networkFirmwareVersion;
    }

    @tb1
    public final FirmwareVersion component7() {
        return this.dialPackVersion;
    }

    @aa1
    public final ExtraPackVersions copy(@tb1 FirmwareVersion firmwareVersion, @tb1 FirmwareVersion firmwareVersion2, @tb1 FirmwareVersion firmwareVersion3, @tb1 FirmwareVersion firmwareVersion4, @tb1 FirmwareVersion firmwareVersion5, @tb1 FirmwareVersion firmwareVersion6, @tb1 FirmwareVersion firmwareVersion7) {
        return new ExtraPackVersions(firmwareVersion, firmwareVersion2, firmwareVersion3, firmwareVersion4, firmwareVersion5, firmwareVersion6, firmwareVersion7);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraPackVersions)) {
            return false;
        }
        ExtraPackVersions extraPackVersions = (ExtraPackVersions) obj;
        return Intrinsics.XOO0ii0(this.uiPackVersion, extraPackVersions.uiPackVersion) && Intrinsics.XOO0ii0(this.languagePackVersion, extraPackVersions.languagePackVersion) && Intrinsics.XOO0ii0(this.brandPackVersion, extraPackVersions.brandPackVersion) && Intrinsics.XOO0ii0(this.fontPackVersion, extraPackVersions.fontPackVersion) && Intrinsics.XOO0ii0(this.gpsFirmwareVersion, extraPackVersions.gpsFirmwareVersion) && Intrinsics.XOO0ii0(this.networkFirmwareVersion, extraPackVersions.networkFirmwareVersion) && Intrinsics.XOO0ii0(this.dialPackVersion, extraPackVersions.dialPackVersion);
    }

    @tb1
    public final FirmwareVersion getBrandPackVersion() {
        return this.brandPackVersion;
    }

    @tb1
    public final FirmwareVersion getDialPackVersion() {
        return this.dialPackVersion;
    }

    @tb1
    public final FirmwareVersion getFontPackVersion() {
        return this.fontPackVersion;
    }

    @tb1
    public final FirmwareVersion getGpsFirmwareVersion() {
        return this.gpsFirmwareVersion;
    }

    @tb1
    public final FirmwareVersion getLanguagePackVersion() {
        return this.languagePackVersion;
    }

    @tb1
    public final FirmwareVersion getNetworkFirmwareVersion() {
        return this.networkFirmwareVersion;
    }

    @tb1
    public final FirmwareVersion getUiPackVersion() {
        return this.uiPackVersion;
    }

    public int hashCode() {
        FirmwareVersion firmwareVersion = this.uiPackVersion;
        int iHashCode = (firmwareVersion == null ? 0 : firmwareVersion.hashCode()) * 31;
        FirmwareVersion firmwareVersion2 = this.languagePackVersion;
        int iHashCode2 = (iHashCode + (firmwareVersion2 == null ? 0 : firmwareVersion2.hashCode())) * 31;
        FirmwareVersion firmwareVersion3 = this.brandPackVersion;
        int iHashCode3 = (iHashCode2 + (firmwareVersion3 == null ? 0 : firmwareVersion3.hashCode())) * 31;
        FirmwareVersion firmwareVersion4 = this.fontPackVersion;
        int iHashCode4 = (iHashCode3 + (firmwareVersion4 == null ? 0 : firmwareVersion4.hashCode())) * 31;
        FirmwareVersion firmwareVersion5 = this.gpsFirmwareVersion;
        int iHashCode5 = (iHashCode4 + (firmwareVersion5 == null ? 0 : firmwareVersion5.hashCode())) * 31;
        FirmwareVersion firmwareVersion6 = this.networkFirmwareVersion;
        int iHashCode6 = (iHashCode5 + (firmwareVersion6 == null ? 0 : firmwareVersion6.hashCode())) * 31;
        FirmwareVersion firmwareVersion7 = this.dialPackVersion;
        return iHashCode6 + (firmwareVersion7 != null ? firmwareVersion7.hashCode() : 0);
    }

    public final void setBrandPackVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.brandPackVersion = firmwareVersion;
    }

    public final void setDialPackVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.dialPackVersion = firmwareVersion;
    }

    public final void setFontPackVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.fontPackVersion = firmwareVersion;
    }

    public final void setGpsFirmwareVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.gpsFirmwareVersion = firmwareVersion;
    }

    public final void setLanguagePackVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.languagePackVersion = firmwareVersion;
    }

    public final void setNetworkFirmwareVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.networkFirmwareVersion = firmwareVersion;
    }

    public final void setUiPackVersion(@tb1 FirmwareVersion firmwareVersion) {
        this.uiPackVersion = firmwareVersion;
    }

    @aa1
    public String toString() {
        return "ExtraPackVersions(uiPackVersion=" + this.uiPackVersion + ", languagePackVersion=" + this.languagePackVersion + ", brandPackVersion=" + this.brandPackVersion + ", fontPackVersion=" + this.fontPackVersion + ", gpsFirmwareVersion=" + this.gpsFirmwareVersion + ", networkFirmwareVersion=" + this.networkFirmwareVersion + ", dialPackVersion=" + this.dialPackVersion + I000IiI1O.C2156iO.f1007iO;
    }

    public ExtraPackVersions(@tb1 FirmwareVersion firmwareVersion, @tb1 FirmwareVersion firmwareVersion2, @tb1 FirmwareVersion firmwareVersion3, @tb1 FirmwareVersion firmwareVersion4, @tb1 FirmwareVersion firmwareVersion5, @tb1 FirmwareVersion firmwareVersion6, @tb1 FirmwareVersion firmwareVersion7) {
        this.uiPackVersion = firmwareVersion;
        this.languagePackVersion = firmwareVersion2;
        this.brandPackVersion = firmwareVersion3;
        this.fontPackVersion = firmwareVersion4;
        this.gpsFirmwareVersion = firmwareVersion5;
        this.networkFirmwareVersion = firmwareVersion6;
        this.dialPackVersion = firmwareVersion7;
    }

    public /* synthetic */ ExtraPackVersions(FirmwareVersion firmwareVersion, FirmwareVersion firmwareVersion2, FirmwareVersion firmwareVersion3, FirmwareVersion firmwareVersion4, FirmwareVersion firmwareVersion5, FirmwareVersion firmwareVersion6, FirmwareVersion firmwareVersion7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : firmwareVersion, (i & 2) != 0 ? null : firmwareVersion2, (i & 4) != 0 ? null : firmwareVersion3, (i & 8) != 0 ? null : firmwareVersion4, (i & 16) != 0 ? null : firmwareVersion5, (i & 32) != 0 ? null : firmwareVersion6, (i & 64) != 0 ? null : firmwareVersion7);
    }
}
