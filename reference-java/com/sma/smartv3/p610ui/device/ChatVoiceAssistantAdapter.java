package com.sma.smartv3.p610ui.device;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iXXiX1O1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.sma.smartv3.databinding.ItemVoiceChatReceiveBinding;
import com.sma.smartv3.databinding.ItemVoiceChatSendBinding;
import com.sma.smartv3.dto.ChatShowType;
import com.sma.smartv3.p608db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.ImageViewRound;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatVoiceAssistantAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @aa1
    private final List<ChatVoiceAssistantMessage> dataList = new ArrayList();

    public final class ChatVoiceFromViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemVoiceChatSendBinding binding;
        final /* synthetic */ ChatVoiceAssistantAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatVoiceFromViewHolder(@aa1 ChatVoiceAssistantAdapter chatVoiceAssistantAdapter, ItemVoiceChatSendBinding binding) {
            super(binding.getRoot());
            Intrinsics.X0O(binding, "binding");
            this.this$0 = chatVoiceAssistantAdapter;
            this.binding = binding;
        }

        public final void bind(@aa1 ChatVoiceAssistantMessage chatMsg) {
            Intrinsics.X0O(chatMsg, "chatMsg");
            this.binding.tvSendContent.setText(chatMsg.getData());
            ImageViewRound imageViewRound = this.binding.ivSendPicture;
            imageViewRound.setImageDrawable(gk4.XOO0ii0(imageViewRound.getContext(), R.drawable.icon_voice_default_icon));
            sz0 sz0Var = sz0.OXO1;
            if (uz0.OIi0(sz0Var).exists()) {
                imageViewRound.setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
            }
        }
    }

    public final class ChatVoiceToViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemVoiceChatReceiveBinding binding;
        final /* synthetic */ ChatVoiceAssistantAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatVoiceToViewHolder(@aa1 ChatVoiceAssistantAdapter chatVoiceAssistantAdapter, ItemVoiceChatReceiveBinding binding) {
            super(binding.getRoot());
            Intrinsics.X0O(binding, "binding");
            this.this$0 = chatVoiceAssistantAdapter;
            this.binding = binding;
        }

        public final void bind(@aa1 ChatVoiceAssistantMessage chatMsg) {
            Intrinsics.X0O(chatMsg, "chatMsg");
            String strXXO = TextUtils.isEmpty(chatMsg.getData()) ? UtilsKt.XXO(R.string.waiting) : chatMsg.getData();
            TextView textView = this.binding.tvReceiveContent;
            textView.setText(strXXO);
            textView.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(textView.getContext(), R.color.voice_receive_bg_color)));
            this.binding.tvReceiveNick.setText(chatMsg.getAiMode().getModelName());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceAssistantAdapter$onCreateViewHolder$1 */
    public static final /* synthetic */ class C186841 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatReceiveBinding> {
        public static final C186841 INSTANCE = new C186841();

        public C186841() {
            super(3, ItemVoiceChatReceiveBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;", 0);
        }

        public final ItemVoiceChatReceiveBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.X0O(p0, "p0");
            return ItemVoiceChatReceiveBinding.inflate(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ItemVoiceChatReceiveBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceAssistantAdapter$onCreateViewHolder$2 */
    public static final /* synthetic */ class C186852 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatReceiveBinding> {
        public static final C186852 INSTANCE = new C186852();

        public C186852() {
            super(3, ItemVoiceChatReceiveBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;", 0);
        }

        public final ItemVoiceChatReceiveBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.X0O(p0, "p0");
            return ItemVoiceChatReceiveBinding.inflate(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ItemVoiceChatReceiveBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public final void add(@aa1 ChatVoiceAssistantMessage item) {
        Intrinsics.X0O(item, "item");
        this.dataList.add(item);
        notifyItemChanged(this.dataList.size());
    }

    public final void addOrUpdateStream(@aa1 ChatVoiceAssistantMessage item) {
        Intrinsics.X0O(item, "item");
        int iX11iII1O1 = CollectionsKt__CollectionsKt.X11iII1O1(this.dataList);
        if (this.dataList.isEmpty() || ((ChatVoiceAssistantMessage) CollectionsKt___CollectionsKt.Xi1XO00(this.dataList)).isEnded()) {
            this.dataList.add(item);
            notifyItemInserted(CollectionsKt__CollectionsKt.X11iII1O1(this.dataList));
        } else {
            this.dataList.set(iX11iII1O1, ChatVoiceAssistantMessage.copy$default(this.dataList.get(iX11iII1O1), 0, item.getData(), null, null, item.getEnded(), null, 45, null));
            notifyItemChanged(iX11iII1O1);
        }
    }

    @aa1
    public final List<ChatVoiceAssistantMessage> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.dataList.get(i).getShowType().getFlag();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 RecyclerView.ViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        int itemViewType = holder.getItemViewType();
        if (itemViewType == ChatShowType.FROM.getFlag()) {
            ((ChatVoiceFromViewHolder) holder).bind(this.dataList.get(i));
        } else if (itemViewType == ChatShowType.TO.getFlag()) {
            ((ChatVoiceToViewHolder) holder).bind(this.dataList.get(i));
        } else {
            ((ChatVoiceToViewHolder) holder).bind(this.dataList.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public RecyclerView.ViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        if (i == ChatShowType.FROM.getFlag()) {
            ViewBinding viewBindingOXO1 = iXXiX1O1.OXO1(this, parent, ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1.INSTANCE);
            Intrinsics.O10IXXX0X(viewBindingOXO1, "createViewHolder(...)");
            return new ChatVoiceFromViewHolder(this, (ItemVoiceChatSendBinding) viewBindingOXO1);
        }
        if (i == ChatShowType.TO.getFlag()) {
            ViewBinding viewBindingOXO2 = iXXiX1O1.OXO1(this, parent, C186841.INSTANCE);
            Intrinsics.O10IXXX0X(viewBindingOXO2, "createViewHolder(...)");
            return new ChatVoiceToViewHolder(this, (ItemVoiceChatReceiveBinding) viewBindingOXO2);
        }
        ViewBinding viewBindingOXO3 = iXXiX1O1.OXO1(this, parent, C186852.INSTANCE);
        Intrinsics.O10IXXX0X(viewBindingOXO3, "createViewHolder(...)");
        return new ChatVoiceToViewHolder(this, (ItemVoiceChatReceiveBinding) viewBindingOXO3);
    }

    public final void setData(@aa1 List<ChatVoiceAssistantMessage> list) {
        Intrinsics.X0O(list, "list");
        List<ChatVoiceAssistantMessage> list2 = this.dataList;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }
}
