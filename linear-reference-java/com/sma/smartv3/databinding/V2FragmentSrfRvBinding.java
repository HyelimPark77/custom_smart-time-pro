package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class V2FragmentSrfRvBinding implements ViewBinding {

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    private final FrameLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final SwipeRefreshLayout srf;

    private V2FragmentSrfRvBinding(@NonNull FrameLayout rootView_, @NonNull FrameLayout rootView, @NonNull RecyclerView rv, @NonNull SwipeRefreshLayout srf) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.rv = rv;
        this.srf = srf;
    }

    @NonNull
    public static V2FragmentSrfRvBinding bind(@NonNull View rootView) {
        FrameLayout r0 = (FrameLayout) rootView;
        int r1 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L9;
        r1 = R.id.srf;
        SwipeRefreshLayout r3 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r3 == null) goto L9;
        return new V2FragmentSrfRvBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2FragmentSrfRvBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2FragmentSrfRvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_fragment_srf_rv, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
