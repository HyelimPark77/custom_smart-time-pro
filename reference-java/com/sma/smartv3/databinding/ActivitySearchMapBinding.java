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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50997rv;

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
        this.f50997rv = rv;
        this.searchFuncLl = searchFuncLl;
        this.searchTv = searchTv;
        this.searchView = searchView;
    }

    @NonNull
    public static ActivitySearchMapBinding bind(@NonNull View rootView) {
        int i = R.id.abh_search_map_et;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.abh_search_map_et);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) rootView;
            i = R.id.f51422rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
            if (recyclerView != null) {
                i = R.id.search_func_ll;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
                if (linearLayout3 != null) {
                    i = R.id.search_tv;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.search_tv);
                    if (pFMedium != null) {
                        i = R.id.search_view;
                        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_view);
                        if (editText != null) {
                            return new ActivitySearchMapBinding(linearLayout2, linearLayout, linearLayout2, recyclerView, linearLayout3, pFMedium, editText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySearchMapBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySearchMapBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_search_map, parent, false);
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
