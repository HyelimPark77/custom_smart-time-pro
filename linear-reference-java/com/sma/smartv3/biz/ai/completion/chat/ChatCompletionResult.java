package com.sma.smartv3.biz.ai.completion.chat;

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

    @aa1
    private String id;

    @aa1
    private String model;

    @aa1
    private String object;

    public ChatCompletionResult() {
        String r1 = null;
        String r2 = null;
        long r3 = 0;
        String r5 = null;
        List r6 = null;
        this(r1, r2, r3, r5, r6, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatCompletionResult copy$default(ChatCompletionResult r0, String r1, String r2, long r3, String r5, List r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.object;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.created;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = r0.model;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = r0.choices;
    L17:
        long r9 = r3;
        String r4 = r1;
        String r10 = r2;
        return r0.copy(r4, r10, r9, r5, r6);
    }

    @aa1
    public final String component1() {
        return this.id;
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
    public final ChatCompletionResult copy(@aa1 String r9, @aa1 String r10, long r11, @aa1 String r13, @aa1 List<ChatCompletionChoice> r14) {
        Intrinsics.X0O(r9, "id");
        Intrinsics.X0O(r10, "object");
        Intrinsics.X0O(r13, "model");
        Intrinsics.X0O(r14, "choices");
        return new ChatCompletionResult(r9, r10, r11, r13, r14);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ChatCompletionResult) == true) goto L8;
        return false;
    L8:
        ChatCompletionResult r9 = (ChatCompletionResult) r8;
        if (Intrinsics.XOO0ii0(this.id, r9.id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.object, r9.object) == true) goto L15;
        return false;
    L15:
        if (this.created == r9.created) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.model, r9.model) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.choices, r9.choices) == true) goto L23;
        return false;
    L23:
        return true;
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
        return this.id;
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
        return (((((((this.id.hashCode() * 31) + this.object.hashCode()) * 31) + Long.hashCode(this.created)) * 31) + this.model.hashCode()) * 31) + this.choices.hashCode();
    }

    public final void setChoices(@aa1 List<ChatCompletionChoice> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.choices = r2;
    }

    public final void setCreated(long r1) {
        this.created = r1;
    }

    public final void setId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.id = r2;
    }

    public final void setModel(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.model = r2;
    }

    public final void setObject(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.object = r2;
    }

    @aa1
    public String toString() {
        return "ChatCompletionResult(id=" + this.id + ", object=" + this.object + ", created=" + this.created + ", model=" + this.model + ", choices=" + this.choices + I000IiI1O.iO.iO;
    }

    public ChatCompletionResult(@aa1 String r2, @aa1 String r3, long r4, @aa1 String r6, @aa1 List<ChatCompletionChoice> r7) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r3, "object");
        Intrinsics.X0O(r6, "model");
        Intrinsics.X0O(r7, "choices");
        this.id = r2;
        this.object = r3;
        this.created = r4;
        this.model = r6;
        this.choices = r7;
    }

    public /* synthetic */ ChatCompletionResult(String r2, String r3, long r4, String r6, List r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r8 & 16) == 0) goto L17;
        r7 = new ArrayList();
    L17:
        List r10 = r7;
        long r5 = r4;
        String r11 = r3;
        String r12 = r2;
        this(r12, r11, r5, r6, r10);
    }
}
