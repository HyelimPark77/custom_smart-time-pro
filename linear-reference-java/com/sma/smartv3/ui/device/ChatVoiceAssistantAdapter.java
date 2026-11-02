package com.sma.smartv3.ui.device;

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
import com.baidu.platform.comapi.map.MapController;
import com.sma.smartv3.databinding.ItemVoiceChatReceiveBinding;
import com.sma.smartv3.databinding.ItemVoiceChatSendBinding;
import com.sma.smartv3.db.entity.ChatVoiceAssistantMessage;
import com.sma.smartv3.dto.ChatShowType;
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
    private final List<ChatVoiceAssistantMessage> dataList;

    public final class ChatVoiceFromViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemVoiceChatSendBinding binding;
        final /* synthetic */ ChatVoiceAssistantAdapter this$0;

        public ChatVoiceFromViewHolder(@aa1 ChatVoiceAssistantAdapter r2, ItemVoiceChatSendBinding r3) {
            Intrinsics.X0O(r3, "binding");
            this.this$0 = r2;
            super(r3.getRoot());
            this.binding = r3;
        }

        public final void bind(@aa1 ChatVoiceAssistantMessage r3) {
            Intrinsics.X0O(r3, "chatMsg");
            this.binding.tvSendContent.setText(r3.getData());
            ImageViewRound r4 = this.binding.ivSendPicture;
            r4.setImageDrawable(gk4.XOO0ii0(r4.getContext(), R.drawable.icon_voice_default_icon));
            sz0 r0 = sz0.OXO1;
            if (uz0.OIi0(r0).exists() == false) goto L6;
            r4.setImageURI(Uri.fromFile(uz0.OIi0(r0)));
            return;
        }
    }

    public final class ChatVoiceToViewHolder extends RecyclerView.ViewHolder {

        @aa1
        private final ItemVoiceChatReceiveBinding binding;
        final /* synthetic */ ChatVoiceAssistantAdapter this$0;

        public ChatVoiceToViewHolder(@aa1 ChatVoiceAssistantAdapter r2, ItemVoiceChatReceiveBinding r3) {
            Intrinsics.X0O(r3, "binding");
            this.this$0 = r2;
            super(r3.getRoot());
            this.binding = r3;
        }

        public final void bind(@aa1 ChatVoiceAssistantMessage r4) {
            Intrinsics.X0O(r4, "chatMsg");
            if (TextUtils.isEmpty(r4.getData()) == false) goto L5;
            String r0 = UtilsKt.XXO(R.string.waiting);
        L6:
            TextView r1 = this.binding.tvReceiveContent;
            r1.setText(r0);
            r1.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(r1.getContext(), R.color.voice_receive_bg_color)));
            this.binding.tvReceiveNick.setText(r4.getAiMode().getModelName());
            return;
        L5:
            r0 = r4.getData();
            goto L6
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceAssistantAdapter$onCreateViewHolder$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatReceiveBinding> {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
            super(3, ItemVoiceChatReceiveBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;", 0);
        }

        public final ItemVoiceChatReceiveBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
            Intrinsics.X0O(r2, "p0");
            return ItemVoiceChatReceiveBinding.inflate(r2, r3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ItemVoiceChatReceiveBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
            return invoke(r1, r2, r3.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ChatVoiceAssistantAdapter$onCreateViewHolder$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemVoiceChatReceiveBinding> {
        public static final AnonymousClass2 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass2();
        }

        public AnonymousClass2() {
            super(3, ItemVoiceChatReceiveBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;", 0);
        }

        public final ItemVoiceChatReceiveBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
            Intrinsics.X0O(r2, "p0");
            return ItemVoiceChatReceiveBinding.inflate(r2, r3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ItemVoiceChatReceiveBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
            return invoke(r1, r2, r3.booleanValue());
        }
    }

    public ChatVoiceAssistantAdapter() {
        this.dataList = new ArrayList();
    }

    public final void add(@aa1 ChatVoiceAssistantMessage r2) {
        Intrinsics.X0O(r2, MapController.ITEM_LAYER_TAG);
        this.dataList.add(r2);
        notifyItemChanged(this.dataList.size());
    }

    public final void addOrUpdateStream(@aa1 ChatVoiceAssistantMessage r12) {
        Intrinsics.X0O(r12, MapController.ITEM_LAYER_TAG);
        int r0 = CollectionsKt__CollectionsKt.X11iII1O1(this.dataList);
        if (this.dataList.isEmpty() == false) goto L5;
    L9:
        this.dataList.add(r12);
        notifyItemInserted(CollectionsKt__CollectionsKt.X11iII1O1(this.dataList));
        return;
    L5:
        if (((ChatVoiceAssistantMessage) CollectionsKt___CollectionsKt.Xi1XO00(this.dataList)).isEnded() == true) goto L9;
        ChatVoiceAssistantMessage r13 = ChatVoiceAssistantMessage.copy$default(this.dataList.get(r0), 0, r12.getData(), null, null, r12.getEnded(), null, 45, null);
        this.dataList.set(r0, r13);
        notifyItemChanged(r0);
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
    public int getItemViewType(int r2) {
        return this.dataList.get(r2).getShowType().getFlag();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 RecyclerView.ViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        int r0 = r3.getItemViewType();
        if (r0 != ChatShowType.FROM.getFlag()) goto L7;
        ((ChatVoiceFromViewHolder) r3).bind(this.dataList.get(r4));
        return;
    L7:
        if (r0 != ChatShowType.TO.getFlag()) goto L10;
        ((ChatVoiceToViewHolder) r3).bind(this.dataList.get(r4));
        return;
    L10:
        ((ChatVoiceToViewHolder) r3).bind(this.dataList.get(r4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public RecyclerView.ViewHolder onCreateViewHolder(@aa1 ViewGroup r3, int r4) {
        Intrinsics.X0O(r3, "parent");
        if (r4 != ChatShowType.FROM.getFlag()) goto L7;
        ViewBinding r5 = iXXiX1O1.OXO1(this, r3, ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1.INSTANCE);
        Intrinsics.O10IXXX0X(r5, "createViewHolder(...)");
        return new ChatVoiceFromViewHolder(this, (ItemVoiceChatSendBinding) r5);
    L7:
        if (r4 != ChatShowType.TO.getFlag()) goto L10;
        ViewBinding r6 = iXXiX1O1.OXO1(this, r3, AnonymousClass1.INSTANCE);
        Intrinsics.O10IXXX0X(r6, "createViewHolder(...)");
        return new ChatVoiceToViewHolder(this, (ItemVoiceChatReceiveBinding) r6);
    L10:
        ViewBinding r7 = iXXiX1O1.OXO1(this, r3, AnonymousClass2.INSTANCE);
        Intrinsics.O10IXXX0X(r7, "createViewHolder(...)");
        return new ChatVoiceToViewHolder(this, (ItemVoiceChatReceiveBinding) r7);
    }

    public final void setData(@aa1 List<ChatVoiceAssistantMessage> r2) {
        Intrinsics.X0O(r2, "list");
        List<ChatVoiceAssistantMessage> r0 = this.dataList;
        r0.clear();
        r0.addAll(r2);
        notifyDataSetChanged();
    }
}
