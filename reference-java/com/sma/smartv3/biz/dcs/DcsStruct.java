package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DcsStruct extends JsonFieldContainer implements Serializable {

    @aa1
    private final Directive directive;

    public DcsStruct(@aa1 Directive directive) {
        Intrinsics.X0O(directive, "directive");
        this.directive = directive;
    }

    public static /* synthetic */ DcsStruct copy$default(DcsStruct dcsStruct, Directive directive, int i, Object obj) {
        if ((i & 1) != 0) {
            directive = dcsStruct.directive;
        }
        return dcsStruct.copy(directive);
    }

    @aa1
    public final Directive component1() {
        return this.directive;
    }

    @aa1
    public final DcsStruct copy(@aa1 Directive directive) {
        Intrinsics.X0O(directive, "directive");
        return new DcsStruct(directive);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DcsStruct) && Intrinsics.XOO0ii0(this.directive, ((DcsStruct) obj).directive);
    }

    @aa1
    public final Directive getDirective() {
        return this.directive;
    }

    public int hashCode() {
        return this.directive.hashCode();
    }

    @aa1
    public String toString() {
        return "DcsStruct(directive=" + this.directive + I000IiI1O.C2156iO.f1007iO;
    }
}
