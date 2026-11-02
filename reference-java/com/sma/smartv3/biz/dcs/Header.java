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

    public Header(@aa1 String namespace, @aa1 String name) {
        Intrinsics.X0O(namespace, "namespace");
        Intrinsics.X0O(name, "name");
        this.namespace = namespace;
        this.name = name;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.namespace;
        }
        if ((i & 2) != 0) {
            str2 = header.name;
        }
        return header.copy(str, str2);
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
    public final Header copy(@aa1 String namespace, @aa1 String name) {
        Intrinsics.X0O(namespace, "namespace");
        Intrinsics.X0O(name, "name");
        return new Header(namespace, name);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.XOO0ii0(this.namespace, header.namespace) && Intrinsics.XOO0ii0(this.name, header.name);
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
        return "Header(namespace=" + this.namespace + ", name=" + this.name + I000IiI1O.C2156iO.f1007iO;
    }
}
