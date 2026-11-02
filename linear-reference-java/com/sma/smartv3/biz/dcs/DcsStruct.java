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

    public DcsStruct(@aa1 Directive r2) {
        Intrinsics.X0O(r2, "directive");
        this.directive = r2;
    }

    public static /* synthetic */ DcsStruct copy$default(DcsStruct r0, Directive r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.directive;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final Directive component1() {
        return this.directive;
    }

    @aa1
    public final DcsStruct copy(@aa1 Directive r2) {
        Intrinsics.X0O(r2, "directive");
        return new DcsStruct(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof DcsStruct) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.directive, ((DcsStruct) r4).directive) == true) goto L11;
        return false;
    L11:
        return true;
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
        return "DcsStruct(directive=" + this.directive + I000IiI1O.iO.iO;
    }
}
