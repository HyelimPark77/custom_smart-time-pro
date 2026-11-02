package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AiChatAnswerData {
    private final int ended;

    @aa1
    private final String model;

    @aa1
    private final String text;

    public AiChatAnswerData() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ AiChatAnswerData copy$default(AiChatAnswerData aiChatAnswerData, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aiChatAnswerData.text;
        }
        if ((i2 & 2) != 0) {
            i = aiChatAnswerData.ended;
        }
        if ((i2 & 4) != 0) {
            str2 = aiChatAnswerData.model;
        }
        return aiChatAnswerData.copy(str, i, str2);
    }

    @aa1
    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.ended;
    }

    @aa1
    public final String component3() {
        return this.model;
    }

    @aa1
    public final AiChatAnswerData copy(@aa1 String text, int i, @aa1 String model) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        return new AiChatAnswerData(text, i, model);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiChatAnswerData)) {
            return false;
        }
        AiChatAnswerData aiChatAnswerData = (AiChatAnswerData) obj;
        return Intrinsics.XOO0ii0(this.text, aiChatAnswerData.text) && this.ended == aiChatAnswerData.ended && Intrinsics.XOO0ii0(this.model, aiChatAnswerData.model);
    }

    public final int getEnded() {
        return this.ended;
    }

    @aa1
    public final String getModel() {
        return this.model;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Integer.hashCode(this.ended)) * 31) + this.model.hashCode();
    }

    @aa1
    public String toString() {
        return "AiChatAnswerData(text=" + this.text + ", ended=" + this.ended + ", model=" + this.model + I000IiI1O.C2156iO.f1007iO;
    }

    public AiChatAnswerData(@aa1 String text, int i, @aa1 String model) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        this.text = text;
        this.ended = i;
        this.model = model;
    }

    public /* synthetic */ AiChatAnswerData(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
