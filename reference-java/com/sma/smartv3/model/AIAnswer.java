package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIAnswer {
    private int ended;

    @aa1
    private Object extra;

    @aa1
    private String model;

    @aa1
    private String text;

    @aa1
    private AIFunctionType type;

    public AIAnswer(@aa1 AIFunctionType type, @aa1 String text, int i, @aa1 String model, @aa1 Object extra) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(extra, "extra");
        this.type = type;
        this.text = text;
        this.ended = i;
        this.model = model;
        this.extra = extra;
    }

    public static /* synthetic */ AIAnswer copy$default(AIAnswer aIAnswer, AIFunctionType aIFunctionType, String str, int i, String str2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            aIFunctionType = aIAnswer.type;
        }
        if ((i2 & 2) != 0) {
            str = aIAnswer.text;
        }
        if ((i2 & 4) != 0) {
            i = aIAnswer.ended;
        }
        if ((i2 & 8) != 0) {
            str2 = aIAnswer.model;
        }
        if ((i2 & 16) != 0) {
            obj = aIAnswer.extra;
        }
        Object obj3 = obj;
        int i3 = i;
        return aIAnswer.copy(aIFunctionType, str, i3, str2, obj3);
    }

    @aa1
    public final AIFunctionType component1() {
        return this.type;
    }

    @aa1
    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.ended;
    }

    @aa1
    public final String component4() {
        return this.model;
    }

    @aa1
    public final Object component5() {
        return this.extra;
    }

    @aa1
    public final AIAnswer copy(@aa1 AIFunctionType type, @aa1 String text, int i, @aa1 String model, @aa1 Object extra) {
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(extra, "extra");
        return new AIAnswer(type, text, i, model, extra);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIAnswer)) {
            return false;
        }
        AIAnswer aIAnswer = (AIAnswer) obj;
        return this.type == aIAnswer.type && Intrinsics.XOO0ii0(this.text, aIAnswer.text) && this.ended == aIAnswer.ended && Intrinsics.XOO0ii0(this.model, aIAnswer.model) && Intrinsics.XOO0ii0(this.extra, aIAnswer.extra);
    }

    public final int getEnded() {
        return this.ended;
    }

    @aa1
    public final Object getExtra() {
        return this.extra;
    }

    @aa1
    public final String getModel() {
        return this.model;
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
        return (((((((this.type.hashCode() * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.ended)) * 31) + this.model.hashCode()) * 31) + this.extra.hashCode();
    }

    public final void setEnded(int i) {
        this.ended = i;
    }

    public final void setExtra(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.extra = obj;
    }

    public final void setModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.model = str;
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
        return "AIAnswer(type=" + this.type + ", text=" + this.text + ", ended=" + this.ended + ", model=" + this.model + ", extra=" + this.extra + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AIAnswer(AIFunctionType aIFunctionType, String str, int i, String str2, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aIFunctionType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? new Object() : obj);
    }
}
