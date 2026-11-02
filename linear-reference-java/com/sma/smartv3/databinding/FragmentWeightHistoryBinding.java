package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentWeightHistoryBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final SwipeRefreshLayout srf;

    private FragmentWeightHistoryBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull RecyclerView rv, @NonNull NestedScrollView scrollView, @NonNull SwipeRefreshLayout srf) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.rv = rv;
        this.scrollView = scrollView;
        this.srf = srf;
    }

    @NonNull
    public static FragmentWeightHistoryBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.rv;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r3 == null) goto L11;
        r0 = R.id.scrollView;
        NestedScrollView r4 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r4 == null) goto L11;
        r0 = R.id.srf;
        SwipeRefreshLayout r5 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r5 == null) goto L11;
        return new FragmentWeightHistoryBinding(r1, r1, r3, r4, r5);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentWeightHistoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentWeightHistoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_weight_history, parent, false);
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
