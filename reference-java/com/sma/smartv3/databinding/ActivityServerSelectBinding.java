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
        int i = R.id.ll_african;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_african);
        if (linearLayout != null) {
            i = R.id.llItemContent;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llItemContent);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) rootView;
                i = R.id.server_select_img_button;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.server_select_img_button);
                if (imageButton != null) {
                    i = R.id.server_select_tv;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.server_select_tv);
                    if (pFMedium != null) {
                        i = R.id.taiWanServerLl;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.taiWanServerLl);
                        if (linearLayout4 != null) {
                            return new ActivityServerSelectBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, imageButton, pFMedium, linearLayout4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityServerSelectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityServerSelectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_server_select, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
