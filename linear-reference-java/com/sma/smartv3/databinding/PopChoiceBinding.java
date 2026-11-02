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
public final class PopChoiceBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llChoices;

    @NonNull
    private final LinearLayout rootView;

    private PopChoiceBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llChoices) {
        this.rootView = rootView;
        this.llChoices = llChoices;
    }

    @NonNull
    public static PopChoiceBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_choices);
        if (r1 == null) goto L7;
        return new PopChoiceBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ll_choices)));
    }

    @NonNull
    public static PopChoiceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopChoiceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_choice, parent, false);
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
