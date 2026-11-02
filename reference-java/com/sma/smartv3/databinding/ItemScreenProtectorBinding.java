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
import com.sma.smartv3.view.ImageViewRound;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemScreenProtectorBinding implements ViewBinding {

    @NonNull
    public final LinearLayout itemLl;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageViewRound f51158iv;

    @NonNull
    private final LinearLayout rootView;

    private ItemScreenProtectorBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemLl, @NonNull ImageViewRound iv) {
        this.rootView = rootView;
        this.itemLl = itemLl;
        this.f51158iv = iv;
    }

    @NonNull
    public static ItemScreenProtectorBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        ImageViewRound imageViewRound = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageViewRound != null) {
            return new ItemScreenProtectorBinding(linearLayout, linearLayout, imageViewRound);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51417iv)));
    }

    @NonNull
    public static ItemScreenProtectorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemScreenProtectorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_screen_protector, parent, false);
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
