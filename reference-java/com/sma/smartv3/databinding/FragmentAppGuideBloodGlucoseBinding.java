package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentAppGuideBloodGlucoseBinding implements ViewBinding {

    /* JADX INFO: renamed from: iv */
    @NonNull
    public final ImageView f51112iv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvNo;

    @NonNull
    public final PFMedium tvTitle;

    @NonNull
    public final PFMedium tvYes;

    private FragmentAppGuideBloodGlucoseBinding(@NonNull LinearLayout rootView_, @NonNull ImageView iv, @NonNull LinearLayout rootView, @NonNull PFMedium tvNo, @NonNull PFMedium tvTitle, @NonNull PFMedium tvYes) {
        this.rootView_ = rootView_;
        this.f51112iv = iv;
        this.rootView = rootView;
        this.tvNo = tvNo;
        this.tvTitle = tvTitle;
        this.tvYes = tvYes;
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding bind(@NonNull View rootView) {
        int i = R.id.f51417iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.f51417iv);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.tv_no;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no);
            if (pFMedium != null) {
                i = R.id.tv_title;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (pFMedium2 != null) {
                    i = R.id.tv_yes;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_yes);
                    if (pFMedium3 != null) {
                        return new FragmentAppGuideBloodGlucoseBinding(linearLayout, imageView, linearLayout, pFMedium, pFMedium2, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentAppGuideBloodGlucoseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_app_guide_blood_glucose, parent, false);
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
