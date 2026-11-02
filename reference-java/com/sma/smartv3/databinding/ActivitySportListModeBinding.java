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
public final class ActivitySportListModeBinding implements ViewBinding {

    @NonNull
    public final RecyclerView allRecyclerView;

    @NonNull
    public final PFMedium changeDataType;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView topRecyclerView;

    private ActivitySportListModeBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView allRecyclerView, @NonNull PFMedium changeDataType, @NonNull RecyclerView topRecyclerView) {
        this.rootView = rootView;
        this.allRecyclerView = allRecyclerView;
        this.changeDataType = changeDataType;
        this.topRecyclerView = topRecyclerView;
    }

    @NonNull
    public static ActivitySportListModeBinding bind(@NonNull View rootView) {
        int i = R.id.all_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_recycler_view);
        if (recyclerView != null) {
            i = R.id.change_data_type;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.change_data_type);
            if (pFMedium != null) {
                i = R.id.top_recycler_view;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.top_recycler_view);
                if (recyclerView2 != null) {
                    return new ActivitySportListModeBinding((LinearLayout) rootView, recyclerView, pFMedium, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportListModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportListModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_list_mode, parent, false);
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
