package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemBinauralRightBinding implements ViewBinding {

    @NonNull
    public final ImageView ivPlay;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final LinearLayout translatedPlayLl;

    @NonNull
    public final PFMedium tvOriginal;

    @NonNull
    public final PFMedium tvTranslated;

    private ItemBinauralRightBinding(@NonNull FrameLayout rootView, @NonNull ImageView ivPlay, @NonNull LinearLayout translatedPlayLl, @NonNull PFMedium tvOriginal, @NonNull PFMedium tvTranslated) {
        this.rootView = rootView;
        this.ivPlay = ivPlay;
        this.translatedPlayLl = translatedPlayLl;
        this.tvOriginal = tvOriginal;
        this.tvTranslated = tvTranslated;
    }

    @NonNull
    public static ItemBinauralRightBinding bind(@NonNull View rootView) {
        int i = R.id.iv_play;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_play);
        if (imageView != null) {
            i = R.id.translated_play_ll;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.translated_play_ll);
            if (linearLayout != null) {
                i = R.id.tv_original;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original);
                if (pFMedium != null) {
                    i = R.id.tv_translated;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translated);
                    if (pFMedium2 != null) {
                        return new ItemBinauralRightBinding((FrameLayout) rootView, imageView, linearLayout, pFMedium, pFMedium2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBinauralRightBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBinauralRightBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_binaural_right, parent, false);
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
