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
public final class ItemVoiceChatReceiveAudioBinding implements ViewBinding {

    @NonNull
    public final ImageView btnPlay;

    @NonNull
    public final TextView chatReceiveTime;

    @NonNull
    public final ImageViewRound ivReceivePicture;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvReceiveContent;

    @NonNull
    public final TextView tvReceiveNick;

    private ItemVoiceChatReceiveAudioBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnPlay, @NonNull TextView chatReceiveTime, @NonNull ImageViewRound ivReceivePicture, @NonNull TextView tvReceiveContent, @NonNull TextView tvReceiveNick) {
        this.rootView = rootView;
        this.btnPlay = btnPlay;
        this.chatReceiveTime = chatReceiveTime;
        this.ivReceivePicture = ivReceivePicture;
        this.tvReceiveContent = tvReceiveContent;
        this.tvReceiveNick = tvReceiveNick;
    }

    @NonNull
    public static ItemVoiceChatReceiveAudioBinding bind(@NonNull View rootView) {
        int i = R.id.btn_play;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_play);
        if (imageView != null) {
            i = R.id.chat_receive_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.chat_receive_time);
            if (textView != null) {
                i = R.id.iv_receive_picture;
                ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv_receive_picture);
                if (imageViewRound != null) {
                    i = R.id.tv_receive_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_receive_content);
                    if (textView2 != null) {
                        i = R.id.tv_receive_nick;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_receive_nick);
                        if (textView3 != null) {
                            return new ItemVoiceChatReceiveAudioBinding((LinearLayout) rootView, imageView, textView, imageViewRound, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemVoiceChatReceiveAudioBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemVoiceChatReceiveAudioBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_voice_chat_receive_audio, parent, false);
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
