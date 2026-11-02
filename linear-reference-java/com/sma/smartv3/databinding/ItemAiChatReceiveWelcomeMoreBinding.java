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
        if (rootView == null) goto L6;
        TextView r1 = (TextView) rootView;
        return new ItemAiChatReceiveWelcomeMoreBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeMoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiChatReceiveWelcomeMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_chat_receive_welcome_more, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
