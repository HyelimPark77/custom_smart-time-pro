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
        int r0 = R.id.all_recycler_view;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_recycler_view);
        if (r1 == null) goto L11;
        r0 = R.id.change_data_type;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.change_data_type);
        if (r2 == null) goto L11;
        r0 = R.id.top_recycler_view;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.top_recycler_view);
        if (r3 == null) goto L11;
        return new ActivitySportListModeBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySportListModeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportListModeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_list_mode, parent, false);
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
