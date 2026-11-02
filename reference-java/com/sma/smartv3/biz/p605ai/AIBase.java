package com.sma.smartv3.biz.p605ai;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIBase extends JsonFieldContainer {

    @aa1
    private AIError error;

    public AIBase(@aa1 AIError error) {
        Intrinsics.X0O(error, "error");
        this.error = error;
    }

    public static /* synthetic */ AIBase copy$default(AIBase aIBase, AIError aIError, int i, Object obj) {
        if ((i & 1) != 0) {
            aIError = aIBase.error;
        }
        return aIBase.copy(aIError);
    }

    @aa1
    public final AIError component1() {
        return this.error;
    }

    @aa1
    public final AIBase copy(@aa1 AIError error) {
        Intrinsics.X0O(error, "error");
        return new AIBase(error);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIBase) && Intrinsics.XOO0ii0(this.error, ((AIBase) obj).error);
    }

    @aa1
    public final AIError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public final void setError(@aa1 AIError aIError) {
        Intrinsics.X0O(aIError, "<set-?>");
        this.error = aIError;
    }

    @aa1
    public String toString() {
        return "AIBase(error=" + this.error + I000IiI1O.C2156iO.f1007iO;
    }
}
