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
public final class ItemBinauralLeftBinding implements ViewBinding {

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

    private ItemBinauralLeftBinding(@NonNull FrameLayout rootView, @NonNull ImageView ivPlay, @NonNull LinearLayout translatedPlayLl, @NonNull PFMedium tvOriginal, @NonNull PFMedium tvTranslated) {
        this.rootView = rootView;
        this.ivPlay = ivPlay;
        this.translatedPlayLl = translatedPlayLl;
        this.tvOriginal = tvOriginal;
        this.tvTranslated = tvTranslated;
    }

    @NonNull
    public static ItemBinauralLeftBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_play;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_play);
        if (r4 == null) goto L13;
        r0 = R.id.translated_play_ll;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.translated_play_ll);
        if (r5 == null) goto L13;
        r0 = R.id.tv_original;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_original);
        if (r6 == null) goto L13;
        r0 = R.id.tv_translated;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_translated);
        if (r7 == null) goto L13;
        return new ItemBinauralLeftBinding((FrameLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemBinauralLeftBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemBinauralLeftBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_binaural_left, parent, false);
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
