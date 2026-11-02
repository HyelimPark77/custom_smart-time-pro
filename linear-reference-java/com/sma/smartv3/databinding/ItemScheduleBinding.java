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
        int r0 = R.id.tv_time;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r1 == null) goto L9;
        r0 = R.id.tv_title;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r2 == null) goto L9;
        return new ItemScheduleBinding((RelativeLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemScheduleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemScheduleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_schedule, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
