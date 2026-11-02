package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemMusicV2Binding implements ViewBinding {

    @NonNull
    public final ImageButton btnDelete;

    @NonNull
    private final LinearLayout rootView;

    /* JADX INFO: renamed from: tv */
    @NonNull
    public final PFMedium f51154tv;

    private ItemMusicV2Binding(@NonNull LinearLayout rootView, @NonNull ImageButton btnDelete, @NonNull PFMedium tv) {
        this.rootView = rootView;
        this.btnDelete = btnDelete;
        this.f51154tv = tv;
    }

    @NonNull
    public static ItemMusicV2Binding bind(@NonNull View rootView) {
        int i = R.id.btn_delete;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_delete);
        if (imageButton != null) {
            i = R.id.f51423tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.f51423tv);
            if (pFMedium != null) {
                return new ItemMusicV2Binding((LinearLayout) rootView, imageButton, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMusicV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemMusicV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_music_v2, parent, false);
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
