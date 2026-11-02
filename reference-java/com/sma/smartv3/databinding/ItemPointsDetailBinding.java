package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPointsDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout itemPointsDetailLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvDate;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvPointsChange;

    private ItemPointsDetailBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemPointsDetailLayout, @NonNull PFMedium tvDate, @NonNull PFMedium tvName, @NonNull PFMedium tvPointsChange) {
        this.rootView = rootView;
        this.itemPointsDetailLayout = itemPointsDetailLayout;
        this.tvDate = tvDate;
        this.tvName = tvName;
        this.tvPointsChange = tvPointsChange;
    }

    @NonNull
    public static ItemPointsDetailBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.tv_date;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_date);
        if (pFMedium != null) {
            i = R.id.tv_name;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
            if (pFMedium2 != null) {
                i = R.id.tv_points_change;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_points_change);
                if (pFMedium3 != null) {
                    return new ItemPointsDetailBinding(linearLayout, linearLayout, pFMedium, pFMedium2, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPointsDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemPointsDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_points_detail, parent, false);
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
