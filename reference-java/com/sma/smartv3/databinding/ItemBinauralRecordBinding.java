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
        int i = R.id.tv_original;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original);
        if (pFMedium != null) {
            i = R.id.tv_time;
            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
            if (pFMedium2 != null) {
                i = R.id.tv_translated;
                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translated);
                if (pFMedium3 != null) {
                    return new ItemBinauralRecordBinding((FrameLayout) rootView, pFMedium, pFMedium2, pFMedium3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBinauralRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBinauralRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_binaural_record, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
