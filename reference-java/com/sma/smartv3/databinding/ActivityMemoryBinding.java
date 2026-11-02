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
        int i = R.id.available_memory_tv;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.available_memory_tv);
        if (pFMedium != null) {
            i = R.id.memory_all_tv;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.memory_all_tv);
            if (pFMedium2 != null) {
                i = R.id.memory_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.memory_progress);
                if (progressBar != null) {
                    i = R.id.used_memory_tv;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.used_memory_tv);
                    if (pFMedium3 != null) {
                        return new ActivityMemoryBinding((LinearLayout) rootView, pFMedium, pFMedium2, progressBar, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_memory, parent, false);
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
