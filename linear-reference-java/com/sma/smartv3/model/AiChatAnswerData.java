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
        String r1 = null;
        int r2 = 0;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ AiChatAnswerData copy$default(AiChatAnswerData r0, String r1, int r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.ended;
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

    public final int component2() {
        return this.ended;
    }

    @aa1
    public final String component3() {
        return this.model;
    }

    @aa1
    public final AiChatAnswerData copy(@aa1 String r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r4, "model");
        return new AiChatAnswerData(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AiChatAnswerData) == true) goto L8;
        return false;
    L8:
        AiChatAnswerData r6 = (AiChatAnswerData) r5;
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L12;
        return false;
    L12:
        if (this.ended == r6.ended) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.model, r6.model) == true) goto L17;
        return false;
    L17:
        return true;
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
        return "AiChatAnswerData(text=" + this.text + ", ended=" + this.ended + ", model=" + this.model + I000IiI1O.iO.iO;
    }

    public AiChatAnswerData(@aa1 String r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r4, "model");
        this.text = r2;
        this.ended = r3;
        this.model = r4;
    }

    public /* synthetic */ AiChatAnswerData(String r2, int r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 1;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
