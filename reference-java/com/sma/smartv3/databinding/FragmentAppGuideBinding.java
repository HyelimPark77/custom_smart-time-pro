package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideBinding implements ViewBinding {

    @NonNull
    public final Button btnSet;

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51111iv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvHighTip;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvTitle;

    private FragmentAppGuideBinding(@NonNull LinearLayout rootView_, @NonNull Button btnSet, @NonNull ImageView iv, @NonNull LinearLayout rootView, @NonNull PFMedium tvHighTip, @NonNull PFMedium tvTip, @NonNull PFMedium tvTitle) {
        this.rootView_ = rootView_;
        this.btnSet = btnSet;
        this.f51111iv = iv;
        this.rootView = rootView;
        this.tvHighTip = tvHighTip;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentAppGuideBinding bind(@NonNull View rootView) {
        int i = R.id.btn_set;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_set);
        if (button != null) {
            i = R.id.f51417iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) rootView;
                i = R.id.tv_high_tip;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_high_tip);
                if (pFMedium != null) {
                    i = R.id.tv_tip;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                    if (pFMedium2 != null) {
                        i = R.id.tv_title;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                        if (pFMedium3 != null) {
                            return new FragmentAppGuideBinding(linearLayout, button, imageView, linearLayout, pFMedium, pFMedium2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAppGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAppGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_app_guide, parent, false);
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
