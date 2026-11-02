package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopupChatLayoutBinding implements ViewBinding {

    @NonNull
    public final LinearLayout popupClearChats;

    @NonNull
    public final LinearLayout popupSearchOnline;

    @NonNull
    public final LinearLayout popupSwitchAiModel;

    @NonNull
    public final View popupSwitchAiModelView;

    @NonNull
    private final LinearLayout rootView;

    private PopupChatLayoutBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout popupClearChats, @NonNull LinearLayout popupSearchOnline, @NonNull LinearLayout popupSwitchAiModel, @NonNull View popupSwitchAiModelView) {
        this.rootView = rootView;
        this.popupClearChats = popupClearChats;
        this.popupSearchOnline = popupSearchOnline;
        this.popupSwitchAiModel = popupSwitchAiModel;
        this.popupSwitchAiModelView = popupSwitchAiModelView;
    }

    @NonNull
    public static PopupChatLayoutBinding bind(@NonNull View rootView) {
        int r0 = R.id.popup_clear_chats;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_clear_chats);
        if (r4 == null) goto L13;
        r0 = R.id.popup_search_online;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_search_online);
        if (r5 == null) goto L13;
        r0 = R.id.popup_switch_ai_model;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model);
        if (r6 == null) goto L13;
        r0 = R.id.popup_switch_ai_model_view;
        View r7 = ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model_view);
        if (r7 == null) goto L13;
        return new PopupChatLayoutBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopupChatLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopupChatLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.popup_chat_layout, parent, false);
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
