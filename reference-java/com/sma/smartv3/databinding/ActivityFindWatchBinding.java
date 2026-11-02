package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityFindWatchBinding implements ViewBinding {

    @NonNull
    public final ImageView findWatchImgButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTip;

    private ActivityFindWatchBinding(@NonNull LinearLayout rootView, @NonNull ImageView findWatchImgButton, @NonNull TextView tvTip) {
        this.rootView = rootView;
        this.findWatchImgButton = findWatchImgButton;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityFindWatchBinding bind(@NonNull View rootView) {
        int i = R.id.find_watch_img_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.find_watch_img_button);
        if (imageView != null) {
            i = R.id.tv_tip;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
            if (textView != null) {
                return new ActivityFindWatchBinding((LinearLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFindWatchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityFindWatchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_find_watch, parent, false);
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
