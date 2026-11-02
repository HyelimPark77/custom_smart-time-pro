package com.sma.smartv3.p610ui.device;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemVoiceChatSendBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatSendBinding> {
    public static final ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1 INSTANCE = new ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1();

    public ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1() {
        super(3, ItemVoiceChatSendBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;", 0);
    }

    public final ItemVoiceChatSendBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.X0O(p0, "p0");
        return ItemVoiceChatSendBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemVoiceChatSendBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
