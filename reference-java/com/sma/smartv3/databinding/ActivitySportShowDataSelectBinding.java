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
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportShowDataSelectBinding implements ViewBinding {

    @NonNull
    public final PFMedium itemDesc;

    @NonNull
    public final DINCondBold itemValue;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51001rv;

    private ActivitySportShowDataSelectBinding(@NonNull LinearLayout rootView, @NonNull PFMedium itemDesc, @NonNull DINCondBold itemValue, @NonNull RecyclerView rv) {
        this.rootView = rootView;
        this.itemDesc = itemDesc;
        this.itemValue = itemValue;
        this.f51001rv = rv;
    }

    @NonNull
    public static ActivitySportShowDataSelectBinding bind(@NonNull View rootView) {
        int i = R.id.itemDesc;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.itemDesc);
        if (pFMedium != null) {
            i = R.id.itemValue;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.itemValue);
            if (dINCondBold != null) {
                i = R.id.f51422rv;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                if (recyclerView != null) {
                    return new ActivitySportShowDataSelectBinding((LinearLayout) rootView, pFMedium, dINCondBold, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySportShowDataSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySportShowDataSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sport_show_data_select, parent, false);
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
