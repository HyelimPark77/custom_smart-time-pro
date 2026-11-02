package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemTeraBoxMusicFileBinding implements ViewBinding {

    @NonNull
    public final ImageView itemCheckMusic;

    @NonNull
    public final PFMedium itemTeraBoxTip;

    @NonNull
    public final PFMedium itemTeraBoxTitle;

    @NonNull
    private final LinearLayout rootView;

    private ItemTeraBoxMusicFileBinding(@NonNull LinearLayout rootView, @NonNull ImageView itemCheckMusic, @NonNull PFMedium itemTeraBoxTip, @NonNull PFMedium itemTeraBoxTitle) {
        this.rootView = rootView;
        this.itemCheckMusic = itemCheckMusic;
        this.itemTeraBoxTip = itemTeraBoxTip;
        this.itemTeraBoxTitle = itemTeraBoxTitle;
    }

    @NonNull
    public static ItemTeraBoxMusicFileBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_check_music;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_check_music);
        if (r1 == null) goto L11;
        r0 = R.id.item_tera_box_tip;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_tip);
        if (r2 == null) goto L11;
        r0 = R.id.item_tera_box_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_tera_box_title);
        if (r3 == null) goto L11;
        return new ItemTeraBoxMusicFileBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemTeraBoxMusicFileBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemTeraBoxMusicFileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_tera_box_music_file, parent, false);
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
