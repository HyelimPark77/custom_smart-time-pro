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
        int i = R.id.empty_view;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (pFMedium != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
            if (recyclerView != null) {
                return new FragmentOnlineWatchface2Binding(linearLayout, pFMedium, linearLayout, recyclerView);
            }
            i = R.id.recycler_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnlineWatchface2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentOnlineWatchface2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_online_watchface_2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
