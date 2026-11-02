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
        int r0 = R.id.find_watch_img_button;
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.find_watch_img_button);
        if (r1 == null) goto L9;
        r0 = R.id.tv_tip;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r2 == null) goto L9;
        return new ActivityFindWatchBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityFindWatchBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityFindWatchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_find_watch, parent, false);
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
