package com.sma.smartv3.ui.device;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemVoiceChatSendBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatSendBinding> {
    public static final ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1 INSTANCE = null;

    static {
        INSTANCE = new ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1();
    }

    public ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1() {
        super(3, ItemVoiceChatSendBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;", 0);
    }

    public final ItemVoiceChatSendBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
        Intrinsics.X0O(r2, "p0");
        return ItemVoiceChatSendBinding.inflate(r2, r3, r4);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemVoiceChatSendBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
        return invoke(r1, r2, r3.booleanValue());
    }
}
