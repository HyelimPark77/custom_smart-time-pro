package com.sma.smartv3.biz.p605ai.completion.chat;

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
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ChatCompletionChoice copy$default(ChatCompletionChoice chatCompletionChoice, int i, ChatMessage chatMessage, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatCompletionChoice.index;
        }
        if ((i2 & 2) != 0) {
            chatMessage = chatCompletionChoice.delta;
        }
        if ((i2 & 4) != 0) {
            str = chatCompletionChoice.finishReason;
        }
        return chatCompletionChoice.copy(i, chatMessage, str);
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
    public final ChatCompletionChoice copy(int i, @aa1 ChatMessage delta, @aa1 String finishReason) {
        Intrinsics.X0O(delta, "delta");
        Intrinsics.X0O(finishReason, "finishReason");
        return new ChatCompletionChoice(i, delta, finishReason);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatCompletionChoice)) {
            return false;
        }
        ChatCompletionChoice chatCompletionChoice = (ChatCompletionChoice) obj;
        return this.index == chatCompletionChoice.index && Intrinsics.XOO0ii0(this.delta, chatCompletionChoice.delta) && Intrinsics.XOO0ii0(this.finishReason, chatCompletionChoice.finishReason);
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

    public final void setDelta(@aa1 ChatMessage chatMessage) {
        Intrinsics.X0O(chatMessage, "<set-?>");
        this.delta = chatMessage;
    }

    public final void setFinishReason(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.finishReason = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @aa1
    public String toString() {
        return "ChatCompletionChoice(index=" + this.index + ", delta=" + this.delta + ", finishReason=" + this.finishReason + I000IiI1O.C2156iO.f1007iO;
    }

    public ChatCompletionChoice(int i, @aa1 ChatMessage delta, @aa1 String finishReason) {
        Intrinsics.X0O(delta, "delta");
        Intrinsics.X0O(finishReason, "finishReason");
        this.index = i;
        this.delta = delta;
        this.finishReason = finishReason;
    }

    public /* synthetic */ ChatCompletionChoice(int i, ChatMessage chatMessage, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ChatMessage(null, null, null, 7, null) : chatMessage, (i2 & 4) != 0 ? "" : str);
    }
}
