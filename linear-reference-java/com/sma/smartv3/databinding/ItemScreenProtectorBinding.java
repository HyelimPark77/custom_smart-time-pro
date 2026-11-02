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

    @NonNull
    public final ImageViewRound iv;

    @NonNull
    private final LinearLayout rootView;

    private ItemScreenProtectorBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemLl, @NonNull ImageViewRound iv) {
        this.rootView = rootView;
        this.itemLl = itemLl;
        this.iv = iv;
    }

    @NonNull
    public static ItemScreenProtectorBinding bind(@NonNull View rootView) {
        LinearLayout r0 = (LinearLayout) rootView;
        ImageViewRound r2 = (ImageViewRound) ViewBindings.findChildViewById(rootView, R.id.iv);
        if (r2 == null) goto L7;
        return new ItemScreenProtectorBinding(r0, r0, r2);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv)));
    }

    @NonNull
    public static ItemScreenProtectorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemScreenProtectorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_screen_protector, parent, false);
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
