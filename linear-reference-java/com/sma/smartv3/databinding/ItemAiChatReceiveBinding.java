package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiChatReceiveBinding implements ViewBinding {

    @NonNull
    public final TextView chatReceiveTime;

    @NonNull
    public final ImageView imgCopyContent;

    @NonNull
    public final ImageViewRound ivReceivePicture;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvReceiveContent;

    @NonNull
    public final TextView tvReceiveNick;

    private ItemAiChatReceiveBinding(@NonNull LinearLayout rootView, @NonNull TextView chatReceiveTime, @NonNull ImageView imgCopyContent, @NonNull ImageViewRound ivReceivePicture, @NonNull TextView tvReceiveContent, @NonNull TextView tvReceiveNick) {
        this.rootView = rootView;
        this.chatReceiveTime = chatReceiveTime;
        this.imgCopyContent = imgCopyContent;
        this.ivReceivePicture = ivReceivePicture;
        this.tvReceiveContent = tvReceiveContent;
        this.tvReceiveNick = tvReceiveNick;
    }

    @NonNull
    public static ItemAiChatReceiveBinding bind(@NonNull View rootView) {
        int r0 = R.id.chat_receive_time;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_receive_time);
        if (r4 == null) goto L15;
        r0 = R.id.img_copy_content;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_copy_content);
        if (r5 == null) goto L15;
        r0 = R.id.iv_receive_picture;
        ImageViewRound r6 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_receive_picture);
        if (r6 == null) goto L15;
        r0 = R.id.tv_receive_content;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_receive_content);
        if (r7 == null) goto L15;
        r0 = R.id.tv_receive_nick;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_receive_nick);
        if (r8 == null) goto L15;
        return new ItemAiChatReceiveBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAiChatReceiveBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiChatReceiveBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_chat_receive, parent, false);
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
