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
public final class SportItemStartBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium sportItemStartListMore;

    @NonNull
    public final RecyclerView startRecyclerview;

    private SportItemStartBinding(@NonNull LinearLayout rootView, @NonNull PFMedium sportItemStartListMore, @NonNull RecyclerView startRecyclerview) {
        this.rootView = rootView;
        this.sportItemStartListMore = sportItemStartListMore;
        this.startRecyclerview = startRecyclerview;
    }

    @NonNull
    public static SportItemStartBinding bind(@NonNull View rootView) {
        int i = R.id.sport_item_start_list_more;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_item_start_list_more);
        if (pFMedium != null) {
            i = R.id.start_recyclerview;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.start_recyclerview);
            if (recyclerView != null) {
                return new SportItemStartBinding((LinearLayout) rootView, pFMedium, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SportItemStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportItemStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_item_start, parent, false);
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
