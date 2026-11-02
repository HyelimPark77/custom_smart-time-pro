package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AbhSettingsItemViewBinding implements ViewBinding {

    @NonNull
    public final View bottomLine;

    @NonNull
    public final EditText edtValue;

    @NonNull
    public final ImageView ivEnter;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View topLine;

    @NonNull
    public final PFMedium tvLabel;

    @NonNull
    public final PFMedium tvValue;

    private AbhSettingsItemViewBinding(@NonNull LinearLayout rootView, @NonNull View bottomLine, @NonNull EditText edtValue, @NonNull ImageView ivEnter, @NonNull View topLine, @NonNull PFMedium tvLabel, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.bottomLine = bottomLine;
        this.edtValue = edtValue;
        this.ivEnter = ivEnter;
        this.topLine = topLine;
        this.tvLabel = tvLabel;
        this.tvValue = tvValue;
    }

    @NonNull
    public static AbhSettingsItemViewBinding bind(@NonNull View rootView) {
        int r0 = R.id.bottom_line;
        View r3 = ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (r3 == null) goto L17;
        r0 = R.id.edt_value;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_value);
        if (r4 == null) goto L17;
        r0 = R.id.iv_enter;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_enter);
        if (r5 == null) goto L17;
        r0 = R.id.top_line;
        View r6 = ViewBindings.findChildViewById(rootView, R.id.top_line);
        if (r6 == null) goto L17;
        r0 = R.id.tv_label;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_label);
        if (r7 == null) goto L17;
        r0 = R.id.tv_value;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r8 == null) goto L17;
        return new AbhSettingsItemViewBinding((LinearLayout) rootView, r3, r4, r5, r6, r7, r8);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AbhSettingsItemViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AbhSettingsItemViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.abh_settings_item_view, parent, false);
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
