package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.AICreateJobV2;
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

    public AIAnswer(@aa1 AIFunctionType r2, @aa1 String r3, int r4, @aa1 String r5, @aa1 Object r6) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r5, "model");
        Intrinsics.X0O(r6, AICreateJobV2.AI_EXTRA);
        this.type = r2;
        this.text = r3;
        this.ended = r4;
        this.model = r5;
        this.extra = r6;
    }

    public static /* synthetic */ AIAnswer copy$default(AIAnswer r0, AIFunctionType r1, String r2, int r3, String r4, Object r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.text;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.ended;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.model;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.extra;
    L17:
        String r8 = r4;
        Object r9 = r5;
        int r10 = r3;
        AIFunctionType r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
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
    public final AIAnswer copy(@aa1 AIFunctionType r8, @aa1 String r9, int r10, @aa1 String r11, @aa1 Object r12) {
        Intrinsics.X0O(r8, "type");
        Intrinsics.X0O(r9, "text");
        Intrinsics.X0O(r11, "model");
        Intrinsics.X0O(r12, AICreateJobV2.AI_EXTRA);
        return new AIAnswer(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AIAnswer) == true) goto L8;
        return false;
    L8:
        AIAnswer r6 = (AIAnswer) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L15;
        return false;
    L15:
        if (this.ended == r6.ended) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.model, r6.model) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.extra, r6.extra) == true) goto L23;
        return false;
    L23:
        return true;
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

    public final void setEnded(int r1) {
        this.ended = r1;
    }

    public final void setExtra(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extra = r2;
    }

    public final void setModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.model = r2;
    }

    public final void setText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.text = r2;
    }

    public final void setType(@aa1 AIFunctionType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    @aa1
    public String toString() {
        return "AIAnswer(type=" + this.type + ", text=" + this.text + ", ended=" + this.ended + ", model=" + this.model + ", extra=" + this.extra + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AIAnswer(AIFunctionType r2, String r3, int r4, String r5, Object r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = "";
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = 1;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = "";
    L12:
        if ((r7 & 16) == 0) goto L14;
        r6 = new Object();
    L14:
        Object r9 = r6;
        String r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
    }
}
