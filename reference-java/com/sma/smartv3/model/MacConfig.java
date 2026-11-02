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
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MacConfig copy$default(MacConfig macConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = macConfig.mac;
        }
        if ((i & 2) != 0) {
            str2 = macConfig.supDirectAI;
        }
        if ((i & 4) != 0) {
            str3 = macConfig.aiModelService;
        }
        return macConfig.copy(str, str2, str3);
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
    public final MacConfig copy(@aa1 String mac, @aa1 String supDirectAI, @aa1 String aiModelService) {
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(supDirectAI, "supDirectAI");
        Intrinsics.X0O(aiModelService, "aiModelService");
        return new MacConfig(mac, supDirectAI, aiModelService);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MacConfig)) {
            return false;
        }
        MacConfig macConfig = (MacConfig) obj;
        return Intrinsics.XOO0ii0(this.mac, macConfig.mac) && Intrinsics.XOO0ii0(this.supDirectAI, macConfig.supDirectAI) && Intrinsics.XOO0ii0(this.aiModelService, macConfig.aiModelService);
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

    public final void setAiModelService(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.aiModelService = str;
    }

    public final void setMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mac = str;
    }

    public final void setSupDirectAI(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.supDirectAI = str;
    }

    @aa1
    public String toString() {
        return "MacConfig(mac=" + this.mac + ", supDirectAI=" + this.supDirectAI + ", aiModelService=" + this.aiModelService + I000IiI1O.C2156iO.f1007iO;
    }

    public MacConfig(@aa1 String mac, @aa1 String supDirectAI, @aa1 String aiModelService) {
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(supDirectAI, "supDirectAI");
        Intrinsics.X0O(aiModelService, "aiModelService");
        this.mac = mac;
        this.supDirectAI = supDirectAI;
        this.aiModelService = aiModelService;
    }

    public /* synthetic */ MacConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
