package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemBinauralRecordBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvOriginal;

    @NonNull
    public final PFMedium tvTime;

    @NonNull
    public final PFMedium tvTranslated;

    private ItemBinauralRecordBinding(@NonNull FrameLayout rootView, @NonNull PFMedium tvOriginal, @NonNull PFMedium tvTime, @NonNull PFMedium tvTranslated) {
        this.rootView = rootView;
        this.tvOriginal = tvOriginal;
        this.tvTime = tvTime;
        this.tvTranslated = tvTranslated;
    }

    @NonNull
    public static ItemBinauralRecordBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv_original;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original);
        if (r1 == null) goto L11;
        r0 = R.id.tv_time;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r2 == null) goto L11;
        r0 = R.id.tv_translated;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translated);
        if (r3 == null) goto L11;
        return new ItemBinauralRecordBinding((FrameLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemBinauralRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemBinauralRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_binaural_record, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
