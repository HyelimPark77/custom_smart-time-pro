package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutOnlineWatchfaceCategoryHeadBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium watchfaceMoreTv;

    private LayoutOnlineWatchfaceCategoryHeadBinding(@NonNull LinearLayout rootView, @NonNull PFMedium tvName, @NonNull PFMedium watchfaceMoreTv) {
        this.rootView = rootView;
        this.tvName = tvName;
        this.watchfaceMoreTv = watchfaceMoreTv;
    }

    @NonNull
    public static LayoutOnlineWatchfaceCategoryHeadBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv_name;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r1 == null) goto L9;
        r0 = R.id.watchface_more_tv;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.watchface_more_tv);
        if (r2 == null) goto L9;
        return new LayoutOnlineWatchfaceCategoryHeadBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutOnlineWatchfaceCategoryHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutOnlineWatchfaceCategoryHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_online_watchface_category_head, parent, false);
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
