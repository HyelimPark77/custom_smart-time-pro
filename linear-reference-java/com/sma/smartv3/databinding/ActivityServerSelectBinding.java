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
public final class ActivityServerSelectBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llAfrican;

    @NonNull
    public final LinearLayout llItemContent;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final ImageButton serverSelectImgButton;

    @NonNull
    public final PFMedium serverSelectTv;

    @NonNull
    public final LinearLayout taiWanServerLl;

    private ActivityServerSelectBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout llAfrican, @NonNull LinearLayout llItemContent, @NonNull LinearLayout rootView, @NonNull ImageButton serverSelectImgButton, @NonNull PFMedium serverSelectTv, @NonNull LinearLayout taiWanServerLl) {
        this.rootView_ = rootView_;
        this.llAfrican = llAfrican;
        this.llItemContent = llItemContent;
        this.rootView = rootView;
        this.serverSelectImgButton = serverSelectImgButton;
        this.serverSelectTv = serverSelectTv;
        this.taiWanServerLl = taiWanServerLl;
    }

    @NonNull
    public static ActivityServerSelectBinding bind(@NonNull View rootView) {
        int r0 = R.id.ll_african;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_african);
        if (r4 == null) goto L15;
        r0 = R.id.llItemContent;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llItemContent);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.server_select_img_button;
        ImageButton r7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.server_select_img_button);
        if (r7 == null) goto L15;
        r0 = R.id.server_select_tv;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.server_select_tv);
        if (r8 == null) goto L15;
        r0 = R.id.taiWanServerLl;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.taiWanServerLl);
        if (r9 == null) goto L15;
        return new ActivityServerSelectBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_server_select, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
