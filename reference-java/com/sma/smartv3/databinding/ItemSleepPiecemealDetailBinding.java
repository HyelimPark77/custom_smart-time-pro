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
public final class ItemSleepPiecemealDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout itemDetailLayout;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvDate;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvTime;

    private ItemSleepPiecemealDetailBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemDetailLayout, @NonNull PFMedium tvDate, @NonNull PFMedium tvName, @NonNull PFMedium tvTime) {
        this.rootView = rootView;
        this.itemDetailLayout = itemDetailLayout;
        this.tvDate = tvDate;
        this.tvName = tvName;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ItemSleepPiecemealDetailBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.tv_date;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_date);
        if (pFMedium != null) {
            i = R.id.tv_name;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
            if (pFMedium2 != null) {
                i = R.id.tv_time;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                if (pFMedium3 != null) {
                    return new ItemSleepPiecemealDetailBinding(linearLayout, linearLayout, pFMedium, pFMedium2, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSleepPiecemealDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSleepPiecemealDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sleep_piecemeal_detail, parent, false);
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
