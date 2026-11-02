package com.sma.smartv3.p608db.entity;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.dto.ChatAiMode;
import com.sma.smartv3.dto.ChatEndType;
import com.sma.smartv3.dto.ChatShowType;
import com.sma.smartv3.dto.FunctionType;
import com.sma.smartv3.dto.OXO1;
import com.sma.smartv3.p608db.converter.ChatAiModeConverter;
import com.sma.smartv3.p608db.converter.ChatShowTypeConverter;
import com.sma.smartv3.p608db.converter.FunctionTypeConverter;
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

    /* JADX INFO: renamed from: id */
    @PrimaryKey(autoGenerate = true)
    private final int f51197id;

    @aa1
    private ChatShowType showType;

    @aa1
    private final FunctionType type;

    public ChatVoiceAssistantMessage() {
        this(0, null, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ ChatVoiceAssistantMessage copy$default(ChatVoiceAssistantMessage chatVoiceAssistantMessage, int i, String str, FunctionType functionType, ChatAiMode chatAiMode, int i2, ChatShowType chatShowType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = chatVoiceAssistantMessage.f51197id;
        }
        if ((i3 & 2) != 0) {
            str = chatVoiceAssistantMessage.data;
        }
        if ((i3 & 4) != 0) {
            functionType = chatVoiceAssistantMessage.type;
        }
        if ((i3 & 8) != 0) {
            chatAiMode = chatVoiceAssistantMessage.aiMode;
        }
        if ((i3 & 16) != 0) {
            i2 = chatVoiceAssistantMessage.ended;
        }
        if ((i3 & 32) != 0) {
            chatShowType = chatVoiceAssistantMessage.showType;
        }
        int i4 = i2;
        ChatShowType chatShowType2 = chatShowType;
        return chatVoiceAssistantMessage.copy(i, str, functionType, chatAiMode, i4, chatShowType2);
    }

    public final int component1() {
        return this.f51197id;
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
    public final ChatVoiceAssistantMessage copy(int i, @aa1 String data, @aa1 FunctionType type, @aa1 ChatAiMode aiMode, int i2, @aa1 ChatShowType showType) {
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(aiMode, "aiMode");
        Intrinsics.X0O(showType, "showType");
        return new ChatVoiceAssistantMessage(i, data, type, aiMode, i2, showType);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatVoiceAssistantMessage)) {
            return false;
        }
        ChatVoiceAssistantMessage chatVoiceAssistantMessage = (ChatVoiceAssistantMessage) obj;
        return this.f51197id == chatVoiceAssistantMessage.f51197id && Intrinsics.XOO0ii0(this.data, chatVoiceAssistantMessage.data) && this.type == chatVoiceAssistantMessage.type && this.aiMode == chatVoiceAssistantMessage.aiMode && this.ended == chatVoiceAssistantMessage.ended && this.showType == chatVoiceAssistantMessage.showType;
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
        return this.f51197id;
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
        return (((((((((Integer.hashCode(this.f51197id) * 31) + this.data.hashCode()) * 31) + this.type.hashCode()) * 31) + this.aiMode.hashCode()) * 31) + Integer.hashCode(this.ended)) * 31) + this.showType.hashCode();
    }

    public final boolean isEnded() {
        return this.ended == 1;
    }

    public final void setData(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.data = str;
    }

    public final void setEnded(int i) {
        this.ended = i;
    }

    public final void setShowType(@aa1 ChatShowType chatShowType) {
        Intrinsics.X0O(chatShowType, "<set-?>");
        this.showType = chatShowType;
    }

    @aa1
    public String toString() {
        return "ChatVoiceAssistantMessage(id=" + this.f51197id + ", data=" + this.data + ", type=" + this.type + ", aiMode=" + this.aiMode + ", ended=" + this.ended + ", showType=" + this.showType + I000IiI1O.C2156iO.f1007iO;
    }

    public ChatVoiceAssistantMessage(int i, @aa1 String data, @aa1 FunctionType type, @aa1 ChatAiMode aiMode, int i2, @aa1 ChatShowType showType) {
        Intrinsics.X0O(data, "data");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(aiMode, "aiMode");
        Intrinsics.X0O(showType, "showType");
        this.f51197id = i;
        this.data = data;
        this.type = type;
        this.aiMode = aiMode;
        this.ended = i2;
        this.showType = showType;
    }

    public /* synthetic */ ChatVoiceAssistantMessage(int i, String str, FunctionType functionType, ChatAiMode chatAiMode, int i2, ChatShowType chatShowType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? FunctionType.THIRD_PARTY_AI_ASSISTANT : functionType, (i3 & 8) != 0 ? OXO1.I0iXXO.m38210iO() : chatAiMode, (i3 & 16) != 0 ? ChatEndType.Sending.getFlag() : i2, (i3 & 32) != 0 ? ChatShowType.FROM : chatShowType);
    }
}
