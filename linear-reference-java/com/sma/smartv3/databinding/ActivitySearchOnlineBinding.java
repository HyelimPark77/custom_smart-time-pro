package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySearchOnlineBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkSearchOnline;

    @NonNull
    public final TintImageView ivNetwork;

    @NonNull
    public final LinearLayout main;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LayoutTitleIvTvIvBinding topLayout;

    @NonNull
    public final PFMedium tvTitle;

    private ActivitySearchOnlineBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkSearchOnline, @NonNull TintImageView ivNetwork, @NonNull LinearLayout main, @NonNull LayoutTitleIvTvIvBinding topLayout, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.checkSearchOnline = checkSearchOnline;
        this.ivNetwork = ivNetwork;
        this.main = main;
        this.topLayout = topLayout;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ActivitySearchOnlineBinding bind(@NonNull View rootView) {
        int r0 = R.id.check_search_online;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_search_online);
        if (r4 == null) goto L13;
        r0 = R.id.iv_network;
        TintImageView r5 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_network);
        if (r5 == null) goto L13;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.top_layout;
        View r1 = ViewBindings.findChildViewById(rootView, R.id.top_layout);
        if (r1 == null) goto L13;
        LayoutTitleIvTvIvBinding r7 = LayoutTitleIvTvIvBinding.bind(r1);
        r0 = R.id.tv_title;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r8 == null) goto L13;
        return new ActivitySearchOnlineBinding(r3, r4, r5, r3, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySearchOnlineBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySearchOnlineBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_search_online, parent, false);
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
