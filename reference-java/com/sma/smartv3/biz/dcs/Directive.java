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

    public Directive(@aa1 Header header, @aa1 PlayPayload payload) {
        Intrinsics.X0O(header, "header");
        Intrinsics.X0O(payload, "payload");
        this.header = header;
        this.payload = payload;
    }

    public static /* synthetic */ Directive copy$default(Directive directive, Header header, PlayPayload playPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            header = directive.header;
        }
        if ((i & 2) != 0) {
            playPayload = directive.payload;
        }
        return directive.copy(header, playPayload);
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
    public final Directive copy(@aa1 Header header, @aa1 PlayPayload payload) {
        Intrinsics.X0O(header, "header");
        Intrinsics.X0O(payload, "payload");
        return new Directive(header, payload);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Directive)) {
            return false;
        }
        Directive directive = (Directive) obj;
        return Intrinsics.XOO0ii0(this.header, directive.header) && Intrinsics.XOO0ii0(this.payload, directive.payload);
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
        return "Directive(header=" + this.header + ", payload=" + this.payload + I000IiI1O.C2156iO.f1007iO;
    }
}
