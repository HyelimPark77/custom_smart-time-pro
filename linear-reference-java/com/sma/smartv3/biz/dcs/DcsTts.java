package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DcsTts extends JsonFieldContainer implements Serializable {

    @aa1
    private final String logid;

    @aa1
    private final String text;

    @aa1
    private final String tts_optional;

    public DcsTts(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "logid");
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r4, "tts_optional");
        this.logid = r2;
        this.text = r3;
        this.tts_optional = r4;
    }

    public static /* synthetic */ DcsTts copy$default(DcsTts r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.logid;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.text;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.tts_optional;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.logid;
    }

    @aa1
    public final String component2() {
        return this.text;
    }

    @aa1
    public final String component3() {
        return this.tts_optional;
    }

    @aa1
    public final DcsTts copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "logid");
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r4, "tts_optional");
        return new DcsTts(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DcsTts) == true) goto L8;
        return false;
    L8:
        DcsTts r6 = (DcsTts) r5;
        if (Intrinsics.XOO0ii0(this.logid, r6.logid) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.tts_optional, r6.tts_optional) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getLogid() {
        return this.logid;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getTts_optional() {
        return this.tts_optional;
    }

    public int hashCode() {
        return (((this.logid.hashCode() * 31) + this.text.hashCode()) * 31) + this.tts_optional.hashCode();
    }

    @aa1
    public String toString() {
        return "DcsTts(logid=" + this.logid + ", text=" + this.text + ", tts_optional=" + this.tts_optional + I000IiI1O.iO.iO;
    }
}
