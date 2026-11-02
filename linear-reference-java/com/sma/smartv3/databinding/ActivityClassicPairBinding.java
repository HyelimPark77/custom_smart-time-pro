package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityClassicPairBinding implements ViewBinding {

    @NonNull
    public final FrameLayout content;

    @NonNull
    private final LinearLayout rootView;

    private ActivityClassicPairBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout content) {
        this.rootView = rootView;
        this.content = content;
    }

    @NonNull
    public static ActivityClassicPairBinding bind(@NonNull View rootView) {
        FrameLayout r1 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.content);
        if (r1 == null) goto L7;
        return new ActivityClassicPairBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.content)));
    }

    @NonNull
    public static ActivityClassicPairBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityClassicPairBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_classic_pair, parent, false);
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
