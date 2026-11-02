package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityLanguageSetBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityLanguageSetBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityLanguageSetBinding bind(@NonNull View rootView) {
        if (rootView == null) goto L6;
        LinearLayout r1 = (LinearLayout) rootView;
        return new ActivityLanguageSetBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityLanguageSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityLanguageSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_language_set, parent, false);
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
