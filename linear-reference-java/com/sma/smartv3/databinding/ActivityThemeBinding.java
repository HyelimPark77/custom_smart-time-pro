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
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityThemeBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    private ActivityThemeBinding(@NonNull LinearLayout rootView, @NonNull ADPAdContainerView adpAdContainerView, @NonNull ADPCAdContainerView adpcAdContainerView, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.adpAdContainerView = adpAdContainerView;
        this.adpcAdContainerView = adpcAdContainerView;
        this.rv = rv;
    }

    @NonNull
    public static ActivityThemeBinding bind(@NonNull View rootView) {
        int r0 = R.id.adpAdContainerView;
        ADPAdContainerView r1 = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (r1 == null) goto L11;
        r0 = R.id.adpcAdContainerView;
        ADPCAdContainerView r2 = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
        if (r2 == null) goto L11;
        r0 = R.id.rv;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r3 == null) goto L11;
        return new ActivityThemeBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityThemeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityThemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_theme, parent, false);
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
