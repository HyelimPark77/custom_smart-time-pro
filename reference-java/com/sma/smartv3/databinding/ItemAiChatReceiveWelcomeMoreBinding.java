package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiChatReceiveWelcomeMoreBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView welcomeTv;

    private ItemAiChatReceiveWelcomeMoreBinding(@NonNull TextView rootView, @NonNull TextView welcomeTv) {
        this.rootView = rootView;
        this.welcomeTv = welcomeTv;
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeMoreBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new ItemAiChatReceiveWelcomeMoreBinding(textView, textView);
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeMoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_chat_receive_welcome_more, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
