package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.AICreateJobV2;
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

    public AIQuestion(@aa1 AIFunctionType r2, @aa1 String r3, @aa1 Object r4, @aa1 String r5, boolean r6, boolean r7) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r4, AICreateJobV2.AI_EXTRA);
        Intrinsics.X0O(r5, "model");
        this.type = r2;
        this.text = r3;
        this.extra = r4;
        this.model = r5;
        this.stream = r6;
        this.enableSearch = r7;
    }

    public static /* synthetic */ AIQuestion copy$default(AIQuestion r0, AIFunctionType r1, String r2, Object r3, String r4, boolean r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.text;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.extra;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.model;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.stream;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.enableSearch;
    L20:
        boolean r9 = r5;
        boolean r10 = r6;
        Object r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final AIQuestion copy(@aa1 AIFunctionType r9, @aa1 String r10, @aa1 Object r11, @aa1 String r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r9, "type");
        Intrinsics.X0O(r10, "text");
        Intrinsics.X0O(r11, AICreateJobV2.AI_EXTRA);
        Intrinsics.X0O(r12, "model");
        return new AIQuestion(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AIQuestion) == true) goto L8;
        return false;
    L8:
        AIQuestion r6 = (AIQuestion) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.extra, r6.extra) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.model, r6.model) == true) goto L21;
        return false;
    L21:
        if (this.stream == r6.stream) goto L24;
        return false;
    L24:
        if (this.enableSearch == r6.enableSearch) goto L26;
        return false;
    L26:
        return true;
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

    public final void setEnableSearch(boolean r1) {
        this.enableSearch = r1;
    }

    public final void setExtra(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.extra = r2;
    }

    public final void setModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.model = r2;
    }

    public final void setStream(boolean r1) {
        this.stream = r1;
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
        return "AIQuestion(type=" + this.type + ", text=" + this.text + ", extra=" + this.extra + ", model=" + this.model + ", stream=" + this.stream + ", enableSearch=" + this.enableSearch + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AIQuestion(AIFunctionType r2, String r3, Object r4, String r5, boolean r6, boolean r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = "";
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = new Object();
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = "";
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = false;
    L15:
        if ((r8 & 32) == 0) goto L17;
        r7 = a01.OXO1.XIi00iiXO().getBoolean(b01.I0OX, false);
    L17:
        boolean r10 = r7;
        boolean r11 = r6;
        String r12 = r5;
        this(r2, r3, r4, r12, r11, r10);
    }
}
