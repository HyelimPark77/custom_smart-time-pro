package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Directive extends JsonFieldContainer implements Serializable {

    @aa1
    private final Header header;

    @aa1
    private final PlayPayload payload;

    public Directive(@aa1 Header r2, @aa1 PlayPayload r3) {
        Intrinsics.X0O(r2, "header");
        Intrinsics.X0O(r3, "payload");
        this.header = r2;
        this.payload = r3;
    }

    public static /* synthetic */ Directive copy$default(Directive r0, Header r1, PlayPayload r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.header;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.payload;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final Header component1() {
        return this.header;
    }

    @aa1
    public final PlayPayload component2() {
        return this.payload;
    }

    @aa1
    public final Directive copy(@aa1 Header r2, @aa1 PlayPayload r3) {
        Intrinsics.X0O(r2, "header");
        Intrinsics.X0O(r3, "payload");
        return new Directive(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Directive) == true) goto L8;
        return false;
    L8:
        Directive r6 = (Directive) r5;
        if (Intrinsics.XOO0ii0(this.header, r6.header) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.payload, r6.payload) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final Header getHeader() {
        return this.header;
    }

    @aa1
    public final PlayPayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.payload.hashCode();
    }

    @aa1
    public String toString() {
        return "Directive(header=" + this.header + ", payload=" + this.payload + I000IiI1O.iO.iO;
    }
}
