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
public final class SportTypeListItemBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTitle;

    private SportTypeListItemBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView recyclerView, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.recyclerView = recyclerView;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static SportTypeListItemBinding bind(@NonNull View rootView) {
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recycler_view);
        if (recyclerView != null) {
            i = R.id.tv_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (pFMedium != null) {
                return new SportTypeListItemBinding((LinearLayout) rootView, recyclerView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportTypeListItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportTypeListItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_type_list_item, parent, false);
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
