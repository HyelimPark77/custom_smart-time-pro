package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMemoryBinding implements ViewBinding {

    @NonNull
    public final PFMedium availableMemoryTv;

    @NonNull
    public final PFMedium memoryAllTv;

    @NonNull
    public final ProgressBar memoryProgress;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium usedMemoryTv;

    private ActivityMemoryBinding(@NonNull LinearLayout rootView, @NonNull PFMedium availableMemoryTv, @NonNull PFMedium memoryAllTv, @NonNull ProgressBar memoryProgress, @NonNull PFMedium usedMemoryTv) {
        this.rootView = rootView;
        this.availableMemoryTv = availableMemoryTv;
        this.memoryAllTv = memoryAllTv;
        this.memoryProgress = memoryProgress;
        this.usedMemoryTv = usedMemoryTv;
    }

    @NonNull
    public static ActivityMemoryBinding bind(@NonNull View rootView) {
        int r0 = R.id.available_memory_tv;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.available_memory_tv);
        if (r4 == null) goto L13;
        r0 = R.id.memory_all_tv;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.memory_all_tv);
        if (r5 == null) goto L13;
        r0 = R.id.memory_progress;
        ProgressBar r6 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.memory_progress);
        if (r6 == null) goto L13;
        r0 = R.id.used_memory_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.used_memory_tv);
        if (r7 == null) goto L13;
        return new ActivityMemoryBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_memory, parent, false);
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
