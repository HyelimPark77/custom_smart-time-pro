package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemThemeBinding implements ViewBinding {

    @NonNull
    public final ImageView isSelectIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RelativeLayout themeRl;

    @NonNull
    public final TextView themeTv;

    private ItemThemeBinding(@NonNull LinearLayout rootView, @NonNull ImageView isSelectIv, @NonNull RelativeLayout themeRl, @NonNull TextView themeTv) {
        this.rootView = rootView;
        this.isSelectIv = isSelectIv;
        this.themeRl = themeRl;
        this.themeTv = themeTv;
    }

    @NonNull
    public static ItemThemeBinding bind(@NonNull View rootView) {
        int r0 = R.id.isSelectIv;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.isSelectIv);
        if (r1 == null) goto L11;
        r0 = R.id.themeRl;
        RelativeLayout r2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.themeRl);
        if (r2 == null) goto L11;
        r0 = R.id.themeTv;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.themeTv);
        if (r3 == null) goto L11;
        return new ItemThemeBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemThemeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemThemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_theme, parent, false);
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
