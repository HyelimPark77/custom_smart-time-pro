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
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.tv_date;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_date);
        if (r3 == null) goto L11;
        r0 = R.id.tv_name;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r4 == null) goto L11;
        r0 = R.id.tv_time;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r5 == null) goto L11;
        return new ItemSleepPiecemealDetailBinding(r1, r1, r3, r4, r5);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemSleepPiecemealDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemSleepPiecemealDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_sleep_piecemeal_detail, parent, false);
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
