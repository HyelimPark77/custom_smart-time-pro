package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentOnlineWatchface2Binding implements ViewBinding {

    @NonNull
    public final PFMedium emptyView;

    @NonNull
    public final LinearLayout llRootView;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    private FragmentOnlineWatchface2Binding(@NonNull LinearLayout rootView, @NonNull PFMedium emptyView, @NonNull LinearLayout llRootView, @NonNull RecyclerView recyclerView) {
        this.rootView = rootView;
        this.emptyView = emptyView;
        this.llRootView = llRootView;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static FragmentOnlineWatchface2Binding bind(@NonNull View rootView) {
        int r0 = R.id.empty_view;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (r1 == null) goto L10;
        LinearLayout r2 = (LinearLayout) rootView;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (r3 != null) goto L7;
        r0 = R.id.recycler_view;
        goto L10
    L7:
        return new FragmentOnlineWatchface2Binding(r2, r1, r2, r3);
    L10:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentOnlineWatchface2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentOnlineWatchface2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_online_watchface_2, parent, false);
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
