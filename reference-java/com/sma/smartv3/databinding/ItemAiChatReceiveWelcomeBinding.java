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
public final class ItemAiChatReceiveWelcomeBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    private ItemAiChatReceiveWelcomeBinding(@NonNull TextView rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new ItemAiChatReceiveWelcomeBinding((TextView) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_chat_receive_welcome, parent, false);
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
