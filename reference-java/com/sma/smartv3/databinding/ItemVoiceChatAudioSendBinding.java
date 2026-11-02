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
public final class ItemVoiceChatAudioSendBinding implements ViewBinding {

    @NonNull
    public final ImageView btnPlay;

    @NonNull
    public final TextView chatSendTime;

    @NonNull
    public final ImageViewRound ivSendPicture;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSendContent;

    private ItemVoiceChatAudioSendBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnPlay, @NonNull TextView chatSendTime, @NonNull ImageViewRound ivSendPicture, @NonNull TextView tvSendContent) {
        this.rootView = rootView;
        this.btnPlay = btnPlay;
        this.chatSendTime = chatSendTime;
        this.ivSendPicture = ivSendPicture;
        this.tvSendContent = tvSendContent;
    }

    @NonNull
    public static ItemVoiceChatAudioSendBinding bind(@NonNull View rootView) {
        int i = R.id.btn_play;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_play);
        if (imageView != null) {
            i = R.id.chat_send_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_send_time);
            if (textView != null) {
                i = R.id.iv_send_picture;
                ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_send_picture);
                if (imageViewRound != null) {
                    i = R.id.tv_send_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_send_content);
                    if (textView2 != null) {
                        return new ItemVoiceChatAudioSendBinding((LinearLayout) rootView, imageView, textView, imageViewRound, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemVoiceChatAudioSendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemVoiceChatAudioSendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_voice_chat_audio_send, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
