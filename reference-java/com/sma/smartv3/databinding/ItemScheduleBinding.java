package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemScheduleBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvTime;

    @NonNull
    public final PFMedium tvTitle;

    private ItemScheduleBinding(@NonNull RelativeLayout rootView, @NonNull PFMedium tvTime, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.tvTime = tvTime;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemScheduleBinding bind(@NonNull View rootView) {
        int i = R.id.tv_time;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (pFMedium != null) {
            i = R.id.tv_title;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
            if (pFMedium2 != null) {
                return new ItemScheduleBinding((RelativeLayout) rootView, pFMedium, pFMedium2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemScheduleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemScheduleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_schedule, parent, false);
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
