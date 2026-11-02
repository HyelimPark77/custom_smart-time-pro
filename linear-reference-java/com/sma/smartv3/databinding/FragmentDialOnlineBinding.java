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
public final class FragmentDialOnlineBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTipView;

    @NonNull
    public final PFMedium tvView;

    private FragmentDialOnlineBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView recyclerView, @NonNull PFMedium tvTipView, @NonNull PFMedium tvView) {
        this.rootView = rootView;
        this.recyclerView = recyclerView;
        this.tvTipView = tvTipView;
        this.tvView = tvView;
    }

    @NonNull
    public static FragmentDialOnlineBinding bind(@NonNull View rootView) {
        int r0 = R.id.recycler_view;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (r1 == null) goto L11;
        r0 = R.id.tv_tip_view;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip_view);
        if (r2 == null) goto L11;
        r0 = R.id.tv_view;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_view);
        if (r3 == null) goto L11;
        return new FragmentDialOnlineBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentDialOnlineBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentDialOnlineBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_dial_online, parent, false);
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
