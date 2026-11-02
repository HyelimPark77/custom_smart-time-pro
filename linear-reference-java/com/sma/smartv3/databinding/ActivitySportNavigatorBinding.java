package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportNavigatorBinding implements ViewBinding {

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final SwipeRefreshLayout srf;

    private ActivitySportNavigatorBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout root, @NonNull RecyclerView rv, @NonNull SwipeRefreshLayout srf) {
        this.rootView = rootView;
        this.root = root;
        this.rv = rv;
        this.srf = srf;
    }

    @NonNull
    public static ActivitySportNavigatorBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        int r1 = R.id.rv;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r2 == null) goto L9;
        r1 = R.id.srf;
        SwipeRefreshLayout r3 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r3 == null) goto L9;
        return new ActivitySportNavigatorBinding(r0, r0, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivitySportNavigatorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportNavigatorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_navigator, parent, false);
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
