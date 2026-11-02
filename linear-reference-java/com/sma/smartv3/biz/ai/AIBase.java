package com.sma.smartv3.biz.ai;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIBase extends JsonFieldContainer {

    @aa1
    private AIError error;

    public AIBase(@aa1 AIError r2) {
        Intrinsics.X0O(r2, "error");
        this.error = r2;
    }

    public static /* synthetic */ AIBase copy$default(AIBase r0, AIError r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.error;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final AIError component1() {
        return this.error;
    }

    @aa1
    public final AIBase copy(@aa1 AIError r2) {
        Intrinsics.X0O(r2, "error");
        return new AIBase(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AIBase) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.error, ((AIBase) r4).error) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final AIError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public final void setError(@aa1 AIError r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.error = r2;
    }

    @aa1
    public String toString() {
        return "AIBase(error=" + this.error + I000IiI1O.iO.iO;
    }
}
