package com.sma.smartv3.biz.ai.completion.chat;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatCompletionChoice extends JsonFieldContainer {

    @aa1
    private ChatMessage delta;

    @aa1
    private String finishReason;
    private int index;

    public ChatCompletionChoice() {
        int r1 = 0;
        ChatMessage r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ChatCompletionChoice copy$default(ChatCompletionChoice r0, int r1, ChatMessage r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.index;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.delta;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.finishReason;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.index;
    }

    @aa1
    public final ChatMessage component2() {
        return this.delta;
    }

    @aa1
    public final String component3() {
        return this.finishReason;
    }

    @aa1
    public final ChatCompletionChoice copy(int r2, @aa1 ChatMessage r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "delta");
        Intrinsics.X0O(r4, "finishReason");
        return new ChatCompletionChoice(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChatCompletionChoice) == true) goto L8;
        return false;
    L8:
        ChatCompletionChoice r6 = (ChatCompletionChoice) r5;
        if (this.index == r6.index) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.delta, r6.delta) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.finishReason, r6.finishReason) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final ChatMessage getDelta() {
        return this.delta;
    }

    @aa1
    public final String getFinishReason() {
        return this.finishReason;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.index) * 31) + this.delta.hashCode()) * 31) + this.finishReason.hashCode();
    }

    public final void setDelta(@aa1 ChatMessage r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.delta = r2;
    }

    public final void setFinishReason(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.finishReason = r2;
    }

    public final void setIndex(int r1) {
        this.index = r1;
    }

    @aa1
    public String toString() {
        return "ChatCompletionChoice(index=" + this.index + ", delta=" + this.delta + ", finishReason=" + this.finishReason + I000IiI1O.iO.iO;
    }

    public ChatCompletionChoice(int r2, @aa1 ChatMessage r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "delta");
        Intrinsics.X0O(r4, "finishReason");
        this.index = r2;
        this.delta = r3;
        this.finishReason = r4;
    }

    public /* synthetic */ ChatCompletionChoice(int r7, ChatMessage r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r7 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r8 = new ChatMessage(null, null, null, 7, null);
    L9:
        if ((r10 & 4) == 0) goto L11;
        r9 = "";
    L11:
        this(r7, r8, r9);
    }
}
