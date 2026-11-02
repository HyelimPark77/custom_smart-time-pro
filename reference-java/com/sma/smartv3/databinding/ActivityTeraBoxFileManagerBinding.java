package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityTeraBoxFileManagerBinding implements ViewBinding {

    @NonNull
    public final PFMedium emptyView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final EditText teraBoxFileEt;

    @NonNull
    public final ImageView teraBoxFileEtClear;

    @NonNull
    public final RecyclerView teraBoxFileRecycler;

    @NonNull
    public final ImageView teraBoxFileSearch;

    @NonNull
    public final SwipeRefreshLayout teraBoxFileSrf;

    @NonNull
    public final LinearLayout teraBoxShareLayout;

    private ActivityTeraBoxFileManagerBinding(@NonNull LinearLayout rootView_, @NonNull PFMedium emptyView, @NonNull LinearLayout rootView, @NonNull EditText teraBoxFileEt, @NonNull ImageView teraBoxFileEtClear, @NonNull RecyclerView teraBoxFileRecycler, @NonNull ImageView teraBoxFileSearch, @NonNull SwipeRefreshLayout teraBoxFileSrf, @NonNull LinearLayout teraBoxShareLayout) {
        this.rootView_ = rootView_;
        this.emptyView = emptyView;
        this.rootView = rootView;
        this.teraBoxFileEt = teraBoxFileEt;
        this.teraBoxFileEtClear = teraBoxFileEtClear;
        this.teraBoxFileRecycler = teraBoxFileRecycler;
        this.teraBoxFileSearch = teraBoxFileSearch;
        this.teraBoxFileSrf = teraBoxFileSrf;
        this.teraBoxShareLayout = teraBoxShareLayout;
    }

    @NonNull
    public static ActivityTeraBoxFileManagerBinding bind(@NonNull View rootView) {
        int i = R.id.empty_view;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (pFMedium != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.tera_box_file_et;
            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.tera_box_file_et);
            if (editText != null) {
                i = R.id.tera_box_file_et_clear;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tera_box_file_et_clear);
                if (imageView != null) {
                    i = R.id.tera_box_file_recycler;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tera_box_file_recycler);
                    if (recyclerView != null) {
                        i = R.id.tera_box_file_search;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tera_box_file_search);
                        if (imageView2 != null) {
                            i = R.id.tera_box_file_srf;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.tera_box_file_srf);
                            if (swipeRefreshLayout != null) {
                                i = R.id.tera_box_share_layout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.tera_box_share_layout);
                                if (linearLayout2 != null) {
                                    return new ActivityTeraBoxFileManagerBinding(linearLayout, pFMedium, linearLayout, editText, imageView, recyclerView, imageView2, swipeRefreshLayout, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTeraBoxFileManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTeraBoxFileManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_tera_box_file_manager, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
