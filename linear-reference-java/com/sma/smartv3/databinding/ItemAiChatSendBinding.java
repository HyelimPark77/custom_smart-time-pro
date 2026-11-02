package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiChatSendBinding implements ViewBinding {

    @NonNull
    public final TextView chatSendTime;

    @NonNull
    public final ImageViewRound ivSendPicture;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSendContent;

    private ItemAiChatSendBinding(@NonNull LinearLayout rootView, @NonNull TextView chatSendTime, @NonNull ImageViewRound ivSendPicture, @NonNull TextView tvSendContent) {
        this.rootView = rootView;
        this.chatSendTime = chatSendTime;
        this.ivSendPicture = ivSendPicture;
        this.tvSendContent = tvSendContent;
    }

    @NonNull
    public static ItemAiChatSendBinding bind(@NonNull View rootView) {
        int r0 = R.id.chat_send_time;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_send_time);
        if (r1 == null) goto L11;
        r0 = R.id.iv_send_picture;
        ImageViewRound r2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_send_picture);
        if (r2 == null) goto L11;
        r0 = R.id.tv_send_content;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_send_content);
        if (r3 == null) goto L11;
        return new ItemAiChatSendBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAiChatSendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiChatSendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_chat_send, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
