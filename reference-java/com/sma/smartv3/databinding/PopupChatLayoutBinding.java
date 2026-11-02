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
        int i = R.id.popup_clear_chats;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_clear_chats);
        if (linearLayout != null) {
            i = R.id.popup_search_online;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_search_online);
            if (linearLayout2 != null) {
                i = R.id.popup_switch_ai_model;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model);
                if (linearLayout3 != null) {
                    i = R.id.popup_switch_ai_model_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model_view);
                    if (viewFindChildViewById != null) {
                        return new PopupChatLayoutBinding((LinearLayout) rootView, linearLayout, linearLayout2, linearLayout3, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopupChatLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopupChatLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.popup_chat_layout, parent, false);
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
