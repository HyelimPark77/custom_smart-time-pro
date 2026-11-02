package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityStartGoogleBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout googleRl;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final NestedScrollView rv;

    private ActivityStartGoogleBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout googleRl, @NonNull NestedScrollView rv) {
        this.rootView = rootView;
        this.googleRl = googleRl;
        this.rv = rv;
    }

    @NonNull
    public static ActivityStartGoogleBinding bind(@NonNull View rootView) {
        int r0 = R.id.googleRl;
        RelativeLayout r1 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.googleRl);
        if (r1 == null) goto L9;
        r0 = R.id.rv;
        NestedScrollView r2 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L9;
        return new ActivityStartGoogleBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityStartGoogleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityStartGoogleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_start_google, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
