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
        int r0 = R.id.et_content;
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (r1 == null) goto L9;
        r0 = R.id.gen_panel;
        LinearLayout r2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.gen_panel);
        if (r2 == null) goto L9;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityAiKeySetBinding(r3, r1, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAiKeySetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiKeySetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_key_set, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
