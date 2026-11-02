package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemRecordBinding implements ViewBinding {

    @NonNull
    public final ImageView btnPlay;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvDate;

    @NonNull
    public final PFMedium tvName;

    @NonNull
    public final PFMedium tvTime;

    private ItemRecordBinding(@NonNull RelativeLayout rootView, @NonNull ImageView btnPlay, @NonNull PFMedium tvDate, @NonNull PFMedium tvName, @NonNull PFMedium tvTime) {
        this.rootView = rootView;
        this.btnPlay = btnPlay;
        this.tvDate = tvDate;
        this.tvName = tvName;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ItemRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_play;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_play);
        if (r4 == null) goto L13;
        r0 = R.id.tv_date;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_date);
        if (r5 == null) goto L13;
        r0 = R.id.tv_name;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r6 == null) goto L13;
        r0 = R.id.tv_time;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r7 == null) goto L13;
        return new ItemRecordBinding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_record, parent, false);
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
