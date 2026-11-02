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
        String r1 = null;
        boolean r2 = false;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ AiChatQuestionData copy$default(AiChatQuestionData r0, String r1, boolean r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.stream;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.model;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final AiChatQuestionData copy(@aa1 String r2, boolean r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r4, "model");
        return new AiChatQuestionData(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AiChatQuestionData) == true) goto L8;
        return false;
    L8:
        AiChatQuestionData r6 = (AiChatQuestionData) r5;
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L12;
        return false;
    L12:
        if (this.stream == r6.stream) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.model, r6.model) == true) goto L17;
        return false;
    L17:
        return true;
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
        return "AiChatQuestionData(text=" + this.text + ", stream=" + this.stream + ", model=" + this.model + I000IiI1O.iO.iO;
    }

    public AiChatQuestionData(@aa1 String r2, boolean r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r4, "model");
        this.text = r2;
        this.stream = r3;
        this.model = r4;
    }

    public /* synthetic */ AiChatQuestionData(String r1, boolean r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = true;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = OXO1.I0iXXO.XO0O10();
    L11:
        this(r1, r2, r3);
    }
}
