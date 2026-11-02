package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIQuestion {
    private boolean enableSearch;

    @aa1
    private Object extra;

    @aa1
    private String model;
    private boolean stream;

    @aa1
    private String text;

    @aa1
    private AIFunctionType type;

    public AIQuestion(@aa1 AIFunctionType type, @aa1 String text, @aa1 Object extra, @aa1 String model, boolean z, boolean z2) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(extra, "extra");
        Intrinsics.X0O(model, "model");
        this.type = type;
        this.text = text;
        this.extra = extra;
        this.model = model;
        this.stream = z;
        this.enableSearch = z2;
    }

    public static /* synthetic */ AIQuestion copy$default(AIQuestion aIQuestion, AIFunctionType aIFunctionType, String str, Object obj, String str2, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 1) != 0) {
            aIFunctionType = aIQuestion.type;
        }
        if ((i & 2) != 0) {
            str = aIQuestion.text;
        }
        if ((i & 4) != 0) {
            obj = aIQuestion.extra;
        }
        if ((i & 8) != 0) {
            str2 = aIQuestion.model;
        }
        if ((i & 16) != 0) {
            z = aIQuestion.stream;
        }
        if ((i & 32) != 0) {
            z2 = aIQuestion.enableSearch;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return aIQuestion.copy(aIFunctionType, str, obj, str2, z3, z4);
    }

    @aa1
    public final AIFunctionType component1() {
        return this.type;
    }

    @aa1
    public final String component2() {
        return this.text;
    }

    @aa1
    public final Object component3() {
        return this.extra;
    }

    @aa1
    public final String component4() {
        return this.model;
    }

    public final boolean component5() {
        return this.stream;
    }

    public final boolean component6() {
        return this.enableSearch;
    }

    @aa1
    public final AIQuestion copy(@aa1 AIFunctionType type, @aa1 String text, @aa1 Object extra, @aa1 String model, boolean z, boolean z2) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(extra, "extra");
        Intrinsics.X0O(model, "model");
        return new AIQuestion(type, text, extra, model, z, z2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIQuestion)) {
            return false;
        }
        AIQuestion aIQuestion = (AIQuestion) obj;
        return this.type == aIQuestion.type && Intrinsics.XOO0ii0(this.text, aIQuestion.text) && Intrinsics.XOO0ii0(this.extra, aIQuestion.extra) && Intrinsics.XOO0ii0(this.model, aIQuestion.model) && this.stream == aIQuestion.stream && this.enableSearch == aIQuestion.enableSearch;
    }

    public final boolean getEnableSearch() {
        return this.enableSearch;
    }

    @aa1
    public final Object getExtra() {
        return this.extra;
    }

    @aa1
    public final String getModel() {
        return this.model;
    }

    public final boolean getStream() {
        return this.stream;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final AIFunctionType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.text.hashCode()) * 31) + this.extra.hashCode()) * 31) + this.model.hashCode()) * 31) + Boolean.hashCode(this.stream)) * 31) + Boolean.hashCode(this.enableSearch);
    }

    public final void setEnableSearch(boolean z) {
        this.enableSearch = z;
    }

    public final void setExtra(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.extra = obj;
    }

    public final void setModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.model = str;
    }

    public final void setStream(boolean z) {
        this.stream = z;
    }

    public final void setText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.text = str;
    }

    public final void setType(@aa1 AIFunctionType aIFunctionType) {
        Intrinsics.X0O(aIFunctionType, "<set-?>");
        this.type = aIFunctionType;
    }

    @aa1
    public String toString() {
        return "AIQuestion(type=" + this.type + ", text=" + this.text + ", extra=" + this.extra + ", model=" + this.model + ", stream=" + this.stream + ", enableSearch=" + this.enableSearch + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AIQuestion(AIFunctionType aIFunctionType, String str, Object obj, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aIFunctionType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new Object() : obj, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? a01.OXO1.XIi00iiXO().getBoolean(b01.I0OX, false) : z2);
    }
}
