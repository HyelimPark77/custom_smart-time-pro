package com.sma.smartv3.db.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.converter.ChatAiModeConverter;
import com.sma.smartv3.db.converter.ChatShowTypeConverter;
import com.sma.smartv3.db.converter.FunctionTypeConverter;
import com.sma.smartv3.dto.ChatAiMode;
import com.sma.smartv3.dto.ChatEndType;
import com.sma.smartv3.dto.ChatShowType;
import com.sma.smartv3.dto.FunctionType;
import com.sma.smartv3.dto.OXO1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({FunctionTypeConverter.class, ChatShowTypeConverter.class, ChatAiModeConverter.class})
@Entity(indices = {@Index({"type"})})
public final class ChatVoiceAssistantMessage {

    @aa1
    private final ChatAiMode aiMode;

    @aa1
    private String data;
    private int ended;

    @PrimaryKey(autoGenerate = true)
    private final int id;

    @aa1
    private ChatShowType showType;

    @aa1
    private final FunctionType type;

    public ChatVoiceAssistantMessage() {
        int r1 = 0;
        String r2 = null;
        FunctionType r3 = null;
        ChatAiMode r4 = null;
        int r5 = 0;
        ChatShowType r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ ChatVoiceAssistantMessage copy$default(ChatVoiceAssistantMessage r0, int r1, String r2, FunctionType r3, ChatAiMode r4, int r5, ChatShowType r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.data;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.aiMode;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.ended;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.showType;
    L20:
        int r9 = r5;
        ChatShowType r10 = r6;
        FunctionType r11 = r3;
        ChatAiMode r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.data;
    }

    @aa1
    public final FunctionType component3() {
        return this.type;
    }

    @aa1
    public final ChatAiMode component4() {
        return this.aiMode;
    }

    public final int component5() {
        return this.ended;
    }

    @aa1
    public final ChatShowType component6() {
        return this.showType;
    }

    @aa1
    public final ChatVoiceAssistantMessage copy(int r9, @aa1 String r10, @aa1 FunctionType r11, @aa1 ChatAiMode r12, int r13, @aa1 ChatShowType r14) {
        Intrinsics.X0O(r10, "data");
        Intrinsics.X0O(r11, "type");
        Intrinsics.X0O(r12, "aiMode");
        Intrinsics.X0O(r14, "showType");
        return new ChatVoiceAssistantMessage(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChatVoiceAssistantMessage) == true) goto L8;
        return false;
    L8:
        ChatVoiceAssistantMessage r6 = (ChatVoiceAssistantMessage) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.data, r6.data) == true) goto L15;
        return false;
    L15:
        if (this.type == r6.type) goto L18;
        return false;
    L18:
        if (this.aiMode == r6.aiMode) goto L21;
        return false;
    L21:
        if (this.ended == r6.ended) goto L24;
        return false;
    L24:
        if (this.showType == r6.showType) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final ChatAiMode getAiMode() {
        return this.aiMode;
    }

    @aa1
    public final String getData() {
        return this.data;
    }

    public final int getEnded() {
        return this.ended;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final ChatShowType getShowType() {
        return this.showType;
    }

    @aa1
    public final FunctionType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.data.hashCode()) * 31) + this.type.hashCode()) * 31) + this.aiMode.hashCode()) * 31) + Integer.hashCode(this.ended)) * 31) + this.showType.hashCode();
    }

    public final boolean isEnded() {
        if (this.ended != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setData(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.data = r2;
    }

    public final void setEnded(int r1) {
        this.ended = r1;
    }

    public final void setShowType(@aa1 ChatShowType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.showType = r2;
    }

    @aa1
    public String toString() {
        return "ChatVoiceAssistantMessage(id=" + this.id + ", data=" + this.data + ", type=" + this.type + ", aiMode=" + this.aiMode + ", ended=" + this.ended + ", showType=" + this.showType + I000IiI1O.iO.iO;
    }

    public ChatVoiceAssistantMessage(int r2, @aa1 String r3, @aa1 FunctionType r4, @aa1 ChatAiMode r5, int r6, @aa1 ChatShowType r7) {
        Intrinsics.X0O(r3, "data");
        Intrinsics.X0O(r4, "type");
        Intrinsics.X0O(r5, "aiMode");
        Intrinsics.X0O(r7, "showType");
        this.id = r2;
        this.data = r3;
        this.type = r4;
        this.aiMode = r5;
        this.ended = r6;
        this.showType = r7;
    }

    public /* synthetic */ ChatVoiceAssistantMessage(int r1, String r2, FunctionType r3, ChatAiMode r4, int r5, ChatShowType r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = FunctionType.THIRD_PARTY_AI_ASSISTANT;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = OXO1.I0iXXO.iO();
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = ChatEndType.Sending.getFlag();
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = ChatShowType.FROM;
    L20:
        int r9 = r5;
        ChatShowType r10 = r6;
        FunctionType r11 = r3;
        ChatAiMode r12 = r4;
        this(r1, r2, r11, r12, r9, r10);
    }
}
