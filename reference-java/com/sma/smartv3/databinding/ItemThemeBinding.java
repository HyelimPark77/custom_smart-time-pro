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
        int i = R.id.isSelectIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.isSelectIv);
        if (imageView != null) {
            i = R.id.themeRl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.themeRl);
            if (relativeLayout != null) {
                i = R.id.themeTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.themeTv);
                if (textView != null) {
                    return new ItemThemeBinding((LinearLayout) rootView, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemThemeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemThemeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_theme, parent, false);
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
