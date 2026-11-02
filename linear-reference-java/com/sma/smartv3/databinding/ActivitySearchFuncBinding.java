package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySearchFuncBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView rvEmpty;

    @NonNull
    public final LinearLayout searchFuncLl;

    @NonNull
    public final EditText searchView;

    private ActivitySearchFuncBinding(@NonNull RelativeLayout rootView, @NonNull ADPAdContainerView adpAdContainerView, @NonNull ADPCAdContainerView adpcAdContainerView, @NonNull RecyclerView rv, @NonNull TextView rvEmpty, @NonNull LinearLayout searchFuncLl, @NonNull EditText searchView) {
        this.rootView = rootView;
        this.adpAdContainerView = adpAdContainerView;
        this.adpcAdContainerView = adpcAdContainerView;
        this.rv = rv;
        this.rvEmpty = rvEmpty;
        this.searchFuncLl = searchFuncLl;
        this.searchView = searchView;
    }

    @NonNull
    public static ActivitySearchFuncBinding bind(@NonNull View rootView) {
        int r0 = R.id.adpAdContainerView;
        ADPAdContainerView r4 = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (r4 == null) goto L17;
        r0 = R.id.adpcAdContainerView;
        ADPCAdContainerView r5 = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
        if (r5 == null) goto L17;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L17;
        r0 = R.id.rv_empty;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.rv_empty);
        if (r7 == null) goto L17;
        r0 = R.id.search_func_ll;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
        if (r8 == null) goto L17;
        r0 = R.id.search_view;
        EditText r9 = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_view);
        if (r9 == null) goto L17;
        return new ActivitySearchFuncBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySearchFuncBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySearchFuncBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_search_func, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
