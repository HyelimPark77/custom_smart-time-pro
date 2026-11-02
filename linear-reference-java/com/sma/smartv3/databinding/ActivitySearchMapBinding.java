package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySearchMapBinding implements ViewBinding {

    @NonNull
    public final LinearLayout abhSearchMapEt;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final LinearLayout searchFuncLl;

    @NonNull
    public final PFMedium searchTv;

    @NonNull
    public final EditText searchView;

    private ActivitySearchMapBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout abhSearchMapEt, @NonNull LinearLayout root, @NonNull RecyclerView rv, @NonNull LinearLayout searchFuncLl, @NonNull PFMedium searchTv, @NonNull EditText searchView) {
        this.rootView = rootView;
        this.abhSearchMapEt = abhSearchMapEt;
        this.root = root;
        this.rv = rv;
        this.searchFuncLl = searchFuncLl;
        this.searchTv = searchTv;
        this.searchView = searchView;
    }

    @NonNull
    public static ActivitySearchMapBinding bind(@NonNull View rootView) {
        int r0 = R.id.abh_search_map_et;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_search_map_et);
        if (r4 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r6 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r6 == null) goto L15;
        r0 = R.id.search_func_ll;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
        if (r7 == null) goto L15;
        r0 = R.id.search_tv;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.search_tv);
        if (r8 == null) goto L15;
        r0 = R.id.search_view;
        EditText r9 = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_view);
        if (r9 == null) goto L15;
        return new ActivitySearchMapBinding(r3, r4, r3, r6, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySearchMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySearchMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_search_map, parent, false);
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
