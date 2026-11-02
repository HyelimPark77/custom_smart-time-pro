package com.sma.smartv3.biz.p605ai.completion.chat;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatCompletionResult extends JsonFieldContainer {

    @aa1
    private List<ChatCompletionChoice> choices;
    private long created;

    /* JADX INFO: renamed from: id */
    @aa1
    private String f50932id;

    @aa1
    private String model;

    @aa1
    private String object;

    public ChatCompletionResult() {
        this(null, null, 0L, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatCompletionResult copy$default(ChatCompletionResult chatCompletionResult, String str, String str2, long j, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatCompletionResult.f50932id;
        }
        if ((i & 2) != 0) {
            str2 = chatCompletionResult.object;
        }
        if ((i & 4) != 0) {
            j = chatCompletionResult.created;
        }
        if ((i & 8) != 0) {
            str3 = chatCompletionResult.model;
        }
        if ((i & 16) != 0) {
            list = chatCompletionResult.choices;
        }
        long j2 = j;
        return chatCompletionResult.copy(str, str2, j2, str3, list);
    }

    @aa1
    public final String component1() {
        return this.f50932id;
    }

    @aa1
    public final String component2() {
        return this.object;
    }

    public final long component3() {
        return this.created;
    }

    @aa1
    public final String component4() {
        return this.model;
    }

    @aa1
    public final List<ChatCompletionChoice> component5() {
        return this.choices;
    }

    @aa1
    public final ChatCompletionResult copy(@aa1 String id, @aa1 String object, long j, @aa1 String model, @aa1 List<ChatCompletionChoice> choices) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(object, "object");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(choices, "choices");
        return new ChatCompletionResult(id, object, j, model, choices);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatCompletionResult)) {
            return false;
        }
        ChatCompletionResult chatCompletionResult = (ChatCompletionResult) obj;
        return Intrinsics.XOO0ii0(this.f50932id, chatCompletionResult.f50932id) && Intrinsics.XOO0ii0(this.object, chatCompletionResult.object) && this.created == chatCompletionResult.created && Intrinsics.XOO0ii0(this.model, chatCompletionResult.model) && Intrinsics.XOO0ii0(this.choices, chatCompletionResult.choices);
    }

    @aa1
    public final List<ChatCompletionChoice> getChoices() {
        return this.choices;
    }

    public final long getCreated() {
        return this.created;
    }

    @aa1
    public final String getId() {
        return this.f50932id;
    }

    @aa1
    public final String getModel() {
        return this.model;
    }

    @aa1
    public final String getObject() {
        return this.object;
    }

    public int hashCode() {
        return (((((((this.f50932id.hashCode() * 31) + this.object.hashCode()) * 31) + Long.hashCode(this.created)) * 31) + this.model.hashCode()) * 31) + this.choices.hashCode();
    }

    public final void setChoices(@aa1 List<ChatCompletionChoice> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.choices = list;
    }

    public final void setCreated(long j) {
        this.created = j;
    }

    public final void setId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50932id = str;
    }

    public final void setModel(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.model = str;
    }

    public final void setObject(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.object = str;
    }

    @aa1
    public String toString() {
        return "ChatCompletionResult(id=" + this.f50932id + ", object=" + this.object + ", created=" + this.created + ", model=" + this.model + ", choices=" + this.choices + I000IiI1O.C2156iO.f1007iO;
    }

    public ChatCompletionResult(@aa1 String id, @aa1 String object, long j, @aa1 String model, @aa1 List<ChatCompletionChoice> choices) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(object, "object");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(choices, "choices");
        this.f50932id = id;
        this.object = object;
        this.created = j;
        this.model = model;
        this.choices = choices;
    }

    public /* synthetic */ ChatCompletionResult(String str, String str2, long j, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new ArrayList() : list);
    }
}
