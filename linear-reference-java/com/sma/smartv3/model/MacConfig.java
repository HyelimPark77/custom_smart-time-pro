package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MacConfig extends JsonFieldContainer {

    @aa1
    private String aiModelService;

    @aa1
    private String mac;

    @aa1
    private String supDirectAI;

    public MacConfig() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ MacConfig copy$default(MacConfig r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mac;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.supDirectAI;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.aiModelService;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.mac;
    }

    @aa1
    public final String component2() {
        return this.supDirectAI;
    }

    @aa1
    public final String component3() {
        return this.aiModelService;
    }

    @aa1
    public final MacConfig copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "mac");
        Intrinsics.X0O(r3, "supDirectAI");
        Intrinsics.X0O(r4, "aiModelService");
        return new MacConfig(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MacConfig) == true) goto L8;
        return false;
    L8:
        MacConfig r6 = (MacConfig) r5;
        if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.supDirectAI, r6.supDirectAI) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.aiModelService, r6.aiModelService) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getAiModelService() {
        return this.aiModelService;
    }

    @aa1
    public final String getMac() {
        return this.mac;
    }

    @aa1
    public final String getSupDirectAI() {
        return this.supDirectAI;
    }

    public int hashCode() {
        return (((this.mac.hashCode() * 31) + this.supDirectAI.hashCode()) * 31) + this.aiModelService.hashCode();
    }

    public final void setAiModelService(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.aiModelService = r2;
    }

    public final void setMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mac = r2;
    }

    public final void setSupDirectAI(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supDirectAI = r2;
    }

    @aa1
    public String toString() {
        return "MacConfig(mac=" + this.mac + ", supDirectAI=" + this.supDirectAI + ", aiModelService=" + this.aiModelService + I000IiI1O.iO.iO;
    }

    public MacConfig(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "mac");
        Intrinsics.X0O(r3, "supDirectAI");
        Intrinsics.X0O(r4, "aiModelService");
        this.mac = r2;
        this.supDirectAI = r3;
        this.aiModelService = r4;
    }

    public /* synthetic */ MacConfig(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
