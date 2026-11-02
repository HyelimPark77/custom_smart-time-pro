package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopProgressBinding implements ViewBinding {

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final LinearLayout rootView;

    private PopProgressBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar progressBar) {
        this.rootView = rootView;
        this.progressBar = progressBar;
    }

    @NonNull
    public static PopProgressBinding bind(@NonNull View rootView) {
        ProgressBar r1 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
        if (r1 == null) goto L7;
        return new PopProgressBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.progress_bar)));
    }

    @NonNull
    public static PopProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_progress, parent, false);
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
