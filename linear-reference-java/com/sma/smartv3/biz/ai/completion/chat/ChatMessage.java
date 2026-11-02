package com.sma.smartv3.biz.ai.completion.chat;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatMessage extends JsonFieldContainer {

    @aa1
    private String content;

    @aa1
    private String name;

    @aa1
    private String role;

    public ChatMessage() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.role;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.content;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.name;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.role;
    }

    @aa1
    public final String component2() {
        return this.content;
    }

    @aa1
    public final String component3() {
        return this.name;
    }

    @aa1
    public final ChatMessage copy(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "role");
        Intrinsics.X0O(r3, "content");
        Intrinsics.X0O(r4, "name");
        return new ChatMessage(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChatMessage) == true) goto L8;
        return false;
    L8:
        ChatMessage r6 = (ChatMessage) r5;
        if (Intrinsics.XOO0ii0(this.role, r6.role) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.content, r6.content) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getContent() {
        return this.content;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return (((this.role.hashCode() * 31) + this.content.hashCode()) * 31) + this.name.hashCode();
    }

    public final void setContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.content = r2;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setRole(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.role = r2;
    }

    @aa1
    public String toString() {
        return "ChatMessage(role=" + this.role + ", content=" + this.content + ", name=" + this.name + I000IiI1O.iO.iO;
    }

    public ChatMessage(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "role");
        Intrinsics.X0O(r3, "content");
        Intrinsics.X0O(r4, "name");
        this.role = r2;
        this.content = r3;
        this.name = r4;
    }

    public /* synthetic */ ChatMessage(String r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
