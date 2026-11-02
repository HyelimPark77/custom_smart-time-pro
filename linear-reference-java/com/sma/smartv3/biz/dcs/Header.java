package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class Header extends JsonFieldContainer implements Serializable {

    @aa1
    private final String name;

    @aa1
    private final String namespace;

    public Header(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "namespace");
        Intrinsics.X0O(r3, "name");
        this.namespace = r2;
        this.name = r3;
    }

    public static /* synthetic */ Header copy$default(Header r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.namespace;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.namespace;
    }

    @aa1
    public final String component2() {
        return this.name;
    }

    @aa1
    public final Header copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "namespace");
        Intrinsics.X0O(r3, "name");
        return new Header(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Header) == true) goto L8;
        return false;
    L8:
        Header r6 = (Header) r5;
        if (Intrinsics.XOO0ii0(this.namespace, r6.namespace) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return (this.namespace.hashCode() * 31) + this.name.hashCode();
    }

    @aa1
    public String toString() {
        return "Header(namespace=" + this.namespace + ", name=" + this.name + I000IiI1O.iO.iO;
    }
}
