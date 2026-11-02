package com.sma.smartv3.biz.p605ai.completion.chat;

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
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatMessage.role;
        }
        if ((i & 2) != 0) {
            str2 = chatMessage.content;
        }
        if ((i & 4) != 0) {
            str3 = chatMessage.name;
        }
        return chatMessage.copy(str, str2, str3);
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
    public final ChatMessage copy(@aa1 String role, @aa1 String content, @aa1 String name) {
        Intrinsics.X0O(role, "role");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(name, "name");
        return new ChatMessage(role, content, name);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return Intrinsics.XOO0ii0(this.role, chatMessage.role) && Intrinsics.XOO0ii0(this.content, chatMessage.content) && Intrinsics.XOO0ii0(this.name, chatMessage.name);
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

    public final void setContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.content = str;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setRole(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.role = str;
    }

    @aa1
    public String toString() {
        return "ChatMessage(role=" + this.role + ", content=" + this.content + ", name=" + this.name + I000IiI1O.C2156iO.f1007iO;
    }

    public ChatMessage(@aa1 String role, @aa1 String content, @aa1 String name) {
        Intrinsics.X0O(role, "role");
        Intrinsics.X0O(content, "content");
        Intrinsics.X0O(name, "name");
        this.role = role;
        this.content = content;
        this.name = name;
    }

    public /* synthetic */ ChatMessage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
