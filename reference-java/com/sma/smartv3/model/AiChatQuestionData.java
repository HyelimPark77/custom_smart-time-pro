package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.dto.OXO1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AiChatQuestionData {

    @aa1
    private final String model;
    private final boolean stream;

    @aa1
    private final String text;

    public AiChatQuestionData() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ AiChatQuestionData copy$default(AiChatQuestionData aiChatQuestionData, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiChatQuestionData.text;
        }
        if ((i & 2) != 0) {
            z = aiChatQuestionData.stream;
        }
        if ((i & 4) != 0) {
            str2 = aiChatQuestionData.model;
        }
        return aiChatQuestionData.copy(str, z, str2);
    }

    @aa1
    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.stream;
    }

    @aa1
    public final String component3() {
        return this.model;
    }

    @aa1
    public final AiChatQuestionData copy(@aa1 String text, boolean z, @aa1 String model) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        return new AiChatQuestionData(text, z, model);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiChatQuestionData)) {
            return false;
        }
        AiChatQuestionData aiChatQuestionData = (AiChatQuestionData) obj;
        return Intrinsics.XOO0ii0(this.text, aiChatQuestionData.text) && this.stream == aiChatQuestionData.stream && Intrinsics.XOO0ii0(this.model, aiChatQuestionData.model);
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

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Boolean.hashCode(this.stream)) * 31) + this.model.hashCode();
    }

    @aa1
    public String toString() {
        return "AiChatQuestionData(text=" + this.text + ", stream=" + this.stream + ", model=" + this.model + I000IiI1O.C2156iO.f1007iO;
    }

    public AiChatQuestionData(@aa1 String text, boolean z, @aa1 String model) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        this.text = text;
        this.stream = z;
        this.model = model;
    }

    public /* synthetic */ AiChatQuestionData(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? OXO1.I0iXXO.XO0O10() : str2);
    }
}
