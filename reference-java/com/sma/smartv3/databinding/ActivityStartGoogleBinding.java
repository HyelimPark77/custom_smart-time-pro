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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final NestedScrollView f51004rv;

    private ActivityStartGoogleBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout googleRl, @NonNull NestedScrollView rv) {
        this.rootView = rootView;
        this.googleRl = googleRl;
        this.f51004rv = rv;
    }

    @NonNull
    public static ActivityStartGoogleBinding bind(@NonNull View rootView) {
        int i = R.id.googleRl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.googleRl);
        if (relativeLayout != null) {
            i = R.id.f51422rv;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (nestedScrollView != null) {
                return new ActivityStartGoogleBinding((RelativeLayout) rootView, relativeLayout, nestedScrollView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityStartGoogleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityStartGoogleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_start_google, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
