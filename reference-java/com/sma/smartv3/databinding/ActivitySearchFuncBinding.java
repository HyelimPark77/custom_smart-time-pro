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
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySearchFuncBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    private final RelativeLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50996rv;

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
        this.f50996rv = rv;
        this.rvEmpty = rvEmpty;
        this.searchFuncLl = searchFuncLl;
        this.searchView = searchView;
    }

    @NonNull
    public static ActivitySearchFuncBinding bind(@NonNull View rootView) {
        int i = R.id.adpAdContainerView;
        ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (aDPAdContainerView != null) {
            i = R.id.adpcAdContainerView;
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    i = R.id.rv_empty;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.rv_empty);
                    if (textView != null) {
                        i = R.id.search_func_ll;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_func_ll);
                        if (linearLayout != null) {
                            i = R.id.search_view;
                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.search_view);
                            if (editText != null) {
                                return new ActivitySearchFuncBinding((RelativeLayout) rootView, aDPAdContainerView, aDPCAdContainerView, recyclerView, textView, linearLayout, editText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySearchFuncBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySearchFuncBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_search_func, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
