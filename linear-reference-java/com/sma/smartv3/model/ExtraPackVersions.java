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
        FirmwareVersion r1 = null;
        FirmwareVersion r2 = null;
        FirmwareVersion r3 = null;
        FirmwareVersion r4 = null;
        FirmwareVersion r5 = null;
        FirmwareVersion r6 = null;
        FirmwareVersion r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ ExtraPackVersions copy$default(ExtraPackVersions r0, FirmwareVersion r1, FirmwareVersion r2, FirmwareVersion r3, FirmwareVersion r4, FirmwareVersion r5, FirmwareVersion r6, FirmwareVersion r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.uiPackVersion;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.languagePackVersion;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.brandPackVersion;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.fontPackVersion;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.gpsFirmwareVersion;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.networkFirmwareVersion;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.dialPackVersion;
    L23:
        FirmwareVersion r10 = r6;
        FirmwareVersion r11 = r7;
        FirmwareVersion r12 = r4;
        FirmwareVersion r13 = r5;
        FirmwareVersion r14 = r3;
        FirmwareVersion r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
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
    public final ExtraPackVersions copy(@tb1 FirmwareVersion r9, @tb1 FirmwareVersion r10, @tb1 FirmwareVersion r11, @tb1 FirmwareVersion r12, @tb1 FirmwareVersion r13, @tb1 FirmwareVersion r14, @tb1 FirmwareVersion r15) {
        return new ExtraPackVersions(r9, r10, r11, r12, r13, r14, r15);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ExtraPackVersions) == true) goto L8;
        return false;
    L8:
        ExtraPackVersions r6 = (ExtraPackVersions) r5;
        if (Intrinsics.XOO0ii0(this.uiPackVersion, r6.uiPackVersion) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.languagePackVersion, r6.languagePackVersion) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.brandPackVersion, r6.brandPackVersion) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.fontPackVersion, r6.fontPackVersion) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.gpsFirmwareVersion, r6.gpsFirmwareVersion) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.networkFirmwareVersion, r6.networkFirmwareVersion) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.dialPackVersion, r6.dialPackVersion) == true) goto L29;
        return false;
    L29:
        return true;
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
        FirmwareVersion r0 = this.uiPackVersion;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        FirmwareVersion r4 = this.languagePackVersion;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        FirmwareVersion r7 = this.brandPackVersion;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        FirmwareVersion r10 = this.fontPackVersion;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        FirmwareVersion r13 = this.gpsFirmwareVersion;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        FirmwareVersion r16 = this.networkFirmwareVersion;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        FirmwareVersion r19 = this.dialPackVersion;
        if (r19 == null) goto L31;
        r1 = r19.hashCode();
    L31:
        return r18 + r1;
    L25:
        r17 = r16.hashCode();
        goto L26
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setBrandPackVersion(@tb1 FirmwareVersion r1) {
        this.brandPackVersion = r1;
    }

    public final void setDialPackVersion(@tb1 FirmwareVersion r1) {
        this.dialPackVersion = r1;
    }

    public final void setFontPackVersion(@tb1 FirmwareVersion r1) {
        this.fontPackVersion = r1;
    }

    public final void setGpsFirmwareVersion(@tb1 FirmwareVersion r1) {
        this.gpsFirmwareVersion = r1;
    }

    public final void setLanguagePackVersion(@tb1 FirmwareVersion r1) {
        this.languagePackVersion = r1;
    }

    public final void setNetworkFirmwareVersion(@tb1 FirmwareVersion r1) {
        this.networkFirmwareVersion = r1;
    }

    public final void setUiPackVersion(@tb1 FirmwareVersion r1) {
        this.uiPackVersion = r1;
    }

    @aa1
    public String toString() {
        return "ExtraPackVersions(uiPackVersion=" + this.uiPackVersion + ", languagePackVersion=" + this.languagePackVersion + ", brandPackVersion=" + this.brandPackVersion + ", fontPackVersion=" + this.fontPackVersion + ", gpsFirmwareVersion=" + this.gpsFirmwareVersion + ", networkFirmwareVersion=" + this.networkFirmwareVersion + ", dialPackVersion=" + this.dialPackVersion + I000IiI1O.iO.iO;
    }

    public ExtraPackVersions(@tb1 FirmwareVersion r1, @tb1 FirmwareVersion r2, @tb1 FirmwareVersion r3, @tb1 FirmwareVersion r4, @tb1 FirmwareVersion r5, @tb1 FirmwareVersion r6, @tb1 FirmwareVersion r7) {
        this.uiPackVersion = r1;
        this.languagePackVersion = r2;
        this.brandPackVersion = r3;
        this.fontPackVersion = r4;
        this.gpsFirmwareVersion = r5;
        this.networkFirmwareVersion = r6;
        this.dialPackVersion = r7;
    }

    public /* synthetic */ ExtraPackVersions(FirmwareVersion r2, FirmwareVersion r3, FirmwareVersion r4, FirmwareVersion r5, FirmwareVersion r6, FirmwareVersion r7, FirmwareVersion r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        FirmwareVersion r11 = null;
    L23:
        FirmwareVersion r12 = r7;
        FirmwareVersion r13 = r6;
        FirmwareVersion r14 = r5;
        FirmwareVersion r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
