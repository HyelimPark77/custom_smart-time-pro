package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiKeySetBinding implements ViewBinding {

    @NonNull
    public final EditText etContent;

    @NonNull
    public final LinearLayout genPanel;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityAiKeySetBinding(@NonNull LinearLayout rootView_, @NonNull EditText etContent, @NonNull LinearLayout genPanel, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.etContent = etContent;
        this.genPanel = genPanel;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityAiKeySetBinding bind(@NonNull View rootView) {
        int i = R.id.et_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (editText != null) {
            i = R.id.gen_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.gen_panel);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) rootView;
                return new ActivityAiKeySetBinding(linearLayout2, editText, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAiKeySetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAiKeySetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_ai_key_set, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
